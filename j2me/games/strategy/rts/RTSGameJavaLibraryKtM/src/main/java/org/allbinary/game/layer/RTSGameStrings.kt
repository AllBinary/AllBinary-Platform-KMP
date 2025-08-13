
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class RTSGameStrings
            : Object
         {
        

        companion object {
            
    private val instance: RTSGameStrings = RTSGameStrings()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: RTSGameStrings{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val DRAG_TO_SPOT: String = "Please Drag"

    val NOT_YOURS: String = "Not Yours"

    val NEW_UNIT: String = "New Unit"

    val NEW_WAYPOINT: String = "New Waypoint"

    val BUILDING: String = "Building"

    val UPGRADE: String = "Upgrading"

    val DOWNGRADE: String = "Downgrading"

    val NO_MONEY: String = "Not Enough Money"

    val SPOT_TAKEN: String = "Spot Taken"

    val BUILDING_COLLISION: String = "Building Collision"

    val STRUCTURE_TO_CLOSE: String = "Building To Close"

    val MAP_EDGE: String = "Map Edge"

    val ROAD_COLLISION: String = "Road Collision"

    val SELECT_BUILD_SPOT: String = "Select Build Spot"

    val BUILD_ON_PATH: String = "Not On Path"

    val DRAGGABLE: String = "Draggable"

}
                
            

