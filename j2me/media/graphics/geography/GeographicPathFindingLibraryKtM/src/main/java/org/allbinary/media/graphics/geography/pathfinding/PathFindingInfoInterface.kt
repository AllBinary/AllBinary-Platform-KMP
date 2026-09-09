
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.BasicArrayList

interface PathFindingInfoInterface {
        

    open fun getStartPathFindingNodeList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList

    open fun getEndPathFindingNodeList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList

    open fun getPathFinder()
        //nullable = true from not(false or (false and true)) = true
: GeographicPathFinderBase

}
                
            

