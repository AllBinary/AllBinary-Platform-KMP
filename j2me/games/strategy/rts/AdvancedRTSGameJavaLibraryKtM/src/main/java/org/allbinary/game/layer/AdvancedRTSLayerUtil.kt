
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2002 AllBinary 
                *   
                *  By agreeing to this license you and any business entity you represent are 
                *  legally bound to the AllBinary Open License Version 1 legal agreement. 
                *   
                *  You may obtain the AllBinary Open License Version 1 legal agreement from 
                *  AllBinary or the root directory of AllBinary's AllBinary Platform repository. 
                *    Created By: Travis Berthelot  
        */
        
        /* Generated Code Do Not Modify */
        package org.allbinary.game.layer



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.game.layer.waypoint.WorkWaypoint
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.media.graphics.geography.map.racetrack.BaseRaceTrackGeographicMap

open public class AdvancedRTSLayerUtil
            : Object
         {
        

        companion object {


    private val instance: AdvancedRTSLayerUtil = AdvancedRTSLayerUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AdvancedRTSLayerUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun createFakeRTSLayerHashtable(baseRaceTrackGeographicMap: BaseRaceTrackGeographicMap)
        //nullable = true from not(false or (false and false)) = true
: Hashtable<Any, Any>{

                    var baseRaceTrackGeographicMap = baseRaceTrackGeographicMap

    var hashtable: Hashtable<Any, Any> = RTSLayerUtil.getInstance()!!.createFakeRTSLayerHashtable(baseRaceTrackGeographicMap)!!
            

hashtable.put(WorkWaypoint.ID, SmallIntegerSingletonFactory.getInstance()!!.getInstance(50))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashtable
}


}
                
            

