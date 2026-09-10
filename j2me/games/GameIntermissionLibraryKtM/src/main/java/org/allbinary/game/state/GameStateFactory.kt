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
package org.allbinary.game.state

import java.lang.Object
import org.allbinary.logic.NullUtil

open public class GameStateFactory : Object {

    companion object {

        private var instance: Any = NullUtil.getInstance()!!.NULL_OBJECT

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : GameStateFactory {

            if (GameStateFactory.instance == NullUtil.getInstance()!!.NULL_OBJECT) {

                GameStateFactory.instance = GameStateFactory()
            }

            // if statement needs to be on the same line and ternary does not work the same way.
            return GameStateFactory.instance as GameStateFactory
        }
    }

    private var index: Int = 0

    val NO_GAME_STATE: GameState = this.createGameState("NO_GAME_STATE")!!

    val PLAYING_GAME_STATE: GameState = this.createGameState("PLAYING_GAME_STATE")!!

    val SHOW_END_RESULT_GAME_STATE: GameState = this.createGameState("SHOW_END_RESULT_GAME_STATE")!!

    val SHOW_HIGH_SCORE_GAME_STATE: GameState = this.createGameState("SHOW_HIGH_SCORE_GAME_STATE")!!

    private constructor() : super() {}

    open fun createGameState(
        name: String
    )
        // nullable = true from not(false or (false and false)) = true
        : GameState {
        var name = name

        // if statement needs to be on the same line and ternary does not work the same way.
        return GameState(name, this.index++)
    }
}
