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

import java.lang.Object
import javax.microedition.lcdui.Font
import javax.microedition.lcdui.TextField
import org.allbinary.animation.Animation
import org.allbinary.animation.AnimationInterfaceFactoryInterface
import org.allbinary.game.canvas.ABToGBUtil
import org.allbinary.game.displayable.canvas.AllBinaryGameCanvas
import org.allbinary.graphics.form.item.CustomTextBox
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.media.ScaleProperties

open public class CustomTextBoxIndexedAnimationFactory :
    Object, AnimationInterfaceFactoryInterface {

    val logUtil: LogUtil = LogUtil.getInstance()!!

    var scaleProperties: ScaleProperties

    private val maxLength: Int

    public constructor(fontSize: Int, maxLength: Int) : super() {
        // var fontSize = fontSize
        // var maxLength = maxLength
        this.scaleProperties = ScaleProperties()
        this.scaleProperties!!.scaleHeight = fontSize
        this.maxLength = maxLength
    }

    @Throws(Exception::class)
    override fun getInstance(
        instanceId: Int
    )
        // nullable =  from not(true or (false and false)) =
        : Animation {
        // var instanceId = instanceId

        var abToGBUtil: ABToGBUtil = ABToGBUtil.getInstance()!!

        var abCanvas: AllBinaryGameCanvas = abToGBUtil!!.abCanvas as AllBinaryGameCanvas

        var font: Font =
            Font.getFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN, this.scaleProperties!!.scaleHeight)!!

        var customTextBox: CustomTextBox =
            CustomTextBox2(
                abCanvas!!.getCustomCommandListener(),
                StringUtil.getInstance()!!.EMPTY_STRING,
                StringUtil.getInstance()!!.EMPTY_STRING,
                this.maxLength,
                TextField.ANY,
                font,
                abCanvas!!.getLayerManager()!!.getBackgroundBasicColor(),
                abCanvas!!.getLayerManager()!!.getForegroundBasicColor(),
            )

        // if statement needs to be on the same line and ternary does not work the same way.
        return CustomTextBoxIndexedAnimation(customTextBox)
    }

    override fun setInitialScale(scaleProperties: ScaleProperties)
        // nullable = true from not(false or (false and false)) = true
    {
        // var scaleProperties = scaleProperties

        var fontSize: Int = this.scaleProperties!!.scaleHeight

        this.scaleProperties = scaleProperties

        if (this.scaleProperties!!.scaleHeight < 6) {

            this.scaleProperties!!.scaleHeight = fontSize
        }
    }
}
