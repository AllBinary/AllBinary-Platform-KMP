
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
        package org.allbinary.input.accelerometer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.SensorFeatureFactory
import org.allbinary.input.gyro.AllBinaryOrientationSensor

open public class AccelerometerSensorFactory
            : Object
         {
        

        companion object {
            
    private var allBinaryAccelerometerSensor: AllBinaryOrientationSensor = AllBinaryOrientationSensor.NULL_ALLBINARY_ORIENTATION_SENSOR

                @Throws(Exception::class)
            
open fun init()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    var features: Features = Features.getInstance()!!


    var sensorFeatureFactory: SensorFeatureFactory = SensorFeatureFactory.getInstance()!!


    
                        if(features.isFeature(sensorFeatureFactory!!.ORIENTATION_SENSORS))
                        
                                    {
                                    


                            throw Exception("No Orientation Sensors")

                                    }
                                
                             else 
    
                        if(features.isFeature(sensorFeatureFactory!!.SIMULATED_ORIENTATION_SENSORS))
                        
                                    {
                                    


                            throw Exception("No Simulation Sensors")

                                    }
                                
                             else 
    
                        if(features.isFeature(sensorFeatureFactory!!.NO_ORIENTATION))
                        
                                    {
                                    allBinaryAccelerometerSensor= NoAccelerometerSensor()

                                    }
                                
                        else {
                            


                            throw Exception("Not Such SensorFeature")

                        }
                            
}


open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AllBinaryOrientationSensor

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return allBinaryAccelerometerSensor
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

