
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
import java.sql.ResultSetMetaData
import java.util.HashMap
import java.util.Set
import java.util.Vector
import org.allbinary.business.init.db.DbConnectionInfo
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.string.regex.replace.Replace

open public class AbSqlRow : AbSqlColumn {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val EQUAL_QUOTE: String = "=\""

    private val ESCAPE_QUOTES: String = "\\\""

    private val GET_ROW: String = "Row Value: "

    private val METHOD_GET_ROW: String = "getRow()"

    private val METHOD_GET_ROWS: String = "getRows()"

    private val METHOD_GET_ALL_ROWS: String = "getAllRows()"

    private val METHOD_UPDATE_WHERE: String = "updateWhere()"

    private val METHOD_GET_ROWS_WHERE_BETWEEN: String = "getRowsWhereBetween()"

    private val METHOD_DELETE_WHERE: String = "deleteWhere()"

    private val ROW_VALUE_LABEL: String = "Row Value: "

    private val ROW_VALUES_LABEL: String = "Row Values: "

    private val NO_RESULTS_IN_RESULT_SET: String = "No Results in ResultSet"

    private val COLUMN_NAME_LABEL: String = "columnName: "

    private val INSERT_END: String = "')"
public constructor        (databaseConnectionInfoInterface: DbConnectionInfo)                        

                            : super(databaseConnectionInfoInterface){

                    var databaseConnectionInfoInterface = databaseConnectionInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
}


open fun getValue(value: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var value = value

    
                        if(StringValidationUtil.getInstance()!!.isEmpty(value))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.stringUtil!!.EMPTY_STRING

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return value

                        }
                            
}


open fun updateWhere(key: String, value: String, updatedKeyValuePairs: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var key = key


                    var value = value


                    var updatedKeyValuePairs = updatedKeyValuePairs

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.sqlStrings!!.UPDATE)
stringBuffer!!.append(this.getTableName())
stringBuffer!!.append(this.sqlStrings!!.SET)

        try {
            
    var keyArray: Array<Any?> = updatedKeyValuePairs!!.keySet()!!.toArray()!!


    var size: Int = keyArray!!.size
                





                        for (i in 0 until size)


        {
    var columnName: String = keyArray[i]!!.toString()!!

stringBuffer!!.append(this.commonSeps!!.SPACE)
stringBuffer!!.append(columnName)
stringBuffer!!.append(EQUAL_QUOTE)

    var columnValue: String = updatedKeyValuePairs!!.get(columnName) as String


    
                        if(columnValue == 
                                    null
                                )
                        
                                    {
                                    columnValue= this.stringUtil!!.EMPTY_STRING

                                    }
                                
                        else {
                            columnValue= Replace(sqlStrings!!.CLOSE_QUOTE, ESCAPE_QUOTES).
                            all(columnValue)

                        }
                            
stringBuffer!!.append(this.getValue(columnValue))
stringBuffer!!.append(sqlStrings!!.CLOSE_QUOTE)

    
                        if(i < size -1)
                        
                                    {
                                    stringBuffer!!.append(this.commonSeps!!.COMMA)

                                    }
                                
}

stringBuffer!!.append(sqlStrings!!.WHERE)
stringBuffer!!.append(key)
stringBuffer!!.append(sqlStrings!!.EQUAL_QUOTE)
stringBuffer!!.append(this.getValue(value))
stringBuffer!!.append(sqlStrings!!.CLOSE_QUOTE)

    var sqlStatement: String = stringBuffer!!.toString()!!

this.executeSQLStatement(sqlStatement)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.SUCCESS_SQL_STATEMENT +sqlStatement, this, METHOD_UPDATE_WHERE)

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.FAILED_SQL_STATEMENT +stringBuffer, this, METHOD_UPDATE_WHERE, e)

                                    }
                                
}

}


                @Throws(Exception::class)
            
open fun updateWhere(whereKeyValuePairs: HashMap<Any, Any>, updatedKeyValuePairs: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var whereKeyValuePairs = whereKeyValuePairs


                    var updatedKeyValuePairs = updatedKeyValuePairs

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.sqlStrings!!.UPDATE)
stringBuffer!!.append(this.getTableName())
stringBuffer!!.append(this.sqlStrings!!.SET)

        try {
            
    var keyArray: Array<Any?> = updatedKeyValuePairs!!.keySet()!!.toArray()!!


    var size: Int = keyArray!!.size
                





                        for (i in 0 until size)


        {
    var columnName: String = keyArray[i]!!.toString()!!

stringBuffer!!.append(this.commonSeps!!.SPACE)
stringBuffer!!.append(columnName)
stringBuffer!!.append(this.EQUAL_QUOTE)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(COLUMN_NAME_LABEL +columnName, this, METHOD_UPDATE_WHERE)

                                    }
                                

    var columnValue: String = updatedKeyValuePairs!!.get(columnName) as String


    
                        if(columnValue == 
                                    null
                                )
                        
                                    {
                                    columnValue= this.stringUtil!!.EMPTY_STRING

                                    }
                                
                        else {
                            columnValue= Replace(sqlStrings!!.CLOSE_QUOTE, this.ESCAPE_QUOTES).
                            all(columnValue)

                        }
                            
stringBuffer!!.append(this.getValue(columnValue))
stringBuffer!!.append(sqlStrings!!.CLOSE_QUOTE)

    
                        if(i < size -1)
                        
                                    {
                                    stringBuffer!!.append(this.commonSeps!!.COMMA)

                                    }
                                
}

stringBuffer!!.append(sqlStrings!!.WHERE)

    var set: Set = whereKeyValuePairs!!.keySet()!!


    var keyArray2: Array<Any?> = set.toArray()!!


    var size2: Int = keyArray2!!.size
                





                        for (i in 0 until size2)


        {
    var key: String = keyArray2[i]!! as String


    var value: String = whereKeyValuePairs!!.get(key) as String



                            {
                            stringBuffer!!.append(key)
stringBuffer!!.append(sqlStrings!!.EQUAL_QUOTE)
stringBuffer!!.append(this.getValue(value))
stringBuffer!!.append(sqlStrings!!.CLOSE_QUOTE)

    
                        if(i < size2 -1)
                        
                                    {
                                    stringBuffer!!.append(sqlStrings!!.AND)

                                    }
                                

                            }
                    
}


    var sqlStatement: String = stringBuffer!!.toString()!!

this.executeSQLStatement(sqlStatement)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.SUCCESS_SQL_STATEMENT +sqlStatement, this, METHOD_UPDATE_WHERE)

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.FAILED_SQL_STATEMENT +stringBuffer, this, METHOD_UPDATE_WHERE, e)

                                    }
                                



                            throw e
}

}


open fun deleteWhere(key: String, value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var key = key


                    var value = value

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.sqlStrings!!.DELETE)
stringBuffer!!.append(this.sqlStrings!!.FROM)
stringBuffer!!.append(this.getTableName())
stringBuffer!!.append(sqlStrings!!.WHERE)
stringBuffer!!.append(key)
stringBuffer!!.append(sqlStrings!!.EQUAL_QUOTE)
stringBuffer!!.append(value)
stringBuffer!!.append(sqlStrings!!.CLOSE_QUOTE)

        try {
            
    var sqlStatement: String = stringBuffer!!.toString()!!

this.executeSQLStatement(sqlStatement)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.SUCCESS_SQL_STATEMENT +sqlStatement, this, this.METHOD_DELETE_WHERE)

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.FAILED_SQL_STATEMENT +stringBuffer!!.toString(), this, this.METHOD_DELETE_WHERE, e)

                                    }
                                
}

}


open fun deleteWhere(keysAndValues: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var keysAndValues = keysAndValues

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.sqlStrings!!.DELETE)
stringBuffer!!.append(this.sqlStrings!!.FROM)
stringBuffer!!.append(this.getTableName())
stringBuffer!!.append(this.sqlStrings!!.WHERE)

        try {
            
    var set: Set = keysAndValues!!.keySet()!!


    var keyArray: Array<Any?> = set.toArray()!!


    var size: Int = keyArray!!.size
                





                        for (i in 0 until size)


        {
    var key: String = keyArray[i]!! as String


    var value: String = .toCharArray()

stringBuffer!!.append(key)
stringBuffer!!.append(this.sqlStrings!!.EQUAL_QUOTE)
stringBuffer!!.append(this.getValue(value))
stringBuffer!!.append(this.sqlStrings!!.CLOSE_QUOTE)

    
                        if(i < size -1)
                        
                                    {
                                    stringBuffer!!.append(this.sqlStrings!!.AND)

                                    }
                                
}


    var sqlStatement: String = stringBuffer!!.toString()!!

this.executeSQLStatement(sqlStatement)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.SUCCESS_SQL_STATEMENT +sqlStatement, this, this.METHOD_DELETE_WHERE)

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.FAILED_SQL_STATEMENT +stringBuffer!!.toString(), this, this.METHOD_DELETE_WHERE, e)

                                    }
                                
}

}


open fun insert(values: Vector)
        //nullable = true from not(false or (false and false)) = true
{

                    var values = values

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.sqlStrings!!.INSERT_INTO)
stringBuffer!!.append(this.getTableName())
stringBuffer!!.append(this.sqlStrings!!.VALUES)

        try {
            



                        for (i in 0 until values.size -1)


        {
    var value: String = this.getValue(values.get(i) as String)!!

value= Replace(this.sqlStrings!!.ESCAPE, this.sqlStrings!!.DOUBLE_ESCAPE).
                            all(value)
stringBuffer!!.append(value)
stringBuffer!!.append(this.sqlStrings!!.SINGLE_QUOTE_COMMA_SEP)
}


    var value: String = this.getValue(values.lastElement() as String)!!

value= Replace(this.sqlStrings!!.ESCAPE, this.sqlStrings!!.DOUBLE_ESCAPE).
                            all(value)
stringBuffer!!.append(value)
stringBuffer!!.append(INSERT_END)

    var sqlStatement: String = stringBuffer!!.toString()!!

this.executeSQLStatement(sqlStatement)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.SUCCESS_SQL_STATEMENT +sqlStatement, this, INSERT)

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.FAILED_SQL_STATEMENT +stringBuffer!!.toString(), this, INSERT, e)

                                    }
                                
}

}


open fun getRow(keysAndValues: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
: HashMap<Any, Any>{

                    var keysAndValues = keysAndValues

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.sqlStrings!!.SELECT_ALL_FROM)
stringBuffer!!.append(this.getTableName())
stringBuffer!!.append(sqlStrings!!.WHERE)

        try {
            
    var result: HashMap<Any, Any> = 
                null
            


    var set: Set = keysAndValues!!.keySet()!!


    var keyArray: Array<Any?> = set.toArray()!!


    var size: Int = keyArray!!.size
                





                        for (index in 0 until size)


        {
    var key: String = keyArray[index]!! as String


    var value: String = .toCharArray()

stringBuffer!!.append(key)
stringBuffer!!.append(sqlStrings!!.EQUAL_QUOTE)
stringBuffer!!.append(this.getValue(value))
stringBuffer!!.append(sqlStrings!!.CLOSE_QUOTE)

    
                        if(index < size -1)
                        
                                    {
                                    stringBuffer!!.append(sqlStrings!!.AND)

                                    }
                                
}


    var sqlStatement: String = stringBuffer!!.toString()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(sqlStrings!!.SQL_STATEMENT_LABEL +sqlStatement, this, this.METHOD_GET_ROW)

                                    }
                                

    var rset: ResultSet = this.executeSQLStatement(sqlStatement)!!


    var resultSetMetaData: ResultSetMetaData = rset.getMetaData()!!


        while(rset.next())
        {result= HashMap<Any, Any>()

    var columnCount: Int = resultSetMetaData!!.getColumnCount()!!





                        for (index in 1 until columnCount)


        {
    var columnName: String = resultSetMetaData!!.getColumnName(index)!!


    var field: String = rset.getString(columnName)!!

result.put(columnName, field)
}


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(ROW_VALUE_LABEL +result.toString(), this, this.METHOD_GET_ROW)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
}


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(NO_RESULTS_IN_RESULT_SET, this, this.METHOD_GET_ROW)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.FAILED_SQL_STATEMENT +stringBuffer, this, this.METHOD_GET_ROW, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun getRows(keysAndValues: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
: Vector{

                    var keysAndValues = keysAndValues



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getRows(keysAndValues, StringUtil.getInstance()!!.EMPTY_STRING)
}


open fun getRows(keysAndValues: HashMap<Any, Any>, more: String)
        //nullable = true from not(false or (false and false)) = true
: Vector{

                    var keysAndValues = keysAndValues


                    var more = more

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.sqlStrings!!.SELECT_ALL_FROM)
stringBuffer!!.append(this.getTableName())
stringBuffer!!.append(sqlStrings!!.WHERE)

        try {
            
    var rows: Vector = Vector()


    var set: Set = keysAndValues!!.keySet()!!


    var keyArray: Array<Any?> = set.toArray()!!


    var size: Int = keyArray!!.size
                





                        for (index in 0 until size)


        {
    var key: String = keyArray[index]!! as String


    var value: String = .toCharArray()

stringBuffer!!.append(key)
stringBuffer!!.append(sqlStrings!!.EQUAL_QUOTE)
stringBuffer!!.append(this.getValue(value))
stringBuffer!!.append(sqlStrings!!.CLOSE_QUOTE)

    
                        if(index < size -1)
                        
                                    {
                                    stringBuffer!!.append(sqlStrings!!.AND)

                                    }
                                
}


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(sqlStrings!!.SQL_STATEMENT_LABEL +stringBuffer, this, this.METHOD_GET_ROWS)

                                    }
                                
stringBuffer!!.append(more)

    var sqlStatement: String = stringBuffer!!.toString()!!


    var rset: ResultSet = this.executeSQLStatement(sqlStatement)!!


    var resultSetMetaData: ResultSetMetaData = rset.getMetaData()!!


        while(rset.next())
        {
    var result: HashMap<Any, Any> = HashMap<Any, Any>()


    var columnCount: Int = resultSetMetaData!!.getColumnCount()!!





                        for (index in 1 until columnCount)


        {
    var columnName: String = resultSetMetaData!!.getColumnName(index)!!


    var field: String = rset.getString(columnName)!!

result.put(columnName, field)
}


    var resultAsString: String = result.toString()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.GET_ROW +resultAsString, this, this.METHOD_GET_ROWS)

                                    }
                                
rows.add(result)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rows
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.FAILED_SQL_STATEMENT +stringBuffer, this, this.METHOD_GET_ROWS, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun getAllRows()
        //nullable = true from not(false or (false and true)) = true
: Vector{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.sqlStrings!!.SELECT_ALL_FROM)
stringBuffer!!.append(this.getTableName())

        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(sqlStrings!!.SQL_STATEMENT_LABEL +stringBuffer, this, this.METHOD_GET_ALL_ROWS)

                                    }
                                

    var rows: Vector = Vector()


    var sqlStatement: String = stringBuffer!!.toString()!!


    var rset: ResultSet = this.executeSQLStatement(sqlStatement)!!


    var resultSetMetaData: ResultSetMetaData = rset.getMetaData()!!


        while(rset.next())
        {
    var result: HashMap<Any, Any> = HashMap<Any, Any>()


    var columnCount: Int = resultSetMetaData!!.getColumnCount()!!





                        for (index in 1 until columnCount)


        {
    var columnName: String = resultSetMetaData!!.getColumnName(index)!!


    var field: String = rset.getString(columnName)!!

result.put(columnName, field)
}


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(ROW_VALUES_LABEL +result.toString(), this, this.METHOD_GET_ALL_ROWS)

                                    }
                                
rows.add(result)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rows
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.FAILED_SQL_STATEMENT +stringBuffer, this, this.METHOD_GET_ALL_ROWS, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun getRowsWhereBetween(whereKeyValuePairs: HashMap<Any, Any>, betweenColumn: String, smallest: String, largest: String)
        //nullable = true from not(false or (false and false)) = true
: Vector{

                    var whereKeyValuePairs = whereKeyValuePairs


                    var betweenColumn = betweenColumn


                    var smallest = smallest


                    var largest = largest

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.sqlStrings!!.SELECT_ALL_FROM)
stringBuffer!!.append(this.getTableName())

        try {
            
    var rows: Vector = Vector()

stringBuffer!!.append(sqlStrings!!.WHERE)

    var set: Set = whereKeyValuePairs!!.keySet()!!


    var key: String


    var value: String


    var keyArray: Array<Any?> = set.toArray()!!


    var size: Int = keyArray!!.size
                





                        for (index in 0 until size)


        {key= keyArray[index]!! as String
value= whereKeyValuePairs!!.get(key) as String
stringBuffer!!.append(key)
stringBuffer!!.append(sqlStrings!!.EQUAL_QUOTE)
stringBuffer!!.append(this.getValue(value))
stringBuffer!!.append(sqlStrings!!.CLOSE_QUOTE)
stringBuffer!!.append(sqlStrings!!.AND)
}

stringBuffer!!.append(betweenColumn)
stringBuffer!!.append(this.sqlStrings!!.MORE_THAN_QUOTE)
stringBuffer!!.append(smallest)
stringBuffer!!.append(sqlStrings!!.CLOSE_QUOTE)
stringBuffer!!.append(sqlStrings!!.AND)
stringBuffer!!.append(betweenColumn)
stringBuffer!!.append(this.sqlStrings!!.LESS_THAN_QUOTE)
stringBuffer!!.append(largest)
stringBuffer!!.append(sqlStrings!!.CLOSE_QUOTE)

    var sqlStatement: String = stringBuffer!!.toString()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(sqlStrings!!.SQL_STATEMENT_LABEL +sqlStatement, this, METHOD_GET_ROWS_WHERE_BETWEEN)

                                    }
                                

    var rset: ResultSet = this.executeSQLStatement(sqlStatement)!!


    var resultSetMetaData: ResultSetMetaData = rset.getMetaData()!!


    var result: HashMap<Any, Any>


    var columnNames: Vector


    var columnCount: Int= 0


    var columnName: String


    var field: String


        while(rset.next())
        {result= HashMap<Any, Any>()
columnNames= Vector()
columnCount= resultSetMetaData!!.getColumnCount()




                        for (index in 1 until columnCount)


        {columnName= resultSetMetaData!!.getColumnName(index)
field= rset.getString(columnName)
result.put(columnName, field)
}


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(ROW_VALUE_LABEL +result.toString(), this, METHOD_GET_ROWS_WHERE_BETWEEN)

                                    }
                                
rows.add(result)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rows
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.FAILED_SQL_STATEMENT +stringBuffer, this, METHOD_GET_ROWS_WHERE_BETWEEN, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun getRowsWhereBetween(betweenColumn: String, smallest: String, largest: String)
        //nullable = true from not(false or (false and false)) = true
: Vector{

                    var betweenColumn = betweenColumn


                    var smallest = smallest


                    var largest = largest

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.sqlStrings!!.SELECT_ALL_FROM)
stringBuffer!!.append(this.getTableName())

        try {
            
    var rows: Vector = Vector()

stringBuffer!!.append(sqlStrings!!.WHERE)
stringBuffer!!.append(betweenColumn)
stringBuffer!!.append(this.sqlStrings!!.MORE_THAN_QUOTE)
stringBuffer!!.append(smallest)
stringBuffer!!.append(sqlStrings!!.CLOSE_QUOTE)
stringBuffer!!.append(sqlStrings!!.AND)
stringBuffer!!.append(betweenColumn)
stringBuffer!!.append(this.sqlStrings!!.LESS_THAN_QUOTE)
stringBuffer!!.append(largest)
stringBuffer!!.append(sqlStrings!!.CLOSE_QUOTE)

    var sqlStatement: String = stringBuffer!!.toString()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(sqlStrings!!.SQL_STATEMENT_LABEL +sqlStatement, this, METHOD_GET_ROWS_WHERE_BETWEEN)

                                    }
                                

    var rset: ResultSet = this.executeSQLStatement(sqlStatement)!!


    var resultSetMetaData: ResultSetMetaData = rset.getMetaData()!!


    var columnName: String


    var field: String


    var result: HashMap<Any, Any>


    var columnNames: Vector


    var columnCount: Int= 0


        while(rset.next())
        {result= HashMap<Any, Any>()
columnNames= Vector()
columnCount= resultSetMetaData!!.getColumnCount()




                        for (index in 1 until columnCount)


        {columnName= resultSetMetaData!!.getColumnName(index)
field= rset.getString(columnName)
result.put(columnName, field)
}


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(ROW_VALUE_LABEL +result.toString(), this, METHOD_GET_ROWS_WHERE_BETWEEN)

                                    }
                                
rows.add(result)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rows
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.FAILED_SQL_STATEMENT +stringBuffer, this, METHOD_GET_ROWS_WHERE_BETWEEN, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


}
                
            

