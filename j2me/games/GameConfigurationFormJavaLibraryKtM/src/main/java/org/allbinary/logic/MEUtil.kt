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
import javax.microedition.lcdui.Item
import org.allbinary.graphics.displayable.screen.CommandForm

// Handle the differences in the public platform vs the raw JS build
open public class MEUtil : Object {

    companion object {

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : MEUtil {

            // if statement needs to be on the same line and ternary does not work the same way.
            return MEUtil.instance
        }

        private val instance: MEUtil = MEUtil()
    }

    // Auto Generated
    public constructor() : super() {}

    open fun appendItem(form: CommandForm, item: Item)
        // nullable = true from not(false or (false and false)) = true
    {
        // var form = form
        // var item = item
        form.append(item)
    }
}
