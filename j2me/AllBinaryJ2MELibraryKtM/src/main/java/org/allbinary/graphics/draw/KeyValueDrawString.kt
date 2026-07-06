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
package org.allbinary.graphics.draw

import java.lang.Object
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.font.MyFontProcessor
import org.allbinary.graphics.font.UpdateMyFontInterface
import org.allbinary.graphics.font.UpdateMyFontProcessor
import org.allbinary.logic.string.StringUtil

open public class KeyValueDrawString : Object, UpdateMyFontInterface {

    private var myFontProcessor: MyFontProcessor = UpdateMyFontProcessor(this)

    private val LABEL: String

    private val labelX: Int

    private var valueX: Int = 0

    private var value: String = StringUtil.getInstance()!!.EMPTY_STRING

    public constructor(label: String, x: Int) : super() {
        var label = label
        var x = x
        this.LABEL = label
        this.labelX = x
    }

    override fun updateMeasurement(graphics: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        // var graphics = graphics

        var labelWidth: Int = graphics.getFont()!!.stringWidth(this.LABEL) - this.LABEL.length

        this.valueX = labelWidth + this.labelX
        this.myFontProcessor = MyFontProcessor.getInstance()
    }

    open fun paint(graphics: Graphics, y: Int)
        // nullable = true from not(false or (false and false)) = true
    {
        // var graphics = graphics
        // var y = y
        this.myFontProcessor!!.process(graphics)
        graphics.drawString(this.LABEL, this.labelX, y, 0)
        graphics.drawString(this.value, this.valueX, y, 0)
    }

    open fun update(value: String)
        // nullable = true from not(false or (false and false)) = true
    {
        var value = value

        if (value != null) {

            this.value = value
        }
    }
}
