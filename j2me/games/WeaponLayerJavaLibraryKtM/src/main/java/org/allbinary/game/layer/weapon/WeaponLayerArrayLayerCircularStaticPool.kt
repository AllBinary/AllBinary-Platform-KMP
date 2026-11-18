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
package org.allbinary.game.layer.weapon

import java.lang.Object
import kotlin.Array
import org.allbinary.util.CircularIndexUtil

open public class WeaponLayerArrayLayerCircularStaticPool : Object {

    companion object {

        private val instance: WeaponLayerArrayLayerCircularStaticPool =
            WeaponLayerArrayLayerCircularStaticPool()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : WeaponLayerArrayLayerCircularStaticPool {

            // if statement needs to be on the same line and ternary does not work the same way.
            return WeaponLayerArrayLayerCircularStaticPool.instance
        }
    }

    // Auto Generated
    public constructor() : super() {}

    private val MAX: Int = 5

    private var circularIndexUtil: CircularIndexUtil = CircularIndexUtil.createInstance(this.MAX)!!

    private var WEAPONLAYER_ARRAY: Array<Array<WeaponLayer?>?> =
        arrayOfNulls<Array<WeaponLayer?>>(this.MAX * 2)

    private var TWO_WEAPONLAYER_ARRAY: Array<Array<WeaponLayer?>?> =
        arrayOfNulls<Array<WeaponLayer?>>(this.MAX)

    private var THREE_WEAPONLAYER_ARRAY: Array<Array<WeaponLayer?>?> =
        arrayOfNulls<Array<WeaponLayer?>>(this.MAX)

    open fun init()
        // nullable = true from not(false or (false and true)) = true
    {

        for (index in 0 until this.MAX) {

            this.WEAPONLAYER_ARRAY[index] = arrayOfNulls(1)
            this.TWO_WEAPONLAYER_ARRAY[index] = arrayOfNulls(2)
            this.THREE_WEAPONLAYER_ARRAY[index] = arrayOfNulls(3)
        }

        this.WEAPONLAYER_ARRAY = WEAPONLAYER_ARRAY
        this.TWO_WEAPONLAYER_ARRAY = TWO_WEAPONLAYER_ARRAY
        this.THREE_WEAPONLAYER_ARRAY = THREE_WEAPONLAYER_ARRAY
    }

    open fun getWeaponLayerArrays(
        size: Int
    )
        // nullable = true from not(false or (false and false)) = true
        : Array<Array<WeaponLayer?>?> {
        // var size = size

        if (size == 1) {

            // if statement needs to be on the same line and ternary does not work the same way.
            return this.WEAPONLAYER_ARRAY
        } else if (size == 2) {

            // if statement needs to be on the same line and ternary does not work the same way.
            return this.TWO_WEAPONLAYER_ARRAY
        } else if (size == 3) {

            // if statement needs to be on the same line and ternary does not work the same way.
            return this.THREE_WEAPONLAYER_ARRAY
        }

        throw RuntimeException()
    }

    @Throws(Exception::class)
    open fun getInstanceArray(
        size: Int
    )
        // nullable = true from not(false or (false and false)) = true
        : Array<WeaponLayer?> {
        var size = size

        var weaponLayerArray: Array<WeaponLayer?> =
            this.getWeaponLayerArrays(size)[this.circularIndexUtil!!.getIndex()]!!

        this.circularIndexUtil!!.next()

        // if statement needs to be on the same line and ternary does not work the same way.
        return weaponLayerArray
    }
}
