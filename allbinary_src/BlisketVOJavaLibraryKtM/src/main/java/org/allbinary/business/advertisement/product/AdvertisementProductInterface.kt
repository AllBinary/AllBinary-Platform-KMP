
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
        package org.allbinary.business.advertisement.product




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.control.contraints.size.TwoDimensionalConstraintInterface

interface AdvertisementProductInterface {
        

    open fun getType()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getLink()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getNumber()
        //nullable = true from not(false or (false and true)) = true
: Int

    open fun getTwoDimensionalConstraint()
        //nullable = true from not(false or (false and true)) = true
: TwoDimensionalConstraintInterface

}
                
            

