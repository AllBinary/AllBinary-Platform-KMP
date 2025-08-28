
        /* Generated Code Do Not Modify */
        package org.allbinary.logic.visual.media




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.image.BufferedImage
import java.awt.image.RenderedImage
import java.util.HashMap
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory
import org.allbinary.logic.communication.log.config.type.LogConfigTypes
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.string.StringMaker
import org.allbinary.media.image.ImageUtil
import org.allbinary.string.CommonLabels

open public class MediaUtil
            : Object
         {
        

        companion object {
            
    private val instance: MediaUtil = MediaUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: MediaUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


open fun getImageBufferPropertyHashMap(bufferedImage: BufferedImage)
        //nullable = true from not(false or (false and false)) = true
: HashMap<Any, Any>{
    //var bufferedImage = bufferedImage

    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()


    var propertyStringArray: Array<String?> = bufferedImage!!.getPropertyNames()!!


    
                        if(propertyStringArray != 
                                    null
                                )
                        
                                    {
                                    



                        for (index in 0 until propertyStringArray!!.size)

        {

    var propertyObject: Any = bufferedImage!!.getProperty(propertyStringArray[index]!!)!!

hashMap!!.put(propertyStringArray[index]!!, propertyObject!!.toString())
}


                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
private constructor        ()
            : super()
        {
}


                @Throws(Exception::class)
            
open fun saveImageFile(originalImageFile: AbFile, newImageFileName: String, category: String, mediaData: MediaData, newWidth: Int, newHeight: Int)
        //nullable = true from not(false or (false and false)) = true
{
var originalImageFile = originalImageFile
var newImageFileName = newImageFileName
var category = category
var mediaData = mediaData
var newWidth = newWidth
var newHeight = newHeight

    
                        if(originalImageFile == 
                                    null
                                 || !originalImageFile!!.isFile())
                        
                                    {
                                    


                            throw Exception("Original Image File Does Not Exist.")

                                    }
                                

    var bufferedImage: BufferedImage = ImageIOUtil.read(originalImageFile)!!


    
                        if(bufferedImage == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception("Unable to find ImageReader for this file.")

                                    }
                                

    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var hashMap: HashMap<Any, Any> = this.getImageBufferPropertyHashMap(bufferedImage)!!

logUtil!!.put("Image Properties: " +hashMap!!.toString(), this, "saveImageFile()")

                                    }
                                

    var imageFile: AbFile = AbFile(category +newImageFileName)

imageFile!!.createNewFile()

    var imageUtil: ImageUtil = ImageUtil.getInstance()!!


    var newBufferedImage: BufferedImage = imageUtil!!.createBufferedImage(bufferedImage, newWidth, newHeight)!!


    var isWritten: Boolean = ImageIOUtil.write(newBufferedImage as RenderedImage, mediaData!!.getName(), imageFile)!!


    
                        if(!isWritten)
                        
                                    {
                                    


                            throw Exception("Unable to write.")

                                    }
                                

    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var commonLabels: CommonLabels = CommonLabels.getInstance()!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Get Path: ")
stringBuffer!!.append(originalImageFile!!.getPath())
stringBuffer!!.append("\nNewImageFileName: ")
stringBuffer!!.append(newImageFileName)
stringBuffer!!.append("\nCategory: ")
stringBuffer!!.append(category)
stringBuffer!!.append("\nSave File Type: ")
stringBuffer!!.append(mediaData!!.getName())
stringBuffer!!.append("\nNew")!!.append(commonLabels!!.WIDTH_LABEL)
stringBuffer!!.append(newWidth)
stringBuffer!!.append("\nNew")!!.append(commonLabels!!.HEIGHT_LABEL)
stringBuffer!!.append(newHeight)
stringBuffer!!.append("\nFile Length: ")
stringBuffer!!.append(originalImageFile!!.length())
stringBuffer!!.append("\nNew File Length: ")
stringBuffer!!.append(imageFile!!.length())
logUtil!!.put(stringBuffer!!.toString(), this, "saveImageFile()")

                                    }
                                
}


}
                
            

