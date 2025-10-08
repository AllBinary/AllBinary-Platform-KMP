
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
import org.allbinary.graphics.Anchor
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.color.ColorChangeEvent
import org.allbinary.graphics.color.ColorChangeListener
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.MyFont
import org.allbinary.graphics.paint.Paintable
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.util.BasicArrayList

open public class HighScoresPaintable : Paintable
                , ColorChangeListener {
        

    private val displayInfoSingleton: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!

    private var basicColor: BasicColor = BasicColorFactory.getInstance()!!.WHITE

    private var highScores: HighScores = NullHighScoresSingletonFactory.getInstance()!!
public constructor (){
}


    override fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{
var eventObject = eventObject

    var colorChangeEvent: ColorChangeEvent = eventObject as ColorChangeEvent

this.basicColor= colorChangeEvent!!.getBasicColorP()
}


    private var anchor: Int = Anchor.TOP_LEFT

    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics

    var charHeight: Int = MyFont.getInstance()!!.DEFAULT_CHAR_HEIGHT


    var width: Int = this.displayInfoSingleton!!.getLastWidth()!!


    var height: Int = this.displayInfoSingleton!!.getLastHeight()!!

graphics.setColor(getBasicColorP()!!.toInt())

    var heading: String = this.highScores!!.getHeading()!!


    var topScoresWidth: Int = (graphics.getFont()!!.stringWidth(heading) shr 1)

graphics.drawString(heading, (width shr 1) -topScoresWidth, charHeight, anchor)
graphics.drawString(this.highScores!!.getColumnOneHeading(), 10, charHeight *3, anchor)

    var columnTwoHeading: String = this.highScores!!.getColumnTwoHeading()!!


    var columnTwoHeadingWidth: Int = graphics.getFont()!!.stringWidth(columnTwoHeading)!!

graphics.drawString(columnTwoHeading, width -10 -columnTwoHeadingWidth, charHeight *3, anchor)

    var index: Int = 4


    var largestSecondColumnWidth: Int = columnTwoHeadingWidth


    var list: BasicArrayList = this.highScores!!.getList()!!


    var size: Int = list.size()!!


    var vectorIndex: Int = 0


        while(vectorIndex < size && charHeight *index < height -(charHeight *2))
        {

    var highScore: HighScore = list.objectArray[vectorIndex]!! as HighScore


    var nextScoreWidth: Int = graphics.getFont()!!.stringWidth(highScore!!.getScoreString())!!


    
                        if(nextScoreWidth > largestSecondColumnWidth)
                        
                                    {
                                    largestSecondColumnWidth= nextScoreWidth

                                    }
                                
vectorIndex++
}

vectorIndex= 0

        while(vectorIndex < size && charHeight *index < height -(charHeight *2))
        {

    var highScore: HighScore = list.objectArray[vectorIndex]!! as HighScore

graphics.drawString(highScore!!.getName(), 10, charHeight *index, anchor)
graphics.drawString(highScore!!.getScoreString(), width -10 -largestSecondColumnWidth, charHeight *index, anchor)
index++
vectorIndex++
}

}


    override fun setBasicColorP(basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{
var basicColor = basicColor
this.basicColor= basicColor
}


    open fun getBasicColorP()
        //nullable = true from not(false or (false and true)) = true
: BasicColor{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return basicColor
}


    open fun setHighScores(highScores: HighScores)
        //nullable = true from not(false or (false and false)) = true
{
var highScores = highScores
this.highScores= highScores
}


}
                
            

