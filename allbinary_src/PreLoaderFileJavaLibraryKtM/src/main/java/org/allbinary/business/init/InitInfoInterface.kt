
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
        package org.allbinary.business.init



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.io.path.AbPath
interface InitInfoInterface {
        

open fun isTesting()
        //nullable = true from not(false or (false and true)) = true
: Boolean

open fun getTesting()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getTestHtmlPath()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getMainPath()
        //nullable = true from not(false or (false and true)) = true
: String

open fun setTesting(value: String)
        //nullable = true from not(false or (false and false)) = true


open fun setTestHtmlPath(value: AbPath)
        //nullable = true from not(false or (false and false)) = true


open fun setMainPath(value: AbPath)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
open fun isTestingValid(testing: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean

open fun isTestHtmlPathValid(value: AbPath)
        //nullable = true from not(false or (false and false)) = true
: Boolean

open fun isMainPathValid(value: AbPath)
        //nullable = true from not(false or (false and false)) = true
: Boolean

}
                
            

