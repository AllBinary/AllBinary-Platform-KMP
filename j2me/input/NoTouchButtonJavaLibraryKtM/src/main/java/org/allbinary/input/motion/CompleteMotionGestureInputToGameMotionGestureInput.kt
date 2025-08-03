
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
        package org.allbinary.input.motion



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.string.CommonStrings

open public class CompleteMotionGestureInputToGameMotionGestureInput
            : Object
         {
        

        companion object {


    private val instance: CompleteMotionGestureInputToGameMotionGestureInput = CompleteMotionGestureInputToGameMotionGestureInput()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CompleteMotionGestureInputToGameMotionGestureInput{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

open fun init()
        //nullable = true from not(false or (false and true)) = true
{PreLogUtil.put(
                            "No Touch Button = No Compound Motion Gestures", this, this.commonStrings!!.INIT)
}


}
                
            

