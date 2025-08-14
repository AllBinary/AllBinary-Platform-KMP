
        /* Generated Code Do Not Modify */
        package org.allbinary.graphics.form.item




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Canvas
import javax.microedition.lcdui.Font
import org.allbinary.graphics.color.BasicColor
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.util.visitor.Visitor

open public class TextFieldItem : TextItem {
        
public constructor        (canvas: Canvas, visitor: Visitor, label: String, value: String, maxSize: Int, layout: Int, altText: String, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : this(canvas, visitor, label, value, maxSize, layout, altText, Font.getDefaultFont(), backgroundBasicColor, foregroundBasicColor){

                    var canvas = canvas


                    var visitor = visitor


                    var label = label


                    var value = value


                    var maxSize = maxSize


                    var layout = layout


                    var altText = altText


                    var backgroundBasicColor = backgroundBasicColor


                    var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (canvas: Canvas, visitor: Visitor, label: String, value: String, maxSize: Int, layout: Int, altText: String, font: Font, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : super(label, layout, altText, backgroundBasicColor, foregroundBasicColor){

                    var canvas = canvas


                    var visitor = visitor


                    var label = label


                    var value = value


                    var maxSize = maxSize


                    var layout = layout


                    var altText = altText


                    var font = font


                    var backgroundBasicColor = backgroundBasicColor


                    var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    
}

override fun getLabel()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING
}

override fun setLabel(label: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var label = label
}


open fun getString()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING
}


open fun setString(string: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var string = string
}


open fun setFocus(state: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var state = state
}


}
                
            

