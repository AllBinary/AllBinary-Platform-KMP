
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2003 AllBinary 
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
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition

open public class WaypointPathRunnable : WaypointPathRunnableBase {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor        ()

        Updates for KMP build        
        {
}


open fun run()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

        try {
            pathFindingLayer!!.getWaypointRunnableLogHelper()!!.start(pathFindingLayer)

    var waypointBehavior: WaypointBehaviorBase = pathFindingLayer!!.getWaypointBehavior()!!


    var geographicMapCellPosition: GeographicMapCellPosition = pathFindingLayer!!.getCurrentGeographicMapCellPosition()!!


    
                        if(geographicMapCellPosition == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception("Should never be running here")

                                    }
                                
waypointBehavior!!.setWaypointPathsList(this.targetLayer!!.getWaypointBehavior()!!.getWaypoint()!!.getPathsList(geographicMapCellPosition))
pathFindingLayer!!.getWaypointRunnableLogHelper()!!.end(pathFindingLayer)
Thread.sleep(15 +(this.priority *2))
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
this.setRunning(false)
}

}


open fun isDone()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


}
                
            

