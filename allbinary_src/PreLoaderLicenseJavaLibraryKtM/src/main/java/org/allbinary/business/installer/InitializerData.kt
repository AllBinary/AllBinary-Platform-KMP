
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
        
import org.allbinary.logic.string.StringMaker

open public class InitializerData
            : Object
         {
        

        companion object {
            
    private val instance: InitializerData = InitializerData()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: InitializerData

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val DBUSER: String = "DBUSER"

    val DBPASSWORD: String = "DBPASSWORD"

    val ADMINJDBCDRIVER: String = "ADMIN_JDBCDRIVER"

    val ADMINSCHEMA: String = "ADMINSCHEMA"

    val ADMINSERVER: String = "ADMINSERVER"

    val ADMINPORT: String = "ADMINPORT"

    val CUSTOMERJDBCDRIVER: String = "CUSTOMER_JDBCDRIVER"

    val CUSTOMERNAME: String = "CUSTOMERNAME"

    val CUSTOMERUSERNAME: String = "CUSTOMERUSERNAME"

    val CUSTOMERPASSWORD: String = "CUSTOMERPASSWORD"

    val CUSTOMERSCHEMA: String = "CUSTOMERSCHEMA"

    val CUSTOMERSERVER: String = "CUSTOMERSERVER"

    val CUSTOMERPORT: String = "CUSTOMERPORT"

    val HISTORYJDBCDRIVER: String = "HISTORY_JDBCDRIVER"

    val HISTORYNAME: String = "HISTORYNAME"

    val HISTORYUSERNAME: String = "HISTORYUSERNAME"

    val HISTORYPASSWORD: String = "HISTORYPASSWORD"

    val HISTORYSCHEMA: String = "HISTORYSCHEMA"

    val HISTORYSERVER: String = "HISTORYSERVER"

    val HISTORYPORT: String = "HISTORYPORT"

    val LOGJDBCDRIVER: String = "LOG_JDBCDRIVER"

    val LOGNAME: String = "LOGNAME"

    val LOGUSERNAME: String = "LOGUSERNAME"

    val LOGPASSWORD: String = "LOGPASSWORD"

    val LOGSCHEMA: String = "LOGSCHEMA"

    val LOGSERVER: String = "LOGSERVER"

    val LOGPORT: String = "LOGPORT"

    val INVENTORYJDBCDRIVER: String = "INVENTORY_JDBCDRIVER"

    val INVENTORYNAME: String = "INVENTORYNAME"

    val INVENTORYUSERNAME: String = "INVENTORYUSERNAME"

    val INVENTORYPASSWORD: String = "INVENTORYPASSWORD"

    val INVENTORYSCHEMA: String = "INVENTORYSCHEMA"

    val INVENTORYSERVER: String = "INVENTORYSERVER"

    val INVENTORYPORT: String = "INVENTORYPORT"

    val STATICPAGESJDBCDRIVER: String = "STATICPAGES_JDBCDRIVER"

    val STATICPAGESNAME: String = "STATICPAGESNAME"

    val STATICPAGESUSERNAME: String = "STATICPAGESUSERNAME"

    val STATICPAGESPASSWORD: String = "STATICPAGESPASSWORD"

    val STATICPAGESSCHEMA: String = "STATICPAGESSCHEMA"

    val STATICPAGESSERVER: String = "STATICPAGESSERVER"

    val STATICPAGESPORT: String = "STATICPAGESPORT"

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


}
                
            

