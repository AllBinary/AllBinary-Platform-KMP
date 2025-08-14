
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
import org.allbinary.math.AngleFactory
import org.allbinary.math.AngleInfo

open public class ImageArrayRotationAnimation : ImageArrayBaseRotationAnimation {
        

    private var expectedTotalFrames: Int= 0
protected constructor        (anyType: Any, animationBehavior: AnimationBehavior)                        

                            : super(
                                    (anyType as ImageArrayRotationAnimationInfo).getImageArray(), 
                                    (anyType as ImageArrayRotationAnimationInfo).getAngleInfoP(), animationBehavior){

                    var anyType = anyType


                    var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    

    var allBinaryImageRotationAnimationInfo: ImageArrayRotationAnimationInfo = anyType as ImageArrayRotationAnimationInfo

this.init(allBinaryImageRotationAnimationInfo!!.getImageArray(), allBinaryImageRotationAnimationInfo!!.getAngleInfoP(), allBinaryImageRotationAnimationInfo!!.getTotalAngle())
}

public constructor        (imageArray: Array<Image?>, angleInfo: AngleInfo, totalAngle: Int, animationBehavior: AnimationBehavior)                        

                            : super(imageArray, angleInfo, animationBehavior){

                    var imageArray = imageArray


                    var angleInfo = angleInfo


                    var totalAngle = totalAngle


                    var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.init(imageArray, angleInfo, totalAngle)
}

public constructor        (imageArray: Array<Image?>, animationBehavior: AnimationBehavior)                        

                            : this(imageArray, AngleInfo.getInstance(10.toShort()), AngleFactory.getInstance()!!.TOTAL_ANGLE, animationBehavior){

                    var imageArray = imageArray


                    var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (imageArray: Array<Image?>, angleInfo: AngleInfo, animationBehavior: AnimationBehavior)                        

                            : this(imageArray, angleInfo, AngleFactory.getInstance()!!.TOTAL_ANGLE, animationBehavior){

                    var imageArray = imageArray


                    var angleInfo = angleInfo


                    var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
open fun init(imageArray: Array<Image?>, angleInfo: AngleInfo, totalAngle: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var imageArray = imageArray


                    var angleInfo = angleInfo


                    var totalAngle = totalAngle
this.expectedTotalFrames= totalAngle /this.angleInfo!!.getAngleIncrementInfo()!!.getAngleIncrement()
this.angleInfo!!.adjustAngle(0)

    
                        if(expectedTotalFrames != this.getSize())
                        
                                    {
                                    


                            throw Exception(
                            "Wrong Number of Frames")

                                    }
                                
}


open fun setImageArray(imageArray: Array<Image?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var imageArray = imageArray
super.setImageArray(imageArray)
this.angleInfo!!.adjustAngle(0)
}


}
                
            

