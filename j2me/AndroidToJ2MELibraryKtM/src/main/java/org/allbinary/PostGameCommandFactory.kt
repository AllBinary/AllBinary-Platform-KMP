/*
 *
 *  AllBinary Open License Version 1
 *  Copyright (c) 2022 AllBinary
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
import org.allbinary.game.commands.GameCommandsFactory
import org.allbinary.game.configuration.feature.MultiPlayerGameFeatureFactory
import org.allbinary.graphics.displayable.MyCanvas
import org.allbinary.logic.system.os.GenericOperatingSystem
import org.allbinary.logic.system.os.OperatingSystemFactory

open public class PostGameCommandFactory : Object {

    companion object {

        private val instance: PostGameCommandFactory = PostGameCommandFactory()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : PostGameCommandFactory {

            // if statement needs to be on the same line and ternary does not work the same way.
            return PostGameCommandFactory.instance
        }
    }

    // Auto Generated
    public constructor() : super() {}

    open fun addCommands(canvas: MyCanvas)
        // nullable = true from not(false or (false and false)) = true
    {
        var canvas = canvas

        var operatingSystemInterface: GenericOperatingSystem =
            OperatingSystemFactory.getInstance()!!.getOperatingSystemInstance()!!

        var gameCommandsFactory: GameCommandsFactory = GameCommandsFactory.getInstance()!!

        if (!operatingSystemInterface!!.isOverScan()) {

            canvas.addCommand(gameCommandsFactory!!.TOGGLE_KEYBOARD)
        }

        MultiPlayerGameFeatureFactory.getInstance()!!.addCommands(canvas)
    }
}
