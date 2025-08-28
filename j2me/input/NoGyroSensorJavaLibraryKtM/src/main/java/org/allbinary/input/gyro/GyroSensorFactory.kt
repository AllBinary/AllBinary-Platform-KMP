
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
        

open public class GyroSensorFactory
            : Object
         {
        

        companion object {
            
    private var allBinaryGyroSensor: AllBinaryOrientationSensor = AllBinaryOrientationSensor.NULL_ALLBINARY_ORIENTATION_SENSOR

                @Throws(Exception::class)
            
open fun init()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
GyroSensorFactory.allBinaryGyroSensor= NoGyroSensor()
}


open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AllBinaryOrientationSensor

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GyroSensorFactory.allBinaryGyroSensor
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

