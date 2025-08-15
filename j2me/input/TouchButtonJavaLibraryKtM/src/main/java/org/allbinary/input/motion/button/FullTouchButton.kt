
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
        
import org.allbinary.animation.Animation
import org.allbinary.graphics.CellPosition
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.Rectangle
import org.allbinary.logic.communication.log.LogUtil

open public class FullTouchButton : TouchButton {
        
public constructor        (touchButtonInput: TouchButtonInput, touchButtonResource: TouchButtonResource, rawRectangle: Rectangle, cellPosition: CellPosition, xBorder: Int, yBorder: Int)                        

                            : super(touchButtonInput, touchButtonResource, rawRectangle, cellPosition, xBorder, yBorder){

                    var touchButtonInput = touchButtonInput


                    var touchButtonResource = touchButtonResource


                    var rawRectangle = rawRectangle


                    var cellPosition = cellPosition


                    var xBorder = xBorder


                    var yBorder = yBorder


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (touchButtonInput: TouchButtonInput, animationInterface: Animation, hintAnimationInterface: Animation, rawRectangle: Rectangle, cellPosition: CellPosition, xBorder: Int, yBorder: Int)                        

                            : super(touchButtonInput, animationInterface, hintAnimationInterface, rawRectangle, cellPosition, xBorder, yBorder){

                    var touchButtonInput = touchButtonInput


                    var animationInterface = animationInterface


                    var hintAnimationInterface = hintAnimationInterface


                    var rawRectangle = rawRectangle


                    var cellPosition = cellPosition


                    var xBorder = xBorder


                    var yBorder = yBorder


                            //For kotlin this is before the body of the constructor.
                    
}

override fun updateRectangle()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    var x: Int = this.rawRectangle!!.getWidth() *cellPositionP!!.getColumn()


    var y: Int = this.rawRectangle!!.getHeight() *cellPositionP!!.getRow()

this.rectangleP= Rectangle(PointFactory.getInstance()!!.getInstance(x, y), this.rawRectangle!!.getWidth() +(2 *xBorder), this.rawRectangle!!.getHeight() +(2 *yBorder))

    var point: GPoint = this.rectangleP!!.getPoint()!!
            

this.animationX= point.getX() +xBorder
this.animationY= point.getY() +yBorder
this.hintAnimationY= animationY -this.rectangleP!!.getHeight() shr 1
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, "updateRectangle", e)
}

}


}
                
            

