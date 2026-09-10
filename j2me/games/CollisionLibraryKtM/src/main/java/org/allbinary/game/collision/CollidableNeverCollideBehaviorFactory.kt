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
package org.allbinary.game.collision

open public class CollidableNeverCollideBehaviorFactory : CollidableBaseBehaviorFactory {

    companion object {

        private val instanceC: CollidableNeverCollideBehaviorFactory =
            CollidableNeverCollideBehaviorFactory()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : CollidableNeverCollideBehaviorFactory {

            // if statement needs to be on the same line and ternary does not work the same way.
            return CollidableNeverCollideBehaviorFactory.instanceC
        }
    }

    // Auto Generated
    public constructor() : super() {}

    private val instance: CollidableNeverCollideBehavior = CollidableNeverCollideBehavior(false)

    override fun createBehavior()
    // nullable = true from not(false or (false and true)) = true
    : CollidableBaseBehavior {

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.instance
    }
}
