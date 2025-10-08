
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
        package org.allbinary.business.user.commerce.money.tax.modules




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.user.address.StreetAddress

interface TaxModuleInterface {
        

                @Throws(Exception::class)
            
    open fun getTaxRate(streetAddress: StreetAddress, storeFrontInterface: StoreFrontInterface)
        //nullable = true from not(false or (false and false)) = true
: Float

                @Throws(Exception::class)
            
    open fun isValid(streetAddress: StreetAddress, storeFrontInterface: StoreFrontInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean

}
                
            

