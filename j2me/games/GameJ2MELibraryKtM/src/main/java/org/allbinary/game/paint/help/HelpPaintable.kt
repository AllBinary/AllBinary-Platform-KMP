
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
        package org.allbinary.game.paint.help



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.Anchor
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.MyFont
import org.allbinary.graphics.paint.Paintable
import org.allbinary.logic.string.StringUtil

open public class HelpPaintable : Paintable {
        

    var TITLE: String = "Help Screen"

    var inputInfo: Array<String?> = StringUtil.getInstance()!!.getArrayInstance()!!
            

    var basicColor: BasicColor
public constructor        (title: String, backgroundBasicColor: BasicColor, basicColor: BasicColor){

                    var title = title


                    var backgroundBasicColor = backgroundBasicColor


                    var basicColor = basicColor
this.TITLE= title
this.basicColor= basicColor
}

public constructor        (basicColor: BasicColor){

                    var basicColor = basicColor
this.basicColor= basicColor
}


open fun setInputInfoP(inputInfo: Array<String?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var inputInfo = inputInfo
this.inputInfo= inputInfo
}


open fun getHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{
    var myFont: MyFont = MyFont.getInstance()!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return myFont!!.DEFAULT_CHAR_HEIGHT *(this.inputInfo!!.size +2)
}


    private var anchor: Int = Anchor.TOP_LEFT
override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics

    var myFont: MyFont = MyFont.getInstance()!!
            


    var halfWidth: Int = DisplayInfoSingleton.getInstance()!!.getLastHalfWidth()!!
            


    var beginWidth: Int = (graphics!!.getFont()!!.stringWidth(this.TITLE) shr 1)

graphics!!.setColor(this.basicColor!!.toInt())

    var charHeight: Int = myFont!!.DEFAULT_CHAR_HEIGHT

graphics!!.drawString(this.TITLE, halfWidth -beginWidth, charHeight, anchor)

    var size: Int = inputInfo!!.size
                





                        for (index in 0 until size)


        {beginWidth= (graphics!!.getFont()!!.stringWidth(inputInfo[index]!!) shr 1)
graphics!!.drawString(inputInfo[index]!!, halfWidth -beginWidth, (index +3) *charHeight, anchor)
}

}


}
                
            

