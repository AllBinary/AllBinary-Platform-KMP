
        /* Generated Code Do Not Modify */
        package org.allbinary.graphics.form.item



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory

open public class StringComponent
            : Object
         {
        

        companion object {


    val NULL_STRING_COMPONENT: StringComponent = StringComponent()


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun getBackgroundBasicColor()
        //nullable = true from not(false or (false and true)) = true
: BasicColor{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasicColorFactory.getInstance()!!.WHITE
}


open fun setBackgroundBasicColor(backgroundBasicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{

                    var backgroundBasicColor = backgroundBasicColor
}


open fun getForegroundBasicColor()
        //nullable = true from not(false or (false and true)) = true
: BasicColor{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasicColorFactory.getInstance()!!.WHITE
}


open fun setForegroundBasicColor(foregroundBasicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{

                    var foregroundBasicColor = foregroundBasicColor
}


}
                
            

