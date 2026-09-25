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
package org.allbinary

import java.lang.InterruptedException
import java.lang.Object
import java.lang.System

// None - Do not use
open public class TsUtil : Object {

    companion object {

        private val instance: TsUtil = TsUtil()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : TsUtil {

            // if statement needs to be on the same line and ternary does not work the same way.
            return TsUtil.instance
        }
    }

    // Auto Generated
    public constructor() : super() {}

    open fun hashCode(
        anyType: Any
    )
        // nullable = true from not(false or (false and false)) = true
        : Int {
        var anyType = anyType

        // if statement needs to be on the same line and ternary does not work the same way.
        return anyType!!.hashCode()
    }

    @Throws(InterruptedException::class)
    open fun waitFor(any: Any, timeoutMillis: Long)
        // nullable = true from not(false or (false and false)) = true
    {
        var any = any
        // var timeoutMillis = timeoutMillis

        var anyType: Object = any as Object

        anyType!!.wait(timeoutMillis)
    }

    open fun getRecord(
        anyType: Any,
        recordId: Int,
    )
        // nullable = true from not(false or (false and false)) = true
        : ByteArray {
        // var anyType = anyType
        // var recordId = recordId

        // if statement needs to be on the same line and ternary does not work the same way.
        return ByteArray(0)
    }

    open fun compareTo(
        a: String,
        b: String,
    )
        // nullable = true from not(false or (false and false)) = true
        : Int {
        // var a = a
        // var b = b

        // if statement needs to be on the same line and ternary does not work the same way.
        return a.compareTo(b)
    }

    open fun equalIgnoreCase(
        a: String,
        b: String,
    )
        // nullable = true from not(false or (false and false)) = true
        : Boolean {
        // var a = a
        // var b = b

        // if statement needs to be on the same line and ternary does not work the same way.
        return a.equals(b, ignoreCase = true)
    }

    open fun equalsNotstring(
        anyType: Any?,
        object2: Any?,
    )
        // nullable = true from not(false or (false and false)) = true
        : Boolean {
        // var anyType = anyType
        // var object2 = object2

        // if statement needs to be on the same line and ternary does not work the same way.
        return anyType!!.equals(object2)
    }

    open fun toNumberFromChar(
        value: Char
    )
        // nullable = true from not(false or (false and false)) = true
        : Int {
        // var value = value

        // if statement needs to be on the same line and ternary does not work the same way.
        return value.toInt()
    }

    open fun toNumber(
        value: Int
    )
        // nullable = true from not(false or (false and false)) = true
        : Int {
        // var value = value

        // if statement needs to be on the same line and ternary does not work the same way.
        return value
    }

    open fun getByteArray(
        string: String
    )
        // nullable = true from not(false or (false and false)) = true
        : ByteArray {
        // var string = string

        // if statement needs to be on the same line and ternary does not work the same way.
        return string.encodeToByteArray()
    }

    open fun isItemListener(
        owner: Any
    )
        // nullable = true from not(false or (false and false)) = true
        : Boolean {
        var owner = owner

        // if statement needs to be on the same line and ternary does not work the same way.
        return false
    }

    open fun printAvailableMethods(anyType: Any)
        // nullable = true from not(false or (false and false)) = true
    {
        var anyType = anyType
    }

    open fun gc()
        // nullable = true from not(false or (false and true)) = true
    {
        System.gc()
    }
}
