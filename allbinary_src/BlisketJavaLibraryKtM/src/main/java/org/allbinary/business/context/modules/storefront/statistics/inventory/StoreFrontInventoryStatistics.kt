
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
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.user.commerce.inventory.item.ItemInterface
import org.allbinary.business.user.commerce.money.Money
import org.allbinary.data.tables.user.commerce.inventory.item.InventoryEntityFactory
import org.allbinary.data.tables.user.commerce.inventory.item.InventoryEntityInterface

open public class StoreFrontInventoryStatistics
            : Object
        
                , StoreFrontInventoryStatisticsInterface {
        

    private var totalNumberOfItems: Long= 0

    private var totalInventorySaleValueMoney: Money
public constructor        (storeFrontInterface: StoreFrontInterface)
            : super()
        {

                    var storeFrontInterface = storeFrontInterface
this.totalInventorySaleValueMoney= Money()

    var inventoryEntityInterface: InventoryEntityInterface = InventoryEntityFactory.getInstance()!!.getInventoryEntityInstance()!!
            


    var itemVector: Vector = inventoryEntityInterface!!.getItems(storeFrontInterface)!!
            


    var size: Int = itemVector!!.size!!
            





                        for (index in 0 until size)


        {
    var itemInterface: ItemInterface = itemVector!!.get(index) as ItemInterface


    var numberInStock: Int = Integer.valueOf(itemInterface!!.getNumber())!!.toInt()!!
            

this.totalNumberOfItems= this.totalNumberOfItems +numberInStock

    var itemPriceMoney: Money = itemInterface!!.getPrice()!!
            

itemPriceMoney!!.multiply(numberInStock)
this.totalInventorySaleValueMoney!!.add(itemPriceMoney!!.toString())
}

}


open fun getNumber()
        //nullable = true from not(false or (false and true)) = true
: Long{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.totalNumberOfItems as Long
}


open fun getTotal()
        //nullable = true from not(false or (false and true)) = true
: Money{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.totalInventorySaleValueMoney
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(StoreFrontInventoryStatisticsData.getInstance()!!.NUMBEROFITEMS, this.getNumber()!!.toString())
hashMap!!.put(StoreFrontInventoryStatisticsData.getInstance()!!.TOTALVALUE, this.getTotal()!!.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


open fun toVector()
        //nullable = true from not(false or (false and true)) = true
: Vector{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Any{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


}
                
            

