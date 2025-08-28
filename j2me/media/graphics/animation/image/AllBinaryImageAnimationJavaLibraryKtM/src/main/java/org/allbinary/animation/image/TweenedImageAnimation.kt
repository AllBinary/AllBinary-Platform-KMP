
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
import org.allbinary.animation.IndexedAnimation
import org.allbinary.graphics.Anchor
import org.allbinary.logic.math.PrimitiveIntUtil
import org.allbinary.util.CircularIndexUtil

open public class TweenedImageAnimation : IndexedAnimation {
        

    private val image: Image

    private val dx: Int

    private val dy: Int

    private var totalFrames: Int

    var circularIndexUtil: CircularIndexUtil
public constructor        (image: Image, dx: Int, dy: Int, totalFrames: Int, animationBehavior: AnimationBehavior)                        

                            : super(animationBehavior)

        Updates for KMP build        
        {
    //var image = image
    //var dx = dx
    //var dy = dy
    //var totalFrames = totalFrames
    //var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.image= image
this.dx= dx
this.dy= dy
this.totalFrames= totalFrames
this.circularIndexUtil= CircularIndexUtil.getInstance(this.totalFrames)
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

override fun nextFrame()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.circularIndexUtil!!.next()
}

override fun previousFrame()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.circularIndexUtil!!.previous()
}

override fun setFrame(index: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var index = index
this.circularIndexUtil!!.setIndex(index)
}

override fun getFrame()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.circularIndexUtil!!.getIndex()
}

override fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.totalFrames
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


    private var anchor: Int = Anchor.TOP_LEFT
override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graphics = graphics
var x = x
var y = y

    var frame: Int = this.getFrame()!!


    var currentX: Int = dx *frame


    var currentY: Int = dy *frame

graphics.drawImage(this.image, x +currentX, y +currentY, anchor)
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
                
            

