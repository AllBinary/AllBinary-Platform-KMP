
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
import org.allbinary.animation.AnimationBehavior
import org.allbinary.animation.SingletonAnimationInterfaceFactory
import org.allbinary.image.AnimationFrameToImageUtil

open public class ImageAnimationSingletonInterfaceFactory : SingletonAnimationInterfaceFactory {
        
private constructor (animationInterface: Animation)                        

                            : super(animationInterface){
var animationInterface = animationInterface


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor (image: Image)                        

                            : super(ImageAnimation(image, AnimationBehavior.getInstance())){
var image = image


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor (animationInterface: Animation, width: Int, height: Int)                        

                            : this(ImageAnimation(AnimationFrameToImageUtil.getInstance()!!.getInstance(width, height, animationInterface), AnimationBehavior.getInstance())){
var animationInterface = animationInterface
var width = width
var height = height


                            //For kotlin this is before the body of the constructor.
                    
}


}
                
            

