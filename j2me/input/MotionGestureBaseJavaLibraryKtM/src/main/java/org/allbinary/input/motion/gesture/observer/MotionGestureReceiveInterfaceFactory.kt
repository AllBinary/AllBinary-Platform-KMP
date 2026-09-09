
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
        package org.allbinary.input.motion.gesture.observer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.input.motion.gesture.configuration.MotionGestureConfiguration
import org.allbinary.input.motion.gesture.configuration.MotionGestureConfigurationFactory

open public class MotionGestureReceiveInterfaceFactory
            : Object
         {
        
companion object {
            
    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CompleteMotionGestureListenerInterface{

    var configuration: MotionGestureConfiguration = MotionGestureConfigurationFactory.getInstance()!!


    
                        if(!configuration.isExecutingActionsAllowed())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullCompleteMotionGestureReceiver()

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ResolveCompleteMotionGestureListener()

                        }
                            
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

