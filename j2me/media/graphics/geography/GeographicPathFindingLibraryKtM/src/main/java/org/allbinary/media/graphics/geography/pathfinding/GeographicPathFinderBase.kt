
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
        
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class GeographicPathFinderBase
            : Object
         {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

                @Throws(Exception::class)
            
open fun search(startPathFindingNodeList: BasicArrayList, endPathFindingNodeList: BasicArrayList, totalPaths: Int)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var startPathFindingNodeList = startPathFindingNodeList


                    var endPathFindingNodeList = endPathFindingNodeList


                    var totalPaths = totalPaths



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
open fun searchN(startPathFindingNodeList: BasicArrayList, endPathFindingNodeList: BasicArrayList, totalPaths: Int, multipassState: MultipassState)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var startPathFindingNodeList = startPathFindingNodeList


                    var endPathFindingNodeList = endPathFindingNodeList


                    var totalPaths = totalPaths


                    var multipassState = multipassState



                            throw RuntimeException()
}


}
                
            

