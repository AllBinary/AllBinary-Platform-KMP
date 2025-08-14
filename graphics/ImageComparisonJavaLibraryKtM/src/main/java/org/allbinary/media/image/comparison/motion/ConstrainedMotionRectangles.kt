
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.awt.image.BufferedImage
import java.util.Vector
import org.allbinary.logic.communication.log.LogUtil

open public class ConstrainedMotionRectangles : MotionRectangles {
        

        companion object {
            
    private val NAME: String = "constrainedMotionRectangles_"

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var motionRectangleConstraintsInterface: MotionRectangleConstraintsInterface
public constructor        (motionRectangleConstraintsInterface: MotionRectangleConstraintsInterface, motionRectangles: MotionRectangles)                        

                            : super(NAME, motionRectangles!!.getImageComparisonResult()){

                    var motionRectangleConstraintsInterface = motionRectangleConstraintsInterface


                    var motionRectangles = motionRectangles


                            //For kotlin this is before the body of the constructor.
                    
this.setMotionRectangleConstraintsInterface(motionRectangleConstraintsInterface)
}


                @Throws(Exception::class)
            
open fun applyMotionRectangleConstraints(motionRectangles: MotionRectangles)
        //nullable = true from not(false or (false and false)) = true
{

                    var motionRectangles = motionRectangles
logUtil!!.put("Start - Size Before: " +motionRectangles!!.getVector()!!.size(), this, 
                            "applyMotionRectangleConstraints")

    var bufferedImageArray: Array<BufferedImage?> = motionRectangles!!.getImageComparisonResult()!!.getBufferedImages()!!
            


    var bufferedImage: BufferedImage = bufferedImageArray[1]!!


    var vector: Vector = Vector()


    var vector2: Vector = motionRectangles!!.getVector()!!
            


    var size: Int = vector2.size!!
            





                        for (index in 0 until size)


        {
    var motionRectangle: MotionRectangle = vector2.get(index) as MotionRectangle


    var rectangle: Rectangle = motionRectangle!!.getRectangle()!!
            


    var isTooSmall: Boolean = this.getMotionRectangleConstraintsInterface()!!.isTooSmall(rectangle)!!
            


    
                        if(isTooSmall)
                        
                                    {
                                    

                        continue
                    

                                    }
                                

    var isAreaTooSmall: Boolean = this.getMotionRectangleConstraintsInterface()!!.isAreaTooSmall(rectangle)!!
            


    
                        if(isAreaTooSmall)
                        
                                    {
                                    

                        continue
                    

                                    }
                                

    var isTooBig: Boolean = this.getMotionRectangleConstraintsInterface()!!.isTooBig(rectangle)!!
            


    
                        if(isTooBig)
                        
                                    {
                                    

                        continue
                    

                                    }
                                

    var isValid: Boolean = this.getMotionRectangleConstraintsInterface()!!.isValid(this.getImageComparisonResult()!!.getFrameTwo(), bufferedImage, motionRectangle!!.getRectangle())!!
            


    
                        if(!isValid)
                        
                                    {
                                    

                        continue
                    

                                    }
                                

    
                        if(!isTooSmall && !isAreaTooSmall && !isTooBig && isValid)
                        vector.add(motionRectangle)
}

this.setVector(vector)
}


open fun getMotionRectangleConstraintsInterface()
        //nullable = true from not(false or (false and true)) = true
: MotionRectangleConstraintsInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return motionRectangleConstraintsInterface
}


open fun setMotionRectangleConstraintsInterface(motionRectangleConstraintsInterface: MotionRectangleConstraintsInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var motionRectangleConstraintsInterface = motionRectangleConstraintsInterface
this.motionRectangleConstraintsInterface= motionRectangleConstraintsInterface
}


}
                
            

