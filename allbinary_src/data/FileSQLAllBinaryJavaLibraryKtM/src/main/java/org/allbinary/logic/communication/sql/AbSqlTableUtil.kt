
        /*
                * 
                *  AllBinary Open License Version 1
                *  Copyright (c) 2011 AllBinary
                *  
                *  By agreeing to this license you and any business entity you represent are
                *  legally bound to the AllBinary Open License Version 1 legal agreement.
                *  
                *  You may obtain the AllBinary Open License Version 1 legal agreement from
                *  AllBinary or the root directory of AllBinary's AllBinary Platform repository.
                *  
                *  Created By: Travis Berthelot  
        */
        
        /* Generated Code Do Not Modify */
        package org.allbinary.logic.communication.sql



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import java.sql.ResultSet
import java.sql.ResultSetMetaData
import java.util.Calendar
import org.allbinary.business.installer.Portion
import org.allbinary.logic.io.AbFileOutputStream
import org.allbinary.logic.io.BufferedLineReader
import org.allbinary.logic.io.StreamUtil
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.FileUtil
import org.allbinary.logic.io.file.directory.Directory
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.globals.PATH_GLOBALS
import java.io.OutputStream
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings
import org.allbinary.logic.string.StringUtil

open public class AbSqlTableUtil
            : Object
         {
        

        companion object {


    private val instance: AbSqlTableUtil = AbSqlTableUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AbSqlTableUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var EXTENSION: String = ".adb"

    private val END: String = "')\n"

    private val SAVING_BACKUP_PATH: String = "Saving Backup: Path: "

    private val FILE_LABEL: String = " File: "

    private val METHOD_RESTORE_TABLE: String = "restoreTable()"

    private val METHOD_BACKUP_TABLE: String = "backupTable()"

    private val METHOD_BACKUP_FILE: String = "backupFile()"

    private val METHOD_GET_OUTPUT_STREAM: String = "getOutputStream()"

    private val TABLE_CREATION_SUCCESS: String = "Table Creation Successful: "

    private val DROPPED_SUCCESS: String = " Dropped Successfully"

    private val SAVING: String = "Saving: "

    private val APPENDING: String = "Appending: "

    private val TABLE_LABEL: String = "Table: "

    private val BACKUP_SUCCESS: String = " Backup Success"

    private val ERROR_CREATING: String = "Error Creating: "

    private val TOTAL_LABEL: String = " Total: "

    private val SECTION_LABEL: String = " Section: "

    private val DASH: String = " - "

    private val PORTION_RESTORED: String = " Portion Restored"

    private val specialCharArray: CharArray = charArrayOf('\n','\f','\r')

    private val NEW_LINE: String = "\\n"

    val stringUtil: StringUtil = StringUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    val commonSeps: CommonSeps = CommonSeps.getInstance()!!
            

    val sqlStrings: SqlStrings = SqlStrings.getInstance()!!
            

open fun getOutputStream(backupPath: String, tableName: String)
        //nullable = true from not(false or (false and false)) = true
: OutputStream{

                    var backupPath = backupPath


                    var tableName = tableName

        try {
            
    var fileName: String = tableName +EXTENSION


    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(SAVING +tableName, this, this.METHOD_GET_OUTPUT_STREAM)

                                    }
                                

    var backupFilePath: AbPath = AbPath(backupPath, fileName)


    var backupFile: AbFile = AbFile(backupFilePath)


    
                        if(backupFile!!.exists())
                        
                                    {
                                    backupFile(backupFilePath, backupPath, tableName)
backupFile!!.delete()

                                    }
                                
backupFile!!.createNewFile()

    var outputStream: OutputStream = AbFileOutputStream(backupFile)




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return outputStream
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(
                            "Create File", this, this.METHOD_GET_OUTPUT_STREAM, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun backupFile(path: AbPath, backupPath: String, tableName: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var path = path


                    var backupPath = backupPath


                    var tableName = tableName

        try {
            
    var calendar: Calendar = Calendar.getInstance()!!
            


    var timeLong: Long = calendar!!.getTimeInMillis() as Long


    var time: String = timeLong!!.toString()!!
            


    var stringBuffer: StringMaker = StringMaker()


    var fileName: String = tableName +EXTENSION

stringBuffer!!.append(backupPath)
stringBuffer!!.append(AbPathData.getInstance()!!.SEPARATOR)
stringBuffer!!.append(time)

    var backupAbPath: AbPath = AbPath(stringBuffer!!.toString())


    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(SAVING_BACKUP_PATH)
stringBuffer!!.append(backupAbPath!!.toFileSystemString())
stringBuffer!!.append(FILE_LABEL)
stringBuffer!!.append(fileName)
logUtil!!.put(stringBuffer!!.toString(), this, this.METHOD_BACKUP_FILE)

                                    }
                                
Directory.create(backupAbPath)

    var backupFileBak: AbFile = AbFile(backupAbPath!!.toFileSystemString())

backupFileBak!!.createNewFile()
FileUtil.getInstance()!!.copy(path, backupAbPath)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.EXCEPTION, this, this.METHOD_BACKUP_FILE, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


open fun convertNewLines(value: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var value = value

    var stringBuffer: StringMaker = StringMaker()


    var index: Int = 0


    var lastIndex: Int = 0


        while(index < value!!.length)
        {index= value!!.indexOf(specialCharArray[0]!!, lastIndex)

    
                        if(index !=  -1)
                        
                                    {
                                    
    var nextLine: String = value!!.substring(lastIndex, index -1)!!
            

stringBuffer!!.append(nextLine)
stringBuffer!!.append(NEW_LINE)
lastIndex= index +1

                                    }
                                
                        else {
                            break;

                    

                        }
                            
}


    
                        if(lastIndex < value!!.length)
                        
                                    {
                                    stringBuffer!!.append(value!!.substring(lastIndex, value!!.length))

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun backupTable(abSqlTable: AbSqlTable)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var abSqlTable = abSqlTable

    var tableName: String = abSqlTable!!.getTableName()!!
            


        try {
            
    var count: Int = 0


    var sqlStatement: String = this.sqlStrings!!.SELECT_ALL_FROM +tableName


    var path: String = org!!.allbinary!!.globals!!.URLGLOBALS.getMainPath() +PATH_GLOBALS.getInstance()!!.BACKUP_PATH


    
                        if(!Directory.create(AbPath(path)))
                        
                                    {
                                    
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(ERROR_CREATING +path, this, this.METHOD_BACKUP_TABLE)

                                    }
                                

                                    }
                                

    var rset: ResultSet = abSqlTable!!.executeSQLStatement(sqlStatement)!!
            


    var rsmd: ResultSetMetaData = rset!!.getMetaData()!!
            


    var colNum: Int = rsmd!!.getColumnCount()!!
            


    var QUERY_START: String = StringBuilder().
                            append(this.sqlStrings!!.INSERT_INTO)!!.append(tableName)!!.append(this.sqlStrings!!.VALUES)!!.toString()!!
            


    var stringBuffer: StringMaker = StringMaker()


    var outputStream: OutputStream = this.getOutputStream(path, tableName)!!
            


        while(rset!!.next())
        {stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(QUERY_START)




                        for (i in 1 until colNum)


        {
    var value: String = rset!!.getString(i)!!
            

stringBuffer!!.append(this.convertNewLines(value))
stringBuffer!!.append(this.sqlStrings!!.SINGLE_QUOTE_COMMA_SEP)
}

stringBuffer!!.append(rset!!.getString(colNum))
stringBuffer!!.append(END)

    var sqlStatementLine: String = stringBuffer!!.toString()!!
            


    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(APPENDING +sqlStatementLine, this, this.METHOD_BACKUP_TABLE)

                                    }
                                
outputStream!!.write(sqlStatementLine!!.encodeToByteArray())
}

StreamUtil.getInstance()!!.close(outputStream)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TABLE_LABEL +tableName +BACKUP_SUCCESS
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(
                            "Backup Table Failed\nSQL Statement", this, this.METHOD_BACKUP_TABLE, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TABLE_LABEL +tableName +" Backup Failed"
}

}


open fun restoreTable(abSqlTable: AbSqlTable, portion: Portion)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var abSqlTable = abSqlTable


                    var portion = portion

    var tableName: String = abSqlTable!!.getTableName()!!
            


        try {
            
    var path: String = org!!.allbinary!!.globals!!.URLGLOBALS.getMainPath() +PATH_GLOBALS.getInstance()!!.BACKUP_PATH


    var current: Int = portion!!.getCurrent()!!.toInt()!!
            


    
                        if(current == 0)
                        
                                    {
                                    
    
                        if(Directory.create(AbPath(path)))
                        
                                    {
                                    
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.ERROR_CREATING +path, this, this.METHOD_RESTORE_TABLE)

                                    }
                                

                                    }
                                

                                    }
                                

    var backupFile: AbFile = AbFile(path, tableName +EXTENSION)


    var bufferedLineReader: BufferedLineReader = BufferedLineReader(backupFile)


    var size: Long = bufferedLineReader!!.getSize()!!
            


    var section: Long = size /portion!!.getTotal()!!.toInt() +1


    var start: Long = section *current


    var end: Long = start +section


    
                        if(end > size)
                        
                                    {
                                    end= size

                                    }
                                

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(TOTAL_LABEL)
stringBuffer!!.append(size)
stringBuffer!!.append(SECTION_LABEL)
stringBuffer!!.append(start)
stringBuffer!!.append(DASH)
stringBuffer!!.append(end)

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(stringBuffer!!.toString(), this, this.METHOD_RESTORE_TABLE)

                                    }
                                
bufferedLineReader!!.readUpToLines(start)

    var line: String = this.stringUtil!!.EMPTY_STRING


        while(bufferedLineReader!!.getCurrent() < end && (line= bufferedLineReader!!.readLine()) != 
                                    null
                                )
        {
    
                        if(line!!.length > 1)
                        
                                    {
                                    abSqlTable!!.executeSQLStatement(line)

                                    }
                                
}

stringBuffer!!.append(this.commonSeps!!.SPACE)
stringBuffer!!.append(this.TABLE_LABEL)
stringBuffer!!.append(tableName)
stringBuffer!!.append(PORTION_RESTORED)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(
                            "Restore Table Failed\nSQL Statement", this, this.METHOD_RESTORE_TABLE, e)

                                    }
                                

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(TABLE_LABEL)
stringBuffer!!.append(tableName)
stringBuffer!!.append(
                            " Restoration Failed")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}

}


}
                
            

