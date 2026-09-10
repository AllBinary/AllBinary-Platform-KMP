/*
 *
 *  AllBinary Open License Version 1
 *  Copyright (c) 2003 AllBinary
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
package org.allbinary.game.layer

import java.lang.Runnable
import org.allbinary.logic.NullUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.pathfinding.MultipassState
import org.allbinary.media.graphics.geography.pathfinding.PathFindingInfo
import org.allbinary.string.CommonStrings
import org.allbinary.thread.ARunnable
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil

open public class MultipassWaypointPathRunnable : WaypointPathRunnableBase {

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val basicArrayListUtil: BasicArrayListUtil = BasicArrayListUtil.getInstance()!!

    private val multipassState: MultipassState = MultipassState()

    private var done: Boolean = false

    private var list: BasicArrayList = this.basicArrayListUtil!!.getImmutableInstance()!!

    private var pathFindingInfo: Any = NullUtil.getInstance()!!.NULL_OBJECT

    open public inner class FirstRunnable : ARunnable {

        private val multipassWaypointPathRunnable: MultipassWaypointPathRunnable

        constructor(multipassWaypointPathRunnable: MultipassWaypointPathRunnable) {
            // var multipassWaypointPathRunnable = multipassWaypointPathRunnable
            this.multipassWaypointPathRunnable = multipassWaypointPathRunnable
        }

        override fun run()
            // nullable = true from not(false or (false and true)) = true
        {
            this.multipassWaypointPathRunnable!!.processFirstRunnable()
        }
    }

    private val FIRST_RUNNABLE: Runnable = FirstRunnable(this)

    //    private boolean first = true;
    open public inner class SecondRunnable : ARunnable {

        private val multipassWaypointPathRunnable: MultipassWaypointPathRunnable

        constructor(multipassWaypointPathRunnable: MultipassWaypointPathRunnable) {
            // var multipassWaypointPathRunnable = multipassWaypointPathRunnable
            this.multipassWaypointPathRunnable = multipassWaypointPathRunnable
        }

        override fun run()
            // nullable = true from not(false or (false and true)) = true
        {
            this.multipassWaypointPathRunnable!!.processSecondRunnable()
        }
    }

    private val SECOND_RUNNABLE: Runnable = SecondRunnable(this)

    open public inner class EndRunnable : ARunnable {

        private val multipassWaypointPathRunnable: MultipassWaypointPathRunnable

        constructor(multipassWaypointPathRunnable: MultipassWaypointPathRunnable) {
            // var multipassWaypointPathRunnable = multipassWaypointPathRunnable
            this.multipassWaypointPathRunnable = multipassWaypointPathRunnable
        }

        override fun run()
            // nullable = true from not(false or (false and true)) = true
        {
            this.multipassWaypointPathRunnable!!.processEndRunnable()
        }
    }

    private val END_RUNNABLE: Runnable = EndRunnable(this)

    private val ALREADY_ENDED_RUNNABLE: Runnable =
        object : ARunnable() {

            override fun run()
                // nullable = true from not(false or (false and true)) = true
            {

                throw RuntimeException()
            }
        }

    private var currentPassRunnable: Runnable = this.FIRST_RUNNABLE

    public constructor() {}

    override fun setRunning(isRunning: Boolean)
        // nullable = true from not(false or (false and false)) = true
    {
        var isRunning = isRunning
        this.runningP = isRunning

        if (this.runningP) {

            this.reset()
            this.done = false
        }
    }

    override fun run()
        // nullable = true from not(false or (false and true)) = true
    {

        var logUtil: LogUtil = LogUtil.getInstance()!!

        try {
            this.currentPassRunnable!!.run()
        } catch (e: Exception) {

            var commonStrings: CommonStrings = CommonStrings.getInstance()!!

            logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
            this.setRunning(false)
        }
    }

    open fun reset2()
        // nullable = true from not(false or (false and true)) = true
    {
        this.multipassState!!.step = 0
        this.multipassState!!.iteration = 0
        this.multipassState!!.iteration2 = 0
        this.pathFindingInfo = NullUtil.getInstance()!!.NULL_OBJECT
    }

    open fun finish()
        // nullable = true from not(false or (false and true)) = true
    {
        this.reset2()
        this.currentPassRunnable = this.ALREADY_ENDED_RUNNABLE
        this.done = true
    }

    override fun isDone()
    // nullable = true from not(false or (false and true)) = true
    : Boolean {

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.done
    }

    override fun reset()
        // nullable = true from not(false or (false and true)) = true
    {
        this.reset2()
        this.currentPassRunnable = this.FIRST_RUNNABLE
        this.done = false
    }

    open fun processFirstRunnable()
        // nullable = true from not(false or (false and true)) = true
    {

        try {
            this.pathFindingLayer!!.getWaypointRunnableLogHelper()!!.start(this.pathFindingLayer)
            this.reset2()

            var geographicMapCellPosition: GeographicMapCellPosition =
                this.pathFindingLayer!!.getCurrentGeographicMapCellPosition()!!

            if (geographicMapCellPosition == null) {

                throw Exception("Should never be running here")
            }

            this.pathFindingInfo =
                this.targetPathFindingLayer!!
                    .getWaypointBehavior()!!
                    .getWaypoint()!!
                    .getPathFindingInfo(geographicMapCellPosition)

            var localPathFindingInfo: PathFindingInfo = this.pathFindingInfo as PathFindingInfo

            this.list =
                this.targetPathFindingLayer!!
                    .getWaypointBehavior()!!
                    .getWaypoint()!!
                    .getPathsList(
                        geographicMapCellPosition,
                        localPathFindingInfo,
                        this.multipassState,
                    )

            if (this.list != this.basicArrayListUtil!!.getImmutableInstance()) {

                this.END_RUNNABLE.run()
            } else {
                this.currentPassRunnable = this.SECOND_RUNNABLE
            }
        } catch (e: Exception) {

            var commonStrings: CommonStrings = CommonStrings.getInstance()!!

            this.logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
            this.setRunning(false)
            this.finish()
        }
    }

    open fun processSecondRunnable()
        // nullable = true from not(false or (false and true)) = true
    {

        try {

            var geographicMapCellPosition: GeographicMapCellPosition =
                this.pathFindingLayer!!.getCurrentGeographicMapCellPosition()!!

            var localPathFindingInfo: PathFindingInfo = this.pathFindingInfo as PathFindingInfo

            this.list =
                this.targetPathFindingLayer!!
                    .getWaypointBehavior()!!
                    .getWaypoint()!!
                    .getPathsList(
                        geographicMapCellPosition,
                        localPathFindingInfo,
                        this.multipassState,
                    )

            if (this.list != this.basicArrayListUtil!!.getImmutableInstance()) {

                this.END_RUNNABLE.run()
            }
        } catch (e: Exception) {

            var commonStrings: CommonStrings = CommonStrings.getInstance()!!

            this.logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
            this.setRunning(false)
            this.finish()
        }
    }

    open fun processEndRunnable()
        // nullable = true from not(false or (false and true)) = true
    {

        try {

            var waypointBehavior: WaypointBehaviorBase =
                this.pathFindingLayer!!.getWaypointBehavior()!!

            waypointBehavior!!.setWaypointPathsList(this.list)
            this.pathFindingLayer!!.getWaypointRunnableLogHelper()!!.end(this.pathFindingLayer)
        } catch (e: Exception) {

            var commonStrings: CommonStrings = CommonStrings.getInstance()!!

            this.logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
            this.setRunning(false)
        }

        this.finish()
    }
}
