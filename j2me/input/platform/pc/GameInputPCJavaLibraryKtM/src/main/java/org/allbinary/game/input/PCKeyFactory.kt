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
package org.allbinary.game.input

import java.lang.Object
import org.allbinary.math.PositionStrings
import org.allbinary.string.CommonPhoneStrings
import org.allbinary.string.CommonSeps

open public class PCKeyFactory : Object {

    companion object {

        private val SINGLETON: PCKeyFactory = PCKeyFactory()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : PCKeyFactory {

            // if statement needs to be on the same line and ternary does not work the same way.
            return PCKeyFactory.SINGLETON
        }
    }

    // Auto Generated
    public constructor() : super() {}

    private val keyEventWrapper: ABKeyEventWrapper = ABKeyEventWrapper.getInstance()!!

    val UNKNOWN: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_UNDEFINED, "UNKNOWN")

    val ENTER: PCGameKey = PCGameKey(5, "Enter")

    val _A: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_A, "A")

    val _B: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_B, "B")

    val _C: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_C, "C")

    val _D: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_D, "D")

    val _E: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_E, "E")

    val _F: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_F, "F")

    val _G: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_G, "G")

    val _H: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_H, "H")

    val _I: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_I, "I")

    val _J: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_J, "J")

    val _K: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_K, "K")

    val _L: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_L, "L")

    val _M: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_M, "M")

    val _N: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_N, "N")

    val _O: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_O, "O")

    val _P: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_P, "P")

    val _Q: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_Q, "Q")

    val _R: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_R, "R")

    val _S: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_S, "S")

    val _T: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_T, "T")

    val _U: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_U, "U")

    val _V: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_V, "V")

    val _W: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_W, "W")

    val _X: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_X, "X")

    val _Y: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_Y, "Y")

    val _Z: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_Z, "Z")

    val a: PCGameKey = PCGameKey(97, "a")

    val b: PCGameKey = PCGameKey(98, "b")

    val c: PCGameKey = PCGameKey(99, "c")

    val d: PCGameKey = PCGameKey(100, "d")

    val e: PCGameKey = PCGameKey(101, "e")

    val f: PCGameKey = PCGameKey(102, "f")

    val g: PCGameKey = PCGameKey(103, "g")

    val h: PCGameKey = PCGameKey(104, "h")

    val i: PCGameKey = PCGameKey(105, "i")

    val j: PCGameKey = PCGameKey(106, "j")

    val k: PCGameKey = PCGameKey(107, "k")

    val l: PCGameKey = PCGameKey(108, "l")

    val m: PCGameKey = PCGameKey(109, "m")

    val n: PCGameKey = PCGameKey(110, "n")

    val o: PCGameKey = PCGameKey(111, "o")

    val p: PCGameKey = PCGameKey(112, "p")

    val q: PCGameKey = PCGameKey(113, "q")

    val r: PCGameKey = PCGameKey(114, "r")

    val s: PCGameKey = PCGameKey(115, "s")

    val t: PCGameKey = PCGameKey(116, "t")

    val u: PCGameKey = PCGameKey(117, "u")

    val v: PCGameKey = PCGameKey(118, "v")

    val w: PCGameKey = PCGameKey(119, "w")

    val x: PCGameKey = PCGameKey(120, PositionStrings.getInstance()!!.X)

    val y: PCGameKey = PCGameKey(121, PositionStrings.getInstance()!!.Y)

    val z: PCGameKey = PCGameKey(122, "z")

    val ZERO: PCGameKey =
        PCGameKey(this.keyEventWrapper!!.VK_0, CommonPhoneStrings.getInstance()!!.ZERO)

    val ONE: PCGameKey =
        PCGameKey(this.keyEventWrapper!!.VK_1, CommonPhoneStrings.getInstance()!!.ONE)

    val TWO: PCGameKey =
        PCGameKey(this.keyEventWrapper!!.VK_2, CommonPhoneStrings.getInstance()!!.TWO)

    val THREE: PCGameKey =
        PCGameKey(this.keyEventWrapper!!.VK_3, CommonPhoneStrings.getInstance()!!.THREE)

    val FOUR: PCGameKey =
        PCGameKey(this.keyEventWrapper!!.VK_4, CommonPhoneStrings.getInstance()!!.FOUR)

    val FIVE: PCGameKey =
        PCGameKey(this.keyEventWrapper!!.VK_5, CommonPhoneStrings.getInstance()!!.FIVE)

    val SIX: PCGameKey =
        PCGameKey(this.keyEventWrapper!!.VK_6, CommonPhoneStrings.getInstance()!!.SIX)

    val SEVEN: PCGameKey =
        PCGameKey(this.keyEventWrapper!!.VK_7, CommonPhoneStrings.getInstance()!!.SEVEN)

    val EIGHT: PCGameKey =
        PCGameKey(this.keyEventWrapper!!.VK_8, CommonPhoneStrings.getInstance()!!.EIGHT)

    val NINE: PCGameKey =
        PCGameKey(this.keyEventWrapper!!.VK_9, CommonPhoneStrings.getInstance()!!.NINE)

    val DPAD_UP: PCGameKey =
        PCGameKey(this.keyEventWrapper!!.VK_UP, CommonPhoneStrings.getInstance()!!.UP)

    val DPAD_DOWN: PCGameKey =
        PCGameKey(this.keyEventWrapper!!.VK_DOWN, CommonPhoneStrings.getInstance()!!.DOWN)

    val DPAD_LEFT: PCGameKey =
        PCGameKey(this.keyEventWrapper!!.VK_LEFT, CommonPhoneStrings.getInstance()!!.LEFT)

    val DPAD_RIGHT: PCGameKey =
        PCGameKey(this.keyEventWrapper!!.VK_RIGHT, CommonPhoneStrings.getInstance()!!.RIGHT)

    val DPAD_UP2: PCGameKey = this.DPAD_UP

    val DPAD_DOWN2: PCGameKey = this.DPAD_DOWN

    val DPAD_LEFT2: PCGameKey = this.DPAD_LEFT

    val DPAD_RIGHT2: PCGameKey = this.DPAD_RIGHT

    val COMMA: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_COMMA, "COMMA")

    val SPACE: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_SPACE, "SPACE")

    val DEL: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_DELETE, "DEL")

    val STAR: PCGameKey = PCGameKey(42, CommonPhoneStrings.getInstance()!!.STAR)

    val QUESTION: PCGameKey = PCGameKey(47, "?")

    val PERIOD: PCGameKey =
        PCGameKey(this.keyEventWrapper!!.VK_PERIOD, CommonSeps.getInstance()!!.PERIOD)

    val ESCAPE: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_ESCAPE, "Esc")

    val BACK_SPACE: PCGameKey = PCGameKey(this.keyEventWrapper!!.VK_BACK_SPACE, "Backspace")

    open fun isSubmission(
        input: Input
    )
        // nullable = true from not(false or (false and false)) = true
        : Boolean {
        var input = input

        if (input == this.ENTER) {

            // if statement needs to be on the same line and ternary does not work the same way.
            return true
        }

        // if statement needs to be on the same line and ternary does not work the same way.
        return false
    }

    open fun isDelete(
        input: Input
    )
        // nullable = true from not(false or (false and false)) = true
        : Boolean {
        var input = input

        if (input == this.DEL) {

            // if statement needs to be on the same line and ternary does not work the same way.
            return true
        }

        // if statement needs to be on the same line and ternary does not work the same way.
        return false
    }

    open fun isBackSpace(
        input: Input
    )
        // nullable = true from not(false or (false and false)) = true
        : Boolean {
        var input = input

        if (input == this.BACK_SPACE) {

            // if statement needs to be on the same line and ternary does not work the same way.
            return true
        }

        // if statement needs to be on the same line and ternary does not work the same way.
        return false
    }

    open fun isUp(
        input: Input
    )
        // nullable = true from not(false or (false and false)) = true
        : Boolean {
        var input = input

        if (input == this.DPAD_UP || input == this.DPAD_UP2) {

            // if statement needs to be on the same line and ternary does not work the same way.
            return true
        }

        // if statement needs to be on the same line and ternary does not work the same way.
        return false
    }

    open fun isDown(
        input: Input
    )
        // nullable = true from not(false or (false and false)) = true
        : Boolean {
        var input = input

        if (input == this.DPAD_DOWN || input == this.DPAD_DOWN2) {

            // if statement needs to be on the same line and ternary does not work the same way.
            return true
        }

        // if statement needs to be on the same line and ternary does not work the same way.
        return false
    }

    open fun isLeft(
        input: Input
    )
        // nullable = true from not(false or (false and false)) = true
        : Boolean {
        var input = input

        if (input == this.DPAD_LEFT || input == this.DPAD_LEFT2) {

            // if statement needs to be on the same line and ternary does not work the same way.
            return true
        }

        // if statement needs to be on the same line and ternary does not work the same way.
        return false
    }

    open fun isRight(
        input: Input
    )
        // nullable = true from not(false or (false and false)) = true
        : Boolean {
        var input = input

        if (input == this.DPAD_RIGHT || input == this.DPAD_RIGHT2) {

            // if statement needs to be on the same line and ternary does not work the same way.
            return true
        }

        // if statement needs to be on the same line and ternary does not work the same way.
        return false
    }

    open fun isEnter(
        input: Input
    )
        // nullable = true from not(false or (false and false)) = true
        : Boolean {
        var input = input

        if (input == this.ENTER) {

            // if statement needs to be on the same line and ternary does not work the same way.
            return true
        }

        // if statement needs to be on the same line and ternary does not work the same way.
        return false
    }
}
