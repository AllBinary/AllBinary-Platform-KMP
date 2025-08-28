
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
import org.allbinary.util.BasicArrayList
import org.allbinary.util.CircularIndexUtil
import org.allbinary.game.layer.geographic.map.LayerCoveringCellPositionsUtil
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.CellPositionsUtil
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.util.BasicArrayListUtil

open public class GeographicMapCellPositionArea
            : Object
         {
        

    private val cellPositionsUtil: CellPositionsUtil = CellPositionsUtil.getInstance()!!

    private val layerCoveringCellPositionsUtil: LayerCoveringCellPositionsUtil = LayerCoveringCellPositionsUtil.getInstance()!!

    private val reusableOccupyingGeographicMapCellPositionList: BasicArrayList = BasicArrayList(4)

    private val reusableSurroundingGeographicMapCellPositionList: BasicArrayList = BasicArrayList(12)

    private val surroundingCircularIndexUtil: CircularIndexUtil = CircularIndexUtil.getInstance(0)!!

    private val layerInterface: AllBinaryLayer

    private var LIST: BasicArrayList = BasicArrayListUtil.getInstance()!!.getImmutableInstance()!!

    private var occupyingGeographicMapCellPositionList: BasicArrayList = LIST

    private var surroundingGeographicMapCellPositionList: BasicArrayList = LIST
public constructor        (layerInterface: AllBinaryLayer)
            : super()
        {
    //var layerInterface = layerInterface
this.layerInterface= layerInterface
}


                @Throws(Exception::class)
            
open fun update(geographicMapInterface: BasicGeographicMap)
        //nullable = true from not(false or (false and false)) = true
{
    //var geographicMapInterface = geographicMapInterface
this.occupyingGeographicMapCellPositionList= layerCoveringCellPositionsUtil!!.getAll(geographicMapInterface, layerInterface, layerInterface!!.getXP(), layerInterface!!.getYP(), reusableOccupyingGeographicMapCellPositionList)
this.surroundingGeographicMapCellPositionList= cellPositionsUtil!!.getAllSurrounding(geographicMapInterface, occupyingGeographicMapCellPositionList, reusableSurroundingGeographicMapCellPositionList)
this.surroundingCircularIndexUtil!!.setSize(this.surroundingGeographicMapCellPositionList!!.size())
}


open fun getOccupyingGeographicMapCellPositionList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return occupyingGeographicMapCellPositionList
}


open fun getSurroundingGeographicMapCellPositionList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return surroundingGeographicMapCellPositionList
}


open fun getNextSurroundingGeographicMapCellPosition()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPosition{

    var geographicMapCellPosition: GeographicMapCellPosition = this.surroundingGeographicMapCellPositionList!!.get(this.surroundingCircularIndexUtil!!.getIndex()) as GeographicMapCellPosition

this.surroundingCircularIndexUtil!!.next()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellPosition
}


}
                
            

