
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

open public class ImageRotationAnimationFactory : BaseImageAnimationFactory {
        

    val angleIncrement: Short
public constructor        (image: Image, dx: Int, dy: Int)                        

                            : this(image, image.getWidth(), image.getHeight(), dx, dy, AnimationBehaviorFactory.getInstance()){

                    var image = image


                    var dx = dx


                    var dy = dy


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, dx: Int, dy: Int, unused: Any, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : this(image, image.getWidth(), image.getHeight(), dx, dy, animationBehaviorFactory){

                    var image = image


                    var dx = dx


                    var dy = dy


                    var unused = unused


                    var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, dx: Int, dy: Int, angleIncrement: Short, unused: Any)                        

                            : this(image, image.getWidth(), image.getHeight(), dx, dy, angleIncrement, AnimationBehaviorFactory.getInstance()){

                    var image = image


                    var dx = dx


                    var dy = dy


                    var angleIncrement = angleIncrement


                    var unused = unused


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, dx: Int, dy: Int, angleIncrement: Short, unused: Any, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : this(image, image.getWidth(), image.getHeight(), dx, dy, angleIncrement, animationBehaviorFactory){

                    var image = image


                    var dx = dx


                    var dy = dy


                    var angleIncrement = angleIncrement


                    var unused = unused


                    var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, width: Int, height: Int, dx: Int, dy: Int, angleIncrement: Short)                        

                            : this(image, width, height, dx, dy, angleIncrement, AnimationBehaviorFactory.getInstance()){

                    var image = image


                    var width = width


                    var height = height


                    var dx = dx


                    var dy = dy


                    var angleIncrement = angleIncrement


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, width: Int, height: Int, dx: Int, dy: Int, angleIncrement: Short, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : this(image, width, height, angleIncrement, animationBehaviorFactory){

                    var image = image


                    var width = width


                    var height = height


                    var dx = dx


                    var dy = dy


                    var angleIncrement = angleIncrement


                    var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
this.animationFactoryInitializationVisitor!!.dx= dx
this.animationFactoryInitializationVisitor!!.dy= dy
}

public constructor        (image: Image, width: Int, height: Int, dx: Int, dy: Int)                        

                            : this(image, width, height, dx, dy, AnimationBehaviorFactory.getInstance()){

                    var image = image


                    var width = width


                    var height = height


                    var dx = dx


                    var dy = dy


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, width: Int, height: Int, dx: Int, dy: Int, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : this(image, width, height, animationBehaviorFactory){

                    var image = image


                    var width = width


                    var height = height


                    var dx = dx


                    var dy = dy


                    var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
this.animationFactoryInitializationVisitor!!.dx= dx
this.animationFactoryInitializationVisitor!!.dy= dy
}

public constructor        (image: Image)                        

                            : this(image, image.getWidth(), image.getHeight(), AnimationBehaviorFactory.getInstance()){

                    var image = image


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : this(image, image.getWidth(), image.getHeight(), animationBehaviorFactory){

                    var image = image


                    var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, width: Int, height: Int, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : super(image, width, height, animationBehaviorFactory){

                    var image = image


                    var width = width


                    var height = height


                    var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
this.angleIncrement= (AngleFactory.getInstance()!!.TOTAL_ANGLE /GameConfigurationCentral.getInstance()!!.getGameControlFidelity()).toShort()
}

public constructor        (image: Image, width: Int, height: Int, angleIncrement: Short, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : super(image, width, height, animationBehaviorFactory){

                    var image = image


                    var width = width


                    var height = height


                    var angleIncrement = angleIncrement


                    var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
this.angleIncrement= angleIncrement
}


                @Throws(Exception::class)
            override fun getInstance(instanceId: Int)
        //nullable =  from not(true or (false and false)) = 
: Animation{

                    var instanceId = instanceId

    
                        if(this.animationFactoryInitializationVisitor!!.dx != 0 || this.animationFactoryInitializationVisitor!!.dy != 0)
                        
                                    {
                                    animationFactoryImageScaleUtil!!.processAdjust(this)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AdjustedImageBaseRotationAnimation(this.getImage(), AngleInfo.getInstance(this.angleIncrement), AngleFactory.getInstance()!!.TOTAL_ANGLE, this.animationFactoryInitializationVisitor!!.dx, this.animationFactoryInitializationVisitor!!.dy, this.animationBehaviorFactory!!.getOrCreateInstance())

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ImageBaseRotationAnimation(this.getImage(), AngleInfo.getInstance(this.angleIncrement), AngleFactory.getInstance()!!.TOTAL_ANGLE, this.animationBehaviorFactory!!.getOrCreateInstance())

                        }
                            
}


open fun getAngleIncrementP()
        //nullable = true from not(false or (false and true)) = true
: Short{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return angleIncrement
}


}
                
            

