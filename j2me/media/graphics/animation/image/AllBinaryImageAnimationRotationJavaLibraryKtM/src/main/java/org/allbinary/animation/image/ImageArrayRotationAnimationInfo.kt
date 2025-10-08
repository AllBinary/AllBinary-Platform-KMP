
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
import org.allbinary.math.AngleInfo

open public class ImageArrayRotationAnimationInfo
            : Object
         {
        

    private var imageArray: Array<Image?>

    private var angleIncrement: Int

    private var totalAngle: Int

    private var dx: Int

    private var dy: Int
public constructor (imageArray: Array<Image?>, angleIncrement: Int, totalAngle: Int, dx: Int, dy: Int)
            : super()
        {
var imageArray = imageArray
var angleIncrement = angleIncrement
var totalAngle = totalAngle
var dx = dx
var dy = dy
this.imageArray= imageArray
this.angleIncrement= angleIncrement
this.totalAngle= totalAngle
this.dx= dx
this.dy= dy
}


    open fun setImageArray(imageArray: Array<Image?>)
        //nullable = true from not(false or (false and false)) = true
{
var imageArray = imageArray
this.imageArray= imageArray
}


    open fun getImageArray()
        //nullable = true from not(false or (false and true)) = true
: Array<Image?>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return imageArray
}


    open fun getAngleInfoP()
        //nullable = true from not(false or (false and true)) = true
: AngleInfo{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AngleInfo.getInstance(angleIncrement.toShort())
}


    open fun setTotalAngle(totalAngle: Int)
        //nullable = true from not(false or (false and false)) = true
{
var totalAngle = totalAngle
this.totalAngle= totalAngle
}


    open fun getTotalAngle()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return totalAngle
}


    open fun setDx(dx: Int)
        //nullable = true from not(false or (false and false)) = true
{
var dx = dx
this.dx= dx
}


    open fun getDx()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return dx
}


    open fun setDy(dy: Int)
        //nullable = true from not(false or (false and false)) = true
{
var dy = dy
this.dy= dy
}


    open fun getDy()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return dy
}


}
                
            

