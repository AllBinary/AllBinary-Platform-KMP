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
package org.allbinary.graphics.form

import java.lang.Object
import org.allbinary.graphics.form.item.ABCustomItem

open public class ItemIndexDx : Object {

    companion object {

        private val instance: ItemIndexDx = ItemIndexDx()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : ItemIndexDx {

            // if statement needs to be on the same line and ternary does not work the same way.
            return ItemIndexDx.instance
        }
    }

    // Auto Generated
    public constructor() : super() {}

    @Throws(Exception::class)
    open fun getDx(
        index: Int,
        item: ABCustomItem,
        dx: Int,
        dy: Int,
    )
        // nullable = true from not(false or (false and false)) = true
        : Int {
        // var index = index
        // var item = item
        var dx = dx
        // var dy = dy

        // if statement needs to be on the same line and ternary does not work the same way.
        return 0
    }
}
