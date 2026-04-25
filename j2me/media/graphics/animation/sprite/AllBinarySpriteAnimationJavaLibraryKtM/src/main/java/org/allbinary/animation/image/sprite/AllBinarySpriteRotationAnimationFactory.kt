
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
import org.allbinary.image.sprite.AnimationFactorySpriteScaleUtil
import org.allbinary.logic.NullUtil
import org.allbinary.logic.math.PrimitiveIntUtil

open public class AllBinarySpriteRotationAnimationFactory : BaseImageAnimationFactory
                , ProceduralAnimationInterfaceFactoryInterface {
        
companion object {
            
                @Throws(Exception::class)
            
    open fun createWHDY(image: Image, dx: Int, dy: Int, animationBehaviorFactory: AnimationBehaviorFactory)
        //nullable = true from not(false or (false and false)) = true
: AllBinarySpriteRotationAnimationFactory{
    //var image = image
    //var dx = dx
    //var dy = dy
    //var animationBehaviorFactory = animationBehaviorFactory

    var spriteRotationAnimationFactory: AllBinarySpriteRotationAnimationFactory = AllBinarySpriteRotationAnimationFactory(image, PrimitiveIntUtil.getArrayInstance(), (image.getHeight() shr 2), (image.getHeight() shr 2), 0, 0, animationBehaviorFactory)

spriteRotationAnimationFactory!!.initWH(dx, dy)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return spriteRotationAnimationFactory
}


                @Throws(Exception::class)
            
    open fun createWH(image: Image, animationBehaviorFactory: AnimationBehaviorFactory)
        //nullable = true from not(false or (false and false)) = true
: AllBinarySpriteRotationAnimationFactory{
    //var image = image
    //var animationBehaviorFactory = animationBehaviorFactory



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AllBinarySpriteRotationAnimationFactory.createWHDY(image, 0, 0, animationBehaviorFactory)
}


                @Throws(Exception::class)
            
    open fun createDXY(image: Image, dx: Int, dy: Int, animationBehaviorFactory: AnimationBehaviorFactory)
        //nullable = true from not(false or (false and false)) = true
: AllBinarySpriteRotationAnimationFactory{
    //var image = image
    //var dx = dx
    //var dy = dy
    //var animationBehaviorFactory = animationBehaviorFactory

    var spriteRotationAnimationFactory: AllBinarySpriteRotationAnimationFactory = AllBinarySpriteRotationAnimationFactory(image, PrimitiveIntUtil.getArrayInstance(), image.getHeight(), image.getHeight(), 0, 0, animationBehaviorFactory)

spriteRotationAnimationFactory!!.init(dx, dy)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return spriteRotationAnimationFactory
}


                @Throws(Exception::class)
            
    open fun createDXYQ(image: Image, dx: Int, dy: Int, animationBehaviorFactory: AnimationBehaviorFactory)
        //nullable = true from not(false or (false and false)) = true
: AllBinarySpriteRotationAnimationFactory{
    //var image = image
    //var dx = dx
    //var dy = dy
    //var animationBehaviorFactory = animationBehaviorFactory

    var spriteRotationAnimationFactory: AllBinarySpriteRotationAnimationFactory = AllBinarySpriteRotationAnimationFactory(image, PrimitiveIntUtil.getArrayInstance(), (image.getHeight() shr 2), (image.getHeight() shr 2), 0, 0, animationBehaviorFactory)

spriteRotationAnimationFactory!!.init(dx, dy)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return spriteRotationAnimationFactory
}


                @Throws(Exception::class)
            
    open fun createQ(image: Image, animationBehaviorFactory: AnimationBehaviorFactory)
        //nullable = true from not(false or (false and false)) = true
: AllBinarySpriteRotationAnimationFactory{
    //var image = image
    //var animationBehaviorFactory = animationBehaviorFactory



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AllBinarySpriteRotationAnimationFactory(image, PrimitiveIntUtil.getArrayInstance(), (image.getHeight() shr 2), (image.getHeight() shr 2), 0, 0, animationBehaviorFactory)
}


                @Throws(Exception::class)
            
    open fun createWHF(image: Image, animationBehaviorFactory: AnimationBehaviorFactory)
        //nullable = true from not(false or (false and false)) = true
: AllBinarySpriteRotationAnimationFactory{
    //var image = image
    //var animationBehaviorFactory = animationBehaviorFactory



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AllBinarySpriteRotationAnimationFactory(image, PrimitiveIntUtil.getArrayInstance(), image.getHeight(), image.getHeight(), 0, 0, animationBehaviorFactory)
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


    open fun initWH(dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var dx = dx
    //var dy = dy
this.init(dx, dy)
this.animationFactoryInitializationVisitor!!.dx +=  -this.animationFactoryInitializationVisitor!!.width /5
this.animationFactoryInitializationVisitor!!.dy +=  -this.animationFactoryInitializationVisitor!!.height /5
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
                        return AllBinaryAdjustedSpriteRotationAnimation(sprite, this.getImage(), this.animationFactoryInitializationVisitor!!.dx, this.animationFactoryInitializationVisitor!!.dy, this.animationBehaviorFactory!!.getOrCreateInstance())

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AllBinarySpriteRotationAnimation(sprite, this.getImage(), this.animationBehaviorFactory!!.getOrCreateInstance())

                        }
                            
}


                @Throws(Exception::class)
            
    override fun getInstance(animationInterface: Animation)
        //nullable =  from not(true or (false and false)) = 
: Animation{
    //var animationInterface = animationInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getInstance(0)
}


}
                
            

