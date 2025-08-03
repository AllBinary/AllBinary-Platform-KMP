
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
        
import java.awt
import java.util.Vector
import org.allbinary.media.image.comparison.ImageComparisonResult
import org.allbinary.media.image.comparison.pixel.PixelDelta

open public class AllMotionRectangles : MotionRectangles {
        

        companion object {


    private val NAME: String = "allMotionRectangles_"


        }
            public constructor        (imageComparisonResult: ImageComparisonResult)                        

                            : super(NAME, imageComparisonResult){

                    var imageComparisonResult = imageComparisonResult


                            //For kotlin this is before the body of the constructor.
                    
createMotionRectangles(imageComparisonResult)
}


                @Throws(Exception::class)
            
open fun createMotionRectangles(imageComparisonInfo: ImageComparisonResult)
        //nullable = true from not(false or (false and false)) = true
{

                    var imageComparisonInfo = imageComparisonInfo

    var vector: Vector = imageComparisonInfo!!.getNonMatchingPixelVector()!!
            


    var size: Int = vector!!.size!!
            





                        for (index in 0 until size)


        {
    var pixelDelta: PixelDelta = vector!!.get(index) as PixelDelta

addPixelDeltaToAMotionRectangle(pixelDelta)
}

}


                @Throws(Exception::class)
            
open fun addPixelDeltaToExistingMotionRectangle(pixelDelta: PixelDelta)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var pixelDelta = pixelDelta

    var vector: Vector = this.getVector()!!
            


    var size: Int = vector!!.size!!
            





                        for (index in 0 until size)


        {
    var motionRectangle: MotionRectangle = vector!!.get(index) as MotionRectangle


    
                        if(shouldPixelDeltaPartOfMotionRectangle(motionRectangle, pixelDelta))
                        
                                    {
                                    
    var newWidth: Int = pixelDelta!!.getPoint()!!.getX() -motionRectangle!!.getRectangle()!!.x


    var newHeight: Int = pixelDelta!!.getPoint()!!.getY() -motionRectangle!!.getRectangle()!!.y


    
                        if(newWidth < motionRectangle!!.getRectangle()!!.width)
                        
                                    {
                                    newWidth= motionRectangle!!.getRectangle()!!.width

                                    }
                                

    
                        if(newHeight < motionRectangle!!.getRectangle()!!.height)
                        
                                    {
                                    newHeight= motionRectangle!!.getRectangle()!!.height

                                    }
                                
motionRectangle!!.getRectangle()!!.setSize(newWidth, newHeight)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
open fun addPixelDeltaToAMotionRectangle(pixelDelta: PixelDelta)
        //nullable = true from not(false or (false and false)) = true
{

                    var pixelDelta = pixelDelta

    
                        if(!addPixelDeltaToExistingMotionRectangle(pixelDelta))
                        
                                    {
                                    
    var newRectangle: Rectangle = Rectangle(pixelDelta!!.getPoint()!!.getX(), pixelDelta!!.getPoint()!!.getY(), 1, 1)


    var motionRectangle: MotionRectangle = MotionRectangle(newRectangle)

motionRectangle!!.getPixelDeltaVector()!!.add(pixelDelta)
this.getVector()!!.add(motionRectangle)

                                    }
                                
}


                @Throws(Exception::class)
            
open fun shouldPixelDeltaPartOfMotionRectangle(motionRectangle: MotionRectangle, pixelDelta: PixelDelta)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var motionRectangle = motionRectangle


                    var pixelDelta = pixelDelta

    var isPixelLeftOfTheRectangle: Boolean = false


    
                        if(motionRectangle!!.getRectangle()!!.y > pixelDelta!!.getPoint()!!.getY())
                        
                                    {
                                    


                            throw Exception(
                            "PixelAboveTheRectangle")

                                    }
                                

    
                        if(motionRectangle!!.getRectangle()!!.x > pixelDelta!!.getPoint()!!.getX())
                        
                                    {
                                    isPixelLeftOfTheRectangle= true

                                    }
                                

    
                        if(!isPixelLeftOfTheRectangle)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return isPixelDeltaLikelyPartOfMotionRectangle(motionRectangle, pixelDelta)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
open fun isPixelDeltaLikelyPartOfMotionRectangle(motionRectangle: MotionRectangle, pixelDelta: PixelDelta)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var motionRectangle = motionRectangle


                    var pixelDelta = pixelDelta

    var maxX: Int = motionRectangle!!.getRectangle()!!.x +motionRectangle!!.getRectangle()!!.width


    var maxY: Int = motionRectangle!!.getRectangle()!!.y +motionRectangle!!.getRectangle()!!.height


    var horizontalDistance: Int = pixelDelta!!.getPoint()!!.getX() -maxX


    var verticalDistance: Int = pixelDelta!!.getPoint()!!.getY() -maxY


    
                        if(horizontalDistance < MAX_PIXEL_DISTANCE_THRESHOLD && verticalDistance < MAX_PIXEL_DISTANCE_THRESHOLD)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

