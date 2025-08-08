
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2003 AllBinary 
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
        package org.allbinary.game.layer.item



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.Image
import org.allbinary.animation.Animation
import org.allbinary.graphics.font.MyFont

open public class RTSLayerTextAnimation : Animation {
        

    private val myFont: MyFont = MyFont.getInstance()!!
            

    private val image: Image

    private val text: String
public constructor        (text: String, image: Image){

                    var text = text


                    var image = image
this.text= text
this.image= image
}


open fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var x = x


                    var y = y
super.paint(graphics, x, y)

    var adjustedCostY: Int = image.getHeight() -()

graphics.drawString(text, x, y +adjustedCostY, 0)
}


}
                
            

