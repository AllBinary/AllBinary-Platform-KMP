
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
import javax.microedition.lcdui.NullCanvas
import org.allbinary.animation.AnimationBehavior
import org.allbinary.animation.IndexedAnimation
import org.allbinary.graphics.Anchor
import org.allbinary.logic.math.PrimitiveIntUtil
import org.allbinary.util.CircularIndexUtil

open public class ImageArrayAnimation : IndexedAnimation {
        

    private var imageArray: Array<Image?> = NullCanvas.NULL_IMAGE_ARRAY

    private var totalFrames: Int= 0

    var circularIndexUtil: CircularIndexUtil = CircularIndexUtil.NULL_CIRCULAR_INDEX_UTIL
public constructor        (imageArray: Array<Image?>, animationBehavior: AnimationBehavior)                        

                            : super(animationBehavior){
    //var imageArray = imageArray
    //var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.setImageArray(imageArray)
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
this.circularIndexUtil!!.next()
}

override fun previousFrame()
        //nullable = true from not(false or (false and true)) = true
{
this.circularIndexUtil!!.previous()
}

override fun setFrame(index: Int)
        //nullable = true from not(false or (false and false)) = true
{
var index = index
this.circularIndexUtil!!.setIndex(index)
}

override fun getFrame()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.circularIndexUtil!!.getIndex()
}

override fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.totalFrames
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


open fun getImage(index: Int)
        //nullable = true from not(false or (false and false)) = true
: Image{
var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return imageArray[index]!!
}


open fun getImageArray()
        //nullable = true from not(false or (false and true)) = true
: Array<Image?>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return imageArray
}


open fun setImageArray(imageArray: Array<Image?>)
        //nullable = true from not(false or (false and false)) = true
{
var imageArray = imageArray
this.imageArray= imageArray
this.totalFrames= imageArray!!.size
this.circularIndexUtil= CircularIndexUtil.getInstance(this.totalFrames)
}


    private var anchor: Int = Anchor.TOP_LEFT
override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
var x = x
var y = y
graphics.drawImage(this.imageArray[this.circularIndexUtil!!.getIndex()]!!, x, y, anchor)
}


}
                
            

