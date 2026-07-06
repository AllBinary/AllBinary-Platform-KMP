/*
 *
 *  AllBinary Open License Version 1
 *  Copyright (c) 2025 AllBinary
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
package org.allbinary.graphics.font

import java.lang.Object
import javax.microedition.lcdui.Font
import javax.microedition.lcdui.Graphics

open public class MyFontProcessor : Object {

    companion object {

        open fun defaultCharWidth(
            font: Font
        )
            // nullable = true from not(false or (false and false)) = true
            : Int {
            // var font = font

            // if statement needs to be on the same line and ternary does not work the same way.
            return font.charWidth('C')
        }

        open fun defaultStringWidth(
            font: Font,
            size: Int,
        )
            // nullable = true from not(false or (false and false)) = true
            : Int {
            // var font = font
            // var size = size

            // if statement needs to be on the same line and ternary does not work the same way.
            return MyFontProcessor.defaultCharWidth(font) * size
        }

        private val instance: MyFontProcessor = MyFontProcessor()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : MyFontProcessor {

            // if statement needs to be on the same line and ternary does not work the same way.
            return instance
        }
    }

    // Auto Generated
    public constructor() : super() {}

    open fun process(graphics: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        // var graphics = graphics
    }
}
