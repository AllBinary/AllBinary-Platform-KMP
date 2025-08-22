
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
        
        import java.lang.ClassLoader
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.system.loader.WebappClassLoaderInfo
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings

open public class Globals
            : Object
         {
        

        companion object {
            
    private val instance: Globals = Globals()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: Globals{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
private constructor        ()
            : super()
        {}


open fun init(classLoader: ClassLoader, pathString: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var classLoader = classLoader


                    var pathString = pathString

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


    var appUrlGlobals: AppUrlGlobals = AppUrlGlobals()

appUrlGlobals!!.setWebappPath(pathString)
URLGLOBALS.init(appUrlGlobals)
WebappClassLoaderInfo.setLoader(classLoader)

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Setting Up AllBinary System Configuration Args: ")
stringBuffer!!.append(pathString)
stringBuffer!!.append(" ClassLoader: ")
stringBuffer!!.append(classLoader!!::class.qualifiedName!!)
logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.INIT)

    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!


    
                        if(stringValidationUtil!!.isEmpty(pathString))
                        
                                    {
                                    stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append("No Path Provided. Using Process Path: ")
stringBuffer!!.append(pathString)
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(CommonSeps.getInstance()!!.EQUALS)
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(URLGLOBALS.getWebappPath())
logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.INIT)

                                    }
                                
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append("Webapp Path Set To: ")
stringBuffer!!.append(URLGLOBALS.getWebappPath())
logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.INIT)
}


}
                
            

