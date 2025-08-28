
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
import org.allbinary.graphics.color.BasicColor
import org.allbinary.math.AngleInfo
import org.allbinary.media.image.ImageCopyUtil
import org.allbinary.media.image.ImageModifierUtil
import org.allbinary.media.image.ImageRotationUtil

open public class AllBinaryJ2SEImageRotationAnimation : ImageBaseRotationAnimation {
        

    private val imageRotationUtil: ImageRotationUtil = ImageRotationUtil.getInstance()!!

    private val imageModifierUtil: ImageModifierUtil = ImageModifierUtil.getInstanceOrCreate()!!

    private val realOriginalImage: Image

    private val originalImageArray: Array<Image?> = arrayOfNulls(1)

    private val twoImages: Array<Image?> = arrayOfNulls(2)

    private var imageToShow: Image

    private var bufferedImageIndex: Int= 0

    private var scaleX: Float= 0.0f

    private var scaleY: Float= 0.0f

    private var maxScaleX: Float= 0.0f

    private var maxScaleY: Float= 0.0f

    private var alphaProcessor: ModifierBaseProcessor = ModifierBaseProcessor.getInstance()!!

    private var setColorProcessor: ModifierBaseProcessor = ModifierBaseProcessor.getInstance()!!

    private var changeColorProcessor: ModifierBaseProcessor = ModifierBaseProcessor.getInstance()!!

    private var scaleProcessor: ScaleBaseProcessor = ScaleProcessor.getInstance()!!
protected constructor        (originalImage: Image, image: Image, angleInfo: AngleInfo, totalAngle: Short, animationBehavior: AnimationBehavior)                        

                            : super(image, angleInfo, totalAngle, animationBehavior){
    //var originalImage = originalImage
    //var image = image
    //var angleInfo = angleInfo
    //var totalAngle = totalAngle
    //var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.realOriginalImage= originalImage
this.originalImageArray[0]= originalImage
this.imageToShow= image
this.twoImages[0]= image
this.twoImages[1]= ImageCopyUtil.getInstance()!!.createImageForRotation(image)
}

override fun setBasicColorP(basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{
    //var basicColor = basicColor

    var changed: Boolean = false


    
                        if(this.getBasicColorP() == 
                                    null
                                 || this.getBasicColorP()!!.toInt() != basicColor!!.toInt())
                        
                                    {
                                    changed= true

                                    }
                                
super.setBasicColorP(basicColor)

    
                        if(changed)
                        
                                    {
                                    this.setColorProcessor= SetColorProcessor.getInstance()
this.updateImage()

                                    }
                                
}

override fun changeBasicColor(basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{
    //var basicColor = basicColor

    var changed: Boolean = false


    
                        if(this.getBasicColorP() == 
                                    null
                                 || this.getBasicColorP()!!.toInt() != basicColor!!.toInt())
                        
                                    {
                                    changed= true

                                    }
                                
super.changeBasicColor(basicColor)

    
                        if(changed)
                        
                                    {
                                    this.changeColorProcessor= ChangeColorProcessor.getInstance()
this.updateImage()

                                    }
                                
}

override fun setAlpha(alpha: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var alpha = alpha

    var changed: Boolean = false


    
                        if(this.alphaP != alpha)
                        
                                    {
                                    changed= true

                                    }
                                
super.setAlpha(alpha)

    
                        if(changed)
                        
                                    {
                                    this.alphaProcessor= AlphaProcessor.getInstance()
this.updateImage()

                                    }
                                
}

override fun setScale(scaleX: Float, scaleY: Float)
        //nullable = true from not(false or (false and false)) = true
{
    //var scaleX = scaleX
    //var scaleY = scaleY
this.scaleX= scaleX
this.scaleY= scaleY
this.scaleProcessor!!.update(this.realOriginalImage, this.originalImageArray, this.twoImages, this.bufferedImageIndex, this.scaleX, this.scaleY, this.maxScaleX, this.maxScaleY)
this.updateImage()
}

override fun setMaxScale(maxScaleX: Float, maxScaleY: Float)
        //nullable = true from not(false or (false and false)) = true
{
    //var maxScaleX = maxScaleX
    //var maxScaleY = maxScaleY
this.maxScaleX= maxScaleX
this.maxScaleY= maxScaleY
this.scaleProcessor!!.update(this.realOriginalImage, this.originalImageArray, this.twoImages, this.bufferedImageIndex, this.scaleX, this.scaleY, this.maxScaleX, this.maxScaleY)
this.updateImage()
}


open fun nextRotation()
        //nullable = true from not(false or (false and true)) = true
{
super.nextRotation()
this.updateImage()
}


open fun previousRotation()
        //nullable = true from not(false or (false and true)) = true
{
super.previousRotation()
this.updateImage()
}


open fun updateImage()
        //nullable = true from not(false or (false and true)) = true
{
this.imageRotationUtil!!.rotateImage(this.originalImageArray[0]!!, this.twoImages[this.bufferedImageIndex]!!, this.angleInfo!!.getAngle() +90)
this.alphaProcessor!!.update(imageModifierUtil, 
                            null, this.twoImages[this.bufferedImageIndex]!!, 0, this.alphaP)
this.setColorProcessor!!.update(imageModifierUtil, 
                            null, this.twoImages[this.bufferedImageIndex]!!, 0, this.basicColor)
this.changeColorProcessor!!.update(imageModifierUtil, 
                            null, this.twoImages[this.bufferedImageIndex]!!, 0, this.changeBasicColorP)
this.swap()
}


open fun setFrame(index: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var index = index
super.setFrame(index)
this.updateImage()
}


open fun swap()
        //nullable = true from not(false or (false and true)) = true
{
this.imageToShow= this.twoImages[this.bufferedImageIndex]!!

    
                        if(this.bufferedImageIndex == 0)
                        
                                    {
                                    this.bufferedImageIndex= 1

                                    }
                                
                        else {
                            this.bufferedImageIndex= 0

                        }
                            
}


open fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
    //var x = x
    //var y = y
graphics.drawImage(this.imageToShow, x, y, anchor)
}


open fun close()
        //nullable = true from not(false or (false and true)) = true
{
super.close()

    var disposalUtil: DisposalUtil = DisposalUtil.getInstance()!!


    var size2: Int = this.twoImages!!.size
                





                        for (index in 0 until size2)

        {
disposalUtil!!.dispose(this.twoImages[index]!!)
}


    var size: Int = this.originalImageArray!!.size
                





                        for (index in 0 until size)

        {
disposalUtil!!.dispose(this.originalImageArray[index]!!)
}

disposalUtil!!.dispose(this.realOriginalImage)
disposalUtil!!.dispose(this.imageToShow)
}


                @Throws(Throwable::class)
            
open fun finalize()
        //nullable = true from not(false or (false and true)) = true
{
super.finalize()

    var disposalUtil: DisposalUtil = DisposalUtil.getInstance()!!


    var size2: Int = this.twoImages!!.size
                





                        for (index in 0 until size2)

        {
disposalUtil!!.dispose(this.twoImages[index]!!)
}


    var size: Int = this.originalImageArray!!.size
                





                        for (index in 0 until size)

        {
disposalUtil!!.dispose(this.originalImageArray[index]!!)
}

disposalUtil!!.dispose(this.realOriginalImage)
disposalUtil!!.dispose(this.imageToShow)
}


}
                
            

