
        /* Generated Code Do Not Modify */
        package org.allbinary.game.midlet




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.state.GameState
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil

open public class GameMidletStateFactory
            : Object
         {
        

        companion object {
            
    private val INSTANCE: GameMidletStateFactory = GameMidletStateFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameMidletStateFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return INSTANCE
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var currentGameState: GameState = GameState.NO_GAME_STATE
private constructor        ()
            : super()
        {}


open fun getCurrentGameState()
        //nullable = true from not(false or (false and true)) = true
: GameState{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return currentGameState
}


open fun setCurrentGameState(currentGameState: GameState)
        //nullable = true from not(false or (false and false)) = true
{

                    var currentGameState = currentGameState
logUtil!!.put(StringMaker().
                            append("Current GameState: ")!!.append(StringUtil.getInstance()!!.toString(currentGameState))!!.toString(), this, "setCurrentGameState")
this.currentGameState= currentGameState
}


}
                
            

