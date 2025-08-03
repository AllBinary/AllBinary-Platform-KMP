
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Font
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.Anchor
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.MyFont
import org.allbinary.graphics.paint.Paintable

open public class FullScreenPaintable : Paintable {
        

        companion object {


open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: FullScreenPaintable{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return FullScreenPaintable()
}



        }
            
    private val FULLSCREEN_TEXT: String = "F11 - Toggle Fullscreen"
private constructor        (){}


    private var anchor: Int = Anchor.TOP_LEFT

open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics

    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!
            


    var halfWidth: Int = displayInfo!!.getLastHalfWidth()!!
            


    var height: Int = displayInfo!!.getLastHeight()!!
            


    var font: Font = graphics!!.getFont()!!
            


    var beginWidth: Int = (font!!.stringWidth(this.FULLSCREEN_TEXT) shr 1)


    var myFont: MyFont = MyFont.getInstance()!!
            


    var Y: Int = 4 *myFont!!.DEFAULT_CHAR_HEIGHT

graphics!!.drawString(this.FULLSCREEN_TEXT, halfWidth -beginWidth, height -Y, anchor)
}


}
                
            

