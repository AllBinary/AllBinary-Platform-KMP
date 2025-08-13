
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.awt.image.BufferedImage

open public class ImageJ2SERotationUtil
            : Object
         {
        

        companion object {
            
    private val instance: ImageJ2SERotationUtil = ImageJ2SERotationUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ImageJ2SERotationUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private val imageUtil: ImageUtil = ImageUtil.getInstance()!!
            

    private val imageJ2SEUtil: ImageJ2SEUtil = ImageJ2SEUtil.getInstance()!!
            
private constructor        ()
            : super()
        {}


open fun getRotatedImage(bufferedImage: Image, totalAngle: Int)
        //nullable = true from not(false or (false and false)) = true
: BufferedImage{

                    var bufferedImage = bufferedImage


                    var totalAngle = totalAngle



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getRotatedImage(bufferedImage, TWO_PIE *totalAngle /360)
}


open fun getRotatedImage(bufferedImage: Image, radians: Double)
        //nullable = true from not(false or (false and false)) = true
: BufferedImage{

                    var bufferedImage = bufferedImage


                    var radians = radians

    var newBufferedImage: BufferedImage = this.imageUtil!!.create(bufferedImage!!.getWidth(
                            null), bufferedImage!!.getHeight(
                            null))!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getRotatedImage(bufferedImage, newBufferedImage, newBufferedImage!!.createGraphics(), radians)
}


open fun getRotatedImage(bufferedImage: Image, newBufferedImage: BufferedImage, g: Graphics2D, radians: Double)
        //nullable = true from not(false or (false and false)) = true
: BufferedImage{

                    var bufferedImage = bufferedImage


                    var newBufferedImage = newBufferedImage


                    var g = g


                    var radians = radians
g.rotate(radians, newBufferedImage!!.getWidth(
                            null) /2, newBufferedImage!!.getHeight(
                            null) /2)
g.drawImage(bufferedImage, 0, 0, bufferedImage!!.getWidth(
                            null), bufferedImage!!.getHeight(
                            null), 
                            null)
g.dispose()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newBufferedImage
}


    private val TWO_PIE: Double = 2 *Math.PI

open fun rotateImage(bufferedImage: Image, newBufferedImage: BufferedImage, totalAngle: Int)
        //nullable = true from not(false or (false and false)) = true
: BufferedImage{

                    var bufferedImage = bufferedImage


                    var newBufferedImage = newBufferedImage


                    var totalAngle = totalAngle

    var g: Graphics2D = newBufferedImage!!.createGraphics()!!
            

g.setBackground(imageJ2SEUtil!!.TRANSPARENT_COLOR)
g.clearRect(0, 0, newBufferedImage!!.getWidth(), newBufferedImage!!.getHeight())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getRotatedImage(bufferedImage, newBufferedImage, g, TWO_PIE *totalAngle /360)
}


open fun getRotatedImage(bufferedImage: Image, newBufferedImage: BufferedImage, totalAngle: Int)
        //nullable = true from not(false or (false and false)) = true
: BufferedImage{

                    var bufferedImage = bufferedImage


                    var newBufferedImage = newBufferedImage


                    var totalAngle = totalAngle

    var g: Graphics2D = newBufferedImage!!.createGraphics()!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getRotatedImage(bufferedImage, newBufferedImage, g, TWO_PIE *totalAngle /360)
}


open fun getRotatedImages(bufferedImage: Image, numberOfFrames: Int, totalAngle: Int)
        //nullable = true from not(false or (false and false)) = true
: Array<BufferedImage?>{

                    var bufferedImage = bufferedImage


                    var numberOfFrames = numberOfFrames


                    var totalAngle = totalAngle

    var bufferedImageArray: Array<BufferedImage?> = arrayOfNulls(numberOfFrames)


    var arc: Double = (TWO_PIE) *totalAngle /360


    var size: Int = bufferedImageArray!!.size
                





                        for (index in 0 until size)


        {
    var radians: Double = (arc /size) *index

bufferedImageArray[index]= this.getRotatedImage(bufferedImage, radians)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bufferedImageArray
}


open fun createSpriteImage(bufferedImageArray: Array<BufferedImage?>)
        //nullable = true from not(false or (false and false)) = true
: BufferedImage{

                    var bufferedImageArray = bufferedImageArray

    var columns: Int = 9


    var rows: Int = 0


    var size: Int = bufferedImageArray!!.size
                


    
                        if(size < columns)
                        
                                    {
                                    columns= size

                                    }
                                
rows= (size /columns)

    
                        if(size % columns != 0)
                        
                                    {
                                    rows++

                                    }
                                

    var firstBufferedImage: BufferedImage = bufferedImageArray[0]!!


    var bufferedImage: BufferedImage = this.imageUtil!!.create(firstBufferedImage!!.getWidth(
                            null) *columns, firstBufferedImage!!.getHeight(
                            null) *rows)!!
            


    var g: Graphics2D = bufferedImage!!.createGraphics()!!
            


    var columnIndex: Int = 0


    var rowIndex: Int = 0


    var nextBufferedImage: BufferedImage





                        for (index in 0 until size)


        {
    
                        if(index /9 != 0 && index % 9 == 0)
                        
                                    {
                                    rowIndex++
columnIndex= 0

                                    }
                                
nextBufferedImage= bufferedImageArray[index]!!
g.drawImage(nextBufferedImage, nextBufferedImage!!.getWidth(
                            null) *columnIndex, nextBufferedImage!!.getHeight(
                            null) *rowIndex, nextBufferedImage!!.getWidth(
                            null), nextBufferedImage!!.getHeight(
                            null), 
                            null)
columnIndex++
}

g.dispose()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bufferedImage
}


}
                
            

