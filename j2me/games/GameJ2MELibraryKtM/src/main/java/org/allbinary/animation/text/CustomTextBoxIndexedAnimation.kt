/*
 *
 *  AllBinary Open License Version 1
 *  Copyright (c) 2022 AllBinary
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
package org.allbinary.animation.text

import javax.microedition.lcdui.Font
import javax.microedition.lcdui.Graphics
import org.allbinary.animation.AnimationBehavior
import org.allbinary.animation.IndexedAnimation
import org.allbinary.game.input.event.RawKeyEventListener
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.font.UpdateMyFontInterface
import org.allbinary.graphics.form.item.CustomTextBox
import org.allbinary.logic.string.StringUtil

open public class CustomTextBoxIndexedAnimation :
    IndexedAnimation, RawKeyEventListener, UpdateMyFontInterface, TextInterface {

    private val customTextBox: CustomTextBox

    private var lastText: String = StringUtil.getInstance()!!.INIT_STRING

    var hasChanged: Boolean = true

    private var textChangeListener: TextChangeListener = TextChangeListener.getInstance()!!

    public constructor(customTextBox: CustomTextBox) : super(AnimationBehavior.getInstance()) {

        // var customTextBox = customTextBox

        // For kotlin this is before the body of the constructor.

        this.customTextBox = customTextBox
    }

    override fun setBasicColorP(basicColor: BasicColor)
        // nullable = true from not(false or (false and false)) = true
    {
        // var basicColor = basicColor
        this.customTextBox!!.getTextFieldItem()!!.setForegroundBasicColorP(basicColor)
    }

    override fun setBackgroundBasicColorP(basicColor: BasicColor)
        // nullable = true from not(false or (false and false)) = true
    {
        // var basicColor = basicColor
        this.customTextBox!!.getTextFieldItem()!!.setBackgroundBasicColorP(basicColor)
    }

    override fun setTextWithOnMeasure(text: String, textChangeListener: TextChangeListener)
        // nullable = true from not(false or (false and false)) = true
    {
        // var text = text
        // var textChangeListener = textChangeListener
        this.setText(text)
        this.textChangeListener = textChangeListener
    }

    override fun updateMeasurement(graphics: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        // var graphics = graphics

        var font: Font = graphics.getFont()!!

        this.textChangeListener!!.onMeasure()
        this.textChangeListener = TextChangeListener.getInstance()
    }

    override fun setText(text: String)
        // nullable = true from not(false or (false and false)) = true
    {
        // var text = text

        if (this.lastText != text) {

            this.hasChanged = true
            this.lastText = text
            this.customTextBox!!.getTextFieldItem()!!.setString(text)
        }
    }

    override fun getText()
    // nullable = true from not(false or (false and true)) = true
    : String {

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.customTextBox!!.getTextFieldItem()!!.getString()
    }

    override fun onEventRaw(keyCode: Int, deviceId: Int, repeated: Boolean)
        // nullable = true from not(false or (false and false)) = true
    {
        // var keyCode = keyCode
        // var deviceId = deviceId
        // var repeated = repeated
        this.customTextBox!!.onEventRaw(keyCode, deviceId, repeated)
    }

    override fun getFontHeight()
    // nullable = true from not(false or (false and true)) = true
    : Int {

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.customTextBox!!.getTextFieldItem()!!.getFontHeight()
    }

    override fun paintXY(graphics: Graphics, x: Int, y: Int)
        // nullable = true from not(false or (false and false)) = true
    {
        var graphics = graphics
        var x = x
        var y = y
        this.customTextBox!!.paintXY(graphics, x, y)
    }

    override fun paintThreedXYZ(graphics: Graphics, x: Int, y: Int, z: Int)
        // nullable = true from not(false or (false and false)) = true
    {
        var graphics = graphics
        var x = x
        var y = y
        var z = z
    }
}
