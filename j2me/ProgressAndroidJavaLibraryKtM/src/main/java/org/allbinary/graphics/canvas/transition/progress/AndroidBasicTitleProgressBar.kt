
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
        package org.allbinary.graphics.canvas.transition.progress



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.Image
import javax.microedition.lcdui.NullCanvas
import android.app.Activity
import org.allbinary.image.GameFeatureImageCacheFactory
import org.allbinary.image.PreResourceImageUtil
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.java.exception.ExceptionUtil
import org.allbinary.animation.Animation
import org.allbinary.animation.NullAnimationFactory
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.MainFeatureFactory
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.displayable.event.DisplayChangeEvent
import org.allbinary.graphics.displayable.event.DisplayChangeEventHandler
import org.allbinary.graphics.displayable.event.DisplayChangeEventListener
import org.allbinary.image.ImageCacheFactory
import org.allbinary.media.image.ImageScaleUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.animation.AnimationBehavior
import org.allbinary.animation.image.ImageAnimation
import org.allbinary.data.resource.ResourceUtil
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.thread.NullRunnable

open public class AndroidBasicTitleProgressBar : ProgressCanvas
                , DisplayChangeEventListener {
        

        companion object {
            
    val RESOURCE: String = "ProgressImage"

    private val NULL_ACTIVITY: Activity = Activity()

    private var background: Int= 0

open fun setBackground(background: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var background = background
AndroidBasicTitleProgressBar.background= background
}


        }
            
    private var showTitleProgressBarRunnable: NullRunnable = NullRunnable.getInstance()!!
            

    private var dismissTitleProgressBarRunnable: NullRunnable = NullRunnable.getInstance()!!
            

    private var titleProgressDialogPortionSetProgressRunnable: NullRunnable = NullRunnable.getInstance()!!
            

    private var titleProgressDialogSetProgressRunnable: NullRunnable = NullRunnable.getInstance()!!
            

    private var midletActivity: Activity = NULL_ACTIVITY

    private var portion: Int = 0

    private var IMAGE: Array<Image?> = arrayOfNulls(4)

    private var image: Image = NullCanvas.NULL_IMAGE

    private var animation: Animation = NullAnimationFactory.getFactoryInstance()!!.getInstance(0)!!
            
 constructor        (title: String, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : super(title, backgroundBasicColor, foregroundBasicColor){

                    var title = title


                    var backgroundBasicColor = backgroundBasicColor


                    var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    
this.init()
DisplayChangeEventHandler.getInstance()!!.addListener(this)
}


open fun init()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    
                        if(AndroidBasicTitleProgressBar.background != 0)
                        
                                    {
                                    ResourceUtil.getInstance()!!.addResource(RESOURCE, Integer(AndroidBasicTitleProgressBar.background))
GameFeatureImageCacheFactory.init()
this.image= ImageCacheFactory.getInstance()!!.get(RESOURCE)

                                    }
                                
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.INIT, e)
}

}


open fun init(activity: Activity)
        //nullable = true from not(false or (false and false)) = true
{

                    var activity = activity

        try {
            
    
                        if(this.midletActivity != activity)
                        
                                    {
                                    this.midletActivity= activity
this.showTitleProgressBarRunnable= ShowTitleProgressBarRunnable(this.midletActivity, this)
this.dismissTitleProgressBarRunnable= DismissTitleProgressBarRunnable(this.midletActivity, this)
this.titleProgressDialogSetProgressRunnable= TitleProgressBarSetProgressRunnable(this.midletActivity, this)
this.titleProgressDialogPortionSetProgressRunnable= TitleProgressBarPortionSetProgressRunnable(this.midletActivity, this)
this.loadProgressImages()

                                    }
                                
this.updateCurrent()
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.INIT, e)
}

}


open fun updateCurrent()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    
                        if(!this.isBackground())
                        
                                    {
                                    this.animation= NullAnimationFactory.getFactoryInstance()!!.getInstance(0)

                                    }
                                
                             else 
    
                        if(AndroidBasicTitleProgressBar.background != 0)
                        
                                    {
                                    
    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!
            


    var currentImage: Image


    
                        if(displayInfo!!.isPortrait())
                        
                                    {
                                    currentImage= this.getImage(0)

                                    }
                                
                        else {
                            currentImage= this.getImage(2)

                        }
                            

    
                        if(currentImage == 
                                    null
                                )
                        
                                    {
                                    this.animation= NullAnimationFactory.getFactoryInstance()!!.getInstance(0)

                                    }
                                
                        else {
                            this.animation= ImageAnimation(currentImage, AnimationBehavior.getInstance())

                        }
                            

                                    }
                                
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.UPDATE, e)
}

}

override fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventObject = eventObject
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}

override fun onDisplayChangeEvent(displayChangeEvent: DisplayChangeEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var displayChangeEvent = displayChangeEvent

        try {
            this.loadProgressImages()
this.updateCurrent()
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION_LABEL +ExceptionUtil.getInstance()!!.getStackTrace(e), this, this.canvasStrings!!.ON_DISPLAY_CHANGE_EVENT)
this.animation= NullAnimationFactory.getFactoryInstance()!!.getInstance(0)
}

}


open fun loadProgressImages()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!
            


    var lastWidth: Int = displayInfo!!.getLastWidth()!!
            


    var lastHeight: Int = displayInfo!!.getLastHeight()!!
            


    
                        if(displayInfo!!.isPortrait(lastWidth, lastHeight))
                        
                                    {
                                    this.setImages(0, lastWidth, lastHeight)

                                    }
                                
                        else {
                            this.setImages(2, lastWidth, lastHeight)

                        }
                            
} catch(e: IllegalArgumentException)
            {logUtil!!.put("IllegalArgumentException " +ExceptionUtil.getInstance()!!.getStackTrace(e), this, 
                            "loadProgressImages")
this.animation= NullAnimationFactory.getFactoryInstance()!!.getInstance(0)
}
 catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION_LABEL +ExceptionUtil.getInstance()!!.getStackTrace(e), this, 
                            "loadProgressImages")
this.animation= NullAnimationFactory.getFactoryInstance()!!.getInstance(0)
}

}


open fun isInitialized()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(this.midletActivity != AndroidBasicTitleProgressBar.NULL_ACTIVITY)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}

override fun start()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            logUtil!!.put(commonStrings!!.START, this, commonStrings!!.START_METHOD_NAME)
super.start()
this.midletActivity!!.runOnUiThread(showTitleProgressBarRunnable)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.START_METHOD_NAME, e)
}

}

override fun end()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            logUtil!!.put(commonStrings!!.START, this, commonStrings!!.END_METHOD_NAME)
this.midletActivity!!.runOnUiThread(dismissTitleProgressBarRunnable)
super.end()
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.END_METHOD_NAME, e)
}

}

override fun addEarlyPortion(value: Int, text: String, index: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value


                    var text = text


                    var index = index

        try {
            this.portion= value
super.addEarlyPortion(value, text, index)

    
                        if(this.midletActivity != AndroidBasicTitleProgressBar.NULL_ACTIVITY)
                        
                                    {
                                    this.midletActivity!!.runOnUiThread(titleProgressDialogPortionSetProgressRunnable)

                                    }
                                
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, ADD_PORTION, e)
}

}

override fun addPortion(value: Int, text: String, index: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value


                    var text = text


                    var index = index

        try {
            this.portion= value
super.addPortion(value, text, index)
this.midletActivity!!.runOnUiThread(titleProgressDialogPortionSetProgressRunnable)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, ADD_PORTION, e)
}

}

override fun addPortion(value: Int, text: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value


                    var text = text

        try {
            this.portion= value
super.addPortion(value, text)
this.midletActivity!!.runOnUiThread(titleProgressDialogPortionSetProgressRunnable)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, ADD_PORTION, e)
}

}

override fun setValue(value: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value

        try {
            super.setValue(value)
this.midletActivity!!.runOnUiThread(titleProgressDialogSetProgressRunnable)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "setValue", e)
}

}


open fun waitUntilDisplayed()
        //nullable = true from not(false or (false and true)) = true
{}


                @Throws(Exception::class)
            
open fun setImages(index: Int, lastWidth: Int, lastHeight: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var index = index


                    var lastWidth = lastWidth


                    var lastHeight = lastHeight

    
                        if(this.image != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(Features.getInstance()!!.isFeature(MainFeatureFactory.getInstance()!!.FULL_SCREEN))
                        
                                    {
                                    
    
                        if(this.IMAGE[index] == 
                                    null
                                )
                        
                                    {
                                    this.IMAGE[index]= ImageScaleUtil.getInstance()!!.createImage(ImageCacheFactory.getInstance(), this.image, lastWidth.toFloat(), this.image.getWidth().toFloat(), lastHeight.toFloat() -20, this.image.getHeight().toFloat(), false)

                                    }
                                

                                    }
                                
                        else {
                            
    var nextIndex: Int = index +1


    
                        if(this.IMAGE[nextIndex] == 
                                    null
                                )
                        
                                    {
                                    this.IMAGE[nextIndex]= ImageScaleUtil.getInstance()!!.createImage(ImageCacheFactory.getInstance(), this.image, lastWidth.toFloat(), this.image.getWidth().toFloat(), lastHeight.toFloat() -28, this.image.getHeight().toFloat(), false)

                                    }
                                

                        }
                            

                                    }
                                
}


                @Throws(Exception::class)
            
open fun initOpenGL(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
logUtil!!.put(commonStrings!!.START, this, commonStrings!!.INIT)
this.image= GameFeatureImageCacheFactory.getInstance()!!.get(RESOURCE)

    var preResourceImageUtil: PreResourceImageUtil = PreResourceImageUtil.getInstance()!!
            


    var size: Int = this.IMAGE.size
                





                        for (index in 0 until size)


        {
    
                        if(this.IMAGE[index] != 
                                    null
                                )
                        
                                    {
                                    this.IMAGE[index]= preResourceImageUtil!!.encapsulate(this.IMAGE[index]!!)

                                    }
                                
}

this.updateCurrent()
}


                @Throws(Exception::class)
            override fun update(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
logUtil!!.put(commonStrings!!.START, this, commonStrings!!.UPDATE)
this.initOpenGL(graphics)
this.image= GameFeatureImageCacheFactory.getInstance()!!.get(RESOURCE)

    var preResourceImageUtil: PreResourceImageUtil = PreResourceImageUtil.getInstance()!!
            


    var size: Int = this.IMAGE.size
                





                        for (index in 0 until size)


        {
    
                        if(this.IMAGE[index] != 
                                    null
                                )
                        
                                    {
                                    preResourceImageUtil!!.update(graphics, this.IMAGE[index]!!)

                                    }
                                
}

}


                @Throws(Exception::class)
            
open fun getImage(index: Int)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var index = index

    var image: Image = NullCanvas.NULL_IMAGE


    
                        if(Features.getInstance()!!.isFeature(MainFeatureFactory.getInstance()!!.FULL_SCREEN))
                        
                                    {
                                    image= this.IMAGE[index]!!

                                    }
                                
                        else {
                            image= this.IMAGE[index +1]!!

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}

override fun paint2(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics

        try {
            animation.paint(graphics, 0, 20)
super.paint2(graphics)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, canvasStrings!!.PAINT, e)
}

}

override fun setBackground(background: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var background = background
super.setBackground(background)
this.updateCurrent()
}


open fun setPortion(portion: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var portion = portion
this.portion= portion
}


open fun getPortion()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return portion
}


}
                
            

