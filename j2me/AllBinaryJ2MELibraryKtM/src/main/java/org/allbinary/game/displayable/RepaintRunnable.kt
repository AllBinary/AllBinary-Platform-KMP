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
package org.allbinary.game.displayable

import javax.microedition.lcdui.Canvas
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.thread.ARunnable

open public class RepaintRunnable : ARunnable {

    private val canvas: Canvas

    public constructor(canvas: Canvas) {
        // var canvas = canvas
        this.canvas = canvas
    }

    override fun run()
        // nullable = true from not(false or (false and true)) = true
    {

        try {
            this.canvas.repaint()
            DisplayInfoSingleton.getInstance()!!.process()
        } catch (e: Exception) {

            var commonStrings: CommonStrings = CommonStrings.getInstance()!!

            var logUtil: LogUtil = LogUtil.getInstance()!!

            logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
        }
    }
}
