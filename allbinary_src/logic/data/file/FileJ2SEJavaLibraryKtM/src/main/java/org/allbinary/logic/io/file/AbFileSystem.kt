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
import java.io.FileInputStream
import java.io.InputStream
import java.lang.Object
import kotlin.Array
import org.allbinary.logic.NullUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings

// FileJ2SE should be the same as J2SEForJ2ME
open public class AbFileSystem : Object {

    companion object {

        private val instance: AbFileSystem = AbFileSystem()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : AbFileSystem {

            // if statement needs to be on the same line and ternary does not work the same way.
            return AbFileSystem.instance
        }
    }

    // Auto Generated
    public constructor() : super() {}

    private val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

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

    open fun readAsString(
        fileName: String
    )
        // nullable = true from not(false or (false and false)) = true
        : String {
        // var fileName = fileName

        var bytes: ByteArray = ByteArray(1000000)

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.readAsString(fileName, bytes)
    }

    open fun readAsString(
        fileName: String,
        bytes: ByteArray,
    )
        // nullable = true from not(false or (false and false)) = true
        : String {
        // var fileName = fileName
        // var bytes = bytes

        var closeable: Any = NullUtil.getInstance()!!.NULL_OBJECT

        try {

            var idFile: InputStream = FileInputStream(fileName)

            closeable = idFile

            var size: Int = idFile!!.read(bytes)!!

            if (size > 0) {

                // if statement needs to be on the same line and ternary does not work the same way.
                return bytes.decodeToString()
            }
        } catch (e: Exception) {
            this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "readAsString", e)
        } finally {
            this.close(closeable)
        }

        // if statement needs to be on the same line and ternary does not work the same way.
        return StringUtil.getInstance()!!.EMPTY_STRING
    }

    open fun close(
        closeable: Any
    )
        // nullable = true from not(false or (false and false)) = true
        : Boolean {
        var closeable = closeable

        try {

            if (closeable != null) {

                var inputStream: InputStream = (closeable as InputStream)

                inputStream!!.close()
            }

            // if statement needs to be on the same line and ternary does not work the same way.
            return true
        } catch (e: Exception) {
            this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, this.commonStrings!!.CLOSE, e)

            // if statement needs to be on the same line and ternary does not work the same way.
            return false
        }
    }
}
