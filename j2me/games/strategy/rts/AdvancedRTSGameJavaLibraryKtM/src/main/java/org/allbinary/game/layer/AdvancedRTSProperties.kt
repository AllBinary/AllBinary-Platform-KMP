
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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
        package org.allbinary.game.layer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.animation.transition.shake.NoShakeAnimationListener
import org.allbinary.animation.transition.shake.ShakeAnimationListener
import org.allbinary.animation.transition.shake.ShakeAnimationListenerFactory
import org.allbinary.game.configuration.GameConfigurationCentral
import org.allbinary.game.tick.TickableInterface
import org.allbinary.media.AllBinaryNoVibration
import org.allbinary.media.AllBinaryVibration
import org.allbinary.media.AllBinaryVibrationME

open public class AdvancedRTSProperties
            : Object
         {
        
companion object {
            
    open fun createPropertiesSimulated()
        //nullable = true from not(false or (false and true)) = true
: AdvancedRTSProperties{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AdvancedRTSProperties(NoShakeAnimationListener.NO_SHAKE_ANIMATION_LISTENER, AllBinaryNoVibration.NO_VIBRATION, 0, WaypointBehaviorBase())
}


    open fun createProperties()
        //nullable = true from not(false or (false and true)) = true
: AdvancedRTSProperties{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AdvancedRTSProperties(ShakeAnimationListenerFactory.getInstance(), AllBinaryVibration.getInstance(), GameConfigurationCentral.getInstance()!!.VIBRATION.getValue()!!.toInt() *100, WaypointBehaviorBase())
}


        }
            
    val shakeListener: ShakeAnimationListener

    val vibration: AllBinaryVibrationME

    val duration: Int

    var waypointBehaviorBase: TickableInterface
public constructor (shakeListener: ShakeAnimationListener, vibration: AllBinaryVibrationME, duration: Int, waypointBehaviorBase: TickableInterface)
            : super()
        {
    //var shakeListener = shakeListener
    //var vibration = vibration
    //var duration = duration
    //var waypointBehaviorBase = waypointBehaviorBase
this.shakeListener= shakeListener
this.vibration= vibration
this.duration= duration
this.waypointBehaviorBase= waypointBehaviorBase
}


}
                
            

