
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
        
import org.allbinary.game.input.mapping.InputToGameKeyMapping
import org.allbinary.game.input.mapping.PersistentInputMapping
import org.allbinary.input.motion.button.BasicTouchInputFactory
import org.allbinary.input.motion.gesture.TouchMotionGestureFactory

open public class MotionJ2MEDefaultGameInputMapping : PersistentInputMapping {
        
public constructor        ()                        

                            : super(PersistentInputMapping.DEFAULT_RECORD_ID){

                            //For kotlin this is before the body of the constructor.
                    

    var inputToGameKeyMapping: InputToGameKeyMapping = this.getInputMapping()!!
            


    var gameKeyFactory: GameKeyFactory = GameKeyFactory.getInstance()!!
            

inputToGameKeyMapping!!.add(gameKeyFactory!!.UP, gameKeyFactory!!.KEY_NUM2)
inputToGameKeyMapping!!.add(gameKeyFactory!!.LEFT, gameKeyFactory!!.KEY_NUM4)
inputToGameKeyMapping!!.add(gameKeyFactory!!.RIGHT, gameKeyFactory!!.KEY_NUM6)
inputToGameKeyMapping!!.add(gameKeyFactory!!.DOWN, gameKeyFactory!!.KEY_NUM8)
inputToGameKeyMapping!!.add(gameKeyFactory!!.KEY_NUM1, gameKeyFactory!!.GAME_A)
inputToGameKeyMapping!!.add(gameKeyFactory!!.KEY_NUM3, gameKeyFactory!!.GAME_B)
inputToGameKeyMapping!!.add(gameKeyFactory!!.KEY_NUM7, gameKeyFactory!!.GAME_C)
inputToGameKeyMapping!!.add(gameKeyFactory!!.KEY_NUM9, gameKeyFactory!!.GAME_D)
inputToGameKeyMapping!!.add(gameKeyFactory!!.LEVEL_DOWN, gameKeyFactory!!.LEVEL_DOWN)
inputToGameKeyMapping!!.add(gameKeyFactory!!.LEVEL_UP, gameKeyFactory!!.LEVEL_UP)
inputToGameKeyMapping!!.add(gameKeyFactory!!.UP, gameKeyFactory!!.UP)
inputToGameKeyMapping!!.add(gameKeyFactory!!.DOWN, gameKeyFactory!!.DOWN)
inputToGameKeyMapping!!.add(gameKeyFactory!!.LEFT, gameKeyFactory!!.LEFT)
inputToGameKeyMapping!!.add(gameKeyFactory!!.RIGHT, gameKeyFactory!!.RIGHT)
inputToGameKeyMapping!!.add(gameKeyFactory!!.KEY_POUND, gameKeyFactory!!.KEY_POUND)
inputToGameKeyMapping!!.add(gameKeyFactory!!.KEY_STAR, gameKeyFactory!!.KEY_STAR)
inputToGameKeyMapping!!.add(gameKeyFactory!!.KEY_NUM1, gameKeyFactory!!.KEY_NUM1)
inputToGameKeyMapping!!.add(gameKeyFactory!!.KEY_NUM3, gameKeyFactory!!.KEY_NUM3)
inputToGameKeyMapping!!.add(gameKeyFactory!!.KEY_NUM5, gameKeyFactory!!.KEY_NUM5)
inputToGameKeyMapping!!.add(gameKeyFactory!!.KEY_NUM7, gameKeyFactory!!.KEY_NUM7)
inputToGameKeyMapping!!.add(gameKeyFactory!!.KEY_NUM9, gameKeyFactory!!.KEY_NUM9)
inputToGameKeyMapping!!.add(gameKeyFactory!!.KEY_NUM0, gameKeyFactory!!.KEY_NUM0)
inputToGameKeyMapping!!.add(gameKeyFactory!!.KEY_NUM1, gameKeyFactory!!.FIRE)
inputToGameKeyMapping!!.add(gameKeyFactory!!.UP, TouchMotionGestureFactory.getInstance()!!.UP)
inputToGameKeyMapping!!.add(gameKeyFactory!!.DOWN, TouchMotionGestureFactory.getInstance()!!.DOWN)
inputToGameKeyMapping!!.add(gameKeyFactory!!.LEFT, TouchMotionGestureFactory.getInstance()!!.LEFT)
inputToGameKeyMapping!!.add(gameKeyFactory!!.RIGHT, TouchMotionGestureFactory.getInstance()!!.RIGHT)

    var basicTouchInputFactory: BasicTouchInputFactory = BasicTouchInputFactory.getInstance()!!
            

inputToGameKeyMapping!!.add(gameKeyFactory!!.UP, basicTouchInputFactory!!.UP)
inputToGameKeyMapping!!.add(gameKeyFactory!!.LEFT, basicTouchInputFactory!!.LEFT)
inputToGameKeyMapping!!.add(gameKeyFactory!!.RIGHT, basicTouchInputFactory!!.RIGHT)
inputToGameKeyMapping!!.add(gameKeyFactory!!.DOWN, basicTouchInputFactory!!.DOWN)
inputToGameKeyMapping!!.add(gameKeyFactory!!.KEY_NUM0, basicTouchInputFactory!!.SPECIAL_BUTTON_FIVE)
inputToGameKeyMapping!!.add(gameKeyFactory!!.KEY_NUM7, basicTouchInputFactory!!.SPECIAL_BUTTON_FOUR)
inputToGameKeyMapping!!.add(gameKeyFactory!!.KEY_NUM9, basicTouchInputFactory!!.SPECIAL_BUTTON_THREE)
inputToGameKeyMapping!!.add(gameKeyFactory!!.KEY_NUM1, basicTouchInputFactory!!.SPECIAL_BUTTON_TWO)
inputToGameKeyMapping!!.add(gameKeyFactory!!.KEY_NUM3, basicTouchInputFactory!!.SPECIAL_BUTTON_ONE)
inputToGameKeyMapping!!.add(gameKeyFactory!!.KEY_NUM2, basicTouchInputFactory!!.SPECIAL_BUTTON_SIX)
}


}
                
            

