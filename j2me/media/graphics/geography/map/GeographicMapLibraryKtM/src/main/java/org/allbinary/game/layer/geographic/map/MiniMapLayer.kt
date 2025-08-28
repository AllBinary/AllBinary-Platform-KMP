
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
        package org.allbinary.game.layer.geographic.map




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.util.BasicArrayList
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.animation.vector.CircleFilledAnimation
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.color.ColorCompositeInterface
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.BasicGeographicMapCellPositionFactory
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.event.GeographicMapCellPositionEvent
import org.allbinary.media.graphics.geography.map.event.GeographicMapCellPositionEventHandler
import org.allbinary.media.graphics.geography.map.event.GeographicMapCellPositionEventListenerInterface
import org.allbinary.view.ViewPosition

open public class MiniMapLayer : AllBinaryLayer
                , GeographicMapCellPositionEventListenerInterface {
        

    val allBinaryTiledLayer: AllBinaryTiledLayer

    private val geographicMapCellPositionFactory: BasicGeographicMapCellPositionFactory

    private val list: BasicArrayList

    private val basicColorList: BasicArrayList

    private val positionList: BasicArrayList

    private var animationInterface: CircleFilledAnimation
public constructor        (geographicMapInterface: BasicGeographicMap, viewPosition: ViewPosition)                        

                            : super(Rectangle(PointFactory.getInstance()!!.getInstance(0, viewPosition!!.getY()), geographicMapInterface!!.getAllBinaryTiledLayer()!!.getWidth(), geographicMapInterface!!.getAllBinaryTiledLayer()!!.getHeight()), viewPosition){
var geographicMapInterface = geographicMapInterface
var viewPosition = viewPosition


                            //For kotlin this is before the body of the constructor.
                    
this.allBinaryTiledLayer= geographicMapInterface!!.getAllBinaryTiledLayer()
this.geographicMapCellPositionFactory= geographicMapInterface!!.getGeographicMapCellPositionFactory()
this.animationInterface= CircleFilledAnimation(this.allBinaryTiledLayer!!.getCellWidth(), this.allBinaryTiledLayer!!.getCellHeight(), BasicColorFactory.getInstance()!!.WHITE)
this.list= BasicArrayList()
this.basicColorList= BasicArrayList()
this.positionList= BasicArrayList()
GeographicMapCellPositionEventHandler.getInstance()!!.addListener(this)
this.init()
}


                @Throws(Exception::class)
            
open fun init()
        //nullable = true from not(false or (false and true)) = true
{
allBinaryTiledLayer!!.setPosition(this.x, this.y, this.z)
}


open fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{
var eventObject = eventObject
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}


                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun onRemoveGeographicMapCellPositionEvent(geographicMapCellPositionEvent: GeographicMapCellPositionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var geographicMapCellPositionEvent = geographicMapCellPositionEvent

    var colorCompositeInterface: ColorCompositeInterface = geographicMapCellPositionEvent!!.getSource() as ColorCompositeInterface


    var index: Int = this.list.indexOf(colorCompositeInterface)!!


    
                        if(index >= 0)
                        
                                    {
                                    this.list.remove(index)
this.basicColorList!!.remove(index)
this.positionList!!.remove(index)

                                    }
                                
}


                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun onGeographicMapCellPositionEvent(geographicMapCellPositionEvent: GeographicMapCellPositionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var geographicMapCellPositionEvent = geographicMapCellPositionEvent

    var colorCompositeInterface: ColorCompositeInterface = geographicMapCellPositionEvent!!.getSource() as ColorCompositeInterface


    var layerIndex: Int =  -1


    var size: Int = list.size()!!





                        for (index in 0 until size)

        {

    var nextColorCompositeInterface: ColorCompositeInterface = list.get(index) as ColorCompositeInterface


    
                        if(nextColorCompositeInterface == colorCompositeInterface)
                        
                                    {
                                    layerIndex= index
break;

                    

                                    }
                                
}


    var geographicMapCellPosition: GeographicMapCellPosition = geographicMapCellPositionFactory!!.getInstance(geographicMapCellPositionEvent!!.getGeographicMapCellPosition())!!


    var point: GPoint = geographicMapCellPosition!!.getPoint()!!


    
                        if(layerIndex ==  -1)
                        
                                    {
                                    this.list.add(colorCompositeInterface)

    var basicColor: BasicColor = colorCompositeInterface!!.getBasicColorP()!!

this.basicColorList!!.add(basicColor)
this.positionList!!.add(point)
layerIndex= this.basicColorList!!.size() -1

                                    }
                                
                        else {
                            this.positionList!!.set(layerIndex, point)

                        }
                            
}


open fun paintDots(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics

    var localPositionList: BasicArrayList = this.positionList


    var localBasicColorList: BasicArrayList = this.basicColorList


    var length: Int = localPositionList!!.size()!!


    var point: GPoint


    var basicColor: BasicColor





                        for (index in length  - 1  downTo 0)

        {
point= localPositionList!!.get(index) as GPoint
basicColor= localBasicColorList!!.get(index) as BasicColor
graphics.setColor(basicColor!!.toInt())
this.animationInterface!!.setBasicColorP(basicColor)
this.animationInterface!!.paint(graphics, point.getX() +this.x, point.getY() +this.y)
}

}


open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
var graphics = graphics
allBinaryTiledLayer!!.paint(graphics)
this.paintDots(graphics)
}


}
                
            

