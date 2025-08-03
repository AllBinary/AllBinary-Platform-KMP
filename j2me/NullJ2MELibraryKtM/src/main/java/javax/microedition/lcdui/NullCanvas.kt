
        /* Generated Code Do Not Modify */
        package javax.microedition.lcdui



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Stack

open public class NullCanvas : Canvas {
        

        companion object {


    val NULL_IMAGE_ARRAY: Array<Image?> = arrayOfNulls(0)

    val NULL_IMAGE: Image = Image()

    val NULL_CANVAS: NullCanvas = NullCanvas()


        }
            public constructor        (){}

override fun setFullScreenMode(mode: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var mode = mode
}

override fun sizeChanged(w: Int, h: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var w = w


                    var h = h
}


open fun getCommandStack()
        //nullable = true from not(false or (false and true)) = true
: Stack<Any>{


                            throw RuntimeException()
}


open fun isCommand(command: Command)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var command = command



                            throw RuntimeException()
}

override fun addCommand(command: Command)
        //nullable = true from not(false or (false and false)) = true
{

                    var command = command
}

override fun removeCommand(command: Command)
        //nullable = true from not(false or (false and false)) = true
{

                    var command = command
}


open fun removeAllCommands()
        //nullable = true from not(false or (false and true)) = true
{}

override fun setCommandListener(l: CommandListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var l = l
}


open fun getCustomCommandListener()
        //nullable = true from not(false or (false and true)) = true
: CommandListener{


                            throw RuntimeException()
}


open fun isPaused()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                            throw RuntimeException()
}


open fun removePauseCommand()
        //nullable = true from not(false or (false and true)) = true
{}


open fun pause()
        //nullable = true from not(false or (false and true)) = true
{}


open fun unPause()
        //nullable = true from not(false or (false and true)) = true
{}


                @Throws(Exception::class)
            
open fun process()
        //nullable = true from not(false or (false and true)) = true
{}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
}


open fun destroy()
        //nullable = true from not(false or (false and true)) = true
{}


open fun setPaused(isPaused: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var isPaused = isPaused



                            throw RuntimeException()
}

override fun pointerDragged(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var x = x


                    var y = y
}

override fun pointerPressed(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var x = x


                    var y = y
}

override fun pointerReleased(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var x = x


                    var y = y
}


}
                
            

