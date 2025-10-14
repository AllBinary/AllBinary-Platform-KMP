
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
import javax.microedition.lcdui.NullCanvas
import org.allbinary.device.NullGL10
import org.allbinary.graphics.opengles.renderer.AllBinaryRendererBase3
import org.allbinary.util.BasicArrayList
import org.allbinary.image.ImageCache
import org.allbinary.image.ImageCacheFactory
import org.allbinary.image.PreResourceImageUtil
import org.allbinary.thread.SynchObject

open public class OpenGLImageCache : ImageCache {
        

    private val imageCache: ImageCache = ImageCacheFactory.getInstance()!!

    private val preResourceImageUtil: PreResourceImageUtil = PreResourceImageUtil.getInstance()!!

    private var gl: GL10 = NullGL10.NULL_GL10

    private val lock: SynchObject = SynchObject()

    private val list: BasicArrayList = BasicArrayList()

    private var renderer: AllBinaryRendererBase3 = AllBinaryRendererBase3()
public constructor (){
}


    override fun addListener(renderer: Any)
        //nullable = true from not(false or (false and false)) = true
{
var renderer = renderer
this.renderer= renderer as AllBinaryRendererBase3
}


                @Throws(Exception::class)
            
    open fun update(gl: GL10)
        //nullable = true from not(false or (false and false)) = true
{
    //var gl = gl
this.gl= gl

        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(lock) 

        //mutex.withLock
        {




                        for (index in list.size() -1 downTo 0)

        {

    var openGLESImage: OpenGLESImage = (list.objectArray[index]!! as OpenGLESImage)


    
                        if(openGLESImage != OpenGLESImage.NULL_OPENGL_IMAGE)
                        
                                    {
                                    openGLESImage!!.set(gl)

                                    }
                                
}

}

}


                @Throws(Exception::class)
            
    override fun createImage(caller: String, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
: Image{
    //var caller = caller
var width = width
var height = height

    var textureSize: Int = width


    
                        if(height > width)
                        
                                    {
                                    textureSize= height

                                    }
                                

        while((textureSize % 4) != 0)
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
        {

    
                        if(image != NullCanvas.NULL_IMAGE)
                        
                                    {
                                    list.add(image)

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


                @Throws(Exception::class)
            
    override fun createImage(key: Any, inputStream: InputStream)
        //nullable = true from not(false or (false and false)) = true
: Image{
    //var key = key
    //var inputStream = inputStream

    var cachedImage: Image = this.imageCache!!.get(key)!!


    var image: Image = preResourceImageUtil!!.encapsulate(cachedImage)!!


        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(lock) 

        //mutex.withLock
        {

    
                        if(image != NullCanvas.NULL_IMAGE)
                        
                                    {
                                    list.add(image)

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


    open fun getGlP()
        //nullable = true from not(false or (false and true)) = true
: GL10{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gl
}


    override fun init(image: Image)
        //nullable = true from not(false or (false and false)) = true
{
    //var image = image

        try {
            
        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(lock) 

        //mutex.withLock
        {

    
                        if(list.contains(image))
                        
                                    {
                                    


                            throw RuntimeException()

                                    }
                                
list.add(image)
}

this.renderer.add(image)
} catch(e: Exception)
            {
logUtil!!.put(this.commonStrings!!.EXCEPTION, this, commonStrings!!.INIT, e)
}

}


}
                
            

