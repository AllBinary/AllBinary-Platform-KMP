
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
        package org.allbinary.game




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.time.TimeDelayHelper

open public class Intermission
            : Object
        
                , IntermissionInterface {
        

    private var enabled: Boolean= false

    private val timeElapsedHelper: TimeDelayHelper = TimeDelayHelper(0)

    private var intermissionEnableListener: IntermissionEnableListenerInterface = NullIntermissionEnableListener.getInstance()!!
public constructor        ()
            : super()
        {
}

override fun setListener(enableListener: IntermissionEnableListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{
var enableListener = enableListener
this.intermissionEnableListener= enableListener
}

override fun getTimeDelayHelper()
        //nullable = true from not(false or (false and true)) = true
: TimeDelayHelper{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return timeElapsedHelper
}

override fun setEnabled(enabled: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var enabled = enabled
this.enabled= enabled

    
                        if(this.isEnabled())
                        
                                    {
                                    this.getTimeDelayHelper()!!.setStartTime()

                                    }
                                
this.intermissionEnableListener!!.notifyIntermission(enabled)
}

override fun isEnabled()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return enabled
}


}
                
            

