
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
        package org.allbinary.logic.communication.http.file.upload.media




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Set
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.visual.media.MediaData
import org.allbinary.logic.visual.media.MediaIOUtil
import org.allbinary.logic.visual.media.MediaTypeData
import org.allbinary.string.CommonStrings

open public class UploadMediaSingleton
            : Object
         {
        

        companion object {
            
    private var uploadMedia: UploadMediaSingleton

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: UploadMediaSingleton{
    
                        if(UploadMediaSingleton.uploadMedia == 
                                    null
                                )
                        
                                    {
                                    UploadMediaSingleton.uploadMedia= UploadMediaSingleton()

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return UploadMediaSingleton.uploadMedia
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var readerFileTypesHashMap: HashMap<Any, Any>

    private var writerFileTypesHashMap: HashMap<Any, Any>
private constructor        ()
            : super()
        {this.readerFileTypesHashMap= HashMap<Any, Any>()
this.writerFileTypesHashMap= HashMap<Any, Any>()

    var hashMap: HashMap<Any, Any> = MediaData.toHashMap()!!
            


    var set: Set = hashMap!!.keys!!
            


    var mediaDataNameArray: Array<Any?> = set.toArray()!!
            


    var size: Int = mediaDataNameArray!!.size
                





                        for (index in 0 until size)


        {
    var mediaDataName: String = mediaDataNameArray[index]!! as String


    var mediaData: MediaData = hashMap!!.get(mediaDataName as Object?) as MediaData

this.readerFileTypesHashMap!!.put(mediaData!!.getName(), mediaData!!.getType())
}


    var mediaIOUtil: MediaIOUtil = MediaIOUtil.getInstance()!!
            


    var RESIZABLE_MEDIA: String = MediaTypeData.getInstance()!!.RESIZABLE_MEDIA


    var readerFileTypes: Array<String?> = mediaIOUtil!!.getReaderFormatNames()!!
            





                        for (index in 0 until readerFileTypes!!.size)


        {this.readerFileTypesHashMap!!.put(readerFileTypes[index]!!, RESIZABLE_MEDIA)
}


    var writerFileTypes: Array<String?> = mediaIOUtil!!.getWriterFormatNames()!!
            





                        for (index in 0 until writerFileTypes!!.size)


        {this.writerFileTypesHashMap!!.put(writerFileTypes[index]!!, RESIZABLE_MEDIA)
}


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "Supported Media Readers: ")
stringBuffer!!.append(this.readerFileTypesHashMap!!.toString())
stringBuffer!!.append(
                            " Writers: ")
stringBuffer!!.append(this.writerFileTypesHashMap!!.toString())
logUtil!!.put(stringBuffer!!.toString(), this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
}


open fun isReaderSupported(mediaFileType: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var mediaFileType = mediaFileType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.readerFileTypesHashMap!!.containsKey(mediaFileType)
}


open fun isWriterSupported(mediaFileType: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var mediaFileType = mediaFileType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.readerFileTypesHashMap!!.containsKey(mediaFileType)
}


open fun isSupported(mediaFileType: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var mediaFileType = mediaFileType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.isReaderSupported(mediaFileType) && this.isWriterSupported(mediaFileType)
}


open fun isMedia(mediaFileType: String, aMediaType: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var mediaFileType = mediaFileType


                    var aMediaType = aMediaType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.isReaderMedia(mediaFileType, aMediaType) && this.isWriterMedia(mediaFileType, aMediaType)
}


open fun isReaderMedia(mediaFileType: String, aMediaType: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var mediaFileType = mediaFileType


                    var aMediaType = aMediaType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.isMedia(mediaFileType, aMediaType, this.readerFileTypesHashMap)
}


open fun isWriterMedia(mediaFileType: String, aMediaType: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var mediaFileType = mediaFileType


                    var aMediaType = aMediaType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.isMedia(mediaFileType, aMediaType, this.writerFileTypesHashMap)
}


open fun isMedia(mediaFileType: String, aMediaType: String, hashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var mediaFileType = mediaFileType


                    var aMediaType = aMediaType


                    var hashMap = hashMap

    
                        if(hashMap!!.containsKey(mediaFileType))
                        
                                    {
                                    
    var mediaType: String = hashMap!!.get(mediaFileType as Object?) as String


    
                        if(mediaType!!.compareTo(aMediaType) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


}
                
            

