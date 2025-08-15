
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
import javax.microedition.lcdui.Command
import org.allbinary.game.commands.GameCommandsFactory
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.InputFeatureFactory
import org.allbinary.game.input.GameInputStrings
import org.allbinary.game.input.event.GameKeyEvent
import org.allbinary.game.input.event.GameKeyEventFactory
import org.allbinary.game.layer.SWTUtil
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.displayable.MyCanvas
import org.allbinary.graphics.form.CommandCurrentSelectionForm
import org.allbinary.graphics.form.ScrollSelectionForm
import org.allbinary.graphics.opengles.OpenGLFeatureFactory
import org.allbinary.input.motion.gesture.MotionGestureInput
import org.allbinary.input.motion.gesture.TouchMotionGestureFactory
import org.allbinary.input.motion.gesture.observer.MotionGestureEvent
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.media.audio.PrimaryPlayerQueueFactory
import org.allbinary.media.audio.SelectSound
import org.allbinary.thread.PrimaryThreadPool
import org.allbinary.time.TimeDelayHelper
import org.allbinary.util.BasicArrayList

open public class CommandFormInputProcessor : BasicMenuInputProcessor {
        

    private val MOTION_GESTURE_SOURCE_ID: Int = GameKeyEventFactory.getInstance()!!.MOTION_GESTURE_SOURCE_ID

    private val CLICK_DELAY: Int = 150

    private val clickTimeHelper: TimeDelayHelper = TimeDelayHelper(CLICK_DELAY)

    private val DOUBLE_CLICK_DELAY: Int = 1200

    private val doubleClickTimeHelper: TimeDelayHelper = TimeDelayHelper(DOUBLE_CLICK_DELAY)

    val isSingleKeyProcessing: Boolean = InputFeatureFactory.getInstance()!!.isSingleKeyProcessing()!!
            

    private var form: ScrollSelectionForm

    private var hasPressed: Boolean = false
public constructor        (gameKeyEventList: BasicArrayList, playerInputId: Int, gameCanvas: MyCanvas, form: ScrollSelectionForm)                        

                            : super(gameKeyEventList, playerInputId, gameCanvas){

                    var gameKeyEventList = gameKeyEventList


                    var playerInputId = playerInputId


                    var gameCanvas = gameCanvas


                    var form = form


                            //For kotlin this is before the body of the constructor.
                    
this.form= form
}


                @Throws(Exception::class)
            
open fun processInput(key: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var key = key

    
                        if(key == Canvas.LEFT || key == Canvas.RIGHT || key == Canvas.UP || key == Canvas.DOWN)
                        
                                    {
                                    PrimaryPlayerQueueFactory.getInstance()!!.add(SelectSound.getInstance())
this.form.processInput(key)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 1

                                    }
                                
                             else 
    
                        if(key == Canvas.FIRE)
                        
                                    {
                                    PrimaryPlayerQueueFactory.getInstance()!!.add(SelectSound.getInstance())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.processCommand()

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


    private val PROCESS_COMMAND: String = "processCommand"

open fun processCommand()
        //nullable = true from not(false or (false and true)) = true
: Int{
    var commandCurrentSelectionForm: CommandCurrentSelectionForm = this.form as CommandCurrentSelectionForm


    var command: Command = commandCurrentSelectionForm!!.getSelectedCommand()!!
            

logUtil!!.put(command.toString(), this, PROCESS_COMMAND)

    var features: Features = Features.getInstance()!!
            


    var openGLFeatureFactory: OpenGLFeatureFactory = OpenGLFeatureFactory.getInstance()!!
            


    
                        if(SWTUtil.isSWT && features.isFeature(openGLFeatureFactory!!.OPENGL) && command != GameCommandsFactory.getInstance()!!.EXIT_COMMAND)
                        
                                    {
                                    CommandRunnable(this, command).
                            run()

                                    }
                                
                        else {
                            PrimaryThreadPool.getInstance()!!.runTask(CommandRunnable(this, command))

                        }
                            

    
                        if(command == GameCommandsFactory.getInstance()!!.QUIT_COMMAND)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 1

                        }
                            
}


                @Throws(Exception::class)
            override fun processInput()
        //nullable = true from not(false or (false and true)) = true
: Int{
        try {
            
    var motionInputsIndex: Int = this.processMotionInputs()!!
            


    var list: BasicArrayList = this.getGameKeyEventList()!!
            


    var size: Int = list.size()!!
            


    var key: Int = 0


    var gameKeyEvent: GameKeyEvent





                        for (index in 0 until size)


        {gameKeyEvent= list.objectArray[index]!! as GameKeyEvent
key= gameKeyEvent!!.getKey()

    
                        if(gameKeyEvent!!.getSourceId() != MOTION_GESTURE_SOURCE_ID)
                        
                                    {
                                    
    
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
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, this.gameInputStrings!!.PROCESS_INPUT, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}

}


                @Throws(Exception::class)
            
open fun processMotionInputs()
        //nullable = true from not(false or (false and true)) = true
: Int{
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
{

                    var motionGestureEvent = motionGestureEvent

    var touchMotionGestureFactory: TouchMotionGestureFactory = TouchMotionGestureFactory.getInstance()!!
            


    var motionGestureInput: MotionGestureInput = motionGestureEvent!!.getMotionGesture()!!
            


    
                        if(motionGestureInput == touchMotionGestureFactory!!.RELEASED)
                        
                                    {
                                    
    var point: GPoint = motionGestureEvent!!.getCurrentPoint()!!
            


    
                        if(this.form.isInForm(point))
                        
                                    {
                                    
    var index: Int = this.form.getSelectedIndex(point)!!
            


    
                        if(index !=  -1)
                        
                                    {
                                    PrimaryPlayerQueueFactory.getInstance()!!.add(SelectSound.getInstance())

    
                        if(index == this.form.getSelectedIndex())
                        
                                    {
                                    
    
                        if(this.clickTimeHelper!!.isTime())
                        
                                    {
                                    this.processCommand()

                                    }
                                

                                    }
                                
                        else {
                            this.form.setSelectedIndex(index)

                        }
                            

                                    }
                                
                        else {
                            
                        }
                            

                                    }
                                

    
                        if(this.hasPressed)
                        
                                    {
                                    
    
                        if(!this.doubleClickTimeHelper!!.isTime())
                        
                                    {
                                    logUtil!!.put("Double Press", this, gameInputStrings!!.PROCESS_MOTION_INPUT)
this.processCommand()

                                    }
                                
this.doubleClickTimeHelper!!.delay= DOUBLE_CLICK_DELAY
this.doubleClickTimeHelper!!.setStartTime()

                                    }
                                
this.hasPressed= false

                                    }
                                
                             else 
    
                        if(motionGestureInput == touchMotionGestureFactory!!.PRESSED)
                        
                                    {
                                    this.doubleClickTimeHelper!!.delay= 0
this.hasPressed= true

                                    }
                                
}


    private val NAME_LABEL: String = " ScrollSelectionForm: "
override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append(super.toString())!!.append(NAME_LABEL)!!.append(this.form.toString())!!.toString()
}


}
                
            

