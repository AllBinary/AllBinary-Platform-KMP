
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
import org.allbinary.animation.AnimationBehavior
import org.allbinary.math.AngleInfo

open public class ImageArrayRotationAnimation : ImageArrayBaseRotationAnimation {
        
companion object {
            
                @Throws(Exception::class)
            
    open fun createAnimation(anyType: Any, animationBehavior: AnimationBehavior)
        //nullable = true from not(false or (false and false)) = true
: ImageArrayRotationAnimation{
    //var anyType = anyType
    //var animationBehavior = animationBehavior

    var imageRotationAnimationInfo: ImageArrayRotationAnimationInfo = anyType as ImageArrayRotationAnimationInfo




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ImageArrayRotationAnimation(imageRotationAnimationInfo!!.getImageArray(), imageRotationAnimationInfo!!.getAngleInfoP(), imageRotationAnimationInfo!!.getTotalAngle(), animationBehavior)
}


        }
            
    private var expectedTotalFrames: Int= 0
public constructor (imageArray: Array<Image?>, angleInfo: AngleInfo, totalAngle: Int, animationBehavior: AnimationBehavior)                        

                            : super(imageArray, angleInfo, animationBehavior){
    //var imageArray = imageArray
    //var angleInfo = angleInfo
    //var totalAngle = totalAngle
    //var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.init(imageArray, angleInfo, totalAngle)
}


                @Throws(Exception::class)
            
    open fun init(imageArray: Array<Image?>, angleInfo: AngleInfo, totalAngle: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var imageArray = imageArray
    //var angleInfo = angleInfo
    //var totalAngle = totalAngle
this.expectedTotalFrames= totalAngle /this.angleInfo!!.getAngleIncrementInfo()!!.getAngleIncrement()
this.angleInfo!!.adjustAngle(0)

    
                        if(this.expectedTotalFrames != this.getSize())
                        
                                    {
                                    


                            throw Exception("Wrong Number of Frames")

                                    }
                                
}


    override fun setImageArray(imageArray: Array<Image?>)
        //nullable = true from not(false or (false and false)) = true
{
    //var imageArray = imageArray
super.setImageArray(imageArray)
this.angleInfo!!.adjustAngle(0)
}


}
                
            

