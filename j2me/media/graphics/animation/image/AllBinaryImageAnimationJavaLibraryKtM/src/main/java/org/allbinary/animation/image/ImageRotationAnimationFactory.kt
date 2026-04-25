
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
import org.allbinary.logic.math.PrimitiveIntUtil
import org.allbinary.math.AngleFactory
import org.allbinary.math.AngleInfo

open public class ImageRotationAnimationFactory : BaseImageAnimationFactory {
        

    val angleIncrement: Short
public constructor (image: Image, width: Int, height: Int, dx: Int, dy: Int, angleIncrement: Short, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : super(image, PrimitiveIntUtil.getArrayInstance(), width, height, 0, 0, animationBehaviorFactory){
    //var image = image
    //var width = width
    //var height = height
    //var dx = dx
    //var dy = dy
    //var angleIncrement = angleIncrement
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
this.angleIncrement= angleIncrement
this.animationFactoryInitializationVisitor!!.dx= dx
this.animationFactoryInitializationVisitor!!.dy= dy
}


                @Throws(Exception::class)
            
    override fun getInstance(instanceId: Int)
        //nullable =  from not(true or (false and false)) = 
: Animation{
    //var instanceId = instanceId

    
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
                
            

