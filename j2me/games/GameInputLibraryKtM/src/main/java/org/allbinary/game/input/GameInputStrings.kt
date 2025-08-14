
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
        package org.allbinary.game.input




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class GameInputStrings
            : Object
         {
        

        companion object {
            
    private val instance: GameInputStrings = GameInputStrings()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameInputStrings{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val PROCESS_INPUT: String = "processInput"

    val KEY_PRESSED: String = "keyPressed"

    val KEY_RELEASED: String = "keyReleased"

    val KEY_REPEATED: String = "keyRepeated"

    val ON_PRESS_GAME_KEY: String = "onPressGameKeyEvent"

    val ON_DOWN_GAME_KEY: String = "onDownGameKeyEvent"

    val ON_UP_GAME_KEY: String = "onUpGameKeyEvent"

    val NO_KEY: String = "Key Code Not Mapped For Game: "

    val ADD_KEY_EVENT: String = "addGameKeyEvent"

    val REMOVE_KEY_EVENT: String = "removeGameKeyEvent"

    val STRAFE_LEFT: String = "strafeLeft"

    val STRAFE_RIGHT: String = "strafeRight"

    val PROCESS_MOTION_INPUT: String = "processMotionInput"

    val UDPATE_CURRENT_TOUCH_INPUT_FACTORY: String = "updateCurrentTouchInputFactory"

    val ENABLE_PLAYER_GAME_INPUTS: String = "Enabling PlayerGameInputs: "

    val ENABLE_PLAYER_GAME_INPUT: String = "Enabling PlayerGameInput: "

}
                
            

