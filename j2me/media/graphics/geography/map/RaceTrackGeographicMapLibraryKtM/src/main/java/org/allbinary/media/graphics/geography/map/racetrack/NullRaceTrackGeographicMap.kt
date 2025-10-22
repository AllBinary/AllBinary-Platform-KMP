
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.graphics.color.BasicColor
import org.allbinary.layer.Layer
import org.allbinary.media.graphics.geography.map.BasicGeographicMapCellPositionFactory
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.GeographicMapCellPositionFactoryInterface
import org.allbinary.media.graphics.geography.map.GeographicMapCellType

open public class NullRaceTrackGeographicMap
            : Object
        
                , RaceTrackGeographicMapInterface {
        
companion object {
            
    val NULL_RACE_TRACK_GEOGRAPHIC_MAP: NullRaceTrackGeographicMap = NullRaceTrackGeographicMap()

        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    override fun getId()
        //nullable = true from not(false or (false and true)) = true
: Integer{



                            throw RuntimeException()
}


    override fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{



                            throw RuntimeException()
}


    override fun reset()
        //nullable = true from not(false or (false and true)) = true
{



                            throw RuntimeException()
}


    override fun getAllBinaryTiledLayer()
        //nullable = true from not(false or (false and true)) = true
: AllBinaryTiledLayer{



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    override fun getCellPositionsAt(layer: Layer, currentCellPositionArray: Array<Array<GeographicMapCellPosition?>?>, cellPositionArray: Array<Array<GeographicMapCellPosition?>?>)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var layer = layer
var currentCellPositionArray = currentCellPositionArray
var cellPositionArray = cellPositionArray



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    override fun getCellPositionAt(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellPosition{
var x = x
var y = y



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    override fun getCellPositionAtNoThrow(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellPosition{
var x = x
var y = y



                            throw RuntimeException()
}


    override fun getCellTypeFromMapCellTypeInt(cellTypeId: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
var cellTypeId = cellTypeId



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    override fun getCellTypeAt(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellType{
var x = x
var y = y



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    override fun getCellTypeAt(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellType{
var geographicMapCellPosition = geographicMapCellPosition



                            throw RuntimeException()
}


    override fun getGeographicMapCellPositionFactory()
        //nullable = true from not(false or (false and true)) = true
: BasicGeographicMapCellPositionFactory{



                            throw RuntimeException()
}


    override fun getGeographicMapCellPositionFactoryInterface()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPositionFactoryInterface{



                            throw RuntimeException()
}


    override fun getForegroundBasicColor()
        //nullable = true from not(false or (false and true)) = true
: BasicColor{



                            throw RuntimeException()
}


    override fun getBackgroundBasicColor()
        //nullable = true from not(false or (false and true)) = true
: BasicColor{



                            throw RuntimeException()
}


    override fun getRaceTrackInfo()
        //nullable = true from not(false or (false and true)) = true
: RaceTrackInfo{



                            throw RuntimeException()
}


    override fun setRaceTrackInfo(aRaceTrackInfo: RaceTrackInfo)
        //nullable = true from not(false or (false and false)) = true
{
var aRaceTrackInfo = aRaceTrackInfo



                            throw RuntimeException()
}


    override fun getRaceTrackData()
        //nullable = true from not(false or (false and true)) = true
: RaceTrackData{



                            throw RuntimeException()
}


    override fun setRaceTrackData(raceTrackData: RaceTrackData)
        //nullable = true from not(false or (false and false)) = true
{
var raceTrackData = raceTrackData



                            throw RuntimeException()
}


}
                
            

