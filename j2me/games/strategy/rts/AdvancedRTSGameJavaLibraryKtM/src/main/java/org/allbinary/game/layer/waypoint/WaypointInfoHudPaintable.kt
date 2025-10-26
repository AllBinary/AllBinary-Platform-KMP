
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2006 AllBinary 
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
        package org.allbinary.game.layer.waypoint




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.game.layer.NullPathFindingLayer
import org.allbinary.game.layer.PathFindingLayerInterface
import org.allbinary.game.layer.RTSLayer
import org.allbinary.game.layer.SelectionHudPaintable
import org.allbinary.graphics.draw.KeyValueDrawString

open public class WaypointInfoHudPaintable : SelectionHudPaintable {
        

    private val keyvalueDrawString: KeyValueDrawString

    var rtsLayerP: PathFindingLayerInterface = NullPathFindingLayer.NULL_PATH_FINDING_LAYER
public constructor (){
keyvalueDrawString= KeyValueDrawString("Owner: ", this.textX)
}


    override fun updateSelectionInfo()
        //nullable = true from not(false or (false and true)) = true
{

    var rtsLayer: RTSLayer = this.rtsLayerP as RTSLayer

this.setName(rtsLayer!!.getName())
this.setAnimationInterface(rtsLayer!!.getVerticleBuildAnimationInterface())
this.keyvalueDrawString!!.update(rtsLayer!!.getParentLayer()!!.getName())
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
super.paint(graphics)

    var textLine2Y: Int = (y +myFont!!.DEFAULT_CHAR_HEIGHT)

this.keyvalueDrawString!!.paint(graphics, textLine2Y)
this.getAnimationInterface()!!.paint(graphics, this.imageX, y)
}


    open fun setRtsLayer(rtsLayer: RTSLayer)
        //nullable = true from not(false or (false and false)) = true
{
var rtsLayer = rtsLayer
this.rtsLayerP= rtsLayer
}


    open fun getRtsLayer()
        //nullable = true from not(false or (false and true)) = true
: PathFindingLayerInterface{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rtsLayerP
}


}
                
            

