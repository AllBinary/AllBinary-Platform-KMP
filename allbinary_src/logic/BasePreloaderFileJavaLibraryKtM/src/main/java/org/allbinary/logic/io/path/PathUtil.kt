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
import org.allbinary.logic.io.file.FilePathData
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.StringValidationUtil

// Used to correct user input for paths
open public class PathUtil : Object {

    companion object {

        private val instance: PathUtil = PathUtil()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : PathUtil {

            // if statement needs to be on the same line and ternary does not work the same way.
            return PathUtil.instance
        }
    }

    private val abPathData: AbPathData = AbPathData.getInstance()!!

    private val filePathData: FilePathData = FilePathData.getInstance()!!

    private constructor() : super() {}

    open fun getExtensionWithAbFilePath(
        abFilePath: AbFilePath
    )
        // nullable = true from not(false or (false and false)) = true
        : String {
        var abFilePath = abFilePath

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.abPathData!!.getExtension(abFilePath!!.toString())
    }

    open fun getExtensionWithAbPath(
        abPath: AbPath
    )
        // nullable = true from not(false or (false and false)) = true
        : String {
        var abPath = abPath

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.abPathData!!.getExtension(abPath!!.toString())
    }

    @Throws(Exception::class)
    open fun getWithoutExtensionWithAbFilePath(
        abFilePath: AbFilePath
    )
        // nullable = true from not(false or (false and false)) = true
        : String {
        var abFilePath = abFilePath

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.getWithoutExtension(abFilePath!!.toString())
    }

    @Throws(Exception::class)
    open fun getWithoutExtensionWithAbPath(
        abPath: AbPath
    )
        // nullable = true from not(false or (false and false)) = true
        : String {
        var abPath = abPath

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.getWithoutExtension(abPath!!.toString())
    }

    @Throws(Exception::class)
    open fun getWithoutExtension(
        filePath: String
    )
        // nullable = true from not(false or (false and false)) = true
        : String {
        var filePath = filePath

        var indexOfFileExtensionDelmiter: Int = this.abPathData!!.getExtensionIndex(filePath)!!

        var pathWithoutExtension: String = filePath

        if (indexOfFileExtensionDelmiter >= 0) {

            pathWithoutExtension = filePath!!.substring(0, indexOfFileExtensionDelmiter)
        }

        // if statement needs to be on the same line and ternary does not work the same way.
        return pathWithoutExtension
    }

    open fun isValid(
        path: String
    )
        // nullable = true from not(false or (false and false)) = true
        : Boolean {
        var path = path

        if (this.isValidStart(path)) {

            if (this.isValidEnd(path)) {

                // if statement needs to be on the same line and ternary does not work the same way.
                return true
            }
        }

        // if statement needs to be on the same line and ternary does not work the same way.
        return false
    }

    open fun isValidStart(
        path: String
    )
        // nullable = true from not(false or (false and false)) = true
        : Boolean {
        var path = path

        if (path[0] == this.abPathData!!.SEPARATORCHAR || path[0] == '.') {

            // if statement needs to be on the same line and ternary does not work the same way.
            return true
        } else {

            // if statement needs to be on the same line and ternary does not work the same way.
            return false
        }
    }

    open fun isValidEnd(
        path: String
    )
        // nullable = true from not(false or (false and false)) = true
        : Boolean {
        var path = path

        var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!

        if (stringValidationUtil!!.isEmpty(path)) {

            // if statement needs to be on the same line and ternary does not work the same way.
            return false
        }

        if (path[path.length - 1] == this.abPathData!!.SEPARATORCHAR) {

            // if statement needs to be on the same line and ternary does not work the same way.
            return true
        } else {

            // if statement needs to be on the same line and ternary does not work the same way.
            return false
        }
    }

    open fun adjustStart(
        path: String
    )
        // nullable = true from not(false or (false and false)) = true
        : String {
        var path = path

        if (!this.isValidStart(path)) {

            path = this.abPathData!!.SEPARATOR + path
        }

        // if statement needs to be on the same line and ternary does not work the same way.
        return path
    }

    open fun adjustEnd(
        path: String
    )
        // nullable = true from not(false or (false and false)) = true
        : String {
        var path = path

        if (!this.isValidEnd(path)) {

            path = path + this.abPathData!!.SEPARATOR
        }

        // if statement needs to be on the same line and ternary does not work the same way.
        return path
    }

    open fun adjust(
        path: String
    )
        // nullable = true from not(false or (false and false)) = true
        : String {
        var path = path

        var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!

        if (stringValidationUtil!!.isEmpty(path)) {

            // if statement needs to be on the same line and ternary does not work the same way.
            return this.abPathData!!.SEPARATOR
        }

        if (path.indexOf("\\") >= 0) {

            path = path.replace('\\', this.abPathData!!.SEPARATORCHAR)
        }

        // if statement needs to be on the same line and ternary does not work the same way.
        return path
    }

    @Throws(Exception::class)
    open fun removeNameFromPath(
        path: String
    )
        // nullable = true from not(false or (false and false)) = true
        : AbPath {
        var path = path

        var endIndex: Int = path.lastIndexOf(this.abPathData!!.SEPARATOR)!!

        if (endIndex < 0) {

            endIndex = path.lastIndexOf(this.filePathData!!.SEPARATORCHAR)
        }

        if (endIndex < 0) {

            // if statement needs to be on the same line and ternary does not work the same way.
            return AbPath.createAbPath()
        }

        if (path.length == endIndex + 1) {

            // if statement needs to be on the same line and ternary does not work the same way.
            return this.removeNameFromPath(path.substring(0, endIndex - 1))
        } else {

            var pathWithoutName: String = path.substring(0, endIndex)!!

            // if statement needs to be on the same line and ternary does not work the same way.
            return AbPath(pathWithoutName, StringUtil.getInstance()!!.EMPTY_STRING)
        }
    }
}
