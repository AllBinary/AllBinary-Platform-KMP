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
package org.allbinary.graphics.form

import org.allbinary.graphics.form.item.ABCustomItem

open public class ScrollSelectionFormTempHorizontalDx : ItemIndexDx {

    private val scrollSelectionForm: ScrollSelectionForm

    public constructor(scrollSelectionForm: ScrollSelectionForm) {
        // var scrollSelectionForm = scrollSelectionForm
        this.scrollSelectionForm = scrollSelectionForm
    }

    @Throws(Exception::class)
    override fun getDx(
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
        return this.scrollSelectionForm!!.getSelectedIndexForPointTempHorizontalDx(
            index,
            item,
            dx,
            dy,
        )
    }
}
