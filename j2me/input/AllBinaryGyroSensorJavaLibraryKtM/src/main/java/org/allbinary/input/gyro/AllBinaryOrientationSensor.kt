
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
        package org.allbinary.input.gyro




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.CompleteMotionGestureInputEventListenerInterface
import org.allbinary.game.input.motion.action.NoCompleteMotionGestureInputEventListener
import org.allbinary.input.AllBinarySensor
import org.allbinary.logic.math.Orientation
import org.allbinary.logic.math.PrimitiveFloatUtil

open public class AllBinaryOrientationSensor : AllBinarySensor {
        

    var sensorDataFloatArray: FloatArray = PrimitiveFloatUtil.getArrayInstance()!!

    var listener: CompleteMotionGestureInputEventListenerInterface = NoCompleteMotionGestureInputEventListener.getInstance()!!

open fun setCompleteMotionGestureInputEventListener(completeMotionGestureInputEventListenerInterface: CompleteMotionGestureInputEventListenerInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var completeMotionGestureInputEventListenerInterface = completeMotionGestureInputEventListenerInterface
this.listener= completeMotionGestureInputEventListenerInterface
}

protected constructor        ()

        Updates for KMP build        
        {
}


                @Throws(Exception::class)
            
open fun getOrientation()
        //nullable = true from not(false or (false and true)) = true
: Orientation

        Updates for KMP build        
        {



                            throw Exception(commonStrings!!.NOT_IMPLEMENTED)
}


}
                
            

