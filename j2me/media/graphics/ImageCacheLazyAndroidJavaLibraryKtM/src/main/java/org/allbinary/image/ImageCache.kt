
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
        package org.allbinary.image




        import java.lang.Object        
        
        import java.lang.Integer
        
        import java.lang.System
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.InputStream
import javax.microedition.lcdui.Image
import javax.microedition.lcdui.NullCanvas
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.logic.string.StringMaker
import org.allbinary.data.resource.ResourceUtil
import org.allbinary.system.Memory

open public class ImageCache : ImageCacheBase {
        

        companion object {
            
    val NULL_IMAGE_CACHE: ImageCache = ImageCache()

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
public constructor        (){}


                @Throws(Exception::class)
            
open fun get(caller: String, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var caller = caller


                    var width = width


                    var height = height

    var foundIndex: Int = this.getIndex(width, height)!!


    var image: Image = this.getFromAvailable(foundIndex, width, height)!!


    
                        if(image == NullCanvas.NULL_IMAGE)
                        
                                    {
                                    volume += width *height

    
                        if(volume > 32000)
                        
                                    {
                                    System.gc()
volume= 0

                                    }
                                
image= this.createImage(caller, width, height)

    
                        if(foundIndex ==  -1)
                        
                                    {
                                    foundIndex= nextIndex
widths[nextIndex]= width
heights[nextIndex]= height
nextIndex++

                                    }
                                
listOfList[foundIndex]!!.add(image)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


                @Throws(Exception::class)
            
open fun get(key: Any)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var key = key

    var resourceUtil: ResourceUtil = ResourceUtil.getInstance()!!


    var resourceId: Integer = resourceUtil!!.getResourceId(key as String)!!


    var image: Image = this.getImage(resourceId)!!


    
                        if(image == NullCanvas.NULL_IMAGE)
                        
                                    {
                                    
    var inputStream: InputStream = 
                null
            


        try {
            logUtil!!.put(Memory.getInfo(), this, commonStrings!!.GET)
image= this.createImage(key, inputStream)
} catch(e: Exception)
            {logUtil!!.put("Exception: Trying Again After GC", this, commonStrings!!.GET, e)
logUtil!!.put(StringMaker().
                            append("InputStream: ")!!.append(inputStream!!.toString())!!.toString(), this, commonStrings!!.GET)
System.gc()
System.gc()
logUtil!!.put(Memory.getInfo(), this, commonStrings!!.GET)
Thread.sleep(100)
image= this.createImage(key, inputStream)
}

this.hashtable.put(resourceId, image)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


                @Throws(Exception::class)
            
open fun createImage(key: Any, inputStream: InputStream)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var key = key


                    var inputStream = inputStream



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Image.createImageLater(key as String,  -1,  -1)
}


open fun isLazy()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                            throw RuntimeException()
}


}
                
            

