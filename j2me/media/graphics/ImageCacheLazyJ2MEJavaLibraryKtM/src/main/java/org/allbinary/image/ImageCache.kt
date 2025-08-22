
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
import org.allbinary.animation.image.LazyImageRotationAnimation
import org.allbinary.canvas.GameGlobalsFactory
import org.allbinary.canvas.Processor
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.logic.string.StringMaker
import org.allbinary.data.resource.ResourceUtil
import org.allbinary.game.canvas.ABToGBUtil
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.HTMLFeatureFactory
import org.allbinary.game.displayable.canvas.AllBinaryGameCanvas
import org.allbinary.game.gd.resource.GDLazyResources
import org.allbinary.game.gd.resource.GDResources
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvas
import org.allbinary.graphics.canvas.transition.progress.ProgressCanvasFactory
import org.allbinary.string.CommonSeps
import org.allbinary.logic.string.StringUtil
import org.allbinary.system.Memory
import org.allbinary.thread.BaseImageLoadingProcessor
import org.allbinary.thread.ConcurrentImageLoadingProcessor
import org.allbinary.thread.SynchObject
import org.allbinary.util.BasicArrayList

open public class ImageCache : ImageCacheBase {
        

        companion object {
            
    val NULL_IMAGE_CACHE: ImageCache = ImageCache()

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val concurrentImageLoadingProcessor: BaseImageLoadingProcessor = ConcurrentImageLoadingProcessor(this)

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    val commonSeps: CommonSeps = CommonSeps.getInstance()!!

    val resourceUtil: ResourceUtil = ResourceUtil.getInstance()!!

    private val gameGlobalsFactory: GameGlobalsFactory = GameGlobalsFactory.getInstance()!!

    private val gdResources: GDResources = GDResources.getInstance()!!

    val loadNowList: BasicArrayList = BasicArrayList()

    val loadSoonList: BasicArrayList = BasicArrayList()

    val loadList: BasicArrayList = BasicArrayList()

    val loadAfterList: BasicArrayList = BasicArrayList()

    private val lock: SynchObject = SynchObject()

    private var firstTime: Boolean = true

    private var totalLoaded: Int = 0

    var hasAnyLazyAnimationFactories: Boolean = false

open public inner class NotHTMLProcessor : Processor {
        
/*Static stuff is not allowed for Kotlin inner classes
        companion object {
            *//*
        }
            */


            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun process()
        //nullable = true from not(false or (false and true)) = true
{concurrentImageLoadingProcessor!!.runTask()
}


}
                
            
open public inner class NotHTMLEndProcessor : Processor {
        
/*Static stuff is not allowed for Kotlin inner classes
        companion object {
            *//*
        }
            */


            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun process()
        //nullable = true from not(false or (false and true)) = true
{
    var progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!

progressCanvas!!.endIfPaintedSinceStart()
}


}
                
            
open public inner class HTMLEndProcessor : Processor {
        
/*Static stuff is not allowed for Kotlin inner classes
        companion object {
            *//*
        }
            */


            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun process()
        //nullable = true from not(false or (false and true)) = true
{
    var size: Int = gdResources!!.currentLayoutRequiredTotal


                    //Otherwise - statement - EmptyStmt


    
                        if(size == 0)
                        
                                    {
                                    
    var progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!

progressCanvas!!.endIfPaintedSinceStart()

                                    }
                                
                             else 
    
                        if(totalLoaded > size /12)
                        
                                    {
                                    
    var progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!

progressCanvas!!.endIfPaintedSinceStart()
endProcessor= NotHTMLEndProcessor()

                                    }
                                
}


}
                
            
    private var isHTML: Boolean= false

open public inner class FirstProcessor : Processor {
        
/*Static stuff is not allowed for Kotlin inner classes
        companion object {
            *//*
        }
            */


            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun process()
        //nullable = true from not(false or (false and true)) = true
{
    var features: Features = Features.getInstance()!!

isHTML= features.isDefault(HTMLFeatureFactory.getInstance()!!.HTML)

    
                        if(isHTML)
                        
                                    {
                                    processor= Processor.getInstance()
endProcessor= HTMLEndProcessor()

                                    }
                                
                        else {
                            processor= NotHTMLProcessor()
endProcessor= NotHTMLEndProcessor()

        try {
            runTask()
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.END_METHOD_NAME)
}


                        }
                            
}


}
                
            
    private var processor: Processor = FirstProcessor()

    private var endProcessor: Processor = Processor.getInstance()!!
public constructor        (){}


open fun addListener(renderer: Any)
        //nullable = true from not(false or (false and false)) = true
{

                    var renderer = renderer
}


                @Throws(Exception::class)
            
open fun waitForLoadNow()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(firstTime)
                        
                                    {
                                    
    var abToGBUtil: ABToGBUtil = ABToGBUtil.getInstance()!!


    var abCanvas: AllBinaryGameCanvas = abToGBUtil!!.abCanvas as AllBinaryGameCanvas


        while(loadNowList!!.isEmpty() && (!abCanvas!!.isInitialized() || (abCanvas!!.isInitialized() && this.hasAnyLazyAnimationFactories)))
        {Thread.sleep(120)
}

firstTime= false

                                    }
                                
}


    private val LOAD_IMAGE_FOR_ANIMATION: String = "Load Image Animation"

                @Throws(Exception::class)
            
open fun loadImageForAnimation()
        //nullable = true from not(false or (false and true)) = true
{
    var lazyImageRotationAnimation: LazyImageRotationAnimation = 
                null
            


        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(lock) 

        //mutex.withLock
        {
    
                        if(loadNowList!!.isEmpty())
                        
                                    {
                                    this.endProcessor!!.process()

    
                        if(loadSoonList!!.isEmpty())
                        
                                    {
                                    
    
                        if(this.loadAfterList!!.isEmpty())
                        
                                    {
                                    
    
                        if(firstTime)
                        
                                    {
                                    
                                    }
                                
                             else 
    
                        if(gameGlobalsFactory!!.newCanvas)
                        
                                    {
                                    
                                    }
                                
                        else {
                            loadImage()

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
                        else {
                            lazyImageRotationAnimation= this.loadAfterList!!.get(0) as LazyImageRotationAnimation

    
                        if(this.loadImageForAnimation(lazyImageRotationAnimation))
                        
                                    {
                                    loadAfterList!!.remove(lazyImageRotationAnimation)

                                    }
                                

                        }
                            

                                    }
                                
                        else {
                            lazyImageRotationAnimation= this.loadSoonList!!.get(0) as LazyImageRotationAnimation

    
                        if(this.loadImageForAnimation(lazyImageRotationAnimation))
                        
                                    {
                                    loadSoonList!!.remove(lazyImageRotationAnimation)

                                    }
                                

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
lazyImageRotationAnimation= loadNowList!!.get(0) as LazyImageRotationAnimation
}


    
                        if(this.loadImageForAnimation(lazyImageRotationAnimation))
                        
                                    {
                                    
        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(lock) 

        //mutex.withLock
        {loadNowList!!.remove(lazyImageRotationAnimation)
}


    
                        if(lazyImageRotationAnimation!!.layoutIndex != 0)
                        
                                    {
                                    
    var list: BasicArrayList = this.getAssociated(lazyImageRotationAnimation)!!


        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(lock) 

        //mutex.withLock
        {
    var size: Int = list.size()!!


    
                        if(size > 0)
                        
                                    {
                                    loadSoonList!!.addAll(list)

                                    }
                                
}


                                    }
                                

    var progressCanvas: ProgressCanvas = ProgressCanvasFactory.getInstance()!!


    
                        if(this.loadNowList!!.isEmpty() && (!isHTML || this.firstTime))
                        
                                    {
                                    progressCanvas!!.endFromInitialLazyLoadingComplete()

                                    }
                                
                        else {
                            
    
                        if(this.totalLoaded % 10 == 0)
                        
                                    {
                                    progressCanvas!!.addPortion(1, LOAD_IMAGE_FOR_ANIMATION)

                                    }
                                

                        }
                            

                                    }
                                
}


                @Throws(Exception::class)
            
open fun loadImages()
        //nullable = true from not(false or (false and true)) = true
{
        while(!loadList!!.isEmpty() || !loadNowList!!.isEmpty())
        {loadImageForAnimations()
loadImage()
}

}


                @Throws(Exception::class)
            
open fun loadImageForAnimations()
        //nullable = true from not(false or (false and true)) = true
{
        while(!loadNowList!!.isEmpty())
        {loadImageForAnimation()
}

}


                @Throws(Exception::class)
            
open fun loadRemainingAnimations()
        //nullable = true from not(false or (false and true)) = true
{
        while(!this.loadAfterList!!.isEmpty() || !this.loadNowList!!.isEmpty())
        {
        while(!loadNowList!!.isEmpty())
        {loadImageForAnimation()
}


    var lazyImageRotationAnimation: LazyImageRotationAnimation = 
                null
            


        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(lock) 

        //mutex.withLock
        {
    
                        if(!this.loadAfterList!!.isEmpty())
                        lazyImageRotationAnimation= this.loadAfterList!!.remove(0) as LazyImageRotationAnimation
}


    
                        if(lazyImageRotationAnimation != 
                                    null
                                )
                        
                                    {
                                    this.loadImageForAnimation(lazyImageRotationAnimation)

                                    }
                                
}

}


                @Throws(Exception::class)
            
open fun loadImageForAnimation(lazyImageRotationAnimation: LazyImageRotationAnimation)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var lazyImageRotationAnimation = lazyImageRotationAnimation

    var image: Image = lazyImageRotationAnimation!!.animationInterfaceFactoryInterface!!.getImage()!!


    
                        if(this.loadImage(image))
                        
                                    {
                                    lazyImageRotationAnimation!!.setRealAnimation()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
open fun loadImage()
        //nullable = true from not(false or (false and true)) = true
{
    var image: Image = 
                null
            


        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(lock) 

        //mutex.withLock
        {
    
                        if(loadList!!.size() == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
image= loadList!!.remove(0) as Image
}

this.loadImage(image)
}


                @Throws(Exception::class)
            
open fun loadImage(image: Image)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var image = image

    
                        if(image.isReady())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            
    
                        if(image.getImage() != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(image.setReady())
                        
                                    {
                                    this.totalLoaded++



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                

                                    }
                                
                        else {
                            
    var key: String = image.getName()!!


    var image2: Image = this.creatImage(key)!!


    
                        if(image2.isReady())
                        
                                    {
                                    this.init(image, image2)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            image.setImage(image2.getImage())

                        }
                            

                        }
                            

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
open fun init(image: Image, image2: Image)
        //nullable = true from not(false or (false and false)) = true
{

                    var image = image


                    var image2 = image2
image.init(image2.getImage())
}


                @Throws(Exception::class)
            
open fun creatImage(key: String)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var key = key

    var inputStream: InputStream = resourceUtil!!.getResourceAsStream(key)!!


    var image: Image = Image.createImage(inputStream)!!

image.setName(key)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


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

    
                        if(nextIndex > widths.length -1)
                        
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
            
open fun get(key: Any)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var key = key

    var image: Image = this.getImage(key)!!


    
                        if(image == NullCanvas.NULL_IMAGE)
                        
                                    {
                                    
    var inputStream: InputStream = 
                null
            


        try {
            image= this.createImage(key, inputStream)
} catch(e: Exception)
            {logUtil!!.put("Exception: Trying Again After GC", this, commonStrings!!.GET, e)
logUtil!!.put(StringMaker().
                            append("InputStream: ")!!.append(StringUtil.getInstance()!!.toString(inputStream))!!.toString(), this, commonStrings!!.GET)
System.gc()
System.gc()
logUtil!!.put(Memory.getInfo(), this, commonStrings!!.GET)
Thread.sleep(100)
image= this.createImage(key, inputStream)
}

this.hashtable.put(key, image)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


open fun getIndex(key: Any)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var key = key

    var gdResources: GDResources = GDResources.getInstance()!!


    var resourceStringArray: Array<String?> = gdResources!!.resourceStringArray


    var size: Int = resourceStringArray!!.size
                





                        for (index in 0 until size)


        {
    
                        if(resourceStringArray[index] == key)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return index

                                    }
                                
}

logUtil!!.put(StringMaker().
                            append("unable to find key: ")!!.append(StringUtil.getInstance()!!.toString(key))!!.toString(), this, commonStrings!!.RUN)



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
open fun createImage(key: Any, inputStream: InputStream)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var key = key


                    var inputStream = inputStream

    var gdLazyResources: GDLazyResources = GDLazyResources.getInstance()!!


    var resourceStringArray: Array<String?> = gdLazyResources!!.requiredResourcesBeforeLoadingArray


    var size: Int = resourceStringArray!!.size
                





                        for (index in 0 until size)


        {
    
                        if(key == resourceStringArray[index])
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.creatImage(key as String)

                                    }
                                
}

this.runTask()

    var index: Int = this.getIndex(key)!!


    var width: Int = gdLazyResources!!.imageResourceWidthArray[index]!!


    var height: Int = gdLazyResources!!.imageResourceHeightArray[index]!!


    var image: Image = this.createImageLater(key as String, width, height)!!


        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(lock) 

        //mutex.withLock
        {loadList!!.add(image)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


                @Throws(Exception::class)
            
open fun createImageLater(key: String, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var key = key


                    var width = width


                    var height = height



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Image.createImageLater(key, width, height)
}


open fun getAssociated(lazyImageRotationAnimation: LazyImageRotationAnimation)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var lazyImageRotationAnimation = lazyImageRotationAnimation

    var list: BasicArrayList = BasicArrayList()


        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(lock) 

        //mutex.withLock
        {
    var lazyImageRotationAnimation2: LazyImageRotationAnimation = 
                null
            


    var size: Int = this.loadAfterList!!.size()!!





                        for (index in 0 until size)


        {lazyImageRotationAnimation2= this.loadAfterList!!.get(index) as LazyImageRotationAnimation

    
                        if(lazyImageRotationAnimation2!!.instanceId == lazyImageRotationAnimation!!.instanceId)
                        
                                    {
                                    list.add(lazyImageRotationAnimation2)

                                    }
                                
}


    var size2: Int = list.size()!!





                        for (index in 0 until size2)


        {this.loadAfterList!!.remove(list.get(index))
}

}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
}


open fun add(lazyImageRotationAnimation: LazyImageRotationAnimation)
        //nullable = true from not(false or (false and false)) = true
{

                    var lazyImageRotationAnimation = lazyImageRotationAnimation

        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(lock) 

        //mutex.withLock
        {this.loadAfterList!!.add(lazyImageRotationAnimation)
}

}


                @Throws(Exception::class)
            
open fun insertFirst(lazyImageRotationAnimation: LazyImageRotationAnimation)
        //nullable = true from not(false or (false and false)) = true
{

                    var lazyImageRotationAnimation = lazyImageRotationAnimation

    
                        if(this.loadNowList!!.contains(lazyImageRotationAnimation))
                        
                                    {
                                    
                                    }
                                
                        else {
                            
        
        //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.
        synchronized(lock) 

        //mutex.withLock
        {this.loadNowList!!.add(lazyImageRotationAnimation)
this.loadAfterList!!.remove(lazyImageRotationAnimation)
}


                        }
                            
this.runTask()
}


                @Throws(Exception::class)
            
open fun runTask()
        //nullable = true from not(false or (false and true)) = true
{this.processor.process()
}


open fun initProgress()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(firstTime)
                        
                                    {
                                    firstTime= false

                                    }
                                
}


open fun isLazy()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


}
                
            

