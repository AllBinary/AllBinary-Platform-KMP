
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
import org.allbinary.image.GameFeatureImageCacheFactory
import org.allbinary.animation.Animation
import org.allbinary.animation.AnimationBehaviorFactory
import org.allbinary.graphics.displayable.ScreenRelationalUtil
import org.allbinary.media.image.ImageScaleUtil

open public class AllBinaryScreenRelationalImageAnimationInterfaceFactory : BaseImageAnimationFactory {
        

    private var lastImage: Image
public constructor (image: Image)                        

                            : this(image, AnimationBehaviorFactory.getInstance()){
    //var image = image


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor (image: Image, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : super(image, 0, 0, animationBehaviorFactory){
    //var image = image
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    

    
                        if(lastImage != 
                                    null
                                )
                        
                                    {
                                    lastImage!!.getBitmap()!!.recycle()

                                    }
                                

    var scale: Float = ScreenRelationalUtil.getInstance()!!.getScale(image)!!

lastImage= ImageScaleUtil.getInstance()!!.createImage(GameFeatureImageCacheFactory.getInstance(), this.getImage(), scale, scale, false)
}


                @Throws(Exception::class)
            
    override fun getInstance(instanceId: Int)
        //nullable =  from not(true or (false and false)) = 
: Animation{
    //var instanceId = instanceId



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ImageAnimation(lastImage, this.animationBehaviorFactory!!.getOrCreateInstance())
}


}
                
            

