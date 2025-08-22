
        /* Generated Code Do Not Modify */
        package org.allbinary.game.input




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import android.view.KeyEvent
import org.allbinary.android.ActivityFractureUtil
import org.allbinary.string.CommonPhoneStrings
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil

open public class AndroidKeyFactory : ActivityFractureUtil {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val UNKNOWN: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_UNKNOWN, "UNKNOWN")

    var KEYCODE_BUTTON_L1: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_R1: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_THUMBR: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_THUMBL: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_START: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_MODE: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_B: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_A: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_X: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_Y: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_L2: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_R2: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_SELECT: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_C: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_Z: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_1: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_10: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_11: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_12: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_13: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_14: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_15: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_16: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_2: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_3: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_4: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_5: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_6: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_7: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_8: AndroidGameKey = UNKNOWN

    var KEYCODE_BUTTON_9: AndroidGameKey = UNKNOWN

    val SOFT_LEFT: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_SOFT_LEFT, "SOFT_LEFT")

    val SOFT_RIGHT: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_SOFT_RIGHT, "SOFT_RIGHT")

    val HOME: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_HOME, "HOME")

    val BACK: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_BACK, "BACK")

    val CALL: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_CALL, "CALL")

    val ENDCALL: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_ENDCALL, "ENDCALL")

    val ZERO: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_0, CommonPhoneStrings.getInstance()!!.ZERO)

    val ONE: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_1, CommonPhoneStrings.getInstance()!!.ONE)

    val TWO: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_2, CommonPhoneStrings.getInstance()!!.TWO)

    val THREE: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_3, CommonPhoneStrings.getInstance()!!.THREE)

    val FOUR: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_4, CommonPhoneStrings.getInstance()!!.FOUR)

    val FIVE: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_5, CommonPhoneStrings.getInstance()!!.FIVE)

    val SIX: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_6, CommonPhoneStrings.getInstance()!!.SIX)

    val SEVEN: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_7, CommonPhoneStrings.getInstance()!!.SEVEN)

    val EIGHT: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_8, CommonPhoneStrings.getInstance()!!.EIGHT)

    val NINE: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_9, CommonPhoneStrings.getInstance()!!.NINE)

    val STAR: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_STAR, CommonPhoneStrings.getInstance()!!.STAR)

    val POUND: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_POUND, CommonPhoneStrings.getInstance()!!.POUND)

    val DPAD_UP: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_DPAD_UP, "UP")

    val DPAD_DOWN: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_DPAD_DOWN, "DOWN")

    val DPAD_LEFT: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_DPAD_LEFT, "LEFT")

    val DPAD_RIGHT: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_DPAD_RIGHT, "RIGHT")

    val DPAD_CENTER: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_DPAD_CENTER, "CENTER")

    val VOLUME_UP: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_VOLUME_UP, "VOLUME_UP")

    val VOLUME_DOWN: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_VOLUME_DOWN, "VOLUME_DOWN")

    val POWER: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_POWER, "POWER")

    val CAMERA: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_CAMERA, "CAMERA")

    val CLEAR: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_CLEAR, "CLEAR")

    val A: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_A, "A")

    val B: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_B, "B")

    val C: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_C, "C")

    val D: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_D, "D")

    val E: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_E, "E")

    val F: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_F, "F")

    val G: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_G, "G")

    val H: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_H, "H")

    val I: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_I, "I")

    val J: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_J, "J")

    val K: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_K, "K")

    val L: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_L, "L")

    val M: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_M, "M")

    val N: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_N, "N")

    val O: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_O, "O")

    val P: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_P, "P")

    val Q: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_Q, "Q")

    val R: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_R, "R")

    val S: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_S, "S")

    val T: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_T, "T")

    val U: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_U, "U")

    val V: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_V, "V")

    val W: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_W, "W")

    val X: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_X, "X")

    val Y: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_Y, "Y")

    val Z: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_Z, "Z")

    val COMMA: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_COMMA, "COMMA")

    val PERIOD: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_PERIOD, AbPathData.getInstance()!!.EXTENSION_SEP)

    val ALT_LEFT: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_ALT_LEFT, "ALT_LEFT")

    val ALT_RIGHT: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_ALT_RIGHT, "ALT_RIGHT")

    val SHIFT_LEFT: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_SHIFT_LEFT, "SHIFT_LEFT")

    val SHIFT_RIGHT: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_SHIFT_RIGHT, "SHIFT_RIGHT")

    val TAB: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_TAB, "TAB")

    val SPACE: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_SPACE, "SPACE")

    val SYM: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_SYM, "SYM")

    val EXPLORER: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_EXPLORER, "EXPLORER")

    val ENVELOPE: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_ENVELOPE, "ENVELOPE")

    val ENTER: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_ENTER, "ENTER")

    val DEL: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_DEL, "DEL")

    val GRAVE: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_GRAVE, "GRAVE")

    val MINUS: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_MINUS, "MINUS")

    val EQUALS: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_EQUALS, "EQUALS")

    val LEFT_BRACKET: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_LEFT_BRACKET, "LEFT_BRACKET")

    val RIGHT_BRACKET: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_RIGHT_BRACKET, "RIGHT_BRACKET")

    val BACKSLASH: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_BACKSLASH, "BACKSLASH")

    val SEMICOLON: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_SEMICOLON, "SEMICOLON")

    val APOSTROPHE: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_APOSTROPHE, "APOSTROPHE")

    val SLASH: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_SLASH, "SLASH")

    val AT: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_AT, "AT")

    val NUM: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_NUM, "NUM")

    val HEADSETHOOK: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_HEADSETHOOK, "HEADSETHOOK")

    val FOCUS: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_FOCUS, "FOCUS")

    val PLUS: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_PLUS, "PLUS")

    val MENU: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_MENU, "MENU")

    val NOTIFICATION: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_NOTIFICATION, "NOTIFICATION")

    val SEARCH: AndroidGameKey = AndroidGameKey(KeyEvent.KEYCODE_SEARCH, "SEARCH")

open fun init()
        //nullable = true from not(false or (false and true)) = true
{
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put("Start/End", this, commonStrings!!.INIT)
}


open fun isSubmission(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var input = input

    
                        if(input == ENTER)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                             else 
    
                        if(input == DPAD_CENTER)
                        
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



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun isBackSpace(input: Input)
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


open fun isLeft(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var input = input

    
                        if(input == DPAD_LEFT)
                        
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

    
                        if(input == DPAD_RIGHT)
                        
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

    
                        if(input == DPAD_UP)
                        
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

    
                        if(input == DPAD_DOWN)
                        
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

    
                        if(input == DPAD_CENTER)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                             else 
    
                        if(input == ENTER)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                             else 
    
                        if(input == CALL)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

