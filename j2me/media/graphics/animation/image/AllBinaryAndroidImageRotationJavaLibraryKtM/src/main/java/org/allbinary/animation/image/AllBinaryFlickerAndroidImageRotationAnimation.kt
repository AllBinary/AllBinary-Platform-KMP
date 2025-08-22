
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
        
import android.graphics.Matrix
import javax.microedition.lcdui.Image
import org.allbinary.animation.AnimationBehavior
import org.allbinary.graphics.color.BasicColor
import org.allbinary.math.AngleInfo
import org.allbinary.media.image.AndroidImageUtil
import org.allbinary.media.image.ImageModifierUtil

open public class AllBinaryFlickerAndroidImageRotationAnimation : ImageBaseRotationAnimation {
        

    private val imageModifierUtil: ImageModifierUtil = ImageModifierUtil.getInstanceOrCreate()!!

    private val androidImageUtil: AndroidImageUtil = AndroidImageUtil.getInstance()!!

    private val matrix: Matrix = Matrix()

    private val halfWidth: Int

    private val halfHeight: Int

    private val increment: Short

    private val originalImage: Image
protected constructor        (originalImage: Image, image: Image, angleInfo: AngleInfo, totalAngle: Short, animationBehavior: AnimationBehavior)                        

                            : super(image, angleInfo, totalAngle, animationBehavior){

                    var originalImage = originalImage


                    var image = image


                    var angleInfo = angleInfo


                    var totalAngle = totalAngle


                    var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.originalImage= originalImage
this.halfWidth= (image.getWidth() shr 1)
this.halfHeight= (image.getHeight() shr 1)
this.increment= (this.angleInfo!!.getAngleIncrementInfo()!!.getAngleIncrement()).toShort()
}


open fun setBasicColorP(basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{

                    var basicColor = basicColor

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
                                    matrix.setRotate(0, this.halfWidth, this.halfHeight)
this.updateImage()

                                    }
                                
}


open fun setAlpha(alpha: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var alpha = alpha

    var changed: Boolean = false


    
                        if(this.alphaP != alpha)
                        
                                    {
                                    changed= true

                                    }
                                
super.setAlpha(alpha)
imageModifierUtil!!.setAlpha(this.originalImage, this.getImage(), 0, this.alphaP)

    
                        if(changed)
                        
                                    {
                                    matrix.setRotate(0, this.halfWidth, this.halfHeight)
this.updateImage()

                                    }
                                
}


open fun nextRotation()
        //nullable = true from not(false or (false and true)) = true
{super.nextRotation()
matrix.setRotate(this.increment, this.halfWidth, this.halfHeight)
this.updateImage()
}


open fun previousRotation()
        //nullable = true from not(false or (false and true)) = true
{super.previousRotation()
matrix.setRotate( -this.increment, this.halfWidth, this.halfHeight)
this.updateImage()
}


open fun updateImage()
        //nullable = true from not(false or (false and true)) = true
{androidImageUtil!!.rotate(this.getImage(), originalImage, matrix)
}


open fun setFrame(index: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var index = index

    var currentFrame: Int = this.circularIndexUtil!!.getIndex()!!

this.circularIndexUtil!!.setIndex(index)

    var newFrame: Int = this.circularIndexUtil!!.getIndex()!!

this.angleInfo!!.adjustAngle(newFrame)
matrix.setRotate((newFrame -currentFrame) *increment, this.halfWidth, this.halfHeight)
this.updateImage()
}


}
                
            

