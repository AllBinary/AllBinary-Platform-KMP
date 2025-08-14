
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
        package org.allbinary.animation.vector




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.animation.Animation
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.color.ColorCompositeInterface

open public class ARectangleFilledAnimation : Animation
                , ColorCompositeInterface {
        

    var x: Int= 0

    var y: Int= 0

    var width: Int= 0

    var height: Int= 0
public constructor        (){this.setBasicColorP(BasicColorFactory.getInstance()!!.BLACK)
}

override fun nextFrame()
        //nullable = true from not(false or (false and true)) = true
{}

override fun paint(graphics: Graphics, unusedX: Int, unusedY: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var unusedX = unusedX


                    var unusedY = unusedY
graphics.fillRect(x, y, width, height)
}


}
                
            

