
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
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.sql.ResultSet
import java.util.Vector
import org.allbinary.business.init.db.DbConnectionInfo
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker

open public class AbSqlColumn : AbSqlTable {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val LARGEST_INT_VALUE_IN_COLUMN: String = "\nLargest Int Value in column: "

    private val METHOD_GET_LARGETS_INTEGER_IN_COLUMN: String = "getLargestIntegerInColumn"

    private val METHOD_GET_COLUMN: String = "getColumn"

    private val METHOD_GET_COLUMN_WHERE: String = "getColumnWhere"

    private val INVALID_RESULT: String = "-1"
public constructor        (databaseConnectionInfoInterface: DbConnectionInfo)                        

                            : super(databaseConnectionInfoInterface){

                    var databaseConnectionInfoInterface = databaseConnectionInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
}


open fun getLargestIntegerInColumnWhere(columnName: String, key: String, value: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var columnName = columnName


                    var key = key


                    var value = value

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(sqlStrings!!.SELECT)
stringBuffer!!.append(columnName)
stringBuffer!!.append(sqlStrings!!.FROM)
stringBuffer!!.append(this.getTableName())
stringBuffer!!.append(sqlStrings!!.WHERE)
stringBuffer!!.append(key)
stringBuffer!!.append(sqlStrings!!.EQUAL_QUOTE)
stringBuffer!!.append(value)
stringBuffer!!.append(sqlStrings!!.CLOSE_QUOTE)

    var sqlStatement: String = stringBuffer!!.toString()!!
            


        try {
            
    var largest: Int = 0


    var rset: ResultSet = executeSQLStatement(sqlStatement)!!
            


        while(rset.next())
        {
    var intValue: Int = rset.getInt(columnName)!!
            


    
                        if(intValue > largest)
                        
                                    {
                                    largest= intValue

                                    }
                                
}


    var largestAsString: String = Integer(largest).
                            toString()!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(sqlStrings!!.SQL_STATEMENT_LABEL)
stringBuffer!!.append(sqlStatement)
stringBuffer!!.append(LARGEST_INT_VALUE_IN_COLUMN)
stringBuffer!!.append(largestAsString)
logUtil!!.put(stringBuffer!!.toString(), this, METHOD_GET_LARGETS_INTEGER_IN_COLUMN)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return largestAsString
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.FAILED_SQL_STATEMENT +sqlStatement, this, METHOD_GET_LARGETS_INTEGER_IN_COLUMN, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return INVALID_RESULT
}

}


open fun getColumn(columnName: String)
        //nullable = true from not(false or (false and false)) = true
: Vector{

                    var columnName = columnName

    var column: Vector = Vector()


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(sqlStrings!!.SELECT)
stringBuffer!!.append(columnName)
stringBuffer!!.append(sqlStrings!!.FROM)
stringBuffer!!.append(this.getTableName())

    var sqlStatement: String = stringBuffer!!.toString()!!
            


        try {
            
    var rset: ResultSet = executeSQLStatement(sqlStatement)!!
            


        while(rset.next())
        {
    var field: String = rset.getObject(columnName)!!.toString()!!
            

column.add(field)
}


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(sqlStrings!!.SQL_STATEMENT_LABEL)
stringBuffer!!.append(sqlStatement)
stringBuffer!!.append(sqlStrings!!.COLUMN_VALUE)
stringBuffer!!.append(column.toString())
logUtil!!.put(stringBuffer!!.toString(), this, METHOD_GET_COLUMN)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return column
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.FAILED_SQL_STATEMENT +sqlStatement, this, METHOD_GET_COLUMN, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return column
}

}


open fun getColumnWhere(columnName: String, key: String, value: String)
        //nullable = true from not(false or (false and false)) = true
: Vector{

                    var columnName = columnName


                    var key = key


                    var value = value

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(sqlStrings!!.SELECT)
stringBuffer!!.append(columnName)
stringBuffer!!.append(sqlStrings!!.FROM)
stringBuffer!!.append(this.getTableName())
stringBuffer!!.append(sqlStrings!!.WHERE)
stringBuffer!!.append(key)
stringBuffer!!.append(sqlStrings!!.EQUAL_QUOTE)
stringBuffer!!.append(value)
stringBuffer!!.append(sqlStrings!!.CLOSE_QUOTE)

    var sqlStatement: String = stringBuffer!!.toString()!!
            


    var column: Vector = Vector()


    var rset: ResultSet


    var field: String


        try {
            rset= executeSQLStatement(sqlStatement)

        while(rset.next())
        {field= rset.getObject(columnName)!!.toString()
column.add(field)
}


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(sqlStrings!!.SQL_STATEMENT_LABEL)
stringBuffer!!.append(sqlStatement)
stringBuffer!!.append(sqlStrings!!.COLUMN_VALUE)
stringBuffer!!.append(column.toString())
logUtil!!.put(stringBuffer!!.toString(), this, METHOD_GET_COLUMN_WHERE)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return column
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.FAILED_SQL_STATEMENT +sqlStatement, this, this.METHOD_GET_COLUMN_WHERE, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return column
}

}


}
                
            

