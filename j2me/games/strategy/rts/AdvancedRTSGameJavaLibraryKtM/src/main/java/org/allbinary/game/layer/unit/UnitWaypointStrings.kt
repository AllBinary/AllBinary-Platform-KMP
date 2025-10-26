
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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
        package org.allbinary.game.layer.unit




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class UnitWaypointStrings
            : Object
         {
        
companion object {
            
    private val instance: UnitWaypointStrings = UnitWaypointStrings()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: UnitWaypointStrings{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val WANDERING: String = "Order?"

    val THINKING: String = "Thinking"

    val THINKING_ABOUT_TARGET: String = "Hmmm"

    val TARGET: String = "Target"

    val KILL: String = "Kill!"

    val STOP: String = "Stop"

    val WAYPOINT_DESTROYED_SHORT: String = "Uh Oh"

    val WAYPOINT_DESTROYED: String = "Waypoint Destroyed"

    val ALL_VISITED_SHORT: String = "Arrived"

    val ALL_VISITED: String = "All Visited"

    val ALREADY_THERE_SHORT: String = "Again?"

    val ALREADY_THERE: String = "Already There"

    val NEXT_PATH_NODE: String = "Next Path Node"

}
                
            

