
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Image
import org.allbinary.animation.Animation
import org.allbinary.animation.AnimationBehavior
import org.allbinary.animation.AnimationBehaviorFactory
import org.allbinary.animation.AnimationInterfaceFactoryInterface
import org.allbinary.media.ScaleProperties

open public class ImageArrayAnimationFactory
            : Object
        
                , AnimationInterfaceFactoryInterface {
        

    private var dx: Int = 0

    private var dy: Int = 0

    private val imageArray: Array<Image?>

    private val animationBehaviorFactory: AnimationBehaviorFactory
public constructor        (imageArray: Array<Image?>, dx: Int, dy: Int)                        

                            : this(imageArray, dx, dy, AnimationBehaviorFactory.getInstance()){

                    var imageArray = imageArray


                    var dx = dx


                    var dy = dy


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (imageArray: Array<Image?>, dx: Int, dy: Int, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : this(imageArray, animationBehaviorFactory){

                    var imageArray = imageArray


                    var dx = dx


                    var dy = dy


                    var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
this.dx= dx
this.dy= dy
}

public constructor        (imageArray: Array<Image?>)                        

                            : this(imageArray, AnimationBehaviorFactory.getInstance()){

                    var imageArray = imageArray


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (imageArray: Array<Image?>, animationBehaviorFactory: AnimationBehaviorFactory)
            : super()
        {

                    var imageArray = imageArray


                    var animationBehaviorFactory = animationBehaviorFactory
this.imageArray= imageArray
this.animationBehaviorFactory= animationBehaviorFactory
}


                @Throws(Exception::class)
            override fun getInstance(instanceId: Int)
        //nullable =  from not(true or (false and false)) = 
: Animation{

                    var instanceId = instanceId

    
                        if(dx != 0 || dy != 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AdjustedImageArrayAnimation(this.imageArray, dx, dy, this.animationBehaviorFactory!!.getOrCreateInstance())

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ImageArrayAnimation(this.imageArray, AnimationBehavior.getInstance())

                        }
                            
}

override fun setInitialScale(scaleProperties: ScaleProperties)
        //nullable = true from not(false or (false and false)) = true
{

                    var scaleProperties = scaleProperties
}


}
                
            

