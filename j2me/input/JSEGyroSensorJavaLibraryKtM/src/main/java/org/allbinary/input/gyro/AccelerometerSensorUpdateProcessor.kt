
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
        
import org.allbinary.canvas.Processor
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.SensorFeatureFactory
import org.allbinary.game.input.motion.action.NoCompleteMotionGestureInputEventListener
import org.allbinary.game.input.motion.action.SingleKeyPressGameKeyFromMotionGestureEventListener
import org.allbinary.input.accelerometer.AccelerometerSensorFactory

open public class AccelerometerSensorUpdateProcessor : Processor {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            
open fun process()
        //nullable = true from not(false or (false and true)) = true
{

    var sensorFeatureFactory: SensorFeatureFactory = SensorFeatureFactory.getInstance()!!


    
                        if(Features.getInstance()!!.isFeature(sensorFeatureFactory!!.ORIENTATION_SENSORS))
                        
                                    {
                                    AccelerometerSensorFactory.getInstance()!!.setCompleteMotionGestureInputEventListener(SingleKeyPressGameKeyFromMotionGestureEventListener())

                                    }
                                
                             else 
    
                        if(Features.getInstance()!!.isFeature(sensorFeatureFactory!!.SIMULATED_ORIENTATION_SENSORS))
                        
                                    {
                                    AccelerometerSensorFactory.getInstance()!!.setCompleteMotionGestureInputEventListener(SingleKeyPressGameKeyFromMotionGestureEventListener())

                                    }
                                
                             else 
    
                        if(Features.getInstance()!!.isFeature(sensorFeatureFactory!!.NO_ORIENTATION))
                        
                                    {
                                    AccelerometerSensorFactory.getInstance()!!.setCompleteMotionGestureInputEventListener(NoCompleteMotionGestureInputEventListener.getInstance())

                                    }
                                
                        else {
                            


                            throw Exception("Sensor Feature Not Set")

                        }
                            
}


}
                
            

