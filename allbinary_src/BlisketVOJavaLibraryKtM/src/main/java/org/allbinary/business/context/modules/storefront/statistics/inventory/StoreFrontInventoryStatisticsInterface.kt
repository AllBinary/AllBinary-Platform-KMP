
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
        package org.allbinary.business.context.modules.storefront.statistics.inventory




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.user.commerce.money.Money
import org.allbinary.data.tables.TableMappingInterface
interface StoreFrontInventoryStatisticsInterface : TableMappingInterface {
        

open fun getNumber()
        //nullable = true from not(false or (false and true)) = true
: Long

open fun getTotal()
        //nullable = true from not(false or (false and true)) = true
: Money

}
                
            

