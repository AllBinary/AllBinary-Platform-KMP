
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

open public class AllBinarySpriteRotationAnimationFactory : BaseImageAnimationFactory
                , ProceduralAnimationInterfaceFactoryInterface {
        

    private val animationFactorySpriteScaleUtil: AnimationFactorySpriteScaleUtil = AnimationFactorySpriteScaleUtil.getInstance()!!
public constructor        (image: Image, dx: Int, dy: Int, unused: Any)                        

                            : this(image, dx, dy){
    //var image = image
    //var dx = dx
    //var dy = dy
    //var unused = unused


                            //For kotlin this is before the body of the constructor.
                    
this.animationFactoryInitializationVisitor!!.dx +=  -this.animationFactoryInitializationVisitor!!.width /5
this.animationFactoryInitializationVisitor!!.dy +=  -this.animationFactoryInitializationVisitor!!.height /5
}

public constructor        (image: Image, dx: Int, dy: Int, unused: Int)                        

                            : this(image, NullUtil.getInstance()!!.NULL_OBJECT, AnimationBehaviorFactory.getInstance()){
    //var image = image
    //var dx = dx
    //var dy = dy
    //var unused = unused


                            //For kotlin this is before the body of the constructor.
                    
this.animationFactoryInitializationVisitor!!.dx= dx
this.animationFactoryInitializationVisitor!!.dy= dy
}

public constructor        (image: Image, unused: Any, unused2: Any)                        

                            : this(image, 0, 0, unused){
    //var image = image
    //var unused = unused
    //var unused2 = unused2


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, dx: Int, dy: Int)                        

                            : this(image, dx, dy, AnimationBehaviorFactory.getInstance()){
    //var image = image
    //var dx = dx
    //var dy = dy


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, dx: Int, dy: Int, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : this(image, animationBehaviorFactory){
    //var image = image
    //var dx = dx
    //var dy = dy
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
this.animationFactoryInitializationVisitor!!.dx= dx
this.animationFactoryInitializationVisitor!!.dy= dy
}

public constructor        (image: Image)                        

                            : this(image, AnimationBehaviorFactory.getInstance()){
    //var image = image


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : super(image, (image.getHeight() shr 2), (image.getHeight() shr 2), animationBehaviorFactory){
    //var image = image
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, unused: Any)                        

                            : super(image, (image.getHeight() shr 2), (image.getHeight() shr 2), AnimationBehaviorFactory.getInstance()){
    //var image = image
    //var unused = unused


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (image: Image, unused: Any, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : super(image, image.getHeight(), image.getHeight(), animationBehaviorFactory){
    //var image = image
    //var unused = unused
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
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
                
            

