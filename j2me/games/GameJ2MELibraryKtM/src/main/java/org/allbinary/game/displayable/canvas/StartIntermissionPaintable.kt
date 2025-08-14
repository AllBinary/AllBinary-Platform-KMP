
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
        
import javax.microedition.lcdui.Font
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.Anchor
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.color.BasicColorSetUtil
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.FontDebugFactory
import org.allbinary.graphics.paint.InitUpdatePaintable
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil

open public class StartIntermissionPaintable : InitUpdatePaintable {
        

    val fontDebugFactory: FontDebugFactory = FontDebugFactory.getInstance()!!
            

    val basicSetColorUtil: BasicColorSetUtil = BasicColorSetUtil.getInstance()!!
            

    var gameCanvas: AllBinaryGameCanvas

    val stringArray: Array<String?>

    private var basicColor: BasicColor = BasicColorFactory.getInstance()!!.BLACK

    private var color: Int

    private val lineArray: IntArray

    val fontSize: Int

    val font: Font

    private var hasChanged: Boolean = true

    val lastWidth: IntArray
public constructor        (gameCanvas: AllBinaryGameCanvas, stringArray: Array<String?>, lineArray: IntArray, basicColor: BasicColor)                        

                            : this(gameCanvas, stringArray, lineArray, basicColor, Font.getDefaultFont()){

                    var gameCanvas = gameCanvas


                    var stringArray = stringArray


                    var lineArray = lineArray


                    var basicColor = basicColor


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (gameCanvas: AllBinaryGameCanvas, stringArray: Array<String?>, lineArray: IntArray, basicColor: BasicColor, font: Font){

                    var gameCanvas = gameCanvas


                    var stringArray = stringArray


                    var lineArray = lineArray


                    var basicColor = basicColor


                    var font = font
this.gameCanvas= gameCanvas
this.stringArray= stringArray
this.lastWidth= IntArray(this.stringArray!!.size)
this.setBasicColorP(basicColor)
this.color= basicColor!!.toInt()
this.lineArray= lineArray
this.fontSize= font.getSize()
this.font= font
}


    private var anchor: Int = Anchor.TOP_LEFT
override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics

    var existingFont: Font = graphics.getFont()!!
            

fontDebugFactory!!.setFont(this.font, graphics)

    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!
            

basicSetColorUtil!!.setBasicColorP(graphics, this.basicColor, this.color)

    var beginWidth: Int= 0





                        for (index in this.stringArray!!.size -1 downTo 0)


        {
    
                        if(hasChanged)
                        
                                    {
                                    this.lastWidth[index]= (graphics.getFont()!!.stringWidth(this.stringArray[index]!!) shr 1)

                                    }
                                
beginWidth= this.lastWidth[index]!!
graphics.drawString(this.stringArray[index]!!, displayInfo!!.getLastHalfWidth() -beginWidth, displayInfo!!.getLastHalfHeight() -lineArray[index], anchor)
}

hasChanged= false
fontDebugFactory!!.setFont(existingFont, graphics)
}


    private val BEGIN_LEVEL: String = "Begin Level "

    private val EMPTY_STRING: String = StringUtil.getInstance()!!.EMPTY_STRING
override fun update()
        //nullable = true from not(false or (false and true)) = true
{
    var level: Int = gameCanvas!!.getLayerManager()!!.getGameInfo()!!.getCurrentLevel()!!
            

this.stringArray[0]= StringMaker().
                            append(BEGIN_LEVEL)!!.append(level)!!.toString()




                        for (index in this.stringArray!!.size -1 downTo 1)


        {this.stringArray[index]= this.EMPTY_STRING
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


}
                
            

