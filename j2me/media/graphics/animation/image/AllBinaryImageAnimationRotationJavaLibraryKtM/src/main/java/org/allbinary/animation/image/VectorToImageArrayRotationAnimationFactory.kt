
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
import org.allbinary.animation.VectorAnimation
import org.allbinary.game.configuration.GameConfigurationCentral
import org.allbinary.graphics.color.BasicColor
import org.allbinary.image.AnimationFrameToImageUtil
import org.allbinary.math.AngleFactory
import org.allbinary.math.AngleInfo
import org.allbinary.media.ScaleProperties
import org.allbinary.media.image.ImageToRotationImageArrayUtil
import org.allbinary.vector.VectorInfo

open public class VectorToImageArrayRotationAnimationFactory : BaseImageAnimationFactory {
        

    private var imageArray: Array<Image?>

    private var angleIncrement: Int= 0
public constructor        (vectorInfo: VectorInfo, basicColor: BasicColor, dx: Int, dy: Int)                        

                            : this(vectorInfo, basicColor, dx, dy, AnimationBehaviorFactory.getInstance())

        Updates for KMP build        
        {
    //var vectorInfo = vectorInfo
    //var basicColor = basicColor
    //var dx = dx
    //var dy = dy


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (vectorInfo: VectorInfo, basicColor: BasicColor, dx: Int, dy: Int, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : this(vectorInfo, basicColor, animationBehaviorFactory)

        Updates for KMP build        
        {
    //var vectorInfo = vectorInfo
    //var basicColor = basicColor
    //var dx = dx
    //var dy = dy
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
this.animationFactoryInitializationVisitor!!.dx= dx
this.animationFactoryInitializationVisitor!!.dy= dy
}

public constructor        (vectorInfo: VectorInfo, basicColor: BasicColor)                        

                            : this(vectorInfo, basicColor, AnimationBehaviorFactory.getInstance())

        Updates for KMP build        
        {
    //var vectorInfo = vectorInfo
    //var basicColor = basicColor


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (vectorInfo: VectorInfo, basicColor: BasicColor, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : super(AnimationFrameToImageUtil.getInstance()!!.getInstanceTranslate(vectorInfo!!.getWidth(), vectorInfo!!.getHeight(), VectorAnimation(vectorInfo!!.getPoints(), basicColor, animationBehaviorFactory!!.getOrCreateInstance())), 0, 0, animationBehaviorFactory)

        Updates for KMP build        
        {
    //var vectorInfo = vectorInfo
    //var basicColor = basicColor
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
this.init()
}


                @Throws(Exception::class)
            
open fun init()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    var angleFactory: AngleFactory = AngleFactory.getInstance()!!

this.angleIncrement= angleFactory!!.TOTAL_ANGLE /GameConfigurationCentral.getInstance()!!.getGameControlFidelity()
this.imageArray= ImageToRotationImageArrayUtil.getInstance()!!.generate(this.getImage(), this.getAngleIncrement(), angleFactory!!.TOTAL_ANGLE)
}


                @Throws(Exception::class)
            
open fun getInstance(instanceId: Int)
        //nullable =  from not(true or (false and false)) = 
: Animation

        Updates for KMP build        
        {
    //var instanceId = instanceId

    
                        if(this.animationFactoryInitializationVisitor!!.dx != 0 || this.animationFactoryInitializationVisitor!!.dy != 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AdjustedImageArrayRotationAnimation(this.imageArray, AngleInfo.getInstance(this.getAngleIncrement().toShort()), AngleFactory.getInstance()!!.TOTAL_ANGLE, this.animationFactoryInitializationVisitor!!.dx, this.animationFactoryInitializationVisitor!!.dy, this.animationBehaviorFactory!!.getOrCreateInstance())

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AdjustedImageArrayRotationAnimation(this.imageArray, AngleInfo.getInstance(this.angleIncrement.toShort()), AngleFactory.getInstance()!!.TOTAL_ANGLE, this.animationBehaviorFactory!!.getOrCreateInstance())

                        }
                            
}


open fun getAngleIncrement()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return angleIncrement
}


open fun setInitialScale(scaleProperties: ScaleProperties)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var scaleProperties = scaleProperties
}


}
                
            

