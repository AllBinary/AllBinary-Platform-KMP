
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
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.MyFont
import org.allbinary.graphics.paint.Paintable
import org.allbinary.logic.communication.log.LogUtil

open public class OwnershipPaintable : Paintable {
        

        companion object {
            
open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: OwnershipPaintable{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return OwnershipPaintable()
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val COPYRIGHT: String = "AllBinary Copyright (c) 2011"

    private var basicColor: BasicColor = BasicColorFactory.getInstance()!!.WHITE

    private var color: Int = basicColor!!.toInt()!!
            
private constructor        (){}


    private var anchor: Int = Anchor.TOP_LEFT
override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
graphics.setColor(color)

    var myFont: MyFont = MyFont.getInstance()!!
            


    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!
            


    var halfWidth: Int = displayInfo!!.getLastHalfWidth()!!
            


    var height: Int = displayInfo!!.getLastHeight()!!
            


    var font: Font = graphics.getFont()!!
            


    var beginWidth: Int = (font.stringWidth(COPYRIGHT) shr 1)


    var COPYRIGHT_Y: Int = 2 *myFont!!.DEFAULT_CHAR_HEIGHT

graphics.drawString(COPYRIGHT, halfWidth -beginWidth, height -COPYRIGHT_Y, anchor)
}

override fun setBasicColorP(basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{

                    var basicColor = basicColor
this.basicColor= basicColor
color= basicColor!!.toInt()
}


open fun getBasicColorP()
        //nullable = true from not(false or (false and true)) = true
: BasicColor{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return basicColor
}


}
                
            

