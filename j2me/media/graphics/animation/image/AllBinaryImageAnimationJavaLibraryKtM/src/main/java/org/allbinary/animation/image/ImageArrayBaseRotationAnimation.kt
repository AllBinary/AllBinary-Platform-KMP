
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
import org.allbinary.DisposalUtil
import org.allbinary.animation.AnimationBehavior
import org.allbinary.animation.RotationAnimation
import org.allbinary.graphics.Anchor
import org.allbinary.logic.math.PrimitiveIntUtil
import org.allbinary.math.AngleInfo
import org.allbinary.media.image.ImageModifierUtil
import org.allbinary.util.CircularIndexUtil

open public class ImageArrayBaseRotationAnimation : RotationAnimation {
        

    private val imageModifierUtil: ImageModifierUtil = ImageModifierUtil.getInstanceOrCreate()!!

    private val originalImageArray: Array<Image?>

    private var imageArray: Array<Image?> = NullCanvas.NULL_IMAGE_ARRAY

    private var currentImage: Image

    private var totalFrames: Int= 0
public constructor (originalImageArray: Array<Image?>, angleInfo: AngleInfo, animationBehavior: AnimationBehavior)                        

                            : super(angleInfo, animationBehavior){
    //var originalImageArray = originalImageArray
    //var angleInfo = angleInfo
    //var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.originalImageArray= originalImageArray
this.setImageArray(imageModifierUtil!!.getImageArray(originalImageArray))
this.currentImage= this.imageArray[this.circularIndexUtil!!.getIndex()]!!
}


                @Throws(Exception::class)
            
    override fun getAnimationSize()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getSize()
}


    override fun setAlpha(alpha: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var alpha = alpha

    
                        if(this.alphaP != alpha)
                        
                                    {
                                    super.setAlpha(alpha)
imageModifierUtil!!.reset()

    var index: Int = this.circularIndexUtil!!.getIndex()!!

imageModifierUtil!!.setAlpha(this.originalImageArray[index]!!, this.imageArray[index]!!, index, this.alphaP)

                                    }
                                
}


    override fun nextRotation()
        //nullable = true from not(false or (false and true)) = true
{
super.nextRotation()

    var index: Int = this.circularIndexUtil!!.getIndex()!!

imageModifierUtil!!.setAlpha(this.originalImageArray[index]!!, this.imageArray[index]!!, index, this.alphaP)
this.currentImage= this.imageArray[index]!!
}


    override fun previousRotation()
        //nullable = true from not(false or (false and true)) = true
{
super.previousRotation()

    var index: Int = this.circularIndexUtil!!.getIndex()!!

imageModifierUtil!!.setAlpha(this.originalImageArray[index]!!, this.imageArray[index]!!, index, this.alphaP)
this.currentImage= this.imageArray[index]!!
}


    override fun setFrame(index2: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var index2 = index2
super.setFrame(index2)

    var index: Int = this.circularIndexUtil!!.getIndex()!!

imageModifierUtil!!.setAlpha(this.originalImageArray[index]!!, this.imageArray[index]!!, index, this.alphaP)
this.currentImage= this.imageArray[index]!!
}


    override fun setSequence(sequence: IntArray)
        //nullable = true from not(false or (false and false)) = true
{
    //var sequence = sequence
}


    override fun getSequence()
        //nullable = true from not(false or (false and true)) = true
: IntArray{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PrimitiveIntUtil.getArrayInstance()
}


    open fun setImageArray(imageArray: Array<Image?>)
        //nullable = true from not(false or (false and false)) = true
{
    //var imageArray = imageArray
this.imageArray= imageArray
this.totalFrames= imageArray!!.size
this.circularIndexUtil= CircularIndexUtil.getInstance(this.totalFrames)
}


    private var anchor: Int = Anchor.TOP_LEFT

    override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
    //var x = x
    //var y = y
graphics.drawImage(this.currentImage, x, y, anchor)
}


    open fun close()
        //nullable = true from not(false or (false and true)) = true
{

    var disposalUtil: DisposalUtil = DisposalUtil.getInstance()!!


    var size2: Int = this.imageArray!!.size
                





                        for (index in 0 until size2)

        {
disposalUtil!!.dispose(this.imageArray[index]!!)
}


    var size: Int = this.originalImageArray!!.size
                





                        for (index in 0 until size)

        {
disposalUtil!!.dispose(this.originalImageArray[index]!!)
}

disposalUtil!!.dispose(this.currentImage)
}


                @Throws(Throwable::class)
            
    override fun finalize()
        //nullable = true from not(false or (false and true)) = true
{

    var disposalUtil: DisposalUtil = DisposalUtil.getInstance()!!


    var size2: Int = this.imageArray!!.size
                





                        for (index in 0 until size2)

        {
disposalUtil!!.dispose(this.imageArray[index]!!)
}


    var size: Int = this.originalImageArray!!.size
                





                        for (index in 0 until size)

        {
disposalUtil!!.dispose(this.originalImageArray[index]!!)
}

disposalUtil!!.dispose(this.currentImage)
}


}
                
            

