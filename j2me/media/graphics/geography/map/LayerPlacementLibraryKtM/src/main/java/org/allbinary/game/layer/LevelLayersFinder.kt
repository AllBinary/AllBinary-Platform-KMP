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
package org.allbinary.game.layer

import java.lang.Integer
import java.lang.Object
import java.util.Enumeration
import java.util.Hashtable
import org.allbinary.layer.Layer
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListD
import org.allbinary.util.EnumerationUtil

open public class LevelLayersFinder : Object {

    companion object {

        private val instance: LevelLayersFinder = LevelLayersFinder()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : LevelLayersFinder {

            // if statement needs to be on the same line and ternary does not work the same way.
            return LevelLayersFinder.instance
        }
    }

    // Auto Generated
    public constructor() : super() {}

    private val enumerationUtil: EnumerationUtil = EnumerationUtil.getInstance()!!

    open fun get(
        hashtable: Hashtable<Any, Any>
    )
        // nullable = true from not(false or (false and false)) = true
        : BasicArrayList {
        // var hashtable = hashtable

        var smallIntegerSingletonFactory: SmallIntegerSingletonFactory =
            SmallIntegerSingletonFactory.getInstance()!!

        var list: BasicArrayList = BasicArrayListD()

        var enumeration: Enumeration<Any?> = hashtable.keys()!!

        var layerHashtableCanBeNull: Hashtable<Any, Any>?

        var integerCanBeNull: Integer?

        var cachedIntegerCanBeNull: Integer?

        while (this.enumerationUtil!!.hasMoreElements(enumeration)) {
            layerHashtableCanBeNull =
                hashtable.get(this.enumerationUtil!!.nextElement(enumeration)!! as Object)
                    as Hashtable<Any, Any>
            integerCanBeNull = layerHashtableCanBeNull!!.get(Layer.ID as Object) as Integer
            cachedIntegerCanBeNull =
                smallIntegerSingletonFactory!!.getAt(integerCanBeNull!!.toInt())

            if (!list.contains(cachedIntegerCanBeNull)) {

                list.add(cachedIntegerCanBeNull)
            }
        }

        // if statement needs to be on the same line and ternary does not work the same way.
        return list
    }
}
