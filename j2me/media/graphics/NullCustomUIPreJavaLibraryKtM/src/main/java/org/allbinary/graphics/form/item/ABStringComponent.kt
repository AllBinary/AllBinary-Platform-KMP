/* Generated Code Do Not Modify */
package org.allbinary.graphics.form.item

import java.lang.Object
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory

open public class ABStringComponent : Object {

    companion object {

        val NULL_STRING_COMPONENT: ABStringComponent =
            ABStringComponent(
                BasicColorFactory.getInstance()!!.BLACK,
                BasicColorFactory.getInstance()!!.WHITE,
            )
    }

    open fun getBackgroundBasicColor()
    // nullable = true from not(false or (false and true)) = true
    : BasicColor {

        // if statement needs to be on the same line and ternary does not work the same way.
        return BasicColorFactory.getInstance()!!.WHITE
    }

    public constructor(
        backgroundBasicColor: BasicColor,
        foregroundBasicColor: BasicColor,
    ) : super() {
        // var backgroundBasicColor = backgroundBasicColor
        // var foregroundBasicColor = foregroundBasicColor
    }

    open fun getForegroundBasicColor()
    // nullable = true from not(false or (false and true)) = true
    : BasicColor {

        // if statement needs to be on the same line and ternary does not work the same way.
        return BasicColorFactory.getInstance()!!.WHITE
    }

    open fun setForegroundBasicColor(foregroundBasicColor: BasicColor)
        // nullable = true from not(false or (false and false)) = true
    {
        var foregroundBasicColor = foregroundBasicColor
    }
}
