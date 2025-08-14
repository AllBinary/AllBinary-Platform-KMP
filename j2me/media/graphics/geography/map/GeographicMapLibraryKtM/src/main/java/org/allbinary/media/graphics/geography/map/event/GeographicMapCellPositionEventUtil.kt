
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
        package org.allbinary.media.graphics.geography.map.event




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.media.graphics.geography.map.GeographicMapCellPositionTracking

open public class GeographicMapCellPositionEventUtil
            : Object
         {
        

    private val geographicMapCellPositionEvent: GeographicMapCellPositionEvent

    private val geographicMapCellPositionEventHandler: GeographicMapCellPositionEventHandler = GeographicMapCellPositionEventHandler.getInstance()!!
            
public constructor        (anyType: Any)
            : super()
        {

                    var anyType = anyType
geographicMapCellPositionEvent= GeographicMapCellPositionEvent(anyType, 
                            null)
}


                @Throws(Exception::class)
            
open fun update(geographicMapCellPositionTracking: GeographicMapCellPositionTracking)
        //nullable = true from not(false or (false and false)) = true
{

                    var geographicMapCellPositionTracking = geographicMapCellPositionTracking
geographicMapCellPositionEvent!!.setGeographicMapCellPosition(geographicMapCellPositionTracking!!.getCurrentGeographicMapCellPosition())
geographicMapCellPositionEventHandler!!.fireEvent(geographicMapCellPositionEvent)
}


                @Throws(Exception::class)
            
open fun remove(geographicMapCellPositionTracking: GeographicMapCellPositionTracking)
        //nullable = true from not(false or (false and false)) = true
{

                    var geographicMapCellPositionTracking = geographicMapCellPositionTracking
geographicMapCellPositionEvent!!.setGeographicMapCellPosition(geographicMapCellPositionTracking!!.getCurrentGeographicMapCellPosition())
geographicMapCellPositionEventHandler!!.fireRemoveEvent(geographicMapCellPositionEvent)
}


}
                
            

