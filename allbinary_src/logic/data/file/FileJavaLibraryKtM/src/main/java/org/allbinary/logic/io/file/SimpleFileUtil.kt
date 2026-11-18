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
package org.allbinary.logic.io.file

import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.io.OutputStream
import java.io.Reader
import java.io.Writer
import java.lang.Object
import kotlin.Array
import org.allbinary.logic.NullUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.NullOutputStream
import org.allbinary.logic.io.NullReader
import org.allbinary.logic.io.NullWriter
import org.allbinary.logic.io.StreamUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListD

open public class SimpleFileUtil : Object {

    companion object {

        private val instance: SimpleFileUtil = SimpleFileUtil()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : SimpleFileUtil {

            // if statement needs to be on the same line and ternary does not work the same way.
            return SimpleFileUtil.instance
        }

        open fun nullOutputStream()
        // nullable = true from not(false or (false and true)) = true
        : OutputStream {

            // if statement needs to be on the same line and ternary does not work the same way.
            return NullOutputStream.NULL_OUTPUT_STREAM
        }

        open fun nullWriter()
        // nullable = true from not(false or (false and true)) = true
        : Writer {

            // if statement needs to be on the same line and ternary does not work the same way.
            return NullWriter.NULL_WRITER
        }

        open fun nullReader()
        // nullable = true from not(false or (false and true)) = true
        : Reader {

            // if statement needs to be on the same line and ternary does not work the same way.
            return NullReader.NULL_READER
        }
    }

    // Auto Generated
    public constructor() : super() {}

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val NULL_WRITER: Writer = SimpleFileUtil.nullWriter()!!

    val NULL_READER: Reader = SimpleFileUtil.nullReader()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val nullUtil: NullUtil = NullUtil.getInstance()!!

    private val streamUtil: StreamUtil = StreamUtil.getInstance()!!

    open fun loadFileAsList(
        inputStream: InputStream,
        max: Int,
        byteArray1: ByteArray,
    )
        // nullable = true from not(false or (false and false)) = true
        : BasicArrayList {
        // var inputStream = inputStream
        // var max = max
        // var byteArray1 = byteArray1

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.loadFileAsListReturnLine(inputStream, max, byteArray1, 0)
    }

    open fun loadFileAsListReturnLine(
        inputStream: InputStream,
        max: Int,
        byteArray1: ByteArray,
        includeReturnLine: Int,
    )
        // nullable = true from not(false or (false and false)) = true
        : BasicArrayList {
        // var inputStream = inputStream
        // var max = max
        // var byteArray1 = byteArray1
        // var includeReturnLine = includeReturnLine

        var stringList: BasicArrayList = BasicArrayListD()

        if (inputStream == null) {

            // if statement needs to be on the same line and ternary does not work the same way.
            return stringList
        }

        var byteArray: ByteArray = this.nullUtil!!.NULL_BYTE_ARRAY

        try {

            var outputStream2: ByteArrayOutputStream = ByteArrayOutputStream(max)

            byteArray = this.streamUtil!!.getByteArray(inputStream, outputStream2, byteArray1)!!
            this.streamUtil!!.close(inputStream)
        } catch (e: Exception) {
            this.streamUtil!!.close(inputStream)
            this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, this.commonStrings!!.ADD, e)
        }

        if (byteArray == null) {

            // if statement needs to be on the same line and ternary does not work the same way.
            return stringList
        }

        var size: Int = byteArray!!.size

        var index: Int = 0

        var startIndex: Int = 0

        var returnLine: Int = 0

        while (index < size) {
            startIndex = index

            while (index < size - 1 && byteArray[index] != '\n'.code.toByte()) {
                index++
            }

            if (includeReturnLine == 0) {

                if (index > 0 && byteArray[index - 1] == '\r'.code.toByte()) {

                    returnLine = 1
                } else {
                    returnLine = 0
                }
            }

            var s: String = byteArray.decodeToString()

            stringList!!.add(s)
            index++
        }

        // if statement needs to be on the same line and ternary does not work the same way.
        return stringList
    }

    open fun createStringFromArrayOfStrings(
        stringArray: Array<String?>
    )
        // nullable = true from not(false or (false and false)) = true
        : String {
        // var stringArray = stringArray

        var stringMaker: StringMaker = StringMaker()

        var size: Int = stringArray!!.size

        for (index in 0 until size) {

            stringMaker!!.append(stringArray[index]!!)
        }

        // if statement needs to be on the same line and ternary does not work the same way.
        return stringMaker!!.toString()
    }
}
