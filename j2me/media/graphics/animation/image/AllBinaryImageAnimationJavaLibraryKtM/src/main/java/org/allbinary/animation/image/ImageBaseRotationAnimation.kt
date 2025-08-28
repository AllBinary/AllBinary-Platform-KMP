
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
        package org.allbinary.animation.image




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.Image
import org.allbinary.DisposalUtil
import org.allbinary.animation.AnimationBehavior
import org.allbinary.animation.RotationAnimation
import org.allbinary.graphics.Anchor
import org.allbinary.logic.math.PrimitiveIntUtil
import org.allbinary.math.AngleInfo

open public class ImageBaseRotationAnimation : RotationAnimation {
        

    private val image: Image
public constructor        (image: Image, angleInfo: AngleInfo, totalAngle: Short, animationBehavior: AnimationBehavior)                        

                            : super(angleInfo, totalAngle, animationBehavior)

        Updates for KMP build        
        {
    //var image = image
    //var angleInfo = angleInfo
    //var totalAngle = totalAngle
    //var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.image= image
}


                @Throws(Exception::class)
            override fun getAnimationSize()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getSize()
}

override fun setSequence(sequence: IntArray)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var sequence = sequence
}

override fun getSequence()
        //nullable = true from not(false or (false and true)) = true
: IntArray

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PrimitiveIntUtil.getArrayInstance()
}


    var anchor: Int = Anchor.TOP_LEFT
override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var graphics = graphics
    //var x = x
    //var y = y
graphics.drawImage(this.image, x, y, anchor)
}


open fun getImage()
        //nullable = true from not(false or (false and true)) = true
: Image

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}

override fun getWidth()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.image.getWidth()
}


open fun close()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
DisposalUtil.getInstance()!!.dispose(this.image)
}


                @Throws(Throwable::class)
            override fun finalize()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
DisposalUtil.getInstance()!!.dispose(this.image)
}


}
                
            

