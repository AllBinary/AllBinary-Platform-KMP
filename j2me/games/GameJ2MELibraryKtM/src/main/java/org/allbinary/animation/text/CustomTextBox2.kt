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

import javax.microedition.lcdui.CommandListener
import javax.microedition.lcdui.Font
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.form.item.CustomTextBox

open public class CustomTextBox2 : CustomTextBox {

    public constructor(
        cmdListener: CommandListener,
        label: String,
        text: String,
        maxSize: Int,
        constraints: Int,
        font: Font,
        backgroundBasicColor: BasicColor,
        foregroundBasicColor: BasicColor,
    ) : super(
        cmdListener,
        label,
        text,
        maxSize,
        constraints,
        font,
        backgroundBasicColor,
        foregroundBasicColor,
    ) {
        // var cmdListener = cmdListener
        // var label = label
        // var text = text
        // var maxSize = maxSize
        // var constraints = constraints
        // var font = font
        // var backgroundBasicColor = backgroundBasicColor
        // var foregroundBasicColor = foregroundBasicColor

        // For kotlin this is before the body of the constructor.

        this.getTextFieldItem()!!.setFocus(true)
    }
}
