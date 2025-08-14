
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

open public class SingleSensorGameUpdateProcessor : SensorGameUpdateProcessor {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val accelerometerSensorUpdateProcessor: Processor = AccelerometerSensorUpdateProcessor()

    private val gyroSensorUpdateProcessor: Processor = GyroSensorUpdateProcessor()

                @Throws(Exception::class)
            
open fun process(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
{

                    var anyType = anyType
this.setNoSensors()
}


                @Throws(Exception::class)
            
open fun sendNotifications(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
{

                    var anyType = anyType
}


}
                
            

