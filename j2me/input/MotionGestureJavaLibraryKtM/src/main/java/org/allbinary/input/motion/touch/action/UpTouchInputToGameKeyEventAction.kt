
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
        package org.allbinary.input.motion.touch.action




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.PlatformInputMappingFactory
import org.allbinary.game.input.motion.action.GameKeyCompleteMotionGestureInputEvent
import org.allbinary.input.motion.gesture.TouchMotionGestureFactory
import org.allbinary.logic.NullUtil

open public class UpTouchInputToGameKeyEventAction : GameKeyCompleteMotionGestureInputEvent {
        
companion object {
            
    private var instance: Any = NullUtil.getInstance()!!.NULL_OBJECT

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameKeyCompleteMotionGestureInputEvent{

    
                        if(UpTouchInputToGameKeyEventAction.instance == NullUtil.getInstance()!!.NULL_OBJECT)
                        
                                    {
                                    UpTouchInputToGameKeyEventAction.instance= UpTouchInputToGameKeyEventAction()

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return UpTouchInputToGameKeyEventAction.instance as GameKeyCompleteMotionGestureInputEvent
}


        }
            private constructor ()                        

                            : super("Up Action", TouchMotionGestureFactory.getInstance()!!.UP, PlatformInputMappingFactory.getInstance()!!.getPersistentInputMappingInstance()!!.getInputMapping()){


                            //For kotlin this is before the body of the constructor.
                    
}


}
                
            

