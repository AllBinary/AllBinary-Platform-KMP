/* Generated Code Do Not Modify */
package org.allbinary.graphics.form.item

import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.color.BasicColor

open public class ABTextItem : CustomCustomItem, ABCustomItemInterface {

    public constructor(
        label: String,
        layout: Int,
        altText: String,
        backgroundBasicColor: BasicColor,
        foregroundBasicColor: BasicColor,
    ) : super(label, backgroundBasicColor, foregroundBasicColor) {
        var label = label
        var layout = layout
        var altText = altText
        var backgroundBasicColor = backgroundBasicColor
        var foregroundBasicColor = foregroundBasicColor

        // For kotlin this is before the body of the constructor.

    }

    open fun keyPressed(keyCode: Int)
        // nullable = true from not(false or (false and false)) = true
    {
        var keyCode = keyCode
    }

    override fun paintUnselected(graphics: Graphics, x: Int, y: Int)
        // nullable = true from not(false or (false and false)) = true
    {
        var graphics = graphics
        var x = x
        var y = y
    }

    open fun getLabelStringComponent()
    // nullable = true from not(false or (false and true)) = true
    : ABStringComponent {

        // if statement needs to be on the same line and ternary does not work the same way.
        return ABStringComponent.NULL_STRING_COMPONENT
    }
}
