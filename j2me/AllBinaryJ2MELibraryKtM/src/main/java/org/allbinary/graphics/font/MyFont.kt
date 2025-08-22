
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
        package org.allbinary.graphics.font




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Font
import org.allbinary.logic.string.StringMaker

open public class MyFont
            : Object
         {
        

        companion object {
            
    private val instance: MyFont = MyFont()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: MyFont{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private val defaultFont: Font = Font.getDefaultFont()!!

    var DEFAULT_CHAR_HEIGHT: Int = defaultFont!!.getHeight()!!

    private var DEFAULT_CHAR_WIDTH: Int = defaultFont!!.charWidth('C')!!
private constructor        ()
            : super()
        {}


open fun update()
        //nullable = true from not(false or (false and true)) = true
{this.DEFAULT_CHAR_HEIGHT= defaultFont!!.getHeight()
this.DEFAULT_CHAR_WIDTH= defaultFont!!.charWidth('C')
}


open fun charWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DEFAULT_CHAR_WIDTH
}


open fun stringWidth(size: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var size = size



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DEFAULT_CHAR_WIDTH *size
}


open fun stringWidth(string: String)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var string = string



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DEFAULT_CHAR_WIDTH *string.length
}


open fun stringWidth2(string: String)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var string = string



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return defaultFont!!.stringWidth(string)
}


open fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return defaultFont!!.getSize()
}


open fun charWidth(aChar: Char)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var aChar = aChar



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return defaultFont!!.charWidth(aChar)
}


open fun charsWidth(charArray: CharArray, offset: Int, length: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var charArray = charArray


                    var offset = offset


                    var length = length



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return defaultFont!!.charsWidth(charArray, offset, length)
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append(this::class.toString())!!.append(this.DEFAULT_CHAR_WIDTH)!!.append('/')!!.append(this.DEFAULT_CHAR_HEIGHT)!!.toString()
}


}
                
            

