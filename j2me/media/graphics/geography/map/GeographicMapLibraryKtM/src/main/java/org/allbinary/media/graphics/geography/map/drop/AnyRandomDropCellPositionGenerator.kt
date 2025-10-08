
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
        package org.allbinary.media.graphics.geography.map.drop




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.BasicArrayList
import org.allbinary.game.layer.AllBinaryGameLayerManager
import org.allbinary.game.layer.AllBinaryTiledLayer
import org.allbinary.game.rand.MyRandomFactory
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.media.graphics.geography.map.BasicGeographicMapCellPositionFactory
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.BasicGeographicMap

open public class AnyRandomDropCellPositionGenerator : BaseDropCellPositionGenerator {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val list: BasicArrayList = BasicArrayList()

    var geographicMapInterface: BasicGeographicMap

                @Throws(Exception::class)
            
    open fun update(allBinaryGameLayerManager: AllBinaryGameLayerManager, geographicMapInterface: BasicGeographicMap)
        //nullable = true from not(false or (false and false)) = true
{
var allBinaryGameLayerManager = allBinaryGameLayerManager
var geographicMapInterface = geographicMapInterface
this.geographicMapInterface= geographicMapInterface

    var basicGeographicMapCellPositionFactory: BasicGeographicMapCellPositionFactory = geographicMapInterface!!.getGeographicMapCellPositionFactory()!!


    var randomFactory: MyRandomFactory = MyRandomFactory.getInstance()!!


    var tiledLayer: AllBinaryTiledLayer = geographicMapInterface!!.getAllBinaryTiledLayer()!!


    var total: Int = tiledLayer!!.getColumns() *tiledLayer!!.getRows()


    var randomColumn: Int= 0


    var randomRow: Int= 0


    var geographicMapCellPosition: GeographicMapCellPosition





                        for (index in total  - 1  downTo 0)

        {
randomColumn= randomFactory!!.getAbsoluteNextInt(tiledLayer!!.getColumns())
randomRow= randomFactory!!.getAbsoluteNextInt(tiledLayer!!.getRows())
geographicMapCellPosition= basicGeographicMapCellPositionFactory!!.getInstance(randomColumn, randomRow)

    
                        if(this.isDropAllowedAt(geographicMapCellPosition))
                        
                                    {
                                    this.list.add(geographicMapCellPosition)

                                    }
                                
}

}


                @Throws(Exception::class)
            
    open fun processTick(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
var allBinaryLayerManager = allBinaryLayerManager
}


}
                
            

