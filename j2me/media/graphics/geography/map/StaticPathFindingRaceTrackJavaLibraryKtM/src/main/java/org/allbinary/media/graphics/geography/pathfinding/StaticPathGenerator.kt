
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
        package org.allbinary.media.graphics.geography.pathfinding




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.BasicArrayList
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.graphics.CellPosition
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.logic.string.StringUtil
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.BasicGeographicMapCellPositionFactory
import org.allbinary.media.graphics.geography.map.GeographicMapCellHistory
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.PathData

open public class StaticPathGenerator
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

                @Throws(Exception::class)
            
    open fun init(geographicMapInterface: BasicGeographicMap, totalPaths: Int)
        //nullable = true from not(false or (false and false)) = true
{
var geographicMapInterface = geographicMapInterface
var totalPaths = totalPaths
}

protected constructor ()
            : super()
        {
PreLogUtil.put("Using Static Path Finding", this, CommonStrings.getInstance()!!.CONSTRUCTOR)
}


                @Throws(Exception::class)
            
    open fun getGeographicMapCellPositionListFromBasicGeographicMapCellPositionList(geographicMapCellPositionFactory: BasicGeographicMapCellPositionFactory, pathList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{
    //var geographicMapCellPositionFactory = geographicMapCellPositionFactory
    //var pathList = pathList

    var list: BasicArrayList = BasicArrayList()


    var size: Int = pathList!!.size()!!


    var basicGeographicMapCellPosition: CellPosition


    var geographicMapCellPosition: GeographicMapCellPosition





                        for (index in 0 until size)

        {
basicGeographicMapCellPosition= pathList!!.get(index) as CellPosition
geographicMapCellPosition= geographicMapCellPositionFactory!!.getInstance(basicGeographicMapCellPosition!!.getColumn(), basicGeographicMapCellPosition!!.getRow())
list.add(geographicMapCellPosition)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
}


                @Throws(Exception::class)
            
    open fun getInstance(geographicMapInterface: BasicGeographicMap, geographicMapCellHistory: GeographicMapCellHistory, pathFindingInfo: PathFindingInfo, totalPaths: Int)
        //nullable =  from not(true or (false and false)) = 
: BasicArrayList{
    //var geographicMapInterface = geographicMapInterface
    //var geographicMapCellHistory = geographicMapCellHistory
    //var pathFindingInfo = pathFindingInfo
    //var totalPaths = totalPaths

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


        try {
            
    var pathCacheFactory: PathCacheFactory = PathCacheFactory.getInstance()!!


    var mapIdInteger: Integer = geographicMapInterface!!.getAllBinaryTiledLayer()!!.getDataId()!!


    var list: BasicArrayList = pathCacheFactory!!.getInstance(mapIdInteger)!!


    
                        if(list == 
                                    null
                                )
                        
                                    {
                                    list= BasicArrayList()

    var smallIntegerSingletonFactory: SmallIntegerSingletonFactory = SmallIntegerSingletonFactory.getInstance()!!


    var geographicMapCellPositionFactory: BasicGeographicMapCellPositionFactory = geographicMapInterface!!.getGeographicMapCellPositionFactory()!!


    var id: Int = PathData.getInstance()!!.OFFSET +mapIdInteger!!.toInt()


    var basicList: BasicArrayList = pathCacheFactory!!.getInstance(smallIntegerSingletonFactory!!.getInstance(id))!!


    var size: Int = basicList!!.size()!!


    var pathList: BasicArrayList





                        for (index in 0 until size)

        {
pathList= this.getGeographicMapCellPositionListFromBasicGeographicMapCellPositionList(geographicMapCellPositionFactory, basicList!!.get(index) as BasicArrayList)
list.add(pathList)
}

pathCacheFactory!!.add(mapIdInteger, list)
pathCacheFactory!!.remove(smallIntegerSingletonFactory!!.getInstance(id))

                                    }
                                
logUtil!!.put(StringMaker().
                            append("Using Cached Path(s): ")!!.append(StringUtil.getInstance()!!.toString(list))!!.toString(), this, commonStrings!!.GET_INSTANCE)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.GET_INSTANCE, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasicArrayList()
}

}


}
                
            

