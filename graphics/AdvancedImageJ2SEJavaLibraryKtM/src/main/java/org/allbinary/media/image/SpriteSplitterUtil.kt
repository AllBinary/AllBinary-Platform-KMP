
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
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings

open public class SpriteSplitterUtil
            : Object
         {
        

        companion object {


    private val instance: SpriteSplitterUtil = SpriteSplitterUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: SpriteSplitterUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonSeps: CommonSeps = CommonSeps.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    val ANIMATIONS_LABELS: Array<String?> = arrayOf("Row Total:","Column Total:","Column Total:","Row Total:","Column Total:","Row Total:")

    val DIRECTIONAL_ANIMATIONS: String = "Directional DLRU"

    val HORIZONTAL_ANIMATIONS: String = "Horizontal Animations"

    val HORIZONTAL_SPRITE: String = "Horizontal A=R=Y F=C=X"

    private val ROW_NAME: Array<String?> = arrayOf("idle","walk","attack","defeat")

    private val _ROW: String = "_row"

                @Throws(Exception::class)
            
open fun process(imageProcessorInput: ImageProcessorInput, totalFrames: Int, totalAnimations: Int, widthReduction: Int, heightReduction: Int, increaseWidth: Int, increaseHeight: Int, spriteType: String, visitor: ImageProcessedVisitor)
        //nullable = true from not(false or (false and false)) = true
{

                    var imageProcessorInput = imageProcessorInput


                    var totalFrames = totalFrames


                    var totalAnimations = totalAnimations


                    var widthReduction = widthReduction


                    var heightReduction = heightReduction


                    var increaseWidth = increaseWidth


                    var increaseHeight = increaseHeight


                    var spriteType = spriteType


                    var visitor = visitor

    var bufferedImage: BufferedImage


    var generatedBufferedImageArray: Array<Array<BufferedImage?>?>


    var bufferedImageArray: Array<BufferedImage?> = imageProcessorInput!!.getBufferedImageArray()!!
            





                        for (index in 0 until bufferedImageArray!!.size)


        {bufferedImage= bufferedImageArray[index]!!
logUtil!!.put(spriteType, this, commonStrings!!.RUN)

    
                        if(spriteType == HORIZONTAL_SPRITE)
                        
                                    {
                                    
    var cellHeight: Int = bufferedImage!!.getHeight() /totalAnimations


    var cellWidth: Int = bufferedImage!!.getWidth() /totalFrames


    var columns: Int = totalFrames


    var rows: Int = totalAnimations

generatedBufferedImageArray= arrayOfNulls(rows)
logUtil!!.put("Processing Individual Cells columns: " +columns +" rows: " +rows, this, commonStrings!!.RUN)
logUtil!!.put("Processing Individual Cells cellHeight: " +cellHeight +" cellWidth: " +cellWidth, this, commonStrings!!.RUN)

    var imageUtil: ImageUtil = ImageUtil.getInstance()!!
            


    var nameEnding: String = 
                null
            


    var x: Int = 0


    var y: Int = 0





                        for (index2 in 0 until rows)


        {y= cellHeight *index2




                        for (index3 in 0 until columns)


        {x= cellWidth *index3
generatedBufferedImageArray[index2]!![index3]= bufferedImage!!.getSubimage(x +widthReduction, y +heightReduction, cellWidth -(widthReduction *2), cellHeight -(heightReduction *2))

    
                        if(increaseWidth != 0 || increaseHeight != 0)
                        
                                    {
                                    generatedBufferedImageArray[index2]!![index3]= imageUtil!!.createBufferedImage(generatedBufferedImageArray[index2]!![index3]!!, cellWidth +increaseWidth, cellHeight +increaseHeight, false, true)

                                    }
                                
nameEnding= StringMaker().
                            append(index2)!!.append(commonSeps!!.UNDERSCORE)!!.append(index3)!!.toString()
visitor!!.visit(generatedBufferedImageArray[index2]!![index3]!!, nameEnding, index)
}

}

logUtil!!.put(
                            "Processing Rows from Cells", this, commonStrings!!.RUN)

    var imageUnifierProperties: ImageUnifierProperties = ImageUnifierProperties()

imageUnifierProperties!!.setRows(.valueOf())
imageUnifierProperties!!.setColumns(columns.valueOf())

    var imageUnifierCell: ImageUnifierCell = ImageUnifierCell(Integer.valueOf(cellWidth -(2 *widthReduction)), Integer.valueOf(cellHeight -(2 *heightReduction)))

imageUnifierProperties!!.setImageUnifierCell(imageUnifierCell)




                        for (index2 in 0 until rows)


        {y= cellHeight *index2

    var tempBufferedImageArray: Array<BufferedImage?> = arrayOfNulls(columns)





                        for (index3 in 0 until columns)


        {tempBufferedImageArray[index3]= generatedBufferedImageArray[index2]!![index3]!!
nameEnding= StringMaker().
                            append(index2)!!.append(commonSeps!!.UNDERSCORE)!!.append(1)!!.append(_ROW)!!.toString()
}


    var generatedBufferedImage: BufferedImage = ImageUnifierUtil.getInstance()!!.getImage(tempBufferedImageArray, imageUnifierProperties)!!
            

visitor!!.visit(generatedBufferedImage, nameEnding, index)
}


                                    }
                                
                             else 
    
                        if(spriteType == HORIZONTAL_ANIMATIONS)
                        
                                    {
                                    
                                    }
                                
                             else 
    
                        if(spriteType == this.DIRECTIONAL_ANIMATIONS)
                        
                                    {
                                    
    var totalFrames2: Int = 4


    var cellHeight: Int = bufferedImage!!.getHeight() /totalFrames2


    var cellWidth: Int = bufferedImage!!.getWidth() /totalAnimations


    var columns: Int = totalAnimations


    var rows: Int = totalFrames2

generatedBufferedImageArray= arrayOfNulls(rows)
logUtil!!.put(
                            "Processing Individual Cells for each Direction", this, commonStrings!!.RUN)

    var nameEnding: String = 
                null
            


    var x: Int = 0


    var y: Int = 0





                        for (index2 in 0 until rows)


        {y= cellHeight *index2




                        for (index3 in 0 until columns)


        {x= cellWidth *index3
generatedBufferedImageArray[index2]!![index3]= bufferedImage!!.getSubimage(x +widthReduction, y +heightReduction, cellWidth -(widthReduction *2), cellHeight -(heightReduction *2))

    
                        if(increaseWidth != 0 || increaseHeight != 0)
                        
                                    {
                                    generatedBufferedImageArray[index2]!![index3]= ImageUtil.getInstance()!!.createBufferedImage(generatedBufferedImageArray[index2]!![index3]!!, cellWidth +increaseWidth, cellHeight +increaseHeight, false, true)

                                    }
                                
nameEnding= StringMaker().
                            append(this.commonStrings!!.DIRECTION_NAME[index2]!!)!!.append(commonSeps!!.UNDERSCORE)!!.append(index3)!!.toString()
visitor!!.visit(generatedBufferedImageArray[index2]!![index3]!!, nameEnding, index)
}

}


    var imageUnifierProperties: ImageUnifierProperties = ImageUnifierProperties()

imageUnifierProperties!!.setRows(.valueOf())
imageUnifierProperties!!.setColumns(columns.valueOf())

    var imageUnifierCell: ImageUnifierCell = ImageUnifierCell(Integer.valueOf(cellWidth -(2 *widthReduction)) +increaseWidth, Integer.valueOf(cellHeight -(2 *heightReduction) +increaseHeight))

imageUnifierProperties!!.setImageUnifierCell(imageUnifierCell)
logUtil!!.put(
                            "Processing Rows from Cells for each Direction", this, commonStrings!!.RUN)




                        for (index2 in 0 until rows)


        {y= cellHeight *index2

    var tempBufferedImageArray: Array<BufferedImage?> = arrayOfNulls(columns)





                        for (index3 in 0 until columns)


        {tempBufferedImageArray[index3]= generatedBufferedImageArray[index2]!![index3]!!
nameEnding= StringMaker().
                            append(this.commonStrings!!.DIRECTION_NAME[index2]!!)!!.append(commonSeps!!.UNDERSCORE)!!.append(1)!!.append(_ROW)!!.toString()
}


    var generatedBufferedImage: BufferedImage = ImageUnifierUtil.getInstance()!!.getImage(tempBufferedImageArray, imageUnifierProperties)!!
            

visitor!!.visit(generatedBufferedImage, nameEnding, index)
}


                                    }
                                
}

}


}
                
            

