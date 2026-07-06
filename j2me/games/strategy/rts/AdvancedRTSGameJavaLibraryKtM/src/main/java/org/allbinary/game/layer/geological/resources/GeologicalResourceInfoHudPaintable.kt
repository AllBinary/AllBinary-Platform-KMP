/*
 *
 *  AllBinary Open License Version 1
 *  Copyright (c) 2006 AllBinary
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
package org.allbinary.game.layer.geological.resources

import javax.microedition.lcdui.Font
import javax.microedition.lcdui.Graphics
import org.allbinary.game.layer.RTSLayer
import org.allbinary.game.layer.waypoint.WaypointInfoHudPaintable
import org.allbinary.graphics.draw.KeyValueDrawCharArray
import org.allbinary.util.BasicArrayList

open public class GeologicalResourceInfoHudPaintable : WaypointInfoHudPaintable {

    companion object {

        private val RESOURCES: String = "Resources: "
    }

    private val keyvalueDrawString: KeyValueDrawCharArray

    private var fontHeight: Int = 0

    public constructor() {
        this.keyvalueDrawString =
            KeyValueDrawCharArray(GeologicalResourceInfoHudPaintable.RESOURCES, this.textX)
    }

    override fun updateMeasurement(graphics: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        // var graphics = graphics
        super.updateMeasurement(graphics)

        var font: Font = graphics.getFont()!!

        this.fontHeight = (2 * font.getHeight())
    }

    override fun updateSelectionInfo()
        // nullable = true from not(false or (false and true)) = true
    {
        super.updateSelectionInfo()

        var rtsLayer: RTSLayer = this.rtsLayerP as RTSLayer

        var list: BasicArrayList =
            rtsLayer!!
                .geographicMapCellPositionAreaBase!!
                .getOccupyingGeographicMapCellPositionList()!!

        var total: Int = 0

        for (index in list.size()!! - 1 downTo 0) {

            var geographicMapCellPosition: GeologicalGeographicMapCellPosition =
                list.get(index) as GeologicalGeographicMapCellPosition

            total += geographicMapCellPosition!!.getGeologicalResource()!!.getTotal()
        }

        this.keyvalueDrawString!!.update(
            this.getPrimitiveLongUtil()!!.getCharArray(total),
            this.getPrimitiveLongUtil()!!.getCurrentTotalDigits(),
        )
    }

    override fun paint(graphics: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        var graphics = graphics
        super.paint(graphics)
        this.keyvalueDrawString!!.paint(graphics, (this.y + this.fontHeight))
    }
}
