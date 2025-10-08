
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
        
import org.allbinary.game.input.event.DownGameKeyEventHandler
import org.allbinary.game.input.event.GameKeyEvent
import org.allbinary.game.input.event.UpGameKeyEventHandler
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.Rectangle
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.math.RectangleCollisionUtil
import org.allbinary.util.BasicArrayList

open public class TouchButtonRecognizer
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val rectangleCollisionUtil: RectangleCollisionUtil = RectangleCollisionUtil.getInstance()!!

    private val upGameKeyEventHandler: UpGameKeyEventHandler = UpGameKeyEventHandler.getInstance()!!

    private val downGameKeyEventHandler: DownGameKeyEventHandler = DownGameKeyEventHandler.getInstance()!!

    private var lastPressedTouchButtonInput: TouchButtonInput = BasicTouchInputFactory.getInstance()!!.NONE

    private val currentlyPressedTouchButtonSingleton: CurrentlyPressedTouchButtonSingleton = CurrentlyPressedTouchButtonSingleton.getInstance()!!

open public inner class ReleaseHelper
            : Object
         {
        

    val touchButtonRecognizer: TouchButtonRecognizer
public constructor (touchButtonRecognizer: TouchButtonRecognizer)
            : super()
        {
var touchButtonRecognizer = touchButtonRecognizer
this.touchButtonRecognizer= touchButtonRecognizer
}


                @Throws(Exception::class)
            
    open fun release(touchButtonInput: TouchButtonInput, deviceId: Int)
        //nullable = true from not(false or (false and false)) = true
{
var touchButtonInput = touchButtonInput
var deviceId = deviceId




                        for (index in currentlyPressedTouchButtonSingleton!!.size() -1 downTo 0)

        {

    var nextTouchButtonInput: TouchButtonInput = currentlyPressedTouchButtonSingleton!!.get(index)!!


    var gameKeyEvent: GameKeyEvent = nextTouchButtonInput!!.getGameKeyEvent()!!

upGameKeyEventHandler!!.fireEvent(gameKeyEvent)
upGameKeyEventHandler!!.getInstance(deviceId)!!.fireEvent(gameKeyEvent)
this.touchButtonRecognizer!!.currentlyPressedTouchButtonSingleton!!.remove(index)
}

}


}
                
            
open public inner class MultitouchReleaseHelper : ReleaseHelper {
        
public constructor (touchButtonRecognizer: TouchButtonRecognizer)                        

                            : super(touchButtonRecognizer){
var touchButtonRecognizer = touchButtonRecognizer


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
    override fun release(touchButtonInput: TouchButtonInput, deviceId: Int)
        //nullable = true from not(false or (false and false)) = true
{
var touchButtonInput = touchButtonInput
var deviceId = deviceId

    var cancelTouchButtonInput: TouchButtonInput = CancelTouchButtonInputFactory.getInstance()!!.getCancel(touchButtonInput)!!





                        for (index in currentlyPressedTouchButtonSingleton!!.size() -1 downTo 0)

        {

    var nextTouchButtonInput: TouchButtonInput = currentlyPressedTouchButtonSingleton!!.get(index)!!


    
                        if(cancelTouchButtonInput == nextTouchButtonInput)
                        
                                    {
                                    
    var gameKeyEvent: GameKeyEvent = nextTouchButtonInput!!.getGameKeyEvent()!!

upGameKeyEventHandler!!.fireEvent(gameKeyEvent)
upGameKeyEventHandler!!.getInstance(deviceId)!!.fireEvent(gameKeyEvent)
this.touchButtonRecognizer!!.currentlyPressedTouchButtonSingleton!!.remove(index)

                                    }
                                
}

}


}
                
            
    private val releaseHelper: ReleaseHelper
public constructor ()
            : super()
        {

    
                        if(TouchScreenFactory.getInstance()!!.isMultiTouch())
                        
                                    {
                                    this.releaseHelper= MultitouchReleaseHelper(this)

                                    }
                                
                        else {
                            this.releaseHelper= ReleaseHelper(this)

                        }
                            
}


                @Throws(Exception::class)
            
    open fun processRelease(touchButtonInput: TouchButtonInput, deviceId: Int)
        //nullable = true from not(false or (false and false)) = true
{
var touchButtonInput = touchButtonInput
var deviceId = deviceId
this.releaseHelper!!.release(touchButtonInput, deviceId)

    var gameKeyEvent: GameKeyEvent = touchButtonInput!!.getGameKeyEvent()!!

upGameKeyEventHandler!!.fireEvent(gameKeyEvent)
upGameKeyEventHandler!!.getInstance(deviceId)!!.fireEvent(gameKeyEvent)
this.currentlyPressedTouchButtonSingleton!!.remove(touchButtonInput)
}


                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun releaseTouchButtonInput(x: Int, y: Int, deviceId: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var x = x
var y = y
var deviceId = deviceId

    var touchButtonInput: TouchButtonInput = lastPressedTouchButtonInput


    
                        if(currentlyPressedTouchButtonSingleton!!.contains(touchButtonInput))
                        
                                    {
                                    lastPressedTouchButtonInput= BasicTouchInputFactory.getInstance()!!.NONE
this.processRelease(touchButtonInput, deviceId)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            
    var list: BasicArrayList = TouchButtonFactory.getInstance()!!.getList()!!


    var rectangle: Rectangle


    var point: GPoint


    var touchButton: TouchButton





                        for (index in list.size() -1 downTo 0)

        {
touchButton= list.objectArray[index]!! as TouchButton
rectangle= touchButton!!.getRectangle()
point= rectangle.getPoint()

    
                        if(rectangleCollisionUtil!!.isInside(point.getX(), point.getY(), rectangle.getMaxX(), rectangle.getMaxY(), x, y))
                        
                                    {
                                    touchButtonInput= touchButton!!.getTouchButtonInput()
this.processRelease(touchButtonInput, deviceId)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
}


                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun pressTouchButtonInput(x: Int, y: Int, deviceId: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var x = x
var y = y
var deviceId = deviceId

    var list: BasicArrayList = TouchButtonFactory.getInstance()!!.getList()!!


    var rectangle: Rectangle


    var point: GPoint


    var touchButton: TouchButton


    var touchButtonInput: TouchButtonInput





                        for (index in list.size() -1 downTo 0)

        {
touchButton= list.objectArray[index]!! as TouchButton
rectangle= touchButton!!.getRectangle()
point= rectangle.getPoint()

    
                        if(rectangleCollisionUtil!!.isInside(point.getX(), point.getY(), rectangle.getMaxX(), rectangle.getMaxY(), x, y))
                        
                                    {
                                    touchButtonInput= touchButton!!.getTouchButtonInput()

    
                        if(!currentlyPressedTouchButtonSingleton!!.contains(touchButtonInput))
                        
                                    {
                                    this.releaseHelper!!.release(touchButtonInput, deviceId)
lastPressedTouchButtonInput= touchButtonInput
currentlyPressedTouchButtonSingleton!!.add(touchButtonInput)

    var gameKeyEvent: GameKeyEvent = touchButtonInput!!.getGameKeyEvent()!!

downGameKeyEventHandler!!.fireEvent(gameKeyEvent)
downGameKeyEventHandler!!.getInstance(deviceId)!!.fireEvent(gameKeyEvent)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

