/*
 *
 *  AllBinary Open License Version 1
 *  Copyright (c) 2026 AllBinary
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

import org.allbinary.canvas.Processor
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvasFactory

open public class InitGameProcessor : Processor {

    private var gameCanvas: AllBinaryGameCanvas

    public constructor(gameCanvas: AllBinaryGameCanvas) {
        var gameCanvas = gameCanvas
        this.gameCanvas = gameCanvas
    }

    @Throws(Exception::class)
    override fun process()
        // nullable = true from not(false or (false and true)) = true
    {

        if (ProgressCanvasFactory.getInstance()!!.isInGame()) {

            this.gameCanvas!!.setProcessGameProcessorInit()
        }
    }
}
