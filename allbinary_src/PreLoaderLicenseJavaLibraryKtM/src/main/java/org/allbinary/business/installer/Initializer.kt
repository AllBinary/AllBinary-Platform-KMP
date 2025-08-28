
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Map
import java.util.Set
import org.allbinary.business.init.db.HistoryDbInitInfo
import org.allbinary.business.init.db.InventoryDbInitInfo
import org.allbinary.business.init.db.LogDbInitInfo
import org.allbinary.business.init.db.StaticPagesDbInitInfo
import org.allbinary.business.init.db.UserDbInitInfo
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.string.CommonStrings

open public class Initializer
            : Object
         {
        

        companion object {
            
    private val MAXDB: Int = 30

    private val MAX: Int = 16

    private val MIN: Int = 4

    private val MINPASSWORD: Int = 0

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var userJdbcDriver: String

    private var userName: String

    private var userUserName: String

    private var userPassword: String

    private var userSchema: String

    private var userServer: String

    private var userPort: String

    private var historyJdbcDriver: String

    private var historyName: String

    private var historyUserName: String

    private var historyPassword: String

    private var historySchema: String

    private var historyServer: String

    private var historyPort: String

    private var logJdbcDriver: String

    private var logName: String

    private var logUserName: String

    private var logPassword: String

    private var logSchema: String

    private var logServer: String

    private var logPort: String

    private var inventoryJdbcDriver: String

    private var inventoryName: String

    private var inventoryUserName: String

    private var inventoryPassword: String

    private var inventorySchema: String

    private var inventoryServer: String

    private var inventoryPort: String

    private var staticPagesJdbcDriver: String

    private var staticPagesName: String

    private var staticPagesUserName: String

    private var staticPagesPassword: String

    private var staticPagesSchema: String

    private var staticPagesServer: String

    private var staticPagesPort: String
public constructor        (map: Map)
            : super()
        

        Updates for KMP build        
        {
var map = map

    var stringBuffer: StringMaker = StringMaker()


    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()


    var keys: Set = map.keySet()!!


    var keyArray: Array<Any?> = keys.toArray()!!


    var size: Int = keyArray!!.size
                





                        for (index in 0 until size)

        

        Updates for KMP build        
        {

    var key: String = keyArray[index]!! as String


    var values: Array<String?> = map.get(key) as Array<String?>

hashMap!!.put(key.toCharArray().concatToString(), .toCharArray())
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append("key: ")
stringBuffer!!.append(key)
stringBuffer!!.append(" Value: ")
stringBuffer!!.append(values[0]!!)
logUtil!!.put(stringBuffer!!.toString(), this, "getFormData()")
}

this.getFormData(hashMap)
}

public constructor        (initHashMap: HashMap<Any, Any>)
            : super()
        

        Updates for KMP build        
        {
var initHashMap = initHashMap
this.getFormData(initHashMap)
}


open fun getFormData(hashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var hashMap = hashMap

        try {
            
    var initializerData: InitializerData = InitializerData.getInstance()!!

userJdbcDriver= hashMap!!.get(initializerData!!.CUSTOMERJDBCDRIVER) as String
userName= hashMap!!.get(initializerData!!.CUSTOMERNAME) as String
userUserName= hashMap!!.get(initializerData!!.CUSTOMERUSERNAME) as String
userPassword= hashMap!!.get(initializerData!!.CUSTOMERPASSWORD) as String
userSchema= hashMap!!.get(initializerData!!.CUSTOMERSCHEMA) as String
userServer= hashMap!!.get(initializerData!!.CUSTOMERSERVER) as String
userPort= hashMap!!.get(initializerData!!.CUSTOMERPORT) as String
historyJdbcDriver= hashMap!!.get(initializerData!!.HISTORYJDBCDRIVER) as String
historyName= hashMap!!.get(initializerData!!.HISTORYNAME) as String
historyUserName= hashMap!!.get(initializerData!!.HISTORYUSERNAME) as String
historyPassword= hashMap!!.get(initializerData!!.HISTORYPASSWORD) as String
historySchema= hashMap!!.get(initializerData!!.HISTORYSCHEMA) as String
historyServer= hashMap!!.get(initializerData!!.HISTORYSERVER) as String
historyPort= hashMap!!.get(initializerData!!.HISTORYPORT) as String
logJdbcDriver= hashMap!!.get(initializerData!!.LOGJDBCDRIVER) as String
logName= hashMap!!.get(initializerData!!.LOGNAME) as String
logUserName= hashMap!!.get(initializerData!!.LOGUSERNAME) as String
logPassword= hashMap!!.get(initializerData!!.LOGPASSWORD) as String
logSchema= hashMap!!.get(initializerData!!.LOGSCHEMA) as String
logServer= hashMap!!.get(initializerData!!.LOGSERVER) as String
logPort= hashMap!!.get(initializerData!!.LOGPORT) as String
inventoryJdbcDriver= hashMap!!.get(initializerData!!.INVENTORYJDBCDRIVER) as String
inventoryName= hashMap!!.get(initializerData!!.INVENTORYNAME) as String
inventoryUserName= hashMap!!.get(initializerData!!.INVENTORYUSERNAME) as String
inventoryPassword= hashMap!!.get(initializerData!!.INVENTORYPASSWORD) as String
inventorySchema= hashMap!!.get(initializerData!!.INVENTORYSCHEMA) as String
inventoryServer= hashMap!!.get(initializerData!!.INVENTORYSERVER) as String
inventoryPort= hashMap!!.get(initializerData!!.INVENTORYPORT) as String
staticPagesJdbcDriver= hashMap!!.get(initializerData!!.STATICPAGESJDBCDRIVER) as String
staticPagesName= hashMap!!.get(initializerData!!.STATICPAGESNAME) as String
staticPagesUserName= hashMap!!.get(initializerData!!.STATICPAGESUSERNAME) as String
staticPagesPassword= hashMap!!.get(initializerData!!.STATICPAGESPASSWORD) as String
staticPagesSchema= hashMap!!.get(initializerData!!.STATICPAGESSCHEMA) as String
staticPagesServer= hashMap!!.get(initializerData!!.STATICPAGESSERVER) as String
staticPagesPort= hashMap!!.get(initializerData!!.STATICPAGESPORT) as String
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put("Unable to get form data", this, "getFormData()", e)
}

}


open fun isJdbcDriverValid(jdbcDriverClassPathString: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
var jdbcDriverClassPathString = jdbcDriverClassPathString

        try {
            Class.forName(jdbcDriverClassPathString)!!.newInstance()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
} catch(e: Exception)
            

        Updates for KMP build        
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
: Boolean

        Updates for KMP build        
        {

    var isValid: Boolean = true


    
                        if(!this.isJdbcDriverValid(this.userJdbcDriver))
                        
                                    {
                                    isValid= false

                                    }
                                

    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!


    
                        if(!stringValidationUtil!!.isValidRequired(userName, MIN, MAXDB))
                        
                                    {
                                    isValid= false

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(userUserName, MIN, MAX))
                        
                                    {
                                    isValid= false

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(userPassword, MINPASSWORD, MAX))
                        
                                    {
                                    isValid= false

                                    }
                                

    
                        if(!this.isJdbcDriverValid(this.historyJdbcDriver))
                        
                                    {
                                    isValid= false

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(historyName, MIN, MAXDB))
                        
                                    {
                                    isValid= false

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(historyUserName, MIN, MAX))
                        
                                    {
                                    isValid= false

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(historyPassword, MINPASSWORD, MAX))
                        
                                    {
                                    isValid= false

                                    }
                                

    
                        if(!this.isJdbcDriverValid(this.logJdbcDriver))
                        
                                    {
                                    isValid= false

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(this.logName, MIN, MAXDB))
                        
                                    {
                                    isValid= false

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(this.logUserName, MIN, MAX))
                        
                                    {
                                    isValid= false

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.logPassword, MINPASSWORD, MAX))
                        
                                    {
                                    isValid= false

                                    }
                                

    
                        if(!this.isJdbcDriverValid(this.inventoryJdbcDriver))
                        
                                    {
                                    isValid= false

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(inventoryName, MIN, MAXDB))
                        
                                    {
                                    isValid= false

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(inventoryUserName, MIN, MAX))
                        
                                    {
                                    isValid= false

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(inventoryPassword, MINPASSWORD, MAX))
                        
                                    {
                                    isValid= false

                                    }
                                

    
                        if(!this.isJdbcDriverValid(this.staticPagesJdbcDriver))
                        
                                    {
                                    isValid= false

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(staticPagesName, MIN, MAXDB))
                        
                                    {
                                    isValid= false

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(staticPagesUserName, MIN, MAX))
                        
                                    {
                                    isValid= false

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(staticPagesPassword, MINPASSWORD, MAX))
                        
                                    {
                                    isValid= false

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return isValid
}


open fun getJdbcDriverValidationInfo(jdbcDriver: String)
        //nullable = true from not(false or (false and false)) = true
: String

        Updates for KMP build        
        {
var jdbcDriver = jdbcDriver

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("The JDBC driver (")
stringBuffer!!.append(jdbcDriver)
stringBuffer!!.append(") you have provided is not valid.<br/>")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun getJdbcDriverSolutionInfo()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("The following describes the possible problems and solutions regarding the Jdbc Driver error(s):<p/>")
stringBuffer!!.append("1. A JDBC driver you specified is not in your classpath.<br/>")
stringBuffer!!.append("Solution 1: Move the JDBC driver into any directory specified in the existing classpath. <br/>")
stringBuffer!!.append("Solution 2: Add the directory that contains the JDBC driver to the classpath.<br/>")
stringBuffer!!.append("Solution 3: Add the JDBC driver to the WEB-INF/lib directory where you installed this webapp.<br/>")
stringBuffer!!.append("2. The JDBC driver you specified does not exit.<br/>")
stringBuffer!!.append("Solution: Get a JDBC driver. <br/>")
stringBuffer!!.append("3. The JDBC driver you specified is not valid.<br/>")
stringBuffer!!.append("Solution: Use a valid JDBC driver.<p/>")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun getInvalidInfo()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

    var isJdbcDriversValid: Boolean = true


    var stringBuffer: StringMaker = StringMaker()


    
                        if(!this.isJdbcDriverValid(this.userJdbcDriver))
                        
                                    {
                                    isJdbcDriversValid= false
stringBuffer!!.append(this.getJdbcDriverValidationInfo(this.userJdbcDriver))

                                    }
                                

    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!


    
                        if(!stringValidationUtil!!.isValidRequired(userName, MIN, MAXDB))
                        
                                    {
                                    stringBuffer!!.append("User db name should be < " +MAXDB +" and > " +MIN +" characters in length.<br />")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(userUserName, MIN, MAX))
                        
                                    {
                                    stringBuffer!!.append("User db username should be < " +MAX +" and > " +MIN +" characters in length.<br />")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(userPassword, MINPASSWORD, MAX))
                        
                                    {
                                    stringBuffer!!.append("User DB password should be < " +MAX +" and > " +MINPASSWORD +" characters in length.<br />")

                                    }
                                

    
                        if(!this.isJdbcDriverValid(this.historyJdbcDriver))
                        
                                    {
                                    isJdbcDriversValid= false
stringBuffer!!.append(this.getJdbcDriverValidationInfo(this.historyJdbcDriver))

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(historyName, MIN, MAXDB))
                        
                                    {
                                    stringBuffer!!.append("History db should be < " +MAXDB +" and > " +MIN +" characters in length.<br />")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(historyUserName, MIN, MAX))
                        
                                    {
                                    stringBuffer!!.append("History db username should be < " +MAX +" and > " +MIN +" characters in length.<br />")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(historyPassword, MINPASSWORD, MAX))
                        
                                    {
                                    stringBuffer!!.append("History db password should be < " +MAX +" and > " +MINPASSWORD +" characters in length.<br />")

                                    }
                                

    
                        if(!this.isJdbcDriverValid(this.logJdbcDriver))
                        
                                    {
                                    isJdbcDriversValid= false
stringBuffer!!.append(this.getJdbcDriverValidationInfo(this.logJdbcDriver))

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(this.logName, MIN, MAXDB))
                        
                                    {
                                    stringBuffer!!.append("Log db should be < " +MAXDB +" and > " +MIN +" characters in length.<br />")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(this.logUserName, MIN, MAX))
                        
                                    {
                                    stringBuffer!!.append("Log db username should be < " +MAX +" and > " +MIN +" characters in length.<br />")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(this.logPassword, MINPASSWORD, MAX))
                        
                                    {
                                    stringBuffer!!.append("Log db password should be < " +MAX +" and > " +MINPASSWORD +" characters in length.<br />")

                                    }
                                

    
                        if(!this.isJdbcDriverValid(this.inventoryJdbcDriver))
                        
                                    {
                                    isJdbcDriversValid= false
stringBuffer!!.append(this.getJdbcDriverValidationInfo(this.inventoryJdbcDriver))

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(inventoryName, MIN, MAXDB))
                        
                                    {
                                    stringBuffer!!.append("Inventory db should be < " +MAXDB +" and > " +MIN +" characters in length.<br />")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(inventoryUserName, MIN, MAX))
                        
                                    {
                                    stringBuffer!!.append("Inventory db username should be < " +MAX +" and > " +MIN +" characters in length.<br />")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(inventoryPassword, MINPASSWORD, MAX))
                        
                                    {
                                    stringBuffer!!.append("Inventory DB password should be < " +MAX +" and > " +MINPASSWORD +" characters in length.<br />")

                                    }
                                

    
                        if(!this.isJdbcDriverValid(this.staticPagesJdbcDriver))
                        
                                    {
                                    isJdbcDriversValid= false
stringBuffer!!.append(this.getJdbcDriverValidationInfo(this.staticPagesJdbcDriver))

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(staticPagesName, MIN, MAXDB))
                        
                                    {
                                    stringBuffer!!.append("Static Pages db should be < " +MAXDB +" and > " +MIN +" characters in length.<br />")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidRequired(staticPagesUserName, MIN, MAX))
                        
                                    {
                                    stringBuffer!!.append("Static Pages db username should be < " +MAX +" and > " +MIN +" characters in length.<br />")

                                    }
                                

    
                        if(!stringValidationUtil!!.isValidNotRequired(staticPagesPassword, MINPASSWORD, MAX))
                        
                                    {
                                    stringBuffer!!.append("Static Pages DB password should be < " +MAX +" and > " +MINPASSWORD +" characters in length.<br />")

                                    }
                                

    
                        if(!isJdbcDriversValid)
                        
                                    {
                                    stringBuffer!!.append(getJdbcDriverSolutionInfo())

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


                @Throws(Exception::class)
            
open fun set()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
logUtil!!.put("Creating DB connection files", this, "set()")

    var userDbInitInfo: UserDbInitInfo = UserDbInitInfo(false)

userDbInitInfo!!.setJdbcDriver(this.userJdbcDriver)
userDbInitInfo!!.setName(userName)
userDbInitInfo!!.setUserName(userUserName)
userDbInitInfo!!.setPassword(userPassword)
userDbInitInfo!!.setSchema(userSchema)
userDbInitInfo!!.setServer(userServer)
userDbInitInfo!!.setPort(userPort)
userDbInitInfo!!.setHasRead(true)
userDbInitInfo!!.write()

    var historyDbInitInfo: HistoryDbInitInfo = HistoryDbInitInfo(false)

historyDbInitInfo!!.setJdbcDriver(this.historyJdbcDriver)
historyDbInitInfo!!.setName(historyName)
historyDbInitInfo!!.setUserName(historyUserName)
historyDbInitInfo!!.setPassword(historyPassword)
historyDbInitInfo!!.setSchema(historySchema)
historyDbInitInfo!!.setServer(historyServer)
historyDbInitInfo!!.setPort(historyPort)
historyDbInitInfo!!.setHasRead(true)
historyDbInitInfo!!.write()

    var logDbInitInfo: LogDbInitInfo = LogDbInitInfo(false)

logDbInitInfo!!.setJdbcDriver(this.logJdbcDriver)
logDbInitInfo!!.setName(this.logName)
logDbInitInfo!!.setUserName(this.logUserName)
logDbInitInfo!!.setPassword(this.logPassword)
logDbInitInfo!!.setSchema(this.logSchema)
logDbInitInfo!!.setServer(this.logServer)
logDbInitInfo!!.setPort(this.logPort)
logDbInitInfo!!.setHasRead(true)
logDbInitInfo!!.write()

    var staticPagesDbInitInfo: StaticPagesDbInitInfo = StaticPagesDbInitInfo(false)

staticPagesDbInitInfo!!.setJdbcDriver(this.staticPagesJdbcDriver)
staticPagesDbInitInfo!!.setName(staticPagesName)
staticPagesDbInitInfo!!.setUserName(staticPagesUserName)
staticPagesDbInitInfo!!.setPassword(staticPagesPassword)
staticPagesDbInitInfo!!.setSchema(staticPagesSchema)
staticPagesDbInitInfo!!.setServer(staticPagesServer)
staticPagesDbInitInfo!!.setPort(staticPagesPort)
staticPagesDbInitInfo!!.setHasRead(true)
staticPagesDbInitInfo!!.write()

    var inventoryDbInitInfo: InventoryDbInitInfo = InventoryDbInitInfo(false)

inventoryDbInitInfo!!.setJdbcDriver(this.inventoryJdbcDriver)
inventoryDbInitInfo!!.setName(inventoryName)
inventoryDbInitInfo!!.setUserName(inventoryUserName)
inventoryDbInitInfo!!.setPassword(inventoryPassword)
inventoryDbInitInfo!!.setSchema(inventorySchema)
inventoryDbInitInfo!!.setServer(inventoryServer)
inventoryDbInitInfo!!.setPort(inventoryPort)
inventoryDbInitInfo!!.setHasRead(true)
inventoryDbInitInfo!!.write()
logUtil!!.put("Created DB connection files", this, "set()")
}


}
                
            

