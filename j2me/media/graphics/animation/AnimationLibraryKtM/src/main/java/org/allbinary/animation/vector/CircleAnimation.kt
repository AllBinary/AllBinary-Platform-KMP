
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.animation.Animation
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.ColorCompositeInterface
import org.allbinary.math.AngleFactory

open public class CircleAnimation : Animation
                , ColorCompositeInterface {
        

    val TOTAL_ANGLE: Int = AngleFactory.getInstance()!!.TOTAL_ANGLE.toInt()

    var width: Int

    var height: Int
public constructor (widthAndHeight: Int, basicColor: BasicColor){
var widthAndHeight = widthAndHeight
var basicColor = basicColor
this.width= widthAndHeight
this.height= widthAndHeight
this.setBasicColorP(basicColor)
}

public constructor (width: Int, height: Int, basicColor: BasicColor){
var width = width
var height = height
var basicColor = basicColor
this.width= width
this.height= height
this.setBasicColorP(basicColor)
}


    override fun nextFrame()
        //nullable = true from not(false or (false and true)) = true
{
}


    override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
var x = x
var y = y
this.basicSetColorUtil!!.setBasicColorP(graphics, this.getBasicColorP(), this.getColor())
graphics.drawArc(x, y, width, height, 0, TOTAL_ANGLE)
}


}
                
            

