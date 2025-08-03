
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
        package org.allbinary.android.input.motion



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.android.input.motion.event.AnalogControllerConfigurationEvent
import org.allbinary.android.input.motion.event.AnalogControllerConfigurationEventHandler
import org.allbinary.logic.math.ScaleFactorFactory

open public class AnalogControllerConfigurationFactory
            : Object
         {
        

        companion object {


    private val instance: AnalogControllerConfigurationFactory = AnalogControllerConfigurationFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AnalogControllerConfigurationFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
    val SCALE_FACTOR: Int = ScaleFactorFactory.getInstance()!!.DEFAULT_SCALE_FACTOR

    val SCALE_VALUE: Int = ScaleFactorFactory.getInstance()!!.DEFAULT_SCALE_VALUE

    private var available: Boolean= false

    private val analogControllerConfigurationEvent: AnalogControllerConfigurationEvent = AnalogControllerConfigurationEvent(this)
private constructor        ()
            : super()
        {}


open fun isAvailable()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return available
}


                @Throws(Exception::class)
            
open fun setAvailable(available: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var available = available
this.available= available
AnalogControllerConfigurationEventHandler.getInstance()!!.fireEvent(analogControllerConfigurationEvent)
}


}
                
            

