
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
        
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.SensorFeatureFactory
import org.allbinary.logic.math.Orientation

open public class OrientationToGameKeyEvent
            : Object
         {
        

    private var allBinaryGyroSensor: AllBinaryOrientationSensor

    private val MIN: Int = 15
public constructor        ()
            : super()
        

        Updates for KMP build        
        {

    
                        if(Features.getInstance()!!.isFeature(SensorFeatureFactory.getInstance()!!.NO_ORIENTATION))
                        
                                    {
                                    allBinaryGyroSensor= NoGyroSensor()

                                    }
                                
                        else {
                            


                            throw Exception("Not Such Feature")

                        }
                            
}


open fun setAllBinaryGyroSensor(allBinaryGyroSensor: AllBinaryOrientationSensor)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var allBinaryGyroSensor = allBinaryGyroSensor
this.allBinaryGyroSensor= allBinaryGyroSensor
}


open fun getAllBinaryGyroSensor()
        //nullable = true from not(false or (false and true)) = true
: AllBinaryOrientationSensor

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return allBinaryGyroSensor
}


                @Throws(Exception::class)
            
open fun process()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


                @Throws(Exception::class)
            
open fun updateGameKeyEvents(orientation: Orientation, yaw: Int, pitch: Int, roll: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var orientation = orientation
var yaw = yaw
var pitch = pitch
var roll = roll
}


}
                
            

