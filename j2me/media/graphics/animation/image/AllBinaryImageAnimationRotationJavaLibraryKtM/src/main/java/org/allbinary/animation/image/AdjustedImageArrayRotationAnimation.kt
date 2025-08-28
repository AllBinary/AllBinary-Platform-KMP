
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
        
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.Image
import org.allbinary.animation.AnimationBehavior
import org.allbinary.math.AngleFactory
import org.allbinary.math.AngleInfo

open public class AdjustedImageArrayRotationAnimation : ImageArrayRotationAnimation {
        

    private var dx: Int= 0

    private var dy: Int= 0
protected constructor        (anyType: Any, animationBehavior: AnimationBehavior)                        

                            : super(anyType, animationBehavior)

        Updates for KMP build        
        {
    //var anyType = anyType
    //var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    

    var allBinaryImageRotationAnimationInfo: ImageArrayRotationAnimationInfo = anyType as ImageArrayRotationAnimationInfo

this.init(allBinaryImageRotationAnimationInfo!!.getDx(), allBinaryImageRotationAnimationInfo!!.getDy())
}

public constructor        (imageArray: Array<Image?>, animationBehavior: AnimationBehavior)                        

                            : this(imageArray, AngleInfo.getInstance(10.toShort()), AngleFactory.getInstance()!!.TOTAL_ANGLE, 0, 0, animationBehavior)

        Updates for KMP build        
        {
    //var imageArray = imageArray
    //var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (imageArray: Array<Image?>, dx: Int, dy: Int, animationBehavior: AnimationBehavior)                        

                            : this(imageArray, AngleInfo.getInstance(10.toShort()), AngleFactory.getInstance()!!.TOTAL_ANGLE, dx, dy, animationBehavior)

        Updates for KMP build        
        {
    //var imageArray = imageArray
    //var dx = dx
    //var dy = dy
    //var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (imageArray: Array<Image?>, angleInfo: AngleInfo, dx: Int, dy: Int, animationBehavior: AnimationBehavior)                        

                            : this(imageArray, angleInfo, AngleFactory.getInstance()!!.TOTAL_ANGLE, dx, dy, animationBehavior)

        Updates for KMP build        
        {
    //var imageArray = imageArray
    //var angleInfo = angleInfo
    //var dx = dx
    //var dy = dy
    //var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (imageArray: Array<Image?>, angleInfo: AngleInfo, totalAngle: Int, dx: Int, dy: Int, animationBehavior: AnimationBehavior)                        

                            : super(imageArray, angleInfo, totalAngle, animationBehavior)

        Updates for KMP build        
        {
    //var imageArray = imageArray
    //var angleInfo = angleInfo
    //var totalAngle = totalAngle
    //var dx = dx
    //var dy = dy
    //var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.init(dx, dy)
}

public constructor        (imageArray: Array<Image?>, angleInfo: AngleInfo, totalAngle: Int, animationBehavior: AnimationBehavior)                        

                            : super(imageArray, angleInfo, totalAngle, animationBehavior)

        Updates for KMP build        
        {
    //var imageArray = imageArray
    //var angleInfo = angleInfo
    //var totalAngle = totalAngle
    //var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.init( -(imageArray[0]!!.getWidth() shr 2),  -(imageArray[0]!!.getHeight() shr 2))
}


                @Throws(Exception::class)
            
open fun init(dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var dx = dx
    //var dy = dy
this.setDx(dx)
this.setDy(dy)
}


open fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var graphics = graphics
    //var x = x
    //var y = y
super.paint(graphics, x +this.dx, y +this.dy)
}


open fun setDx(dx: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var dx = dx
this.dx= dx
}


open fun getDx()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return dx
}


open fun setDy(dy: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var dy = dy
this.dy= dy
}


open fun getDy()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return dy
}


}
                
            

