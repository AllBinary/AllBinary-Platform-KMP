
        /* Generated Code Do Not Modify */
        package org.allbinary.graphics.opengles




        import java.lang.Object        
        
        import java.lang.Runnable
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.khronos.opengles.GL10
import javax.microedition.lcdui.Image
import org.allbinary.device.LoadTextures
import org.allbinary.device.OpenGLESGraphics
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvas
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvasFactory
import org.allbinary.graphics.displayable.CanvasStrings
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.opengles.renderer.RendererStrings
import org.allbinary.image.PreResourceImageUtil
import org.allbinary.image.opengles.OpenGLESImage
import org.allbinary.image.opengles.OpenGLImageCache
import org.allbinary.image.opengles.OpenGLImageCacheFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings
import org.allbinary.thread.SynchObject
import org.allbinary.util.BasicArrayList

open public class OpenGLUtil
            : Object
         {
        
companion object {
            
    private val instance: OpenGLUtil = OpenGLUtil()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: OpenGLUtil{



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

    private val renderStrings: RendererStrings = RendererStrings.getInstance()!!

    val canvasStrings: CanvasStrings = CanvasStrings.getInstance()!!

    val displayInfoSingleton: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!

    private val preResourceImageUtil: PreResourceImageUtil = PreResourceImageUtil.getInstance()!!

    private val lockObject: SynchObject = SynchObject()

    private val anyType: SynchObject = SynchObject()

    private val list: BasicArrayList = BasicArrayList()

    val runnableList: BasicArrayList = BasicArrayList()

    private var created: Boolean = false

    open fun onSurfaceCreated(gl: GL10)
        //nullable = true from not(false or (false and false)) = true
{
    //var gl = gl

        try {
            
    
                        if(!created)
                        
                                    {
                                    created= true
PreLogUtil.put(CommonLabels.getInstance()!!.START_LABEL +OpenGLCapabilities.getInstance()!!.toString(), this, this.renderStrings!!.ON_SURFACE_CREATED)

                                    }
                                
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, this.renderStrings!!.ON_SURFACE_CREATED, e)
}

}


    open fun onSurfaceCreated(gl: GL10, loadTextures: LoadTextures)
        //nullable = true from not(false or (false and false)) = true
{
    //var gl = gl
    //var loadTextures = loadTextures

        try {
            loadTextures!!.load(gl)
OpenGLLogUtil.getInstance()!!.logError(gl)
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, this.renderStrings!!.ON_SURFACE_CREATED, e)
}

}


    private var surfaceCreatedAndInitialized: Boolean = false

                @Throws(Exception::class)
            
    open fun onSurfaceChanged(gl: GL10, graphics: OpenGLESGraphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var gl = gl
    //var graphics = graphics

    
                        if(!surfaceCreatedAndInitialized)
                        
                                    {
                                    graphics.init()
surfaceCreatedAndInitialized= true

                                    }
                                
graphics.update()

    var progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!

progressCanvas!!.update(graphics)
getInstance = OpenGLImageCacheFactory.getInstance()getInstance as OpenGLImageCache
getInstance.
                    update(gl)
this.processRunnables()
this.set(gl)
}


    open fun add(image: Image)
        //nullable = true from not(false or (false and false)) = true
: Image{
    //var image = image

    var encapsulateImage: Image = preResourceImageUtil!!.encapsulate(image)!!


    
                        if(encapsulateImage != image)
                        
                                    {
                                    
        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(anyType) 

        //mutex.withLock
        {
list.add(encapsulateImage)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return encapsulateImage

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


    open fun clear()
        //nullable = true from not(false or (false and true)) = true
{

        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(anyType) 

        //mutex.withLock
        {
list.clear()
}

}


    open fun add(runnable: Runnable)
        //nullable = true from not(false or (false and false)) = true
{
    //var runnable = runnable

        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(lockObject) 

        //mutex.withLock
        {

    
                        if(!this.runnableList!!.contains(runnable))
                        
                                    {
                                    this.runnableList!!.add(runnable)
displayInfoSingleton!!.add(this.canvasStrings!!.SCALED_IMAGES)

                                    }
                                
}

}


    open fun processRunnables()
        //nullable = true from not(false or (false and true)) = true
{

        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(lockObject) 

        //mutex.withLock
        {

    var runnable: Runnable


    var size: Int = this.runnableList!!.size()!!





                        for (index in 0 until size)

        {
runnable= this.runnableList!!.get(index) as Runnable
runnable.run()
}

this.runnableList!!.clear()
}

}


                @Throws(Exception::class)
            
    open fun set(gl: GL10)
        //nullable = true from not(false or (false and false)) = true
{
var gl = gl

    var size: Int = this.list.size()!!


    var image: Any





                        for (index2 in 0 until size)

        {
image= this.list.get(index2)
image = imageimage as OpenGLESImage
image.
                    set(gl)
}

}


}
                
            

