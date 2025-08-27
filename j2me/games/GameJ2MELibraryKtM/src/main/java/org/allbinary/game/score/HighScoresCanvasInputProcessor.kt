
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
        package org.allbinary.game.score




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.game.input.PlayerGameInput
import org.allbinary.game.input.event.GameKeyEvent
import org.allbinary.game.score.displayable.HighScoresCanvas
import org.allbinary.util.BasicArrayList

open public class HighScoresCanvasInputProcessor : PlayerGameInput {
        

    private val highScoresCanvas: HighScoresCanvas
public constructor        (highScoresCanvas: HighScoresCanvas)                        

                            : super(BasicArrayList(),  -1){

                    var highScoresCanvas = highScoresCanvas


                            //For kotlin this is before the body of the constructor.
                    
this.highScoresCanvas= highScoresCanvas
}


open fun open()
        //nullable = true from not(false or (false and true)) = true
{}


open fun close()
        //nullable = true from not(false or (false and true)) = true
{}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
override fun onPressGameKeyEvent(gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameKeyEvent = gameKeyEvent
super.onPressGameKeyEvent(gameKeyEvent)
this.update()
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
override fun onDownGameKeyEvent(gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameKeyEvent = gameKeyEvent
super.onDownGameKeyEvent(gameKeyEvent)
this.update()
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
override fun onUpGameKeyEvent(gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameKeyEvent = gameKeyEvent
super.onUpGameKeyEvent(gameKeyEvent)
this.update()
}


open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
}


open fun getHighScoresCanvas()
        //nullable = true from not(false or (false and true)) = true
: HighScoresCanvas{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return highScoresCanvas
}


}
                
            

