
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
        package org.allbinary.media.graphics.geography.map.racetrack.threed




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.media.graphics.geography.map.racetrack.RaceTrackData
import org.allbinary.media.graphics.geography.map.racetrack.RaceTrackInfo

open public class AllBinaryThreedTiledLayerFactory
            : Object
         {
        
companion object {
            
    private val instance: AllBinaryThreedTiledLayerFactory = AllBinaryThreedTiledLayerFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AllBinaryThreedTiledLayerFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            
    open fun getInstance(raceTrackInfo: RaceTrackInfo, raceTrackData: RaceTrackData)
        //nullable =  from not(true or (false and false)) = 
: AllBinaryTiledLayer{
var raceTrackInfo = raceTrackInfo
var raceTrackData = raceTrackData



                            throw Exception("No Threed")
}


}
                
            

