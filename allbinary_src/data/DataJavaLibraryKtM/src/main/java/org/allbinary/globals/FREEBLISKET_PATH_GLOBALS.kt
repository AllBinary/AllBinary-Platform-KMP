
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
        package org.allbinary.globals




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.string.StringMaker

open public class FREEBLISKET_PATH_GLOBALS
            : Object
         {
        

        companion object {
            
    private val instance: FREEBLISKET_PATH_GLOBALS = FREEBLISKET_PATH_GLOBALS()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: FREEBLISKET_PATH_GLOBALS{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val INSTALLPATH: String

    val XSLPATH: String

    val TEMPLATEPATH: String = "template" +AbPathData.getInstance()!!.SEPARATOR

    val STYLEPATH: String = TEMPLATEPATH +"style" +AbPathData.getInstance()!!.SEPARATOR

    val THEMEPATH: String = STYLEPATH +"theme" +AbPathData.getInstance()!!.SEPARATOR

    val DBINITPATH: String = PATH_GLOBALS.getInstance()!!.INIT_PATH +"db" +AbPathData.getInstance()!!.SEPARATOR

    val LINEDATAPATH: String = PATH_GLOBALS.getInstance()!!.INIT_PATH +"lineData" +AbPathData.getInstance()!!.SEPARATOR

    val CONFIGURATIONPATH: String

    val USERCONFIGURATIONPATH: String

    val CONTEXTCONFIGURATIONPATH: String

    val LICENSEERRORPAGE: String = "LicensingError.jsp"

    val ERRORPAGE: String = "Error.jsp"
private constructor        ()
            : super()
        {
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("install")
stringBuffer!!.append(AbPathData.getInstance()!!.SEPARATOR)
this.INSTALLPATH= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(PATH_GLOBALS.getInstance()!!.INIT_PATH)
stringBuffer!!.append("views")
stringBuffer!!.append(AbPathData.getInstance()!!.SEPARATOR)
this.XSLPATH= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(XSLPATH)
stringBuffer!!.append("configuration")
stringBuffer!!.append(AbPathData.getInstance()!!.SEPARATOR)
this.CONFIGURATIONPATH= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(CONFIGURATIONPATH)
stringBuffer!!.append("user")
stringBuffer!!.append(AbPathData.getInstance()!!.SEPARATOR)
this.USERCONFIGURATIONPATH= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(CONFIGURATIONPATH)
stringBuffer!!.append("context")
stringBuffer!!.append(AbPathData.getInstance()!!.SEPARATOR)
this.CONTEXTCONFIGURATIONPATH= stringBuffer!!.toString()
stringBuffer!!.delete(0, stringBuffer!!.length())
}


}
                
            

