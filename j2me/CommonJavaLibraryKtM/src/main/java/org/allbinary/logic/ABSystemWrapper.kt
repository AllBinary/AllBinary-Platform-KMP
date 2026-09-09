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
import java.lang.System

open public class ABSystemWrapper : Object {

    companion object {

        private val instance: ABSystemWrapper = ABSystemWrapper()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : ABSystemWrapper {

            // if statement needs to be on the same line and ternary does not work the same way.
            return instance
        }
    }

    // Auto Generated
    public constructor() : super() {}

    open fun arraycopy(src: Any, srcPos: Int, dest: Any, destPos: Int, length: Int)
        // nullable = true from not(false or (false and false)) = true
    {
        // var src = src
        // var srcPos = srcPos
        // var dest = dest
        // var destPos = destPos
        // var length = length
        System.arraycopy(src, srcPos, dest, destPos, length)
    }

    open fun currentTimeMillis()
    // nullable = true from not(false or (false and true)) = true
    : Long {

        // if statement needs to be on the same line and ternary does not work the same way.
        return System.currentTimeMillis()
    }

    open fun gc()
        // nullable = true from not(false or (false and true)) = true
    {
        System.gc()
    }
}
