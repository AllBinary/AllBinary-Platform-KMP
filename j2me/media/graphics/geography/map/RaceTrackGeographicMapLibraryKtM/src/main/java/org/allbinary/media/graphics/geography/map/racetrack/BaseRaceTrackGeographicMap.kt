
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.logic.string.StringMaker
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCellPositionBaseFactory
import org.allbinary.media.graphics.geography.map.GeographicMapCellPositionFactoryInterface
import org.allbinary.media.graphics.geography.map.GeographicMapCellTypeFactory

open public class BaseRaceTrackGeographicMap : BasicGeographicMap
                , RaceTrackGeographicMapInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var raceTrackInfo: RaceTrackInfo

    private var raceTrackData: RaceTrackData

    private var miniGeographicMap: BasicGeographicMap
public constructor        (raceTrackInfo: RaceTrackInfo, raceTrackData: RaceTrackData, tiledLayer: AllBinaryTiledLayer, miniGeographicMap: BasicGeographicMap, geographicMapCellPositionFactoryInterface: GeographicMapCellPositionFactoryInterface, geographicMapCellPositionBaseFactory: GeographicMapCellPositionBaseFactory, geographicMapCellTypeFactory: GeographicMapCellTypeFactory)                        

                            : super(raceTrackInfo!!.getId(), raceTrackInfo!!.getName(), raceTrackData!!.getCellTypeIdToGeographicMapCellTypeArray(), tiledLayer, raceTrackInfo!!.getForegroundBasicColor(), raceTrackInfo!!.getBackgroundBasicColor(), geographicMapCellPositionFactoryInterface, geographicMapCellPositionBaseFactory, geographicMapCellTypeFactory)

        Updates for KMP build        
        {
    //var raceTrackInfo = raceTrackInfo
    //var raceTrackData = raceTrackData
    //var tiledLayer = tiledLayer
    //var miniGeographicMap = miniGeographicMap
    //var geographicMapCellPositionFactoryInterface = geographicMapCellPositionFactoryInterface
    //var geographicMapCellPositionBaseFactory = geographicMapCellPositionBaseFactory
    //var geographicMapCellTypeFactory = geographicMapCellTypeFactory


                            //For kotlin this is before the body of the constructor.
                    
this.setRaceTrackInfo(raceTrackInfo)
this.setRaceTrackData(raceTrackData)
this.miniGeographicMap= miniGeographicMap

    var miniTiledLayer: AllBinaryTiledLayer = this.miniGeographicMap!!.getAllBinaryTiledLayer()!!


    
                        if(miniTiledLayer!!.getColumns() != this.getGeographicMapCellPositionFactory()!!.getColumns())
                        
                                    {
                                    
    var error: String = StringMaker().
                            append("RaceTrackMap has incorrect Mini Map columns: ")!!.append(miniTiledLayer!!.getColumns())!!.append(" != ")!!.append(this.getGeographicMapCellPositionFactory()!!.getColumns())!!.toString()!!


    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR)



                            throw Exception(error)

                                    }
                                

    
                        if(miniTiledLayer!!.getRows() != this.getGeographicMapCellPositionFactory()!!.getRows())
                        
                                    {
                                    
    var error: String = "RaceTrackMap has incorrect Mini Map rows"


    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR)



                            throw Exception(error)

                                    }
                                
}


open fun getRaceTrackInfo()
        //nullable = true from not(false or (false and true)) = true
: RaceTrackInfo

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return raceTrackInfo
}


open fun setRaceTrackInfo(aRaceTrackInfo: RaceTrackInfo)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var aRaceTrackInfo = aRaceTrackInfo
raceTrackInfo= aRaceTrackInfo
}


open fun setMiniBasicGeographicMap(miniBasicGeographicMap: BasicGeographicMap)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var miniBasicGeographicMap = miniBasicGeographicMap
this.miniGeographicMap= miniBasicGeographicMap
}


open fun getMiniBasicGeographicMap()
        //nullable = true from not(false or (false and true)) = true
: BasicGeographicMap

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return miniGeographicMap
}


open fun getRaceTrackData()
        //nullable = true from not(false or (false and true)) = true
: RaceTrackData

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return raceTrackData
}


open fun setRaceTrackData(raceTrackData: RaceTrackData)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var raceTrackData = raceTrackData
this.raceTrackData= raceTrackData
}


}
                
            

