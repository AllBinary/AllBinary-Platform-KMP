
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
import org.allbinary.graphics.color.BasicColorUtil
import org.allbinary.image.sprite.AnimationFactorySpriteScaleUtil
import org.allbinary.logic.math.PrimitiveIntUtil

open public class OneRowSpriteIndexedAnimationFactory : BaseImageAnimationFactory {
        
companion object {
            
                @Throws(Exception::class)
            
    open fun createDX(image: Image, dx: Int, animationBehaviorFactory: AnimationBehaviorFactory)
        //nullable = true from not(false or (false and false)) = true
: OneRowSpriteIndexedAnimationFactory{
    //var image = image
    //var dx = dx
    //var animationBehaviorFactory = animationBehaviorFactory

    var oneRowSpriteIndexedAnimationFactory: OneRowSpriteIndexedAnimationFactory = OneRowSpriteIndexedAnimationFactory(image, PrimitiveIntUtil.getArrayInstance(), image.getHeight(), image.getHeight(), 0, 0, animationBehaviorFactory)

oneRowSpriteIndexedAnimationFactory!!.initW(dx)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return oneRowSpriteIndexedAnimationFactory
}


                @Throws(Exception::class)
            
    open fun createDXY(image: Image, dx: Int, dy: Int, animationBehaviorFactory: AnimationBehaviorFactory)
        //nullable = true from not(false or (false and false)) = true
: OneRowSpriteIndexedAnimationFactory{
    //var image = image
    //var dx = dx
    //var dy = dy
    //var animationBehaviorFactory = animationBehaviorFactory

    var oneRowSpriteIndexedAnimationFactory: OneRowSpriteIndexedAnimationFactory = OneRowSpriteIndexedAnimationFactory(image, PrimitiveIntUtil.getArrayInstance(), image.getHeight(), image.getHeight(), 0, 0, animationBehaviorFactory)

oneRowSpriteIndexedAnimationFactory!!.init(dx, dy)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return oneRowSpriteIndexedAnimationFactory
}


                @Throws(Exception::class)
            
    open fun createWH(image: Image, width: Int, height: Int, animationBehaviorFactory: AnimationBehaviorFactory)
        //nullable = true from not(false or (false and false)) = true
: OneRowSpriteIndexedAnimationFactory{
    //var image = image
    //var width = width
    //var height = height
    //var animationBehaviorFactory = animationBehaviorFactory



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return OneRowSpriteIndexedAnimationFactory(image, PrimitiveIntUtil.getArrayInstance(), width, height, 0, 0, animationBehaviorFactory)
}


                @Throws(Exception::class)
            
    open fun create(image: Image, animationBehaviorFactory: AnimationBehaviorFactory)
        //nullable = true from not(false or (false and false)) = true
: OneRowSpriteIndexedAnimationFactory{
    //var image = image
    //var animationBehaviorFactory = animationBehaviorFactory



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return OneRowSpriteIndexedAnimationFactory(image, PrimitiveIntUtil.getArrayInstance(), image.getHeight(), image.getHeight(), 0, 0, animationBehaviorFactory)
}


        }
            
    private val animationFactorySpriteScaleUtil: AnimationFactorySpriteScaleUtil = AnimationFactorySpriteScaleUtil.getInstance()!!
public constructor (image: Image, sequenceArray: IntArray, width: Int, height: Int, dx: Int, dy: Int, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : super(image, sequenceArray, width, height, dx, dy, animationBehaviorFactory){
    //var image = image
    //var sequenceArray = sequenceArray
    //var width = width
    //var height = height
    //var dx = dx
    //var dy = dy
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
}


    open fun init(dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var dx = dx
    //var dy = dy
this.animationFactoryInitializationVisitor!!.dx= dx
this.animationFactoryInitializationVisitor!!.dy= dy
}


    open fun initW(dx: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var dx = dx
this.init(dx, 0)
this.animationFactoryInitializationVisitor!!.dx +=  -(this.animationFactoryInitializationVisitor!!.width shr 2)
}


                @Throws(Exception::class)
            
    override fun getInstance(instanceId: Int)
        //nullable =  from not(true or (false and false)) = 
: Animation{
    //var instanceId = instanceId

    var sprite: Sprite = animationFactorySpriteScaleUtil!!.createImage(this.getImage(), this.animationFactoryInitializationVisitor!!.width, this.animationFactoryInitializationVisitor!!.height, this.scaleProperties!!.scaleWidth, this.scaleProperties!!.scaleHeight)!!


    
                        if(this.animationFactoryInitializationVisitor!!.dx != 0 || this.animationFactoryInitializationVisitor!!.dy != 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AdjustedSpriteIndexedAnimation(sprite, this.getImage(), BasicColorUtil.getInstance()!!.ZERO_ARRAY, this.animationFactoryInitializationVisitor!!.dx, this.animationFactoryInitializationVisitor!!.dy, this.animationBehaviorFactory!!.getOrCreateInstance())

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SpriteIndexedAnimation(sprite, this.getImage(), BasicColorUtil.getInstance()!!.ZERO_ARRAY, this.animationBehaviorFactory!!.getOrCreateInstance())

                        }
                            
}


}
                
            

