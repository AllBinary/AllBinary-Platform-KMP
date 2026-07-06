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
import org.allbinary.logic.io.file.AbFile

open public class AbFileOutputStream : FileOutputStream {

    companion object {

        @Throws(FileNotFoundException::class)
        open fun createFromAbFile(
            file: AbFile
        )
            // nullable = true from not(false or (false and false)) = true
            : AbFileOutputStream {
            // var file = file

            // if statement needs to be on the same line and ternary does not work the same way.
            return AbFileOutputStream(file.getPath(), false)
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
            return AbFileOutputStream(file.getPath(), append)
        }

        @Throws(FileNotFoundException::class)
        open fun createFromFilePath(
            name: String
        )
            // nullable = true from not(false or (false and false)) = true
            : AbFileOutputStream {
            // var name = name

            // if statement needs to be on the same line and ternary does not work the same way.
            return AbFileOutputStream(name, false)
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
            return AbFileOutputStream(name, append)
        }
    }

    public constructor(name: String, append: Boolean) : super(name, append) {

        // var name = name
        // var append = append

        // For kotlin this is before the body of the constructor.

    }
}
