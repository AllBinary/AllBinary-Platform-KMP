
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2006 AllBinary 
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
        package org.allbinary.game.input.form




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.AdvancedRTSGameLayer
import org.allbinary.game.layer.RTSLayer
import org.allbinary.game.layer.RTSLayerEvent
import org.allbinary.game.layer.unit.UnitLayer
import org.allbinary.game.layer.unit.UnitWaypointBehavior
import org.allbinary.util.BasicArrayList
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil

open public class AssignWaypointsUtil
            : Object
         {
        

        companion object {
            
    private val instance: AssignWaypointsUtil = AssignWaypointsUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AssignWaypointsUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val WAYPOINT_EVENT: RTSLayerEvent = RTSLayerEvent(
                            null)

open fun set(unitLayer: UnitLayer, ownerAdvancedRTSGameLayer: AdvancedRTSGameLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var unitLayer = unitLayer


                    var ownerAdvancedRTSGameLayer = ownerAdvancedRTSGameLayer

        try {
            
    var list: BasicArrayList = ownerAdvancedRTSGameLayer!!.getWaypointBehavior()!!.getOwnedWaypointList()!!
            


    var unitWaypointBehavior: UnitWaypointBehavior = unitLayer!!.getWaypointBehavior() as UnitWaypointBehavior





                        for (index in list.size() -1 downTo 0)


        {
    var waypointLayer: RTSLayer = list.get(index) as RTSLayer

WAYPOINT_EVENT.setRtsLayer(waypointLayer)
unitWaypointBehavior!!.onWaypointEvent(WAYPOINT_EVENT)
}


    var waypointLayer: RTSLayer = PrimaryWaypointHelper.getInstance()!!.getWaypointLayer()!!
            


    
                        if(waypointLayer != 
                                    null
                                )
                        
                                    {
                                    WAYPOINT_EVENT.setRtsLayer(waypointLayer)
unitWaypointBehavior!!.onWaypointEvent(WAYPOINT_EVENT)

                                    }
                                
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, "set", e)
}

}


}
                
            

