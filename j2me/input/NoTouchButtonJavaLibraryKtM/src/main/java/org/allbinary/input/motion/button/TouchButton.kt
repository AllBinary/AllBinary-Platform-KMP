
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
        package org.allbinary.input.motion.button




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.animation.Animation
import org.allbinary.animation.AnimationInterface
import org.allbinary.graphics.CellPosition
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.RectangleFactory
import org.allbinary.graphics.paint.Paintable
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings

open public class TouchButton : Paintable {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val touchButtonInput: TouchButtonInput

    private val animationInterface: Animation

    val rawRectangle: Rectangle

    val xBorder: Int

    val yBorder: Int

    var rectangle: Rectangle = RectangleFactory.SINGLETON

    val cellPosition: CellPosition

    var animationX: Int= 0

    var animationY: Int= 0
public constructor (touchButtonInput: TouchButtonInput, animationInterface: AnimationInterface, rawRectangle: Rectangle, cellPosition: CellPosition, xBorder: Int, yBorder: Int){
var touchButtonInput = touchButtonInput
var animationInterface = animationInterface
var rawRectangle = rawRectangle
var cellPosition = cellPosition
var xBorder = xBorder
var yBorder = yBorder
this.touchButtonInput= touchButtonInput
this.animationInterface= animationInterface as Animation
this.rawRectangle= rawRectangle
this.cellPosition= cellPosition
this.xBorder= xBorder
this.yBorder= yBorder
this.updateRectangle()
logUtil!!.put(StringMaker().
                            append("Created: ")!!.append(this.toString())!!.toString(), this, this.commonStrings!!.CONSTRUCTOR)
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
this.animationInterface!!.paint(graphics, animationX, animationY)
}


    open fun updateRectangle()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            
    var x: Int = this.rawRectangle!!.getWidth() *cellPosition!!.getColumn()


    var y: Int = this.rawRectangle!!.getHeight() *cellPosition!!.getRow()

this.rectangle= Rectangle(PointFactory.getInstance()!!.getInstance(x +xBorder, y +yBorder), this.rawRectangle!!.getWidth(), this.rawRectangle!!.getHeight())

    var point: GPoint = rectangle.getPoint()!!

this.animationX= point.getX()
this.animationY= point.getY()
} catch(e: Exception)
            {
logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "updateRectangle", e)
}

}


    open fun getCellPositionP()
        //nullable = true from not(false or (false and true)) = true
: CellPosition{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cellPosition
}


    open fun getRectangleP()
        //nullable = true from not(false or (false and true)) = true
: Rectangle{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rectangle
}


    open fun getTouchButtonInput()
        //nullable = true from not(false or (false and true)) = true
: TouchButtonInput{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return touchButtonInput
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var stringBuffer: StringMaker = StringMaker()


    var stringUtil: StringUtil = StringUtil.getInstance()!!

stringBuffer!!.append("TouchButton: ")
stringBuffer!!.append(stringUtil!!.toString(this.rectangle))
stringBuffer!!.append(" CellPosition: ")
stringBuffer!!.append(stringUtil!!.toString(this.cellPosition))
stringBuffer!!.append(" xBorder: ")
stringBuffer!!.append(this.xBorder)
stringBuffer!!.append(" yBorder: ")
stringBuffer!!.append(this.yBorder)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

