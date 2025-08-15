
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
        package org.allbinary.game




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.state.GameState
import org.allbinary.game.state.GameStateFactory

open public class IntermissionFactory
            : Object
         {
        

        companion object {
            
    private val instance: IntermissionFactory = IntermissionFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: IntermissionFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val START_LEVEL_INTERMISSION_GAME_STATE: GameState = GameStateFactory.getInstance("START_LEVEL_INTERMISSION_GAME_STATE")!!
            

    val WAIT_LEVEL_INTERMISSION_GAME_STATE: GameState = GameStateFactory.getInstance("WAIT_LEVEL_INTERMISSION_GAME_STATE")!!
            

    val SHOW_RESULTS_LEVEL_INTERMISSION_GAME_STATE: GameState = GameStateFactory.getInstance("SHOW_RESULTS_LEVEL_INTERMISSION_GAME_STATE")!!
            

    val SHOW_HIGH_SCORE_LEVEL_INTERMISSION_GAME_STATE: GameState = GameStateFactory.getInstance("SHOW_HIGH_SCORE_LEVEL_INTERMISSION_GAME_STATE")!!
            

}
                
            

