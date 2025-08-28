
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
        

open public class URLGLOBALS
            : Object
         {
        

        companion object {
            
    private var urlGlobalsInterface: UrlGlobalsInterface = AppUrlGlobals.NULL_APP_URL_GLOBALS

open fun init(urlGlobalsInterface: UrlGlobalsInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var urlGlobalsInterface = urlGlobalsInterface
URLGLOBALS.urlGlobalsInterface= urlGlobalsInterface
}


open fun isTestingMode()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return urlGlobalsInterface!!.isTestingMode()
}


open fun getWebappPath()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return urlGlobalsInterface!!.getWebappPath()
}


open fun getTestHtmlPath()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return urlGlobalsInterface!!.getTestHtmlPath()
}


                @Throws(Exception::class)
            
open fun getMainPath()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return urlGlobalsInterface!!.getMainPath()
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

