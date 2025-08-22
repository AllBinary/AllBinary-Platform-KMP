
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
        package org.allbinary.input.motion.button




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.CompleteMotionGestureInputEvent
import org.allbinary.game.input.CompleteMotionGestureInputEventHandler
import org.allbinary.game.input.CompleteMotionGestureInputEventListenerInterface
import org.allbinary.game.input.GameKey
import org.allbinary.game.input.mapping.InputMappingInterface
import org.allbinary.game.input.motion.action.GameKeyCompleteMotionGestureInputEvent
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.paint.ProcessPaintable
import org.allbinary.input.motion.gesture.MotionGestureInput
import org.allbinary.input.motion.gesture.TouchMotionGestureFactory
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.string.CommonStrings
import org.allbinary.time.TimeDelayHelper

open public class TouchButtonsPaintableComposite : ProcessPaintable
                , CompleteMotionGestureInputEventListenerInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var inputMappingInterface: InputMappingInterface

    var touchButtonsPaintable: TouchButtonsMappingPaintable

    private var timeHelper: TimeDelayHelper = TimeDelayHelper(250)

    private var released: Boolean = true
public constructor        (inputMappingInterface: InputMappingInterface, basicColor: BasicColor){

                    var inputMappingInterface = inputMappingInterface


                    var basicColor = basicColor
this.inputMappingInterface= inputMappingInterface
CompleteMotionGestureInputEventHandler.getInstance()!!.addListener(this)
this.touchButtonsPaintable= TouchButtonsMappingPaintable(basicColor)
}

override fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventObject = eventObject
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}


    private val METHOD_NAME: String = "onCompleteMotionGestureInputEvent"

    private val RELEASE: String = "Ignoring: MotionGestureInput Release"

    private val FAST_REPEAT: String = "Ignoring: MotionGestureInput Repeated To Quickly"

    private val IGNORE: String = "Ignoring: Until Released"
override fun onCompleteMotionGestureInputEvent(completeMotionGestureInputEvent: CompleteMotionGestureInputEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var completeMotionGestureInputEvent = completeMotionGestureInputEvent

        try {
            logUtil!!.put(commonStrings!!.START, this, "onCompleteMotionGestureInputEvent")

    var touchMotionGestureFactory: TouchMotionGestureFactory = TouchMotionGestureFactory.getInstance()!!


    var gameKeyCompleteMotionGestureInputEvent: GameKeyCompleteMotionGestureInputEvent = completeMotionGestureInputEvent as GameKeyCompleteMotionGestureInputEvent


    var gameKey: GameKey = gameKeyCompleteMotionGestureInputEvent!!.getGameKey()!!


    var motionGestureInput: MotionGestureInput = completeMotionGestureInputEvent!!.getMotionGestureInput()!!


    
                        if(motionGestureInput == touchMotionGestureFactory!!.RELEASED)
                        
                                    {
                                    logUtil!!.put(RELEASE, this, METHOD_NAME)
released= true



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    
                        if(motionGestureInput == 
                                    null
                                 && !this.timeHelper!!.isTime())
                        
                                    {
                                    logUtil!!.put(FAST_REPEAT, this, METHOD_NAME)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    
                        if(!released)
                        
                                    {
                                    logUtil!!.put(IGNORE, this, METHOD_NAME)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
released= false
logUtil!!.put(StringMaker().
                            append("GameKey: ")!!.append(StringUtil.getInstance()!!.toString(gameKey))!!.append(" MotionGestureInput: ")!!.append(StringUtil.getInstance()!!.toString(motionGestureInput))!!.toString(), this, METHOD_NAME)
this.inputMappingInterface!!.process(gameKey, motionGestureInput)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, METHOD_NAME, e)
}

}

override fun process()
        //nullable = true from not(false or (false and true)) = true
{CompleteMotionGestureInputEventHandler.getInstance()!!.removeListener(this)
}


}
                
            

