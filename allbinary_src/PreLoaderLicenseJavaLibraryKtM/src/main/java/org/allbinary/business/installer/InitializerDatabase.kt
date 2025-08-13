
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
        package org.allbinary.business.installer



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Map
import java.util.Set
import org.allbinary.business.init.db.DatabaseConnectionInfoInterface
import org.allbinary.business.init.db.DbConnectionInfo
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.string.CommonStrings

open public class InitializerDatabase
            : Object
         {
        

        companion object {
            
    private val MAXDB: Int = 30

    private val MAX: Int = 16

    private val MIN: Int = 4

    private val MINPASSWORD: Int = 0

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var adminDbUserName: String

    private var adminDbPassword: String

    private var adminJdbcDriver: String

    private var adminSchema: String

    private var adminServer: String

    private var adminPort: String

    private var initDb: DynamicInitDb
public constructor        (abeClientInformation: AbeClientInformationInterface, map: Map)
            : super()
        {

                    var abeClientInformation = abeClientInformation


                    var map = map

    var stringBuffer: StringMaker = StringMaker()


    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()


    var keys: Set = map.keySet()!!
            


    var keyArray: Array<Any?> = keys.toArray()!!
            


    var size: Int = keyArray!!.size
                





                        for (index in 0 until size)


        {
    var key: String = keyArray[index]!! as String


    var values: Array<String?> = map.get(key) as Array<String?>

hashMap!!.put(key.concatToString(), .concatToString())
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(
                            "key: ")
stringBuffer!!.append(key)
stringBuffer!!.append(
                            " Value: ")
stringBuffer!!.append(values[0]!!)
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "getFormData()")
}

this.getFormData(abeClientInformation, hashMap)
}

public constructor        (abeClientInformation: AbeClientInformationInterface, initHashMap: HashMap<Any, Any>)
            : super()
        {

                    var abeClientInformation = abeClientInformation


                    var initHashMap = initHashMap
this.getFormData(abeClientInformation, initHashMap)
}


open fun getFormData(abeClientInformation: AbeClientInformationInterface, hashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var abeClientInformation = abeClientInformation


                    var hashMap = hashMap

        try {
            
    var initializerData: InitializerData = InitializerData.getInstance()!!
            

setAdminDbUserName(hashMap!!.get(initializerData!!.DBUSER) as String)
setAdminDbPassword(hashMap!!.get(initializerData!!.DBPASSWORD) as String)
setAdminJdbcDriver(hashMap!!.get(initializerData!!.ADMINJDBCDRIVER) as String)
setAdminSchema(hashMap!!.get(initializerData!!.ADMINSCHEMA) as String)
setAdminServer(hashMap!!.get(initializerData!!.ADMINSERVER) as String)
setAdminPort(hashMap!!.get(initializerData!!.ADMINPORT) as String)

    var dbConnectionInfo: DbConnectionInfo = DbConnectionInfo()


    var adminDbName: String = StringUtil.getInstance()!!.EMPTY_STRING

dbConnectionInfo!!.setJdbcDriver(getAdminJdbcDriver())
dbConnectionInfo!!.setName(adminDbName)
dbConnectionInfo!!.setUserName(getAdminDbUserName())
dbConnectionInfo!!.setPassword(getAdminDbPassword())
dbConnectionInfo!!.setSchema(getAdminSchema())
dbConnectionInfo!!.setServer(getAdminServer())
dbConnectionInfo!!.setPort(getAdminPort())
this.initDb= DynamicInitDb(abeClientInformation, dbConnectionInfo as DatabaseConnectionInfoInterface)
} catch(e: Exception)
            {logUtil!!.put(
                            "Unable to get form data", this, 
                            "getFormData()", e)
}

}


open fun isJdbcDriverValid(jdbcDriverClassPathString: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var jdbcDriverClassPathString = jdbcDriverClassPathString

        try {
            Class.forName(jdbcDriverClassPathString)!!.newInstance()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.PRELOADERERROR))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.IS_VALID, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    var isValid: Boolean = true


    
                        if(!this.isJdbcDriverValid(this.adminJdbcDriver))
                        
                                    {
                                    isValid= false

                                    }
                                

    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!
            


    
                        if(!stringValidationUtil!!.isValidRequired(adminDbUserName, MIN, MAX))
                        
                                    {
                                    isValid= false

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(adminDbPassword, MINPASSWORD, MAX))
                        
                                    {
                                    isValid= false

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return isValid
}


open fun getJdbcDriverValidationInfo(jdbcDriver: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var jdbcDriver = jdbcDriver

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "The JDBC driver (")
stringBuffer!!.append(jdbcDriver)
stringBuffer!!.append(
                            ") you have provided is not valid.<br/>")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun getInvalidInfo()
        //nullable = true from not(false or (false and true)) = true
: String{
    var isValid: Boolean = true


    var isJdbcDriversValid: Boolean = true


    var stringBuffer: StringMaker = StringMaker()


    
                        if(!this.isJdbcDriverValid(this.adminJdbcDriver))
                        
                                    {
                                    isJdbcDriversValid= false
stringBuffer!!.append(this.getJdbcDriverValidationInfo(this.getAdminJdbcDriver()))

                                    }
                                

    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!
            


    
                        if(!stringValidationUtil!!.isValidRequired(adminDbUserName, MIN, MAX))
                        
                                    {
                                    stringBuffer!!.append("Admin username should be < " +MAX +" and > " +MIN +" characters in length.<br />")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(adminDbPassword, MINPASSWORD, MAX))
                        
                                    {
                                    stringBuffer!!.append("Admin password should be < " +MAX +" and > " +MINPASSWORD +" characters in length.<br />")

                                    }
                                

    
                        if(!isJdbcDriversValid)
                        
                                    {
                                    stringBuffer!!.append(InitializerData.getInstance()!!.getJdbcDriverSolutionInfo())

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun createUsers()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            initDb!!.addUsers()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
} catch(e: Exception)
            {logUtil!!.put(
                            "Unable to Create Users", this, 
                            "createUsers()", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


open fun createDatabases()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            initDb!!.addDatabases()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
} catch(e: Exception)
            {logUtil!!.put(
                            "Unable to Create Databases", this, 
                            "createDatabases()", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


open fun createTables()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            initDb!!.addTables()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
} catch(e: Exception)
            {logUtil!!.put(
                            "Unable to Create Tables", this, 
                            "createTables()", e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


open fun getAdminDbUserName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return adminDbUserName
}


open fun setAdminDbUserName(adminDbUserName: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var adminDbUserName = adminDbUserName
this.adminDbUserName= adminDbUserName
}


open fun getAdminDbPassword()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return adminDbPassword
}


open fun setAdminDbPassword(adminDbPassword: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var adminDbPassword = adminDbPassword
this.adminDbPassword= adminDbPassword
}


open fun getAdminJdbcDriver()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return adminJdbcDriver
}


open fun setAdminJdbcDriver(adminJdbcDriver: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var adminJdbcDriver = adminJdbcDriver
this.adminJdbcDriver= adminJdbcDriver
}


open fun getAdminSchema()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return adminSchema
}


open fun setAdminSchema(adminSchema: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var adminSchema = adminSchema
this.adminSchema= adminSchema
}


open fun getAdminServer()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return adminServer
}


open fun setAdminServer(adminServer: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var adminServer = adminServer
this.adminServer= adminServer
}


open fun getAdminPort()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return adminPort
}


open fun setAdminPort(adminPort: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var adminPort = adminPort
this.adminPort= adminPort
}


}
                
            

