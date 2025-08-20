
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
        package org.allbinary.game.displayable.canvas




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Canvas
import javax.microedition.lcdui.NullCanvas
import org.allbinary.game.input.PlayerGameInput
import org.allbinary.graphics.displayable.MyCanvas
import org.allbinary.input.motion.gesture.observer.BaseMotionGestureEventListener
import org.allbinary.input.motion.gesture.observer.MotionGestureEvent
import org.allbinary.util.BasicArrayList

open public class BasicMenuInputProcessor : PlayerGameInput
                , BaseMotionGestureEventListener {
        

    val motionGestureEventList: BasicArrayList = BasicArrayList()

    private var canvas: Canvas = NullCanvas.NULL_CANVAS
protected constructor        (gameKeyEventList: BasicArrayList, playerInputId: Int, gameCanvas: Canvas)                        

                            : super(gameKeyEventList, playerInputId){

                    var gameKeyEventList = gameKeyEventList


                    var playerInputId = playerInputId


                    var gameCanvas = gameCanvas


                            //For kotlin this is before the body of the constructor.
                    
this.canvas= gameCanvas
}

override fun onMotionGestureEvent(motionGestureEvent: MotionGestureEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var motionGestureEvent = motionGestureEvent
motionGestureEventList!!.add(motionGestureEvent)
}


open fun setCanvas(canvas: MyCanvas)
        //nullable = true from not(false or (false and false)) = true
{

                    var canvas = canvas
this.canvas= canvas
}


open fun getCanvas()
        //nullable = true from not(false or (false and true)) = true
: MyCanvas{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return canvas as MyCanvas
}


                @Throws(Exception::class)
            
open fun processInput()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}


}
                
            

