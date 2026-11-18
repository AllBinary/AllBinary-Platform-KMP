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
import java.lang.Runnable
import org.allbinary.game.score.displayable.HighScoreTextBox
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvas
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvasFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class SaveHighScoreRunnable : Object, Runnable {

    private val progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!

    private val isLast: Boolean

    private val textBox: HighScoreTextBox

    constructor(isLast: Boolean, textBox: HighScoreTextBox) : super() {
        // var isLast = isLast
        // var textBox = textBox
        this.isLast = isLast
        this.textBox = textBox
    }

    override fun run()
        // nullable = true from not(false or (false and true)) = true
    {

        var logUtil: LogUtil = LogUtil.getInstance()!!

        try {

            if (this.isLast) {

                this.textBox!!.submit()
            } else {
                this.textBox!!.saveHighScore()
            }
        } catch (e: Exception) {

            var commonStrings: CommonStrings = CommonStrings.getInstance()!!

            logUtil!!.put(commonStrings!!.EXCEPTION, this, "run", e)
            this.progressCanvas!!.end()
        }
    }
}
