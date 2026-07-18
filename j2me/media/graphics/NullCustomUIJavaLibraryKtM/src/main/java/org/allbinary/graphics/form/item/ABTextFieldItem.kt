/* Generated Code Do Not Modify */
package org.allbinary.graphics.form.item

import javax.microedition.lcdui.Canvas
import javax.microedition.lcdui.Font
import org.allbinary.graphics.color.BasicColor
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.util.visitor.Visitor

open public class ABTextFieldItem : ABTextItem {

    private var font: Font

    public constructor(
        canvas: Canvas,
        visitor: Visitor,
        label: String,
        value: String,
        maxSize: Int,
        layout: Int,
        altText: String,
        font: Font,
        backgroundBasicColor: BasicColor,
        foregroundBasicColor: BasicColor,
    ) : super(label, layout, altText, backgroundBasicColor, foregroundBasicColor) {
        var canvas = canvas
        var visitor = visitor
        var label = label
        var value = value
        var maxSize = maxSize
        var layout = layout
        var altText = altText
        // var font = font
        var backgroundBasicColor = backgroundBasicColor
        var foregroundBasicColor = foregroundBasicColor

        // For kotlin this is before the body of the constructor.

        this.font = font
    }

    override fun getLabel()
    // nullable = true from not(false or (false and true)) = true
    : String {

        // if statement needs to be on the same line and ternary does not work the same way.
        return StringUtil.getInstance()!!.EMPTY_STRING
    }

    override fun setLabel(label: String)
        // nullable = true from not(false or (false and false)) = true
    {
        var label = label
    }

    open fun getString()
    // nullable = true from not(false or (false and true)) = true
    : String {

        // if statement needs to be on the same line and ternary does not work the same way.
        return StringUtil.getInstance()!!.EMPTY_STRING
    }

    open fun setString(string: String)
        // nullable = true from not(false or (false and false)) = true
    {
        var string = string
    }

    open fun setFocus(state: Boolean)
        // nullable = true from not(false or (false and false)) = true
    {
        var state = state
    }

    open fun getFontHeight()
    // nullable = true from not(false or (false and true)) = true
    : Int {

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.font.getHeight()
    }

    open fun setBackgroundBasicColorP(basicColor: BasicColor)
        // nullable = true from not(false or (false and false)) = true
    {
        // var basicColor = basicColor
    }

    open fun setForegroundBasicColorP(basicColor: BasicColor)
        // nullable = true from not(false or (false and false)) = true
    {
        // var basicColor = basicColor
    }
}
