
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
        package org.allbinary.media.graphics.geography.map.platform




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Enumeration
import java.util.Hashtable
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.media.graphics.geography.map.GeographicMapCellType
import org.allbinary.media.graphics.geography.map.GeographicMapCellTypeFactory
import org.allbinary.util.BasicArrayList

open public class BasicPlatormGeographicMapCellTypeFactory : GeographicMapCellTypeFactory {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val BLOCK_CELL_TYPE: BasicPlatormGeographicMapCellType

    val JUMP_THRU_CELL_TYPE: BasicPlatormGeographicMapCellType

    val LADDER_CELL_TYPE: BasicPlatormGeographicMapCellType

    private val maxTileId: Int
public constructor (tileTypeToTileIdsMap: Hashtable<Any, Any>, maxTileId: Int){
    //var tileTypeToTileIdsMap = tileTypeToTileIdsMap
    //var maxTileId = maxTileId

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.START, this, commonStrings!!.INIT)
this.maxTileId= maxTileId

                        //Otherwise - ExpressionStmt - expression - ObjectCreationExpr


    var BLOCK_CELL_TYPE: BasicPlatormGeographicMapCellType = BasicPlatormGeographicMapCellType(1)


    var JUMP_THRU_CELL_TYPE: BasicPlatormGeographicMapCellType = BLOCK_CELL_TYPE


    var LADDER_CELL_TYPE: BasicPlatormGeographicMapCellType = BLOCK_CELL_TYPE


    var PLATFORM: String = "Platform"


    var JUMP_TRHU: String = "JumpThru"


    var LADDER: String = "Ladder"


    var enumeration: Enumeration<Any?> = tileTypeToTileIdsMap!!.keys()!!


    var idsWithTypeList: BasicArrayList


    var key: String


    var basicPlatormGeographicMapCellType: BasicPlatormGeographicMapCellType


        while(enumeration.hasMoreElements())
        {
key= enumeration.nextElement()!! as String
logUtil!!.put(key, this, commonStrings!!.INIT)
idsWithTypeList= tileTypeToTileIdsMap!!.get(key) as BasicArrayList
basicPlatormGeographicMapCellType= BasicPlatormGeographicMapCellType(idsWithTypeList)

    
                        if(key.equals(PLATFORM))
                        
                                    {
                                    BLOCK_CELL_TYPE= basicPlatormGeographicMapCellType

                                    }
                                

    
                        if(key.equals(JUMP_TRHU))
                        
                                    {
                                    JUMP_THRU_CELL_TYPE= basicPlatormGeographicMapCellType

                                    }
                                

    
                        if(key.equals(LADDER))
                        
                                    {
                                    LADDER_CELL_TYPE= basicPlatormGeographicMapCellType

                                    }
                                
}

this.BLOCK_CELL_TYPE= BLOCK_CELL_TYPE
this.JUMP_THRU_CELL_TYPE= JUMP_THRU_CELL_TYPE
this.LADDER_CELL_TYPE= LADDER_CELL_TYPE

                        //Otherwise - ExpressionStmt - expression - ObjectCreationExpr


                        //Otherwise - ExpressionStmt - expression - ObjectCreationExpr

}


    open fun getStartType()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.maxTileId -1
}


    open fun getEndType()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.maxTileId -2
}


    open fun getEmptyType()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


    open fun isPath(cellType: GeographicMapCellType)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var cellType = cellType

    
                        if(cellType!!.getType() == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

