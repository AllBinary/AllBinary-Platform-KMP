
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
        package org.allbinary.graphics.form.item



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.color.BasicColor

open public class SelectableTextItem : TextItem {
        
public constructor        (label: String, layout: Int, altText: String, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : super(label, layout, altText, backgroundBasicColor, foregroundBasicColor){

                    var label = label


                    var layout = layout


                    var altText = altText


                    var backgroundBasicColor = backgroundBasicColor


                    var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    
}


open fun isFocusable()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}

override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var x = x


                    var y = y

    var stringComponent: StringComponent = this.getLabelStringComponent()!!
            


    
                        if(stringComponent != 
                                    null
                                )
                        
                                    {
                                    graphics!!.setColor(stringComponent!!.getForegroundBasicColor()!!.toInt())

                                    }
                                
graphics!!.drawString(this.getLabel(), x +2, y, 0)
}


}
                
            

