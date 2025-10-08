
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
        
import java.awt.event.KeyEvent
import org.allbinary.string.CommonPhoneStrings
import org.allbinary.string.CommonSeps

open public class PCKeyFactory
            : Object
         {
        
companion object {
            
    private val SINGLETON: PCKeyFactory = PCKeyFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PCKeyFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val UNKNOWN: PCGameKey = PCGameKey(KeyEvent.VK_UNDEFINED, "UNKNOWN")

    val ENTER: PCGameKey = PCGameKey(5, "Enter")

    val _A: PCGameKey = PCGameKey(KeyEvent.VK_A, "A")

    val _B: PCGameKey = PCGameKey(KeyEvent.VK_B, "B")

    val _C: PCGameKey = PCGameKey(KeyEvent.VK_C, "C")

    val _D: PCGameKey = PCGameKey(KeyEvent.VK_D, "D")

    val _E: PCGameKey = PCGameKey(KeyEvent.VK_E, "E")

    val _F: PCGameKey = PCGameKey(KeyEvent.VK_F, "F")

    val _G: PCGameKey = PCGameKey(KeyEvent.VK_G, "G")

    val _H: PCGameKey = PCGameKey(KeyEvent.VK_H, "H")

    val _I: PCGameKey = PCGameKey(KeyEvent.VK_I, "I")

    val _J: PCGameKey = PCGameKey(KeyEvent.VK_J, "J")

    val _K: PCGameKey = PCGameKey(KeyEvent.VK_K, "K")

    val _L: PCGameKey = PCGameKey(KeyEvent.VK_L, "L")

    val _M: PCGameKey = PCGameKey(KeyEvent.VK_M, "M")

    val _N: PCGameKey = PCGameKey(KeyEvent.VK_N, "N")

    val _O: PCGameKey = PCGameKey(KeyEvent.VK_O, "O")

    val _P: PCGameKey = PCGameKey(KeyEvent.VK_P, "P")

    val _Q: PCGameKey = PCGameKey(KeyEvent.VK_Q, "Q")

    val _R: PCGameKey = PCGameKey(KeyEvent.VK_R, "R")

    val _S: PCGameKey = PCGameKey(KeyEvent.VK_S, "S")

    val _T: PCGameKey = PCGameKey(KeyEvent.VK_T, "T")

    val _U: PCGameKey = PCGameKey(KeyEvent.VK_U, "U")

    val _V: PCGameKey = PCGameKey(KeyEvent.VK_V, "V")

    val _W: PCGameKey = PCGameKey(KeyEvent.VK_W, "W")

    val _X: PCGameKey = PCGameKey(KeyEvent.VK_X, "X")

    val _Y: PCGameKey = PCGameKey(KeyEvent.VK_Y, "Y")

    val _Z: PCGameKey = PCGameKey(KeyEvent.VK_Z, "Z")

    val a: PCGameKey = PCGameKey(97, "a")

    val b: PCGameKey = PCGameKey(98, "b")

    val c: PCGameKey = PCGameKey(99, "c")

    val d: PCGameKey = PCGameKey(100, "d")

    val e: PCGameKey = PCGameKey(101, "e")

    val f: PCGameKey = PCGameKey(102, "f")

    val g: PCGameKey = PCGameKey(103, "g")

    val h: PCGameKey = PCGameKey(104, "h")

    val i: PCGameKey = PCGameKey(105, "i")

    val j: PCGameKey = PCGameKey(106, "j")

    val k: PCGameKey = PCGameKey(107, "k")

    val l: PCGameKey = PCGameKey(108, "l")

    val m: PCGameKey = PCGameKey(109, "m")

    val n: PCGameKey = PCGameKey(110, "n")

    val o: PCGameKey = PCGameKey(111, "o")

    val p: PCGameKey = PCGameKey(112, "p")

    val q: PCGameKey = PCGameKey(113, "q")

    val r: PCGameKey = PCGameKey(114, "r")

    val s: PCGameKey = PCGameKey(115, "s")

    val t: PCGameKey = PCGameKey(116, "t")

    val u: PCGameKey = PCGameKey(117, "u")

    val v: PCGameKey = PCGameKey(118, "v")

    val w: PCGameKey = PCGameKey(119, "w")

    val x: PCGameKey = PCGameKey(120, "x")

    val y: PCGameKey = PCGameKey(121, "y")

    val z: PCGameKey = PCGameKey(122, "z")

    val ZERO: PCGameKey = PCGameKey(KeyEvent.VK_0, CommonPhoneStrings.getInstance()!!.ZERO)

    val ONE: PCGameKey = PCGameKey(KeyEvent.VK_1, CommonPhoneStrings.getInstance()!!.ONE)

    val TWO: PCGameKey = PCGameKey(KeyEvent.VK_2, CommonPhoneStrings.getInstance()!!.TWO)

    val THREE: PCGameKey = PCGameKey(KeyEvent.VK_3, CommonPhoneStrings.getInstance()!!.THREE)

    val FOUR: PCGameKey = PCGameKey(KeyEvent.VK_4, CommonPhoneStrings.getInstance()!!.FOUR)

    val FIVE: PCGameKey = PCGameKey(KeyEvent.VK_5, CommonPhoneStrings.getInstance()!!.FIVE)

    val SIX: PCGameKey = PCGameKey(KeyEvent.VK_6, CommonPhoneStrings.getInstance()!!.SIX)

    val SEVEN: PCGameKey = PCGameKey(KeyEvent.VK_7, CommonPhoneStrings.getInstance()!!.SEVEN)

    val EIGHT: PCGameKey = PCGameKey(KeyEvent.VK_8, CommonPhoneStrings.getInstance()!!.EIGHT)

    val NINE: PCGameKey = PCGameKey(KeyEvent.VK_9, CommonPhoneStrings.getInstance()!!.NINE)

    val DPAD_UP: PCGameKey = PCGameKey(KeyEvent.VK_UP, CommonPhoneStrings.getInstance()!!.UP)

    val DPAD_DOWN: PCGameKey = PCGameKey(KeyEvent.VK_DOWN, CommonPhoneStrings.getInstance()!!.DOWN)

    val DPAD_LEFT: PCGameKey = PCGameKey(KeyEvent.VK_LEFT, CommonPhoneStrings.getInstance()!!.LEFT)

    val DPAD_RIGHT: PCGameKey = PCGameKey(KeyEvent.VK_RIGHT, CommonPhoneStrings.getInstance()!!.RIGHT)

    val DPAD_UP2: PCGameKey = DPAD_UP

    val DPAD_DOWN2: PCGameKey = DPAD_DOWN

    val DPAD_LEFT2: PCGameKey = DPAD_LEFT

    val DPAD_RIGHT2: PCGameKey = DPAD_RIGHT

    val COMMA: PCGameKey = PCGameKey(KeyEvent.VK_COMMA, "COMMA")

    val SPACE: PCGameKey = PCGameKey(KeyEvent.VK_SPACE, "SPACE")

    val DEL: PCGameKey = PCGameKey(KeyEvent.VK_DELETE, "DEL")

    val STAR: PCGameKey = PCGameKey(42, CommonPhoneStrings.getInstance()!!.STAR)

    val QUESTION: PCGameKey = PCGameKey(47, "?")

    val PERIOD: PCGameKey = PCGameKey(KeyEvent.VK_PERIOD, CommonSeps.getInstance()!!.PERIOD)

    val ESCAPE: PCGameKey = PCGameKey(KeyEvent.VK_ESCAPE, "Esc")

    val BACK_SPACE: PCGameKey = PCGameKey(KeyEvent.VK_BACK_SPACE, "Backspace")

    open fun isSubmission(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input

    
                        if(input == ENTER)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun isDelete(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input

    
                        if(input == DEL)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun isBackSpace(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input

    
                        if(input == BACK_SPACE)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun isUp(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input

    
                        if(input == DPAD_UP || input == DPAD_UP2)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun isDown(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input

    
                        if(input == DPAD_DOWN || input == DPAD_DOWN2)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun isLeft(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input

    
                        if(input == DPAD_LEFT || input == DPAD_LEFT2)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun isRight(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input

    
                        if(input == DPAD_RIGHT || input == DPAD_RIGHT2)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun isEnter(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input

    
                        if(input == ENTER)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

