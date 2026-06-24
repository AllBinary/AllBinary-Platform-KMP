
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
        package org.allbinary.game.paint




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Font
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.Anchor
import org.allbinary.graphics.displayable.CanvasStrings
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.MyFontProcessor
import org.allbinary.graphics.font.UpdateMyFontInterface
import org.allbinary.graphics.font.UpdateMyFontProcessor
import org.allbinary.graphics.paint.Paintable
//AndroidToJ2ME
open public class AboutPaintable : Paintable
                , UpdateMyFontInterface {
        
companion object {
            
    open fun getInstance(info: Array<String?>, developers: Array<String?>)
        //nullable =  from not(true or (false and false)) = 
: AboutPaintable{
var info = info
var developers = developers



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AboutPaintable(info, developers)
}


        }
            
    private val displayInfoSingleton: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!

    private val ABOUT: String = CanvasStrings.getInstance()!!.ABOUT

    private val info: Array<String?>

    private val developers: Array<String?>

    private val paintableArray: Array<Paintable?> = arrayOf(this)

    private var myFontProcessor: MyFontProcessor = UpdateMyFontProcessor(this)

    private var charHeight: Int= 0

    private var aboutBeginWidth: Int= 0

    private var infoBeginWidth: IntArray

    private var developersBeginWidth: IntArray

    private var anchor: Int = Anchor.TOP_LEFT
private constructor (info: Array<String?>, developers: Array<String?>){
var info = info
var developers = developers
this.info= info
this.infoBeginWidth= IntArray(this.info.size)
this.developers= developers
this.developersBeginWidth= IntArray(this.developers.size)
}


    override fun updateMeasurement(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics

    var font: Font = graphics.getFont()!!

this.charHeight= font.getHeight()
this.aboutBeginWidth= (font.stringWidth(this.ABOUT) shr 1)

    var infoSize: Int = this.info.size
                





                        for (index in 0 until infoSize)

        {
this.infoBeginWidth[index]= (font.stringWidth(this.info[index]!!) shr 1)
}


    var size: Int = this.developers.size
                





                        for (index in 0 until size)

        {
this.developersBeginWidth[index]= (font.stringWidth(this.developers[index]!!) shr 1)
}

this.myFontProcessor= MyFontProcessor.getInstance()
}


    open fun getPaintableArrayInstance()
        //nullable = true from not(false or (false and true)) = true
: Array<Paintable?>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.paintableArray
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
this.myFontProcessor!!.process(graphics)

    var halfWidth: Int = this.displayInfoSingleton!!.getLastHalfWidth()!!

graphics.drawString(this.ABOUT, halfWidth -this.aboutBeginWidth, 2 *this.charHeight, this.anchor)

    var infoSize: Int = this.info.size
                





                        for (index in 0 until infoSize)

        {
graphics.drawString(this.info[index]!!, halfWidth -this.infoBeginWidth[index], (4 +index) *this.charHeight, this.anchor)
}


    var size: Int = this.developers.size
                





                        for (index in 0 until size)

        {
graphics.drawString(this.developers[index]!!, halfWidth -this.developersBeginWidth[index], (5 +infoSize +index) *this.charHeight, this.anchor)
}

}


}
                
            

