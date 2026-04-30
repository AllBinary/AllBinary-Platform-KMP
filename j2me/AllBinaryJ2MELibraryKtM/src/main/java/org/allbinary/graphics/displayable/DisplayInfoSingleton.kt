
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
        package org.allbinary.graphics.displayable




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Displayable
import org.allbinary.AndroidUtil
import org.allbinary.graphics.displayable.event.DisplayChangeEvent
import org.allbinary.graphics.displayable.event.DisplayChangeEventHandler
import org.allbinary.graphics.displayable.event.LastDisplayChangeEventHandler
import org.allbinary.graphics.threed.SWTJOGLProcessor
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.os.GenericOperatingSystem
import org.allbinary.logic.system.os.OperatingSystemFactory
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListD

open public class DisplayInfoSingleton
            : Object
         {
        
companion object {
            
    private val SINGLETON: DisplayInfoSingleton = DisplayInfoSingleton()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: DisplayInfoSingleton{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DisplayInfoSingleton.SINGLETON
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonLabels: CommonLabels = CommonLabels.getInstance()!!

    private val commonSeps: CommonSeps = CommonSeps.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    val ORIENTATION: String = "ORIENTATION"

    val ADJUSTING_FOR_SCALING_IN_PORTRAIT: String = "Adjusting for Scaling in portrait display ratio: "

    val ADJUSTING_FOR_SCALING_IN_LANDSCAPE: String = "Adjusting for Scaling in landscape display ratio: "

    private var last: IntArray = IntArray(4)

    private var lastHalf: IntArray = IntArray(4)

    private var full: IntArray = IntArray(4)

    private var top: Int= 0

    private var left: Int= 0

    private var xOffset: Int= 0

    private var yOffset: Int= 0

    private var scaleLargestTo: Float= 0.0f

    val WIDTH: Int = 0

    val HEIGHT: Int = 1

    val CUSTOM_WIDTH: Int = 2

    val CUSTOM_HEIGHT: Int = 3

    private var scalableListener: BaseScalable = BaseScalable()

    private var displayRatio: Float= 0.0f

    private var ratio: Float = 1.0f
private constructor ()
            : super()
        {

    
                        if(AndroidUtil.isAndroid())
                        
                                    {
                                    this.scaleLargestTo= 640.toFloat()

                                    }
                                
                        else {
                            this.scaleLargestTo= 1080.toFloat()

                        }
                            
}


    open fun getLastHalf()
        //nullable = true from not(false or (false and true)) = true
: IntArray{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.lastHalf
}


    open fun getLast()
        //nullable = true from not(false or (false and true)) = true
: IntArray{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.last
}


    open fun getFull()
        //nullable = true from not(false or (false and true)) = true
: IntArray{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.full
}


    open fun getScaleLargestTo()
        //nullable = true from not(false or (false and true)) = true
: Float{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.scaleLargestTo
}


    open fun setScaleLargestTo(scaleLargestTo: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var scaleLargestTo = scaleLargestTo
this.scaleLargestTo= scaleLargestTo.toFloat()
}


    private val SET_LAST_SIZE_METHOD_NAME: String = "setLastSize"

    private val FULL_WIDTH: String = " FullWidth: "

    private val FULL_HEIGHT: String = " FullHeight: "

    private val LAST_WIDTH: String = "LastWidth: "

    private val LAST_HEIGHT: String = " LastHeight: "

    open fun setLastSize(aLastWidth: Int, aLastHeight: Int, reason: String)
        //nullable = true from not(false or (false and false)) = true
{
    //var aLastWidth = aLastWidth
    //var aLastHeight = aLastHeight
    //var reason = reason

    
                        if(this.full[this.WIDTH] != aLastWidth || this.full[this.HEIGHT] != aLastHeight)
                        
                                    {
                                    this.setLastSizeForce(aLastWidth, aLastHeight, reason)

                                    }
                                
}


    open fun setLastSizeForce(aLastWidth: Int, aLastHeight: Int, reason: String)
        //nullable = true from not(false or (false and false)) = true
{
var aLastWidth = aLastWidth
var aLastHeight = aLastHeight
    //var reason = reason

    var stringMaker: StringMaker = StringMaker()

this.logUtil!!.putF(stringMaker!!.append(CommonLabels.getInstance()!!.START_LABEL)!!.append(reason)!!.toString(), this, this.SET_LAST_SIZE_METHOD_NAME)

    var aFullWidth: Int = aLastWidth


    var aFullHeight: Int = aLastHeight

stringMaker!!.delete(0, stringMaker!!.length())
this.logUtil!!.putF(stringMaker!!.append(this.FULL_WIDTH)!!.appendint(aFullWidth)!!.append(this.FULL_HEIGHT)!!.appendint(aFullHeight)!!.append(this.toString())!!.toString(), this, this.SET_LAST_SIZE_METHOD_NAME)

    var operatingSystemInterface: GenericOperatingSystem = OperatingSystemFactory.getInstance()!!.getOperatingSystemInstance()!!


    
                        if(operatingSystemInterface!!.isOverScan())
                        
                                    {
                                    aLastWidth= aLastWidth *operatingSystemInterface!!.getOverScanXPercent() /100
aLastHeight= aLastHeight *operatingSystemInterface!!.getOverScanYPercent() /100

                                    }
                                

    
                        if(operatingSystemInterface!!.isScalable())
                        
                                    {
                                    
    
                        if(this.isPortraitWH(aLastWidth, aLastHeight))
                        
                                    {
                                    
    
                        if(aLastHeight > this.scaleLargestTo)
                        
                                    {
                                    this.displayRatio= this.scaleLargestTo /aLastHeight
this.ratio= aLastHeight /this.scaleLargestTo
stringMaker!!.delete(0, stringMaker!!.length())
this.logUtil!!.putF(stringMaker!!.append(this.ADJUSTING_FOR_SCALING_IN_PORTRAIT)!!.appendfloat(this.displayRatio)!!.toString(), this, this.SET_LAST_SIZE_METHOD_NAME)
aLastWidth= (aLastWidth *this.displayRatio).toInt()
aLastHeight= (aLastHeight *this.displayRatio).toInt()
this.scalableListener!!.scale(this.ratio.toFloat())

                                    }
                                
                        else {
                            this.ratio= 1.0f
this.scalableListener!!.scale(this.ratio.toFloat())

                        }
                            

                                    }
                                
                        else {
                            
    
                        if(aLastWidth > this.scaleLargestTo)
                        
                                    {
                                    this.displayRatio= this.scaleLargestTo /aLastWidth
this.ratio= aLastWidth /this.scaleLargestTo
stringMaker!!.delete(0, stringMaker!!.length())
this.logUtil!!.putF(stringMaker!!.append(this.ADJUSTING_FOR_SCALING_IN_LANDSCAPE)!!.appendfloat(this.displayRatio)!!.toString(), this, this.SET_LAST_SIZE_METHOD_NAME)
aLastWidth= (aLastWidth *this.displayRatio).toInt()
aLastHeight= (aLastHeight *this.displayRatio).toInt()
this.scalableListener!!.scale(this.ratio.toFloat())

                                    }
                                
                        else {
                            this.ratio= 1.0f
this.scalableListener!!.scale(this.ratio.toFloat())

                        }
                            

                        }
                            

                                    }
                                
stringMaker!!.delete(0, stringMaker!!.length())
this.logUtil!!.putF(stringMaker!!.append(this.LAST_WIDTH)!!.appendint(aLastWidth)!!.append(this.LAST_HEIGHT)!!.appendint(aLastHeight)!!.toString(), this, this.SET_LAST_SIZE_METHOD_NAME)
this.xOffset= aFullWidth -aLastWidth
this.yOffset= aFullHeight -aLastHeight
this.left= this.scalableListener!!.getLeft(this.xOffset)
this.top= this.scalableListener!!.getTop(this.yOffset)
this.full[this.WIDTH]= aFullWidth
this.full[this.HEIGHT]= aFullHeight
this.last[this.WIDTH]= aLastWidth
this.lastHalf[this.WIDTH]= (this.last[this.WIDTH] shr 1)
this.last[this.HEIGHT]= aLastHeight
this.lastHalf[this.HEIGHT]= (this.last[this.HEIGHT] shr 1)
SWTJOGLProcessor.getInstance()!!.setCustom(aLastWidth, aLastHeight, this.ratio)
this.add(this.SET_LAST_SIZE_METHOD_NAME)
}


    open fun isPortraitWH(lastWidth: Int, lastHeight: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var lastWidth = lastWidth
    //var lastHeight = lastHeight

    
                        if(lastHeight > lastWidth)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


    open fun isPortrait()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.isPortraitWH(this.last[this.WIDTH]!!, this.last[this.HEIGHT]!!)
}


    val displayChangeEvent: DisplayChangeEvent = DisplayChangeEvent(this)

    private val FIRE_METHOD_NAME: String = "fire"

    private val REASON: String = "reason: "

    private val UPDATE_FROM_ORIENTATION_CHANGE: String = "Updating from Orientation Change "

    private val list: BasicArrayList = BasicArrayListD()

    open fun add(reason: String)
        //nullable = true from not(false or (false and false)) = true
{
    //var reason = reason

    var stringMaker: StringMaker = StringMaker()

this.logUtil!!.putF(stringMaker!!.append(this.REASON)!!.append(reason)!!.toString(), this, this.FIRE_METHOD_NAME)
stringMaker!!.delete(0, stringMaker!!.length())
this.logUtil!!.putF(this.toStringAppend(stringMaker), this, this.FIRE_METHOD_NAME)
this.list.add(reason)
}


    open fun process()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            
    
                        if(this.list.size() > 0)
                        
                                    {
                                    this.processForced()

                                    }
                                
this.list.clear()
} catch(e: Exception)
            {
PreLogUtil.putOE(this.commonStrings!!.EXCEPTION, this, this.FIRE_METHOD_NAME, e)
}

}


    open fun processForced()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            
    var swtJOGLProcessor: SWTJOGLProcessor = SWTJOGLProcessor.getInstance()!!

swtJOGLProcessor!!.clear()
DisplayChangeEventHandler.getInstance()!!.fireEvent(this.displayChangeEvent)
LastDisplayChangeEventHandler.getInstance()!!.fireEvent(this.displayChangeEvent)
swtJOGLProcessor!!.onSurfaceChanged()
} catch(e: Exception)
            {
PreLogUtil.putOE(this.commonStrings!!.EXCEPTION, this, this.FIRE_METHOD_NAME, e)
}

}


    open fun update(displayable: Displayable, reason: String)
        //nullable = true from not(false or (false and false)) = true
{
    //var displayable = displayable
    //var reason = reason

    var aLastWidth: Int = displayable.getWidth()!!


    var aLastHeight: Int = displayable.getHeight()!!


    var aFullWidth: Int = aLastWidth


    var aFullHeight: Int = aLastHeight


    var stringMaker: StringMaker = StringMaker()

this.logUtil!!.putF(stringMaker!!.append(CommonLabels.getInstance()!!.START_LABEL)!!.append(reason)!!.append(this.LAST_WIDTH)!!.appendint(aLastWidth)!!.append(this.LAST_HEIGHT)!!.appendint(aLastHeight)!!.append(this.commonSeps!!.SPACE)!!.append(this.toString())!!.toString(), this, this.commonStrings!!.UPDATE)

    
                        if(aLastWidth > 0 && aLastHeight > 0)
                        
                                    {
                                    
    
                        if(this.last[this.WIDTH] != aLastWidth || this.last[this.HEIGHT] != aLastHeight)
                        
                                    {
                                    stringMaker!!.delete(0, stringMaker!!.length())
this.logUtil!!.putF(stringMaker!!.append(this.UPDATE_FROM_ORIENTATION_CHANGE)!!.toString(), this, this.commonStrings!!.UPDATE)

    var operatingSystemInterface: GenericOperatingSystem = OperatingSystemFactory.getInstance()!!.getOperatingSystemInstance()!!


    
                        if(operatingSystemInterface!!.isOverScan())
                        
                                    {
                                    aLastWidth= aLastWidth *operatingSystemInterface!!.getOverScanXPercent() /100
aLastHeight= aLastHeight *operatingSystemInterface!!.getOverScanYPercent() /100

                                    }
                                

    
                        if(operatingSystemInterface!!.isScalable())
                        
                                    {
                                    
    
                        if(this.isPortraitWH(aLastWidth, aLastHeight))
                        
                                    {
                                    
    
                        if(aLastHeight > this.scaleLargestTo)
                        
                                    {
                                    this.displayRatio= this.scaleLargestTo /aLastHeight
this.ratio= aLastHeight /this.scaleLargestTo
stringMaker!!.delete(0, stringMaker!!.length())
this.logUtil!!.putF(stringMaker!!.append(this.ADJUSTING_FOR_SCALING_IN_PORTRAIT)!!.appendfloat(this.displayRatio)!!.toString(), this, this.commonStrings!!.UPDATE)
aLastWidth= (aLastWidth *this.displayRatio).toInt()
aLastHeight= (aLastHeight *this.displayRatio).toInt()
this.scalableListener!!.scale(this.ratio.toFloat())

                                    }
                                
                        else {
                            this.ratio= 1.0f
this.scalableListener!!.scale(this.ratio.toFloat())

                        }
                            

                                    }
                                
                        else {
                            this.logUtil!!.putF("Found Landscape Orientation", this, this.commonStrings!!.UPDATE)

    
                        if(aLastWidth > this.scaleLargestTo)
                        
                                    {
                                    this.displayRatio= this.scaleLargestTo /aLastWidth
this.ratio= aLastWidth /this.scaleLargestTo
stringMaker!!.delete(0, stringMaker!!.length())
this.logUtil!!.putF(stringMaker!!.append(this.ADJUSTING_FOR_SCALING_IN_LANDSCAPE)!!.appendfloat(this.displayRatio)!!.toString(), this, this.commonStrings!!.UPDATE)
aLastWidth= (aLastWidth *this.displayRatio).toInt()
aLastHeight= (aLastHeight *this.displayRatio).toInt()
this.scalableListener!!.scale(this.ratio.toFloat())

                                    }
                                
                        else {
                            this.ratio= 1.0f
this.scalableListener!!.scale(this.ratio.toFloat())

                        }
                            

                        }
                            

                                    }
                                
stringMaker!!.delete(0, stringMaker!!.length())
this.logUtil!!.putF(stringMaker!!.append(this.UPDATE_FROM_ORIENTATION_CHANGE)!!.append(this.LAST_WIDTH)!!.appendint(aLastWidth)!!.append(this.LAST_HEIGHT)!!.appendint(aLastHeight)!!.toString(), this, this.commonStrings!!.UPDATE)
this.xOffset= aFullWidth -aLastWidth
this.yOffset= aFullHeight -aLastHeight
this.left= this.scalableListener!!.getLeft(this.xOffset)
this.top= this.scalableListener!!.getTop(this.yOffset)
this.full[this.WIDTH]= aFullWidth
this.full[this.HEIGHT]= aFullHeight
this.last[this.WIDTH]= aLastWidth
this.lastHalf[this.WIDTH]= (this.last[this.WIDTH] shr 1)
this.last[this.HEIGHT]= aLastHeight
this.lastHalf[this.HEIGHT]= (this.last[this.HEIGHT] shr 1)
SWTJOGLProcessor.getInstance()!!.setCustom(aLastWidth, aLastHeight, this.ratio)
this.add(this.commonStrings!!.UPDATE)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

                                    }
                                
}


    private val DISPLAY_INFO: String = "Display Info: "

    private val FULL: String = "full"

    private val LAST: String = "last"

    private val LAST_HALF: String = "lastHalf"

    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var stringBuffer: StringMaker = StringMaker()




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.toStringAppend(stringBuffer)
}


    open fun toStringAppend(stringBuffer: StringMaker)
        //nullable = true from not(false or (false and false)) = true
: String{
    //var stringBuffer = stringBuffer
stringBuffer!!.append(this.DISPLAY_INFO)
stringBuffer!!.append(this.FULL)
stringBuffer!!.append(this.commonLabels!!.WIDTH_LABEL)
stringBuffer!!.appendint(this.full[this.WIDTH]!!)
stringBuffer!!.append(this.commonSeps!!.SPACE)
stringBuffer!!.append(this.FULL)
stringBuffer!!.append(this.commonLabels!!.HEIGHT_LABEL)
stringBuffer!!.appendint(this.full[this.HEIGHT]!!)
stringBuffer!!.append(this.commonSeps!!.SPACE)
stringBuffer!!.append(this.LAST)
stringBuffer!!.append(this.commonLabels!!.WIDTH_LABEL)
stringBuffer!!.appendint(this.last[this.WIDTH]!!)
stringBuffer!!.append(this.commonSeps!!.SPACE)
stringBuffer!!.append(this.LAST)
stringBuffer!!.append(this.commonLabels!!.HEIGHT_LABEL)
stringBuffer!!.appendint(this.last[this.HEIGHT]!!)
stringBuffer!!.append(this.commonSeps!!.SPACE)
stringBuffer!!.append(this.LAST_HALF)
stringBuffer!!.append(this.commonLabels!!.WIDTH_LABEL)
stringBuffer!!.appendint(this.lastHalf[this.WIDTH]!!)
stringBuffer!!.append(this.commonSeps!!.SPACE)
stringBuffer!!.append(this.LAST_HALF)
stringBuffer!!.append(this.commonLabels!!.HEIGHT_LABEL)
stringBuffer!!.appendint(this.lastHalf[this.HEIGHT]!!)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


    open fun getTop()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.top
}


    open fun getLeft()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.left
}


    open fun getLastWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.last[this.WIDTH]!!
}


    open fun getLastHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.last[this.HEIGHT]!!
}


    open fun getLastHalfWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.lastHalf[this.WIDTH]!!
}


    open fun getLastHalfHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.lastHalf[this.HEIGHT]!!
}


    open fun getCustomLastWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.last[this.CUSTOM_WIDTH]!!
}


    open fun getCustomLastHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.last[this.CUSTOM_HEIGHT]!!
}


    open fun getRawLastWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.last[this.WIDTH]!!
}


    open fun getRawLastHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.last[this.HEIGHT]!!
}


    open fun setCustom(width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var width = width
    //var height = height
this.last[this.CUSTOM_WIDTH]= width
this.lastHalf[this.CUSTOM_WIDTH]= (this.last[this.CUSTOM_WIDTH] shr 1)
this.last[this.CUSTOM_HEIGHT]= height
this.lastHalf[this.CUSTOM_HEIGHT]= (this.last[this.CUSTOM_HEIGHT] shr 1)
}


    open fun setScalableListener(scalableListener: BaseScalable)
        //nullable = true from not(false or (false and false)) = true
{
var scalableListener = scalableListener
this.scalableListener= scalableListener
}


    open fun getScalableListener()
        //nullable = true from not(false or (false and true)) = true
: ScalableListener{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.scalableListener
}


    open fun getRatio()
        //nullable = true from not(false or (false and true)) = true
: Float{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.ratio
}


    open fun getDisplayRatio()
        //nullable = true from not(false or (false and true)) = true
: Float{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.displayRatio
}


    open fun setOffset(left: Int, top: Int)
        //nullable = true from not(false or (false and false)) = true
{
var left = left
var top = top
this.left= left
}


    open fun getxOffset()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.xOffset
}


    open fun getyOffset()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.yOffset
}


}
                
            

