
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
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.MyFontProcessor
import org.allbinary.graphics.font.UpdateMyFontInterface
import org.allbinary.graphics.font.UpdateMyFontProcessor
import org.allbinary.graphics.paint.Paintable
//SwtToJ2ME
open public class FullScreenPaintable : Paintable
                , UpdateMyFontInterface {
        
companion object {
            
    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: FullScreenPaintable{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return FullScreenPaintable()
}


        }
            
    private val displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!

    private var myFontProcessor: MyFontProcessor = UpdateMyFontProcessor(this)

    private val FULLSCREEN_TEXT: String = "F11 - Toggle Fullscreen"

    private var anchor: Int = Anchor.TOP_LEFT

    private var Y: Int= 0

    private var beginWidth: Int= 0
private constructor (){
}


    override fun updateMeasurement(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics

    var font: Font = graphics.getFont()!!

this.Y= 4 *font.getHeight()
this.beginWidth= (font.stringWidth(this.FULLSCREEN_TEXT) shr 1)
this.myFontProcessor= MyFontProcessor.getInstance()
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
this.myFontProcessor!!.process(graphics)

    var halfWidth: Int = this.displayInfo!!.getLastHalfWidth()!!


    var height: Int = this.displayInfo!!.getLastHeight()!!

graphics.drawString(this.FULLSCREEN_TEXT, halfWidth -this.beginWidth, height -this.Y, this.anchor)
}


}
                
            

