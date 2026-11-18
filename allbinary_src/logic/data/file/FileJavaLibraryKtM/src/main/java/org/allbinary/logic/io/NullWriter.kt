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
import java.io.Writer

open public class NullWriter : Writer {

    companion object {

        val NULL_WRITER: NullWriter = NullWriter()
    }

    // Auto Generated
    public constructor() : super() {}

    @Throws(IOException::class)
    override fun write(c: Int)
        // nullable = true from not(false or (false and false)) = true
    {
        // var c = c
    }

    @Throws(IOException::class)
    override fun write(cbuf: CharArray, off: Int, len: Int)
        // nullable = true from not(false or (false and false)) = true
    {
        // var cbuf = cbuf
        // var off = off
        // var len = len
    }

    @Throws(IOException::class)
    override fun write(str: String)
        // nullable = true from not(false or (false and false)) = true
    {
        // var str = str
    }

    @Throws(IOException::class)
    override fun write(str: String, off: Int, len: Int)
        // nullable = true from not(false or (false and false)) = true
    {
        // var str = str
        // var off = off
        // var len = len
    }

    @Throws(IOException::class)
    override fun flush()
        // nullable = true from not(false or (false and true)) = true
    {}

    override fun close()
        // nullable = true from not(false or (false and true)) = true
    {}
}
