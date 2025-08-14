
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
        
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.context.modules.storefront.statistics.advertisements.StoreFrontAdvertisementsStatistics
import org.allbinary.business.context.modules.storefront.statistics.advertisements.StoreFrontAdvertisementsStatisticsInterface
import org.allbinary.business.context.modules.storefront.statistics.inventory.StoreFrontInventoryStatistics
import org.allbinary.business.context.modules.storefront.statistics.inventory.StoreFrontInventoryStatisticsInterface
import org.allbinary.business.context.modules.storefront.statistics.orders.history.StoreFrontOrdersHistoryStatistics
import org.allbinary.business.context.modules.storefront.statistics.orders.history.StoreFrontOrdersHistoryStatisticsInterface
import org.allbinary.business.context.modules.storefront.statistics.users.StoreFrontUsersStatistics
import org.allbinary.business.context.modules.storefront.statistics.users.StoreFrontUsersStatisticsInterface

open public class RealTimeStoreFrontStatistics
            : Object
        
                , StoreFrontStatisticsInterface {
        

    private var storeFrontAdvertisementsStatisticsInterface: StoreFrontAdvertisementsStatisticsInterface

    private var storeFrontUsersStatisticsInterface: StoreFrontUsersStatisticsInterface

    private var storeFrontInventoryStatisticsInterface: StoreFrontInventoryStatisticsInterface

    private var storeFrontOrderHistoryStatisticsInterface: StoreFrontOrdersHistoryStatisticsInterface
public constructor        (storeFrontInterface: StoreFrontInterface)
            : super()
        {

                    var storeFrontInterface = storeFrontInterface
this.storeFrontAdvertisementsStatisticsInterface= StoreFrontAdvertisementsStatistics(storeFrontInterface) as StoreFrontAdvertisementsStatisticsInterface
this.storeFrontUsersStatisticsInterface= StoreFrontUsersStatistics(storeFrontInterface) as StoreFrontUsersStatisticsInterface
this.storeFrontInventoryStatisticsInterface= StoreFrontInventoryStatistics(storeFrontInterface) as StoreFrontInventoryStatisticsInterface
this.storeFrontOrderHistoryStatisticsInterface= StoreFrontOrdersHistoryStatistics(storeFrontInterface) as StoreFrontOrdersHistoryStatisticsInterface
}


open fun getAdvertisements()
        //nullable = true from not(false or (false and true)) = true
: StoreFrontAdvertisementsStatisticsInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.storeFrontAdvertisementsStatisticsInterface
}


open fun getUsers()
        //nullable = true from not(false or (false and true)) = true
: StoreFrontUsersStatisticsInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.storeFrontUsersStatisticsInterface
}


open fun getInventory()
        //nullable = true from not(false or (false and true)) = true
: StoreFrontInventoryStatisticsInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.storeFrontInventoryStatisticsInterface
}


open fun getOrders()
        //nullable = true from not(false or (false and true)) = true
: StoreFrontOrdersHistoryStatisticsInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.storeFrontOrderHistoryStatisticsInterface
}


}
                
            

