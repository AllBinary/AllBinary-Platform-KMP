
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
        
import org.allbinary.game.input.GameKey
import org.allbinary.game.input.GameKeyFactory
import org.allbinary.game.input.PlatformInputMappingFactory
import org.allbinary.game.input.event.GameKeyEventFactory
import org.allbinary.game.input.motion.action.GameKeyCompleteMotionGestureInputEvent
import org.allbinary.input.motion.gesture.TouchMotionGestureFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class ReleaseTouchInputToGameKeyEventAction : GameKeyCompleteMotionGestureInputEvent {
        

        companion object {
            
    private val SINGLETON: GameKeyCompleteMotionGestureInputEvent = ReleaseTouchInputToGameKeyEventAction()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameKeyCompleteMotionGestureInputEvent

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
    private val NONE: GameKey = GameKeyFactory.getInstance()!!.NONE
private constructor        ()                        

                            : super("Release Action", TouchMotionGestureFactory.getInstance()!!.RELEASED, PlatformInputMappingFactory.getInstance()!!.getPersistentInputMappingInstance()!!.getInputMapping())

        Updates for KMP build        
        {


                            //For kotlin this is before the body of the constructor.
                    

        try {
            this.setGameKey(NONE)
this.setGameKeyEvent(GameKeyEventFactory.getInstance()!!.getInstance(this, NONE))
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR, e)
}

}

override fun update()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


}
                
            

