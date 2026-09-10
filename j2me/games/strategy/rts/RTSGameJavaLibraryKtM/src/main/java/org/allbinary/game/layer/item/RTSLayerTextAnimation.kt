/*
 *
 *  AllBinary Open License Version 1
 *  Copyright (c) 2003 AllBinary
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
package org.allbinary.game.layer.item

import javax.microedition.lcdui.Font
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.Image
import org.allbinary.animation.Animation
import org.allbinary.graphics.font.MyFontProcessor
import org.allbinary.graphics.font.UpdateMyFontInterface
import org.allbinary.graphics.font.UpdateMyFontProcessor

open public class RTSLayerTextAnimation : Animation, UpdateMyFontInterface {

    private val image: Image

    private val text: String

    private var myFontProcessor: MyFontProcessor = UpdateMyFontProcessor(this)

    private var fontHeight: Int = 0

    public constructor(text: String, image: Image) {
        // var text = text
        // var image = image
        this.text = text
        this.image = image
    }

    override fun updateMeasurement(graphics: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        // var graphics = graphics

        var font: Font = graphics.getFont()!!

        this.fontHeight = font.getHeight()
        this.myFontProcessor = MyFontProcessor.getInstance()
    }

    override fun paintXY(graphics: Graphics, x: Int, y: Int)
        // nullable = true from not(false or (false and false)) = true
    {
        var graphics = graphics
        var x = x
        var y = y
        this.myFontProcessor!!.process(graphics)
        super.paintXY(graphics, x, y)

        var adjustedCostY: Int = this.image.getHeight() - this.fontHeight

        graphics.drawString(this.text, x, y + adjustedCostY, 0)
    }
}
