
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
import org.allbinary.game.input.GameInputStrings
import org.allbinary.game.input.event.GameKeyEvent
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.displayable.MyCanvas
import org.allbinary.input.motion.gesture.MotionGestureInput
import org.allbinary.input.motion.gesture.TouchMotionGestureFactory
import org.allbinary.input.motion.gesture.observer.MotionGestureEvent
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.math.RectangleCollisionUtil
import org.allbinary.time.TimeDelayHelper
import org.allbinary.util.BasicArrayList

open public class PopupMenuInputProcessor : BasicMenuInputProcessor {
        

    private val rectangleCollisionUtil: RectangleCollisionUtil = RectangleCollisionUtil.getInstance()!!

    private val CLICK_DELAY: Int = 120

    private val clickTimeHelper: TimeDelayHelper = TimeDelayHelper(CLICK_DELAY)

    private var rectangle: Rectangle
public constructor        (gameKeyEventList: BasicArrayList, playerInputId: Int, gameCanvas: MyCanvas, rectangle: Rectangle)                        

                            : super(gameKeyEventList, playerInputId, gameCanvas)

        Updates for KMP build        
        {
    //var gameKeyEventList = gameKeyEventList
    //var playerInputId = playerInputId
    //var gameCanvas = gameCanvas
    //var rectangle = rectangle


                            //For kotlin this is before the body of the constructor.
                    
this.rectangle= rectangle
}


open fun init(rectangle: Rectangle)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var rectangle = rectangle
this.rectangle= rectangle
}


                @Throws(Exception::class)
            
open fun processInput(key: Int)
        //nullable = true from not(false or (false and false)) = true
: Int

        Updates for KMP build        
        {
    //var key = key

    
                        if(key == Canvas.KEY_STAR)
                        
                                    {
                                    
    var gameCanvas: AllBinaryGameCanvas = this.getCanvas() as AllBinaryGameCanvas

gameCanvas!!.toggleMenu()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 1

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


                @Throws(Exception::class)
            override fun processInput()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {

        try {
            
    var motionInputsIndex: Int = this.processMotionInputs()!!


    var list: BasicArrayList = this.getGameKeyEventList()!!


    var size: Int = list.size()!!


    var key: Int = 0


    var gameKeyEvent: GameKeyEvent





                        for (index in 0 until size)

        

        Updates for KMP build        
        {
gameKeyEvent= list.objectArray[index]!! as GameKeyEvent

    
                        if(gameKeyEvent != 
                                    null
                                )
                        
                                    {
                                    key= gameKeyEvent!!.getKey()

    
                        if(this.processInput(key) == 1)
                        
                                    {
                                    break;

                    

                                    }
                                

                                    }
                                
}

this.clear()

    
                        if(size > 0 || motionInputsIndex >= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 1

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1

                        }
                            
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put(commonStrings!!.EXCEPTION, this, GameInputStrings.getInstance()!!.PROCESS_INPUT, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}

}


                @Throws(Exception::class)
            
open fun processMotionInputs()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {

    var lastIndex: Int = this.motionGestureEventList!!.size() -1


    
                        if(lastIndex >= 0)
                        
                                    {
                                    
    var motionGestureEvent: MotionGestureEvent = this.motionGestureEventList!!.objectArray[lastIndex]!! as MotionGestureEvent

this.processMotionInput(motionGestureEvent)

                                    }
                                
motionGestureEventList!!.clear()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return lastIndex
}


                @Throws(Exception::class)
            
open fun processMotionInput(motionGestureEvent: MotionGestureEvent)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var motionGestureEvent = motionGestureEvent

    
                        if(motionGestureEvent == 
                                    null
                                )
                        
                                    {
                                    logUtil!!.put("Exception: Bug", this, gameInputStrings!!.PROCESS_MOTION_INPUT)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    var touchMotionGestureFactory: TouchMotionGestureFactory = TouchMotionGestureFactory.getInstance()!!


    var motionGestureInput: MotionGestureInput = motionGestureEvent!!.getMotionGesture()!!


    
                        if(motionGestureInput == touchMotionGestureFactory!!.RELEASED)
                        
                                    {
                                    
    var point: GPoint = motionGestureEvent!!.getCurrentPoint()!!


    var rectPoint: GPoint = rectangle.getPoint()!!


    
                        if(rectangleCollisionUtil!!.isInside(rectPoint!!.getX(), rectPoint!!.getY(), rectangle.getMaxX() +20, rectangle.getMaxY(), point.getX(), point.getY()))
                        
                                    {
                                    
    
                        if(this.clickTimeHelper!!.isTime())
                        
                                    {
                                    
    var gameCanvas: AllBinaryGameCanvas = this.getCanvas() as AllBinaryGameCanvas

gameCanvas!!.toggleMenu()

                                    }
                                

                                    }
                                

                                    }
                                
}


}
                
            

