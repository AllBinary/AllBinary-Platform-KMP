
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
        package org.allbinary.graphics.paint




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Font
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.Anchor
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.MyFontProcessor
import org.allbinary.graphics.font.UpdateMyFontInterface
import org.allbinary.graphics.font.UpdateMyFontProcessor

open public class SimpleTextPaintable : Paintable
                , UpdateMyFontInterface {
        

    private val displayInfoSingleton: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!

    private val updateMyFontProcessor: MyFontProcessor = UpdateMyFontProcessor(this)

    private var myFontProcessor: MyFontProcessor = this.updateMyFontProcessor

    private var text: String

    private var basicColor: BasicColor

    private var topScoresWidth: Int = 0

    private var fontHeight: Int = 0

    private var anchor: Int = Anchor.TOP_LEFT
public constructor (text: String, basicColor: BasicColor){
    //var text = text
    //var basicColor = basicColor
this.text= text
this.basicColor= basicColor
}


    override fun updateMeasurement(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics

    var font: Font = graphics.getFont()!!

this.topScoresWidth= (font.stringWidth(this.text) shr 1)
this.fontHeight= font.getHeight()
this.myFontProcessor= MyFontProcessor.getInstance()
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
this.myFontProcessor!!.process(graphics)

    var width: Int = this.displayInfoSingleton!!.getLast()[this.displayInfoSingleton!!.WIDTH]!!

graphics.setColor(this.getBasicColorP()!!.toInt())
graphics.drawString(this.text, (width shr 1) -this.topScoresWidth, this.fontHeight, this.anchor)
}


    override fun setBasicColorP(basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{
    //var basicColor = basicColor
this.basicColor= basicColor
}


    open fun getBasicColorP()
        //nullable = true from not(false or (false and true)) = true
: BasicColor{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.basicColor
}


    open fun setText(text: String)
        //nullable = true from not(false or (false and false)) = true
{
    //var text = text
this.text= text
this.myFontProcessor= this.updateMyFontProcessor
}


    open fun getText()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.text
}


}
                
            

