
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.game.behavior.topview



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.media.graphics.geography.map.MultiGeographicMapBehavior
import org.allbinary.direction.Direction
import org.allbinary.direction.DirectionFactory
import org.allbinary.game.terrain.BasicTerrainInfo
import org.allbinary.game.terrain.TerrainEvent
import org.allbinary.game.terrain.TerrainEventCircularStaticPool
import org.allbinary.game.terrain.TerrainEventHandler
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.math.AngleFactory
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.BasicGeographicMapCellPositionFactory
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.GeographicMapCellType

open public class NonPlayerTopViewCharacterBehavior : TopViewCharacterBehavior {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val geographicMapBehavior: MultiGeographicMapBehavior = MultiGeographicMapBehavior()

    private val CLIFF: BasicTerrainInfo = BasicTerrainInfo(AngleFactory.getInstance()!!.DOWN)

                @Throws(Exception::class)
            
open fun terrainEvent(layer: AllBinaryLayer, direction: Direction, x: Int, y: Int, geographicMapInterfaceArray: Array<BasicGeographicMap?>, geographicMapCellTypeArray: Array<GeographicMapCellType?>, geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
{

                    var layer = layer


                    var direction = direction


                    var x = x


                    var y = y


                    var geographicMapInterfaceArray = geographicMapInterfaceArray


                    var geographicMapCellTypeArray = geographicMapCellTypeArray


                    var geographicMapCellPosition = geographicMapCellPosition

    var maxColumns: Int = geographicMapInterfaceArray[0]!!.getAllBinaryTiledLayer()!!.getColumns()!!
            


    
                        if(geographicMapCellPosition!!.getColumn() > 0 && geographicMapCellPosition!!.getColumn() < maxColumns)
                        
                                    {
                                    
    var nextTerrainGeographicMapCellPosition: GeographicMapCellPosition = 
                null
            


    var geographicMapCellPositionFactory: BasicGeographicMapCellPositionFactory = geographicMapInterfaceArray[0]!!.getGeographicMapCellPositionFactory()!!
            


    
                        if(direction == DirectionFactory.getInstance()!!.LEFT)
                        
                                    {
                                    nextTerrainGeographicMapCellPosition= geographicMapCellPositionFactory!!.getInstance(geographicMapCellPosition!!.getColumn() -1, geographicMapCellPosition!!.getRow())

                                    }
                                
                             else 
    
                        if(direction == DirectionFactory.getInstance()!!.RIGHT)
                        
                                    {
                                    nextTerrainGeographicMapCellPosition= geographicMapCellPositionFactory!!.getInstance(geographicMapCellPosition!!.getColumn() +1, geographicMapCellPosition!!.getRow())

                                    }
                                
geographicMapBehavior!!.getCellTypeAt(geographicMapInterfaceArray, geographicMapCellTypeArray, nextTerrainGeographicMapCellPosition)

    var hasSolidBlock: Boolean = this.hasSolidBlock(geographicMapInterfaceArray, geographicMapCellTypeArray)!!
            


    
                        if(!hasSolidBlock)
                        
                                    {
                                    
    var terrainEvent: TerrainEvent = TerrainEventCircularStaticPool.getInstance()!!.getInstance(this.CLIFF)!!
            

TerrainEventHandler.getInstance(layer)!!.fireEvent(terrainEvent)

                                    }
                                

                                    }
                                
}


open fun terrainMove(layer: AllBinaryLayer, geographicMapInterfaceArray: Array<BasicGeographicMap?>, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var layer = layer


                    var geographicMapInterfaceArray = geographicMapInterfaceArray


                    var x = x


                    var y = y
layer!!.move(x, y)
}


}
                
            

