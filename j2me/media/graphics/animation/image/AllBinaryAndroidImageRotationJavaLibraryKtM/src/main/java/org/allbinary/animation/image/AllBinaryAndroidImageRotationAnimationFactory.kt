
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
import org.allbinary.media.image.ImageCopyUtil
import org.allbinary.math.AngleFactory
import org.allbinary.math.AngleInfo

open public class AllBinaryAndroidImageRotationAnimationFactory : BaseImageAnimationFactory {
        

    private val angleIncrement: Short
public constructor        (image: Image, unused: Any)                        

                            : this(image, unused, AnimationBehaviorFactory.getInstance())

        Updates for KMP build        
        {
    //var image = image
    //var unused = unused


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, unused: Any, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : this(image, image.getWidth(), image.getHeight(),  -(image.getWidth() shr 2),  -(image.getHeight() shr 2), animationBehaviorFactory)

        Updates for KMP build        
        {
    //var image = image
    //var unused = unused
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, dx: Int, dy: Int, unused: Any)                        

                            : this(image, image.getWidth(), image.getHeight(), dx, dy, AnimationBehaviorFactory.getInstance())

        Updates for KMP build        
        {
    //var image = image
    //var dx = dx
    //var dy = dy
    //var unused = unused


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, dx: Int, dy: Int, unused: Any, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : this(image, image.getWidth(), image.getHeight(), dx, dy, animationBehaviorFactory)

        Updates for KMP build        
        {
    //var image = image
    //var dx = dx
    //var dy = dy
    //var unused = unused
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, dx: Int, dy: Int, unused: Any, angleIncrement: Short)                        

                            : this(image, image.getWidth(), image.getHeight(), dx, dy, angleIncrement, AnimationBehaviorFactory.getInstance())

        Updates for KMP build        
        {
    //var image = image
    //var dx = dx
    //var dy = dy
    //var unused = unused
    //var angleIncrement = angleIncrement


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, dx: Int, dy: Int, angleIncrement: Short, unused: Any, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : this(image, image.getWidth(), image.getHeight(), dx, dy, angleIncrement, animationBehaviorFactory)

        Updates for KMP build        
        {
    //var image = image
    //var dx = dx
    //var dy = dy
    //var angleIncrement = angleIncrement
    //var unused = unused
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, width: Int, height: Int, dx: Int, dy: Int, angleIncrement: Short, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : this(image, width, height, angleIncrement, animationBehaviorFactory)

        Updates for KMP build        
        {
var image = image
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

public constructor        (image: Image, width: Int, height: Int, dx: Int, dy: Int, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : this(image, width, height, animationBehaviorFactory)

        Updates for KMP build        
        {
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

                            : super(image, width, height, animationBehaviorFactory)

        Updates for KMP build        
        {
    //var image = image
    //var width = width
    //var height = height
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
this.angleIncrement= (AngleFactory.getInstance()!!.TOTAL_ANGLE /GameConfigurationCentral.getInstance()!!.getGameControlFidelity()).toShort()
}

public constructor        (image: Image, width: Int, height: Int, angleIncrement: Short, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : super(image, width, height, animationBehaviorFactory)

        Updates for KMP build        
        {
    //var image = image
    //var width = width
    //var height = height
    //var angleIncrement = angleIncrement
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
this.angleIncrement= angleIncrement
}


    private var secondImage: Image = 
                null
            

                @Throws(Exception::class)
            override fun getInstance(instanceId: Int)
        //nullable =  from not(true or (false and false)) = 
: Animation

        Updates for KMP build        
        {
    //var instanceId = instanceId

    var scaledImage: Image = animationFactoryImageScaleUtil!!.createImage(this.getImage(), this.animationFactoryInitializationVisitor!!.width, this.animationFactoryInitializationVisitor!!.height, this.scaleProperties!!.scaleWidth, this.scaleProperties!!.scaleHeight)!!


    var copyOfScaledImage: Image = secondImage


    
                        if(copyOfScaledImage == 
                                    null
                                )
                        
                                    {
                                    secondImage= copyOfScaledImage= ImageCopyUtil.getInstance()!!.createImage(scaledImage)

                                    }
                                

    
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
                
            

