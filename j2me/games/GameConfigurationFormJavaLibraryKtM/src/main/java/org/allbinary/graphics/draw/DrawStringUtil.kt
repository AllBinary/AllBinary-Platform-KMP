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
package org.allbinary.graphics.draw

import java.lang.Object
import javax.microedition.lcdui.Graphics
import kotlin.Array
import org.allbinary.graphics.Anchor
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil

open public class DrawStringUtil : Object {

    companion object {

        private val instance: DrawStringUtil = DrawStringUtil()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : DrawStringUtil {

            // if statement needs to be on the same line and ternary does not work the same way.
            return DrawStringUtil.instance
        }
    }

    // Auto Generated
    public constructor() : super() {}

    private val EMPTY_STRING: String = StringUtil.getInstance()!!.EMPTY_STRING

    private var anchor: Int = Anchor.TOP_LEFT

    open fun drawCenterString(
        graphics: Graphics,
        string: String,
        offset: Int,
        length: Int,
        x: Int,
        y: Int,
    )
        // nullable = true from not(false or (false and false)) = true
    {
        // var graphics = graphics
        // var string = string
        // var offset = offset
        var length = length
        var x = x
        var y = y

        var width: Int = (graphics.getFont()!!.substringWidth(string, offset, length) shr 1)

        try {
            graphics.drawSubstring(string, offset, length, x - width, y, this.anchor)
        } catch (e: Exception) {
            PreLogUtil.put(
                StringMaker()
                    .append("Exception: stringLength: ")!!
                    .appendint(string.length)!!
                    .append(" offset: ")!!
                    .appendint(offset)!!
                    .append(" currentLength: ")!!
                    .appendint(length)!!
                    .toString(),
                this,
                "drawCenterString",
            )
        }
    }

    open fun drawCenterStrings(
        graphics: Graphics,
        stringArray: Array<String?>,
        maxWidth: Int,
        charHeight: Int,
        x: Int,
        y: Int,
    )
        // nullable = true from not(false or (false and false)) = true
    {
        // var graphics = graphics
        // var stringArray = stringArray
        // var maxWidth = maxWidth
        // var charHeight = charHeight
        // var x = x
        // var y = y

        var extraLines: Int = 0

        for (index in 0 until stringArray!!.size) {

            var string: String = stringArray[index]!!

            if (string != this.EMPTY_STRING) {

                var width: Int = graphics.getFont()!!.stringWidth(string)!!

                var minTotalLines: Int = 1

                if (width > maxWidth) {

                    minTotalLines = (width / maxWidth) + 1
                }

                var linePortion: Int = string.length / minTotalLines

                var offset: Int = 0

                var currentLength: Int = linePortion

                var size: Int = string.length!!

                while (offset < size) {

                    if (offset + currentLength > size) {

                        currentLength = size - offset
                    }

                    if (offset + currentLength != size) {

                        while (
                            currentLength > 0 && stringArray[index]!![offset + currentLength] != ' '
                        ) {
                            currentLength--
                        }

                        if (currentLength <= 4) {

                            currentLength = linePortion
                        }
                    }

                    this.drawCenterString(
                        graphics,
                        string,
                        offset,
                        currentLength,
                        x,
                        y + ((index + extraLines++) * charHeight),
                    )
                    offset = offset + currentLength
                    currentLength = linePortion
                }

                extraLines--
            }
        }
    }
}
