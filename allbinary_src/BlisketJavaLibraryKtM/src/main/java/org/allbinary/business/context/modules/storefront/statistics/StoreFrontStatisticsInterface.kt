
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
        package org.allbinary.business.context.modules.storefront.statistics




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.context.modules.storefront.statistics.advertisements.StoreFrontAdvertisementsStatisticsInterface
import org.allbinary.business.context.modules.storefront.statistics.inventory.StoreFrontInventoryStatisticsInterface
import org.allbinary.business.context.modules.storefront.statistics.orders.history.StoreFrontOrdersHistoryStatisticsInterface
import org.allbinary.business.context.modules.storefront.statistics.users.StoreFrontUsersStatisticsInterface

interface StoreFrontStatisticsInterface {
        

    open fun getAdvertisements()
        //nullable = true from not(false or (false and true)) = true
: StoreFrontAdvertisementsStatisticsInterface

    open fun getUsers()
        //nullable = true from not(false or (false and true)) = true
: StoreFrontUsersStatisticsInterface

    open fun getInventory()
        //nullable = true from not(false or (false and true)) = true
: StoreFrontInventoryStatisticsInterface

    open fun getOrders()
        //nullable = true from not(false or (false and true)) = true
: StoreFrontOrdersHistoryStatisticsInterface

}
                
            

