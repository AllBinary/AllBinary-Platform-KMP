/* Generated Code Do Not Modify */
package org.allbinary.game.input

import android.view.KeyEvent
import java.lang.Object
import javax.microedition.lcdui.Canvas

open public class AndroidNumberKeyToJ2MECanvasNumberKey : Object {

    companion object {

        private val androidtoJavaMicroEditionKeyMap: IntArray = IntArray(17)

        open fun init()
            // nullable = true from not(false or (false and true)) = true
        {
            AndroidNumberKeyToJ2MECanvasNumberKey.androidtoJavaMicroEditionKeyMap[
                    KeyEvent.KEYCODE_0] = Canvas.KEY_NUM0
            AndroidNumberKeyToJ2MECanvasNumberKey.androidtoJavaMicroEditionKeyMap[
                    KeyEvent.KEYCODE_1] = Canvas.KEY_NUM1
            AndroidNumberKeyToJ2MECanvasNumberKey.androidtoJavaMicroEditionKeyMap[
                    KeyEvent.KEYCODE_2] = Canvas.KEY_NUM2
            AndroidNumberKeyToJ2MECanvasNumberKey.androidtoJavaMicroEditionKeyMap[
                    KeyEvent.KEYCODE_3] = Canvas.KEY_NUM3
            AndroidNumberKeyToJ2MECanvasNumberKey.androidtoJavaMicroEditionKeyMap[
                    KeyEvent.KEYCODE_4] = Canvas.KEY_NUM4
            AndroidNumberKeyToJ2MECanvasNumberKey.androidtoJavaMicroEditionKeyMap[
                    KeyEvent.KEYCODE_5] = Canvas.KEY_NUM5
            AndroidNumberKeyToJ2MECanvasNumberKey.androidtoJavaMicroEditionKeyMap[
                    KeyEvent.KEYCODE_6] = Canvas.KEY_NUM6
            AndroidNumberKeyToJ2MECanvasNumberKey.androidtoJavaMicroEditionKeyMap[
                    KeyEvent.KEYCODE_7] = Canvas.KEY_NUM7
            AndroidNumberKeyToJ2MECanvasNumberKey.androidtoJavaMicroEditionKeyMap[
                    KeyEvent.KEYCODE_8] = Canvas.KEY_NUM8
            AndroidNumberKeyToJ2MECanvasNumberKey.androidtoJavaMicroEditionKeyMap[
                    KeyEvent.KEYCODE_9] = Canvas.KEY_NUM9
        }

        open fun getKey(
            key: Int
        )
            // nullable = true from not(false or (false and false)) = true
            : Int {
            var key = key

            if (
                key < AndroidNumberKeyToJ2MECanvasNumberKey.androidtoJavaMicroEditionKeyMap!!.size
            ) {

                var value: Int =
                    AndroidNumberKeyToJ2MECanvasNumberKey.androidtoJavaMicroEditionKeyMap[key]!!

                if (value != 0) {

                    // if statement needs to be on the same line and ternary does not work the same
                    // way.
                    return value
                }
            }

            // if statement needs to be on the same line and ternary does not work the same way.
            return key
        }
    }

    private constructor() : super() {}
}
