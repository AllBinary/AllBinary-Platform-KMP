
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
        package org.allbinary.graphics.draw




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.font.MyFont
import org.allbinary.logic.string.StringUtil

open public class KeyValueDrawString
            : Object
         {
        

    private val LABEL: String

    private val labelWidth: Int

    private val labelX: Int

    private var valueX: Int

    private var value: String = StringUtil.getInstance()!!.EMPTY_STRING
public constructor        (label: String, x: Int)
            : super()
        {
var label = label
var x = x
this.LABEL= label
this.labelWidth= MyFont.getInstance()!!.stringWidth(LABEL) -LABEL.length
this.labelX= x
this.valueX= this.labelWidth +x
}


open fun paint(graphics: Graphics, y: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
    //var y = y
graphics.drawString(this.LABEL, this.labelX, y, 0)
graphics.drawString(this.value, this.valueX, y, 0)
}


open fun update(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value

    
                        if(value != 
                                    null
                                )
                        this.value= value
}


}
                
            

