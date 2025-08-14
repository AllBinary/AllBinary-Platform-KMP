
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
        package org.allbinary.media.graphics.geography.map.racetrack




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.AdvancedRTSGameLayer
import org.allbinary.game.layer.waypoint.WaypointLayer
import org.allbinary.graphics.CellPosition
import org.allbinary.media.graphics.geography.map.BasicGeographicMapCellPositionFactory
import org.allbinary.media.graphics.geography.map.GeographicMapCellTypeFactory
import org.allbinary.media.graphics.geography.map.drop.DropCellPositionHistory

open public class CustomMapGenerator : CustomMapGeneratorBase {
        

    private val customMapArray: Array<IntArray?>

    private val raceTrackGeographicMap: RaceTrackGeographicMap

    private val geographicMapCellTypeFactory: GeographicMapCellTypeFactory
public constructor        (raceTrackGeographicMap: RaceTrackGeographicMap){

                    var raceTrackGeographicMap = raceTrackGeographicMap
this.raceTrackGeographicMap= raceTrackGeographicMap
this.geographicMapCellTypeFactory= this.raceTrackGeographicMap!!.getGeographicMapCellTypeFactory()

    var mapArray: Array<IntArray?> = raceTrackGeographicMap!!.getRaceTrackData()!!.getMapArray()!!
            

this.customMapArray= Array(mapArray!!.size) { IntArray(mapArray[0]!!.length) }

    
                        if(mapArray!!.size != this.customMapArray!!.size || mapArray[0]!!.length != this.customMapArray[0]!!.length)
                        
                                    {
                                    


                            throw Exception(
                            "Array Incorrect")

                                    }
                                
}


                @Throws(Exception::class)
            override fun copyMapIntoCustomMap()
        //nullable = true from not(false or (false and true)) = true
{
    var mapArray: Array<IntArray?> = raceTrackGeographicMap!!.getRaceTrackData()!!.getMapArray()!!
            


    var startIndex2: Int = mapArray[0]!!.length -1





                        for (index in mapArray!!.size -1 downTo 0)


        {



                        for (index2 in startIndex2 downTo 0)


        {this.customMapArray[index]!![index2]= this.getCustomType(index2, index, mapArray[index]!![index2]!!)
}

}

}


    private val dropCellPositionHistory: DropCellPositionHistory = DropCellPositionHistory.getInstance()!!
            

                @Throws(Exception::class)
            override fun getCustomType(column: Int, row: Int, currentType: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var column = column


                    var row = row


                    var currentType = currentType

    var emptyType: Int = geographicMapCellTypeFactory!!.getEmptyType()!!
            


    var geographicMapCellPositionFactory: BasicGeographicMapCellPositionFactory = this.raceTrackGeographicMap!!.getGeographicMapCellPositionFactory()!!
            


    var cellPosition: CellPosition = geographicMapCellPositionFactory!!.getInstance(column, row)!!
            


    
                        if(dropCellPositionHistory!!.isCellPositionWithDrop(cellPosition))
                        
                                    {
                                    
    var rtsLayer: AdvancedRTSGameLayer = dropCellPositionHistory!!.getLayerInterface(cellPosition) as AdvancedRTSGameLayer


    
                        if(!(rtsLayer!!.getType() == WaypointLayer.getStaticType()))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return emptyType

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return currentType
}

override fun getCustomMapArray()
        //nullable = true from not(false or (false and true)) = true
: Array<IntArray?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return customMapArray
}


}
                
            

