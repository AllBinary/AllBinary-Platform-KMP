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
package org.allbinary.logic.io

import java.io.IOException
import java.io.Reader

open public class NullReader : Reader {

    companion object {

        val NULL_READER: NullReader = NullReader()
    }

    // Auto Generated
    public constructor() : super() {}

    @Throws(IOException::class)
    override fun read()
    // nullable = true from not(false or (false and true)) = true
    : Int {

        // if statement needs to be on the same line and ternary does not work the same way.
        return -1
    }

    @Throws(IOException::class)
    override fun read(
        cbuf: CharArray,
        off: Int,
        len: Int,
    )
        // nullable = true from not(false or (false and false)) = true
        : Int {
        // var cbuf = cbuf
        // var off = off
        // var len = len

        // if statement needs to be on the same line and ternary does not work the same way.
        return -1
    }

    @Throws(IOException::class)
    override fun ready()
    // nullable = true from not(false or (false and true)) = true
    : Boolean {

        // if statement needs to be on the same line and ternary does not work the same way.
        return false
    }

    @Throws(IOException::class)
    override fun skip(
        n: Long
    )
        // nullable = true from not(false or (false and false)) = true
        : Long {
        // var n = n

        // if statement needs to be on the same line and ternary does not work the same way.
        return 0L
    }

    override fun close()
        // nullable = true from not(false or (false and true)) = true
    {}
}
