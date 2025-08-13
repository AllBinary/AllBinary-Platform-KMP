
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.image.BufferedImage
import java.io.IOException
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil

open public class CanvasTrimUtil
            : Object
         {
        

        companion object {
            
    private val instance: CanvasTrimUtil = CanvasTrimUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CanvasTrimUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val stringUtil: StringUtil = StringUtil.getInstance()!!
            

                @Throws(IOException::class)
            
open fun process(imageProcessorInput: ImageProcessorInput, cutCanvasFromLeftReduction: Int, cutCanvasFromTopReduction: Int, cutCanvasFromRightReduction: Int, cutCanvasFromBottomReduction: Int, visitor: ImageProcessedVisitor)
        //nullable = true from not(false or (false and false)) = true
{

                    var imageProcessorInput = imageProcessorInput


                    var cutCanvasFromLeftReduction = cutCanvasFromLeftReduction


                    var cutCanvasFromTopReduction = cutCanvasFromTopReduction


                    var cutCanvasFromRightReduction = cutCanvasFromRightReduction


                    var cutCanvasFromBottomReduction = cutCanvasFromBottomReduction


                    var visitor = visitor

    var bufferedImageArray: Array<BufferedImage?> = imageProcessorInput!!.getBufferedImageArray()!!
            


    var subBufferedImageArray: Array<BufferedImage?> = arrayOfNulls(bufferedImageArray!!.size)


    var size: Int = bufferedImageArray!!.size
                


    var bufferedImage: BufferedImage





                        for (index in 0 until size)


        {bufferedImage= bufferedImageArray[index]!!
subBufferedImageArray[index]= bufferedImage!!.getSubimage(cutCanvasFromLeftReduction, cutCanvasFromTopReduction, bufferedImage!!.getWidth() -cutCanvasFromLeftReduction -cutCanvasFromRightReduction, bufferedImage!!.getHeight() -cutCanvasFromTopReduction -cutCanvasFromBottomReduction)
visitor.visit(subBufferedImageArray[index]!!, stringUtil!!.EMPTY_STRING, index)
}

}


}
                
            

