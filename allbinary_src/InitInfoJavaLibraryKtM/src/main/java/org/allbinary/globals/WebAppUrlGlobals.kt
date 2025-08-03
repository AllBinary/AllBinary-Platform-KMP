
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
        
import org.allbinary.business.init.InitInfo
import org.allbinary.logic.string.StringValidationUtil

open public class WebAppUrlGlobals : UrlGlobalsInterface {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private var path: String

    private var isWebappPathSet: Boolean = false

open fun isTestingMode()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return InitInfo.getInstance()!!.isTesting()
}


open fun getWebappPath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return path
}


open fun setWebappPath(path: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var path = path
path= path
isWebappPathSet= true
}


open fun getTestHtmlPath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return InitInfo.getInstance()!!.getTestHtmlPath()
}


                @Throws(Exception::class)
            
open fun getMainPath()
        //nullable = true from not(false or (false and true)) = true
: String{
    var mainPath: String = InitInfo.getInstance()!!.getMainPath()!!
            


    
                        if(!StringValidationUtil.getInstance()!!.isEmpty(mainPath))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return mainPath

                                    }
                                
                             else 
    
                        if(isWebappPathSet)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return getWebappPath()

                                    }
                                
                        else {
                            


                            throw Exception(
                            "Webapp Path is not set")

                        }
                            
}


}
                
            

