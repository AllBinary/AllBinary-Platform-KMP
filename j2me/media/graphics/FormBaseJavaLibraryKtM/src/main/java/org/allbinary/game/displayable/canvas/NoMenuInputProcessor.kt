
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
        
import javax.microedition.lcdui.NullCanvas
import org.allbinary.game.input.event.GameKeyEvent
import org.allbinary.input.motion.gesture.observer.MotionGestureEvent
import org.allbinary.util.BasicArrayListUtil

open public class NoMenuInputProcessor : BasicMenuInputProcessor {
        
companion object {
            
    private val SINGLETON: NoMenuInputProcessor = NoMenuInputProcessor()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: NoMenuInputProcessor{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            private constructor ()                        

                            : super(BasicArrayListUtil.getInstance()!!.getImmutableInstance(),  -1, NullCanvas.NULL_CANVAS){


                            //For kotlin this is before the body of the constructor.
                    
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    override fun onDownGameKeyEvent(gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{
var gameKeyEvent = gameKeyEvent
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    override fun onUpGameKeyEvent(gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{
var gameKeyEvent = gameKeyEvent
}


    override fun onMotionGestureEvent(motionGestureEvent: MotionGestureEvent)
        //nullable = true from not(false or (false and false)) = true
{
var motionGestureEvent = motionGestureEvent
}


}
                
            

