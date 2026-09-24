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
package org.allbinary.logic

import java.lang.Object
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class PropertyInitUtil : Object {

    companion object {

        private val instance: PropertyInitUtil = PropertyInitUtil()

        open fun getInstance(
            value: Int
        )
            // nullable =  from not(true or (false and false)) =
            : PropertyInitUtil {
            // var value = value

            var commonStrings: CommonStrings = CommonStrings.getInstance()!!

            var logUtil: LogUtil = LogUtil.getInstance()!!

            logUtil!!.putF("PropertyInitUtil: " + value, logUtil, commonStrings!!.CONSTRUCTOR)

            // if statement needs to be on the same line and ternary does not work the same way.
            return PropertyInitUtil.instance
        }
    }

    // Auto Generated
    public constructor() : super() {}
}
