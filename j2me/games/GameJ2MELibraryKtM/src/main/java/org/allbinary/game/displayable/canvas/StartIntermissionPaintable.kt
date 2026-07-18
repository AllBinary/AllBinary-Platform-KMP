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
package org.allbinary.game.displayable.canvas

import javax.microedition.lcdui.Font
import javax.microedition.lcdui.Graphics
import kotlin.Array
import org.allbinary.graphics.Anchor
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.color.BasicColorSetUtil
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.FontDebugFactory
import org.allbinary.graphics.font.MyFontProcessor
import org.allbinary.graphics.font.UpdateMyFontInterface
import org.allbinary.graphics.font.UpdateMyFontProcessor
import org.allbinary.graphics.paint.InitUpdatePaintable
import org.allbinary.logic.NullUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil

open public class StartIntermissionPaintable : InitUpdatePaintable, UpdateMyFontInterface {

    val fontDebugFactory: FontDebugFactory = FontDebugFactory.getInstance()!!

    val basicSetColorUtil: BasicColorSetUtil = BasicColorSetUtil.getInstance()!!

    val gameCanvas: AllBinaryGameCanvas

    val stringArray: Array<String?>

    val fontSize: Int

    val font: Font

    val lastWidth: IntArray

    private val updateMyFontProcessor: MyFontProcessor = UpdateMyFontProcessor(this)

    private var myFontProcessor: MyFontProcessor = this.updateMyFontProcessor

    private var basicColor: BasicColor = BasicColorFactory.getInstance()!!.BLACK

    private var color: Int

    var lineYOffsetArray: IntArray = NullUtil.getInstance()!!.NULL_INT_ARRAY

    private var hasChanged: Boolean = true

    private var anchor: Int = Anchor.TOP_LEFT

    var fontHeightP: Int = 0

    public constructor(
        gameCanvas: AllBinaryGameCanvas,
        stringArray: Array<String?>,
        basicColor: BasicColor,
        font: Font,
    ) {
        // var gameCanvas = gameCanvas
        // var stringArray = stringArray
        // var basicColor = basicColor
        // var font = font
        this.gameCanvas = gameCanvas
        this.stringArray = stringArray
        this.lastWidth = IntArray(this.stringArray!!.size)
        this.setBasicColorP(basicColor)
        this.color = basicColor!!.toInt()
        this.fontSize = font.getSize()
        this.font = font
    }

    override fun updateMeasurement(graphics: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        // var graphics = graphics

        var font: Font = graphics.getFont()!!

        this.fontHeightP = font.getHeight()
        this.myFontProcessor = MyFontProcessor.getInstance()
    }

    override fun paint(graphics: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        var graphics = graphics
        this.myFontProcessor!!.process(graphics)

        var existingFont: Font = graphics.getFont()!!

        this.fontDebugFactory!!.setFont(this.font, graphics)

        var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!

        this.basicSetColorUtil!!.setBasicColorP3(graphics, this.basicColor, this.color)

        var beginWidth: Int = 0

        for (index in this.lineYOffsetArray!!.size - 1 downTo 0) {

            if (this.hasChanged) {

                this.lastWidth[index] =
                    (graphics.getFont()!!.stringWidth(this.stringArray[index]!!) shr 1)
            }

            beginWidth = this.lastWidth[index]!!
            graphics.drawString(
                this.stringArray[index]!!,
                displayInfo!!.getLastHalfWidth() - beginWidth,
                displayInfo!!.getLastHalfHeight() - this.lineYOffsetArray[index],
                this.anchor,
            )
        }

        this.hasChanged = false
        this.fontDebugFactory!!.setFont(existingFont, graphics)
    }

    private val BEGIN_LEVEL: String = "Begin Level "

    private val EMPTY_STRING: String = StringUtil.getInstance()!!.EMPTY_STRING

    override fun update()
        // nullable = true from not(false or (false and true)) = true
    {

        var level: Int = this.gameCanvas!!.getLayerManager()!!.getGameInfo()!!.getCurrentLevel()!!

        this.stringArray[0] = StringMaker().append(this.BEGIN_LEVEL)!!.appendint(level)!!.toString()

        for (index in this.stringArray!!.size - 1 downTo 1) {

            this.stringArray[index] = this.EMPTY_STRING
        }
    }

    override fun setBasicColorP(basicColor: BasicColor)
        // nullable = true from not(false or (false and false)) = true
    {
        var basicColor = basicColor
        this.basicColor = basicColor
    }

    open fun getBasicColorP()
    // nullable = true from not(false or (false and true)) = true
    : BasicColor {

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.basicColor
    }
}
