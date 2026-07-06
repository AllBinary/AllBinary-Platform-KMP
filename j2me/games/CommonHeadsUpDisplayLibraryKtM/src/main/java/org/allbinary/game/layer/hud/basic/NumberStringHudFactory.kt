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
package org.allbinary.game.layer.hud.basic

import java.lang.Object
import org.allbinary.game.graphics.hud.BasicHudFactory
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.logic.NullUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings

open public class NumberStringHudFactory : Object {

    companion object {

        private var instance: Any = NullUtil.getInstance()!!

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : NumberStringHudFactory {

            if (NumberStringHudFactory.instance == NullUtil.getInstance()) {

                NumberStringHudFactory.instance = NumberStringHudFactory()
            }

            // if statement needs to be on the same line and ternary does not work the same way.
            return NumberStringHudFactory.instance as NumberStringHudFactory
        }
    }

    // Auto Generated
    public constructor() : super() {}

    open fun createHud()
    // nullable = true from not(false or (false and true)) = true
    : NumberStringHud {

        try {

            // if statement needs to be on the same line and ternary does not work the same way.
            return NumberStringHud(
                StringUtil.getInstance()!!.EMPTY_STRING,
                9,
                BasicHudFactory.getInstance()!!.ABSOLUTE,
                1,
                0,
                BasicColorFactory.getInstance()!!.NULL_COLOR,
            )
        } catch (e: Exception) {

            var logUtil: LogUtil = LogUtil.getInstance()!!

            var commonStrings: CommonStrings = CommonStrings.getInstance()!!

            logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR, e)

            throw RuntimeException()
        }
    }

    val NULL_NUMBER_STRING_HUD: NumberStringHud = this.createHud()!!
}
