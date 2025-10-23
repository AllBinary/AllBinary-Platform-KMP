
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2003 AllBinary 
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
        package org.allbinary.game.layer.item




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.Image
import org.allbinary.game.layer.CostLayerInterfaceFactoryInterface
import org.allbinary.game.rts.technology.event.TechEventListenerInterface
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.animation.Animation
import org.allbinary.graphics.font.MyFont
import org.allbinary.logic.NullUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.math.PrimitiveLongUtil
import org.allbinary.logic.util.event.EventStrings

open public class RTSLayerCostAnimation : Animation
                , TechEventListenerInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val myFont: MyFont = MyFont.getInstance()!!

    private val primitiveLongUtil: PrimitiveLongUtil = PrimitiveLongUtil(10000)

    private val image: Image

    private var costString: CharArray = NullUtil.getInstance()!!.NULL_CHAR_ARRAY

    private var len: Int= 0

    private val DOLLAR: String = "$"

    private val adjustedCostX: Int = myFont!!.stringWidth(DOLLAR)!!

    private val layerInterfaceFactoryInterface: CostLayerInterfaceFactoryInterface
public constructor (image: Image, layerInterfaceFactoryInterface: CostLayerInterfaceFactoryInterface){
var image = image
var layerInterfaceFactoryInterface = layerInterfaceFactoryInterface
this.image= image
this.layerInterfaceFactoryInterface= layerInterfaceFactoryInterface
this.update()
}


    override fun onEvent(event: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{
var event = event
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}


    override fun onTechEvent(event: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{
var event = event

        try {
            this.update()
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, "onTechEvent", e)
}

}


                @Throws(Exception::class)
            
    open fun update()
        //nullable = true from not(false or (false and true)) = true
{
this.len= 0
this.costString= this.primitiveLongUtil!!.getCharArray(this.layerInterfaceFactoryInterface!!.getCost())
this.len= this.primitiveLongUtil!!.getCurrentTotalDigits()
}


    override fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
var x = x
var y = y
super.paint(graphics, x, y)

    var adjustedCostY: Int = image.getHeight() -myFont!!.DEFAULT_CHAR_HEIGHT


    var xa: Int = x +2

graphics.drawString(DOLLAR, xa, y +adjustedCostY, 0)
graphics.drawChars(costString, 0, this.len, x +adjustedCostX, y +adjustedCostY, 0)
}


}
                
            

