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
package org.allbinary.game.layer

import javax.microedition.lcdui.Font
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.logic.NullUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonSeps
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListD

open public class MultiSelectPaintable : SelectionHudPaintable {

    private val rootNameList: BasicArrayList = BasicArrayListD()

    private var totalCharArray: CharArray = NullUtil.getInstance()!!.NULL_CHAR_ARRAY

    private var rootNamesString: String = StringUtil.getInstance()!!.EMPTY_STRING

    private val TOTAL: String = "Total Selected: "

    private val backgroundColor: Int = BasicColorFactory.getInstance()!!.GREY.toInt()!!

    private var totalWidth: Int = 0

    private var textLine2Y: Int = 0

    public constructor() {}

    override fun updateMeasurement(graphics: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        // var graphics = graphics
        super.updateMeasurement(graphics)

        var font: Font = graphics.getFont()!!

        this.totalWidth = font.stringWidth(this.TOTAL)
        this.textLine2Y = (this.y + font.getHeight())
    }

    open fun update(list: BasicArrayList)
        // nullable = true from not(false or (false and false)) = true
    {
        var list = list
        this.clear()

        var size: Int = list.size()!!

        this.totalCharArray = this.getPrimitiveLongUtil()!!.getCharArray(size)

        for (index in list.size() - 1 downTo 0) {

            var rtsLayer: RTSLayer = list.get(index) as RTSLayer

            if (!this.rootNameList!!.contains(rtsLayer!!.getRootName())) {

                this.rootNameList!!.add(rtsLayer!!.getRootName())
            }
        }

        var COMMA_SEP: String = CommonSeps.getInstance()!!.COMMA_SEP

        var stringBuffer: StringMaker = StringMaker()

        for (index in this.rootNameList!!.size() - 1 downTo 0) {

            var rootName: String = this.rootNameList!!.get(index) as String

            stringBuffer!!.append(rootName)

            if (index != 0) {

                stringBuffer!!.append(COMMA_SEP)
            }
        }

        this.rootNamesString = stringBuffer!!.toString()
    }

    open fun clear()
        // nullable = true from not(false or (false and true)) = true
    {
        this.rootNameList!!.clear()
    }

    override fun paint(graphics: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        var graphics = graphics
        graphics.setColor(this.backgroundColor)
        graphics.drawRect(this.getX(), this.y, this.getWidth(), this.getHeight())
        graphics.setColor(this.getColor())
        graphics.drawString(this.TOTAL, this.textX, this.y, 0)
        graphics.drawChars(
            this.totalCharArray,
            0,
            this.getPrimitiveLongUtil()!!.getCurrentTotalDigits(),
            this.textX + this.totalWidth,
            this.y,
            0,
        )
        graphics.drawString(this.rootNamesString, this.textX, this.textLine2Y, 0)
    }
}
