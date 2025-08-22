
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
        package org.allbinary.media.image.analysis




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.awt.image.BufferedImage
import org.allbinary.graphics.color.ColorCacheFactory
import org.allbinary.graphics.color.ColorCacheable
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings

open public class ImageAnalysis
            : Object
         {
        

        companion object {
            
    private val instance: ImageAnalysis = ImageAnalysis()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ImageAnalysis{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


                @Throws(Exception::class)
            
open fun process(bufferedImage: BufferedImage, colorRangeInterface: ColorRangeInterface)
        //nullable = true from not(false or (false and false)) = true
: ImageAnalysisResults{

                    var bufferedImage = bufferedImage


                    var colorRangeInterface = colorRangeInterface

    var imageAnalysisResults: ImageAnalysisResults = ImageAnalysisResults()


    var redTotal: Long = 0


    var greenTotal: Long = 0


    var blueTotal: Long = 0





                        for (indexY in 0 until bufferedImage!!.getHeight()!!)


        {



                        for (indexX in 0 until bufferedImage!!.getWidth()!!)


        {
    var keyInteger: Integer = Integer(Integer.valueOf(bufferedImage!!.getRGB(indexX, indexY)))!!


    var colorCacheable: ColorCacheable = ColorCacheFactory.getInstance()!!.get(keyInteger) as ColorCacheable


    var color: Color = colorCacheable!!.getColor()!!

processColorRangeResults(imageAnalysisResults, colorRangeInterface, color)
processImageColorResults(imageAnalysisResults!!.getImageColorResults(), colorRangeInterface, color)
redTotal += color.getRed()
greenTotal += color.getGreen()
blueTotal += color.getBlue()
}

}


    var totalPixels: Long = imageAnalysisResults!!.getImageColorRangeResults()!!.getTotalPixelsChecked()!!


    var colorAverage: ColorAverage = imageAnalysisResults!!.getImageColorResults()!!.getColorAverage()!!

colorAverage!!.setAvgRed(redTotal.toFloat() /totalPixels)
colorAverage!!.setAvgGreen(greenTotal.toFloat() /totalPixels)
colorAverage!!.setAvgBlue(blueTotal.toFloat() /totalPixels)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return imageAnalysisResults
}


open fun processColorRangeResults(imageAnalysisResults: ImageAnalysisResults, colorRangeInterface: ColorRangeInterface, color: Color)
        //nullable = true from not(false or (false and false)) = true
{

                    var imageAnalysisResults = imageAnalysisResults


                    var colorRangeInterface = colorRangeInterface


                    var color = color

    
                        if(colorRangeInterface!!.isInRange(color))
                        
                                    {
                                    imageAnalysisResults!!.getImageColorRangeResults()!!.addMatchingPixelsChecked()

                                    }
                                
                        else {
                            
                        }
                            
imageAnalysisResults!!.getImageColorRangeResults()!!.addTotalPixelsChecked()
}


open fun processImageColorResults(imageColorResults: ImageColorResults, colorRangeInterface: ColorRangeInterface, color: Color)
        //nullable = true from not(false or (false and false)) = true
{

                    var imageColorResults = imageColorResults


                    var colorRangeInterface = colorRangeInterface


                    var color = color

    
                        if(color.getRed() < imageColorResults!!.getColorRange()!!.getMinRed())
                        
                                    {
                                    imageColorResults!!.getColorRange()!!.setMinRed(color.getRed())

                                    }
                                

    
                        if(color.getGreen() < imageColorResults!!.getColorRange()!!.getMinGreen())
                        
                                    {
                                    imageColorResults!!.getColorRange()!!.setMinGreen(color.getGreen())

                                    }
                                

    
                        if(color.getBlue() < imageColorResults!!.getColorRange()!!.getMinBlue())
                        
                                    {
                                    imageColorResults!!.getColorRange()!!.setMinBlue(color.getBlue())

                                    }
                                

    
                        if(color.getRed() > imageColorResults!!.getColorRange()!!.getMaxRed())
                        
                                    {
                                    imageColorResults!!.getColorRange()!!.setMaxRed(color.getRed())

                                    }
                                

    
                        if(color.getGreen() > imageColorResults!!.getColorRange()!!.getMaxGreen())
                        
                                    {
                                    imageColorResults!!.getColorRange()!!.setMaxGreen(color.getGreen())

                                    }
                                

    
                        if(color.getBlue() > imageColorResults!!.getColorRange()!!.getMaxBlue())
                        
                                    {
                                    imageColorResults!!.getColorRange()!!.setMaxBlue(color.getBlue())

                                    }
                                
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
private constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun process(bufferedImageArray: Array<BufferedImage?>, colorRangeInterface: ColorRangeInterface)
        //nullable = true from not(false or (false and false)) = true
: Array<ImageAnalysisResults?>{

                    var bufferedImageArray = bufferedImageArray


                    var colorRangeInterface = colorRangeInterface

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(CommonLabels.getInstance()!!.START +colorRangeInterface!!.toString(), this, commonStrings!!.PROCESS)

    var imageAnalysisResultsArray: Array<ImageAnalysisResults?> = arrayOfNulls(bufferedImageArray!!.size)





                        for (index in 0 until bufferedImageArray!!.size)


        {imageAnalysisResultsArray[index]= ImageAnalysis.process(bufferedImageArray[index]!!, colorRangeInterface)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return imageAnalysisResultsArray
}


}
                
            

