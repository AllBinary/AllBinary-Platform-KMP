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

import java.lang.Integer
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.graphics.color.BasicColor
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.GeographicMapCellPositionBaseFactory
import org.allbinary.media.graphics.geography.map.GeographicMapCellPositionFactoryInterface
import org.allbinary.media.graphics.geography.map.GeographicMapCellType
import org.allbinary.media.graphics.geography.map.GeographicMapCellTypeFactory
import org.allbinary.string.CommonStrings

open public class BaseRaceTrackGeographicMap : BasicGeographicMap, RaceTrackGeographicMapInterface {

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var raceTrackInfo: RaceTrackInfo

    private var raceTrackData: RaceTrackData

    private var miniGeographicMap: BasicGeographicMap

    public constructor(
        raceTrackInfo: RaceTrackInfo,
        raceTrackData: RaceTrackData,
        tiledLayer: AllBinaryTiledLayer,
        miniGeographicMap: BasicGeographicMap,
        geographicMapCellPositionFactoryInterface: GeographicMapCellPositionFactoryInterface,
        geographicMapCellPositionBaseFactory: GeographicMapCellPositionBaseFactory,
        geographicMapCellTypeFactory: GeographicMapCellTypeFactory,
    ) : super(
        raceTrackInfo!!.getId(),
        raceTrackInfo!!.getName(),
        raceTrackData!!.getCellTypeIdToGeographicMapCellTypeArray(),
        tiledLayer,
        raceTrackInfo!!.getForegroundBasicColor(),
        raceTrackInfo!!.getBackgroundBasicColor(),
        geographicMapCellPositionFactoryInterface,
        geographicMapCellPositionBaseFactory,
        geographicMapCellTypeFactory,
    ) {
        // var raceTrackInfo = raceTrackInfo
        // var raceTrackData = raceTrackData
        // var tiledLayer = tiledLayer
        // var miniGeographicMap = miniGeographicMap
        // var geographicMapCellPositionFactoryInterface = geographicMapCellPositionFactoryInterface
        // var geographicMapCellPositionBaseFactory = geographicMapCellPositionBaseFactory
        // var geographicMapCellTypeFactory = geographicMapCellTypeFactory

        // For kotlin this is before the body of the constructor.

        this.raceTrackInfo = raceTrackInfo
        this.raceTrackData = raceTrackData
        this.miniGeographicMap = miniGeographicMap

        var miniTiledLayer: AllBinaryTiledLayer =
            this.miniGeographicMap!!.getAllBinaryTiledLayer()!!

        if (
            miniTiledLayer!!.getColumns() !=
                this.getGeographicMapCellPositionFactory()!!.getColumns()
        ) {

            var error: String =
                StringMaker()
                    .append("RaceTrackMap has incorrect Mini Map columns: ")!!
                    .appendint(miniTiledLayer!!.getColumns().toInt())!!
                    .append(" != ")!!
                    .appendint(this.getGeographicMapCellPositionFactory()!!.getColumns().toInt())!!
                    .toString()!!

            var commonStrings: CommonStrings = CommonStrings.getInstance()!!

            this.logUtil!!.putF(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR)

            throw Exception(error)
        }

        if (miniTiledLayer!!.getRows() != this.getGeographicMapCellPositionFactory()!!.getRows()) {

            var error: String = "RaceTrackMap has incorrect Mini Map rows"

            var commonStrings: CommonStrings = CommonStrings.getInstance()!!

            this.logUtil!!.putF(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR)

            throw Exception(error)
        }
    }

    override fun getRaceTrackInfo()
    // nullable = true from not(false or (false and true)) = true
    : RaceTrackInfo {

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.raceTrackInfo
    }

    override fun setRaceTrackInfo(aRaceTrackInfo: RaceTrackInfo)
        // nullable = true from not(false or (false and false)) = true
    {
        var aRaceTrackInfo = aRaceTrackInfo
        this.raceTrackInfo = aRaceTrackInfo
    }

    open fun setMiniBasicGeographicMap(miniBasicGeographicMap: BasicGeographicMap)
        // nullable = true from not(false or (false and false)) = true
    {
        var miniBasicGeographicMap = miniBasicGeographicMap
        this.miniGeographicMap = miniBasicGeographicMap
    }

    open fun getMiniBasicGeographicMap()
    // nullable = true from not(false or (false and true)) = true
    : BasicGeographicMap {

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.miniGeographicMap
    }

    override fun getRaceTrackData()
    // nullable = true from not(false or (false and true)) = true
    : RaceTrackData {

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.raceTrackData
    }

    override fun setRaceTrackData(raceTrackData: RaceTrackData)
        // nullable = true from not(false or (false and false)) = true
    {
        var raceTrackData = raceTrackData
        this.raceTrackData = raceTrackData
    }

    override fun getId()
    // nullable = true from not(false or (false and true)) = true
    : Integer {

        // if statement needs to be on the same line and ternary does not work the same way.
        return super.getId()
    }

    override fun getName()
    // nullable = true from not(false or (false and true)) = true
    : String {

        // if statement needs to be on the same line and ternary does not work the same way.
        return super.getName()
    }

    override fun reset()
        // nullable = true from not(false or (false and true)) = true
    {
        super.reset()
    }

    override fun getAllBinaryTiledLayer()
    // nullable = true from not(false or (false and true)) = true
    : AllBinaryTiledLayer {

        // if statement needs to be on the same line and ternary does not work the same way.
        return super.getAllBinaryTiledLayer()
    }

    override fun getCellTypeFromMapCellTypeInt(
        cellTypeId: Int
    )
        // nullable = true from not(false or (false and false)) = true
        : Int {
        // var cellTypeId = cellTypeId

        // if statement needs to be on the same line and ternary does not work the same way.
        return super.getCellTypeFromMapCellTypeInt(cellTypeId)
    }

    @Throws(Exception::class)
    override fun getCellTypeAt(
        cellPosition: GeographicMapCellPosition
    )
        // nullable = true from not(false or (false and false)) = true
        : GeographicMapCellType {
        // var cellPosition = cellPosition

        // if statement needs to be on the same line and ternary does not work the same way.
        return super.getCellTypeAt(cellPosition)
    }

    override fun getForegroundBasicColor()
    // nullable = true from not(false or (false and true)) = true
    : BasicColor {

        // if statement needs to be on the same line and ternary does not work the same way.
        return super.getForegroundBasicColor()
    }

    override fun getBackgroundBasicColor()
    // nullable = true from not(false or (false and true)) = true
    : BasicColor {

        // if statement needs to be on the same line and ternary does not work the same way.
        return super.getBackgroundBasicColor()
    }
}
