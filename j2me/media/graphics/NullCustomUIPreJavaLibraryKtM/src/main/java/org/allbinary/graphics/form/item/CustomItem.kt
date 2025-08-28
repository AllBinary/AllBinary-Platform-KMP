
        /* Generated Code Do Not Modify */
        package org.allbinary.graphics.form.item




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.logic.string.StringUtil

open public class CustomItem
            : Object
         {
        

        companion object {
            
    val NULL_CUSTOM_ITEM: CustomItem = CustomItem(StringUtil.getInstance()!!.EMPTY_STRING, BasicColorFactory.getInstance()!!.BLACK, BasicColorFactory.getInstance()!!.WHITE)

        }
            protected constructor        (label: String, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor)
            : super()
        {
var label = label
var backgroundBasicColor = backgroundBasicColor
var foregroundBasicColor = foregroundBasicColor
}


open fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
var x = x
var y = y
}


open fun isFocusable()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun getLabel()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING
}


open fun setLabel(label: String)
        //nullable = true from not(false or (false and false)) = true
{
var label = label
}


open fun getHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


open fun setHeight(height: Int)
        //nullable = true from not(false or (false and false)) = true
{
var height = height
}


open fun getValue()
        //nullable = true from not(false or (false and true)) = true
: Float{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0.0f
}


open fun setValue(value: Float)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
}


open fun getMinimumWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


open fun getMinimumHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


}
                
            

