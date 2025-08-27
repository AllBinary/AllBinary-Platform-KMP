
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
import java.awt.geom.AffineTransform
import java.awt.image.AffineTransformOp
import java.awt.image.BufferedImage
import org.allbinary.logic.communication.log.LogUtil

open public class MirrorImageUtil
            : Object
         {
        

        companion object {
            
    private val instance: MirrorImageUtil = MirrorImageUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: MirrorImageUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val imageUtil: ImageUtil = ImageUtil.getInstance()!!
private constructor        ()
            : super()
        {}


open fun getImage(bufferedImage: BufferedImage, verticle: Boolean, horizontal: Boolean)
        //nullable = true from not(false or (false and false)) = true
: BufferedImage{

                    var bufferedImage = bufferedImage


                    var verticle = verticle


                    var horizontal = horizontal
logUtil!!.put("Starting", this, "getImage")

    var newBufferedImage: BufferedImage = this.imageUtil!!.create(bufferedImage!!.getWidth(
                            null), bufferedImage!!.getHeight(
                            null))!!


    var g: Graphics2D = newBufferedImage!!.createGraphics()!!


    
                        if(verticle)
                        
                                    {
                                    
    var tx: AffineTransform = AffineTransform.getScaleInstance(1,  -1)!!

tx.translate(0,  -bufferedImage!!.getHeight(
                            null))

    var op: AffineTransformOp = AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR)

bufferedImage= op.filter(bufferedImage, 
                            null)

                                    }
                                

    
                        if(horizontal)
                        
                                    {
                                    
    var tx: AffineTransform = AffineTransform.getScaleInstance( -1, 1)!!

tx.translate( -bufferedImage!!.getWidth(
                            null), 0)

    var op: AffineTransformOp = AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR)

bufferedImage= op.filter(bufferedImage, 
                            null)

                                    }
                                
g.drawImage(bufferedImage, 0, 0, bufferedImage!!.getWidth(
                            null), bufferedImage!!.getHeight(
                            null), 
                            null)
g.dispose()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newBufferedImage
}


open fun getImages(bufferedImage: BufferedImage, verticle: Boolean, horizontal: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Array<BufferedImage?>{

                    var bufferedImage = bufferedImage


                    var verticle = verticle


                    var horizontal = horizontal

    var width: Int = bufferedImage!!.getWidth()!!


    var height: Int = bufferedImage!!.getHeight()!!


    var cellHeight: Int = height


    var cellWidth: Int = height


    var numberOfFramesPerOrientation: Int = width /cellWidth


    var numberOfFrames: Int = numberOfFramesPerOrientation


    
                        if(verticle)
                        numberOfFrames *= 2

    
                        if(horizontal)
                        numberOfFrames *= 2
logUtil!!.put("numberOfFramesPerOrientation: " +numberOfFramesPerOrientation +" numberOfFrames: " +numberOfFrames, this, "getImages")

    var bufferedImageArray: Array<BufferedImage?> = arrayOfNulls(numberOfFrames)


    var y: Int = 0





                        for (index in 0 until numberOfFramesPerOrientation)

        {
    var x: Int = index *cellWidth

bufferedImageArray[index]= bufferedImage!!.getSubimage(x, y, cellWidth, cellHeight)
}





                        for (index in 0 until numberOfFramesPerOrientation)

        {bufferedImageArray[index +numberOfFramesPerOrientation]= this.getImage(bufferedImageArray[index]!!, verticle, horizontal)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bufferedImageArray
}


}
                
            

