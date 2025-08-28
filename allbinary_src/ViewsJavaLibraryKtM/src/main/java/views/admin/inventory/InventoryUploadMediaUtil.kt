
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
        package views.admin.inventory




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.ByteArrayInputStream
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.user.commerce.inventory.item.ItemInterface
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.http.file.upload.media.UploadMediaSingleton
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.FileUtil
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.visual.media.MediaData
import org.allbinary.logic.visual.media.MediaTypeData
import org.allbinary.logic.visual.media.MediaUtil
import org.allbinary.string.CommonStrings

open public class InventoryUploadMediaUtil
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val mediaUtil: MediaUtil = MediaUtil.getInstance()!!

    private val LARGEWIDTH: Int = 1024

    private val LARGEHEIGHT: Int = 1024

    private val MEDIUMWIDTH: Int = 256

    private val MEDIUMHEIGHT: Int = 256

    private val SMALLWIDTH: Int = 128

    private val SMALLHEIGHT: Int = 128

    private val SMALL: String = "Small"

    private val MEDIUM: String = "Medium"

    private val LARGE: String = "Large"

    private var storeFrontInterface: StoreFrontInterface

    private var itemInterface: ItemInterface
public constructor        (storeFrontInterface: StoreFrontInterface, itemInterface: ItemInterface)
            : super()
        

        Updates for KMP build        
        {
var storeFrontInterface = storeFrontInterface
var itemInterface = itemInterface
this.storeFrontInterface= storeFrontInterface
this.itemInterface= itemInterface
}


                @Throws(Exception::class)
            
open fun saveFiles(byteArray: ByteArray, fileName: String, mediaData: MediaData)
        //nullable = true from not(false or (false and false)) = true
: ItemInterface

        Updates for KMP build        
        {
var byteArray = byteArray
var fileName = fileName
var mediaData = mediaData

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.CATEGORY))
                        
                                    {
                                    logUtil!!.put("Start FileName: " +fileName, this, "saveFiles()")

                                    }
                                

    
                        if(StringValidationUtil.getInstance()!!.isEmpty(fileName))
                        
                                    {
                                    


                            throw Exception("Image File Name Was Null")

                                    }
                                

    var fileUtil: FileUtil = FileUtil.getInstance()!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(URLGLOBALS.getWebappPath())
stringBuffer!!.append(storeFrontInterface!!.getCurrentHostNamePath())
stringBuffer!!.append(itemInterface!!.getCategory())

    var fullPath: String = stringBuffer!!.toString()!!


    var imageDirectoryFile: AbFile = AbFile(fullPath)


    
                        if(!imageDirectoryFile!!.isDirectory())
                        
                                    {
                                    


                            throw Exception("Unable to save file to non existant directory")

                                    }
                                
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(fullPath)
stringBuffer!!.append(fileName)
stringBuffer!!.append(AbPathData.getInstance()!!.EXTENSION_SEP)
stringBuffer!!.append(mediaData!!.getName())

    var originalImageFile: AbFile = AbFile(stringBuffer!!.toString())


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.CATEGORY))
                        
                                    {
                                    logUtil!!.put("Saving Original Image: " +originalImageFile, this, "saveFiles()")

                                    }
                                
originalImageFile!!.createNewFile()
fileUtil!!.write(ByteArrayInputStream(byteArray), originalImageFile)

    var uploadMedia: UploadMediaSingleton = UploadMediaSingleton.getInstance()!!


    var isMediaSupported: Boolean = uploadMedia!!.isWriterSupported(mediaData!!.getName()) || uploadMedia!!.isReaderSupported(mediaData!!.getName())


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.CATEGORY))
                        
                                    {
                                    stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append("Is Image Type: ")
stringBuffer!!.append(mediaData!!.getName())
stringBuffer!!.append(" supported: ")
stringBuffer!!.append(isMediaSupported)
logUtil!!.put(stringBuffer!!.toString(), this, "saveFiles()")

                                    }
                                

    var defaultMediaData: MediaData = MediaData.getDefault()!!

this.setFileNames(fileName)

    
                        if(isMediaSupported)
                        
                                    {
                                    
    var isMediaResizable: Boolean = uploadMedia!!.isWriterMedia(mediaData!!.getName(), MediaTypeData.getInstance()!!.RESIZABLE_MEDIA)!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.CATEGORY))
                        
                                    {
                                    stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append("Is ")
stringBuffer!!.append(mediaData!!.toString())
stringBuffer!!.append(" Image Resize Supported:")
stringBuffer!!.append(uploadMedia!!.isSupported(mediaData!!.getName()))
stringBuffer!!.append(" WriterMedia: ")
stringBuffer!!.append(isMediaResizable)
logUtil!!.put(stringBuffer!!.toString(), this, "saveFiles()")

                                    }
                                

    
                        if(isMediaResizable)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.CATEGORY))
                        
                                    {
                                    logUtil!!.put("Saving Small Image: " +this.itemInterface!!.getSmallImage(), this, "saveFiles()")

                                    }
                                
mediaUtil!!.saveImageFile(originalImageFile, itemInterface!!.getSmallImage(), fullPath, mediaData, this.SMALLWIDTH, this.SMALLHEIGHT)
mediaUtil!!.saveImageFile(originalImageFile, itemInterface!!.getMediumImage(), fullPath, mediaData, this.MEDIUMWIDTH, this.MEDIUMHEIGHT)
mediaUtil!!.saveImageFile(originalImageFile, itemInterface!!.getLargeImage(), fullPath, mediaData, this.LARGEWIDTH, this.LARGEHEIGHT)

                                    }
                                
                        else {
                            
    var isConvertable: Boolean = mediaData!!.isConvertableTo(defaultMediaData)!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.CATEGORY))
                        
                                    {
                                    stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append("Converting: ")
stringBuffer!!.append(defaultMediaData!!.getName())
stringBuffer!!.append(" into ")
stringBuffer!!.append(mediaData!!.getName())
stringBuffer!!.append(" if Convertable is it: ")
stringBuffer!!.append(isConvertable)
logUtil!!.put(stringBuffer!!.toString(), this, "saveFiles()")

                                    }
                                

    
                        if(isConvertable)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.CATEGORY))
                        
                                    {
                                    logUtil!!.put("Saving Small Image: " +this.itemInterface!!.getSmallImage(), this, "saveFiles()")

                                    }
                                
mediaUtil!!.saveImageFile(originalImageFile, itemInterface!!.getSmallImage(), fullPath, defaultMediaData, this.SMALLWIDTH, this.SMALLHEIGHT)
mediaUtil!!.saveImageFile(originalImageFile, itemInterface!!.getMediumImage(), fullPath, defaultMediaData, this.MEDIUMWIDTH, this.MEDIUMHEIGHT)
mediaUtil!!.saveImageFile(originalImageFile, itemInterface!!.getLargeImage(), fullPath, defaultMediaData, this.LARGEWIDTH, this.LARGEHEIGHT)

                                    }
                                
                        else {
                            
    var smallImageFile: AbFile = AbFile(itemInterface!!.getSmallImage())

smallImageFile!!.createNewFile()
fileUtil!!.write(ByteArrayInputStream(byteArray), smallImageFile)

    var mediumImageFile: AbFile = AbFile(itemInterface!!.getMediumImage())

smallImageFile!!.createNewFile()
fileUtil!!.write(ByteArrayInputStream(byteArray), mediumImageFile)

    var largeImageFile: AbFile = AbFile(itemInterface!!.getSmallImage())

largeImageFile!!.createNewFile()
fileUtil!!.write(ByteArrayInputStream(byteArray), largeImageFile)

                        }
                            

                        }
                            

                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.CATEGORY))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.END, this, "saveFiles()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.itemInterface
}


open fun setFileNames(fileName: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var fileName = fileName

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.itemInterface!!.getId())
stringBuffer!!.append(AbPathData.getInstance()!!.EXTENSION_SEP)
stringBuffer!!.append(MediaData.getDefault()!!.getName())

    var END: String = stringBuffer!!.toString()!!

stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(fileName)
stringBuffer!!.append(SMALL)
stringBuffer!!.append(END)

    var newImageFileName: String = stringBuffer!!.toString()!!

this.itemInterface!!.setSmallImage(newImageFileName)
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(fileName)
stringBuffer!!.append(MEDIUM)
stringBuffer!!.append(END)
newImageFileName= stringBuffer!!.toString()
this.itemInterface!!.setMediumImage(newImageFileName)
stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(fileName)
stringBuffer!!.append(LARGE)
stringBuffer!!.append(END)
newImageFileName= stringBuffer!!.toString()
this.itemInterface!!.setLargeImage(newImageFileName)
}


}
                
            

