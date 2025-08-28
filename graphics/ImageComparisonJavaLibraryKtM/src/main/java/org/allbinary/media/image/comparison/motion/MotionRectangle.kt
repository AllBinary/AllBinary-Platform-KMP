
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




        import java.lang.Object        
        
        import java.lang.Cloneable
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.util.Vector

open public class MotionRectangle
            : Object
        
                , Cloneable {
        

    private var rectangle: Rectangle

    private var pixelDeltaVector: Vector
public constructor        (rectangle: Rectangle)
            : super()
        {
var rectangle = rectangle
this.setRectangle(rectangle)
this.setPixelDeltaVector(Vector())
}


open fun getRectangle()
        //nullable = true from not(false or (false and true)) = true
: Rectangle{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rectangle
}


open fun setRectangle(rectangle: Rectangle)
        //nullable = true from not(false or (false and false)) = true
{
var rectangle = rectangle
this.rectangle= rectangle
}


open fun getPixelDeltaVector()
        //nullable = true from not(false or (false and true)) = true
: Vector{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return pixelDeltaVector
}


open fun setPixelDeltaVector(pixelDeltaVector: Vector)
        //nullable = true from not(false or (false and false)) = true
{
var pixelDeltaVector = pixelDeltaVector
this.pixelDeltaVector= pixelDeltaVector
}

override fun clone()
        //nullable = true from not(false or (false and true)) = true
: Any{

    var motionRectangle: MotionRectangle = MotionRectangle(this.getRectangle()!!.clone() as Rectangle)

motionRectangle!!.setPixelDeltaVector(this.getPixelDeltaVector()!!.clone() as Vector)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return motionRectangle
}


}
                
            

