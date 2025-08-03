
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class GameStrings
            : Object
         {
        

        companion object {


    private val instance: GameStrings = GameStrings()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameStrings{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val PROCESS_TICK: String = "processTick"

    val ON_GAME_INITIALIZED: String = "onGameInitialized"

    val UPDATESURFACE: String = "updateSurface"

    val ON_SET_DISPLAYABLE: String = "onSetDisplayable"

    val UNPAUSE: String = "unPause"

    val TOGGLE_MENU: String = "toggleMenu"

    val SET_GAME_OVER: String = "setGameOver"

    val GAME_STATE: String = "Game State: "

    val SET_GAME_STATE: String = "setGameState"

    val STOP_GAME_CANVAS_RUNNABLE_INTERFACE: String = "stopGameCanvasRunnableInterface"

}
                
            

