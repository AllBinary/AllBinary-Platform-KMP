
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
        package org.allbinary.media



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import android.content.Context
import android.os.Vibrator
import org.allbinary.data.resource.ResourceUtil
import org.allbinary.game.configuration.GameConfigurationCentral

open public class AllBinaryVibration : AllBinaryVibrationME {
        

        companion object {


    private var NO_VIBRATION: AllBinaryVibrationME = AllBinaryNoVibration()

    private var VIBRATION: AllBinaryVibrationME = NO_VIBRATION

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AllBinaryVibrationME{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return VIBRATION
}


open fun init()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(GameConfigurationCentral.getInstance()!!.VIBRATION.getValue()!!.toInt() == 0)
                        
                                    {
                                    VIBRATION= NO_VIBRATION

                                    }
                                
                        else {
                            VIBRATION= AllBinaryVibration()

                        }
                            
}



        }
            
    private val vibrator: Vibrator = ResourceUtil.getInstance()!!.getContext()!!.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
protected constructor        (){}


open fun vibrate(duration: Int, type: Int, volume: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var duration = duration


                    var type = type


                    var volume = volume
vibrator!!.vibrate(duration)
}


}
                
            

