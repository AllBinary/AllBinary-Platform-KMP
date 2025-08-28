
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.game.layer.waypoint




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.layer.PathFindingLayerInterface
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventListenerInterface
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.media.audio.Sound
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.pathfinding.MultipassState
import org.allbinary.media.graphics.geography.pathfinding.PathFindingInfo
import org.allbinary.util.BasicArrayList

open public class WaypointBase
            : Object
        
                , EventListenerInterface {
        

    private val connectedWaypointList: BasicArrayList = BasicArrayList()

    private val sound: Sound
public constructor        (sound: Sound)
            : super()
        

        Updates for KMP build        
        {
    //var sound = sound
this.sound= sound
}


open fun getSound()
        //nullable = true from not(false or (false and true)) = true
: Sound

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return sound
}


    var allBinaryGameLayerManager: AllBinaryGameLayerManager

                @Throws(Exception::class)
            
open fun setAllBinaryGameLayerManager(allBinaryGameLayerManager: AllBinaryGameLayerManager)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var allBinaryGameLayerManager = allBinaryGameLayerManager
this.allBinaryGameLayerManager= allBinaryGameLayerManager
}


open fun getConnectedWaypointList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return connectedWaypointList
}


open fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var eventObject = eventObject
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}


                @Throws(Exception::class)
            
open fun getPathFindingInfo(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: PathFindingInfo

        Updates for KMP build        
        {
    //var geographicMapCellPosition = geographicMapCellPosition



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(Exception::class)
            
open fun getPathsList(geographicMapCellPosition: GeographicMapCellPosition, pathFindingInfo: PathFindingInfo, multipassState: MultipassState)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList

        Updates for KMP build        
        {
    //var geographicMapCellPosition = geographicMapCellPosition
    //var pathFindingInfo = pathFindingInfo
    //var multipassState = multipassState



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(Exception::class)
            
open fun getPathsList(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList

        Updates for KMP build        
        {
    //var geographicMapCellPosition = geographicMapCellPosition



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(Exception::class)
            
open fun getPathsListFromCacheOnly(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList

        Updates for KMP build        
        {
    //var geographicMapCellPosition = geographicMapCellPosition



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(Exception::class)
            
open fun visit(unitLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var unitLayer = unitLayer
}


open fun reset()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


open fun getType()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


}
                
            

