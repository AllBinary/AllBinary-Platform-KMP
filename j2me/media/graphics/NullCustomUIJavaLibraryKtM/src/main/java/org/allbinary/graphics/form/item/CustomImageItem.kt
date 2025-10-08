
        /* Generated Code Do Not Modify */
        package org.allbinary.graphics.form.item




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Image
import javax.microedition.lcdui.NullCanvas
import org.allbinary.graphics.color.BasicColor

open public class CustomImageItem : CustomItem {
        

    var yOffset: Int = 0
public constructor (label: String, image: Image, layout: Int, altText: String, basicColor: BasicColor)                        

                            : super(label, basicColor, basicColor){
var label = label
var image = image
var layout = layout
var altText = altText
var basicColor = basicColor


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor (label: String, image: Image, layout: Int, altText: String, basicColor: BasicColor, yOffset: Int)                        

                            : super(label, basicColor, basicColor){
var label = label
var image = image
var layout = layout
var altText = altText
var basicColor = basicColor
var yOffset = yOffset


                            //For kotlin this is before the body of the constructor.
                    
}


    open fun getImage()
        //nullable = true from not(false or (false and true)) = true
: Image{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullCanvas.NULL_IMAGE
}


}
                
            

