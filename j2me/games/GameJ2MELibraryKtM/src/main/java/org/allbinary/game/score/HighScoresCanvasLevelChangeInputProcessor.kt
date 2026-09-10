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
package org.allbinary.game.score

import javax.microedition.lcdui.Canvas
import javax.microedition.lcdui.Font
import javax.microedition.lcdui.Graphics
import org.allbinary.game.input.event.GameKeyEventHandler
import org.allbinary.game.input.event.GameKeyEventUtil
import org.allbinary.game.score.displayable.HighScoresCanvas
import org.allbinary.graphics.Anchor
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.MyFontProcessor
import org.allbinary.graphics.font.UpdateMyFontInterface
import org.allbinary.graphics.font.UpdateMyFontProcessor
import org.allbinary.util.BasicArrayList

open public class HighScoresCanvasLevelChangeInputProcessor :
    HighScoresCanvasInputProcessor, UpdateMyFontInterface {

    private val displayInfoSingleton: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!

    private val INSTRUCTIONS: String = "(Right = Next Track, Left = Previous Track)"

    private var myFontProcessor: MyFontProcessor = UpdateMyFontProcessor(this)

    private var anchor: Int = Anchor.TOP_LEFT

    private var fontHeight: Int = 0

    public constructor(highScoresCanvas: HighScoresCanvas) : super(highScoresCanvas) {

        // var highScoresCanvas = highScoresCanvas

        // For kotlin this is before the body of the constructor.

    }

    override fun updateMeasurement(graphics: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        // var graphics = graphics

        var font: Font = graphics.getFont()!!

        this.fontHeight = font.getHeight()
        this.myFontProcessor = MyFontProcessor.getInstance()
    }

    override fun open()
        // nullable = true from not(false or (false and true)) = true
    {
        GameKeyEventHandler.getInstance()!!.addListener(this)
    }

    override fun close()
        // nullable = true from not(false or (false and true)) = true
    {
        GameKeyEventHandler.getInstance()!!.removeListener(this)
    }

    @Synchronized // TWB - This is not allowed for Kotlin native. Instead use Coroutine logic
    // instead.
    override fun update()
        // nullable = true from not(false or (false and true)) = true
    {

        var list: BasicArrayList = this.getGameKeyEventList()!!

        var size: Int = list.size()!!

        for (index in 0 until size) {

            var anyType: Any = list.objectArray[index]!!

            var key: Int = GameKeyEventUtil.getKey(anyType)!!

            if (key == Canvas.RIGHT) {

                this.getHighScoresCanvas()!!.getGameInfo()!!.nextGameLevel()
            } else if (key == Canvas.LEFT) {

                this.getHighScoresCanvas()!!.getGameInfo()!!.previousGameLevel()
            }

            this.getHighScoresCanvas()!!.executeUpdate()
        }

        list.clear()
    }

    override fun paint(graphics: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        var graphics = graphics
        this.myFontProcessor!!.process(graphics)

        var width: Int = this.displayInfoSingleton!!.getLastWidth()!!

        var topScoresWidth: Int = (graphics.getFont()!!.stringWidth(this.INSTRUCTIONS) shr 1)

        graphics.drawString(
            this.INSTRUCTIONS,
            (width shr 1) - topScoresWidth,
            this.fontHeight * 2,
            this.anchor,
        )
    }
}
