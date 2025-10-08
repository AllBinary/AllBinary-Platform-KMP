
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

open public class ImageAnimation : IndexedAnimation {
        

    private val image: Image
public constructor (image: Image, animationBehavior: AnimationBehavior)                        

                            : super(animationBehavior){
    //var image = image
    //var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.image= image
}


                @Throws(Exception::class)
            
    override fun getAnimationSize()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getSize()
}


    override fun nextFrame()
        //nullable = true from not(false or (false and true)) = true
{
}


    override fun previousFrame()
        //nullable = true from not(false or (false and true)) = true
{
}


    override fun setFrame(index: Int)
        //nullable = true from not(false or (false and false)) = true
{
var index = index
}


    override fun getFrame()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


    override fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 1
}


    override fun setSequence(sequence: IntArray)
        //nullable = true from not(false or (false and false)) = true
{
var sequence = sequence
}


    override fun getSequence()
        //nullable = true from not(false or (false and true)) = true
: IntArray{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PrimitiveIntUtil.getArrayInstance()
}


    private var anchor: Int = Anchor.TOP_LEFT

    override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
var x = x
var y = y
graphics.drawImage(this.image, x, y, anchor)
}


    open fun getImage()
        //nullable = true from not(false or (false and true)) = true
: Image{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


    open fun close()
        //nullable = true from not(false or (false and true)) = true
{
DisposalUtil.getInstance()!!.dispose(this.image)
}


                @Throws(Throwable::class)
            
    override fun finalize()
        //nullable = true from not(false or (false and true)) = true
{
DisposalUtil.getInstance()!!.dispose(this.image)
}


}
                
            

