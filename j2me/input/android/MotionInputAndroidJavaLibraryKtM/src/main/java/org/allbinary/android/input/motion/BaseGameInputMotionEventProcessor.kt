
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
import org.allbinary.input.motion.gesture.observer.BasicMotionGesturesHandler
import org.allbinary.input.motion.gesture.observer.GameMotionGestureListener
import org.allbinary.input.motion.gesture.observer.MotionGestureReceiveInterfaceFactory
import org.allbinary.string.CommonStrings

open public class BaseGameInputMotionEventProcessor : MotionEventProcessor {
        

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val gameMotionGestureListener: GameMotionGestureListener
protected constructor (){
this.gameMotionGestureListener= GameMotionGestureListener(MotionGestureReceiveInterfaceFactory.getInstance())
this.addListener()
}


    override fun process(motionEvent: MotionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var motionEvent = motionEvent
}


    open fun addListener()
        //nullable = true from not(false or (false and true)) = true
{

    var motionGesturesHandler: BasicMotionGesturesHandler = BasicMotionGesturesHandler.getInstance()!!

motionGesturesHandler!!.addListenerInterface(this.gameMotionGestureListener)
}


}
                
            

