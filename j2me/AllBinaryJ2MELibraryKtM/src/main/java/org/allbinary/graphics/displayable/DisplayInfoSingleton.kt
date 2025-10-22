
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

open public class DisplayInfoSingleton
            : Object
         {
        
companion object {
            
    private val SINGLETON: DisplayInfoSingleton = DisplayInfoSingleton()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: DisplayInfoSingleton{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
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
                        return lastHalf
}


    open fun getLast()
        //nullable = true from not(false or (false and true)) = true
: IntArray{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return last
}


    open fun getFull()
        //nullable = true from not(false or (false and true)) = true
: IntArray{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return full
}


    open fun getScaleLargestTo()
        //nullable = true from not(false or (false and true)) = true
: Float{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return scaleLargestTo
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

    
                        if(this.full[WIDTH] != aLastWidth || this.full[HEIGHT] != aLastHeight)
                        
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

logUtil!!.put(stringMaker!!.append(CommonLabels.getInstance()!!.START_LABEL)!!.append(reason)!!.toString(), this, SET_LAST_SIZE_METHOD_NAME)

    var aFullWidth: Int = aLastWidth


    var aFullHeight: Int = aLastHeight

stringMaker!!.delete(0, stringMaker!!.length())
logUtil!!.put(stringMaker!!.append(FULL_WIDTH)!!.append(aFullWidth)!!.append(FULL_HEIGHT)!!.append(aFullHeight)!!.append(this.toString())!!.toString(), this, SET_LAST_SIZE_METHOD_NAME)

    var operatingSystemInterface: GenericOperatingSystem = OperatingSystemFactory.getInstance()!!.getOperatingSystemInstance()!!


    
                        if(operatingSystemInterface!!.isOverScan())
                        
                                    {
                                    aLastWidth= aLastWidth *operatingSystemInterface!!.getOverScanXPercent() /100
aLastHeight= aLastHeight *operatingSystemInterface!!.getOverScanYPercent() /100

                                    }
                                

    
                        if(operatingSystemInterface!!.isScalable())
                        
                                    {
                                    
    
                        if(this.isPortrait(aLastWidth, aLastHeight))
                        
                                    {
                                    
    
                        if(aLastHeight > scaleLargestTo)
                        
                                    {
                                    this.displayRatio= scaleLargestTo /aLastHeight
this.ratio= aLastHeight /scaleLargestTo
stringMaker!!.delete(0, stringMaker!!.length())
logUtil!!.put(stringMaker!!.append(this.ADJUSTING_FOR_SCALING_IN_PORTRAIT)!!.append(displayRatio)!!.toString(), this, SET_LAST_SIZE_METHOD_NAME)
aLastWidth= (aLastWidth *displayRatio).toInt()
aLastHeight= (aLastHeight *displayRatio).toInt()
this.scalableListener!!.scale(ratio.toFloat())

                                    }
                                
                        else {
                            this.ratio= 1.0f
this.scalableListener!!.scale(ratio.toFloat())

                        }
                            

                                    }
                                
                        else {
                            
    
                        if(aLastWidth > scaleLargestTo)
                        
                                    {
                                    this.displayRatio= scaleLargestTo /aLastWidth
this.ratio= aLastWidth /scaleLargestTo
stringMaker!!.delete(0, stringMaker!!.length())
logUtil!!.put(stringMaker!!.append(this.ADJUSTING_FOR_SCALING_IN_LANDSCAPE)!!.append(displayRatio)!!.toString(), this, SET_LAST_SIZE_METHOD_NAME)
aLastWidth= (aLastWidth *displayRatio).toInt()
aLastHeight= (aLastHeight *displayRatio).toInt()
this.scalableListener!!.scale(ratio.toFloat())

                                    }
                                
                        else {
                            this.ratio= 1.0f
this.scalableListener!!.scale(ratio.toFloat())

                        }
                            

                        }
                            

                                    }
                                
stringMaker!!.delete(0, stringMaker!!.length())
logUtil!!.put(stringMaker!!.append(LAST_WIDTH)!!.append(aLastWidth)!!.append(LAST_HEIGHT)!!.append(aLastHeight)!!.toString(), this, SET_LAST_SIZE_METHOD_NAME)
this.xOffset= aFullWidth -aLastWidth
this.yOffset= aFullHeight -aLastHeight
this.left= this.scalableListener!!.getLeft(this.xOffset)
this.top= this.scalableListener!!.getTop(this.yOffset)
this.full[WIDTH]= aFullWidth
this.full[HEIGHT]= aFullHeight
last[WIDTH]= aLastWidth
lastHalf[WIDTH]= (last[WIDTH] shr 1)
last[HEIGHT]= aLastHeight
lastHalf[HEIGHT]= (last[HEIGHT] shr 1)
SWTJOGLProcessor.getInstance()!!.setCustom(aLastWidth, aLastHeight, this.ratio)
this.add(SET_LAST_SIZE_METHOD_NAME)
}


    open fun isPortrait(lastWidth: Int, lastHeight: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var lastWidth = lastWidth
var lastHeight = lastHeight

    
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
                        return this.isPortrait(this.last[WIDTH]!!, this.last[HEIGHT]!!)
}


    val displayChangeEvent: DisplayChangeEvent = DisplayChangeEvent(this)

    private val FIRE_METHOD_NAME: String = "fire"

    private val REASON: String = "reason: "

    private val UPDATE_FROM_ORIENTATION_CHANGE: String = "Updating from Orientation Change "

    private val list: BasicArrayList = BasicArrayList()

    open fun add(reason: String)
        //nullable = true from not(false or (false and false)) = true
{
    //var reason = reason

    var stringMaker: StringMaker = StringMaker()

logUtil!!.put(stringMaker!!.append(REASON)!!.append(reason)!!.toString(), this, FIRE_METHOD_NAME)
stringMaker!!.delete(0, stringMaker!!.length())
logUtil!!.put(this.toString(stringMaker), this, FIRE_METHOD_NAME)
list.add(reason)
}


    open fun process()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            
    
                        if(list.size() > 0)
                        
                                    {
                                    this.processForced()

                                    }
                                
list.clear()
} catch(e: Exception)
            {
PreLogUtil.put(commonStrings!!.EXCEPTION, this, FIRE_METHOD_NAME, e)
}

}


    open fun processForced()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            
    var swtJOGLProcessor: SWTJOGLProcessor = SWTJOGLProcessor.getInstance()!!

swtJOGLProcessor!!.clear()
DisplayChangeEventHandler.getInstance()!!.fireEvent(displayChangeEvent)
LastDisplayChangeEventHandler.getInstance()!!.fireEvent(displayChangeEvent)
swtJOGLProcessor!!.onSurfaceChanged()
} catch(e: Exception)
            {
PreLogUtil.put(commonStrings!!.EXCEPTION, this, FIRE_METHOD_NAME, e)
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

logUtil!!.put(stringMaker!!.append(CommonLabels.getInstance()!!.START_LABEL)!!.append(reason)!!.append(LAST_WIDTH)!!.append(aLastWidth)!!.append(LAST_HEIGHT)!!.append(aLastHeight)!!.append(commonSeps!!.SPACE)!!.append(this.toString())!!.toString(), this, commonStrings!!.UPDATE)

    
                        if(aLastWidth > 0 && aLastHeight > 0)
                        
                                    {
                                    
    
                        if(this.last[WIDTH] != aLastWidth || this.last[HEIGHT] != aLastHeight)
                        
                                    {
                                    stringMaker!!.delete(0, stringMaker!!.length())
logUtil!!.put(stringMaker!!.append(UPDATE_FROM_ORIENTATION_CHANGE)!!.toString(), this, commonStrings!!.UPDATE)

    var operatingSystemInterface: GenericOperatingSystem = OperatingSystemFactory.getInstance()!!.getOperatingSystemInstance()!!


    
                        if(operatingSystemInterface!!.isOverScan())
                        
                                    {
                                    aLastWidth= aLastWidth *operatingSystemInterface!!.getOverScanXPercent() /100
aLastHeight= aLastHeight *operatingSystemInterface!!.getOverScanYPercent() /100

                                    }
                                

    
                        if(operatingSystemInterface!!.isScalable())
                        
                                    {
                                    
    
                        if(this.isPortrait(aLastWidth, aLastHeight))
                        
                                    {
                                    
    
                        if(aLastHeight > scaleLargestTo)
                        
                                    {
                                    this.displayRatio= scaleLargestTo /aLastHeight
this.ratio= aLastHeight /scaleLargestTo
stringMaker!!.delete(0, stringMaker!!.length())
logUtil!!.put(stringMaker!!.append(this.ADJUSTING_FOR_SCALING_IN_PORTRAIT)!!.append(displayRatio)!!.toString(), this, commonStrings!!.UPDATE)
aLastWidth= (aLastWidth *displayRatio).toInt()
aLastHeight= (aLastHeight *displayRatio).toInt()
this.scalableListener!!.scale(ratio.toFloat())

                                    }
                                
                        else {
                            this.ratio= 1.0f
this.scalableListener!!.scale(ratio.toFloat())

                        }
                            

                                    }
                                
                        else {
                            logUtil!!.put("Found Landscape Orientation", this, commonStrings!!.UPDATE)

    
                        if(aLastWidth > scaleLargestTo)
                        
                                    {
                                    this.displayRatio= scaleLargestTo /aLastWidth
this.ratio= aLastWidth /scaleLargestTo
stringMaker!!.delete(0, stringMaker!!.length())
logUtil!!.put(stringMaker!!.append(this.ADJUSTING_FOR_SCALING_IN_LANDSCAPE)!!.append(displayRatio)!!.toString(), this, commonStrings!!.UPDATE)
aLastWidth= (aLastWidth *displayRatio).toInt()
aLastHeight= (aLastHeight *displayRatio).toInt()
this.scalableListener!!.scale(ratio.toFloat())

                                    }
                                
                        else {
                            this.ratio= 1.0f
this.scalableListener!!.scale(ratio.toFloat())

                        }
                            

                        }
                            

                                    }
                                
stringMaker!!.delete(0, stringMaker!!.length())
logUtil!!.put(stringMaker!!.append(UPDATE_FROM_ORIENTATION_CHANGE)!!.append(LAST_WIDTH)!!.append(aLastWidth)!!.append(LAST_HEIGHT)!!.append(aLastHeight)!!.toString(), this, commonStrings!!.UPDATE)
this.xOffset= aFullWidth -aLastWidth
this.yOffset= aFullHeight -aLastHeight
this.left= this.scalableListener!!.getLeft(this.xOffset)
this.top= this.scalableListener!!.getTop(this.yOffset)
this.full[WIDTH]= aFullWidth
this.full[HEIGHT]= aFullHeight
last[WIDTH]= aLastWidth
lastHalf[WIDTH]= (last[WIDTH] shr 1)
last[HEIGHT]= aLastHeight
lastHalf[HEIGHT]= (last[HEIGHT] shr 1)
SWTJOGLProcessor.getInstance()!!.setCustom(aLastWidth, aLastHeight, this.ratio)
this.add(commonStrings!!.UPDATE)



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
                        return this.toString(stringBuffer)
}


    open fun toString(stringBuffer: StringMaker)
        //nullable = true from not(false or (true and false)) = true
: String{
    //var stringBuffer = stringBuffer
stringBuffer!!.append(DISPLAY_INFO)
stringBuffer!!.append(FULL)
stringBuffer!!.append(commonLabels!!.WIDTH_LABEL)
stringBuffer!!.append(full[WIDTH]!!)
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(FULL)
stringBuffer!!.append(commonLabels!!.HEIGHT_LABEL)
stringBuffer!!.append(full[HEIGHT]!!)
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(LAST)
stringBuffer!!.append(commonLabels!!.WIDTH_LABEL)
stringBuffer!!.append(last[WIDTH]!!)
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(LAST)
stringBuffer!!.append(commonLabels!!.HEIGHT_LABEL)
stringBuffer!!.append(last[HEIGHT]!!)
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(LAST_HALF)
stringBuffer!!.append(commonLabels!!.WIDTH_LABEL)
stringBuffer!!.append(lastHalf[WIDTH]!!)
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(LAST_HALF)
stringBuffer!!.append(commonLabels!!.HEIGHT_LABEL)
stringBuffer!!.append(lastHalf[HEIGHT]!!)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


    open fun getTop()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return top
}


    open fun getLeft()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return left
}


    open fun getLastWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.last[WIDTH]!!
}


    open fun getLastHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.last[HEIGHT]!!
}


    open fun getLastHalfWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.lastHalf[WIDTH]!!
}


    open fun getLastHalfHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.lastHalf[HEIGHT]!!
}


    open fun getCustomLastWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.last[CUSTOM_WIDTH]!!
}


    open fun getCustomLastHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.last[CUSTOM_HEIGHT]!!
}


    open fun getRawLastWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.last[WIDTH]!!
}


    open fun getRawLastHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.last[HEIGHT]!!
}


    open fun setCustom(width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var width = width
    //var height = height
this.last[CUSTOM_WIDTH]= width
this.lastHalf[CUSTOM_WIDTH]= (last[CUSTOM_WIDTH] shr 1)
this.last[CUSTOM_HEIGHT]= height
this.lastHalf[CUSTOM_HEIGHT]= (last[CUSTOM_HEIGHT] shr 1)
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
                        return scalableListener
}


    open fun getRatio()
        //nullable = true from not(false or (false and true)) = true
: Float{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ratio
}


    open fun getDisplayRatio()
        //nullable = true from not(false or (false and true)) = true
: Float{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return displayRatio
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
                        return xOffset
}


    open fun getyOffset()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return yOffset
}


}
                
            

