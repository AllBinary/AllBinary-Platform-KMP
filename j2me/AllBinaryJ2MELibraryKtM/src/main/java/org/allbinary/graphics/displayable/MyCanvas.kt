
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
        package org.allbinary.graphics.displayable




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Stack
import javax.microedition.lcdui.Canvas
import javax.microedition.lcdui.Command
import javax.microedition.lcdui.CommandListener
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.NullCommandListener
import org.allbinary.graphics.displayable.command.MyCommandInterface
import org.allbinary.graphics.displayable.command.MyCommandsFactory
import org.allbinary.input.TouchJ2ME
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.media.audio.Sound
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class MyCanvas : Canvas
                , DisplayableInterface
                , MyCommandInterface {
        

        companion object {
            
    val NULL_MY_CANVAS: MyCanvas = MyCanvas()

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    val canvasStrings: CanvasStrings = CanvasStrings.getInstance()!!
            

    val stringUtil: StringUtil = StringUtil.getInstance()!!
            

    val displayInfoSingleton: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!
            

    private val name: String

    private val childNameList: BasicArrayList

    private val commandStack: Stack<Any>

    private var isPaused: Boolean= false
public constructor        ()                        

                            : this(CommonStrings.getInstance()!!.UNKNOWN, BasicArrayList()){

                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (name: String, childNameList: BasicArrayList){

                    var name = name


                    var childNameList = childNameList
logUtil!!.put(commonStrings!!.CONSTRUCTOR, this, commonStrings!!.CONSTRUCTOR)
displayInfoSingleton!!.update(this, canvasStrings!!.CONSTRUCTOR)
this.name= name
this.childNameList= childNameList
this.commandStack= Stack()
}

override fun setFullScreenMode(mode: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var mode = mode
super.setFullScreenMode(mode)
displayInfoSingleton!!.update(this, canvasStrings!!.SET_FULL_SCREEN_MODE)
}

override fun sizeChanged(w: Int, h: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var w = w


                    var h = h
displayInfoSingleton!!.update(this, canvasStrings!!.SIZE_CHANGED)
}


open fun getCommandStack()
        //nullable = true from not(false or (false and true)) = true
: Stack<Any>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.commandStack
}


open fun isCommand(command: Command)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var command = command



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.commandStack!!.contains(command)
}

override fun addCommand(command: Command)
        //nullable = true from not(false or (false and false)) = true
{

                    var command = command

    
                        if(!this.commandStack!!.contains(command))
                        
                                    {
                                    commandStack!!.push(command)
super.addCommand(command)

                                    }
                                
}

override fun removeCommand(command: Command)
        //nullable = true from not(false or (false and false)) = true
{

                    var command = command
commandStack!!.removeElement(command)
super.removeCommand(command)
}

override fun removeAllCommands()
        //nullable = true from not(false or (false and true)) = true
{
    var size: Int = commandStack!!.size!!
            





                        for (index in 0 until size)


        {super.removeCommand(commandStack!!.pop() as Command)
}

}


    private var listener: CommandListener = NullCommandListener.NULL_COMMAND_LISTENER
override fun setCommandListener(l: CommandListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var l = l
super.setCommandListener(l)
listener= l
}


open fun getCustomCommandListener()
        //nullable = true from not(false or (false and true)) = true
: CommandListener{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.listener
}


open fun isPaused()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.isPaused
}


open fun removePauseCommand()
        //nullable = true from not(false or (false and true)) = true
{this.removeCommand(MyCommandsFactory.getInstance()!!.PAUSE_COMMAND)
}


open fun pause()
        //nullable = true from not(false or (false and true)) = true
{logUtil!!.put(commonStrings!!.START, this, canvasStrings!!.PAUSE)
this.removePauseCommand()
this.addCommand(MyCommandsFactory.getInstance()!!.RESUME_COMMAND)
this.setPaused(true)
}


open fun unPause()
        //nullable = true from not(false or (false and true)) = true
{logUtil!!.put(commonStrings!!.START, this, canvasStrings!!.UN_PAUSE)
this.removeCommand(MyCommandsFactory.getInstance()!!.RESUME_COMMAND)
this.addCommand(MyCommandsFactory.getInstance()!!.PAUSE_COMMAND)
this.setPaused(false)
}


                @Throws(Exception::class)
            
open fun process()
        //nullable = true from not(false or (false and true)) = true
{displayInfoSingleton!!.process()
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
}


open fun draw(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
}


open fun hasChild(displayable: MyCanvas)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var displayable = displayable



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.childNameList!!.contains(displayable.name)
}


open fun destroy()
        //nullable = true from not(false or (false and true)) = true
{logUtil!!.put("Destroyed MyCanvas", this, "destroy")
}


open fun setPaused(isPaused: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var isPaused = isPaused
this.isPaused= isPaused
}


    private val touchME: TouchJ2ME = TouchJ2ME()
override fun pointerDragged(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var x = x


                    var y = y
touchME!!.pointerDragged(x, y)
}

override fun pointerPressed(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var x = x


                    var y = y
touchME!!.pointerPressed(x, y)
}

override fun pointerReleased(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var x = x


                    var y = y
touchME!!.pointerReleased(x, y)
}


open fun nextSong(nextSongSound: Sound, leftVolume: Int, rightVolume: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var nextSongSound = nextSongSound


                    var leftVolume = leftVolume


                    var rightVolume = rightVolume
}


}
                
            

