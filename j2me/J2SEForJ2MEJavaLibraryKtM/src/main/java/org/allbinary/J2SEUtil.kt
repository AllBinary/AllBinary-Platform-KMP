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
package org.allbinary

import java.lang.Object
import java.util.HashMap
import java.util.Map
import kotlin.Array

// ArkTs does not have this.  So this is for the ArkTs build.
open public class J2SEUtil : Object {

    companion object {

        private val instance: J2SEUtil = J2SEUtil()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : J2SEUtil {

            // if statement needs to be on the same line and ternary does not work the same way.
            return J2SEUtil.instance
        }
    }

    // Auto Generated
    public constructor() : super() {}

    open fun getHashMapAsArray(
        hashMap: HashMap<Any, Any>
    )
        // nullable = true from not(false or (false and false)) = true
        : Array<Any?> {
        // var hashMap = hashMap

        var objectArray: Array<Any?> = hashMap!!.keys.toTypedArray()!!

        // if statement needs to be on the same line and ternary does not work the same way.
        return objectArray
    }

    open fun getMapAsArray(
        map: Map<Any, Any>
    )
        // nullable = true from not(false or (false and false)) = true
        : Array<Any?> {
        // var map = map

        var objectArray: Array<Any?> = map.keySet()!!.toTypedArray()!!

        // if statement needs to be on the same line and ternary does not work the same way.
        return objectArray
    }

    open fun getSetAsArray(
        set: MutableSet<String>
    )
        // nullable = true from not(false or (false and false)) = true
        : Array<Any?> {
        // var set = set

        var objectArray: Array<Any?> = set.toTypedArray()!!

        // if statement needs to be on the same line and ternary does not work the same way.
        return objectArray
    }
}
