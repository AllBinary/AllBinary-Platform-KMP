
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
        
companion object {
            
                @Throws(Exception::class)
            
    open fun createAdjustedImageArrayRotationAnimationInfo(anyType: Any, animationBehavior: AnimationBehavior)
        //nullable = true from not(false or (false and false)) = true
: AdjustedImageArrayRotationAnimation{
    //var anyType = anyType
    //var animationBehavior = animationBehavior

    var imageRotationAnimationInfo: ImageArrayRotationAnimationInfo = anyType as ImageArrayRotationAnimationInfo




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AdjustedImageArrayRotationAnimation(imageRotationAnimationInfo!!.getImageArray(), imageRotationAnimationInfo!!.getAngleInfoP(), imageRotationAnimationInfo!!.getTotalAngle(), imageRotationAnimationInfo!!.getDx(), imageRotationAnimationInfo!!.getDy(), animationBehavior)
}


                @Throws(Exception::class)
            
    open fun create(imageArray: Array<Image?>, angleInfo: AngleInfo, totalAngle: Int, animationBehavior: AnimationBehavior)
        //nullable = true from not(false or (false and false)) = true
: AdjustedImageArrayRotationAnimation{
    //var imageArray = imageArray
    //var angleInfo = angleInfo
    //var totalAngle = totalAngle
    //var animationBehavior = animationBehavior



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AdjustedImageArrayRotationAnimation(imageArray, angleInfo, totalAngle,  -(imageArray[0]!!.getWidth() shr 2),  -(imageArray[0]!!.getHeight() shr 2), animationBehavior)
}


        }
            
    private var dx: Int= 0

    private var dy: Int= 0
public constructor (imageArray: Array<Image?>, angleInfo: AngleInfo, totalAngle: Int, dx: Int, dy: Int, animationBehavior: AnimationBehavior)                        

                            : super(imageArray, angleInfo, totalAngle, animationBehavior){
    //var imageArray = imageArray
    //var angleInfo = angleInfo
    //var totalAngle = totalAngle
    //var dx = dx
    //var dy = dy
    //var animationBehavior = animationBehavior


                            //For kotlin this is before the body of the constructor.
                    
this.init(dx, dy)
}


                @Throws(Exception::class)
            
    open fun init(dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var dx = dx
    //var dy = dy
this.setDx(dx)
this.setDy(dy)
}


    override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
    //var x = x
    //var y = y
super.paint(graphics, x +this.dx, y +this.dy)
}


    override fun setDx(dx: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var dx = dx
this.dx= dx
}


    override fun getDx()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return dx
}


    override fun setDy(dy: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var dy = dy
this.dy= dy
}


    override fun getDy()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return dy
}


}
                
            

