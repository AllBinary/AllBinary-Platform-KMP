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
package org.allbinary.graphics.canvas.transition.progress

import org.allbinary.canvas.Processor
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.paint.NullPaintable
import org.allbinary.image.ImageCacheFactory

open public class LazyProgressCanvas : ProgressCanvas {

    public constructor(
        title: String,
        backgroundBasicColor: BasicColor,
        foregroundBasicColor: BasicColor,
    ) : super(title, backgroundBasicColor, foregroundBasicColor) {
        // var title = title
        // var backgroundBasicColor = backgroundBasicColor
        // var foregroundBasicColor = foregroundBasicColor

        // For kotlin this is before the body of the constructor.

    }

    override fun start()
        // nullable = true from not(false or (false and true)) = true
    {
        super.start()
        this.hasPainted = false
    }

    override fun end()
        // nullable = true from not(false or (false and true)) = true
    {

        try {
            this.logUtil!!.putF(
                this.commonStrings!!.START,
                this,
                this.commonStrings!!.END_METHOD_NAME,
            )
            this.endActual()
            this.paintable = this.GAUGE_PAINTABLE
            ImageCacheFactory.getInstance()!!.runTask()
            ImageCacheFactory.getInstance()!!.progressEnded()
        } catch (e: Exception) {
            this.logUtil!!.putF(
                this.commonStrings!!.EXCEPTION,
                this,
                this.commonStrings!!.END_METHOD_NAME,
            )
        }
    }

    override fun inGame()
        // nullable = true from not(false or (false and true)) = true
    {
        this.inGameProcessor = Processor.getInstance()
    }

    override fun endFromInitialLazyLoadingComplete()
        // nullable = true from not(false or (false and true)) = true
    {
        super.endFromInitialLazyLoadingComplete()
        this.paintable = NullPaintable.getInstance()
    }

    override fun endIfPaintedSinceStart()
        // nullable = true from not(false or (false and true)) = true
    {

        if (this.paintable == this.GAUGE_PAINTABLE && this.hasPainted) {

            this.endFromInitialLazyLoadingComplete()
        }
    }
}
