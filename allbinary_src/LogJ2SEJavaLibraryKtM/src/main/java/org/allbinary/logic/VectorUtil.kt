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
import java.util.Vector

open public class VectorUtil : Object {

    companion object {

        private val instance: VectorUtil = VectorUtil()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : VectorUtil {

            // if statement needs to be on the same line and ternary does not work the same way.
            return instance
        }
    }

    // Auto Generated
    public constructor() : super() {}

    open fun getSize(
        anyType: Any
    )
        // nullable = true from not(false or (false and false)) = true
        : Int {
        // var anyType = anyType

        var vector: Vector<Any> = anyType as Vector<Any>

        // if statement needs to be on the same line and ternary does not work the same way.
        return vector.size
    }

    open fun elementAt(
        anyType: Any,
        index: Int,
    )
        // nullable = true from not(false or (false and false)) = true
        : Any {
        // var anyType = anyType
        // var index = index

        var vector: Vector<Any> = anyType as Vector<Any>

        // if statement needs to be on the same line and ternary does not work the same way.
        return vector.elementAt(index)
    }
}
