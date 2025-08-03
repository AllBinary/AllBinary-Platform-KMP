
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
        package org.allbinary.input.automation.actions.script.condition.processors.input



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
interface KeyboardActionScriptInputInterface : ProfileActionScriptInputInterface {
        

open fun getDelayBetweenKeys()
        //nullable = true from not(false or (false and true)) = true
: Int

open fun getKeyArray()
        //nullable = true from not(false or (false and true)) = true
: Array<Integer?>

open fun isPress()
        //nullable = true from not(false or (false and true)) = true
: Boolean

open fun isRelease()
        //nullable = true from not(false or (false and true)) = true
: Boolean

open fun isNormal()
        //nullable = true from not(false or (false and true)) = true
: Boolean

open fun setPress(press: Boolean)
        //nullable = true from not(false or (false and false)) = true


open fun setRelease(release: Boolean)
        //nullable = true from not(false or (false and false)) = true


open fun setNormal()
        //nullable = true from not(false or (false and true)) = true


open fun getText()
        //nullable = true from not(false or (false and true)) = true
: String

open fun setText(text: String)
        //nullable = true from not(false or (false and false)) = true


open fun log()
        //nullable = true from not(false or (false and true)) = true


}
                
            

