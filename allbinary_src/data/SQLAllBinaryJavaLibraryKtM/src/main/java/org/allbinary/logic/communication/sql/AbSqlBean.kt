
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.sql.ResultSet
import java.util.HashMap
import java.util.Set
import org.allbinary.business.init.db.DbConnectionInfo
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker

open public class AbSqlBean : AbSqlRow {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val METHOD_GET_FIELD: String = "getField"

    private val METHOD_IS_SUBSET_OF_ENTRY: String = "isSubsetOfEntry"
public constructor        (databaseConnectionInfoInterface: DbConnectionInfo)                        

                            : super(databaseConnectionInfoInterface){

                    var databaseConnectionInfoInterface = databaseConnectionInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
}


open fun getField(key: String, value: String, requestedField: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var key = key


                    var value = value


                    var requestedField = requestedField

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(sqlStrings!!.SELECT)
stringBuffer!!.append(requestedField)
stringBuffer!!.append(sqlStrings!!.FROM)
stringBuffer!!.append(this.getTableName())
stringBuffer!!.append(sqlStrings!!.WHERE)
stringBuffer!!.append(key)
stringBuffer!!.append(sqlStrings!!.EQUAL_QUOTE)
stringBuffer!!.append(value)
stringBuffer!!.append(sqlStrings!!.CLOSE_QUOTE)

    var sqlStatement: String = stringBuffer!!.toString()!!
            


        try {
            
    var field: String = this.stringUtil!!.EMPTY_STRING


    var rset: ResultSet = executeSQLStatement(sqlStatement)!!
            


        while(rset.next())
        {field= rset.getString(requestedField)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(sqlStrings!!.SQL_STATEMENT_LABEL)
stringBuffer!!.append(sqlStatement)
stringBuffer!!.append(sqlStrings!!.FIELD_VALUE)
stringBuffer!!.append(field)
logUtil!!.put(stringBuffer!!.toString(), this, METHOD_GET_FIELD)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return field
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.FAILED_SQL_STATEMENT +sqlStatement, this, METHOD_GET_FIELD, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.FAILED_SQL_STATEMENT +sqlStatement
}

}


open fun getField(keysAndValues: HashMap<Any, Any>, requestedField: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var keysAndValues = keysAndValues


                    var requestedField = requestedField

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(sqlStrings!!.SELECT)
stringBuffer!!.append(requestedField)
stringBuffer!!.append(sqlStrings!!.FROM)
stringBuffer!!.append(this.getTableName())
stringBuffer!!.append(sqlStrings!!.WHERE)

        try {
            
    var field: String = this.stringUtil!!.EMPTY_STRING


    var set: Set = keysAndValues!!.keySet()!!
            


    var keyArray: Array<Any?> = set.toArray()!!
            


    var size: Int = keyArray!!.size
                


    var key: String


    var value: String





                        for (i in 0 until size)


        {key= keyArray[i]!! as String
value= .concatToString()
stringBuffer!!.append(key)
stringBuffer!!.append(sqlStrings!!.EQUAL_QUOTE)
stringBuffer!!.append(value)
stringBuffer!!.append(sqlStrings!!.CLOSE_QUOTE)

    
                        if(i < size -1)
                        
                                    {
                                    stringBuffer!!.append(sqlStrings!!.AND)

                                    }
                                
}


    var sqlStatement: String = stringBuffer!!.toString()!!
            


    var rset: ResultSet = executeSQLStatement(sqlStatement)!!
            


        while(rset.next())
        {field= rset.getString(requestedField)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(sqlStrings!!.SQL_STATEMENT_LABEL)
stringBuffer!!.append(sqlStatement)
stringBuffer!!.append(sqlStrings!!.FIELD_VALUE)
stringBuffer!!.append(field)
logUtil!!.put(stringBuffer!!.toString(), this, METHOD_GET_FIELD)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return field
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
} catch(e: Exception)
            {
    var sqlStatement: String = stringBuffer!!.toString()!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.FAILED_SQL_STATEMENT +sqlStatement, this, METHOD_GET_FIELD, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.FAILED_SQL_STATEMENT +sqlStatement
}

}


open fun isSubsetOfEntry(key: String, value: String, columnsAndValues: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var key = key


                    var value = value


                    var columnsAndValues = columnsAndValues

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(sqlStrings!!.SELECT)

        try {
            
    var keyArray: Array<Any?> = columnsAndValues!!.keySet()!!.toArray()!!
            


    var size: Int = keyArray!!.size
                

stringBuffer!!.append(this.commonSeps!!.SPACE)
stringBuffer!!.append(key)




                        for (i in 0 until size)


        {stringBuffer!!.append(this.commonSeps!!.SPACE)
stringBuffer!!.append(keyArray[i]!!.toString())
}

stringBuffer!!.append(sqlStrings!!.FROM)
stringBuffer!!.append(this.getTableName())
stringBuffer!!.append(sqlStrings!!.WHERE)
stringBuffer!!.append(key)
stringBuffer!!.append(sqlStrings!!.EQUAL_QUOTE)
stringBuffer!!.append(value)
stringBuffer!!.append(sqlStrings!!.CLOSE_QUOTE)

    var sqlStatement: String = stringBuffer!!.toString()!!
            


    var rset: ResultSet = executeSQLStatement(sqlStatement)!!
            


    var columnName: String


    var field: String


        while(rset.next())
        {
    var keyArray2: Array<Any?> = columnsAndValues!!.keySet()!!.toArray()!!
            


    var size2: Int = keyArray2!!.size
                





                        for (i in 0 until size2)


        {columnName= keyArray2[i]!!.toString()
field= rset.getObject(columnName)!!.toString()

    
                        if(field.compareTo(columnsAndValues!!.get(columnName) as String) != 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return org.allbinary.globals.GLOBALS2.NOTASUBSET

                                    }
                                
}

}


    
                        if(rset.getRow() != 1)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return org.allbinary.globals.GLOBALS2.NOTASUBSET

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return org.allbinary.globals.GLOBALS2.ISASUBSET

                        }
                            
} catch(e: Exception)
            {
    var sqlStatement: String = stringBuffer!!.toString()!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.FAILED_SQL_STATEMENT +sqlStatement, this, METHOD_IS_SUBSET_OF_ENTRY, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.FAILED_SQL_STATEMENT +sqlStatement
}

}


}
                
            

