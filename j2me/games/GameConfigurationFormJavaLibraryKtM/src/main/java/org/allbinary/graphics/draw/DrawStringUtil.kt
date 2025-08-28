
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
        package org.allbinary.graphics.draw




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.AndroidUtil
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.HTMLFeatureFactory
import org.allbinary.graphics.Anchor
import org.allbinary.graphics.font.MyFont
import org.allbinary.graphics.opengles.OpenGLFeatureUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil

open public class DrawStringUtil
            : Object
         {
        

        companion object {
            
    private val instance: DrawStringUtil = DrawStringUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: DrawStringUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun paintVerticle(graphics: Graphics, string: String, x: Int, y: Int, anchor: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
    //var string = string
    //var x = x
    //var y = y
    //var anchor = anchor

    var myFont: MyFont = MyFont.getInstance()!!


    var openGLFeatureUtil: OpenGLFeatureUtil = OpenGLFeatureUtil.getInstance()!!


    var charHeight: Int = myFont!!.DEFAULT_CHAR_HEIGHT


    var features: Features = Features.getInstance()!!


    var isHTML: Boolean = features.isDefault(HTMLFeatureFactory.getInstance()!!.HTML)!!


    var offsetY: Int = 0


    
                        if(isHTML)
                        
                                    {
                                    charHeight += 1

                                    }
                                
                             else 
    
                        if(openGLFeatureUtil!!.isAnyThreed())
                        
                                    {
                                    charHeight += 2

    
                        if(AndroidUtil.isAndroid())
                        
                                    {
                                    
                                    }
                                
                        else {
                            offsetY= 2 +(charHeight *2 /3)

                        }
                            

                                    }
                                

    var size: Int = string.length!!


    var offsetX: Int = 0


    var aChar: Char





                        for (index in size -1 downTo 0)

        {
aChar= string[index]

    
                        if(openGLFeatureUtil!!.isAnyThreed())
                        
                                    {
                                    offsetX= myFont!!.charWidth(aChar) /2

                                    }
                                
graphics.drawChar(aChar, x +offsetX, y +(charHeight *index) +offsetY, anchor)
}

}


    private var anchor: Int = Anchor.TOP_LEFT

open fun drawCenterString(graphics: Graphics, string: String, offset: Int, length: Int, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
    //var string = string
    //var offset = offset
var length = length
var x = x
var y = y

    var width: Int = (graphics.getFont()!!.substringWidth(string, offset, length) shr 1)


        try {
            graphics.drawSubstring(string, offset, length, x -width, y, anchor)
} catch(e: Exception)
            {
PreLogUtil.put(StringMaker().
                            append("Exception: stringLength: ")!!.append(string.length)!!.append(" offset: ")!!.append(offset)!!.append(" currentLength: ")!!.append(length)!!.toString(), this, "drawCenterString")
}

}


    private val EMPTY_STRING: String = StringUtil.getInstance()!!.EMPTY_STRING

open fun drawCenterStrings(graphics: Graphics, stringArray: Array<String?>, maxWidth: Int, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
    //var stringArray = stringArray
    //var maxWidth = maxWidth
    //var x = x
    //var y = y

    var myFont: MyFont = MyFont.getInstance()!!


    var charHeight: Int = myFont!!.DEFAULT_CHAR_HEIGHT


    var extraLines: Int = 0





                        for (index in 0 until stringArray!!.size)

        {

    var string: String = stringArray[index]!!


    
                        if(string != EMPTY_STRING)
                        
                                    {
                                    
    var width: Int = graphics.getFont()!!.stringWidth(string)!!


    var minTotalLines: Int = 1


    
                        if(width > maxWidth)
                        
                                    {
                                    minTotalLines= (width /maxWidth) +1

                                    }
                                

    var linePortion: Int = string.length /minTotalLines


    var offset: Int = 0


    var currentLength: Int = linePortion


    var size: Int = string.length!!


        while(offset < size)
        {

    
                        if(offset +currentLength > size)
                        
                                    {
                                    currentLength= size -offset

                                    }
                                

    
                        if(offset +currentLength != size)
                        
                                    {
                                    
        while(currentLength > 0 && stringArray[index]!![offset +currentLength] != ' ')
        {
currentLength--
}


    
                        if(currentLength <= 4)
                        
                                    {
                                    currentLength= linePortion

                                    }
                                

                                    }
                                
this.drawCenterString(graphics, string, offset, currentLength, x, y +((index +extraLines++) *charHeight))
offset= offset +currentLength
currentLength= linePortion
}

extraLines--

                                    }
                                
}

}


}
                
            

