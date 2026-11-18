/* Generated Code Do Not Modify */
package org.allbinary.graphics

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import java.io.IOException
import java.io.InputStream
import javax.microedition.lcdui.Image
import org.allbinary.platform.graphics.PlatformBitmapBase
import org.allbinary.platform.graphics.PlatformBitmapBaseFactory
import org.microemu.android.device.AndroidImageInterface

open public class OpenGLBitmapFactory : PlatformBitmapBaseFactory {

    companion object {

        private val instance: OpenGLBitmapFactory = OpenGLBitmapFactory()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : OpenGLBitmapFactory {

            // if statement needs to be on the same line and ternary does not work the same way.
            return OpenGLBitmapFactory.instance
        }
    }

    // Auto Generated
    public constructor() : super() {}

    val ARGB_8888: OpenGLBitmapConfig = OpenGLBitmapConfig(Bitmap.Config.ARGB_8888)

    open fun createBitmap(
        width: Int,
        height: Int,
        config: OpenGLBitmapConfig,
    )
        // nullable = true from not(false or (false and false)) = true
        : OpenGLBitmap {
        var width = width
        var height = height
        var config = config

        // if statement needs to be on the same line and ternary does not work the same way.
        return OpenGLBitmap(Bitmap.createBitmap(width, height, config.bitmapConfig))
    }

    @Throws(IOException::class)
    open fun decodeStream(
        inputStream: InputStream
    )
        // nullable = true from not(false or (false and false)) = true
        : OpenGLBitmap {
        var inputStream = inputStream

        // if statement needs to be on the same line and ternary does not work the same way.
        return OpenGLBitmap(BitmapFactory.decodeStream(inputStream))
    }

    override fun createBitmap(
        image: Image
    )
        // nullable = true from not(false or (false and false)) = true
        : PlatformBitmapBase {
        // var image = image

        // if statement needs to be on the same line and ternary does not work the same way.
        return OpenGLBitmap((image as AndroidImageInterface).getBitmap())
    }
}
