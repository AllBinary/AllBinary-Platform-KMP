
        /* Generated Code Do Not Modify */
        package org.allbinary.graphics.form.item




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.color.BasicColor

open public class TextItem : CustomCustomItem
                , CustomItemInterface {
        
public constructor        (label: String, layout: Int, altText: String, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : super(label, backgroundBasicColor, foregroundBasicColor)

        Updates for KMP build        
        {
var label = label
var layout = layout
var altText = altText
var backgroundBasicColor = backgroundBasicColor
var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    
}


open fun keyPressed(keyCode: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var keyCode = keyCode
}

override fun paintUnselected(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graphics = graphics
var x = x
var y = y
}


open fun getLabelStringComponent()
        //nullable = true from not(false or (false and true)) = true
: StringComponent

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringComponent.NULL_STRING_COMPONENT
}


}
                
            

