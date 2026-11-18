/*
 *
 *  AllBinary Open License Version 1
 *  Copyright (c) 2026 AllBinary
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
package org.allbinary

import java.io.IOException
import java.io.InputStream
import java.lang.Object
import javax.microedition.lcdui.Form
import javax.microedition.lcdui.Image
import javax.microedition.lcdui.Item
import javax.microedition.media.Manager
import javax.microedition.media.MediaException
import javax.microedition.media.Player

// like microemu-playn, so the languages without overloading can be generated. J2ME uses the MIDP
// overloads.
open public class MIDPUtil : Object {

    companion object {

        private val instance: MIDPUtil = MIDPUtil()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : MIDPUtil {

            // if statement needs to be on the same line and ternary does not work the same way.
            return MIDPUtil.instance
        }
    }

    // Auto Generated
    public constructor() : super() {}

    open fun createImageWH(
        width: Int,
        height: Int,
    )
        // nullable = true from not(false or (false and false)) = true
        : Image {
        // var width = width
        // var height = height

        // if statement needs to be on the same line and ternary does not work the same way.
        return Image.createImage(width, height)
    }

    open fun createImageFromByteArray(
        imageData: ByteArray,
        imageOffset: Int,
        imageLength: Int,
    )
        // nullable = true from not(false or (false and false)) = true
        : Image {
        // var imageData = imageData
        // var imageOffset = imageOffset
        // var imageLength = imageLength

        // if statement needs to be on the same line and ternary does not work the same way.
        return Image.createImage(imageData, imageOffset, imageLength)
    }

    @Throws(IOException::class)
    open fun createImageFromInputStream(
        inputStream: InputStream
    )
        // nullable = true from not(false or (false and false)) = true
        : Image {
        // var inputStream = inputStream

        // if statement needs to be on the same line and ternary does not work the same way.
        return Image.createImage(inputStream)
    }

    @Throws(IOException::class, MediaException::class)
    open fun createPlayerFromInputStream(
        inputStream: InputStream,
        type: String,
    )
        // nullable = true from not(false or (false and false)) = true
        : Player {
        // var inputStream = inputStream
        // var type = type

        // if statement needs to be on the same line and ternary does not work the same way.
        return Manager.createPlayer(inputStream, type)
    }

    open fun appendItem(
        form: Form,
        item: Item,
    )
        // nullable = true from not(false or (false and false)) = true
        : Int {
        // var form = form
        // var item = item

        // if statement needs to be on the same line and ternary does not work the same way.
        return form.append(item)
    }
}
