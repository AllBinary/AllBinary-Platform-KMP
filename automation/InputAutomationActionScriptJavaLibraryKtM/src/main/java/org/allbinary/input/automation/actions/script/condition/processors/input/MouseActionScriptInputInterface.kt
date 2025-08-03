
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
        
import java.awt
interface MouseActionScriptInputInterface : ProfileActionScriptInputInterface {
        

open fun setPoint(point: Point)
        //nullable = true from not(false or (false and false)) = true


open fun getPoint()
        //nullable = true from not(false or (false and true)) = true
: Point

open fun getButtonClicks()
        //nullable = true from not(false or (false and true)) = true
: Int

open fun setButtonClicks(buttons: Int)
        //nullable = true from not(false or (false and false)) = true


open fun log()
        //nullable = true from not(false or (false and true)) = true


}
                
            

