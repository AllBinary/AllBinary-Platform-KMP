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
package org.allbinary.game.layer.weapon.mine

import kotlin.Array
import org.allbinary.game.layer.resources.BasicGameResources
import org.allbinary.logic.NullUtil

open public class MineWeaponResources : BasicGameResources {

    companion object {

        private var instance: Any = NullUtil.getInstance()!!.NULL_OBJECT

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : MineWeaponResources {

            if (MineWeaponResources.instance == NullUtil.getInstance()!!.NULL_OBJECT) {

                MineWeaponResources.instance = MineWeaponResources()
            }

            // if statement needs to be on the same line and ternary does not work the same way.
            return MineWeaponResources.instance as MineWeaponResources
        }
    }

    val DROP_TEXT_RESOURCE: String = "/mine_drop_text_20_by_20.png"

    val DROP_RESOURCE: String = "/mine_drop_20_by_20.png"

    val DROP_ICON_RESOURCE: String = "/mine_drop_icon_20_by_20.png"

    protected constructor() {

        var ROOT: String = "/mine"

        var SMALL: String = "_20_by_20.png"

        var MEDIUM: String = SMALL

        var SIZE_FOUR: String = SMALL

        var SIZE_FIVE: String = SMALL

        var SIZE_SIX: String = SMALL

        var SIZE: Array<String?> = arrayOf(SMALL, MEDIUM, SIZE_FOUR, SIZE_FIVE, SIZE_SIX)

        super.init(ROOT, SIZE)
    }
}
