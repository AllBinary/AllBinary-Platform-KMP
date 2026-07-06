/*
 *
 *  AllBinary Open License Version 1
 *  Copyright (c) 2009 AllBinary
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
package org.allbinary.android.input.motion.api5

import android.view.MotionEvent
import kotlin.Array
import org.allbinary.android.input.motion.BaseGameInputMotionEventProcessor
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.displayable.ScalableListener
import org.allbinary.input.motion.AllMotionRecognizer
import org.allbinary.input.motion.MotionRecognizer
import org.allbinary.logic.NullUtil
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.communication.log.LogUtil

open public class GameInputMotionEventProcessorAPI5 : BaseGameInputMotionEventProcessor {

    companion object {

        private var instance: Any = NullUtil.getInstance()!!.NULL_OBJECT

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : GameInputMotionEventProcessorAPI5 {

            if (
                GameInputMotionEventProcessorAPI5.instance == NullUtil.getInstance()!!.NULL_OBJECT
            ) {
                GameInputMotionEventProcessorAPI5.instance = GameInputMotionEventProcessorAPI5()
            }

            // if statement needs to be on the same line and ternary does not work the same way.
            return GameInputMotionEventProcessorAPI5.instance as GameInputMotionEventProcessorAPI5
        }
    }

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!

    private val motionRecognizerArray: Array<MotionRecognizer?>

    private val TOTAL_MINUS_ONE: Int

    private constructor() {

        var size: Int = GameInputMotionInfoAPI5.getInstance()!!.MAX_POINTERS

        this.motionRecognizerArray = arrayOfNulls(size)
        this.TOTAL_MINUS_ONE = size

        for (index in 0 until size) {

            this.motionRecognizerArray[index] = AllMotionRecognizer()
        }
    }

    open fun isValid(
        pointerId: Int
    )
        // nullable = true from not(false or (false and false)) = true
        : Boolean {
        // var pointerId = pointerId

        if (pointerId > this.TOTAL_MINUS_ONE) {

            var message: String =
                "Log that the pointer Ids are not what would be expected or Android has more than what I set my stuff to support pointerId: "

            ForcedLogUtil.log(message + pointerId, this)

            // if statement needs to be on the same line and ternary does not work the same way.
            return false
        } else {

            // if statement needs to be on the same line and ternary does not work the same way.
            return true
        }
    }

    override fun process(motionEvent: MotionEvent)
        // nullable = true from not(false or (false and false)) = true
    {
        // var motionEvent = motionEvent

        try {

            var action: Int = motionEvent!!.getAction()!!

            var total: Int = this.motionRecognizerArray!!.size

            if (total > motionEvent!!.getPointerCount()) {

                total = motionEvent!!.getPointerCount()
            } else {

                var message: String =
                    "Log that Android has more pointers than I have expected so increase it motionEvent.getPointerCount(): "

                ForcedLogUtil.log(message + motionEvent!!.getPointerCount(), this)
            }

            var totalMinusOne: Int = total - 1

            if (action == MotionEvent.ACTION_DOWN) {

                for (pointerIndex in totalMinusOne downTo 0) {

                    var pointerId: Int = motionEvent!!.getPointerId(pointerIndex)!!

                    if (this.isValid(pointerId)) {

                        var scalableListener: ScalableListener =
                            this.displayInfo!!.getScalableListener()!!

                        var x: Int =
                            ((motionEvent!!.getX(pointerIndex) - this.displayInfo!!.getLeft()) /
                                    scalableListener!!.getRatio(this.displayInfo!!.getRatio()))
                                .toInt()

                        var y: Int =
                            ((motionEvent!!.getY(pointerIndex) - this.displayInfo!!.getTop()) /
                                    scalableListener!!.getRatio(this.displayInfo!!.getRatio()))
                                .toInt()

                        this.motionRecognizerArray[pointerId]!!.processStartMotionEvent(
                            x,
                            y,
                            motionEvent!!.getDeviceId(),
                            0,
                        )
                    }
                }
            } else if (action == MotionEvent.ACTION_UP || action == MotionEvent.ACTION_CANCEL) {

                for (pointerIndex in totalMinusOne downTo 0) {

                    var pointerId: Int = motionEvent!!.getPointerId(pointerIndex)!!

                    if (this.isValid(pointerId)) {

                        var scalableListener: ScalableListener =
                            this.displayInfo!!.getScalableListener()!!

                        var x: Int =
                            ((motionEvent!!.getX(pointerIndex) - this.displayInfo!!.getLeft()) /
                                    scalableListener!!.getRatio(this.displayInfo!!.getRatio()))
                                .toInt()

                        var y: Int =
                            ((motionEvent!!.getY(pointerIndex) - this.displayInfo!!.getTop()) /
                                    scalableListener!!.getRatio(this.displayInfo!!.getRatio()))
                                .toInt()

                        this.motionRecognizerArray[pointerId]!!.processEndMotionEvent(
                            x,
                            y,
                            motionEvent!!.getDeviceId(),
                            0,
                        )
                    }
                }
            } else if (action == MotionEvent.ACTION_MOVE) {

                for (pointerIndex in totalMinusOne downTo 0) {

                    var pointerId: Int = motionEvent!!.getPointerId(pointerIndex)!!

                    if (this.isValid(pointerId)) {

                        var scalableListener: ScalableListener =
                            this.displayInfo!!.getScalableListener()!!

                        var x: Int =
                            ((motionEvent!!.getX(pointerIndex) - this.displayInfo!!.getLeft()) /
                                    scalableListener!!.getRatio(this.displayInfo!!.getRatio()))
                                .toInt()

                        var y: Int =
                            ((motionEvent!!.getY(pointerIndex) - this.displayInfo!!.getTop()) /
                                    scalableListener!!.getRatio(this.displayInfo!!.getRatio()))
                                .toInt()

                        this.motionRecognizerArray[pointerId]!!.processDraggedMotionEvent(
                            x,
                            y,
                            motionEvent!!.getDeviceId(),
                            0,
                        )
                    }
                }
            }
        } catch (e: Exception) {
            this.logUtil!!.put(
                this.commonStrings!!.EXCEPTION,
                this,
                this.commonStrings!!.PROCESS,
                e,
            )
        }
    }
}
