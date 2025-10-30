
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
        package org.allbinary.game.layer.hud.basic




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.game.graphics.hud.BasicHud
import org.allbinary.game.graphics.hud.BasicHudFactory
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.font.MyFont
import org.allbinary.graphics.paint.PaintableInterface
import org.allbinary.logic.math.PrimitiveLongSingleton
import org.allbinary.logic.math.PrimitiveLongUtil
import org.allbinary.logic.string.StringUtil

open public class NumberStringHud : BasicHud
                , PaintableInterface {
        
companion object {
            
    val NULL_NUMBER_STRING_HUD: NumberStringHud = NumberStringHud(StringUtil.getInstance()!!.EMPTY_STRING, 9, BasicHudFactory.getInstance()!!.ABSOLUTE, 0, 0, 0, BasicColorFactory.getInstance()!!.NULL_COLOR)

        }
            
    private val PREPEND_STRING: CharArray

    private var value: Int

    private var max: Int

    private var offset: Int

    private var valueString: CharArray

    private var valueTotalDigits: Int= 0

    private val primitiveLongUtil: PrimitiveLongUtil
public constructor (prependString: String, max: Int, location: Int, maxHeight: Int, maxWidth: Int, bufferZone: Int, basicColor: BasicColor)                        

                            : super(location, 1, maxHeight, maxWidth, bufferZone, basicColor){
var prependString = prependString
var max = max
var location = location
var maxHeight = maxHeight
var maxWidth = maxWidth
var bufferZone = bufferZone
var basicColor = basicColor


                            //For kotlin this is before the body of the constructor.
                    
this.PREPEND_STRING= prependString!!.toCharArray()

    var myFont: MyFont = MyFont.getInstance()!!

this.offset= myFont!!.stringWidth(prependString) +myFont!!.charWidth()
this.valueString= PrimitiveLongSingleton.getInstance()!!.NUMBER_CHAR_ARRAYS[0]!!
this.primitiveLongUtil= PrimitiveLongUtil(max +1)
this.max= max
this.value= 0
}

public constructor (prependString: String, max: Int, location: Int, direction: Int, maxHeight: Int, maxWidth: Int, bufferZone: Int, basicColor: BasicColor)                        

                            : super(location, direction, maxHeight, maxWidth, bufferZone, basicColor){
var prependString = prependString
var max = max
var location = location
var direction = direction
var maxHeight = maxHeight
var maxWidth = maxWidth
var bufferZone = bufferZone
var basicColor = basicColor


                            //For kotlin this is before the body of the constructor.
                    
this.PREPEND_STRING= prependString!!.toCharArray()

    var myFont: MyFont = MyFont.getInstance()!!

this.offset= myFont!!.stringWidth(prependString) +myFont!!.charWidth()
this.valueString= PrimitiveLongSingleton.getInstance()!!.NUMBER_CHAR_ARRAYS[0]!!
this.primitiveLongUtil= PrimitiveLongUtil(max +1)
this.max= max
this.value= 0

    
                        if(direction == 0)
                        
                                    {
                                    


                            throw Exception(BasicHudFactory.getInstance()!!.DIRECTION_EXCEPTION)

                                    }
                                
}


    open fun get()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.value
}


    open fun add(value: Int)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.set(this.value +value)
}


    open fun set(value: Int)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.value= value

    
                        if(this.value > this.max)
                        
                                    {
                                    this.value= 0

                                    }
                                
this.valueString= this.primitiveLongUtil!!.getCharArray(this.value)
this.valueTotalDigits= this.primitiveLongUtil!!.getCurrentTotalDigits()
}


    open fun reduce(value: Int)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.set(this.value -value)
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
super.paint(graphics, PREPEND_STRING, 0, PREPEND_STRING.size, this.valueString, 0, this.valueTotalDigits, offset)
}


    open fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
var x = x
var y = y

    var charArray: CharArray = PREPEND_STRING


    var len: Int = PREPEND_STRING.size
                


    var charArray2: CharArray = this.valueString


    var len2: Int = this.valueTotalDigits

this.basicSetColorUtil!!.setBasicColorP(graphics, getBasicColorP())
graphics.drawChars(charArray, 0, len, x, y, 0)
graphics.drawChars(charArray2, 0, len2, x -this.offset, y, 0)
}


    override fun paintThreed(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
}


}
                
            

