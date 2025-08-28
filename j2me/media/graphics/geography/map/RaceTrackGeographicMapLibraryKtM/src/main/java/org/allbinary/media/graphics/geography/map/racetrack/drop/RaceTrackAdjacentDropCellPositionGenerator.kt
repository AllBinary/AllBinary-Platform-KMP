
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
        package org.allbinary.media.graphics.geography.map.racetrack.drop




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import java.util.Hashtable
import org.allbinary.util.BasicArrayList
import org.allbinary.direction.Direction
import org.allbinary.direction.DirectionFactory
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.layer.geographic.map.LayerCoveringCellPositionsUtil
import org.allbinary.graphics.GPoint
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.BasicGeographicMapCellPositionFactory
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.GeographicMapCellType
import org.allbinary.media.graphics.geography.map.GeographicMapDirectionUtil
import org.allbinary.media.graphics.geography.map.drop.DropCellPositionGeneratorInterface
import org.allbinary.media.graphics.geography.map.drop.DropCellPositionHistory
import org.allbinary.media.graphics.geography.map.racetrack.RaceTrackGeographicMapCellType
import org.allbinary.media.graphics.geography.map.racetrack.RaceTrackGeographicMapCellTypeFactory

open public class RaceTrackAdjacentDropCellPositionGenerator : RaceTrackDropCellPositionGenerator {
        

        companion object {
            
    private var SINGLETON: RaceTrackAdjacentDropCellPositionGenerator = RaceTrackAdjacentDropCellPositionGenerator()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: DropCellPositionGeneratorInterface

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
    private val layerCoveringCellPositionsUtil: LayerCoveringCellPositionsUtil = LayerCoveringCellPositionsUtil.getInstance()!!

    private var surroundingCellPositions: Array<GeographicMapCellPosition?> = arrayOfNulls(4)
private constructor        ()

        Updates for KMP build        
        {
}


                @Throws(Exception::class)
            
open fun getFirstNonRoadAdjacentCellPosition(column: Int, row: Int)
        //nullable = true from not(false or (false and false)) = true
: GeographicMapCellPosition

        Updates for KMP build        
        {
    //var column = column
    //var row = row

    var nonRoadGeographicMapCellPosition: GeographicMapCellPosition = 
                null
            


    var geographicMapCellPositionFactory: BasicGeographicMapCellPositionFactory = this.raceTrackGeographicMap!!.getGeographicMapCellPositionFactory()!!

surroundingCellPositions[0]= geographicMapCellPositionFactory!!.getInstance(column, row -1)
surroundingCellPositions[1]= geographicMapCellPositionFactory!!.getInstance(column, row +1)
surroundingCellPositions[2]= geographicMapCellPositionFactory!!.getInstance(column -1, row)
surroundingCellPositions[3]= geographicMapCellPositionFactory!!.getInstance(column +1, row)

    var raceTrackGeographicMapCellTypeFactory: RaceTrackGeographicMapCellTypeFactory = this.raceTrackGeographicMap!!.getGeographicMapCellTypeFactory() as RaceTrackGeographicMapCellTypeFactory


    var geographicMapCellPosition: GeographicMapCellPosition


    var raceTrackGeographicMapCellType: RaceTrackGeographicMapCellType





                        for (index in surroundingCellPositions!!.size  - 1  downTo 0)

        

        Updates for KMP build        
        {
geographicMapCellPosition= surroundingCellPositions[index]!!
raceTrackGeographicMapCellType= raceTrackGeographicMap!!.getCellTypeAt(geographicMapCellPosition) as RaceTrackGeographicMapCellType

    
                        if(!raceTrackGeographicMapCellTypeFactory!!.isPath(raceTrackGeographicMapCellType))
                        
                                    {
                                    nonRoadGeographicMapCellPosition= geographicMapCellPosition
break;

                    

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return nonRoadGeographicMapCellPosition
}


    private val hashtable: Hashtable<Any, Any> = Hashtable<Any, Any>()

                @Throws(Exception::class)
            
open fun update(allBinaryGameLayerManager: AllBinaryGameLayerManager, geographicMapInterface: BasicGeographicMap)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var allBinaryGameLayerManager = allBinaryGameLayerManager
    //var geographicMapInterface = geographicMapInterface
hashtable.put(AllBinaryGameLayerManager.ID, allBinaryGameLayerManager)
super.update(allBinaryGameLayerManager, geographicMapInterface)
}


    private val geographicMapDirectionUtil: GeographicMapDirectionUtil = GeographicMapDirectionUtil.getInstance()!!

                @Throws(Exception::class)
            
open fun drop(allBinaryLayerManager: AllBinaryLayerManager, index: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var allBinaryLayerManager = allBinaryLayerManager
    //var index = index

    var geographicMapCellPosition: GeographicMapCellPosition = this.list.get(index) as GeographicMapCellPosition


    var randomGeographicMapCellPosition: GeographicMapCellPosition = this.getFirstNonRoadAdjacentCellPosition(geographicMapCellPosition!!.getColumn(), geographicMapCellPosition!!.getRow())!!


    
                        if(randomGeographicMapCellPosition == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    var dropCellPositionHistory: DropCellPositionHistory = DropCellPositionHistory.getInstance()!!


    
                        if(!dropCellPositionHistory!!.isCellPositionWithDrop(geographicMapCellPosition))
                        
                                    {
                                    
    var direction: Direction = geographicMapDirectionUtil!!.getDirectionFromCellPositionToAdjacentCellPosition(randomGeographicMapCellPosition, geographicMapCellPosition)!!

hashtable.put(DirectionFactory.getInstance()!!.NAME, direction)

    var point: GPoint = randomGeographicMapCellPosition!!.getPoint()!!


    var x: Int = point.getX()!!


    var y: Int = point.getY()!!


    var z: Int = point.getZ()!!


    var layerInterface: AllBinaryLayer = RaceTrackAdjacentDropLayerFactory.getInstance()!!.getRandomInstance()!!.getInstance(hashtable, x, y, z)!!


    var list: BasicArrayList = layerCoveringCellPositionsUtil!!.getAll(this.raceTrackGeographicMap, randomGeographicMapCellPosition, layerInterface, BasicArrayList())!!


    
                        if(dropCellPositionHistory!!.anyCellPositionWithDrop(list))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                

    var geographicMapCellType: GeographicMapCellType





                        for (index2 in list.size()!!  - 1  downTo 0)

        

        Updates for KMP build        
        {
geographicMapCellType= this.raceTrackGeographicMap!!.getCellTypeAt(list.get(index2) as GeographicMapCellPosition)

    
                        if(raceTrackGeographicMapCellTypeFactory!!.isPath(geographicMapCellType))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
}

dropCellPositionHistory!!.add(list, layerInterface)
allBinaryLayerManager!!.append(layerInterface)

                                    }
                                
}


}
                
            

