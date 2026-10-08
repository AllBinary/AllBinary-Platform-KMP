
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.thread




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
                    
        
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvas
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvasFactory
import org.allbinary.image.ImageCache
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class ConcurrentImageLoadingProcessor : BaseImageLoadingProcessor {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

open public inner class ImageCacheRunnable : ABRunnable {
        

    private val imageCache: ImageCache
public constructor (imageCache: ImageCache){
    //var imageCache = imageCache
this.imageCache= imageCache
}


    override fun run()
        //nullable = true from not(false or (false and true)) = true
{

    var logUtil: LogUtil = LogUtil.getInstance()!!


        try {
            this.setRunning(true)
this.imageCache!!.waitForLoadNow()
this.imageCache!!.loadImages()
this.imageCache!!.loadRemainingAnimations()
this.setRunning(false)

    var progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!


    
                        if(!progressCanvas!!.inProgress)
                        
                                    {
                                    progressCanvas!!.endFromInitialLazyLoadingComplete()

                                    }
                                
} catch(e: Exception)
            {
this.setRunning(false)

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}


}
                
            
    private val runnable: ABRunnable
public constructor (imageCache: ImageCache){
    //var imageCache = imageCache
this.runnable= ImageCacheRunnable(imageCache)
}


    override fun runTask()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(!this.runnable.isRunning())
                        
                                    {
                                    ImageThreadPool.getInstance()!!.runTask(this.runnable)

                                    }
                                
}


}
                
            

