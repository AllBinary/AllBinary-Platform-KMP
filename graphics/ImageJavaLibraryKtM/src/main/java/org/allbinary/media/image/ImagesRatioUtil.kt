
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
        package org.allbinary.media.image




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.awt.image.BufferedImage
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonLabels

open public class ImagesRatioUtil
            : Object
         {
        

        companion object {
            
    private val instance: ImagesRatioUtil = ImagesRatioUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ImagesRatioUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            
private constructor        ()
            : super()
        {}


    private val imageUtil: ImageUtil = ImageUtil.getInstance()!!
            

open fun isEqual(bufferedImageArray: Array<BufferedImage?>, totalImages: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var bufferedImageArray = bufferedImageArray


                    var totalImages = totalImages

    var end: Int = totalImages


    
                        if(bufferedImageArray!!.size < totalImages)
                        end= bufferedImageArray!!.size

    var ratio: Double = (bufferedImageArray[0]!!.getWidth().toDouble() /bufferedImageArray[0]!!.getHeight())





                        for (index in 1 until end)


        {
    
                        if(ratio != (bufferedImageArray[index]!!.getWidth().toDouble() /bufferedImageArray[index]!!.getHeight()))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


open fun getAverage(bufferedImageArray: Array<BufferedImage?>, totalImages: Int)
        //nullable = true from not(false or (false and false)) = true
: Double{

                    var bufferedImageArray = bufferedImageArray


                    var totalImages = totalImages

    var ratio: Double = 0


    var end: Int = totalImages


    
                        if(bufferedImageArray!!.size < totalImages)
                        end= bufferedImageArray!!.size




                        for (index in 0 until end)


        {ratio += (bufferedImageArray[index]!!.getWidth().toDouble() /bufferedImageArray[index]!!.getHeight())
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return (ratio.toDouble() /end)
}


                @Throws(Exception::class)
            
open fun fudge(bufferedImage: BufferedImage, ratio: Double)
        //nullable = true from not(false or (false and false)) = true
: BufferedImage{

                    var bufferedImage = bufferedImage


                    var ratio = ratio

    var imageRatio: Double = (bufferedImage!!.getWidth().toDouble() /bufferedImage!!.getHeight())


    var point: Point = Point()


    var newHeight: Int = bufferedImage!!.getHeight()!!
            


    var newWidth: Int = bufferedImage!!.getWidth()!!
            


    
                        if(ratio > imageRatio)
                        
                                    {
                                    newWidth= (bufferedImage!!.getHeight().toDouble() *ratio).toInt()
point.x= (newWidth -bufferedImage!!.getWidth()) /2

                                    }
                                
                        else {
                            newHeight= (bufferedImage!!.getWidth().toDouble() /ratio).toInt()
point.y= (newHeight -bufferedImage!!.getHeight()) /2

                        }
                            

    var commonLabels: CommonLabels = CommonLabels.getInstance()!!
            

logUtil!!.put(commonLabels!!.WIDTH_LABEL +bufferedImage!!.getWidth() +" newWidth: " +newWidth +commonLabels!!.HEIGHT_LABEL +bufferedImage!!.getHeight() +" newHeight: " +newHeight +" needed ratio: " +(newWidth.toDouble() /newHeight), this, 
                            "fudge")

    var newBufferedImage: BufferedImage = this.imageUtil!!.create(newWidth, newHeight)!!
            


    var g: Graphics2D = newBufferedImage!!.createGraphics()!!
            


    
                        if(point.x > 0)
                        
                                    {
                                    
    var firstColumnBufferedImage: BufferedImage = bufferedImage!!.getSubimage(0, 0, 1, bufferedImage!!.getHeight())!!
            


    var lastColumnBufferedImage: BufferedImage = bufferedImage!!.getSubimage(bufferedImage!!.getWidth() -1, 0, 1, bufferedImage!!.getHeight())!!
            

logUtil!!.put(
                            "Draw some columns to fill in gap", this, 
                            "fudge")




                        for (index in 0 until point.x)


        {g.drawImage(firstColumnBufferedImage, index, 0, 
                            null)
g.drawImage(lastColumnBufferedImage, newWidth -index, 0, 
                            null)
}


                                    }
                                

    
                        if(point.y > 0)
                        
                                    {
                                    
    var firstRowBufferedImage: BufferedImage = bufferedImage!!.getSubimage(0, 0, bufferedImage!!.getWidth(), 1)!!
            


    var lastRowBufferedImage: BufferedImage = bufferedImage!!.getSubimage(0, bufferedImage!!.getHeight() -1, bufferedImage!!.getWidth(), 1)!!
            

logUtil!!.put(
                            "Draw some rows to fill in gap", this, 
                            "fudge")




                        for (index in 0 until point.y)


        {g.drawImage(firstRowBufferedImage, 0, index, 
                            null)
g.drawImage(lastRowBufferedImage, 0, newHeight -index, 
                            null)
}


                                    }
                                
g.drawImage(bufferedImage, point.x, point.y, bufferedImage!!.getWidth(), bufferedImage!!.getHeight(), 
                            null)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newBufferedImage
}


                @Throws(Exception::class)
            
open fun fudge(bufferedImageArray: Array<BufferedImage?>, totalImages: Int, ratio: Double)
        //nullable = true from not(false or (false and false)) = true
: Array<BufferedImage?>{

                    var bufferedImageArray = bufferedImageArray


                    var totalImages = totalImages


                    var ratio = ratio

    var end: Int = totalImages


    
                        if(bufferedImageArray!!.size < totalImages)
                        end= bufferedImageArray!!.size

    var fudgedBufferedImageArray: Array<BufferedImage?> = arrayOfNulls(end)





                        for (index in 0 until end)


        {fudgedBufferedImageArray[index]= fudge(bufferedImageArray[index]!!, ratio)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return fudgedBufferedImageArray
}


}
                
            

