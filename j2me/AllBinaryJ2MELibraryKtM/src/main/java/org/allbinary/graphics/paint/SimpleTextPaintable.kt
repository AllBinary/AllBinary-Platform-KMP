
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
        
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.Anchor
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.MyFont

open public class SimpleTextPaintable : Paintable {
        

    private var text: String

    private var basicColor: BasicColor
public constructor        (text: String, basicColor: BasicColor)

        Updates for KMP build        
        {
    //var text = text
    //var basicColor = basicColor
this.text= text
this.basicColor= basicColor
}


    private var anchor: Int = Anchor.TOP_LEFT

    private val displayInfoSingleton: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!
override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var graphics = graphics

    var myFont: MyFont = MyFont.getInstance()!!


    var width: Int = this.displayInfoSingleton!!.getLast()[this.displayInfoSingleton!!.WIDTH]!!


    var topScoresWidth: Int = (graphics.getFont()!!.stringWidth(this.text) shr 1)

graphics.setColor(this.getBasicColorP()!!.toInt())
graphics.drawString(this.text, (width shr 1) -topScoresWidth, myFont!!.DEFAULT_CHAR_HEIGHT *3, anchor)
}

override fun setBasicColorP(basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var basicColor = basicColor
this.basicColor= basicColor
}


open fun getBasicColorP()
        //nullable = true from not(false or (false and true)) = true
: BasicColor

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return basicColor
}


open fun setText(text: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var text = text
this.text= text
}


open fun getText()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return text
}


}
                
            

