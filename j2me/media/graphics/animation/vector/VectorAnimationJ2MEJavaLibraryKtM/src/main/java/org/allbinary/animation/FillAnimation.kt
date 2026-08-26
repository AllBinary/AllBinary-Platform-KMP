/* Generated Code Do Not Modify */
package org.allbinary.animation

import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.color.BasicColor

open public class FillAnimation : IndexedAnimation {

    private val pixelBuffer: IntArray

    private val width: Int

    private val height: Int

    public constructor(
        pixelBuffer: IntArray,
        width: Int,
        height: Int,
        animationBehavior: AnimationBehavior,
    ) : super(animationBehavior) {
        // var pixelBuffer = pixelBuffer
        // var width = width
        // var height = height
        // var animationBehavior = animationBehavior

        // For kotlin this is before the body of the constructor.

        this.width = 100
        this.height = 100
        this.pixelBuffer = pixelBuffer
    }

    override fun setBasicColorP(basicColor: BasicColor)
        // nullable = true from not(false or (false and false)) = true
    {
        // var basicColor = basicColor

        var changed: Boolean = false

        if (
            this.getBasicColorP() == null || this.getBasicColorP()!!.toInt() != basicColor!!.toInt()
        ) {
            changed = true
        }

        super.setBasicColorP(basicColor)

        if (changed) {

            this.updateModifiers()
        }
    }

    override fun changeBasicColor(basicColor: BasicColor)
        // nullable = true from not(false or (false and false)) = true
    {
        // var basicColor = basicColor

        var changed: Boolean = false

        if (
            this.getChangeBasicColor() == null ||
                this.getChangeBasicColor()!!.toInt() != basicColor!!.toInt()
        ) {
            changed = true
        }

        super.changeBasicColor(basicColor)

        if (changed) {

            this.updateModifiers()
        }
    }

    override fun setAlpha(alpha: Int)
        // nullable = true from not(false or (false and false)) = true
    {
        // var alpha = alpha

        var changed: Boolean = false

        if (this.alphaP != alpha) {

            changed = true
        }

        super.setAlpha(alpha)

        if (changed) {

            this.updateModifiers()
        }
    }

    override fun setScale(scaleX: Float, scaleY: Float)
        // nullable = true from not(false or (false and false)) = true
    {
        // var scaleX = scaleX
        // var scaleY = scaleY
    }

    override fun setMaxScale(maxScaleX: Float, maxScaleY: Float)
        // nullable = true from not(false or (false and false)) = true
    {
        // var maxScaleX = maxScaleX
        // var maxScaleY = maxScaleY
    }

    open fun updateModifiers()
        // nullable = true from not(false or (false and true)) = true
    {}

    open fun paint(g: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        var g = g
        g.drawRGB(pixelBuffer, 0, width, 0, 0, width, height, true)
    }
}
