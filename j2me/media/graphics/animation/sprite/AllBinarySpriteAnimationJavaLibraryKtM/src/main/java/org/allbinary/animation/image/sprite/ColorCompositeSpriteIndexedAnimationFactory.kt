
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
import org.allbinary.animation.ProceduralAnimationInterfaceFactoryInterface
import org.allbinary.animation.image.BaseImageAnimationFactory
import org.allbinary.graphics.color.BasicColor
import org.allbinary.image.sprite.AnimationFactorySpriteScaleUtil

open public class ColorCompositeSpriteIndexedAnimationFactory : BaseImageAnimationFactory
                , ProceduralAnimationInterfaceFactoryInterface {
        

    private val animationFactorySpriteScaleUtil: AnimationFactorySpriteScaleUtil = AnimationFactorySpriteScaleUtil.getInstance()!!

    private val basicColorArray: Array<BasicColor?>
public constructor        (image: Image, basicColorArray: Array<BasicColor?>, width: Int, height: Int)                        

                            : this(image, basicColorArray, width, height, AnimationBehaviorFactory.getInstance())

        Updates for KMP build        
        {
    //var image = image
    //var basicColorArray = basicColorArray
    //var width = width
    //var height = height


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, basicColorArray: Array<BasicColor?>, width: Int, height: Int, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : super(image, width, height, animationBehaviorFactory)

        Updates for KMP build        
        {
    //var image = image
    //var basicColorArray = basicColorArray
    //var width = width
    //var height = height
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
this.basicColorArray= basicColorArray
}


                @Throws(Exception::class)
            override fun getInstance(instanceId: Int)
        //nullable =  from not(true or (false and false)) = 
: Animation

        Updates for KMP build        
        {
    //var instanceId = instanceId

    var sprite: Sprite = animationFactorySpriteScaleUtil!!.createImage(this.getImage(), this.animationFactoryInitializationVisitor!!.width, this.animationFactoryInitializationVisitor!!.height, this.scaleProperties!!.scaleWidth, this.scaleProperties!!.scaleHeight)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SpriteIndexedAnimation(sprite, this.getImage(), this.basicColorArray, this.animationBehaviorFactory!!.getOrCreateInstance())
}


                @Throws(Exception::class)
            override fun getInstance(animationInterface: Animation)
        //nullable =  from not(true or (false and false)) = 
: Animation

        Updates for KMP build        
        {
    //var animationInterface = animationInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getInstance(0)
}


}
                
            

