
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
        
import javax.microedition.lcdui.Image
import javax.microedition.lcdui.NullCanvas
import org.allbinary.animation.Animation
import org.allbinary.animation.AnimationBehaviorFactory
import org.allbinary.game.configuration.GameConfigurationCentral
import org.allbinary.logic.math.PrimitiveIntUtil
import org.allbinary.math.AngleFactory
import org.allbinary.math.AngleInfo
import org.allbinary.media.image.ImageToRotationImageArrayUtil

open public class AllBinaryArrayImageRotationAnimationFactory : BaseImageAnimationFactory {
        
companion object {
            
                @Throws(Exception::class)
            
    open fun createFactory(image: Image, dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
: AllBinaryArrayImageRotationAnimationFactory{
    //var image = image
    //var dx = dx
    //var dy = dy

    var arrayImageRotationAnimationFactory: AllBinaryArrayImageRotationAnimationFactory = AllBinaryArrayImageRotationAnimationFactory(image, image.getWidth(), image.getHeight(), AngleFactory.getInstance()!!.TOTAL_ANGLE /GameConfigurationCentral.getInstance()!!.getGameControlFidelity(), AnimationBehaviorFactory.getInstance())

arrayImageRotationAnimationFactory!!.initDXY(dx, dy)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return arrayImageRotationAnimationFactory
}


                @Throws(Exception::class)
            
    open fun createFactoryA(image: Image, dx: Int, dy: Int, angleIncrement: Int)
        //nullable = true from not(false or (false and false)) = true
: AllBinaryArrayImageRotationAnimationFactory{
    //var image = image
    //var dx = dx
    //var dy = dy
    //var angleIncrement = angleIncrement

    var arrayImageRotationAnimationFactory: AllBinaryArrayImageRotationAnimationFactory = AllBinaryArrayImageRotationAnimationFactory(image, image.getWidth(), image.getHeight(), angleIncrement, AnimationBehaviorFactory.getInstance())

arrayImageRotationAnimationFactory!!.initDXY(dx, dy)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return arrayImageRotationAnimationFactory
}


        }
            
    private var imageArray: Array<Image?> = NullCanvas.NULL_IMAGE_ARRAY

    private var angleIncrement: Int
public constructor (image: Image, width: Int, height: Int, angleIncrement: Int, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : super(image, PrimitiveIntUtil.getArrayInstance(), width, height, 0, 0, animationBehaviorFactory){
    //var image = image
    //var width = width
    //var height = height
    //var angleIncrement = angleIncrement
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
this.angleIncrement= angleIncrement
this.init()
}


                @Throws(Exception::class)
            
    open fun init()
        //nullable = true from not(false or (false and true)) = true
{
this.setImageArray(ImageToRotationImageArrayUtil.getInstance()!!.generate(this.getImage(), this.getAngleIncrement(), AngleFactory.getInstance()!!.TOTAL_ANGLE.toInt()))
}


    open fun initDXY(dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var dx = dx
    //var dy = dy
this.animationFactoryInitializationVisitor!!.dx= dx
this.animationFactoryInitializationVisitor!!.dy= dy
this.animationFactoryInitializationVisitor!!.originalDx= dx
this.animationFactoryInitializationVisitor!!.originalDy= dy
}


                @Throws(Exception::class)
            
    override fun getInstance(instanceId: Int)
        //nullable =  from not(true or (false and false)) = 
: Animation{
    //var instanceId = instanceId

    var scaledImageArray: Array<Image?> = arrayOfNulls(this.imageArray!!.size)


    var size: Int = scaledImageArray!!.size
                


    var image: Image = this.getImage()!!





                        for (index in 0 until size)

        {
scaledImageArray[index]= animationFactoryImageScaleUtil!!.createImage(image, image.getWidth(), image.getHeight(), this.scaleProperties!!.scaleWidth, this.scaleProperties!!.scaleHeight)
}


    
                        if(this.animationFactoryInitializationVisitor!!.dx != 0 || this.animationFactoryInitializationVisitor!!.dy != 0)
                        
                                    {
                                    animationFactoryImageScaleUtil!!.processAdjust(this)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AdjustedImageArrayRotationAnimation(scaledImageArray, AngleInfo.getInstance(this.getAngleIncrement().toShort()), AngleFactory.getInstance()!!.TOTAL_ANGLE.toInt(), this.animationFactoryInitializationVisitor!!.dx, this.animationFactoryInitializationVisitor!!.dy, this.animationBehaviorFactory!!.getOrCreateInstance())

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ImageArrayRotationAnimation(scaledImageArray, AngleInfo.getInstance(this.getAngleIncrement().toShort()), AngleFactory.getInstance()!!.TOTAL_ANGLE.toInt(), this.animationBehaviorFactory!!.getOrCreateInstance())

                        }
                            
}


    open fun setImageArray(imageArray: Array<Image?>)
        //nullable = true from not(false or (false and false)) = true
{
    //var imageArray = imageArray
this.imageArray= imageArray
}


    open fun getAngleIncrement()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return angleIncrement
}


}
                
            

