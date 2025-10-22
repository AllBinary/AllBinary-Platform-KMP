
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
        
import org.allbinary.logic.NullUtil

open public class GeographicMapCellHistoryProgress : GeographicMapCellHistoryProgressBase {
        

    private var totalVisitedArray: IntArray = NullUtil.getInstance()!!.NULL_INT_ARRAY

    private var geographicMapCellHistoryArray: Array<GeographicMapCellHistory?> = GeographicMapCellHistory.NULL_GEOGRPAHIC_MAP_HISTORY_ARRAY
public constructor (geographicMapCellHistoryArray: Array<GeographicMapCellHistory?>){
    //var geographicMapCellHistoryArray = geographicMapCellHistoryArray
this.geographicMapCellHistoryArray= geographicMapCellHistoryArray
this.init()
}


    override fun init()
        //nullable = true from not(false or (false and true)) = true
{
this.totalVisitedArray= IntArray(this.geographicMapCellHistoryArray!!.size)
}


    override fun isAnyProgress()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

    var isProgressing: Boolean = false


    var size: Int = geographicMapCellHistoryArray!!.size
                


    var currentTotalVisited: Int= 0


    var totalVisited: Int= 0





                        for (index in 0 until size)

        {
totalVisited= geographicMapCellHistoryArray[index]!!.getTotalVisited()
currentTotalVisited= this.totalVisitedArray[index]!!

    
                        if(currentTotalVisited < totalVisited)
                        
                                    {
                                    isProgressing= true
this.totalVisitedArray[index]= totalVisited

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return isProgressing
}


}
                
            

