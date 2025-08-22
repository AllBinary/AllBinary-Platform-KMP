
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
        package org.allbinary.game.graphics.hud




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.HTMLFeatureFactory
import org.allbinary.graphics.Anchor
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.color.BasicColorSetUtil
import org.allbinary.graphics.displayable.CanvasStrings
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.displayable.event.DisplayChangeEvent
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.string.CommonStrings

open public class BasicHud
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val canvasStrings: CanvasStrings = CanvasStrings.getInstance()!!

    private var location: Int= 0

    private var direction: Int= 0

    private var bufferZone: Int= 0

    private var bufferZoneY: Int= 0

    private var maxWidth: Int= 0

    private var maxHeight: Int= 0

    private var hudGraphicsPosition: HudGraphicsPosition = HudGraphicsPosition.NULL_HUD_GRAPHICS_POSITION

    private var x: Int= 0

    private var y: Int= 0

    val basicSetColorUtil: BasicColorSetUtil = BasicColorSetUtil.getInstance()!!

    private var basicColor: BasicColor = BasicColorFactory.getInstance()!!.BLACK

    private var color: Int
public constructor        (location: Int, direction: Int, maxHeight: Int, maxWidth: Int, bufferZone: Int)                        

                            : this(location, direction, maxHeight, maxWidth, bufferZone, BasicColorFactory.getInstance()!!.WHITE){

                    var location = location


                    var direction = direction


                    var maxHeight = maxHeight


                    var maxWidth = maxWidth


                    var bufferZone = bufferZone


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (location: Int, direction: Int, maxHeight: Int, maxWidth: Int, bufferZone: Int, basicColor: BasicColor)
            : super()
        {

                    var location = location


                    var direction = direction


                    var maxHeight = maxHeight


                    var maxWidth = maxWidth


                    var bufferZone = bufferZone


                    var basicColor = basicColor
this.setLocation(location)
this.setDirection(direction)
this.setBufferZone(bufferZone)
this.setMaxWidth(maxWidth)
this.setMaxHeight(maxHeight)
this.onDisplayChangeEvent(DisplayInfoSingleton.getInstance()!!.displayChangeEvent)
this.setBasicColorP(basicColor)
this.color= basicColor!!.toInt()
}


open fun getLocation()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.location
}


open fun getDirection()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.direction
}


                @Throws(Exception::class)
            
open fun getHudGraphicsPosition(width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
: HudGraphicsPosition{

                    var width = width


                    var height = height

    var x: Int = 0


    var y: Int = 0


    var anchor: Int = 0


    var basicHudFactory: BasicHudFactory = BasicHudFactory.getInstance()!!


    
                        if(basicHudFactory!!.BOTTOMLEFT == this.getLocation())
                        
                                    {
                                    x= bufferZone +2
y= height -maxHeight -bufferZone
anchor= Graphics.BOTTOM and Graphics.LEFT

                                    }
                                
                             else 
    
                        if(basicHudFactory!!.BOTTOMRIGHT == this.getLocation())
                        
                                    {
                                    x= width -maxWidth
y= height -maxHeight -bufferZone
anchor= Graphics.BOTTOM and Graphics.RIGHT

                                    }
                                
                             else 
    
                        if(basicHudFactory!!.TOPLEFT == this.getLocation())
                        
                                    {
                                    x= bufferZone +2
y= bufferZoneY
anchor= Anchor.TOP_LEFT

                                    }
                                
                             else 
    
                        if(basicHudFactory!!.TOPRIGHT == this.getLocation())
                        
                                    {
                                    x= width -maxWidth
y= bufferZoneY
anchor= Graphics.TOP and Graphics.RIGHT

                                    }
                                
                             else 
    
                        if(basicHudFactory!!.TOPCENTER == this.getLocation())
                        
                                    {
                                    x= ((width -maxWidth) /2)
y= bufferZoneY
anchor= Graphics.TOP and Graphics.HCENTER

                                    }
                                
                             else 
    
                        if(basicHudFactory!!.BOTTOMCENTER == this.getLocation())
                        
                                    {
                                    x= ((width -maxWidth) /2)
y= height -maxHeight -bufferZone
anchor= Graphics.BOTTOM and Graphics.HCENTER

                                    }
                                
                             else 
    
                        if(basicHudFactory!!.ABSOLUTE == this.getLocation())
                        
                                    {
                                    x= maxHeight
y= maxWidth
anchor= 0

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return HudGraphicsPosition(this.getPoint(x, y), anchor)
}


open fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{

                    var eventObject = eventObject
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}


open fun onDisplayChangeEvent(displayChangeEvent: DisplayChangeEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var displayChangeEvent = displayChangeEvent

        try {
            
    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!

this.hudGraphicsPosition= this.getHudGraphicsPosition(displayInfo!!.getLastWidth(), displayInfo!!.getLastHeight())
x= this.hudGraphicsPosition!!.getPoint()!!.getX()
this.setY(this.hudGraphicsPosition!!.getPoint()!!.getY())
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, canvasStrings!!.ON_DISPLAY_CHANGE_EVENT, e)
}

}


open fun getPoint(x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: GPoint{

                    var x = x


                    var y = y



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PointFactory.getInstance()!!.getInstance(x, y)
}


open fun getBufferZone()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bufferZone
}


open fun setBufferZone(bufferZone: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var bufferZone = bufferZone
this.bufferZone= bufferZone

    var features: Features = Features.getInstance()!!


    
                        if(features.isDefault(HTMLFeatureFactory.getInstance()!!.HTML))
                        
                                    {
                                    this.bufferZoneY= this.bufferZone

                                    }
                                
                        else {
                            this.bufferZoneY= this.bufferZone +5

                        }
                            
}


open fun getMaxWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return maxWidth
}


open fun setMaxWidth(maxWidth: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var maxWidth = maxWidth
this.maxWidth= maxWidth
}


open fun getMaxHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return maxHeight
}


open fun setMaxHeight(maxHeight: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var maxHeight = maxHeight
this.maxHeight= maxHeight
}


open fun setLocation(location: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var location = location
this.location= location
}


open fun setDirection(direction: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var direction = direction
this.direction= direction
}


open fun paint(graphics: Graphics, string: String, string2: String, offset: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var string = string


                    var string2 = string2


                    var offset = offset
this.basicSetColorUtil!!.setBasicColorP(graphics, getBasicColorP())
graphics.drawString(string, x, getY(), hudGraphicsPosition!!.getAnchor())
graphics.drawString(string2, x +offset, getY(), hudGraphicsPosition!!.getAnchor())
}


open fun paint(graphics: Graphics, string: String, string2: String, offset: Int, offset2: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var string = string


                    var string2 = string2


                    var offset = offset


                    var offset2 = offset2
graphics.setColor(this.getColor())
graphics.drawString(string, x +offset, getY(), hudGraphicsPosition!!.getAnchor())
graphics.drawString(string2, x +offset2, getY(), hudGraphicsPosition!!.getAnchor())
}


open fun paint(graphics: Graphics, charArray: CharArray, offset: Int, len: Int, charArray2: CharArray, offset2: Int, len2: Int, xOffset: Int, xOffset2: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var charArray = charArray


                    var offset = offset


                    var len = len


                    var charArray2 = charArray2


                    var offset2 = offset2


                    var len2 = len2


                    var xOffset = xOffset


                    var xOffset2 = xOffset2
this.basicSetColorUtil!!.setBasicColorP(graphics, getBasicColorP())

    var y: Int = getY()!!

graphics.drawChars(charArray, offset, len, x +xOffset, y, hudGraphicsPosition!!.getAnchor())
graphics.drawChars(charArray2, offset2, len2, x +xOffset2, y, hudGraphicsPosition!!.getAnchor())
}


open fun paint(graphics: Graphics, charArray: CharArray, offset: Int, len: Int, charArray2: CharArray, offset2: Int, len2: Int, xOffset: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var charArray = charArray


                    var offset = offset


                    var len = len


                    var charArray2 = charArray2


                    var offset2 = offset2


                    var len2 = len2


                    var xOffset = xOffset
this.basicSetColorUtil!!.setBasicColorP(graphics, getBasicColorP())

    var y: Int = getY()!!

graphics.drawChars(charArray, offset, len, x, y, hudGraphicsPosition!!.getAnchor())
graphics.drawChars(charArray2, offset2, len2, x +xOffset, y, hudGraphicsPosition!!.getAnchor())
}


open fun paint(graphics: Graphics, charArray: CharArray, offset: Int, len: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var charArray = charArray


                    var offset = offset


                    var len = len
this.basicSetColorUtil!!.setBasicColorP(graphics, getBasicColorP())

    var y: Int = getY()!!

graphics.drawChars(charArray, offset, len, x, y, hudGraphicsPosition!!.getAnchor())
}


    var offsetY: Int= 0

open fun paint(graphics: Graphics, string: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var string = string
this.basicSetColorUtil!!.setBasicColorP(graphics, getBasicColorP())

    var y: Int = getY() +offsetY

graphics.drawString(string, x, y, hudGraphicsPosition!!.getAnchor())
}


open fun getHudGraphicsPosition()
        //nullable = true from not(false or (false and true)) = true
: HudGraphicsPosition{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hudGraphicsPosition
}


open fun getColor()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return color
}


open fun getX()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return x
}


open fun setX(x: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var x = x
this.x= x
}


open fun setBasicColorP(basicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{

                    var basicColor = basicColor
this.basicColor= basicColor
}


open fun getBasicColorP()
        //nullable = true from not(false or (false and true)) = true
: BasicColor{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return basicColor
}


open fun setY(y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var y = y
this.y= y
}


open fun getY()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return y
}


}
                
            

