
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
import org.allbinary.media.image.ImageCopyUtil
import org.allbinary.math.AngleFactory
import org.allbinary.math.AngleInfo
import org.allbinary.media.ScaleProperties

open public class AllBinaryFlickerAndroidImageRotationAnimationFactory
            : Object
        
                , AnimationInterfaceFactoryInterface {
        

    private var image: Image

    private val angleIncrement: Short

    val animationBehaviorFactory: AnimationBehaviorFactory
public constructor (image: Image, width: Int, height: Int)                        

                            : this(image, width, height, (AngleFactory.getInstance()!!.TOTAL_ANGLE /GameConfigurationCentral.getInstance()!!.getGameControlFidelity()).toShort(), AnimationBehaviorFactory.getInstance()){
    //var image = image
    //var width = width
    //var height = height


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor (image: Image, width: Int, height: Int, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : this(image, width, height, (AngleFactory.getInstance()!!.TOTAL_ANGLE /GameConfigurationCentral.getInstance()!!.getGameControlFidelity()).toShort(), animationBehaviorFactory){
    //var image = image
    //var width = width
    //var height = height
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor (image: Image, width: Int, height: Int, angleIncrement: Short)                        

                            : this(image, width, height, angleIncrement, AnimationBehaviorFactory.getInstance()){
    //var image = image
    //var width = width
    //var height = height
    //var angleIncrement = angleIncrement


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor (image: Image, width: Int, height: Int, angleIncrement: Short, animationBehaviorFactory: AnimationBehaviorFactory)
            : super()
        {
    //var image = image
    //var width = width
    //var height = height
    //var angleIncrement = angleIncrement
    //var animationBehaviorFactory = animationBehaviorFactory
this.setImage(image)
this.angleIncrement= angleIncrement
this.animationBehaviorFactory= animationBehaviorFactory
}


                @Throws(Exception::class)
            
    override fun getInstance(instanceId: Int)
        //nullable =  from not(true or (false and false)) = 
: Animation{
    //var instanceId = instanceId

    var image: Image = ImageCopyUtil.getInstance()!!.createImage(this.getImage())!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AllBinaryFlickerAndroidImageRotationAnimation(this.getImage(), image, AngleInfo.getInstance(this.angleIncrement), AngleFactory.getInstance()!!.TOTAL_ANGLE, this.animationBehaviorFactory!!.getOrCreateInstance())
}


    open fun getAngleIncrement()
        //nullable = true from not(false or (false and true)) = true
: Short{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return angleIncrement
}


    open fun setImage(image: Image)
        //nullable = true from not(false or (false and false)) = true
{
var image = image
this.image= image
}


    open fun getImage()
        //nullable = true from not(false or (false and true)) = true
: Image{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


    open fun setInitialScale(scaleProperties: ScaleProperties)
        //nullable = true from not(false or (false and false)) = true
{
    //var scaleProperties = scaleProperties
}


}
                
            

