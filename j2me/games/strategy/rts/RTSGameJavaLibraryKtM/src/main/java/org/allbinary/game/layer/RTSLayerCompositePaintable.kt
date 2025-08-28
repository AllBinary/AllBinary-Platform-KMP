
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
import org.allbinary.logic.string.StringUtil
import org.allbinary.graphics.paint.Paintable
import org.allbinary.logic.string.StringMaker

open public class RTSLayerCompositePaintable : Paintable {
        

    private var upgradeCost: String = StringUtil.getInstance()!!.EMPTY_STRING

    private var downGradeCost: String = StringUtil.getInstance()!!.EMPTY_STRING

    private val UPGRADE: String = "Up: $"

    private val DOWNGRADE: String = "Down: $-"

    val upgradableRTSLayerHudPaintable: UpgradableRTSLayerHudPaintable
public constructor        (upgradableRTSLayerHudPaintable: UpgradableRTSLayerHudPaintable)

        Updates for KMP build        
        {
var upgradableRTSLayerHudPaintable = upgradableRTSLayerHudPaintable
this.upgradableRTSLayerHudPaintable= upgradableRTSLayerHudPaintable
}


open fun update(rtsLayer: RTSLayer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var rtsLayer = rtsLayer

    
                        if(rtsLayer!!.isUpgradeable())
                        
                                    {
                                    this.setUpgradeCost(StringMaker().
                            append(UPGRADE)!!.append(rtsLayer!!.getUpgradeCost())!!.toString())

                                    }
                                
                        else {
                            this.setUpgradeCost(StringUtil.getInstance()!!.EMPTY_STRING)

                        }
                            

    
                        if(rtsLayer!!.isDowngradeable())
                        
                                    {
                                    this.setDownGradeCost(StringMaker().
                            append(DOWNGRADE)!!.append(rtsLayer!!.getDowngradeCost())!!.toString())

                                    }
                                
                        else {
                            this.setDownGradeCost(StringUtil.getInstance()!!.EMPTY_STRING)

                        }
                            
}


open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graphics = graphics
graphics.drawString(this.getDownGradeCost(), this.upgradableRTSLayerHudPaintable!!.textX, this.upgradableRTSLayerHudPaintable!!.costY1, 0)
graphics.drawString(this.getUpgradeCost(), this.upgradableRTSLayerHudPaintable!!.textX, this.upgradableRTSLayerHudPaintable!!.costY, 0)
}


open fun setUpgradeCost(upgradeCost: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var upgradeCost = upgradeCost
this.upgradeCost= upgradeCost
}


open fun getUpgradeCost()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return upgradeCost
}


open fun setDownGradeCost(downGradeCost: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var downGradeCost = downGradeCost
this.downGradeCost= downGradeCost
}


open fun getDownGradeCost()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return downGradeCost
}


}
                
            

