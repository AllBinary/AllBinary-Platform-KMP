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
package org.allbinary.game.layer.hud.basic

import java.lang.Integer
import javax.microedition.lcdui.Font
import javax.microedition.lcdui.Graphics
import org.allbinary.business.advertisement.GameAdStateFactory
import org.allbinary.canvas.Processor
import org.allbinary.game.GameAdState
import org.allbinary.game.layer.hud.basic.notification.GameNotification
import org.allbinary.game.layer.hud.basic.notification.GameNotificationHud
import org.allbinary.game.layer.hud.event.GameNotificationEventHandler
import org.allbinary.graphics.CustomGPoint
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.UpdateMyFontInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings
import org.allbinary.time.GameTickTimeDelayHelper
import org.allbinary.time.GameTickTimeDelayHelperFactory
import org.allbinary.time.TimeDelayHelper
import org.allbinary.util.CircularIndexUtil

open public class PlayerGameNotificationHud : GameNotificationHud, UpdateMyFontInterface {

    private val gameTickTimeDelayHelper: GameTickTimeDelayHelper =
        GameTickTimeDelayHelperFactory.getInstance()!!

    private val EMPTY_STRING: String = StringUtil.getInstance()!!.EMPTY_STRING

    private val displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!

    private val timeDelayHelper: TimeDelayHelper = TimeDelayHelper(0)

    private val circularIndexUtil: CircularIndexUtil

    private val gameNotification: GameNotification = GameNotification()

    private val permanentGameNotification: GameNotification = GameNotification()

    open public inner class SetAndRemoveProcessor : Processor {

        private val updateMeasurementProcessor: PlayerGameNotificationHud

        public constructor(updateMeasurementProcessor: PlayerGameNotificationHud) {
            // var updateMeasurementProcessor = updateMeasurementProcessor
            this.updateMeasurementProcessor = updateMeasurementProcessor
        }

        @Throws(Exception::class)
        override fun process()
            // nullable = true from not(false or (false and true)) = true
        {
            this.updateMeasurementProcessor!!.setAndRemoveProcess()
        }
    }

    open public inner class NextUnremoveableProcessor : Processor {

        private val updateMeasurementProcessor: PlayerGameNotificationHud

        public constructor(updateMeasurementProcessor: PlayerGameNotificationHud) {
            // var updateMeasurementProcessor = updateMeasurementProcessor
            this.updateMeasurementProcessor = updateMeasurementProcessor
        }

        @Throws(Exception::class)
        override fun process()
            // nullable = true from not(false or (false and true)) = true
        {
            this.updateMeasurementProcessor!!.setNextUnremoveableProcess()
        }
    }

    private val setAndRemoveProcessor: Processor = SetAndRemoveProcessor(this)

    private val nextUnremoveableProcessor: Processor = NextUnremoveableProcessor(this)

    private var processor: Processor = Processor.getInstance()!!

    private val PERMANENT_GAME_NOTIFICATION: String = "Permanent Game Notification: "

    private var lastString: String = StringUtil.getInstance()!!.EMPTY_STRING

    private var string: String = this.EMPTY_STRING

    private var point: CustomGPoint = CustomGPoint.NULL_CUSTOM_POINT

    private var width: Int = 0

    public constructor(
        location: Int,
        direction: Int,
        bufferZone: Int,
        basicColor: BasicColor,
    ) : super(location, direction, bufferZone, basicColor) {
        // var location = location
        // var direction = direction
        // var bufferZone = bufferZone
        // var basicColor = basicColor

        // For kotlin this is before the body of the constructor.

        this.circularIndexUtil = CircularIndexUtil.createInstance(0)

        var gameNotificationEventHandler: GameNotificationEventHandler =
            GameNotificationEventHandler.getInstance()!!

        gameNotificationEventHandler!!.removeAllListeners()
        gameNotificationEventHandler!!.addListenerInterface(this)
    }

    override fun updateMeasurement(graphics: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        // var graphics = graphics

        try {
            super.updateMeasurement(graphics)

            var font: Font = graphics.getFont()!!

            this.width = font.stringWidth(this.string)
            this.processor.process()
            this.processor = Processor.getInstance()
        } catch (e: Exception) {

            var logUtil: LogUtil = LogUtil.getInstance()!!

            var commonStrings: CommonStrings = CommonStrings.getInstance()!!

            logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.UPDATE, e)
        }
    }

    override fun getPoint(
        x: Int,
        y: Int,
    )
        // nullable = true from not(false or (false and false)) = true
        : GPoint {
        var x = x
        var y = y
        this.point = CustomGPoint.getInstance3(0, 0)
        this.point.setX(x)
        this.point.setY(y)

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.point
    }

    override fun add(string: String, seconds: Integer, basicColor: BasicColor, permanent: Boolean)
        // nullable = true from not(false or (false and false)) = true
    {
        // var string = string
        // var seconds = seconds
        // var basicColor = basicColor
        // var permanent = permanent

        if (permanent) {

            if (this.lastString != string) {

                this.lastString = string
                this.logUtil!!.putF(
                    StringMaker()
                        .append(this.PERMANENT_GAME_NOTIFICATION)!!
                        .append(string)!!
                        .toString(),
                    this,
                    this.commonStrings!!.ADD,
                )
            }

            this.permanentGameNotification!!.add(string, seconds, basicColor)
            this.circularIndexUtil!!.setSize(this.permanentGameNotification!!.getSize())
        } else {
            this.gameNotification!!.add(string, seconds, basicColor)
        }
    }

    @Throws(Exception::class)
    override fun processTick()
        // nullable = true from not(false or (false and true)) = true
    {

        if (this.timeDelayHelper!!.isTime(this.gameTickTimeDelayHelper!!.startTime)) {

            var gameAdState: GameAdState = GameAdStateFactory.getInstance()!!.getCurrentInstance()!!

            if (gameAdState!!.isShowingAtLocation(this.getLocation())) {

                this.offsetY = -54
            } else {
                this.offsetY = 0
            }

            if (this.gameNotification!!.getSize() > 0) {

                this.setAndRemove()
            } else if (this.permanentGameNotification!!.getSize() > 0) {

                this.setNextUnremoveable()
            } else {
                this.string = this.EMPTY_STRING
            }
        }
    }

    @Throws(Exception::class)
    open fun setAndRemove()
        // nullable = true from not(false or (false and true)) = true
    {
        this.string = this.gameNotification!!.stringList!!.removeAt(0) as String
        this.processor = this.setAndRemoveProcessor
    }

    @Throws(Exception::class)
    open fun setAndRemoveProcess()
        // nullable = true from not(false or (false and true)) = true
    {
        this.setX((this.displayInfo!!.getLastWidth() - this.width) shr 1)
        this.point.setX(this.getX())
        this.point.setY(this.getY())

        var time: Integer = this.gameNotification!!.timeList!!.removeAt(0) as Integer

        var iTime: Int = time.toInt() * 1000

        if (iTime == 0) {

            iTime = 500
        }

        this.timeDelayHelper!!.delay = iTime
        this.setBasicColorP(this.gameNotification!!.colorList!!.removeAt(0) as BasicColor)
    }

    @Throws(Exception::class)
    open fun setNextUnremoveable()
        // nullable = true from not(false or (false and true)) = true
    {

        var index: Int = this.circularIndexUtil!!.getIndex()!!

        this.string = this.permanentGameNotification!!.stringList!!.objectArray[index]!! as String
        this.processor = this.nextUnremoveableProcessor
    }

    @Throws(Exception::class)
    open fun setNextUnremoveableProcess()
        // nullable = true from not(false or (false and true)) = true
    {

        var index: Int = this.circularIndexUtil!!.getIndex()!!

        this.setX((this.displayInfo!!.getLastWidth() - this.width) shr 1)
        this.point.setX(this.getX())
        this.point.setY(this.getY())

        var time: Integer =
            this.permanentGameNotification!!.timeList!!.objectArray[index]!! as Integer

        this.timeDelayHelper!!.delay = time.toInt() * 1000
        this.setBasicColorP(
            this.permanentGameNotification!!.colorList!!.objectArray[index]!! as BasicColor
        )
        this.circularIndexUtil!!.next()
    }

    override fun clear()
        // nullable = true from not(false or (false and true)) = true
    {
        this.gameNotification!!.clear()
        this.permanentGameNotification!!.clear()
    }

    override fun paint(graphics: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        var graphics = graphics
        this.myFontProcessor!!.process(graphics)
        super.paint(graphics, this.string)
    }
}
