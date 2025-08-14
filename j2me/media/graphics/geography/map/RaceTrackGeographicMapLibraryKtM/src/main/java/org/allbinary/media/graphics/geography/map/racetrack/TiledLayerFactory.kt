
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
        
import javax.microedition.lcdui.game.TiledLayer

open public class TiledLayerFactory
            : Object
         {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun getInstance(raceTrackData: RaceTrackData)
        //nullable =  from not(true or (false and false)) = 
: TiledLayer{

                    var raceTrackData = raceTrackData



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TiledLayer(raceTrackData!!.getMapArray()[0]!!.length, raceTrackData!!.getMapArray()!!.length, raceTrackData!!.getTileSetImage(), raceTrackData!!.getCellWidth(), raceTrackData!!.getCellHeight())
}


open fun getMiniInstance(raceTrackData: RaceTrackData)
        //nullable = true from not(false or (false and false)) = true
: TiledLayer{

                    var raceTrackData = raceTrackData



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TiledLayer(raceTrackData!!.getMapArray()[0]!!.length, raceTrackData!!.getMapArray()!!.length, raceTrackData!!.getMiniTileSetImage(), raceTrackData!!.getMiniCellWidth(), raceTrackData!!.getMiniCellHeight())
}


}
                
            

