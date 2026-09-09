
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
        
import org.allbinary.media.graphics.geography.map.GeographicMapInterface

interface RaceTrackGeographicMapInterface : GeographicMapInterface {
        

    open fun getRaceTrackInfo()
        //nullable = true from not(false or (false and true)) = true
: RaceTrackInfo

    open fun setRaceTrackInfo(aRaceTrackInfo: RaceTrackInfo)
        //nullable = true from not(false or (false and false)) = true


    open fun getRaceTrackData()
        //nullable = true from not(false or (false and true)) = true
: RaceTrackData

    open fun setRaceTrackData(raceTrackData: RaceTrackData)
        //nullable = true from not(false or (false and false)) = true


}
                
            

