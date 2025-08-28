
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
        package org.allbinary.image.opengles




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.InputStream
import javax.microedition.khronos.opengles.GL10
import javax.microedition.lcdui.Image
import org.allbinary.graphics.opengles.renderer.AllBinaryRendererBase3
import org.allbinary.util.BasicArrayList
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.image.ImageCache
import org.allbinary.image.ImageCacheFactory
import org.allbinary.image.PreResourceImageUtil
import org.allbinary.thread.SynchObject

open public class OpenGLImageCache : ImageCache {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val imageCache: ImageCache = ImageCacheFactory.getInstance()!!

    private val preResourceImageUtil: PreResourceImageUtil = PreResourceImageUtil.getInstance()!!

    private var gl: GL10

    private val lock: SynchObject = SynchObject()

    private val list: BasicArrayList = BasicArrayList()

    private var renderer: AllBinaryRendererBase3 = AllBinaryRendererBase3()
protected constructor        ()

        Updates for KMP build        
        {
}


open fun addListener(renderer: Any)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var renderer = renderer
this.renderer= renderer as AllBinaryRendererBase3
}


                @Throws(Exception::class)
            
open fun update(gl: GL10)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var gl = gl
this.gl= gl

        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(lock) 

        //mutex.withLock
        

        Updates for KMP build        
        {




                        for (index in list.size() -1 downTo 0)

        

        Updates for KMP build        
        {

    var openGLESImage: OpenGLESImage = (list.objectArray[index]!! as OpenGLESImage)


    
                        if(openGLESImage != 
                                    null
                                )
                        
                                    {
                                    openGLESImage!!.set(gl)

                                    }
                                
}

}

}


                @Throws(Exception::class)
            override fun createImage(caller: String, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
: Image

        Updates for KMP build        
        {
    //var caller = caller
var width = width
var height = height

    var textureSize: Int = width


    
                        if(height > width)
                        
                                    {
                                    textureSize= height

                                    }
                                

        while((textureSize % 4) != 0)
        

        Updates for KMP build        
        {
textureSize++
}

width= textureSize
height= textureSize

    var image2: Image = this.imageCache!!.get(caller, width, height)!!


    var image: Image = preResourceImageUtil!!.encapsulate(image2)!!


        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(lock) 

        //mutex.withLock
        

        Updates for KMP build        
        {

    
                        if(image != 
                                    null
                                )
                        list.add(image)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


                @Throws(Exception::class)
            override fun createImage(key: Any, inputStream: InputStream)
        //nullable = true from not(false or (false and false)) = true
: Image

        Updates for KMP build        
        {
    //var key = key
    //var inputStream = inputStream

    var cachedImage: Image = this.imageCache!!.get(key)!!


    var image: Image = preResourceImageUtil!!.encapsulate(cachedImage)!!


        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(lock) 

        //mutex.withLock
        

        Updates for KMP build        
        {

    
                        if(image != 
                                    null
                                )
                        list.add(image)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


open fun getGlP()
        //nullable = true from not(false or (false and true)) = true
: GL10

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gl
}


open fun init(image: Image)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var image = image

        try {
            
        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(lock) 

        //mutex.withLock
        

        Updates for KMP build        
        {

    
                        if(list.contains(image))
                        
                                    {
                                    


                            throw RuntimeException()

                                    }
                                
list.add(image)
}

this.renderer.add(image)
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put(this.commonStrings!!.EXCEPTION, this, commonStrings!!.INIT, e)
}

}


}
                
            

