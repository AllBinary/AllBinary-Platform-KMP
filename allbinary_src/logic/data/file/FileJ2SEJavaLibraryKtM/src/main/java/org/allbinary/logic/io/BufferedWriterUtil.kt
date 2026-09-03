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

import java.io.BufferedWriter
import java.io.FileWriter
import java.lang.Object
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.AbFileNativeUtil
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings

open public class BufferedWriterUtil : Object {

    companion object {

        private val instance: BufferedWriterUtil = BufferedWriterUtil()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : BufferedWriterUtil {

            // if statement needs to be on the same line and ternary does not work the same way.
            return BufferedWriterUtil.instance
        }
    }

    // Auto Generated
    public constructor() : super() {}

    private val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val commonLabels: CommonLabels = CommonLabels.getInstance()!!

    private val REMOVING_OLD: String = "Remove old for overwriting: "

    @Throws(Exception::class)
    open fun overwrite(path: String, data: String)
        // nullable = true from not(false or (false and false)) = true
    {
        // var path = path
        // var data = data

        var abFile: AbFile = AbFile.createAbFile(path)!!

        if (abFile!!.exists()) {

            this.logUtil!!.putF(this.REMOVING_OLD + path, this, this.commonStrings!!.CREATE)
            abFile!!.delete()
        } else {

            var name: String = AbPathData.getInstance()!!.removeNameFromPath(path)!!

            var abFileDirectory: AbFile = AbFile.createAbFile(name)!!

            if (abFileDirectory!!.exists()) {} else {

                var stringBuilder: StringMaker = StringMaker()

                this.logUtil!!.putF(
                    stringBuilder!!
                        .append(this.commonStrings!!.CREATE)!!
                        .append(this.commonLabels!!.COLON_SEP)!!
                        .append(name)!!
                        .toString(),
                    this,
                    this.commonStrings!!.CREATE,
                )

                var result: Boolean = abFileDirectory!!.mkdirs()!!

                stringBuilder!!.delete(0, stringBuilder!!.length())
                this.logUtil!!.putF(
                    stringBuilder!!
                        .append(this.commonLabels!!.RESULT_)!!
                        .appendboolean(result)!!
                        .toString(),
                    this,
                    this.commonStrings!!.CREATE,
                )
            }
        }

        this.write(abFile, data)
    }

    @Throws(Exception::class)
    open fun overwrite(abFile: AbFile, data: String)
        // nullable = true from not(false or (false and false)) = true
    {
        // var abFile = abFile
        // var data = data

        if (abFile!!.exists()) {

            this.logUtil!!.putF(
                this.REMOVING_OLD + abFile!!.getPath(),
                this,
                this.commonStrings!!.CREATE,
            )
            abFile!!.delete()
        } else {

            var name: String =
                AbPathData.getInstance()!!.removeNameFromPath(abFile!!.getAbsolutePath())!!

            var abFileDirectory: AbFile = AbFile.createAbFile(name)!!

            if (abFileDirectory!!.exists()) {} else {

                var stringBuilder: StringMaker = StringMaker()

                this.logUtil!!.putF(
                    stringBuilder!!
                        .append(this.commonStrings!!.CREATE)!!
                        .append(this.commonLabels!!.COLON_SEP)!!
                        .append(name)!!
                        .toString(),
                    this,
                    this.commonStrings!!.CREATE,
                )

                var result: Boolean = abFileDirectory!!.mkdirs()!!

                stringBuilder!!.delete(0, stringBuilder!!.length())
                this.logUtil!!.putF(
                    stringBuilder!!
                        .append(this.commonLabels!!.RESULT_)!!
                        .appendboolean(result)!!
                        .toString(),
                    this,
                    this.commonStrings!!.CREATE,
                )
            }
        }

        this.write(abFile, data)
    }

    @Throws(Exception::class)
    open fun write(abFile: AbFile, data: String)
        // nullable = true from not(false or (false and false)) = true
    {
        // var abFile = abFile
        // var data = data

        var fileOut: BufferedWriter = BufferedWriter(FileWriter(AbFileNativeUtil.get(abFile)))

        fileOut!!.write(data, 0, data.length)
        fileOut!!.newLine()
        fileOut!!.flush()
    }
}
