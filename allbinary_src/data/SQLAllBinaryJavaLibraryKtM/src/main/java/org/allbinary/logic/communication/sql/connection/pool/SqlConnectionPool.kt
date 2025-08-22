
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
        package org.allbinary.logic.communication.sql.connection.pool




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException
import java.util.HashMap
import java.util.Vector
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker

open public class SqlConnectionPool
            : Object
         {
        

        companion object {
            
    private val instance: SqlConnectionPool = SqlConnectionPool()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: SqlConnectionPool{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var connectionHashMap: HashMap<Any, Any> = 
                null
            

    private val FIRST_NEW_CONNECTION_CREATED: String = "First New Connection Created: "

    private val FIRST: String = "First "

    private val NEW_CONNECTION_FOR: String = "New Connection For "

    private val CREATED: String = " Created"

    private val NUMBER_OF_SQL_CONNECTIONS_FOR: String = "Number Of Sql Connections for: "

    private val NUMBER_OF_SQL_CONNECTION_VECTORS: String = "Number Of Sql Connection Vectors: "

    private val IS: String = " is "

    private val CONNECTION_ALLREADY_CLOSED: String = "Connection AllReady Closed"

    private val METHOD_GET: String = "get()"

    private val METHOD_ADD: String = "add()"
private constructor        ()
            : super()
        {}


                @Throws(SQLException::class)
            
open fun get(url: String)
        //nullable = true from not(false or (false and false)) = true
: Connection{

                    var url = url

    
                        if(this.connectionHashMap == 
                                    null
                                )
                        
                                    {
                                    this.connectionHashMap= HashMap<Any, Any>()

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGPOOL))
                        
                                    {
                                    logUtil!!.put(FIRST_NEW_CONNECTION_CREATED +url, this, METHOD_GET)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DriverManager.getConnection(url)

                                    }
                                
                        else {
                            
    var connectionVector: Vector = this.connectionHashMap!!.get(url as Object) as Vector


    
                        if(connectionVector == 
                                    null
                                )
                        
                                    {
                                    connectionVector= Vector()

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGPOOL))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(FIRST)
stringBuffer!!.append(NEW_CONNECTION_FOR)
stringBuffer!!.append(url)
stringBuffer!!.append(CREATED)
logUtil!!.put(stringBuffer!!.toString(), this, METHOD_GET)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DriverManager.getConnection(url)

                                    }
                                
                             else 
    
                        if(connectionVector!!.size == 0)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGPOOL))
                        
                                    {
                                    logUtil!!.put(StringBuilder().
                            append(NEW_CONNECTION_FOR)!!.append(url)!!.append(CREATED)!!.toString(), this, METHOD_GET)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DriverManager.getConnection(url)

                                    }
                                
                        else {
                            
    var stringBuffer: StringMaker = StringMaker()


    var size: Int = connectionVector!!.size!!





                        for (i in 0 until size)


        {
    var sqlConnection: Connection = connectionVector!!.get(i) as Connection


    
                        if(!sqlConnection!!.isClosed())
                        
                                    {
                                    connectionVector!!.remove(sqlConnection)
this.connectionHashMap!!.put(url, connectionVector)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGPOOL))
                        
                                    {
                                    stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(NUMBER_OF_SQL_CONNECTIONS_FOR)
stringBuffer!!.append(url)
stringBuffer!!.append(IS)
stringBuffer!!.append(connectionVector!!.size)
logUtil!!.put(NUMBER_OF_SQL_CONNECTION_VECTORS +this.connectionHashMap!!.size, this, METHOD_GET)
logUtil!!.put(stringBuffer!!.toString(), this, METHOD_GET)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return sqlConnection as Connection

                                    }
                                
}


                        }
                            

                        }
                            

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGPOOL))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(NEW_CONNECTION_FOR)
stringBuffer!!.append(url)
stringBuffer!!.append(CREATED)
logUtil!!.put(stringBuffer!!.toString(), this, METHOD_GET)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DriverManager.getConnection(url)
}


                @Throws(SQLException::class)
            
open fun add(url: String, sqlConnection: Connection)
        //nullable = true from not(false or (false and false)) = true
{

                    var url = url


                    var sqlConnection = sqlConnection

    
                        if(!sqlConnection!!.isClosed())
                        
                                    {
                                    
    var connectionVector: Vector


    
                        if(this.connectionHashMap == 
                                    null
                                )
                        
                                    {
                                    this.connectionHashMap= HashMap<Any, Any>()
connectionVector= Vector()
connectionVector!!.add(sqlConnection)

                                    }
                                
                        else {
                            connectionVector= this.connectionHashMap!!.get(url as Object) as Vector

    
                        if(connectionVector == 
                                    null
                                )
                        
                                    {
                                    connectionVector= Vector()

                                    }
                                
connectionVector!!.add(sqlConnection)
this.connectionHashMap!!.put(url, connectionVector)

                        }
                            

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGPOOL))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(NUMBER_OF_SQL_CONNECTIONS_FOR)
stringBuffer!!.append(url)
stringBuffer!!.append(IS)
stringBuffer!!.append(connectionVector!!.size)
logUtil!!.put(NUMBER_OF_SQL_CONNECTION_VECTORS +this.connectionHashMap!!.size, this, METHOD_ADD)
logUtil!!.put(stringBuffer!!.toString(), this, METHOD_ADD)

                                    }
                                

                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGINGPOOL))
                        
                                    {
                                    logUtil!!.put(CONNECTION_ALLREADY_CLOSED, this, METHOD_ADD)

                                    }
                                
}


}
                
            

