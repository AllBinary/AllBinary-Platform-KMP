
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
        
import org.allbinary.game.input.CompleteMotionGestureInputEventHandler
import org.allbinary.game.input.motion.action.GameKeyCompleteMotionGestureInputEvent
import org.allbinary.game.input.motion.action.GameKeyFromMotionGestureEventListener
import org.allbinary.input.motion.gesture.MotionGestureToMotionGestureActionAssociation
import org.allbinary.input.motion.gesture.configuration.MotionGestureConfiguration
import org.allbinary.input.motion.gesture.configuration.MotionGestureConfigurationFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class ResolveCompleteMotionGestureListener
            : Object
        
                , CompleteMotionGestureListenerInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            
public constructor        ()
            : super()
        {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put("MotionGesture to CompleteMotionGesture Reciever", this, commonStrings!!.CONSTRUCTOR)
CompleteMotionGestureInputEventHandler.getInstance()!!.addListener(GameKeyFromMotionGestureEventListener())
}


                @Throws(Exception::class)
            override fun onMotionGestureCompleted(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var list = list

    var configuration: MotionGestureConfiguration = MotionGestureConfigurationFactory.getInstance()!!
            


    var commandActionsList: BasicArrayList = configuration.getAssociateCommandActionsList()!!
            


    var size: Int = commandActionsList!!.size()!!
            





                        for (index in size -1 downTo 0)


        {
    var association: MotionGestureToMotionGestureActionAssociation = commandActionsList!!.objectArray[index]!! as MotionGestureToMotionGestureActionAssociation


    
                        if(association.isMotionGestureArrayEquals(list) == true)
                        
                                    {
                                    
    var completeMotionGestureInputEvent: GameKeyCompleteMotionGestureInputEvent = association.getCommandAction() as GameKeyCompleteMotionGestureInputEvent

CompleteMotionGestureInputEventHandler.getInstance()!!.fireEvent(completeMotionGestureInputEvent)
break;

                    

                                    }
                                
}

}


}
                
            

