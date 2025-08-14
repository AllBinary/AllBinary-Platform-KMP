
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
        package org.allbinary.business.init




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.ResultSetMetaData
import java.sql.SQLException
import java.sql.Statement
import java.util.HashMap
import java.util.Set
import java.util.Vector
import org.allbinary.business.init.db.DatabaseConnectionInfoInterface
import org.allbinary.business.init.db.DbConnectionInfo
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory
import org.allbinary.logic.communication.log.config.type.LogConfigTypes
import org.allbinary.logic.communication.sql.SqlStrings
import org.allbinary.logic.communication.sql.SqlTypeStrings
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings

open public class InitSql
            : Object
         {
        

    val stringUtil: StringUtil = StringUtil.getInstance()!!
            

    val commonSeps: CommonSeps = CommonSeps.getInstance()!!
            

    val sqlTypeStrings: SqlTypeStrings = SqlTypeStrings.getInstance()!!
            

    val sqlStrings: SqlStrings = SqlStrings.getInstance()!!
            

    val INSERT: String = "insert"

    val UPDATE: String = "update"

    private var databaseConnectionInfoInterface: DbConnectionInfo

    private var userid: String

    private var password: String

    private var tableName: String

    private var conn: Connection

    private var useridAndPassword: Boolean= false

    val SUCCESS_SQL_STATEMENT: String = "Success\nSQL Statement: "

    val FAILED_SQL_STATEMENT: String = "Failed\nSQL Statement: "

    private val INIT_SQL: String = "InitSql"

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val EQUAL_QUOTE: String = "=\""

    private val METHOD_GET_ROW: String = "getRow()"

    private val METHOD_UPDATE_WHERE: String = "updateWhere()"

    private val ROW_VALUE_LABEL: String = "Row Value: "

    private val NO_RESULTS_IN_RESULT_SET: String = "No Results in ResultSet"

    private val INSERT_END: String = "')"
public constructor        (databaseConnectionInfoInterface: DbConnectionInfo)
            : super()
        {

                    var databaseConnectionInfoInterface = databaseConnectionInfoInterface
this.setDatabaseConnectionInfoInterface(databaseConnectionInfoInterface)
}


open fun setTable(tableName: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var tableName = tableName
this.tableName= tableName
}


open fun setDatabaseConnectionInfoInterface(databaseConnectionInfoInterface: DbConnectionInfo)
        //nullable = true from not(false or (false and false)) = true
{

                    var databaseConnectionInfoInterface = databaseConnectionInfoInterface
this.databaseConnectionInfoInterface= databaseConnectionInfoInterface
}


open fun createTable(tableData: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var tableData = tableData

        try {
            
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "Creating Table: ")
stringBuffer!!.append(tableData)
PreLogUtil.put(stringBuffer!!.toString(), INIT_SQL, 
                            "createTable()")
this.executeSQLStatement(tableData)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
} catch(e: Exception)
            {
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    PreLogUtil.put(this.commonStrings!!.EXCEPTION, INIT_SQL, 
                            "createTable()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


open fun dropTable()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    var sqlStatement: String = sqlStrings!!.DROP_TABLE +tableName


        try {
            this.executeSQLStatement(sqlStatement)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
} catch(e: Exception)
            {
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    PreLogUtil.put(this.commonStrings!!.EXCEPTION, INIT_SQL, 
                            "dropTables()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


open fun getRow(keysAndValues: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
: HashMap<Any, Any>{

                    var keysAndValues = keysAndValues

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.sqlStrings!!.SELECT_ALL_FROM)
stringBuffer!!.append(this.tableName)
stringBuffer!!.append(sqlStrings!!.WHERE)

        try {
            
    var result: HashMap<Any, Any> = 
                null
            


    var set: Set = keysAndValues!!.keySet()!!
            


    var keyArray: Array<Any?> = set.toArray()!!
            


    var size: Int = keyArray!!.size
                





                        for (i in 0 until size)


        {
    var key: String = keyArray[i]!! as String


    var value: String = .concatToString()

stringBuffer!!.append(key)
stringBuffer!!.append(sqlStrings!!.EQUAL_QUOTE)
stringBuffer!!.append(this.getValue(value))
stringBuffer!!.append(sqlStrings!!.CLOSE_QUOTE)

    
                        if(i < size -1)
                        
                                    {
                                    stringBuffer!!.append(sqlStrings!!.AND)

                                    }
                                
}


    var sqlStatement: String = stringBuffer!!.toString()!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    PreLogUtil.put(sqlStrings!!.SQL_STATEMENT_LABEL +sqlStatement, this.INIT_SQL, this.METHOD_GET_ROW)

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
                                    PreLogUtil.put(ROW_VALUE_LABEL +result.toString(), this.INIT_SQL, this.METHOD_GET_ROW)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
}


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    PreLogUtil.put(NO_RESULTS_IN_RESULT_SET, this.INIT_SQL, this.METHOD_GET_ROW)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    PreLogUtil.put(this.FAILED_SQL_STATEMENT +stringBuffer, this.INIT_SQL, this.METHOD_GET_ROW, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
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
stringBuffer!!.append(this.tableName)
stringBuffer!!.append(this.sqlStrings!!.SET)

        try {
            
    var columnArray: Array<Any?> = updatedKeyValuePairs!!.keySet()!!.toArray()!!
            


    var size: Int = columnArray!!.size
                





                        for (i in 0 until size)


        {
    var columnName: String = columnArray[i]!!.toString()!!
            

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
                                    PreLogUtil.put(this.SUCCESS_SQL_STATEMENT +sqlStatement, this.INIT_SQL, METHOD_UPDATE_WHERE)

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    PreLogUtil.put(this.FAILED_SQL_STATEMENT +stringBuffer, this.INIT_SQL, METHOD_UPDATE_WHERE, e)

                                    }
                                
}

}


open fun insert(values: Vector)
        //nullable = true from not(false or (false and false)) = true
{

                    var values = values

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.sqlStrings!!.INSERT_INTO)
stringBuffer!!.append(this.tableName)
stringBuffer!!.append(this.sqlStrings!!.VALUES)

        try {
            
    var size: Int = values.size!!
            





                        for (i in 0 until size -1)


        {
    var value: String = this.getValue(values.get(i) as String)!!
            

stringBuffer!!.append(value)
stringBuffer!!.append(this.sqlStrings!!.SINGLE_QUOTE_COMMA_SEP)
}


    var value: String = this.getValue(values.lastElement() as String)!!
            

stringBuffer!!.append(value)
stringBuffer!!.append(INSERT_END)

    var sqlStatement: String = stringBuffer!!.toString()!!
            

this.executeSQLStatement(sqlStatement)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    PreLogUtil.put(this.SUCCESS_SQL_STATEMENT +sqlStatement, this.INIT_SQL, INSERT)

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    PreLogUtil.put(this.FAILED_SQL_STATEMENT +stringBuffer!!.toString(), this.INIT_SQL, INSERT, e)

                                    }
                                
}

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


                @Throws(Exception::class, SQLException::class)
            
open fun executeSQLStatement(statement: String)
        //nullable = true from not(false or (false and false)) = true
: ResultSet{

                    var statement = statement

        try {
            
    
                        if(conn == 
                                    null
                                )
                        
                                    {
                                    initialize()

                                    }
                                

    var stmt: Statement = conn.createStatement()!!
            

stmt.execute(statement)

    var rset: ResultSet = stmt.getResultSet()!!
            

stmt.close()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rset
} catch(e: SQLException)
            {
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    PreLogUtil.put(this.commonStrings!!.EXCEPTION, INIT_SQL, 
                            "executeSQLStatement()", e)

                                    }
                                



                            throw e
}
 catch(e: Exception)
            {
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    PreLogUtil.put(this.commonStrings!!.EXCEPTION, INIT_SQL, 
                            "executeSQLStatement()", e)

                                    }
                                



                            throw e
}

}


                @Throws(SQLException::class)
            
open fun createConnection()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    
                        if(useridAndPassword == true)
                        
                                    {
                                    conn= DriverManager.getConnection(this.databaseConnectionInfoInterface!!.getUrl(), userid, password)

                                    }
                                
                        else {
                            conn= DriverManager.getConnection(this.databaseConnectionInfoInterface!!.getUrl())

                        }
                            
} catch(se: SQLException)
            {PreLogUtil.put(this.commonStrings!!.EXCEPTION, INIT_SQL, 
                            "createConnection()", se)



                            throw se
}

}


                @Throws(Exception::class)
            
open fun initialize()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
        try {
            
    var jdbcDriver: String = this.databaseConnectionInfoInterface!!.getJdbcDriver()!!
            

PreLogUtil.put(StringBuilder().
                            append(
                            "Loading DbConnnectionInfo: ")!!.append(this.databaseConnectionInfoInterface!!.::class.qualifiedName!!)!!.append(
                            " Driver: ")!!.append(jdbcDriver)!!.toString(), INIT_SQL, 
                            "initialize()")
Class.forName(jdbcDriver)!!.newInstance()
} catch(e: Exception)
            {
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    PreLogUtil.put("LoadDriver Failed: " +this.databaseConnectionInfoInterface!!.getJdbcDriver(), INIT_SQL, 
                            "initialize()", e)

                                    }
                                



                            throw e
}


    
                        if(userid == 
                                    null
                                 && password == 
                                    null
                                )
                        
                                    {
                                    useridAndPassword= true

                                    }
                                
this.createConnection()
} catch(se: Exception)
            {
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    PreLogUtil.put(this.commonStrings!!.EXCEPTION, INIT_SQL, 
                            "initialize()", se)

                                    }
                                



                            throw se
}

}


open fun getDatabaseConnectionInfoInterface()
        //nullable = true from not(false or (false and true)) = true
: DatabaseConnectionInfoInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return databaseConnectionInfoInterface
}


}
                
            

