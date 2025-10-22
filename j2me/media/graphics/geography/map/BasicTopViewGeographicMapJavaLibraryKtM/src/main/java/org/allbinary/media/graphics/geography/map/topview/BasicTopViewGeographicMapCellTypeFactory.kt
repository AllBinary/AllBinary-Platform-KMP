
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
        package org.allbinary.media.graphics.geography.map.topview




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.media.graphics.geography.map.GeographicMapCellType
import org.allbinary.media.graphics.geography.map.GeographicMapCellTypeFactory
import org.allbinary.media.graphics.geography.map.racetrack.RaceTrackGeographicMapCellType
import org.allbinary.util.BasicArrayList
import org.allbinary.util.HashtableUtil

open public class BasicTopViewGeographicMapCellTypeFactory : GeographicMapCellTypeFactory {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val BLOCK_CELL_TYPE: BasicTopViewGeographicMapCellType

    val OFF_MAP_CELL_TYPE: BasicTopViewGeographicMapCellType

    val FLOOR_CELL_TYPE: BasicTopViewGeographicMapCellType

    val DOOR_CELL_TYPE: BasicTopViewGeographicMapCellType

    val STAIRS_UP_CELL_TYPE: BasicTopViewGeographicMapCellType

    val STAIRS_DOWN_CELL_TYPE: BasicTopViewGeographicMapCellType

    val OTHER_CELL_TYPE: BasicTopViewGeographicMapCellType

    private val maxTileId: Int
private constructor (){
this.maxTileId= 9

    var basicTopViewGeographicMapStrings: BasicTopViewGeographicMapStrings = BasicTopViewGeographicMapStrings.getInstance()!!

RaceTrackGeographicMapCellType(0, 999)

    var BLOCK_CELL_TYPE: BasicTopViewGeographicMapCellType = BasicTopViewGeographicMapCellType(basicTopViewGeographicMapStrings!!.DEFAULT, 1, 1)


    var OFF_MAP_CELL_TYPE: BasicTopViewGeographicMapCellType = BLOCK_CELL_TYPE


    var FLOOR_CELL_TYPE: BasicTopViewGeographicMapCellType = BLOCK_CELL_TYPE


    var DOOR_CELL_TYPE: BasicTopViewGeographicMapCellType = BLOCK_CELL_TYPE


    var STAIRS_UP_CELL_TYPE: BasicTopViewGeographicMapCellType = BLOCK_CELL_TYPE


    var STAIRS_DOWN_CELL_TYPE: BasicTopViewGeographicMapCellType = BLOCK_CELL_TYPE


    var OTHER_CELL_TYPE: BasicTopViewGeographicMapCellType = BLOCK_CELL_TYPE

this.BLOCK_CELL_TYPE= BLOCK_CELL_TYPE
this.OFF_MAP_CELL_TYPE= OFF_MAP_CELL_TYPE
this.FLOOR_CELL_TYPE= FLOOR_CELL_TYPE
this.DOOR_CELL_TYPE= DOOR_CELL_TYPE
this.STAIRS_UP_CELL_TYPE= STAIRS_UP_CELL_TYPE
this.STAIRS_DOWN_CELL_TYPE= STAIRS_DOWN_CELL_TYPE
this.OTHER_CELL_TYPE= OTHER_CELL_TYPE
}

public constructor (tileTypeToTileIdsMap: Hashtable<Any, Any>, maxTileId: Int){
    //var tileTypeToTileIdsMap = tileTypeToTileIdsMap
    //var maxTileId = maxTileId

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)
this.maxTileId= maxTileId

    var basicTopViewGeographicMapStrings: BasicTopViewGeographicMapStrings = BasicTopViewGeographicMapStrings.getInstance()!!


    var geographicMapCellTypeFactory: GeographicMapCellTypeFactory = GeographicMapCellTypeFactory.getInstance()!!


    var geographicMapCellTypeArray: Array<GeographicMapCellType?> = geographicMapCellTypeFactory!!.getGeographicMapCellTypeArray()!!


    var type: Int = 0


    
                        if(geographicMapCellTypeArray[type] == 
                                    null
                                )
                        
                                    {
                                    RaceTrackGeographicMapCellType(type, 999)

                                    }
                                
                        else {
                            
                        }
                            

    var BLOCK_CELL_TYPE: BasicTopViewGeographicMapCellType = BasicTopViewGeographicMapCellType(basicTopViewGeographicMapStrings!!.DEFAULT, 1, 1)


    var OFF_MAP_CELL_TYPE: BasicTopViewGeographicMapCellType = BLOCK_CELL_TYPE


    var FLOOR_CELL_TYPE: BasicTopViewGeographicMapCellType = BLOCK_CELL_TYPE


    var DOOR_CELL_TYPE: BasicTopViewGeographicMapCellType = BLOCK_CELL_TYPE


    var STAIRS_UP_CELL_TYPE: BasicTopViewGeographicMapCellType = BLOCK_CELL_TYPE


    var STAIRS_DOWN_CELL_TYPE: BasicTopViewGeographicMapCellType = BLOCK_CELL_TYPE


    var OTHER_CELL_TYPE: BasicTopViewGeographicMapCellType = BLOCK_CELL_TYPE


    var keyArray: Array<Any?> = HashtableUtil.getInstance()!!.getKeysAsArray(tileTypeToTileIdsMap)!!


    var size: Int = keyArray!!.size
                


    var idsWithTypeList: BasicArrayList


    var key: String


    var basicPlatormGeographicMapCellType: BasicTopViewGeographicMapCellType





                        for (index in 0 until size)

        {
key= keyArray[index]!! as String
idsWithTypeList= tileTypeToTileIdsMap!!.get(key) as BasicArrayList

    
                        if(key.equals(basicTopViewGeographicMapStrings!!.WALL))
                        
                                    {
                                    basicPlatormGeographicMapCellType= BasicTopViewGeographicMapCellType(basicTopViewGeographicMapStrings!!.WALL, idsWithTypeList, 1000)
BLOCK_CELL_TYPE= basicPlatormGeographicMapCellType

                                    }
                                
                             else 
    
                        if(key.equals(basicTopViewGeographicMapStrings!!.OFF_MAP))
                        
                                    {
                                    basicPlatormGeographicMapCellType= BasicTopViewGeographicMapCellType(basicTopViewGeographicMapStrings!!.OFF_MAP, idsWithTypeList, 1001)
OFF_MAP_CELL_TYPE= basicPlatormGeographicMapCellType

                                    }
                                
                             else 
    
                        if(key.equals(basicTopViewGeographicMapStrings!!.FLOOR))
                        
                                    {
                                    basicPlatormGeographicMapCellType= BasicTopViewGeographicMapCellType(basicTopViewGeographicMapStrings!!.FLOOR, idsWithTypeList, 1)
FLOOR_CELL_TYPE= basicPlatormGeographicMapCellType

                                    }
                                
                             else 
    
                        if(key.equals(basicTopViewGeographicMapStrings!!.DOOR))
                        
                                    {
                                    basicPlatormGeographicMapCellType= BasicTopViewGeographicMapCellType(basicTopViewGeographicMapStrings!!.DOOR, idsWithTypeList, 1)
DOOR_CELL_TYPE= basicPlatormGeographicMapCellType

                                    }
                                
                             else 
    
                        if(key.equals(basicTopViewGeographicMapStrings!!.STAIRS_UP))
                        
                                    {
                                    basicPlatormGeographicMapCellType= BasicTopViewGeographicMapCellType(basicTopViewGeographicMapStrings!!.STAIRS_UP, idsWithTypeList, 1)
STAIRS_UP_CELL_TYPE= basicPlatormGeographicMapCellType

                                    }
                                
                             else 
    
                        if(key.equals(basicTopViewGeographicMapStrings!!.STAIRS_DOWN))
                        
                                    {
                                    basicPlatormGeographicMapCellType= BasicTopViewGeographicMapCellType(basicTopViewGeographicMapStrings!!.STAIRS_DOWN, idsWithTypeList, 1)
STAIRS_DOWN_CELL_TYPE= basicPlatormGeographicMapCellType

                                    }
                                
                             else 
    
                        if(key.equals(basicTopViewGeographicMapStrings!!.OTHER))
                        
                                    {
                                    basicPlatormGeographicMapCellType= BasicTopViewGeographicMapCellType(basicTopViewGeographicMapStrings!!.OTHER, idsWithTypeList, 1)
OTHER_CELL_TYPE= basicPlatormGeographicMapCellType

                                    }
                                
}

this.BLOCK_CELL_TYPE= BLOCK_CELL_TYPE
this.OFF_MAP_CELL_TYPE= OFF_MAP_CELL_TYPE
this.FLOOR_CELL_TYPE= FLOOR_CELL_TYPE
this.DOOR_CELL_TYPE= DOOR_CELL_TYPE
this.STAIRS_UP_CELL_TYPE= STAIRS_UP_CELL_TYPE
this.STAIRS_DOWN_CELL_TYPE= STAIRS_DOWN_CELL_TYPE
this.OTHER_CELL_TYPE= OTHER_CELL_TYPE
type= this.maxTileId -1

    
                        if(geographicMapCellTypeArray[type] == 
                                    null
                                )
                        
                                    {
                                    RaceTrackGeographicMapCellType(commonStrings!!.START, type, 1)

                                    }
                                
                        else {
                            
                        }
                            
type= this.maxTileId -2

    
                        if(geographicMapCellTypeArray[type] == 
                                    null
                                )
                        
                                    {
                                    RaceTrackGeographicMapCellType(commonStrings!!.START, type, 1)

                                    }
                                
                        else {
                            
                        }
                            
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
                        return this.FLOOR_CELL_TYPE.getTypes()[0]!!
}


    open fun isPath(cellType: GeographicMapCellType)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var cellType = cellType

    
                        if(this.FLOOR_CELL_TYPE.isType(cellType))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append("key: WALL/BLOCK_CELL_TYPE: ")!!.append(this.BLOCK_CELL_TYPE.toString())!!.append("key: FLOOR_CELL_TYPE: ")!!.append(this.FLOOR_CELL_TYPE.toString())!!.append("key: OTHER_CELL_TYPE: ")!!.append(this.OTHER_CELL_TYPE.toString())!!.append("key: OFF_MAP_CELL_TYPE: ")!!.append(this.OFF_MAP_CELL_TYPE.toString())!!.append("key: DOOR_CELL_TYPE: ")!!.append(this.DOOR_CELL_TYPE.toString())!!.append("key: STAIRS_DOWN_CELL_TYPE: ")!!.append(this.STAIRS_DOWN_CELL_TYPE.toString())!!.append("key: STAIRS_UP_CELL_TYPE: ")!!.append(this.STAIRS_UP_CELL_TYPE.toString())!!.toString()
}


}
                
            

