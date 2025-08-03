
        /* Generated Code Do Not Modify */
        package org.allbinary.game.input



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Canvas
import android.view.KeyEvent

open public class AndroidNumberKeyToJ2MECanvasNumberKey
            : Object
         {
        

        companion object {


    private val androidtoJavaMicroEditionKeyMap: IntArray = IntArray(17)

open fun init()
        //nullable = true from not(false or (false and true)) = true
{androidtoJavaMicroEditionKeyMap[KeyEvent.KEYCODE_0]= Canvas.KEY_NUM0
androidtoJavaMicroEditionKeyMap[KeyEvent.KEYCODE_1]= Canvas.KEY_NUM1
androidtoJavaMicroEditionKeyMap[KeyEvent.KEYCODE_2]= Canvas.KEY_NUM2
androidtoJavaMicroEditionKeyMap[KeyEvent.KEYCODE_3]= Canvas.KEY_NUM3
androidtoJavaMicroEditionKeyMap[KeyEvent.KEYCODE_4]= Canvas.KEY_NUM4
androidtoJavaMicroEditionKeyMap[KeyEvent.KEYCODE_5]= Canvas.KEY_NUM5
androidtoJavaMicroEditionKeyMap[KeyEvent.KEYCODE_6]= Canvas.KEY_NUM6
androidtoJavaMicroEditionKeyMap[KeyEvent.KEYCODE_7]= Canvas.KEY_NUM7
androidtoJavaMicroEditionKeyMap[KeyEvent.KEYCODE_8]= Canvas.KEY_NUM8
androidtoJavaMicroEditionKeyMap[KeyEvent.KEYCODE_9]= Canvas.KEY_NUM9
}


open fun getKey(key: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var key = key

    
                        if(key < androidtoJavaMicroEditionKeyMap!!.size)
                        
                                    {
                                    
    var value: Int = androidtoJavaMicroEditionKeyMap[key]!!


    
                        if(value != 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return value

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return key
}



        }
            private constructor        ()
            : super()
        {}


}
                
            

