
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
import org.allbinary.graphics.font.MyFont
import org.allbinary.graphics.paint.Paintable

open public class AboutPaintable : Paintable {
        
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
            
    private val ABOUT: String = CanvasStrings.getInstance()!!.ABOUT

    private val info: Array<String?>

    private val developers: Array<String?>

    private val paintableArray: Array<Paintable?> = arrayOf(this)
private constructor (info: Array<String?>, developers: Array<String?>){
var info = info
var developers = developers
this.info= info
this.developers= developers
}


    open fun getPaintableArrayInstance()
        //nullable = true from not(false or (false and true)) = true
: Array<Paintable?>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return paintableArray
}


    private var anchor: Int = Anchor.TOP_LEFT

    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics

    var myFont: MyFont = MyFont.getInstance()!!


    var halfWidth: Int = DisplayInfoSingleton.getInstance()!!.getLastHalfWidth()!!


    var charHeight: Int = myFont!!.DEFAULT_CHAR_HEIGHT


    var font: Font = graphics.getFont()!!


    var beginWidth: Int = (font.stringWidth(this.ABOUT) shr 1)

graphics.drawString(this.ABOUT, halfWidth -beginWidth, 2 *charHeight, anchor)

    var infoSize: Int = this.info.size
                





                        for (index in 0 until infoSize)

        {
beginWidth= (font.stringWidth(this.info[index]!!) shr 1)
graphics.drawString(this.info[index]!!, halfWidth -beginWidth, (4 +index) *charHeight, anchor)
}


    var size: Int = this.developers.size
                





                        for (index in 0 until size)

        {
beginWidth= (font.stringWidth(this.developers[index]!!) shr 1)
graphics.drawString(this.developers[index]!!, halfWidth -beginWidth, (5 +infoSize +index) *charHeight, anchor)
}

}


}
                
            

