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
package org.allbinary.game.ag.layer.hud.basic

import org.allbinary.canvas.Processor

open public class SetAndRemoveProcessor : Processor {

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
