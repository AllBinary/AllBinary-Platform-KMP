
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringUtil

open public class AppUrlGlobals : UrlGlobalsInterface {
        

        companion object {
            
    val NULL_APP_URL_GLOBALS: AppUrlGlobals = AppUrlGlobals()

        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private var path: String = StringUtil.getInstance()!!.EMPTY_STRING
override fun isTestingMode()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

override fun getWebappPath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.path
}


open fun setWebappPath(path: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var path = path
this.path= path

    
                        if(!(this.path.endsWith(
                            "\\") || this.path.endsWith(
                            "/")))
                        
                                    {
                                    this.path= this.path +"\\"

                                    }
                                
}

override fun getTestHtmlPath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING
}


                @Throws(Exception::class)
            override fun getMainPath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.path
}


}
                
            

