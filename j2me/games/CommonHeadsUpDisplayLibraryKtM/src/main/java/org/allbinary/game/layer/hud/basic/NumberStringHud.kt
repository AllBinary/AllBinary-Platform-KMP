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
package org.allbinary.game.layer.hud.basic

import javax.microedition.lcdui.Font
import javax.microedition.lcdui.Graphics
import org.allbinary.game.graphics.hud.BasicHud
import org.allbinary.game.graphics.hud.BasicHudFactory
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.font.MyFontProcessor
import org.allbinary.graphics.paint.PaintableInterface
import org.allbinary.logic.math.PrimitiveLongSingleton
import org.allbinary.logic.math.PrimitiveLongUtil

open public class NumberStringHud : BasicHud, PaintableInterface {

    private val primitiveLongUtil: PrimitiveLongUtil

    private val prependString: String

    private val PREPEND_STRING: CharArray

    private var value: Int

    private var max: Int

    private var offset: Int = 0

    private var valueString: CharArray

    private var valueTotalDigits: Int = 0

    public constructor(
        prependString: String,
        max: Int,
        location: Int,
        direction: Int,
        bufferZone: Int,
        basicColor: BasicColor,
    ) : super(location, direction, bufferZone, basicColor) {
        // var prependString = prependString
        // var max = max
        // var location = location
        // var direction = direction
        // var bufferZone = bufferZone
        // var basicColor = basicColor

        // For kotlin this is before the body of the constructor.

        this.prependString = prependString
        this.PREPEND_STRING = prependString!!.toCharArray()
        this.valueString = PrimitiveLongSingleton.getInstance()!!.NUMBER_CHAR_ARRAYS[0]!!
        this.primitiveLongUtil = PrimitiveLongUtil.createPowerOfTen(max + 1)
        this.max = max
        this.value = 0

        if (direction == 0) {

            throw RuntimeException(BasicHudFactory.getInstance()!!.DIRECTION_EXCEPTION)
        }
    }

    override fun updateMeasurement(graphics: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        // var graphics = graphics

        var font: Font = graphics.getFont()!!

        this.offset = font.stringWidth(this.prependString) + MyFontProcessor.defaultCharWidth(font)
        super.updateMeasurement(graphics)
    }

    open fun get()
    // nullable = true from not(false or (false and true)) = true
    : Int {

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.value
    }

    open fun add(value: Int)
        // nullable = true from not(false or (false and false)) = true
    {
        // var value = value
        this.set(this.value + value)
    }

    open fun set(value: Int)
        // nullable = true from not(false or (false and false)) = true
    {
        // var value = value
        this.value = value

        if (this.value > this.max) {

            this.value = 0
        }

        this.valueString = this.primitiveLongUtil!!.getCharArray(this.value)
        this.valueTotalDigits = this.primitiveLongUtil!!.getCurrentTotalDigits()
    }

    open fun reduce(value: Int)
        // nullable = true from not(false or (false and false)) = true
    {
        // var value = value
        this.set(this.value - value)
    }

    override fun paint(graphics: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        // var graphics = graphics
        super.paintDX(
            graphics,
            this.PREPEND_STRING,
            0,
            this.PREPEND_STRING.size,
            this.valueString,
            0,
            this.valueTotalDigits,
            this.offset,
        )
    }

    open fun paintXY(graphics: Graphics, x: Int, y: Int)
        // nullable = true from not(false or (false and false)) = true
    {
        // var graphics = graphics
        // var x = x
        // var y = y
        this.myFontProcessor!!.process(graphics)

        var charArray: CharArray = this.PREPEND_STRING

        var len: Int = this.PREPEND_STRING.size

        var charArray2: CharArray = this.valueString

        var len2: Int = this.valueTotalDigits

        this.basicSetColorUtil!!.setBasicColorP(graphics, this.getBasicColorP())
        graphics.drawChars(charArray, 0, len, x, y, 0)
        graphics.drawChars(charArray2, 0, len2, x - this.offset, y, 0)
    }

    override fun paintThreed(graphics: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        // var graphics = graphics
    }
}
