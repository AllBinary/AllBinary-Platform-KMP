
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
        package org.allbinary.game.behavior.topview.placement




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.mapeditor.core.TiledMap

open public class AllAnimationsEverywhereTileMapPlacementVisitor : TileMapPlacementVisitor {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun visit(lastMap: TiledMap, mapData: Array<IntArray?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var lastMap = lastMap


                    var mapData = mapData

    var size: Int = mapData!!.size
                


    var size2: Int = mapData[0]!!.length -7





                        for (index in 0 until size)

        {



                        for (index2 in 0 until size2)

        {mapData[index]!![index2]= 1
mapData[index]!![index2 +1]= 17
mapData[index]!![index2 +2]= 33
mapData[index]!![index2 +3]= 49
mapData[index]!![index2 +4]= 65
mapData[index]!![index2 +5]= 81
mapData[index]!![index2 +6]= 97
}

}

}


}
                
            

