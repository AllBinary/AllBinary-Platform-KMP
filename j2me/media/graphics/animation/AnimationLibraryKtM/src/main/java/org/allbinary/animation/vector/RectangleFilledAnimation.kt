
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
        package org.allbinary.animation.vector



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.animation.Animation
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.ColorCompositeInterface

open public class RectangleFilledAnimation : Animation
                , ColorCompositeInterface {
        

    private var width: Int

    private var height: Int
public constructor        (width: Int, height: Int, basicColor: BasicColor){

                    var width = width


                    var height = height


                    var basicColor = basicColor
this.width= width
this.height= height
this.setBasicColorP(basicColor)
}

override fun nextFrame()
        //nullable = true from not(false or (false and true)) = true
{}

override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var x = x


                    var y = y
this.basicSetColorUtil!!.setBasicColorP(graphics, this.getBasicColorP(), this.getColor())
graphics!!.fillRect(x, y, width, height)
}


open fun setWidth(width: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var width = width
this.width= width
}


open fun setHeight(height: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var height = height
this.height= height
}


}
                
            

