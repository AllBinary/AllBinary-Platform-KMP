
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
        

open public class PathFindingNodeCostInfoData
            : Object
         {
        
companion object {
            
    private val instance: PathFindingNodeCostInfoData = PathFindingNodeCostInfoData()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PathFindingNodeCostInfoData{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor ()
            : super()
        {
}


    var MAX_TOTAL_COST: Int = Integer.MAX_VALUE

    var MAX_NODE_COST: Int = Integer.MAX_VALUE /10000

}
                
            

