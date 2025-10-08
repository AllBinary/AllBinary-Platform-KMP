
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
        
import org.allbinary.game.layer.pickup.PickedUpLayerInterfaceFactoryInterface
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.game.layer.drop.DropLayerFactory
import org.allbinary.game.layer.pickup.PickupLayerCircularStaticPool
import org.allbinary.game.layer.pickup.RaceTrackPickupLayer
import org.allbinary.game.rand.MyRandomFactory
import org.allbinary.graphics.GPoint
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition

open public class RaceTrackRandomDropCellPositionGenerator : RaceTrackDropCellPositionGenerator {
        
companion object {
            
    private var SINGLETON: RaceTrackRandomDropCellPositionGenerator = RaceTrackRandomDropCellPositionGenerator()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: RaceTrackRandomDropCellPositionGenerator{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
    private val myRandomFactory: MyRandomFactory = MyRandomFactory.getInstance()!!

    private val cellsPerRowOrColumn: Int = 3

    private val totalCells: Int = cellsPerRowOrColumn *cellsPerRowOrColumn

    private val rowArray: IntArray = intArrayOf(0,1,2,0,1,2,0,1,2)

    private val columnArray: IntArray = intArrayOf(0,0,0,1,1,1,2,2,2)

    private var cellWidth: Int= 0

    private var cellHeight: Int= 0
private constructor (){
}


                @Throws(Exception::class)
            
    open fun update(allBinaryGameLayerManager: AllBinaryGameLayerManager, geographicMapInterface: BasicGeographicMap)
        //nullable = true from not(false or (false and false)) = true
{
var allBinaryGameLayerManager = allBinaryGameLayerManager
var geographicMapInterface = geographicMapInterface
super.update(allBinaryGameLayerManager, geographicMapInterface)

    var tiledLayer: AllBinaryTiledLayer = geographicMapInterface!!.getAllBinaryTiledLayer()!!

this.cellWidth= tiledLayer!!.getCellWidth() /this.cellsPerRowOrColumn
this.cellHeight= tiledLayer!!.getCellHeight() /this.cellsPerRowOrColumn
}


                @Throws(Exception::class)
            
    open fun drop(allBinaryLayerManager: AllBinaryLayerManager, index: Int)
        //nullable = true from not(false or (false and false)) = true
{
var allBinaryLayerManager = allBinaryLayerManager
var index = index

    var geographicMapCellPosition: GeographicMapCellPosition = this.list.get(index) as GeographicMapCellPosition


    var point: GPoint = geographicMapCellPosition!!.getPoint()!!


    var randomCell: Int = myRandomFactory!!.getAbsoluteNextInt(this.totalCells)!!


    var row: Int = this.rowArray[randomCell]!!


    var column: Int = this.columnArray[randomCell]!!


    var x: Int = point.getX() +(row *this.cellWidth)


    var y: Int = point.getY() +(column *this.cellHeight)


    var pickedUpLayerInterfaceFactory: PickedUpLayerInterfaceFactoryInterface = DropLayerFactory.getInstance()!!.getRandomInstance()!!


    var tiledLayer: AllBinaryTiledLayer = this.raceTrackGeographicMap!!.getAllBinaryTiledLayer()!!


    var pickupLayer: RaceTrackPickupLayer = PickupLayerCircularStaticPool.getInstance()!!.getInstance(pickedUpLayerInterfaceFactory, x, y, tiledLayer!!.getZP() +3) as RaceTrackPickupLayer

pickupLayer!!.setTiledLayer(tiledLayer)
allBinaryLayerManager!!.append(pickupLayer)
}


}
                
            

