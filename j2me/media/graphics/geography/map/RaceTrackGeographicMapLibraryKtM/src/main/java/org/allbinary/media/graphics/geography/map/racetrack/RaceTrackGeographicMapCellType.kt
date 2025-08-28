
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
        package org.allbinary.media.graphics.geography.map.racetrack




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.string.CommonStrings
import org.allbinary.media.graphics.geography.map.GeographicMapCellType

open public class RaceTrackGeographicMapCellType : GeographicMapCellType {
        

    val name: String

    private val travelCost: Int
public constructor        (type: Int, travelCost: Int)                        

                            : super(type)

        Updates for KMP build        
        {
    //var type = type
    //var travelCost = travelCost


                            //For kotlin this is before the body of the constructor.
                    
this.travelCost= travelCost

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

this.name= commonStrings!!.UNKNOWN
}

public constructor        (name: String, type: Int, travelCost: Int)                        

                            : super(type)

        Updates for KMP build        
        {
    //var name = name
    //var type = type
    //var travelCost = travelCost


                            //For kotlin this is before the body of the constructor.
                    
this.name= name
this.travelCost= travelCost
}


open fun getTravelCost()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return travelCost
}


}
                
            

