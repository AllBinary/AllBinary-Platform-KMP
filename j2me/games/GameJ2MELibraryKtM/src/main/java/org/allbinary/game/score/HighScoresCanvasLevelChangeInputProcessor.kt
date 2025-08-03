
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Canvas
import javax.microedition.lcdui.Graphics
import org.allbinary.game.input.event.GameKeyEventHandler
import org.allbinary.game.input.event.GameKeyEventUtil
import org.allbinary.game.score.displayable.HighScoresCanvas
import org.allbinary.graphics.Anchor
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.MyFont
import org.allbinary.util.BasicArrayList

open public class HighScoresCanvasLevelChangeInputProcessor : HighScoresCanvasInputProcessor {
        

    private val displayInfoSingleton: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!
            

    private val INSTRUCTIONS: String = "(Right = Next Track, Left = Previous Track)"

    private var anchor: Int = Anchor.TOP_LEFT
public constructor        (highScoresCanvas: HighScoresCanvas)                        

                            : super(highScoresCanvas){

                    var highScoresCanvas = highScoresCanvas


                            //For kotlin this is before the body of the constructor.
                    
}

override fun open()
        //nullable = true from not(false or (false and true)) = true
{GameKeyEventHandler.getInstance()!!.addListener(this)
}

override fun close()
        //nullable = true from not(false or (false and true)) = true
{GameKeyEventHandler.getInstance()!!.removeListener(this)
}

override fun update()
        //nullable = true from not(false or (false and true)) = true
{
    var list: BasicArrayList = this.getGameKeyEventList()!!
            


    var size: Int = list!!.size()!!
            





                        for (index in 0 until size)


        {
    var anyType: Any = list!!.objectArray[index]!!


    var key: Int = GameKeyEventUtil.getKey(anyType)!!
            


    
                        if(key == Canvas.RIGHT)
                        
                                    {
                                    this.getHighScoresCanvas()!!.getGameInfo()!!.nextGameLevel()

                                    }
                                
                             else 
    
                        if(key == Canvas.LEFT)
                        
                                    {
                                    this.getHighScoresCanvas()!!.getGameInfo()!!.previousGameLevel()

                                    }
                                
this.getHighScoresCanvas()!!.executeUpdate()
}

list!!.clear()
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics

    var myFont: MyFont = MyFont.getInstance()!!
            


    var width: Int = this.displayInfoSingleton!!.getLastWidth()!!
            


    var topScoresWidth: Int = (graphics!!.getFont()!!.stringWidth(INSTRUCTIONS) shr 1)

graphics!!.drawString(INSTRUCTIONS, (width shr 1) -topScoresWidth, myFont!!.DEFAULT_CHAR_HEIGHT *2, anchor)
}


}
                
            

