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
package org.allbinary.game.layer

import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.color.BasicColorSetUtil
import org.allbinary.graphics.paint.Paintable

open public class SWTBlackPaintable : Paintable {

    // Auto Generated
    public constructor() : super() {}

    private val basicSetColorUtil: BasicColorSetUtil = BasicColorSetUtil.getInstance()!!

    private val BLACK: BasicColor = BasicColorFactory.getInstance()!!.BLACK

    override fun paint(graphics: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        var graphics = graphics
        this.basicSetColorUtil!!.setBasicColorP(graphics, this.BLACK)
    }
}
