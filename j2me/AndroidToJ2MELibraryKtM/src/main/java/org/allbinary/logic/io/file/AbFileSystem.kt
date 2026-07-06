/*
 *
 *  AllBinary Open License Version 1
 *  Copyright (c) 2026 AllBinary
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
package org.allbinary.logic.io.file

import java.io.File
import java.lang.Object
import kotlin.Array
import org.allbinary.logic.string.StringUtil

open public class AbFileSystem : Object {

    companion object {

        open fun getFilesAsStringArrayForPath(
            currentDirPath: String
        )
            // nullable = true from not(false or (false and false)) = true
            : Array<String?> {
            // var currentDirPath = currentDirPath

            var file: File = File(currentDirPath)

            if (file.exists()) {

                // if statement needs to be on the same line and ternary does not work the same way.
                return file.list()
            } else {

                // if statement needs to be on the same line and ternary does not work the same way.
                return StringUtil.getInstance()!!.getArrayInstance()
            }
        }
    }

    // Auto Generated
    public constructor() : super() {}
}
