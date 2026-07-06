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
package org.allbinary.logic.io.file

import java.lang.Object

open public class FilePathData : Object {

    companion object {

        private val instance: FilePathData = FilePathData()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : FilePathData {

            // if statement needs to be on the same line and ternary does not work the same way.
            return FilePathData.instance
        }
    }

    val SEPARATORCHAR: Char = '\\'

    var PATH_START: String = "\\\\"

    private constructor() : super() {}
}
