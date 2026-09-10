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
package org.allbinary.game.paint.help

import javax.microedition.lcdui.Font
import javax.microedition.lcdui.Graphics
import kotlin.Array
import org.allbinary.graphics.Anchor
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.MyFontProcessor
import org.allbinary.graphics.font.UpdateMyFontInterface
import org.allbinary.graphics.font.UpdateMyFontProcessor
import org.allbinary.graphics.paint.Paintable
import org.allbinary.logic.NullUtil
import org.allbinary.logic.string.StringUtil

open public class HelpPaintable : Paintable, UpdateMyFontInterface {

    val displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!

    val updateMyFontProcessor: MyFontProcessor = UpdateMyFontProcessor(this)

    var myFontProcessor: MyFontProcessor = this.updateMyFontProcessor

    var anchor: Int = Anchor.TOP_LEFT

    val title: String

    var inputInfo: Array<String?> = StringUtil.getInstance()!!.getArrayInstance()!!

    var basicColor: BasicColor

    var titleBeginWidth: Int = 0

    private var beginWidthArray: IntArray = NullUtil.getInstance()!!.NULL_INT_ARRAY

    private var charHeight: Int = 0

    public constructor(title: String, backgroundBasicColor: BasicColor, basicColor: BasicColor) {
        // var title = title
        // var backgroundBasicColor = backgroundBasicColor
        // var basicColor = basicColor
        this.title = title
        this.basicColor = basicColor
    }

    override fun updateMeasurement(graphics: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        // var graphics = graphics

        var font: Font = graphics.getFont()!!

        this.titleBeginWidth = (font.stringWidth(this.title) shr 1)
        this.charHeight = font.getHeight()

        var size: Int = this.inputInfo!!.size

        for (index in 0 until size) {

            this.beginWidthArray[index] = (font.stringWidth(this.inputInfo[index]!!) shr 1)
        }

        this.myFontProcessor = MyFontProcessor.getInstance()
    }

    open fun setInputInfoP(inputInfo: Array<String?>)
        // nullable = true from not(false or (false and false)) = true
    {
        // var inputInfo = inputInfo
        this.inputInfo = inputInfo
        this.beginWidthArray = IntArray(this.inputInfo!!.size)
        this.myFontProcessor = this.updateMyFontProcessor
    }

    override fun paint(graphics: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        // var graphics = graphics
        this.myFontProcessor!!.process(graphics)

        var halfWidth: Int = this.displayInfo!!.getLastHalfWidth()!!

        graphics.setColor(this.basicColor!!.toInt())
        graphics.drawString(
            this.title,
            halfWidth - this.titleBeginWidth,
            this.charHeight,
            this.anchor,
        )

        var size: Int = this.inputInfo!!.size

        for (index in 0 until size) {

            graphics.drawString(
                this.inputInfo[index]!!,
                halfWidth - this.beginWidthArray[index],
                (index + 3) * this.charHeight,
                this.anchor,
            )
        }
    }
}
