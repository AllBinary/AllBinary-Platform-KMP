
        /*
                *  
                *  To change this license header, choose License Headers in Project Properties. 
                *  To change this template file, choose Tools | Templates  and open the template in the editor.  
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
import java.io.File
import java.io.IOException
import java.util.Iterator
import javax.imageio.IIOImage
import javax.imageio.ImageIO
import javax.imageio.ImageWriteParam
import javax.imageio.ImageWriter
import javax.imageio.stream.ImageOutputStream
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.AbFileOutputStream
import org.allbinary.logic.io.StreamUtil
import org.allbinary.logic.io.file.AbFile
import org.allbinary.string.CommonStrings
import org.apache.batik.ext.awt.image.codec.png.PNGImageWriter

open public class ImagePersistanceUtil
            : Object
         {
        

        companion object {
            
    private val instance: ImagePersistanceUtil = ImagePersistanceUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ImagePersistanceUtil{


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
            

                @Throws(Exception::class)
            
open fun saveWithBatik(file: AbFile, bufferedImage: BufferedImage)
        //nullable = true from not(false or (false and false)) = true
{

                    var file = file


                    var bufferedImage = bufferedImage

    var batikPNGImageWriter: PNGImageWriter = PNGImageWriter()


    var fileOutputStream: AbFileOutputStream = AbFileOutputStream(file)


        try {
            batikPNGImageWriter!!.writeImage(bufferedImage, fileOutputStream)

         finally {
            fileOutputStream!!.flush()
StreamUtil.getInstance()!!.close(fileOutputStream)

         }
        
logUtil!!.put("Wrote Image: " +file.getAbsolutePath(), this, commonStrings!!.SAVE)
}


open fun saveWithImageIO(filePath: String, bufferedImage: BufferedImage)
        //nullable = true from not(false or (false and false)) = true
{

                    var filePath = filePath


                    var bufferedImage = bufferedImage
saveWithImageIO(File(filePath), bufferedImage)
}


open fun saveWithImageIO(file: File, bufferedImage: BufferedImage)
        //nullable = true from not(false or (false and false)) = true
{

                    var file = file


                    var bufferedImage = bufferedImage

    var writer: ImageWriter = 
                null
            


    var ios: ImageOutputStream = 
                null
            


        try {
            
    var iter: Iterator = ImageIO.getImageWritersByFormatName(
                            "jpeg")!!
            


    
                        if(!iter.hasNext())
                        
                                    {
                                    logUtil!!.put(
                            "Unable to save image to jpeg file type.", this, commonStrings!!.SAVE)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
writer= iter.next() as ImageWriter
ios= ImageIO.createImageOutputStream(file)
writer.setOutput(ios)

    var iwp: ImageWriteParam = writer.getDefaultWriteParam()!!
            

iwp.setCompressionMode(ImageWriteParam.MODE_EXPLICIT)
iwp.setCompressionQuality(0.95f)
writer.write(
                            null, IIOImage(bufferedImage, 
                            null, 
                            null), iwp)
logUtil!!.put("Wrote Image: " +file.getAbsolutePath(), this, commonStrings!!.SAVE)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.SAVE, e)
}

         finally {
            
        try {
            
    
                        if(ios != 
                                    null
                                )
                        
                                    {
                                    ios.flush()

        try {
            
    
                        if(ios != 
                                    null
                                )
                        
                                    {
                                    logUtil!!.put(ios.toString(), ios, commonStrings!!.CLOSE)
ios.close()

                                    }
                                
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, ios, commonStrings!!.CLOSE, e)
}


                                    }
                                

    
                        if(writer != 
                                    null
                                )
                        
                                    {
                                    writer.dispose()

                                    }
                                
} catch(e2: IOException)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, this, commonStrings!!.SAVE, e2)
}


         }
        
}


}
                
            

