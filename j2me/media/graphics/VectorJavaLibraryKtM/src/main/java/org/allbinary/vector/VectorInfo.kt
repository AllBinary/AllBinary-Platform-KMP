
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
        package org.allbinary.vector




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class VectorInfo
            : Object
         {
        

    private var width: Int

    private var height: Int

    private var points: Array<IntArray?>

    private var totalFrames: Int
public constructor        (width: Int, height: Int, points: Array<IntArray?>, totalFrames: Int)
            : super()
        {
var width = width
var height = height
var points = points
var totalFrames = totalFrames
this.width= width
this.height= height
this.points= points
this.totalFrames= totalFrames
}


open fun getWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return width
}


open fun setWidth(width: Int)
        //nullable = true from not(false or (false and false)) = true
{
var width = width
this.width= width
}


open fun getHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return height
}


open fun setHeight(height: Int)
        //nullable = true from not(false or (false and false)) = true
{
var height = height
this.height= height
}


open fun getPoints()
        //nullable = true from not(false or (false and true)) = true
: Array<IntArray?>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return points
}


open fun setPoints(points: Array<IntArray?>)
        //nullable = true from not(false or (false and false)) = true
{
var points = points
this.points= points
}


open fun getTotalFrames()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return totalFrames
}


open fun setTotalFrames(totalFrames: Int)
        //nullable = true from not(false or (false and false)) = true
{
var totalFrames = totalFrames
this.totalFrames= totalFrames
}


}
                
            

