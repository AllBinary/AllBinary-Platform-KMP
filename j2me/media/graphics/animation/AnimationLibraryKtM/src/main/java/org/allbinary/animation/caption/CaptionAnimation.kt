
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
        package org.allbinary.animation.caption




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.animation.Animation

open public class CaptionAnimation : Animation {
        

    private val animationInterface: Animation

    private val overlayAnimationInterface: Animation

    private val captionDx: Int

    private val captionDy: Int

    private val dx: Int

    private val dy: Int
public constructor (animationInterface: Animation, overlayAnimationInterface: Animation, captionDx: Int, captionDy: Int, dx: Int, dy: Int){
    //var animationInterface = animationInterface
    //var overlayAnimationInterface = overlayAnimationInterface
    //var captionDx = captionDx
    //var captionDy = captionDy
    //var dx = dx
    //var dy = dy
this.animationInterface= animationInterface
this.overlayAnimationInterface= overlayAnimationInterface
this.captionDx= captionDx
this.captionDy= captionDy
this.dx= dx
this.dy= dy
}


                @Throws(Exception::class)
            
    override fun nextFrame()
        //nullable = true from not(false or (false and true)) = true
{
}


    override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
    //var x = x
    //var y = y
this.animationInterface!!.paint(graphics, x +this.captionDx, y +this.captionDy)
this.overlayAnimationInterface!!.paint(graphics, x +this.captionDx +dx, y +this.captionDy +dy)
}


    override fun paintThreed(graphics: Graphics, x: Int, y: Int, z: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
    //var x = x
    //var y = y
    //var z = z
this.animationInterface!!.paintThreed(graphics, x +this.captionDx, y +this.captionDy, z)
this.overlayAnimationInterface!!.paintThreed(graphics, x +this.captionDx +dx, y +this.captionDy +dy, z)
}


}
                
            

