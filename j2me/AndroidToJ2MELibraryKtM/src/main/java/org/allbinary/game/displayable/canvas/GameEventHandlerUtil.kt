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
package org.allbinary.game.displayable.canvas

import java.lang.Object
import org.allbinary.android.input.motion.GameInputMotionEventProcessorFactory
import org.allbinary.game.input.event.GameKeyEventHandler
import org.allbinary.input.motion.gesture.observer.BasicMotionGesturesHandler

open public class GameEventHandlerUtil : Object {

    companion object {

        open fun removeAllListeners()
            // nullable = true from not(false or (false and true)) = true
        {
            BasicMotionGesturesHandler.getInstance()!!.removeAllListeners()
            GameKeyEventHandler.getInstance()!!.removeAllListeners()
            GameInputMotionEventProcessorFactory.getInstance()!!.addListener()
        }
    }

    // Auto Generated
    public constructor() : super() {}
}
