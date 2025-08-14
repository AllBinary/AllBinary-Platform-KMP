
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
        package org.allbinary.servlet




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.servlet.http.HttpServletRequest
import org.allbinary.globals.AppUrlGlobals
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.system.loader.WebappClassLoaderInfo

open public class BlisketServletUtil
            : Object
         {
        

        companion object {
            
    private val instance: BlisketServletUtil = BlisketServletUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BlisketServletUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun init(request: HttpServletRequest)
        //nullable = true from not(false or (false and false)) = true
{

                    var request = request

    var urlGlobals: AppUrlGlobals = AppUrlGlobals()

urlGlobals!!.setWebappPath(request.getServletContext()!!.getRealPath(AbPathData.getInstance()!!.SEPARATOR))
URLGLOBALS.init(urlGlobals)
WebappClassLoaderInfo.setLoader(::class.java.classLoader)
}


}
                
            

