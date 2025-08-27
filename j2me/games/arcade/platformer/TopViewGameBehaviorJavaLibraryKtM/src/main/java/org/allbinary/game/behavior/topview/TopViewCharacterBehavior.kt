
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.direction.Direction
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.GeographicMapCellType
import org.allbinary.media.graphics.geography.map.topview.BasicTopViewGeographicMapCellTypeFactory

open public class TopViewCharacterBehavior
            : Object
         {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            
open fun terrainEvent(layer: AllBinaryLayer, direction: Direction, x: Int, y: Int, geographicMapInterfaceArray: Array<BasicGeographicMap?>, geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
{

                    var layer = layer


                    var direction = direction


                    var x = x


                    var y = y


                    var geographicMapInterfaceArray = geographicMapInterfaceArray


                    var geographicMapCellPosition = geographicMapCellPosition
}


open fun terrainMove(layer: AllBinaryLayer, geographicMapInterfaceArray: Array<BasicGeographicMap?>, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var layer = layer


                    var geographicMapInterfaceArray = geographicMapInterfaceArray


                    var x = x


                    var y = y
}


open fun hasSolidBlock(geographicMapInterfaceArray: Array<BasicGeographicMap?>, geographicMapCellTypeArray: Array<GeographicMapCellType?>)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var geographicMapInterfaceArray = geographicMapInterfaceArray


                    var geographicMapCellTypeArray = geographicMapCellTypeArray

    var size: Int = geographicMapInterfaceArray!!.size
                


    var basicTopViewGeographicMapCellTypeFactory: BasicTopViewGeographicMapCellTypeFactory





                        for (index in 0 until size)

        {basicTopViewGeographicMapCellTypeFactory= geographicMapInterfaceArray[index]!!.getGeographicMapCellTypeFactory() as BasicTopViewGeographicMapCellTypeFactory

    
                        if(basicTopViewGeographicMapCellTypeFactory!!.BLOCK_CELL_TYPE.isType(geographicMapCellTypeArray[index]!!))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

