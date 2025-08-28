
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
import org.allbinary.math.AngleFactory
import org.allbinary.math.AngleInfo
import org.allbinary.media.image.ImageToRotationImageArrayUtil

open public class ImageArrayRotationAnimationFactory : BaseImageAnimationFactory {
        

    private var imageArray: Array<Image?>

    private var angleIncrement: Int
public constructor        (image: Image, dx: Int, dy: Int)                        

                            : this(image, image.getWidth(), image.getHeight(), dx, dy, AnimationBehaviorFactory.getInstance()){
    //var image = image
    //var dx = dx
    //var dy = dy


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, dx: Int, dy: Int, unused: Any, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : this(image, image.getWidth(), image.getHeight(), dx, dy, animationBehaviorFactory){
    //var image = image
    //var dx = dx
    //var dy = dy
    //var unused = unused
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, dx: Int, dy: Int, angleIncrement: Int)                        

                            : this(image, image.getWidth(), image.getHeight(), dx, dy, angleIncrement, AnimationBehaviorFactory.getInstance()){
    //var image = image
    //var dx = dx
    //var dy = dy
    //var angleIncrement = angleIncrement


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, dx: Int, dy: Int, angleIncrement: Int, unused: Any, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : this(image, image.getWidth(), image.getHeight(), dx, dy, angleIncrement, animationBehaviorFactory){
    //var image = image
    //var dx = dx
    //var dy = dy
    //var angleIncrement = angleIncrement
    //var unused = unused
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, width: Int, height: Int, dx: Int, dy: Int, angleIncrement: Int)                        

                            : this(image, width, height, dx, dy, angleIncrement, AnimationBehaviorFactory.getInstance()){
    //var image = image
    //var width = width
    //var height = height
    //var dx = dx
    //var dy = dy
    //var angleIncrement = angleIncrement


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, width: Int, height: Int, dx: Int, dy: Int, angleIncrement: Int, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : this(image, width, height, angleIncrement, animationBehaviorFactory){
    //var image = image
    //var width = width
    //var height = height
    //var dx = dx
    //var dy = dy
    //var angleIncrement = angleIncrement
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
this.animationFactoryInitializationVisitor!!.dx= dx
this.animationFactoryInitializationVisitor!!.dy= dy
}

public constructor        (image: Image, width: Int, height: Int, dx: Int, dy: Int)                        

                            : this(image, width, height, dx, dy, AnimationBehaviorFactory.getInstance()){
    //var image = image
    //var width = width
    //var height = height
    //var dx = dx
    //var dy = dy


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, width: Int, height: Int, dx: Int, dy: Int, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : this(image, width, height, animationBehaviorFactory){
    //var image = image
    //var width = width
    //var height = height
    //var dx = dx
    //var dy = dy
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
this.animationFactoryInitializationVisitor!!.dx= dx
this.animationFactoryInitializationVisitor!!.dy= dy
}

public constructor        (image: Image, width: Int, height: Int, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : super(image, width, height, animationBehaviorFactory){
    //var image = image
    //var width = width
    //var height = height
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
this.angleIncrement= AngleFactory.getInstance()!!.TOTAL_ANGLE /GameConfigurationCentral.getInstance()!!.getGameControlFidelity()
this.init()
}

public constructor        (image: Image, width: Int, height: Int, angleIncrement: Int, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : super(image, width, height, animationBehaviorFactory){
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
this.setImageArray(ImageToRotationImageArrayUtil.getInstance()!!.generate(this.getImage(), this.getAngleIncrement(), AngleFactory.getInstance()!!.TOTAL_ANGLE))
}


                @Throws(Exception::class)
            
open fun getInstance(instanceId: Int)
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
                        return AdjustedImageArrayRotationAnimation(scaledImageArray, AngleInfo.getInstance(this.getAngleIncrement().toShort()), AngleFactory.getInstance()!!.TOTAL_ANGLE, this.animationFactoryInitializationVisitor!!.dx, this.animationFactoryInitializationVisitor!!.dy, this.animationBehaviorFactory!!.getOrCreateInstance())

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ImageArrayRotationAnimation(scaledImageArray, AngleInfo.getInstance(this.angleIncrement.toShort()), AngleFactory.getInstance()!!.TOTAL_ANGLE, this.animationBehaviorFactory!!.getOrCreateInstance())

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
                
            

