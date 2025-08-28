
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
        package org.allbinary.media.graphics.geography.map




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class MultiGeographicMapBehavior
            : Object
         {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            
open fun getCellTypeAt(geographicMapInterfaceArray: Array<BasicGeographicMap?>, geographicMapCellTypeArray: Array<GeographicMapCellType?>, geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: Array<GeographicMapCellType?>{
    //var geographicMapInterfaceArray = geographicMapInterfaceArray
    //var geographicMapCellTypeArray = geographicMapCellTypeArray
    //var geographicMapCellPosition = geographicMapCellPosition

    var size: Int = geographicMapInterfaceArray!!.size
                


    var cellType: GeographicMapCellType = 
                null
            





                        for (index in size  - 1  downTo 0)

        {
cellType= geographicMapInterfaceArray[index]!!.getCellTypeAt(geographicMapCellPosition)
geographicMapCellTypeArray[index]= cellType
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellTypeArray
}


}
                
            

