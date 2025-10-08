
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.game.TiledLayer
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.media.graphics.geography.map.racetrack.AllBinaryTiledLayerFactoryInterface
import org.allbinary.media.graphics.geography.map.racetrack.RaceTrackData
import org.allbinary.media.graphics.geography.map.racetrack.RaceTrackInfo
import org.allbinary.media.graphics.geography.map.racetrack.TiledLayerFactory

open public class AllBinaryTiledLayerFactory
            : Object
        
                , AllBinaryTiledLayerFactoryInterface {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            
    open fun getInstance(raceTrackInfo: RaceTrackInfo, raceTrackData: RaceTrackData)
        //nullable =  from not(true or (false and false)) = 
: AllBinaryTiledLayer{
    //var raceTrackInfo = raceTrackInfo
    //var raceTrackData = raceTrackData

    var allbinaryTiledLayer: AllBinaryTiledLayer


    var tiledLayer: TiledLayer = TiledLayerFactory().
                            getInstance(raceTrackData)!!

allbinaryTiledLayer= AllBinaryJ2METiledLayer(raceTrackData!!.getId(), tiledLayer, raceTrackData!!.getMapArray(), BasicColorFactory.getInstance()!!.RED.toInt())
allbinaryTiledLayer!!.setCells(raceTrackData!!.getMapArray())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return allbinaryTiledLayer
}


                @Throws(Exception::class)
            
    open fun getMiniInstance(raceTrackData: RaceTrackData)
        //nullable = true from not(false or (false and false)) = true
: AllBinaryTiledLayer{
var raceTrackData = raceTrackData

    var smallIntegerSingletonFactory: SmallIntegerSingletonFactory = SmallIntegerSingletonFactory.getInstance()!!


    var tiledLayer: TiledLayer = TiledLayerFactory().
                            getMiniInstance(raceTrackData)!!


    var allbinaryTiledLayer: AllBinaryTiledLayer = AllBinaryJ2METiledLayer(smallIntegerSingletonFactory!!.getInstance(raceTrackData!!.getId()!!.toInt() +100 +1), tiledLayer, raceTrackData!!.getMapArray(), BasicColorFactory.getInstance()!!.RED.toInt())

allbinaryTiledLayer!!.setCells(raceTrackData!!.getMapArray())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return allbinaryTiledLayer
}


}
                
            

