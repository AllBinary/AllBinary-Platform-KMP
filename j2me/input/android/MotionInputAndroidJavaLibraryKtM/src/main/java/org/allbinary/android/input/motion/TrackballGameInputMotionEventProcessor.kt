
        /*
                * 
                *  AllBinary Open License Version 1
                *  Copyright (c) 2009 AllBinary
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import android.view.MotionEvent
import org.allbinary.game.input.motion.action.SingleKeyPressGameKeyFromMotionGestureEventListener
import org.allbinary.input.motion.trackball.action.DownTrackballInputToGameKeyEventAction
import org.allbinary.input.motion.trackball.action.LeftTrackballInputToGameKeyEventAction
import org.allbinary.input.motion.trackball.action.RightTrackballInputToGameKeyEventAction
import org.allbinary.input.motion.trackball.action.UpTrackballInputToGameKeyEventAction
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class TrackballGameInputMotionEventProcessor : MotionEventProcessor {
        
companion object {
            
    private var PROCESSOR: TrackballGameInputMotionEventProcessor = TrackballGameInputMotionEventProcessor()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TrackballGameInputMotionEventProcessor{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TrackballGameInputMotionEventProcessor.PROCESSOR
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val listener: SingleKeyPressGameKeyFromMotionGestureEventListener = SingleKeyPressGameKeyFromMotionGestureEventListener()
private constructor (){
}


    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    override fun process(motionEvent: MotionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var motionEvent = motionEvent

        try {
            
    var x: Float = motionEvent!!.getX()!!


    var y: Float = motionEvent!!.getY()!!


    
                        if(x < 0)
                        
                                    {
                                    this.listener.onCompleteMotionGestureInputEvent(LeftTrackballInputToGameKeyEventAction.getInstance())

                                    }
                                
                             else 
    
                        if(x > 0)
                        
                                    {
                                    this.listener.onCompleteMotionGestureInputEvent(RightTrackballInputToGameKeyEventAction.getInstance())

                                    }
                                

    
                        if(y < 0)
                        
                                    {
                                    this.listener.onCompleteMotionGestureInputEvent(UpTrackballInputToGameKeyEventAction.getInstance())

                                    }
                                
                             else 
    
                        if(y > 0)
                        
                                    {
                                    this.listener.onCompleteMotionGestureInputEvent(DownTrackballInputToGameKeyEventAction.getInstance())

                                    }
                                
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, this.commonStrings!!.PROCESS, e)
}

}


}
                
            

