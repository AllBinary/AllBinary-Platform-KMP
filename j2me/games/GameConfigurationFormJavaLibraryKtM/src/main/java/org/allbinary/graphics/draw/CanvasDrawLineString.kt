
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
import org.allbinary.graphics.font.MyFont

open public class CanvasDrawLineString
            : Object
         {
        

    private var x: Int

    private var y: Int
public constructor        (x: Int, y: Int)
            : super()
        {

                    var x = x


                    var y = y
this.x= x
this.y= y
}


    private val drawStringUtil: DrawStringUtil = DrawStringUtil.getInstance()!!

open fun paint(graphics: Graphics, string: String, line: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var string = string


                    var line = line

    var myFont: MyFont = MyFont.getInstance()!!

drawStringUtil!!.drawCenterString(graphics, string, 0, string.length, x, y +(line *myFont!!.DEFAULT_CHAR_HEIGHT))
}


}
                
            

