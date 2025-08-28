
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
        
        import java.lang.System
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.InputStream
import javax.microedition.lcdui.Image
import javax.microedition.lcdui.NullCanvas
import org.allbinary.data.resource.ResourceUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings
import org.allbinary.system.Memory

open public class ImageCache : ImageCacheBase {
        

        companion object {
            
    val NULL_IMAGE_CACHE: ImageCache = ImageCache()

        }
            
    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
public constructor        (){
}


open fun addListener(renderer: Any)
        //nullable = true from not(false or (false and false)) = true
{
var renderer = renderer
}


                @Throws(Exception::class)
            override fun get(caller: String, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
: Image{
    //var caller = caller
    //var width = width
    //var height = height

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

    var widths: IntArray = this.widths


    
                        if(nextIndex > widths.size -1)
                        
                                    {
                                    
    
                        if(foundIndex ==  -1)
                        
                                    {
                                    foundIndex= nextIndex
widths[nextIndex]= width
heights[nextIndex]= height
nextIndex++

                                    }
                                
listOfList[foundIndex]!!.add(image)

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


                @Throws(Exception::class)
            override fun get(key: Any)
        //nullable = true from not(false or (false and false)) = true
: Image{
    //var key = key

    var image: Image = this.getImage(key)!!


    
                        if(image == NullCanvas.NULL_IMAGE)
                        
                                    {
                                    
    var resourceUtil: ResourceUtil = ResourceUtil.getInstance()!!


    var inputStream: InputStream = resourceUtil!!.getResourceAsStream(key as String)!!


    
                        if(inputStream == 
                                    null
                                )
                        
                                    {
                                    


                            throw RuntimeException(StringMaker().
                            append("Image resource is not available for key: ")!!.append(StringUtil.getInstance()!!.toString(key))!!.toString())

                                    }
                                

        try {
            image= this.createImage(key, inputStream)
} catch(e: Exception)
            {
logUtil!!.put("Exception: Trying Again After GC", this, commonStrings!!.GET, e)
logUtil!!.put(StringMaker().
                            append("InputStream: ")!!.append(StringUtil.getInstance()!!.toString(inputStream))!!.toString(), this, commonStrings!!.GET)
System.gc()
System.gc()
logUtil!!.put(Memory.getInfo(), this, commonStrings!!.GET)
Thread.sleep(100)
image= this.createImage(key, inputStream)
}

inputStream!!.close()
this.hashtable.put(key, image)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


                @Throws(Exception::class)
            
open fun loadImageForAnimation()
        //nullable = true from not(false or (false and true)) = true
{
}


open fun runTask()
        //nullable = true from not(false or (false and true)) = true
{
}


open fun isLazy()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

