
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
        package org.allbinary.game.configuration.feature




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class SensorFeatureFactory
            : Object
         {
        
companion object {
            
    private val instance: SensorFeatureFactory = SensorFeatureFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: SensorFeatureFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor ()
            : super()
        {
}


    val NO_ORIENTATION: SensorFeature = SensorFeature("No Orientation")

    val ORIENTATION_SENSORS: SensorFeature = SensorFeature("Orientation Sensors")

    val SIMULATED_ORIENTATION_SENSORS: SensorFeature = SensorFeature("Simulated Orientation Sensors")

    val YAW: SensorFeature = SensorFeature("Yaw")

    val YAW_MINUS_RIGHT_PLUS_LEFT: SensorFeature = SensorFeature("Yaw -Right +Left")

    val YAW_MINUS_LEFT_PLUS_RIGHT: SensorFeature = SensorFeature("Yaw -Left +Right ")

    val PITCH: SensorFeature = SensorFeature("Pitch")

    val ROLL: SensorFeature = SensorFeature("Roll")

}
                
            

