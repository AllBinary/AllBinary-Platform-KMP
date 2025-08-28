
        /* Generated Code Do Not Modify */
        package javax.microedition.lcdui




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Stack
import org.allbinary.logic.string.StringUtil

open public class NullCanvas : Canvas {
        

        companion object {
            
    val NULL_IMAGE_ARRAY: Array<Image?> = arrayOfNulls(0)

    val NULL_IMAGE: Image = Image()

    val NULL_CANVAS: NullCanvas = NullCanvas()

    val NULL_SCREEN: Form = Form(StringUtil.getInstance()!!.EMPTY_STRING)

        }
            public constructor        ()

        Updates for KMP build        
        {
}

override fun setFullScreenMode(mode: Boolean)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var mode = mode
}

override fun sizeChanged(w: Int, h: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var w = w
var h = h
}


open fun getCommandStack()
        //nullable = true from not(false or (false and true)) = true
: Stack<Any>

        Updates for KMP build        
        {



                            throw RuntimeException()
}


open fun isCommand(command: Command)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
var command = command



                            throw RuntimeException()
}

override fun addCommand(command: Command)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var command = command
}

override fun removeCommand(command: Command)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var command = command
}


open fun removeAllCommands()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}

override fun setCommandListener(l: CommandListener)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var l = l
}


open fun getCustomCommandListener()
        //nullable = true from not(false or (false and true)) = true
: CommandListener

        Updates for KMP build        
        {



                            throw RuntimeException()
}


open fun isPaused()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                            throw RuntimeException()
}


open fun removePauseCommand()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


open fun pause()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


open fun unPause()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


                @Throws(Exception::class)
            
open fun process()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graphics = graphics
}


open fun destroy()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


open fun setPaused(isPaused: Boolean)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var isPaused = isPaused



                            throw RuntimeException()
}

override fun pointerDragged(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var x = x
var y = y
}

override fun pointerPressed(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var x = x
var y = y
}

override fun pointerReleased(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var x = x
var y = y
}


}
                
            

