
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
        package org.allbinary.graphics.paint




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.animation.Animation

open public class AnimationCompositePaintable : InitUpdatePaintable {
        

    private val animationInterface: Animation
public constructor        (animationInterface: Animation)

        Updates for KMP build        
        {
var animationInterface = animationInterface
this.animationInterface= animationInterface
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graphics = graphics
this.animationInterface!!.paint(graphics, 0, 0)
}

override fun paintThreed(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graphics = graphics
this.animationInterface!!.paintThreed(graphics, 0, 0, 0)
}


}
                
            

