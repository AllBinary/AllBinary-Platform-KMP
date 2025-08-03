
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
        package org.allbinary.game.input.motion.action



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.CompleteMotionGestureInputEvent
import org.allbinary.game.input.GameKey
import org.allbinary.game.input.GameKeyEventSourceInterface
import org.allbinary.game.input.event.GameKeyEvent
import org.allbinary.game.input.mapping.InputToGameKeyMapping
import org.allbinary.input.motion.gesture.MotionGestureInput

open public class GameKeyCompleteMotionGestureInputEvent : CompleteMotionGestureInputEvent
                , GameKeyEventSourceInterface {
        

    private var gameKey: GameKey = GameKey.NULL_GAME_KEY

    private var gameKeyEvent: GameKeyEvent = GameKeyEvent.NONE
public constructor        (name: String, motionGestureInput: MotionGestureInput, inputToGameKeyMapping: InputToGameKeyMapping)                        

                            : super(name, motionGestureInput){

                    var name = name


                    var motionGestureInput = motionGestureInput


                    var inputToGameKeyMapping = inputToGameKeyMapping


                            //For kotlin this is before the body of the constructor.
                    
}

override fun getSourceId()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


open fun update()
        //nullable = true from not(false or (false and true)) = true
{}


open fun setGameKeyEvent(gameKeyEvent: GameKeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameKeyEvent = gameKeyEvent
this.gameKeyEvent= gameKeyEvent
}


open fun getGameKeyEvent()
        //nullable = true from not(false or (false and true)) = true
: GameKeyEvent{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameKeyEvent
}


open fun setGameKey(gameKey: GameKey)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameKey = gameKey
this.gameKey= gameKey
}


open fun getGameKey()
        //nullable = true from not(false or (false and true)) = true
: GameKey{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameKey
}


}
                
            

