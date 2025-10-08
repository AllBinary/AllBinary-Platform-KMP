
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
import org.allbinary.animation.AnimationInterfaceFactoryInterface
import org.allbinary.game.configuration.GameConfigurationCentral
import org.allbinary.math.AngleFactory
import org.allbinary.media.ScaleProperties
import org.allbinary.media.image.ImageToRotationImageArrayUtil

open public class PooledImageArrayRotationAnimationFactory
            : Object
        
                , AnimationInterfaceFactoryInterface {
        

    private var allBinaryImageRotationAnimationInfo: ImageArrayRotationAnimationInfo

    private val animationBehaviorFactory: AnimationBehaviorFactory
public constructor (image: Image, animationBehaviorFactory: AnimationBehaviorFactory)
            : super()
        {
    //var image = image
    //var animationBehaviorFactory = animationBehaviorFactory
this.animationBehaviorFactory= animationBehaviorFactory
this.init(image, image.getWidth(), image.getHeight(),  -(image.getWidth() shr 2),  -(image.getHeight() shr 2))
}

public constructor (image: Image, dx: Int, dy: Int, animationBehaviorFactory: AnimationBehaviorFactory)
            : super()
        {
    //var image = image
    //var dx = dx
    //var dy = dy
    //var animationBehaviorFactory = animationBehaviorFactory
this.animationBehaviorFactory= animationBehaviorFactory
this.init(image, image.getWidth(), image.getHeight(), dx, dy)
}

public constructor (image: Image, width: Int, height: Int, dx: Int, dy: Int, animationBehaviorFactory: AnimationBehaviorFactory)
            : super()
        {
    //var image = image
    //var width = width
    //var height = height
    //var dx = dx
    //var dy = dy
    //var animationBehaviorFactory = animationBehaviorFactory
this.animationBehaviorFactory= animationBehaviorFactory
this.init(image, width, height, dx, dy)
}

public constructor (image: Image, width: Int, height: Int, dx: Int, dy: Int, angleIncrement: Short, animationBehaviorFactory: AnimationBehaviorFactory)
            : super()
        {
    //var image = image
    //var width = width
    //var height = height
    //var dx = dx
    //var dy = dy
    //var angleIncrement = angleIncrement
    //var animationBehaviorFactory = animationBehaviorFactory
this.animationBehaviorFactory= animationBehaviorFactory
this.init(image, width, height, dx, dy, angleIncrement)
}


                @Throws(Exception::class)
            
    open fun init(image: Image, width: Int, height: Int, dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var image = image
    //var width = width
    //var height = height
    //var dx = dx
    //var dy = dy

    var totalAngle: Int = AngleFactory.getInstance()!!.TOTAL_ANGLE


    var angleIncrement: Short = (totalAngle /GameConfigurationCentral.getInstance()!!.getGameControlFidelity()).toShort()

this.init(image, width, height, dx, dy, angleIncrement)
}


                @Throws(Exception::class)
            
    open fun init(image: Image, width: Int, height: Int, dx: Int, dy: Int, angleIncrement: Short)
        //nullable = true from not(false or (false and false)) = true
{
    //var image = image
    //var width = width
    //var height = height
    //var dx = dx
    //var dy = dy
    //var angleIncrement = angleIncrement

    var totalAngle: Int = AngleFactory.getInstance()!!.TOTAL_ANGLE


    var imageArray: Array<Image?> = ImageToRotationImageArrayUtil.getInstance()!!.generate(image, angleIncrement, totalAngle)!!

allBinaryImageRotationAnimationInfo= ImageArrayRotationAnimationInfo(imageArray, angleIncrement, totalAngle, dx, dy)
}


                @Throws(Exception::class)
            
    open fun getInstance(instanceId: Int)
        //nullable =  from not(true or (false and false)) = 
: Animation{
    //var instanceId = instanceId



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AdjustedImageArrayRotationAnimation(allBinaryImageRotationAnimationInfo, this.animationBehaviorFactory!!.getOrCreateInstance())
}


    open fun setInitialScale(scaleProperties: ScaleProperties)
        //nullable = true from not(false or (false and false)) = true
{
    //var scaleProperties = scaleProperties
}


}
                
            

