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
package org.allbinary.game.score.displayable

import org.allbinary.J2MEUtil
import org.allbinary.logic.ABSystemWrapper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonStrings
import org.allbinary.thread.ARunnable

open public class HighScoreRunnable : ARunnable {

    val highScoresCanvas: HighScoresCanvas

    constructor(highScoresCanvas: HighScoresCanvas) {
        // var highScoresCanvas = highScoresCanvas
        this.highScoresCanvas = highScoresCanvas
    }

    override fun run()
        // nullable = true from not(false or (false and true)) = true
    {

        var commonStrings: CommonStrings = CommonStrings.getInstance()!!

        var logUtil: LogUtil = LogUtil.getInstance()!!

        var highScoresCanvas: HighScoresCanvas = this.highScoresCanvas

        try {

            var isHTML: Boolean = J2MEUtil.isHTML()

            if (!isHTML) {

                while (!highScoresCanvas!!.hasPainted) {}

                highScoresCanvas!!.hasPainted = false
            }

            var stringMaker: StringMaker = StringMaker()

            var systemWrapper: ABSystemWrapper = ABSystemWrapper.getInstance()!!

            var currentTimeMillis: Long = systemWrapper!!.currentTimeMillis()

            logUtil!!.putF(
                stringMaker!!
                    .append("HighScoresCanvas - Request repaint to be sure: ")!!
                    .appendlong(currentTimeMillis)!!
                    .toString(),
                this,
                commonStrings!!.RUN,
            )
            highScoresCanvas!!.repaintBehavior!!.onChangeRepaint(highScoresCanvas)

            if (!isHTML) {

                while (!highScoresCanvas!!.hasPainted) {}
            }

            stringMaker!!.delete(0, stringMaker!!.length())
            logUtil!!.putF(
                stringMaker!!
                    .append(
                        "HighScoresCanvas - Now that the canvas has completed repaint go ahead and fetch the scores: "
                    )!!
                    .appendlong(currentTimeMillis)!!
                    .toString(),
                this,
                commonStrings!!.RUN,
            )
            highScoresCanvas!!.executeUpdate()
        } catch (e: Exception) {
            logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
        }
    }
}
