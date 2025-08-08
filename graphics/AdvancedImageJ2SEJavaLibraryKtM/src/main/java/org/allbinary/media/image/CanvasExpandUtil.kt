
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
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil

open public class CanvasExpandUtil
            : Object
         {
        

        companion object {


    private val instance: CanvasExpandUtil = CanvasExpandUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CanvasExpandUtil{


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
            

                @Throws(Exception::class)
            
open fun process(imageProcessorInput: ImageProcessorInput, increaseX: Int, increaseY: Int, visitor: ImageProcessedVisitor)
        //nullable = true from not(false or (false and false)) = true
{

                    var imageProcessorInput = imageProcessorInput


                    var increaseX = increaseX


                    var increaseY = increaseY


                    var visitor = visitor

    var imageUtil: ImageUtil = ImageUtil.getInstance()!!
            


    var bufferedImageArray: Array<BufferedImage?> = imageProcessorInput!!.getBufferedImageArray()!!
            


    var subBufferedImageArray: Array<BufferedImage?> = arrayOfNulls(bufferedImageArray!!.size)


    var size: Int = bufferedImageArray!!.size
                


    var bufferedImage: BufferedImage





                        for (index in 0 until size)


        {bufferedImage= bufferedImageArray[index]!!
subBufferedImageArray[index]= imageUtil!!.createBufferedImage(bufferedImage, bufferedImage!!.getWidth() +increaseX, bufferedImage!!.getHeight() +increaseY, false)
visitor.visit(subBufferedImageArray[index]!!, stringUtil!!.EMPTY_STRING, index)
}

}


}
                
            

