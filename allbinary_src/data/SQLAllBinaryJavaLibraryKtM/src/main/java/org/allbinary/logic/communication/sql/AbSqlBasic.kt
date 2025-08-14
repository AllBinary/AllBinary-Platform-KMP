
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
        
        import java.lang.Thread
        
        import java.lang.ClassLoader
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.sql.Connection
import java.sql.ResultSet
import java.sql.SQLException
import java.sql.Statement
import org.allbinary.business.init.db.DatabaseConnectionInfoInterface
import org.allbinary.business.init.db.DbConnectionInfo
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.connection.pool.SqlConnectionPool
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings

open public class AbSqlBasic
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val sqlConnectionPool: SqlConnectionPool = SqlConnectionPool.getInstance()!!
            

    private var databaseConnectionInfoInterface: DbConnectionInfo

    private var connectAttemptCounter: Int

    var conn: Connection

    val stringUtil: StringUtil = StringUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    val commonSeps: CommonSeps = CommonSeps.getInstance()!!
            

    val sqlTypeStrings: SqlTypeStrings = SqlTypeStrings.getInstance()!!
            

    val sqlStrings: SqlStrings = SqlStrings.getInstance()!!
            

    val INSERT: String = "insert"

    val UPDATE: String = "update"

    val FAILED_SQL_STATEMENT: String = "Failed\nSQL Statement: "

    val SUCCESS_SQL_STATEMENT: String = "Success\nSQL Statement: "

    private val METHOD_EXECUTED_SQL_STATEMENT: String = "executedSQLStatement"

    private val METHOD_CREATE: String = "create"

    private val DATABASE_CREATED_LABEL: String = "Database Created: "

    private val DATABASE_CREATION_FAILED_LABEL: String = "Database Creation Failed: "

    private val SQL_CONNECTION_FAILED: String = "SQL Connection Failed"

    private val SQL_CONNECTION_RETRYING: String = "SQL Connection Retrying"

    private val SQL_CONNECTION_RETRY: String = "SQL Connection Retry"

    private val METHOD_CREATE_CONNECTION: String = "createConnection()"

    private val METHOD_INITIALIZE: String = "initialize"

    private val LOAD_JDBC_DRIVER_FAILED_LABEL: String = "Load JDBC Driver Failed: "
public constructor        (databaseConnectionInfoInterface: DbConnectionInfo)
            : super()
        {

                    var databaseConnectionInfoInterface = databaseConnectionInfoInterface
this.databaseConnectionInfoInterface= databaseConnectionInfoInterface
this.connectAttemptCounter= 0
this.conn= 
                                        null
                                    
}


                @Throws(SQLException::class)
            
open fun executeSQLStatement(statement: String)
        //nullable = true from not(false or (false and false)) = true
: ResultSet{

                    var statement = statement

        try {
            initialize()

    var stmt: Statement = conn.createStatement()!!
            

stmt.execute(statement)

    var rset: ResultSet = stmt.getResultSet()!!
            

stmt.close()

    var tempConnection: Connection = this.conn

this.conn= 
                                        null
                                    
sqlConnectionPool!!.add(this.getDatabaseConnectionInfoInterface()!!.getUrl(), tempConnection)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rset
} catch(e: SQLException)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(FAILED_SQL_STATEMENT +statement, this, METHOD_EXECUTED_SQL_STATEMENT, e)

                                    }
                                
this.conn.close()
this.conn= 
                                        null
                                    



                            throw e
}

}


open fun create(databaseName: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var databaseName = databaseName

        try {
            this.executeSQLStatement(sqlStrings!!.CREATE_DATABASE +databaseName)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.DATABASE_CREATED_LABEL +databaseName, this, METHOD_CREATE)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return databaseName +sqlStrings!!.CREATE_RETURN
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(DATABASE_CREATION_FAILED_LABEL +databaseName, this, this.METHOD_CREATE, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DATABASE_CREATION_FAILED_LABEL +databaseName
}

}


open fun createConnection()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            this.conn= sqlConnectionPool!!.get(this.getDatabaseConnectionInfoInterface()!!.getUrl())
} catch(se: SQLException)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(SQL_CONNECTION_RETRYING, this, METHOD_CREATE_CONNECTION, se)

                                    }
                                

        try {
            Thread.currentThread()!!.sleep(2000)

    
                        if(connectAttemptCounter < 10)
                        
                                    {
                                    connectAttemptCounter++
this.initialize()

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(SQL_CONNECTION_RETRY +se.getMessage(), this, this.METHOD_CREATE_CONNECTION, e)

                                    }
                                
}

}

}


open fun initialize()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            

                            {
                            
        try {
            
    var loader: ClassLoader = Thread.currentThread()!!.getContextClassLoader()!!
            


    var jdbcDriverClass: KClass<*> = loader.loadClass(this.getDatabaseConnectionInfoInterface()!!.getJdbcDriver())!!
            

jdbcDriverClass!!.newInstance()
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(LOAD_JDBC_DRIVER_FAILED_LABEL +this.getDatabaseConnectionInfoInterface()!!.getJdbcDriver(), this, METHOD_INITIALIZE, e)

                                    }
                                
}


                            }
                    
this.createConnection()
} catch(se: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(SQL_CONNECTION_FAILED, this, this.METHOD_INITIALIZE, se)

                                    }
                                
}

}


open fun getDatabaseConnectionInfoInterface()
        //nullable = true from not(false or (false and true)) = true
: DatabaseConnectionInfoInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return databaseConnectionInfoInterface
}


open fun setDatabaseConnectionInfoInterface(databaseConnectionInfoInterface: DbConnectionInfo)
        //nullable = true from not(false or (false and false)) = true
{

                    var databaseConnectionInfoInterface = databaseConnectionInfoInterface
this.databaseConnectionInfoInterface= databaseConnectionInfoInterface
}


}
                
            

