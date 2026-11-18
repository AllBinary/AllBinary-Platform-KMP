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
package org.allbinary.input.motion.button

import org.allbinary.game.input.event.GameKeyEvent

open public class MultitouchReleaseHelper : ReleaseHelper {

    public constructor(
        touchButtonRecognizer: TouchButtonRecognizer
    ) : super(touchButtonRecognizer) {
        // var touchButtonRecognizer = touchButtonRecognizer

        // For kotlin this is before the body of the constructor.

    }

    @Throws(Exception::class)
    override fun release(touchButtonInput: TouchButtonInput, deviceId: Int)
        // nullable = true from not(false or (false and false)) = true
    {
        // var touchButtonInput = touchButtonInput
        // var deviceId = deviceId

        var cancelTouchButtonInput: TouchButtonInput =
            CancelTouchButtonInputFactory.getInstance()!!.getCancel(touchButtonInput)!!

        var nextTouchButtonInput: TouchButtonInput

        var gameKeyEvent: GameKeyEvent

        for (index in
            this.touchButtonRecognizer!!.currentlyPressedTouchButtonSingleton!!.size() - 1 downTo
                0) {
            nextTouchButtonInput =
                this.touchButtonRecognizer!!.currentlyPressedTouchButtonSingleton!!.get(index)!!

            if (cancelTouchButtonInput == nextTouchButtonInput) {

                gameKeyEvent = nextTouchButtonInput!!.getGameKeyEvent()!!
                this.touchButtonRecognizer!!.upGameKeyEventHandler!!.fireEvent(gameKeyEvent)
                this.touchButtonRecognizer!!
                    .upGameKeyEventHandler!!
                    .getInstanceForDevice(deviceId)!!
                    .fireEvent(gameKeyEvent)
                this.touchButtonRecognizer!!.currentlyPressedTouchButtonSingleton!!.removeAt(index)
            }
        }
    }
}
