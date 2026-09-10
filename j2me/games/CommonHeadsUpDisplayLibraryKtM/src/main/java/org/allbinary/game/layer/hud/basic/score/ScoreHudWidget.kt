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
package org.allbinary.game.layer.hud.basic.score

import javax.microedition.lcdui.Font
import javax.microedition.lcdui.Graphics
import org.allbinary.game.layer.hud.basic.NumberStringHud
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory

open public class ScoreHudWidget : NumberStringHud {

    companion object {

        @Throws(Exception::class)
        open fun getInstance(
            maxscore: Int,
            location: Int,
            direction: Int,
        )
            // nullable =  from not(true or (false and false)) =
            : ScoreHudWidget {
            // var maxscore = maxscore
            // var location = location
            // var direction = direction

            // if statement needs to be on the same line and ternary does not work the same way.
            return ScoreHudWidget(
                maxscore,
                location,
                direction,
                2,
                BasicColorFactory.getInstance()!!.GREY,
            )
        }
    }

    public constructor(
        maxscore: Int,
        location: Int,
        direction: Int,
        bufferZone: Int,
        basicColor: BasicColor,
    ) : super("Pts ", maxscore, location, direction, bufferZone, basicColor) {
        var maxscore = maxscore
        var location = location
        var direction = direction
        var bufferZone = bufferZone
        var basicColor = basicColor

        // For kotlin this is before the body of the constructor.

        this.updateMaxHeight = 14
    }

    override fun updateMeasurement(graphics: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        // var graphics = graphics

        var font: Font = graphics.getFont()!!

        this.updateMaxWidth = font.getSize() * 5
        super.updateMeasurement(graphics)
    }
}
