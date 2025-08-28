
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
        package org.allbinary.game.media.graphics.geography.map.racetrack




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.pathfinding.PathFinderGraphVisitorFactoryBase
import org.allbinary.media.graphics.geography.pathfinding.PathFinderGraphVisitorBase

open public class SimplePathFinderGraphVisitorFactory : PathFinderGraphVisitorFactoryBase {
        

    private val edgeMinimum: Int

    private val minPathWeight: Int

    private val maxPathWeight: Int
public constructor        ()                        

                            : this(10, 8, 100000)

        Updates for KMP build        
        {


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (edgeMinimum: Int, minPathWeight: Int, maxPathWeight: Int)

        Updates for KMP build        
        {
var edgeMinimum = edgeMinimum
var minPathWeight = minPathWeight
var maxPathWeight = maxPathWeight
this.edgeMinimum= edgeMinimum
this.minPathWeight= minPathWeight
this.maxPathWeight= maxPathWeight
}


open fun getInstance(geographicMapInterface: BasicGeographicMap)
        //nullable =  from not(true or (false and false)) = 
: PathFinderGraphVisitorBase

        Updates for KMP build        
        {
var geographicMapInterface = geographicMapInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasePathFinderGraphVisitor(geographicMapInterface, this.edgeMinimum, this.minPathWeight, this.maxPathWeight)
}


}
                
            

