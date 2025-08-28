
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
        package org.allbinary.game.paint




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.color.ColorCompositeInterface
import org.allbinary.graphics.paint.Paintable

open public class ColorFillBasePaintable : Paintable
                , ColorCompositeInterface {
        

    var basicColor: BasicColor = BasicColorFactory.getInstance()!!.WHITE

    var colorP: Int= 0
public constructor        (basicColor: BasicColor)

        Updates for KMP build        
        {
var basicColor = basicColor
this.setBasicColorP(basicColor)
}

override fun setBasicColorP(basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var basicColor = basicColor
this.basicColor= basicColor
this.setColor(this.getBasicColorP()!!.toInt())
}

override fun getBasicColorP()
        //nullable = true from not(false or (false and true)) = true
: BasicColor

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return basicColor
}


open fun getColor()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return colorP
}


open fun setColor(color: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var color = color
this.colorP= color
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graphics = graphics
}


}
                
            

