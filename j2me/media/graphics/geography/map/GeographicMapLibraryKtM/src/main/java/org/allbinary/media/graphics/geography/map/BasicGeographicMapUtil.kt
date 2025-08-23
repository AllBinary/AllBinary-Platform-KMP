
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
        package org.allbinary.media.graphics.geography.map




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.layer.Layer
import org.allbinary.string.CommonStrings
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil

open public class BasicGeographicMapUtil
            : Object
         {
        

        companion object {
            
    private val instance: BasicGeographicMapUtil = BasicGeographicMapUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BasicGeographicMapUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

                @Throws(Exception::class)
            
open fun getBorderingRow(direction: Int, oldGeographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var direction = direction


                    var oldGeographicMapCellPosition = oldGeographicMapCellPosition

    var LOCATION_CHANGE: Int = 1



        when (direction) {
            0 -> {


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return oldGeographicMapCellPosition!!.getRow()
}
1 -> {


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return oldGeographicMapCellPosition!!.getRow()
}
2 -> {


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return oldGeographicMapCellPosition!!.getRow() +LOCATION_CHANGE
}
3 -> {


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return oldGeographicMapCellPosition!!.getRow() -LOCATION_CHANGE
}
else -> {


                            throw Exception("Only Four Directions")
}

        }       
        
    
}


                @Throws(Exception::class)
            
open fun getBorderingColumn(direction: Int, oldGeographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var direction = direction


                    var oldGeographicMapCellPosition = oldGeographicMapCellPosition

    var LOCATION_CHANGE: Int = 1



        when (direction) {
            0 -> {


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return oldGeographicMapCellPosition!!.getColumn() -LOCATION_CHANGE
}
1 -> {


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return oldGeographicMapCellPosition!!.getColumn() +LOCATION_CHANGE
}
2 -> {


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return oldGeographicMapCellPosition!!.getColumn()
}
3 -> {


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return oldGeographicMapCellPosition!!.getColumn()
}
else -> {


                            throw Exception("Only Four Directions")
}

        }       
        
    
}


                @Throws(Exception::class)
            
open fun isSameCellPosition(fromGeographicMapCellPosition: GeographicMapCellPosition, toGeographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var fromGeographicMapCellPosition = fromGeographicMapCellPosition


                    var toGeographicMapCellPosition = toGeographicMapCellPosition

    var fromColumn: Int = fromGeographicMapCellPosition!!.getColumn()!!


    var fromRow: Int = fromGeographicMapCellPosition!!.getRow()!!


    var goColumn: Int = toGeographicMapCellPosition!!.getColumn()!!


    var goRow: Int = toGeographicMapCellPosition!!.getRow()!!


    
                        if(fromColumn == goColumn && fromRow == goRow)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


open fun createAllBinaryTiledLayerArray(geographicMapInterfaceArray: Array<BasicGeographicMap?>)
        //nullable = true from not(false or (false and false)) = true
: Array<Layer?>{

                    var geographicMapInterfaceArray = geographicMapInterfaceArray

    var tiledLayerArray: Array<Layer?> = arrayOfNulls(geographicMapInterfaceArray!!.size)




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.createAllBinaryTiledLayerArray(geographicMapInterfaceArray, tiledLayerArray, 0)
}


open fun createAllBinaryTiledLayerArray(geographicMapInterfaceArray: Array<BasicGeographicMap?>, tiledLayerArray: Array<Layer?>, startIndex: Int)
        //nullable = true from not(false or (false and false)) = true
: Array<Layer?>{

                    var geographicMapInterfaceArray = geographicMapInterfaceArray


                    var tiledLayerArray = tiledLayerArray


                    var startIndex = startIndex

    var geographicMapInterface: BasicGeographicMap


    var size: Int = geographicMapInterfaceArray!!.size
                


    var count: Int = 0





                        for (index in size +startIndex  - 1  downTo startIndex)


        {geographicMapInterface= geographicMapInterfaceArray[index]!!
tiledLayerArray[count++]= geographicMapInterface!!.getAllBinaryTiledLayer()
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return tiledLayerArray
}


open fun move(geographicMapInterfaceArray: Array<BasicGeographicMap?>, dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var geographicMapInterfaceArray = geographicMapInterfaceArray


                    var dx = dx


                    var dy = dy

    var geographicMapInterface: BasicGeographicMap


    var size: Int = geographicMapInterfaceArray!!.size
                





                        for (index in size  - 1  downTo 0)


        {geographicMapInterface= geographicMapInterfaceArray[index]!!
geographicMapInterface!!.getAllBinaryTiledLayer()!!.move(dx, dy)
}

}


open fun setPosition(geographicMapInterfaceArray: Array<BasicGeographicMap?>, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var geographicMapInterfaceArray = geographicMapInterfaceArray


                    var x = x


                    var y = y

    var geographicMapInterface: BasicGeographicMap


    var size: Int = geographicMapInterfaceArray!!.size
                





                        for (index in size  - 1  downTo 0)


        {geographicMapInterface= geographicMapInterfaceArray[index]!!
geographicMapInterface!!.getAllBinaryTiledLayer()!!.setPosition(x, y, geographicMapInterface!!.getAllBinaryTiledLayer()!!.getZP())
}

}


}
                
            

