
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
        package org.allbinary.animation.image.sprite




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Image
import javax.microedition.lcdui.game.Sprite
import org.allbinary.animation.Animation
import org.allbinary.animation.AnimationBehaviorFactory
import org.allbinary.animation.image.BaseImageAnimationFactory
import org.allbinary.image.sprite.AnimationFactorySpriteScaleUtil

open public class OneRowSpriteIndexedAnimationFactory : BaseImageAnimationFactory {
        

    private val animationFactorySpriteScaleUtil: AnimationFactorySpriteScaleUtil = AnimationFactorySpriteScaleUtil.getInstance()!!
public constructor        (image: Image, width: Int, height: Int, dx: Int, dy: Int, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : super(image, width, height, animationBehaviorFactory)

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

public constructor        (image: Image, dx: Int)                        

                            : this(image, dx, 0)

        Updates for KMP build        
        {
    //var image = image
    //var dx = dx


                            //For kotlin this is before the body of the constructor.
                    
this.animationFactoryInitializationVisitor!!.dx +=  -(this.animationFactoryInitializationVisitor!!.width shr 2)
}

public constructor        (image: Image, dx: Int, dy: Int, unused: Any)                        

                            : this(image, dx, dy)

        Updates for KMP build        
        {
    //var image = image
    //var dx = dx
    //var dy = dy
    //var unused = unused


                            //For kotlin this is before the body of the constructor.
                    
this.animationFactoryInitializationVisitor!!.dx +=  -(this.animationFactoryInitializationVisitor!!.width shr 2)
this.animationFactoryInitializationVisitor!!.dy +=  -(this.animationFactoryInitializationVisitor!!.height shr 2)
}

public constructor        (image: Image, dx: Int, dy: Int)                        

                            : this(image, dx, dy, AnimationBehaviorFactory.getInstance())

        Updates for KMP build        
        {
    //var image = image
    //var dx = dx
    //var dy = dy


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, dx: Int, dy: Int, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : this(image, animationBehaviorFactory)

        Updates for KMP build        
        {
    //var image = image
    //var dx = dx
    //var dy = dy
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
this.animationFactoryInitializationVisitor!!.dx= dx
this.animationFactoryInitializationVisitor!!.dy= dy
}

public constructor        (width: Int, height: Int, image: Image)                        

                            : this(width, height, image, AnimationBehaviorFactory.getInstance())

        Updates for KMP build        
        {
    //var width = width
    //var height = height
    //var image = image


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (width: Int, height: Int, image: Image, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : super(image, width, height, animationBehaviorFactory)

        Updates for KMP build        
        {
    //var width = width
    //var height = height
    //var image = image
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image)                        

                            : this(image, AnimationBehaviorFactory.getInstance())

        Updates for KMP build        
        {
    //var image = image


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : super(image, image.getHeight(), image.getHeight(), animationBehaviorFactory)

        Updates for KMP build        
        {
    //var image = image
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            override fun getInstance(instanceId: Int)
        //nullable =  from not(true or (false and false)) = 
: Animation

        Updates for KMP build        
        {
    //var instanceId = instanceId

    var sprite: Sprite = animationFactorySpriteScaleUtil!!.createImage(this.getImage(), this.animationFactoryInitializationVisitor!!.width, this.animationFactoryInitializationVisitor!!.height, this.scaleProperties!!.scaleWidth, this.scaleProperties!!.scaleHeight)!!


    
                        if(this.animationFactoryInitializationVisitor!!.dx != 0 || this.animationFactoryInitializationVisitor!!.dy != 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AdjustedSpriteIndexedAnimation(sprite, this.getImage(), this.animationFactoryInitializationVisitor!!.dx, this.animationFactoryInitializationVisitor!!.dy, this.animationBehaviorFactory!!.getOrCreateInstance())

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SpriteIndexedAnimation(sprite, this.getImage(), this.animationBehaviorFactory!!.getOrCreateInstance())

                        }
                            
}


}
                
            

