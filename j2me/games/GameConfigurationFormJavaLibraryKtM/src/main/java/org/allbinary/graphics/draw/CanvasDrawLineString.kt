
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
        
import javax.microedition.lcdui.Font
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.font.MyFontProcessor
import org.allbinary.graphics.font.UpdateMyFontInterface
import org.allbinary.graphics.font.UpdateMyFontProcessor

open public class CanvasDrawLineString
            : Object
        
                , UpdateMyFontInterface {
        
companion object {
            
    val NULL_CANVAS_DRAW_LINE_STRING: CanvasDrawLineString = CanvasDrawLineString(0, 0)

        }
            
    private val drawStringUtil: DrawStringUtil = DrawStringUtil.getInstance()!!

    private var myFontProcessor: MyFontProcessor = UpdateMyFontProcessor(this)

    private var x: Int

    private var y: Int

    private var fontHeight: Int = 0
public constructor (x: Int, y: Int)
            : super()
        {
var x = x
var y = y
this.x= x
this.y= y
}


    override fun updateMeasurement(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics

    var font: Font = graphics.getFont()!!

this.fontHeight= font.getHeight()
this.myFontProcessor= MyFontProcessor.getInstance()
}


    open fun paint(graphics: Graphics, string: String, line: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
    //var string = string
    //var line = line
this.myFontProcessor!!.process(graphics)
this.drawStringUtil!!.drawCenterString(graphics, string, 0, string.length, this.x, this.y +(line *this.fontHeight))
}


}
                
            

