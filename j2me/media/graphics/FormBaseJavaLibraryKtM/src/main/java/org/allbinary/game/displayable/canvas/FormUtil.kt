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
package org.allbinary.game.displayable.canvas

import java.lang.Object
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.displayable.DisplayInfoSingleton

open public class FormUtil : Object {

    companion object {

        private val instance: FormUtil = FormUtil()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : FormUtil {

            // if statement needs to be on the same line and ternary does not work the same way.
            return FormUtil.instance
        }
    }

    // Auto Generated
    public constructor() : super() {}

    open fun createFormRectangle()
    // nullable = true from not(false or (false and true)) = true
    : Rectangle {

        var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!

        var pointFactory: PointFactory = PointFactory.getInstance()!!

        var rectangle: Rectangle =
            Rectangle(
                pointFactory!!.createXY(30, 10),
                displayInfo!!.getLastWidth() - 30,
                displayInfo!!.getLastHeight() - 35,
            )

        // if statement needs to be on the same line and ternary does not work the same way.
        return rectangle
    }
}
