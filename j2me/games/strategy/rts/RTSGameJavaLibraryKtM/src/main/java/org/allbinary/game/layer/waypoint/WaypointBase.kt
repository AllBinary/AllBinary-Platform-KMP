
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
import org.allbinary.media.audio.NoSound
import org.allbinary.media.audio.Sound
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.pathfinding.MultipassState
import org.allbinary.media.graphics.geography.pathfinding.PathFindingInfo
import org.allbinary.util.BasicArrayList

open public class WaypointBase
            : Object
        
                , EventListenerInterface {
        
companion object {
            
    var NULL_WAYPOINT_BASE: WaypointBase = WaypointBase(NoSound.getInstance())

        }
            
    private val connectedWaypointList: BasicArrayList = BasicArrayList()

    private val sound: Sound

    var allBinaryGameLayerManagerP: AllBinaryGameLayerManager = AllBinaryGameLayerManager.NULL_ALLBINARY_LAYER_MANAGER
public constructor (sound: Sound)
            : super()
        {
    //var sound = sound
this.sound= sound
}


    open fun getSound()
        //nullable = true from not(false or (false and true)) = true
: Sound{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return sound
}


                @Throws(Exception::class)
            
    open fun setAllBinaryGameLayerManager(allBinaryGameLayerManager: AllBinaryGameLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
    //var allBinaryGameLayerManager = allBinaryGameLayerManager
this.allBinaryGameLayerManagerP= allBinaryGameLayerManager
}


    open fun getConnectedWaypointList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return connectedWaypointList
}


    override fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{
    //var eventObject = eventObject
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}


                @Throws(Exception::class)
            
    open fun getPathFindingInfo(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: PathFindingInfo{
    //var geographicMapCellPosition = geographicMapCellPosition



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    open fun getPathsList(geographicMapCellPosition: GeographicMapCellPosition, pathFindingInfo: PathFindingInfo, multipassState: MultipassState)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{
    //var geographicMapCellPosition = geographicMapCellPosition
    //var pathFindingInfo = pathFindingInfo
    //var multipassState = multipassState



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    open fun getPathsList(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{
    //var geographicMapCellPosition = geographicMapCellPosition



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    open fun getPathsListFromCacheOnly(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{
    //var geographicMapCellPosition = geographicMapCellPosition



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
    open fun visit(unitLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var unitLayer = unitLayer
}


    open fun reset()
        //nullable = true from not(false or (false and true)) = true
{
}


    open fun getType()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


}
                
            

