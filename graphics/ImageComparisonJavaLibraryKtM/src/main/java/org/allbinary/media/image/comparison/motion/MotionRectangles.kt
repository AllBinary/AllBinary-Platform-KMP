
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
        package org.allbinary.media.image.comparison.motion



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.media.image.comparison.ImageComparisonResult

open public class MotionRectangles
            : Object
         {
        

    private val name: String

    private var rectangleVector: Vector

    private var imageComparisonResult: ImageComparisonResult

    val MAX_PIXEL_DISTANCE_THRESHOLD: Int = 2
public constructor        (name: String, imageComparisonResult: ImageComparisonResult)
            : super()
        {

                    var name = name


                    var imageComparisonResult = imageComparisonResult
this.name= name
this.setImageComparisonResult(imageComparisonResult)
this.setVector(Vector())
}


open fun getVector()
        //nullable = true from not(false or (false and true)) = true
: Vector{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rectangleVector
}


open fun setVector(rectangleVector: Vector)
        //nullable = true from not(false or (false and false)) = true
{

                    var rectangleVector = rectangleVector
this.rectangleVector= rectangleVector
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}


open fun getImageComparisonResult()
        //nullable = true from not(false or (false and true)) = true
: ImageComparisonResult{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return imageComparisonResult
}


open fun setImageComparisonResult(imageComparisonResult: ImageComparisonResult)
        //nullable = true from not(false or (false and false)) = true
{

                    var imageComparisonResult = imageComparisonResult
this.imageComparisonResult= imageComparisonResult
}


}
                
            

