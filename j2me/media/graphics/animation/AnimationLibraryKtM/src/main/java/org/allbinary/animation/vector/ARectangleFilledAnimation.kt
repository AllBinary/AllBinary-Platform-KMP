/* Generated Code Do Not Modify */
package org.allbinary.animation.vector

import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.color.BasicColorFactory

open public class ARectangleFilledAnimation : RectangleFilledAnimation {

    var x: Int = 0

    var y: Int = 0

    public constructor() : super(0, 0, BasicColorFactory.getInstance()!!.BLACK) {

        // For kotlin this is before the body of the constructor.

    }

    override fun nextFrame()
        // nullable = true from not(false or (false and true)) = true
    {}

    override fun paintXY(graphics: Graphics, unusedX: Int, unusedY: Int)
        // nullable = true from not(false or (false and false)) = true
    {
        // var graphics = graphics
        // var unusedX = unusedX
        // var unusedY = unusedY
        super.paintXY(graphics, this.x, this.y)
    }
}
