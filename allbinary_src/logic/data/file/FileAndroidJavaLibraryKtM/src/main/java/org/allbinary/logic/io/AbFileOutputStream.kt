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
package org.allbinary.logic.io

import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.IOException
import java.io.OutputStream
import java.nio.channels.FileChannel
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.AbFileNativeUtil

open public class AbFileOutputStream : OutputStream {

    companion object {

        @Throws(FileNotFoundException::class)
        open fun createFromAbFile(
            file: AbFile
        )
            // nullable = true from not(false or (false and false)) = true
            : AbFileOutputStream {
            // var file = file

            // if statement needs to be on the same line and ternary does not work the same way.
            return AbFileOutputStream(FileOutputStream(AbFileNativeUtil.get(file)))
        }

        @Throws(FileNotFoundException::class)
        open fun createFromAbFileAppend(
            file: AbFile,
            append: Boolean,
        )
            // nullable = true from not(false or (false and false)) = true
            : AbFileOutputStream {
            // var file = file
            // var append = append

            // if statement needs to be on the same line and ternary does not work the same way.
            return AbFileOutputStream(FileOutputStream(file.getPath()))
        }

        @Throws(FileNotFoundException::class)
        open fun createFromFilePath(
            name: String
        )
            // nullable = true from not(false or (false and false)) = true
            : AbFileOutputStream {
            // var name = name

            // if statement needs to be on the same line and ternary does not work the same way.
            return AbFileOutputStream(FileOutputStream(name))
        }

        @Throws(FileNotFoundException::class)
        open fun createFromFilePathAppend(
            name: String,
            append: Boolean,
        )
            // nullable = true from not(false or (false and false)) = true
            : AbFileOutputStream {
            // var name = name
            // var append = append

            // if statement needs to be on the same line and ternary does not work the same way.
            return AbFileOutputStream(FileOutputStream(name))
        }
    }

    private var fileOutputStream: FileOutputStream

    public constructor(fileOutputStream: FileOutputStream) {
        var fileOutputStream = fileOutputStream
        this.fileOutputStream = fileOutputStream
    }

    override fun close()
        // nullable = true from not(false or (false and true)) = true
    {
        this.fileOutputStream!!.close()
    }

    open fun getChannel()
    // nullable = true from not(false or (false and true)) = true
    : FileChannel {

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.fileOutputStream!!.getChannel()
    }

    @Throws(IOException::class)
    override fun write(buffer: ByteArray)
        // nullable = true from not(false or (false and false)) = true
    {
        var buffer = buffer
        this.fileOutputStream!!.write(buffer)
    }

    @Throws(IOException::class)
    override fun write(buffer: ByteArray, offset: Int, count: Int)
        // nullable = true from not(false or (false and false)) = true
    {
        var buffer = buffer
        var offset = offset
        var count = count
        this.fileOutputStream!!.write(buffer, offset, count)
    }

    @Throws(IOException::class)
    override fun write(b: Int)
        // nullable = true from not(false or (false and false)) = true
    {
        var b = b
        this.fileOutputStream!!.write(b)
    }
}
