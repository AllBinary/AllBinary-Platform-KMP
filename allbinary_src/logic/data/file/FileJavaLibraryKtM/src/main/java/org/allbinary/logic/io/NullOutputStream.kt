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
import java.io.OutputStream

open public class NullOutputStream : OutputStream {

    companion object {

        val NULL_OUTPUT_STREAM: NullOutputStream = NullOutputStream()
    }

    // Auto Generated
    public constructor() : super() {}

    @Throws(IOException::class)
    override fun write(b: Int)
        // nullable = true from not(false or (false and false)) = true
    {
        // var b = b
    }

    @Throws(IOException::class)
    override fun write(b: ByteArray, off: Int, len: Int)
        // nullable = true from not(false or (false and false)) = true
    {
        // var b = b
        // var off = off
        // var len = len
    }

    override fun close()
        // nullable = true from not(false or (false and true)) = true
    {}
}
