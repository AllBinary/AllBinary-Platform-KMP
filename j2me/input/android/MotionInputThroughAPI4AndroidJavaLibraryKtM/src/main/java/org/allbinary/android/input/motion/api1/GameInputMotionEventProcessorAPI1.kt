
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
        package org.allbinary.android.input.motion.api1




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import android.view.MotionEvent
import org.allbinary.android.input.motion.BaseGameInputMotionEventProcessor
import org.allbinary.input.motion.AllMotionRecognizer
import org.allbinary.input.motion.MotionRecognizer
import org.allbinary.logic.NullUtil
import org.allbinary.logic.communication.log.LogUtil

open public class GameInputMotionEventProcessorAPI1 : BaseGameInputMotionEventProcessor {
        
companion object {
            
    private var instance: Any = NullUtil.getInstance()!!.NULL_OBJECT

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameInputMotionEventProcessorAPI1{

    
                        if(GameInputMotionEventProcessorAPI1.instance == NullUtil.getInstance()!!.NULL_OBJECT)
                        
                                    {
                                    GameInputMotionEventProcessorAPI1.instance= GameInputMotionEventProcessorAPI1()

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GameInputMotionEventProcessorAPI1.instance as GameInputMotionEventProcessorAPI1
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val motionRecognizer: MotionRecognizer = AllMotionRecognizer()
private constructor (){
}


    override fun process(motionEvent: MotionEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var motionEvent = motionEvent

        try {
            
    var x: Int = motionEvent!!.getX().toInt()


    var y: Int = motionEvent!!.getY().toInt()


    var action: Int = motionEvent!!.getAction()!!


    
                        if(action == MotionEvent.ACTION_DOWN)
                        
                                    {
                                    this.motionRecognizer!!.processStartMotionEvent(x, y, motionEvent!!.getDeviceId(), 0)

                                    }
                                
                             else 
    
                        if(action == MotionEvent.ACTION_UP || action == MotionEvent.ACTION_CANCEL)
                        
                                    {
                                    this.motionRecognizer!!.processEndMotionEvent(x, y, motionEvent!!.getDeviceId(), 0)

                                    }
                                
                             else 
    
                        if(action == MotionEvent.ACTION_MOVE)
                        
                                    {
                                    this.motionRecognizer!!.processDraggedMotionEvent(x, y, motionEvent!!.getDeviceId(), 0)

                                    }
                                
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, this.commonStrings!!.PROCESS, e)
}

}


}
                
            

