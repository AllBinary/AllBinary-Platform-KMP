/* Generated Code Do Not Modify */
package org.allbinary.graphics.form.item

import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.font.MyFontProcessor
import org.allbinary.graphics.font.UpdateMyFontInterface
import org.allbinary.graphics.font.UpdateMyFontProcessor

open public class CustomCustomItem : ABCustomItem, UpdateMyFontInterface {

    val updateMyFontProcessor: MyFontProcessor = UpdateMyFontProcessor(this)

    var myFontProcessor: MyFontProcessor = this.updateMyFontProcessor

    protected constructor(
        label: String,
        backgroundBasicColor: BasicColor,
        foregroundBasicColor: BasicColor,
    ) : super(label, backgroundBasicColor, foregroundBasicColor) {
        var label = label
        var backgroundBasicColor = backgroundBasicColor
        var foregroundBasicColor = foregroundBasicColor

        // For kotlin this is before the body of the constructor.

    }

    override fun updateMeasurement(graphics: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        // var graphics = graphics
    }
}
