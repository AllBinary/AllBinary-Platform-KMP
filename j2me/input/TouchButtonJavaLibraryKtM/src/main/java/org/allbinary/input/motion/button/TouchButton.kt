
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
import org.allbinary.animation.FeaturedAnimationInterfaceFactoryInterfaceFactory
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

    private val hintAnimationInterface: Animation

    val rawRectangle: Rectangle

    val xBorder: Int

    val yBorder: Int

    var rectangleP: Rectangle = RectangleFactory.SINGLETON

    val cellPositionP: CellPosition

    var animationX: Int= 0

    var animationY: Int= 0

    var hintAnimationY: Int= 0
public constructor        (touchButtonInput: TouchButtonInput, touchButtonResource: TouchButtonResource, rawRectangle: Rectangle, cellPosition: CellPosition, xBorder: Int, yBorder: Int)                        

                            : this(touchButtonInput, FeaturedAnimationInterfaceFactoryInterfaceFactory.getInstance()!!.get(touchButtonResource!!.RESOURCE)!!.getInstance(0), FeaturedAnimationInterfaceFactoryInterfaceFactory.getInstance()!!.get(touchButtonResource!!.HINT)!!.getInstance(0), rawRectangle, cellPosition, xBorder, yBorder)

        Updates for KMP build        
        {
var touchButtonInput = touchButtonInput
var touchButtonResource = touchButtonResource
var rawRectangle = rawRectangle
var cellPosition = cellPosition
var xBorder = xBorder
var yBorder = yBorder


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (touchButtonInput: TouchButtonInput, animationInterface: Animation, hintAnimationInterface: Animation, rawRectangle: Rectangle, cellPosition: CellPosition, xBorder: Int, yBorder: Int)

        Updates for KMP build        
        {
var touchButtonInput = touchButtonInput
var animationInterface = animationInterface
var hintAnimationInterface = hintAnimationInterface
var rawRectangle = rawRectangle
var cellPosition = cellPosition
var xBorder = xBorder
var yBorder = yBorder
this.touchButtonInput= touchButtonInput
this.animationInterface= animationInterface
this.hintAnimationInterface= hintAnimationInterface
this.rawRectangle= rawRectangle
this.cellPositionP= cellPosition
this.xBorder= xBorder
this.yBorder= yBorder
this.updateRectangle()
logUtil!!.put(StringMaker().
                            append("Created: ")!!.append(this.toString())!!.toString(), this, commonStrings!!.CONSTRUCTOR)
}


open fun paintHint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graphics = graphics
this.hintAnimationInterface!!.paint(graphics, animationX, this.hintAnimationY)
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graphics = graphics
this.animationInterface!!.paint(graphics, animationX, animationY)
}


open fun updateRectangle()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

        try {
            
    var x: Int = this.rawRectangle!!.getWidth() *cellPositionP!!.getColumn()


    var y: Int = this.rawRectangle!!.getHeight() *cellPositionP!!.getRow()

this.rectangleP= Rectangle(PointFactory.getInstance()!!.getInstance(x +xBorder, y +yBorder), this.rawRectangle!!.getWidth(), this.rawRectangle!!.getHeight())

    var point: GPoint = rectangleP!!.getPoint()!!

this.animationX= point.getX()
this.animationY= point.getY()
this.hintAnimationY= animationY -32
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put(commonStrings!!.EXCEPTION, this, "updateRectangle", e)
}

}


open fun getCellPosition()
        //nullable = true from not(false or (false and true)) = true
: CellPosition

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cellPositionP
}


open fun getRectangle()
        //nullable = true from not(false or (false and true)) = true
: Rectangle

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rectangleP
}


open fun getTouchButtonInput()
        //nullable = true from not(false or (false and true)) = true
: TouchButtonInput

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return touchButtonInput
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        {

    var stringBuffer: StringMaker = StringMaker()


    var stringUtil: StringUtil = StringUtil.getInstance()!!

stringBuffer!!.append("TouchButton: ")
stringBuffer!!.append(stringUtil!!.toString(this.getRectangle()))
stringBuffer!!.append(" CellPosition: ")
stringBuffer!!.append(stringUtil!!.toString(this.cellPositionP))
stringBuffer!!.append(" xBorder: ")
stringBuffer!!.append(this.xBorder)
stringBuffer!!.append(" yBorder: ")
stringBuffer!!.append(this.yBorder)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

