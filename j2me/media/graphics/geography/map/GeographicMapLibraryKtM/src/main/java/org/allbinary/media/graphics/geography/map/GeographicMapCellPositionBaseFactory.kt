
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
        

open public class GeographicMapCellPositionBaseFactory
            : Object
         {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            
open fun getInstance(geographicMapInterface: BasicGeographicMap)
        //nullable =  from not(true or (false and false)) = 
: BasicGeographicMapCellPositionFactory{
var geographicMapInterface = geographicMapInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasicGeographicMapCellPositionFactory(geographicMapInterface)
}


}
                
            

