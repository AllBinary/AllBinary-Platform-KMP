
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.media.image




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.image.BufferedImage
import java.io.IOException
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class ImageArrayRotationUtil
            : Object
         {
        

        companion object {
            
    private val instance: ImageArrayRotationUtil = ImageArrayRotationUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ImageArrayRotationUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val TOTAL_ANGLE: String = "totalAngle: "

                @Throws(IOException::class)
            
open fun process(imageProcessorInput: ImageProcessorInput, input: String, visitor: ImageProcessedVisitor)
        //nullable = true from not(false or (false and false)) = true
{
    //var imageProcessorInput = imageProcessorInput
    //var input = input
    //var visitor = visitor

    var totalAngle: Integer


    
                        if(input == this.commonStrings!!.UP)
                        
                                    {
                                    totalAngle= Integer(Integer.valueOf( -90))

                                    }
                                
                             else 
    
                        if(input == this.commonStrings!!.DOWN)
                        
                                    {
                                    totalAngle= Integer(Integer.valueOf(90))

                                    }
                                
                        else {
                            totalAngle= Integer(Integer.valueOf(input))

                        }
                            

    var generatedBufferedImage: BufferedImage


    var bufferedImageArray: Array<BufferedImage?> = imageProcessorInput!!.getBufferedImageArray()!!





                        for (index in 0 until bufferedImageArray!!.size)

        {
logUtil!!.put(TOTAL_ANGLE +totalAngle, this, commonStrings!!.RUN)
generatedBufferedImage= ImageJ2SERotationUtil.getInstance()!!.getRotatedImage(bufferedImageArray[index]!!, totalAngle!!.toInt())
visitor.visit(generatedBufferedImage, input, index)
}

}


}
                
            

