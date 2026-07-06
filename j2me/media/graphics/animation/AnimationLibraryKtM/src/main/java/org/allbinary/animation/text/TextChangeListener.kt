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
package org.allbinary.animation.text

import java.lang.Object

open public class TextChangeListener : Object {

    companion object {

        private val instance: TextChangeListener = TextChangeListener()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : TextChangeListener {

            // if statement needs to be on the same line and ternary does not work the same way.
            return instance
        }
    }

    // Auto Generated
    public constructor() : super() {}

    open fun onMeasure()
        // nullable = true from not(false or (false and true)) = true
    {}
}
