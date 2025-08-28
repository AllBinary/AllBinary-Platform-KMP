
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
        
import org.allbinary.logic.string.StringMaker
import javax.microedition.lcdui.Graphics
import org.allbinary.animation.Animation
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCellHistory
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.GeographicMapCompositeInterface
import org.allbinary.util.BasicArrayList

open public class PathAnimation : Animation {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val linePathAnimation: LinePathAnimation

    private val pathFindingLayer: PathFindingLayerInterface

    var allBinaryGameLayerManager: AllBinaryGameLayerManager
public constructor        (pathFindingLayer: PathFindingLayerInterface, linePathAnimation: LinePathAnimation)

        Updates for KMP build        
        {
    //var pathFindingLayer = pathFindingLayer
    //var linePathAnimation = linePathAnimation
this.pathFindingLayer= pathFindingLayer
this.linePathAnimation= linePathAnimation
}


                @Throws(Exception::class)
            
open fun setAllBinaryGameLayerManager(allBinaryGameLayerManager: AllBinaryGameLayerManager)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var allBinaryGameLayerManager = allBinaryGameLayerManager
this.allBinaryGameLayerManager= allBinaryGameLayerManager
}


                @Throws(Exception::class)
            
open fun nextFrame()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


    private val startColor: BasicColor = BasicColorFactory.getInstance()!!.RED

    private val middleColor: BasicColor = BasicColorFactory.getInstance()!!.BLUE

    private val endColor: BasicColor = BasicColorFactory.getInstance()!!.GREEN

open fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var graphics = graphics
    //var x = x
    //var y = y

        try {
            
    var waypointBehaviorBase: WaypointBehaviorBase = this.pathFindingLayer!!.getWaypointBehavior()!!


    
                        if(waypointBehaviorBase != 
                                    null
                                )
                        
                                    {
                                    
    var geographicMapCellHistory: GeographicMapCellHistory = waypointBehaviorBase!!.getCurrentGeographicMapCellHistory()!!


    var list: BasicArrayList = geographicMapCellHistory!!.getTracked()!!


    var size: Int = list.size()!!


    
                        if(size > 0)
                        
                                    {
                                    
    var geographicMapCompositeInterface: GeographicMapCompositeInterface = this.allBinaryGameLayerManager as GeographicMapCompositeInterface


    var geographicMapInterface: BasicGeographicMap = geographicMapCompositeInterface!!.getGeographicMapInterface()[0]!!


    var tiledLayer: AllBinaryTiledLayer = geographicMapInterface!!.getAllBinaryTiledLayer()!!


    var geographicMapCellPosition: GeographicMapCellPosition = 
                null
            


    var nextPoint: GPoint


    var point: GPoint


    var start: Int = size -2





                        for (index in 0 until size -1)

        

        Updates for KMP build        
        {

    
                        if(index == start)
                        
                                    {
                                    this.setBasicColorP(this.startColor)
this.basicSetColorUtil!!.setBasicColorP(graphics, this.getBasicColorP(), this.getColor())

                                    }
                                
                             else 
    
                        if(geographicMapCellHistory!!.isVisited(geographicMapCellPosition))
                        
                                    {
                                    this.setBasicColorP(this.endColor)
this.basicSetColorUtil!!.setBasicColorP(graphics, this.getBasicColorP(), this.getColor())

                                    }
                                
                        else {
                            this.setBasicColorP(this.middleColor)
this.basicSetColorUtil!!.setBasicColorP(graphics, this.getBasicColorP(), this.getColor())

                        }
                            
geographicMapCellPosition= list.get(index) as GeographicMapCellPosition
point= geographicMapCellPosition!!.getMidPoint()
geographicMapCellPosition= list.get(index +1) as GeographicMapCellPosition
nextPoint= geographicMapCellPosition!!.getMidPoint()
this.linePathAnimation!!.paint(graphics, point, nextPoint, tiledLayer)
}


                                    }
                                

                                    }
                                
} catch(e: Exception)
            

        Updates for KMP build        
        {
logUtil!!.put("Cleared Target", this, "paint")
}

}


}
                
            

