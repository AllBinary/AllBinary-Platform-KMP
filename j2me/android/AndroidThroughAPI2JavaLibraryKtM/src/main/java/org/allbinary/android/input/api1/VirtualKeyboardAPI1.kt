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
package org.allbinary.android.input.api1

import android.app.Activity
import org.allbinary.android.input.VirtualKeyboard
import org.allbinary.input.event.VirtualKeyboardEvent
import org.allbinary.input.event.VirtualKeyboardEventListenerInterface
import org.allbinary.logic.util.event.AllBinaryEventObject

open public class VirtualKeyboardAPI1 : VirtualKeyboard, VirtualKeyboardEventListenerInterface {

    companion object {

        var MIN_API: Int = 1

        var MAX_API: Int = 2
    }

    public constructor(activity: Activity) {
        // var activity = activity
    }

    override fun onVirtualKeyboardEvent(virtualKeyboardEvent: VirtualKeyboardEvent)
        // nullable = true from not(false or (false and false)) = true
    {
        // var virtualKeyboardEvent = virtualKeyboardEvent
        super.onVirtualKeyboardEvent(virtualKeyboardEvent)
    }

    override fun onEvent(eventObject: AllBinaryEventObject)
        // nullable = true from not(false or (false and false)) = true
    {
        // var eventObject = eventObject
        super.onEvent(eventObject)
    }
}
