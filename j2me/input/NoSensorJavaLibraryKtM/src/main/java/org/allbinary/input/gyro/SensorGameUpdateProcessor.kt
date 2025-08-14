
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
        
import org.allbinary.input.AllBinarySensor
import org.allbinary.input.NoAllBinarySensor

open public class SensorGameUpdateProcessor
            : Object
         {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private var inputSensor: AllBinarySensor = NoAllBinarySensor.getInstance()!!
            

open fun setInputSensor(inputSensor: AllBinarySensor)
        //nullable = true from not(false or (false and false)) = true
{

                    var inputSensor = inputSensor
this.inputSensor= inputSensor
}


open fun getInputSensor()
        //nullable = true from not(false or (false and true)) = true
: AllBinarySensor{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputSensor
}


                @Throws(Exception::class)
            
open fun process(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
{

                    var anyType = anyType
}


                @Throws(Exception::class)
            
open fun sendNotifications(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
{

                    var anyType = anyType
}


open fun isAnySensor()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(this.inputSensor == NoAllBinarySensor.getInstance())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                        }
                            
}


open fun setNoSensors()
        //nullable = true from not(false or (false and true)) = true
{this.setInputSensor(NoAllBinarySensor.getInstance())
}


}
                
            

