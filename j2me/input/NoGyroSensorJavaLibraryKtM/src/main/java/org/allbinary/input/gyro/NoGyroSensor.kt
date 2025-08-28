
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
        
import org.allbinary.input.AllBinarySensorListener
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.math.Orientation

open public class NoGyroSensor : AllBinaryOrientationSensor
                , AllBinarySensorListener {
        
public constructor        (){
logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.CONSTRUCTOR)
}


                @Throws(Exception::class)
            override fun getOrientation()
        //nullable = true from not(false or (false and true)) = true
: Orientation{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Orientation.NONE
}

override fun onSensorChange()
        //nullable = true from not(false or (false and true)) = true
{
}


}
                
            

