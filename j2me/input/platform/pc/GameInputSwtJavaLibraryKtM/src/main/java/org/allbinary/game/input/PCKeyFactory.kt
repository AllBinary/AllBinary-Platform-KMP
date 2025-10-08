
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
        
    val UNKNOWN: PCGameKey = PCGameKey(254, "UNKNOWN")

    val ENTER: PCGameKey = PCGameKey(13, "Enter")

    val _A: PCGameKey = PCGameKey(65, "A")

    val _B: PCGameKey = PCGameKey(66, "B")

    val _C: PCGameKey = PCGameKey(67, "C")

    val _D: PCGameKey = PCGameKey(68, "D")

    val _E: PCGameKey = PCGameKey(69, "E")

    val _F: PCGameKey = PCGameKey(70, "F")

    val _G: PCGameKey = PCGameKey(71, "G")

    val _H: PCGameKey = PCGameKey(72, "H")

    val _I: PCGameKey = PCGameKey(73, "I")

    val _J: PCGameKey = PCGameKey(74, "J")

    val _K: PCGameKey = PCGameKey(75, "K")

    val _L: PCGameKey = PCGameKey(76, "L")

    val _M: PCGameKey = PCGameKey(77, "M")

    val _N: PCGameKey = PCGameKey(78, "N")

    val _O: PCGameKey = PCGameKey(79, "O")

    val _P: PCGameKey = PCGameKey(80, "P")

    val _Q: PCGameKey = PCGameKey(81, "Q")

    val _R: PCGameKey = PCGameKey(82, "R")

    val _S: PCGameKey = PCGameKey(83, "S")

    val _T: PCGameKey = PCGameKey(84, "T")

    val _U: PCGameKey = PCGameKey(85, "U")

    val _V: PCGameKey = PCGameKey(86, "V")

    val _W: PCGameKey = PCGameKey(87, "W")

    val _X: PCGameKey = PCGameKey(88, "X")

    val _Y: PCGameKey = PCGameKey(89, "Y")

    val _Z: PCGameKey = PCGameKey(90, "Z")

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

    val ZERO: PCGameKey = PCGameKey(48, CommonPhoneStrings.getInstance()!!.ZERO)

    val ONE: PCGameKey = PCGameKey(49, CommonPhoneStrings.getInstance()!!.ONE)

    val TWO: PCGameKey = PCGameKey(50, CommonPhoneStrings.getInstance()!!.TWO)

    val THREE: PCGameKey = PCGameKey(51, CommonPhoneStrings.getInstance()!!.THREE)

    val FOUR: PCGameKey = PCGameKey(52, CommonPhoneStrings.getInstance()!!.FOUR)

    val FIVE: PCGameKey = PCGameKey(53, CommonPhoneStrings.getInstance()!!.FIVE)

    val SIX: PCGameKey = PCGameKey(54, CommonPhoneStrings.getInstance()!!.SIX)

    val SEVEN: PCGameKey = PCGameKey(55, CommonPhoneStrings.getInstance()!!.SEVEN)

    val EIGHT: PCGameKey = PCGameKey(56, CommonPhoneStrings.getInstance()!!.EIGHT)

    val NINE: PCGameKey = PCGameKey(57, CommonPhoneStrings.getInstance()!!.NINE)

    val DPAD_UP: PCGameKey = PCGameKey(38, CommonPhoneStrings.getInstance()!!.UP)

    val DPAD_DOWN: PCGameKey = PCGameKey(40, CommonPhoneStrings.getInstance()!!.DOWN)

    val DPAD_LEFT: PCGameKey = PCGameKey(37, CommonPhoneStrings.getInstance()!!.LEFT)

    val DPAD_RIGHT: PCGameKey = PCGameKey(39, CommonPhoneStrings.getInstance()!!.RIGHT)

    val DPAD_UP2: PCGameKey = DPAD_UP

    val DPAD_DOWN2: PCGameKey = DPAD_DOWN

    val DPAD_LEFT2: PCGameKey = DPAD_LEFT

    val DPAD_RIGHT2: PCGameKey = DPAD_RIGHT

    val COMMA: PCGameKey = PCGameKey(44, "COMMA")

    val SPACE: PCGameKey = PCGameKey(32, "SPACE")

    val DEL: PCGameKey = PCGameKey(46, "DEL")

    val STAR: PCGameKey = PCGameKey(42, CommonPhoneStrings.getInstance()!!.STAR)

    val QUESTION: PCGameKey = PCGameKey(47, "?")

    val PERIOD: PCGameKey = PCGameKey(46, CommonSeps.getInstance()!!.PERIOD)

    val ESCAPE: PCGameKey = PCGameKey(27, "Esc")

    val BACK_SPACE: PCGameKey = PCGameKey(8, "Backspace")

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
                
            

