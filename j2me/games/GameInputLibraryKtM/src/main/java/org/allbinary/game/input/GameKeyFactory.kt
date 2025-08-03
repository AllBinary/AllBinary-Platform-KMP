
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Canvas
import org.allbinary.string.CommonPhoneStrings

open public class GameKeyFactory
            : Object
         {
        

        companion object {


    private val instance: GameKeyFactory = GameKeyFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameKeyFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val NONE: GameKey = GameKey(InputFactory.getInstance()!!.MAX -1, 
                            "None")

    val UP: GameKey = GameKey(Canvas.UP, CommonPhoneStrings.getInstance()!!.UP)

    val DOWN: GameKey = GameKey(Canvas.DOWN, CommonPhoneStrings.getInstance()!!.DOWN)

    val LEFT: GameKey = GameKey(Canvas.LEFT, CommonPhoneStrings.getInstance()!!.LEFT)

    val RIGHT: GameKey = GameKey(Canvas.RIGHT, CommonPhoneStrings.getInstance()!!.RIGHT)

    val KEY_POUND: GameKey = GameKey(Canvas.KEY_POUND, 
                            "POUND")

    val KEY_STAR: GameKey = GameKey(Canvas.KEY_STAR, 
                            "STAR")

    val KEY_NUM0: GameKey = GameKey(Canvas.KEY_NUM0, CommonPhoneStrings.getInstance()!!.ZERO)

    val KEY_NUM1: GameKey = GameKey(Canvas.KEY_NUM1, CommonPhoneStrings.getInstance()!!.ONE)

    val KEY_NUM2: GameKey = GameKey(Canvas.KEY_NUM2, CommonPhoneStrings.getInstance()!!.TWO)

    val KEY_NUM3: GameKey = GameKey(Canvas.KEY_NUM3, CommonPhoneStrings.getInstance()!!.THREE)

    val KEY_NUM4: GameKey = GameKey(Canvas.KEY_NUM4, CommonPhoneStrings.getInstance()!!.FOUR)

    val KEY_NUM5: GameKey = GameKey(Canvas.KEY_NUM5, CommonPhoneStrings.getInstance()!!.FIVE)

    val KEY_NUM6: GameKey = GameKey(Canvas.KEY_NUM6, CommonPhoneStrings.getInstance()!!.SIX)

    val KEY_NUM7: GameKey = GameKey(Canvas.KEY_NUM7, CommonPhoneStrings.getInstance()!!.SEVEN)

    val KEY_NUM8: GameKey = GameKey(Canvas.KEY_NUM8, CommonPhoneStrings.getInstance()!!.EIGHT)

    val KEY_NUM9: GameKey = GameKey(Canvas.KEY_NUM9, CommonPhoneStrings.getInstance()!!.NINE)

    val GAME_A: GameKey = GameKey(Canvas.GAME_A, 
                            "Game A")

    val GAME_B: GameKey = GameKey(Canvas.GAME_B, 
                            "Game B")

    val GAME_C: GameKey = GameKey(Canvas.GAME_C, 
                            "Game C")

    val GAME_D: GameKey = GameKey(Canvas.GAME_D, 
                            "Game D")

    val FIRE: GameKey = GameKey(Canvas.FIRE, CommonPhoneStrings.getInstance()!!.FIRE)

    var LEVEL_DOWN: GameKey = GameKey(Canvas.KEY_NUM9 +1, 
                            "Cheat Level Up")

    var LEVEL_UP: GameKey = GameKey(Canvas.KEY_NUM9 +2, 
                            "Cheat Level Down")

}
                
            

