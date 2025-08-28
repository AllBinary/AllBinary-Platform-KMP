
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
        package org.allbinary.game.input.form




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.game.SimpleTiledLayer
import javax.microedition.lcdui.Graphics
import org.allbinary.game.layer.RTSLayerEvent
import org.allbinary.game.layer.building.event.BuildingEventListenerInterface
import org.allbinary.game.layer.building.event.LocalPlayerBuildingEventHandler
import org.allbinary.util.BasicArrayList
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.graphics.CellPosition
import org.allbinary.layer.event.ScrollMapEvent
import org.allbinary.layer.event.ScrollMapEventHandler
import org.allbinary.layer.event.ScrollMapEventListenerInterface
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventStrings

open public class VisibleCellPositionsSingleton
            : Object
        
                , BuildingEventListenerInterface
                , ScrollMapEventListenerInterface {
        

        companion object {
            
    private val instance: VisibleCellPositionsSingleton = VisibleCellPositionsSingleton()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: VisibleCellPositionsSingleton{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private var stationaryVisibleCellPositions: Array<ShortArray?>

    private var visibleCellPositions: Array<ShortArray?>

    private var currentlyVisibleCellPositions: Array<ShortArray?> = Array(0) { ShortArray(0) }

    val ALL_VISIBLE_TILEDLAYER: SimpleTiledLayer = SimpleTiledLayer(0, 0, 0, 0)

    private var simpleTiledLayer: SimpleTiledLayer = ALL_VISIBLE_TILEDLAYER

    private var paintSimpleTiledLayer: SimpleTiledLayer = ALL_VISIBLE_TILEDLAYER

    private var currentIndex: Int= 0
private constructor        ()
            : super()
        {
LocalPlayerBuildingEventHandler.getInstance()!!.addListener(this)
ScrollMapEventHandler.getInstance()!!.addListener(this)
}


open fun init(simpleTiledLayer: SimpleTiledLayer)
        //nullable = true from not(false or (false and false)) = true
{
var simpleTiledLayer = simpleTiledLayer
this.paintSimpleTiledLayer= ALL_VISIBLE_TILEDLAYER
this.currentIndex= 0

    var rows: Int = simpleTiledLayer!!.getRows()!!


    var columns: Int = simpleTiledLayer!!.getColumns()!!

this.stationaryVisibleCellPositions= Array(rows) { ShortArray(columns) }
this.visibleCellPositions= Array(rows) { ShortArray(columns) }
this.currentlyVisibleCellPositions= Array(rows) { ShortArray(columns) }
this.setSimpleTiledLayer(simpleTiledLayer)
}


open fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{
var eventObject = eventObject
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}


                @Throws(Exception::class)
            
open fun onBuildingEvent(event: RTSLayerEvent)
        //nullable = true from not(false or (false and false)) = true
{
var event = event
this.paintSimpleTiledLayer= this.simpleTiledLayer
}


                @Throws(Exception::class)
            
open fun onMoveEvent(scrollMapEvent: ScrollMapEvent)
        //nullable = true from not(false or (false and false)) = true
{
var scrollMapEvent = scrollMapEvent
this.move(scrollMapEvent!!.getDx(), scrollMapEvent!!.getDy())
}


open fun addStationaryCellPositions(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{
var list = list




                        for (index in list.size() -1 downTo 0)

        {

    var cellPosition: CellPosition = list.get(index) as CellPosition

this.stationaryVisibleCellPositions[cellPosition!!.getRow()]!![cellPosition!!.getColumn()]++
}

}


open fun removeStationaryCellPositions(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{
var list = list




                        for (index in list.size() -1 downTo 0)

        {

    var cellPosition: CellPosition = list.get(index) as CellPosition

this.stationaryVisibleCellPositions[cellPosition!!.getRow()]!![cellPosition!!.getColumn()]--
}

}


open fun update()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(this.currentIndex == 0)
                        
                                    {
                                    
    var temp: Array<ShortArray?> = this.currentlyVisibleCellPositions

this.currentlyVisibleCellPositions= this.visibleCellPositions
this.visibleCellPositions= temp




                        for (index in this.visibleCellPositions!!.size -1 downTo 0)

        {




                        for (index2 in this.visibleCellPositions[0]!!.length -1 downTo 0)

        {
this.visibleCellPositions[index]!![index2]= this.stationaryVisibleCellPositions[index]!![index2]!!
}

}


                                    }
                                
this.currentIndex++

    
                        if(this.currentIndex > 10)
                        
                                    {
                                    this.currentIndex= 0

                                    }
                                
}


open fun shouldProcess()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

    
                        if(this.currentIndex == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


open fun addCellPositions(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{
var list = list




                        for (index in list.size() -1 downTo 0)

        {

    var cellPosition: CellPosition = list.get(index) as CellPosition

this.visibleCellPositions[cellPosition!!.getRow()]!![cellPosition!!.getColumn()]++
}

}


open fun isVisible(cellPosition: CellPosition)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var cellPosition = cellPosition

    
                        if(this.visibleCellPositions[cellPosition!!.getRow()]!![cellPosition!!.getColumn()] > 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


open fun move(dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
{
var dx = dx
var dy = dy
this.getSimpleTiledLayer()!!.move(dx, dy)
}


open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
this.paintSimpleTiledLayer!!.paint(graphics, this.currentlyVisibleCellPositions)
}


open fun setSimpleTiledLayer(simpleTiledLayer: SimpleTiledLayer)
        //nullable = true from not(false or (false and false)) = true
{
var simpleTiledLayer = simpleTiledLayer
this.simpleTiledLayer= simpleTiledLayer
}


open fun getSimpleTiledLayer()
        //nullable = true from not(false or (false and true)) = true
: SimpleTiledLayer{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return simpleTiledLayer
}


}
                
            

