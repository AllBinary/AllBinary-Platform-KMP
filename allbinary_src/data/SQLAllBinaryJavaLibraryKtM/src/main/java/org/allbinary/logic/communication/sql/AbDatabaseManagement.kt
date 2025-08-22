
        /*
                *  
                *  To change this license header, choose License Headers in Project Properties. 
                *  To change this template file, choose Tools | Templates  and open the template in the editor.  
        */
        
        /* Generated Code Do Not Modify */
        package org.allbinary.logic.communication.sql




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.net.InetAddress
import org.allbinary.business.init.db.DatabaseConnectionInfoInterface
import org.allbinary.business.init.db.DbConnectionInfo
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonStrings

open public class AbDatabaseManagement : AbSqlBean {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

    val sqlCommandLog: StringMaker = StringMaker()

    private val GRANT_ALL: String = "GRANT SELECT, INSERT, UPDATE, DELETE, CREATE, DROP, INDEX, ALTER ON "

    private val DOT_STAR: String = ".*"

    private val TO: String = " TO "

    private val AT_LOCALHOST: String = "@localhost"

    private val IDENTIFIED_BY: String = " IDENTIFIED BY '"

    private val WITH_GRANT_OPTION: String = "' WITH GRANT OPTION"

    private val FAILED: String = "Failed"

    private val GET_HOST_NAME: String = "getHostName()"

    private val METHOD_ADD_USER: String = "addUser()"

    val METHOD_ADD_USERS: String = "addUsers()"

    private val METHOD_ADD_DB: String = "addDb()"

    val METHOD_ADD_DATABASES: String = "addDatabases()"

    val METHOD_ADD_TABLES: String = "addTables()"

    val UNABLE_TO_CREATE_USER: String = "Unable to Create User: "

    val UNABLE_TO_CREATE_DATABASE: String = "Unable to Create Database: "

    val UNABLE_TO_CREATE_TABLES: String = "Unable to Create Tables"

    val ADD_TABLES_RESULTS_LABEL: String = "Add Table Results: "
public constructor        (databaseConnectionInfoInterface: DatabaseConnectionInfoInterface)                        

                            : super(databaseConnectionInfoInterface as DbConnectionInfo){

                    var databaseConnectionInfoInterface = databaseConnectionInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (connectionInfo: DbConnectionInfo)                        

                            : super(connectionInfo){

                    var connectionInfo = connectionInfo


                            //For kotlin this is before the body of the constructor.
                    
}


open fun getHostName()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var addr: InetAddress = InetAddress.getLocalHost()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return addr.getHostName()
} catch(e: Exception)
            {logUtil!!.put(this.FAILED, this, GET_HOST_NAME, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


                @Throws(Exception::class)
            
open fun addDbUser(hostName: String, db: String, userName: String, password: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var hostName = hostName


                    var db = db


                    var userName = userName


                    var password = password

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.GRANT_ALL)
stringBuffer!!.append(db)
stringBuffer!!.append(this.DOT_STAR)
stringBuffer!!.append(this.TO)
stringBuffer!!.append(userName)
stringBuffer!!.append(hostName)
stringBuffer!!.append(this.IDENTIFIED_BY)
stringBuffer!!.append(password)
stringBuffer!!.append(this.WITH_GRANT_OPTION)

    var sqlStatement: String = stringBuffer!!.toString()!!

this.sqlCommandLog!!.append(sqlStatement)
this.sqlCommandLog!!.append(this.commonSeps!!.NEW_LINE)
super.executeSQLStatement(sqlStatement)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


open fun addDbUser(db: String, userName: String, password: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var db = db


                    var userName = userName


                    var password = password

        try {
            this.addDbUser(this.AT_LOCALHOST, db, userName, password)

    var hostName: String = this.getHostName()!!


    
                        if(hostName != 
                                    null
                                )
                        
                                    {
                                    this.addDbUser(hostName, db, userName, password)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
} catch(e: Exception)
            {logUtil!!.put(this.UNABLE_TO_CREATE_USER +userName, this, this.METHOD_ADD_USER, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


open fun addDb(db: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var db = db

        try {
            
    var sqlStatement: String = this.sqlStrings!!.CREATE_DATABASE +db

this.sqlCommandLog!!.append(sqlStatement)
this.sqlCommandLog!!.append(this.commonSeps!!.NEW_LINE)
super.executeSQLStatement(sqlStatement)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
} catch(e: Exception)
            {logUtil!!.put(UNABLE_TO_CREATE_DATABASE +db, this, this.METHOD_ADD_DB, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


}
                
            

