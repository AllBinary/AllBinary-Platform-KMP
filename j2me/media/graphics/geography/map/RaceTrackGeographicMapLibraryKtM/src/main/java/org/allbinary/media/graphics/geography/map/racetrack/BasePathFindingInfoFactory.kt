
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
        package org.allbinary.media.graphics.geography.map.racetrack



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.logic.string.StringMaker
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.GeographicMapCellTypeFactory
import org.allbinary.media.graphics.geography.pathfinding.PathFindingInfo
import org.allbinary.media.graphics.geography.pathfinding.PathFindingNode
import org.allbinary.media.graphics.geography.map.GeographicMapCellPositionFactoryInitVisitorInterface

open public class BasePathFindingInfoFactory
            : Object
         {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

                @Throws(Exception::class)
            
open fun init(geographicMapInterface: BasicGeographicMap, pathFindingInfo: PathFindingInfo, mapArray: Array<IntArray?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var geographicMapInterface = geographicMapInterface


                    var pathFindingInfo = pathFindingInfo


                    var mapArray = mapArray

open class RaceTrackGeographicMapCellPositionFactoryInitVisitor
            : Object
        
                , GeographicMapCellPositionFactoryInitVisitorInterface {
        

    private var startLineId: Int

    private var finishLineId: Int
public constructor        ()
            : super()
        {
    var raceTrackGeographicMapCellTypeFactory: GeographicMapCellTypeFactory = geographicMapInterface!!.getGeographicMapCellTypeFactory()!!
            

this.startLineId= raceTrackGeographicMapCellTypeFactory!!.getStartType()
this.finishLineId= raceTrackGeographicMapCellTypeFactory!!.getEndType()
}


                @Throws(Exception::class)
            
open fun visit(tiledLayer: AllBinaryTiledLayer, cellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
{

                    var tiledLayer = tiledLayer


                    var cellPosition = cellPosition

    var row: Int = cellPosition!!.getRow()!!
            


    var column: Int = cellPosition!!.getColumn()!!
            


        try {
            
    var cellTypeId: Int = mapArray[row]!![column]!!


    var geographicCellType: Int = geographicMapInterface!!.getCellTypeFromMapCellTypeInt(cellTypeId)!!
            


    
                        if(geographicCellType == startLineId)
                        
                                    {
                                    this@BasePathFindingInfoFactory.addStartPathFindingNode(pathFindingInfo, cellPosition)

                                    }
                                

    
                        if(geographicCellType == finishLineId)
                        
                                    {
                                    
    
                        if(geographicCellType == startLineId)
                        
                                    {
                                    this@BasePathFindingInfoFactory.addEndPathFindingNode(pathFindingInfo, geographicMapInterface!!.getGeographicMapCellPositionFactoryInterface()!!.getInstance(geographicMapInterface, cellPosition!!.getColumn(), cellPosition!!.getRow(), tiledLayer!!.getColumns(), tiledLayer!!.getRows(), tiledLayer!!.getCellWidth(), tiledLayer!!.getCellHeight()))

                                    }
                                
                        else {
                            this@BasePathFindingInfoFactory.addEndPathFindingNode(pathFindingInfo, cellPosition)

                        }
                            

                                    }
                                

    var raceTrackGeographicMapCellTypeFactory: GeographicMapCellTypeFactory = geographicMapInterface!!.getGeographicMapCellTypeFactory()!!
            


    var geographicMapCellTypeFactory: GeographicMapCellTypeFactory = GeographicMapCellTypeFactory.getInstance()!!
            


    
                        if(raceTrackGeographicMapCellTypeFactory!!.isPath(geographicMapCellTypeFactory!!.getInstance(geographicCellType)))
                        
                                    {
                                    RaceTrackRoadsGeographicMapCellHistoryFactory.getInstance()!!.track(cellPosition)

                                    }
                                
                        else {
                            
                        }
                            
} catch(e: Exception)
            {logUtil!!.put(StringMaker().
                            append(
                            "[")!!.append(row)!!.append(
                            "][")!!.append(column)!!.append(
                            "] in [")!!.append(mapArray!!.size)!!.append(
                            "][")!!.append(mapArray[0]!!.length)!!.append(
                            "]")!!.toString(), this, 
                            "visit", e)



                            throw e
}

}


}
                
            
geographicMapInterface!!.getGeographicMapCellPositionFactory()!!.visit(RaceTrackGeographicMapCellPositionFactoryInitVisitor())
}


                @Throws(Exception::class)
            
open fun addStartPathFindingNode(pathFindingInfo: PathFindingInfo, startGeographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
{

                    var pathFindingInfo = pathFindingInfo


                    var startGeographicMapCellPosition = startGeographicMapCellPosition
pathFindingInfo!!.addStartPathFindingNode(PathFindingNode(
                            null, startGeographicMapCellPosition))
}


                @Throws(Exception::class)
            
open fun addEndPathFindingNode(pathFindingInfo: PathFindingInfo, endGeographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
{

                    var pathFindingInfo = pathFindingInfo


                    var endGeographicMapCellPosition = endGeographicMapCellPosition
pathFindingInfo!!.addEndPathFindingNode(PathFindingNode(
                            null, endGeographicMapCellPosition))
}


}
                
            

