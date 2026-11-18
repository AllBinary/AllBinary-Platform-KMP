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

import java.io.File
import java.io.FileInputStream
import java.io.FileNotFoundException
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.AbFileNativeUtil

open public class AbFileInputStream : FileInputStream {

    companion object {

        @Throws(FileNotFoundException::class)
        open fun createFromAbFile(
            file: AbFile
        )
            // nullable = true from not(false or (false and false)) = true
            : AbFileInputStream {
            // var file = file

            // if statement needs to be on the same line and ternary does not work the same way.
            return AbFileInputStream(AbFileNativeUtil.get(file)!!.getPath())
        }

        @Throws(FileNotFoundException::class)
        open fun createFromFile(
            file: File
        )
            // nullable = true from not(false or (false and false)) = true
            : AbFileInputStream {
            // var file = file

            // if statement needs to be on the same line and ternary does not work the same way.
            return AbFileInputStream(file.getPath())
        }
    }

    public constructor(name: String) : super(name) {

        var name = name

        // For kotlin this is before the body of the constructor.

    }
}
