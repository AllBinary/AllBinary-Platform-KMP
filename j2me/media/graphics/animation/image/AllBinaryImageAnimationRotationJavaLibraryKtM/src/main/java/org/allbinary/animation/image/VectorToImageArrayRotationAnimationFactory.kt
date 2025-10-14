
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
import javax.microedition.lcdui.NullCanvas
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
        

    private var imageArray: Array<Image?> = NullCanvas.NULL_IMAGE_ARRAY

    private var angleIncrement: Int= 0
public constructor (vectorInfo: VectorInfo, basicColor: BasicColor, dx: Int, dy: Int)                        

                            : this(vectorInfo, basicColor, dx, dy, AnimationBehaviorFactory.getInstance()){
    //var vectorInfo = vectorInfo
    //var basicColor = basicColor
    //var dx = dx
    //var dy = dy


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor (vectorInfo: VectorInfo, basicColor: BasicColor, dx: Int, dy: Int, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : this(vectorInfo, basicColor, animationBehaviorFactory){
    //var vectorInfo = vectorInfo
    //var basicColor = basicColor
    //var dx = dx
    //var dy = dy
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
this.animationFactoryInitializationVisitor!!.dx= dx
this.animationFactoryInitializationVisitor!!.dy= dy
}

public constructor (vectorInfo: VectorInfo, basicColor: BasicColor)                        

                            : this(vectorInfo, basicColor, AnimationBehaviorFactory.getInstance()){
    //var vectorInfo = vectorInfo
    //var basicColor = basicColor


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor (vectorInfo: VectorInfo, basicColor: BasicColor, animationBehaviorFactory: AnimationBehaviorFactory)                        

                            : super(AnimationFrameToImageUtil.getInstance()!!.getInstanceTranslate(vectorInfo!!.getWidth(), vectorInfo!!.getHeight(), VectorAnimation(vectorInfo!!.getPoints(), basicColor, animationBehaviorFactory!!.getOrCreateInstance())), 0, 0, animationBehaviorFactory){
    //var vectorInfo = vectorInfo
    //var basicColor = basicColor
    //var animationBehaviorFactory = animationBehaviorFactory


                            //For kotlin this is before the body of the constructor.
                    
this.init()
}


                @Throws(Exception::class)
            
    open fun init()
        //nullable = true from not(false or (false and true)) = true
{

    var angleFactory: AngleFactory = AngleFactory.getInstance()!!

this.angleIncrement= angleFactory!!.TOTAL_ANGLE /GameConfigurationCentral.getInstance()!!.getGameControlFidelity()
this.imageArray= ImageToRotationImageArrayUtil.getInstance()!!.generate(this.getImage(), this.getAngleIncrement(), angleFactory!!.TOTAL_ANGLE.toInt())
}


                @Throws(Exception::class)
            
    override fun getInstance(instanceId: Int)
        //nullable =  from not(true or (false and false)) = 
: Animation{
    //var instanceId = instanceId

    
                        if(this.animationFactoryInitializationVisitor!!.dx != 0 || this.animationFactoryInitializationVisitor!!.dy != 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AdjustedImageArrayRotationAnimation(this.imageArray, AngleInfo.getInstance(this.getAngleIncrement().toShort()), AngleFactory.getInstance()!!.TOTAL_ANGLE.toInt(), this.animationFactoryInitializationVisitor!!.dx, this.animationFactoryInitializationVisitor!!.dy, this.animationBehaviorFactory!!.getOrCreateInstance())

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AdjustedImageArrayRotationAnimation(this.imageArray, AngleInfo.getInstance(this.angleIncrement.toShort()), AngleFactory.getInstance()!!.TOTAL_ANGLE.toInt(), this.animationBehaviorFactory!!.getOrCreateInstance())

                        }
                            
}


    open fun getAngleIncrement()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return angleIncrement
}


    override fun setInitialScale(scaleProperties: ScaleProperties)
        //nullable = true from not(false or (false and false)) = true
{
    //var scaleProperties = scaleProperties
}


}
                
            

