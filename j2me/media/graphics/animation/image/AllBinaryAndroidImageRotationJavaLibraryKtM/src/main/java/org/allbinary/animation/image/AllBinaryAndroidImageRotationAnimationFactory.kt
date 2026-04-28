
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
import org.allbinary.animation.Animation
import org.allbinary.animation.AnimationBehaviorFactory
import org.allbinary.game.configuration.GameConfigurationCentral
import org.allbinary.game.configuration.feature.Features
import org.allbinary.graphics.opengles.OpenGLFeatureFactory
import org.allbinary.logic.math.PrimitiveIntUtil
import org.allbinary.media.image.ImageCopyUtil
import org.allbinary.math.AngleFactory
import org.allbinary.math.AngleInfo

open public class AllBinaryAndroidImageRotationAnimationFactory : BaseImageAnimationFactory {
        
companion object {
            
                @Throws(Exception::class)
            
    open fun createFactory(image: Image, width: Int, height: Int, animationBehaviorFactory: AnimationBehaviorFactory)
        //nullable = true from not(false or (false and false)) = true
: AllBinaryAndroidImageRotationAnimationFactory{
    //var image = image
    //var width = width
    //var height = height
    //var animationBehaviorFactory = animationBehaviorFactory



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AllBinaryAndroidImageRotationAnimationFactory(image, width, height, (AngleFactory.getInstance()!!.TOTAL_ANGLE /GameConfigurationCentral.getInstance()!!.getGameControlFidelity()).toShort(), animationBehaviorFactory, false)
}


                @Throws(Exception::class)
            
    open fun createFactoryA(image: Image, width: Int, height: Int, angleIncrement: Short, animationBehaviorFactory: AnimationBehaviorFactory)
        //nullable = true from not(false or (false and false)) = true
: AllBinaryAndroidImageRotationAnimationFactory{
    //var image = image
    //var width = width
    //var height = height
    //var angleIncrement = angleIncrement
    //var animationBehaviorFactory = animationBehaviorFactory



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AllBinaryAndroidImageRotationAnimationFactory(image, width, height, angleIncrement, animationBehaviorFactory, false)
}


                @Throws(Exception::class)
            
    open fun createFactoryU(image: Image, animationBehaviorFactory: AnimationBehaviorFactory)
        //nullable = true from not(false or (false and false)) = true
: AllBinaryAndroidImageRotationAnimationFactory{
    //var image = image
    //var animationBehaviorFactory = animationBehaviorFactory

    var androidImageRotationAnimationFactory: AllBinaryAndroidImageRotationAnimationFactory = AllBinaryAndroidImageRotationAnimationFactory(image, image.getWidth(), image.getHeight(), (AngleFactory.getInstance()!!.TOTAL_ANGLE /GameConfigurationCentral.getInstance()!!.getGameControlFidelity()).toShort(), animationBehaviorFactory, false)

androidImageRotationAnimationFactory!!.init( -(image.getWidth() shr 2),  -(image.getHeight() shr 2))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return androidImageRotationAnimationFactory
}


                @Throws(Exception::class)
            
    open fun createFactoryDXYU(image: Image, dx: Int, dy: Int, animationBehaviorFactory: AnimationBehaviorFactory)
        //nullable = true from not(false or (false and false)) = true
: AllBinaryAndroidImageRotationAnimationFactory{
    //var image = image
    //var dx = dx
    //var dy = dy
    //var animationBehaviorFactory = animationBehaviorFactory

    var androidImageRotationAnimationFactory: AllBinaryAndroidImageRotationAnimationFactory = AllBinaryAndroidImageRotationAnimationFactory(image, image.getWidth(), image.getHeight(), (AngleFactory.getInstance()!!.TOTAL_ANGLE /GameConfigurationCentral.getInstance()!!.getGameControlFidelity()).toShort(), animationBehaviorFactory, false)

androidImageRotationAnimationFactory!!.init(dx, dy)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return androidImageRotationAnimationFactory
}


        }
            
    open fun init(dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var dx = dx
    //var dy = dy
this.animationFactoryInitializationVisitor!!.dx= dx
this.animationFactoryInitializationVisitor!!.dy= dy
this.animationFactoryInitializationVisitor!!.originalDx= dx
this.animationFactoryInitializationVisitor!!.originalDy= dy
}


    private val angleIncrement: Short

    private val resizeCanvasForRotation: Boolean
public constructor (image: Image, width: Int, height: Int, angleIncrement: Short, animationBehaviorFactory: AnimationBehaviorFactory, resizeCanvasForRotation: Boolean)                        

                            : super(image, PrimitiveIntUtil.getArrayInstance(), width, height, 0, 0, animationBehaviorFactory){
    //var image = image
    //var width = width
    //var height = height
    //var angleIncrement = angleIncrement
    //var animationBehaviorFactory = animationBehaviorFactory
    //var resizeCanvasForRotation = resizeCanvasForRotation


                            //For kotlin this is before the body of the constructor.
                    
this.angleIncrement= angleIncrement
this.resizeCanvasForRotation= resizeCanvasForRotation
}


                @Throws(Exception::class)
            
    open fun getCanvasImage()
        //nullable = true from not(false or (false and true)) = true
: Image{

    var features: Features = Features.getInstance()!!


    
                        if(this.resizeCanvasForRotation && !features.isDefault(OpenGLFeatureFactory.getInstance()!!.OPENGL))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ImageCopyUtil.getInstance()!!.createImageScale(this.getImage(), 1.44f, false)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getImage()

                        }
                            
}


                @Throws(Exception::class)
            
    override fun getInstance(instanceId: Int)
        //nullable =  from not(true or (false and false)) = 
: Animation{
    //var instanceId = instanceId

    var canvasImage: Image = this.getCanvasImage()!!


    var scaledImage: Image = animationFactoryImageScaleUtil!!.createImage(canvasImage, this.animationFactoryInitializationVisitor!!.width, this.animationFactoryInitializationVisitor!!.height, this.scaleProperties!!.scaleWidth, this.scaleProperties!!.scaleHeight)!!


    var copyOfScaledImage: Image = ImageCopyUtil.getInstance()!!.createImage(scaledImage)!!


    
                        if(this.animationFactoryInitializationVisitor!!.dx != 0 || this.animationFactoryInitializationVisitor!!.dy != 0)
                        
                                    {
                                    animationFactoryImageScaleUtil!!.processAdjust(this)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AllBinaryAdjustedAndroidImageRotationAnimation(scaledImage, copyOfScaledImage, AngleInfo.getInstance(this.angleIncrement), AngleFactory.getInstance()!!.TOTAL_ANGLE, this.animationFactoryInitializationVisitor!!.dx, this.animationFactoryInitializationVisitor!!.dy, animationBehaviorFactory!!.getOrCreateInstance())

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AllBinaryFlickerAndroidImageRotationAnimation(scaledImage, copyOfScaledImage, AngleInfo.getInstance(this.angleIncrement), AngleFactory.getInstance()!!.TOTAL_ANGLE, this.animationBehaviorFactory!!.getOrCreateInstance())

                        }
                            
}


}
                
            

