
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
        package org.allbinary.game.layer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.string.CommonSeps
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil

open public class UpgradableWideRTSLayerPaintable : RTSLayerCompositePaintable {
        

    private var cost: String = StringUtil.getInstance()!!.EMPTY_STRING
public constructor (upgradableRTSLayerHudPaintable: UpgradableRTSLayerHudPaintable)                        

                            : super(upgradableRTSLayerHudPaintable){
var upgradableRTSLayerHudPaintable = upgradableRTSLayerHudPaintable


                            //For kotlin this is before the body of the constructor.
                    
}


    override fun update(rtsLayer: RTSLayer)
        //nullable = true from not(false or (false and false)) = true
{
var rtsLayer = rtsLayer
super.update(rtsLayer)
this.setCost(StringMaker().
                            append(this.getUpgradeCost())!!.append(CommonSeps.getInstance()!!.SPACE)!!.append(this.getDownGradeCost())!!.toString())
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
graphics.drawString(this.getCost(), this.upgradableRTSLayerHudPaintable!!.textX, this.upgradableRTSLayerHudPaintable!!.costY, 0)
}


    open fun setCost(cost: String)
        //nullable = true from not(false or (false and false)) = true
{
var cost = cost
this.cost= cost
}


    open fun getCost()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cost
}


}
                
            

