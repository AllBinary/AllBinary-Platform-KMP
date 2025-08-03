
        /* Generated Code Do Not Modify */
        package org.allbinary.media.graphics.geography.map.racetrack



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.AllBinaryTiledLayer
interface AllBinaryTiledLayerFactoryInterface {
        

                @Throws(Exception::class)
            
open fun getInstance(raceTrackInfo: RaceTrackInfo, raceTrackData: RaceTrackData)
        //nullable =  from not(true or (false and false)) = 
: AllBinaryTiledLayer

                @Throws(Exception::class)
            
open fun getMiniInstance(raceTrackData: RaceTrackData)
        //nullable = true from not(false or (false and false)) = true
: AllBinaryTiledLayer

}
                
            

