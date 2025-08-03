
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class StoreFrontInventoryStatisticsData
            : Object
         {
        

        companion object {


    private val instance: StoreFrontInventoryStatisticsData = StoreFrontInventoryStatisticsData()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: StoreFrontInventoryStatisticsData{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            private constructor        ()
            : super()
        {}


    val NAME: String = "STOREFRONT_INVENTORY_STATISTICS_NAME"

    val NUMBEROFITEMS: String = "STOREFRONT_INVENTORY_STATISTICS_NUMBER_OF_ITEMS"

    val TOTALVALUE: String = "STOREFRONT_INVENTORY_STATISTICS_TOTAL_VALUE"

}
                
            

