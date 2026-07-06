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
package org.allbinary.logic.io.path

import java.lang.Object
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonSeps

open public class AbPathData : Object {

    companion object {

        private val instance: AbPathData = AbPathData()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : AbPathData {

            // if statement needs to be on the same line and ternary does not work the same way.
            return AbPathData.instance
        }
    }

    val EXTENSION_SEP: String = CommonSeps.getInstance()!!.PERIOD

    val SEPARATORCHAR: Char = '/'

    val SEPARATOR: String = CommonSeps.getInstance()!!.FORWARD_SLASH

    private constructor() : super() {}

    open fun getExtensionIndex(
        filePath: String
    )
        // nullable = true from not(false or (false and false)) = true
        : Int {
        var filePath = filePath

        var indexOfFileExtensionDelmiter: Int = filePath!!.lastIndexOf(this.EXTENSION_SEP)!!

        var indexOfLatDelimiter: Int = filePath!!.lastIndexOf(this.SEPARATORCHAR)!!

        if (indexOfFileExtensionDelmiter < 0) {

            // if statement needs to be on the same line and ternary does not work the same way.
            return -1
        }

        if (indexOfFileExtensionDelmiter < indexOfLatDelimiter) {

            // if statement needs to be on the same line and ternary does not work the same way.
            return -1
        }

        // if statement needs to be on the same line and ternary does not work the same way.
        return indexOfFileExtensionDelmiter
    }

    open fun getExtension(
        filePath: String
    )
        // nullable = true from not(false or (false and false)) = true
        : String {
        var filePath = filePath

        var indexOfFileExtensionDelmiter: Int = this.getExtensionIndex(filePath)!!

        var extension: String = StringUtil.getInstance()!!.EMPTY_STRING

        if (indexOfFileExtensionDelmiter >= 0) {

            extension = filePath!!.substring(indexOfFileExtensionDelmiter + 1)
        }

        // if statement needs to be on the same line and ternary does not work the same way.
        return extension
    }

    open fun removeNameFromPath(
        path: String,
        systemSep: Char,
    )
        // nullable = true from not(false or (false and false)) = true
        : String {
        // var path = path
        // var systemSep = systemSep

        var endIndex: Int = path.lastIndexOf(this.SEPARATOR)!!

        if (endIndex < 0) {

            endIndex = path.lastIndexOf(systemSep)
        }

        if (endIndex < 0) {

            // if statement needs to be on the same line and ternary does not work the same way.
            return StringUtil.getInstance()!!.EMPTY_STRING
        }

        if (path.length == endIndex + 1) {

            // if statement needs to be on the same line and ternary does not work the same way.
            return this.removeNameFromPath(path.substring(0, endIndex - 1), systemSep)
        } else {

            var pathWithoutName: String = path.substring(0, endIndex)!!

            // if statement needs to be on the same line and ternary does not work the same way.
            return pathWithoutName
        }
    }
}
