
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
        package org.allbinary.game.layer.geological.resources




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.game.layer.RTSLayer
import org.allbinary.game.layer.waypoint.WaypointInfoHudPaintable
import org.allbinary.util.BasicArrayList
import org.allbinary.graphics.draw.KeyValueDrawCharArray
import org.allbinary.graphics.font.MyFont

open public class GeologicalResourceInfoHudPaintable : WaypointInfoHudPaintable {
        
companion object {
            
    private val RESOURCES: String = "Resources: "

        }
            
    private val keyvalueDrawString: KeyValueDrawCharArray
public constructor (){
keyvalueDrawString= KeyValueDrawCharArray(RESOURCES, this.textX)
}


    override fun updateSelectionInfo()
        //nullable = true from not(false or (false and true)) = true
{
super.updateSelectionInfo()

    var rtsLayer: RTSLayer = this.rtsLayerP as RTSLayer


    var list: BasicArrayList = rtsLayer!!.geographicMapCellPositionAreaBase!!.getOccupyingGeographicMapCellPositionList()!!


    var total: Int = 0





                        for (index in list.size()!!  - 1  downTo 0)

        {

    var geographicMapCellPosition: GeologicalGeographicMapCellPosition = list.get(index) as GeologicalGeographicMapCellPosition

total += geographicMapCellPosition!!.getGeologicalResource()!!.getTotal()
}

this.keyvalueDrawString!!.update(this.getPrimitiveLongUtil()!!.getCharArray(total), this.getPrimitiveLongUtil()!!.getCurrentTotalDigits())
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
super.paint(graphics)
this.keyvalueDrawString!!.paint(graphics, (y +(2 *MyFont.getInstance()!!.DEFAULT_CHAR_HEIGHT)))
}


}
                
            

