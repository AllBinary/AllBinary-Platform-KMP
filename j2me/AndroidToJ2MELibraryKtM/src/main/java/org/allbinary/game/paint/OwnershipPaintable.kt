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
package org.allbinary.game.paint

import javax.microedition.lcdui.Font
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.Anchor
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.MyFontProcessor
import org.allbinary.graphics.font.UpdateMyFontInterface
import org.allbinary.graphics.font.UpdateMyFontProcessor
import org.allbinary.graphics.paint.Paintable
import org.allbinary.logic.communication.log.LogUtil

// AndroidToJ2ME
open public class OwnershipPaintable : Paintable, UpdateMyFontInterface {

    companion object {

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : OwnershipPaintable {

            // if statement needs to be on the same line and ternary does not work the same way.
            return OwnershipPaintable()
        }
    }

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!

    private var myFontProcessor: MyFontProcessor = UpdateMyFontProcessor(this)

    private val COPYRIGHT: String = "AllBinary Copyright (c) 2011"

    private var basicColor: BasicColor = BasicColorFactory.getInstance()!!.WHITE

    private var color: Int = this.basicColor!!.toInt()!!

    private var anchor: Int = Anchor.TOP_LEFT

    private var COPYRIGHT_Y: Int = 0

    private var beginWidth: Int = 0

    private constructor() {}

    override fun updateMeasurement(graphics: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        // var graphics = graphics

        var font: Font = graphics.getFont()!!

        this.COPYRIGHT_Y = 2 * font.getHeight()
        this.beginWidth = (font.stringWidth(this.COPYRIGHT) shr 1)
        this.myFontProcessor = MyFontProcessor.getInstance()
    }

    override fun setBasicColorP(basicColor: BasicColor)
        // nullable = true from not(false or (false and false)) = true
    {
        var basicColor = basicColor
        this.basicColor = basicColor
        this.color = basicColor!!.toInt()
    }

    open fun getBasicColorP()
    // nullable = true from not(false or (false and true)) = true
    : BasicColor {

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.basicColor
    }

    override fun paint(graphics: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        // var graphics = graphics
        this.myFontProcessor!!.process(graphics)
        graphics.setColor(this.color)

        var halfWidth: Int = this.displayInfo!!.getLastHalfWidth()!!

        var height: Int = this.displayInfo!!.getLastHeight()!!

        graphics.drawString(
            this.COPYRIGHT,
            halfWidth - this.beginWidth,
            height - COPYRIGHT_Y,
            this.anchor,
        )
    }
}
