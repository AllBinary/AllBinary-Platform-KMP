
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
        
import org.allbinary.graphics.CellPositionFactory
import org.allbinary.media.graphics.geography.map.GeographicMapCellPositionTracking

open public class GeographicMapCellPositionEventUtil
            : Object
         {
        

    private val geographicMapCellPositionEvent: GeographicMapCellPositionEvent

    private val geographicMapCellPositionEventHandler: GeographicMapCellPositionEventHandler = GeographicMapCellPositionEventHandler.getInstance()!!
public constructor (anyType: Any)
            : super()
        {
var anyType = anyType
this.geographicMapCellPositionEvent= GeographicMapCellPositionEvent(anyType, CellPositionFactory.getInstance()!!.NONE)
}


                @Throws(Exception::class)
            
    open fun update(geographicMapCellPositionTracking: GeographicMapCellPositionTracking)
        //nullable = true from not(false or (false and false)) = true
{
var geographicMapCellPositionTracking = geographicMapCellPositionTracking
this.geographicMapCellPositionEvent!!.setGeographicMapCellPosition(geographicMapCellPositionTracking!!.getCurrentGeographicMapCellPosition())
this.geographicMapCellPositionEventHandler!!.fireEvent(this.geographicMapCellPositionEvent)
}


                @Throws(Exception::class)
            
    open fun remove(geographicMapCellPositionTracking: GeographicMapCellPositionTracking)
        //nullable = true from not(false or (false and false)) = true
{
var geographicMapCellPositionTracking = geographicMapCellPositionTracking
this.geographicMapCellPositionEvent!!.setGeographicMapCellPosition(geographicMapCellPositionTracking!!.getCurrentGeographicMapCellPosition())
this.geographicMapCellPositionEventHandler!!.fireRemoveEvent(this.geographicMapCellPositionEvent)
}


}
                
            

