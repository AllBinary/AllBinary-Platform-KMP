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
package org.allbinary.media.graphics.geography.map.racetrack

import org.allbinary.media.graphics.geography.pathfinding.PathFindingNodeCostInfoData
import org.allbinary.string.CommonStrings

open public class EmptyRaceRaceTrackGeographicMapCellTypeFactory :
    RaceTrackGeographicMapCellTypeFactory {

    companion object {

        private val instanceC: EmptyRaceRaceTrackGeographicMapCellTypeFactory =
            EmptyRaceRaceTrackGeographicMapCellTypeFactory()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : EmptyRaceRaceTrackGeographicMapCellTypeFactory {

            // if statement needs to be on the same line and ternary does not work the same way.
            return EmptyRaceRaceTrackGeographicMapCellTypeFactory.instanceC
        }
    }

    private constructor() {

        var commonStrings: CommonStrings = CommonStrings.getInstance()!!

        this.EMPTY_CELL_TYPE =
            RaceTrackGeographicMapCellType(
                commonStrings!!.EMPTY,
                0,
                PathFindingNodeCostInfoData.getInstance()!!.MAX_NODE_COST,
                1,
            )
        this.EASY_CELL_TYPE = RaceTrackGeographicMapCellType("Easy", 19, 1, 0)
        this.FINISH_LINE_ROAD_CELL_TYPE = this.DEFAULT_FINISH_LINE_ROAD_CELL_TYPE
    }
}
