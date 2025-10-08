
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

open public class LeftToRightImageAnimationFactory : BaseImageAnimationFactory {
        
public constructor (image: Image, sequenceArray: IntArray, dx: Int, dy: Int)                        

                            : this(image, sequenceArray, dx, dy, AnimationBehaviorFactory.getInstance()){
    //var image = image
    //var sequenceArray = sequenceArray
    //var dx = dx
    //var dy = dy


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor (image: Image, sequenceArray: IntArray, dx: Int, dy: Int, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : super(image, sequenceArray, image.getWidth(), image.getHeight(), dx, dy, animationBehaviorFactory){
    //var image = image
    //var sequenceArray = sequenceArray
    //var dx = dx
    //var dy = dy
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor (image: Image, sequenceArray: IntArray)                        

                            : this(image, sequenceArray, AnimationBehaviorFactory.getInstance()){
    //var image = image
    //var sequenceArray = sequenceArray


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor (image: Image, sequenceArray: IntArray, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : super(image, sequenceArray, image.getWidth(), image.getHeight(), animationBehaviorFactory){
    //var image = image
    //var sequenceArray = sequenceArray
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
    override fun getInstance(instanceId: Int)
        //nullable =  from not(true or (false and false)) = 
: Animation{
    //var instanceId = instanceId

    var scaledImage: Image = animationFactoryImageScaleUtil!!.createImage(this.getImage(), this.animationFactoryInitializationVisitor!!.width, this.animationFactoryInitializationVisitor!!.height, this.scaleProperties!!.scaleWidth, this.scaleProperties!!.scaleHeight)!!


    
                        if(this.animationFactoryInitializationVisitor!!.dx != 0 || this.animationFactoryInitializationVisitor!!.dy != 0)
                        
                                    {
                                    animationFactoryImageScaleUtil!!.processAdjust(this)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AdjustedLeftToRightImageAnimation(scaledImage, this.getSequenceArray(), this.animationFactoryInitializationVisitor!!.dx, this.animationFactoryInitializationVisitor!!.dy, this.animationBehaviorFactory!!.getOrCreateInstance())

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return LeftToRightImageAnimation(scaledImage, this.getSequenceArray(), this.animationBehaviorFactory!!.getOrCreateInstance())

                        }
                            
}


}
                
            

