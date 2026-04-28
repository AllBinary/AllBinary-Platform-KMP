
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
import org.allbinary.AndroidUtil
import org.allbinary.animation.Animation
import org.allbinary.animation.AnimationBehaviorFactory
import org.allbinary.animation.ProceduralAnimationInterfaceFactoryInterface
import org.allbinary.animation.image.BaseImageAnimationFactory
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorUtil
import org.allbinary.image.sprite.AnimationFactorySpriteScaleUtil
import org.allbinary.logic.math.PrimitiveIntUtil

open public class SpriteIndexedAnimationFactory : BaseImageAnimationFactory
                , ProceduralAnimationInterfaceFactoryInterface {
        
companion object {
            
                @Throws(Exception::class)
            
    open fun createCWHDXY(image: Image, basicColorArray: Array<BasicColor?>, width: Int, height: Int, dx: Int, dy: Int, animationBehaviorFactory: AnimationBehaviorFactory)
        //nullable = true from not(false or (false and false)) = true
: SpriteIndexedAnimationFactory{
    //var image = image
    //var basicColorArray = basicColorArray
    //var width = width
    //var height = height
    //var dx = dx
    //var dy = dy
    //var animationBehaviorFactory = animationBehaviorFactory



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SpriteIndexedAnimationFactory(image, basicColorArray, PrimitiveIntUtil.getArrayInstance(), width, height, dx, dy, animationBehaviorFactory)
}


                @Throws(Exception::class)
            
    open fun createCWH(image: Image, basicColorArray: Array<BasicColor?>, width: Int, height: Int, animationBehaviorFactory: AnimationBehaviorFactory)
        //nullable = true from not(false or (false and false)) = true
: SpriteIndexedAnimationFactory{
    //var image = image
    //var basicColorArray = basicColorArray
    //var width = width
    //var height = height
    //var animationBehaviorFactory = animationBehaviorFactory

    var spriteIndexedAnimationFactory: SpriteIndexedAnimationFactory = SpriteIndexedAnimationFactory(image, basicColorArray, PrimitiveIntUtil.getArrayInstance(), width, height, 0, 0, animationBehaviorFactory)

spriteIndexedAnimationFactory!!.initHWH()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return spriteIndexedAnimationFactory
}


                @Throws(Exception::class)
            
    open fun createWH(image: Image, width: Int, height: Int, animationBehaviorFactory: AnimationBehaviorFactory)
        //nullable = true from not(false or (false and false)) = true
: SpriteIndexedAnimationFactory{
    //var image = image
    //var width = width
    //var height = height
    //var animationBehaviorFactory = animationBehaviorFactory



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SpriteIndexedAnimationFactory(image, BasicColorUtil.getInstance()!!.ZERO_ARRAY, PrimitiveIntUtil.getArrayInstance(), width, height, 0, 0, animationBehaviorFactory)
}


        }
            
    private val animationFactorySpriteScaleUtil: AnimationFactorySpriteScaleUtil = AnimationFactorySpriteScaleUtil.getInstance()!!

    private var basicColorArray: Array<BasicColor?> = BasicColorUtil.getInstance()!!.ZERO_ARRAY
private constructor (image: Image, basicColorArray: Array<BasicColor?>, sequenceArray: IntArray, width: Int, height: Int, dx: Int, dy: Int, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : super(image, sequenceArray, width, height, dx, dy, animationBehaviorFactory){
    //var image = image
    //var basicColorArray = basicColorArray
    //var sequenceArray = sequenceArray
    //var width = width
    //var height = height
    //var dx = dx
    //var dy = dy
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
this.basicColorArray= basicColorArray
}


    open fun initHWH()
        //nullable = true from not(false or (false and true)) = true
{
this.animationFactoryInitializationVisitor!!.dx=  -(this.animationFactoryInitializationVisitor!!.width shr 2)
this.animationFactoryInitializationVisitor!!.dy=  -(this.animationFactoryInitializationVisitor!!.height shr 2)

    
                        if(AndroidUtil.isAndroid())
                        
                                    {
                                    this.animationFactoryInitializationVisitor!!.dx += 3

                                    }
                                
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
                        return AdjustedSpriteIndexedAnimation(sprite, this.getImage(), this.basicColorArray, this.animationFactoryInitializationVisitor!!.dx, this.animationFactoryInitializationVisitor!!.dy, this.animationBehaviorFactory!!.getOrCreateInstance())

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SpriteIndexedAnimation(sprite, this.getImage(), this.basicColorArray, this.animationBehaviorFactory!!.getOrCreateInstance())

                        }
                            
}


                @Throws(Exception::class)
            
    override fun getInstanceAnimation(animationInterface: Animation)
        //nullable = true from not(false or (false and false)) = true
: Animation{
    //var animationInterface = animationInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getInstance(0)
}


}
                
            

