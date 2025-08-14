
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

open public class ImageUnifierUtil
            : Object
         {
        

        companion object {
            
    private val instance: ImageUnifierUtil = ImageUnifierUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ImageUnifierUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val imageUtil: ImageUtil = ImageUtil.getInstance()!!
            
private constructor        ()
            : super()
        {}


open fun getDefaultConfiguration()
        //nullable = true from not(false or (false and true)) = true
: GraphicsConfiguration{
    var ge: GraphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment()!!
            


    var gd: GraphicsDevice = ge.getDefaultScreenDevice()!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gd.getDefaultConfiguration()
}


open fun getImage(bufferedImageArray: Array<BufferedImage?>, imageUnifierProperties: ImageUnifierProperties)
        //nullable = true from not(false or (false and false)) = true
: BufferedImage{

                    var bufferedImageArray = bufferedImageArray


                    var imageUnifierProperties = imageUnifierProperties

    var newBufferedImage: BufferedImage = this.imageUtil!!.create(imageUnifierProperties!!.getWidth(), imageUnifierProperties!!.getHeight())!!
            


    var commonLabels: CommonLabels = CommonLabels.getInstance()!!
            

logUtil!!.put("Setting Image - " +commonLabels!!.WIDTH_LABEL +newBufferedImage!!.getWidth() +commonLabels!!.HEIGHT_LABEL +newBufferedImage!!.getHeight(), this, 
                            "getImage")

    var g: Graphics2D = newBufferedImage!!.createGraphics()!!
            


    var columnIndex: Int = 0


    var rowIndex: Int = 0





                        for (index in 0 until bufferedImageArray!!.size)


        {
    var x: Int = imageUnifierProperties!!.getImageUnifierCell()!!.getWidth()!!.toInt() *columnIndex++


    var y: Int = imageUnifierProperties!!.getImageUnifierCell()!!.getHeight()!!.toInt() *rowIndex

logUtil!!.put("Adding Image: " +index +" x: " +x +" y: " +y, this, 
                            "getImage")
g.drawImage(bufferedImageArray[index]!!, x, y, imageUnifierProperties!!.getImageUnifierCell()!!.getWidth()!!.toInt(), imageUnifierProperties!!.getImageUnifierCell()!!.getHeight()!!.toInt(), 
                            null)

    var totalColumnsMinusOne: Int = (imageUnifierProperties!!.getColumns()!!.toInt() -1)


    
                        if(columnIndex > totalColumnsMinusOne)
                        
                                    {
                                    rowIndex++
columnIndex= 0

                                    }
                                
}

g.dispose()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newBufferedImage
}


}
                
            

