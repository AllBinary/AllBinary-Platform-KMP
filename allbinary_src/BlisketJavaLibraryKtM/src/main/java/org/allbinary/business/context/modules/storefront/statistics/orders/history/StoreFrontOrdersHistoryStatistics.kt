
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
        package org.allbinary.business.context.modules.storefront.statistics.orders.history




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.user.commerce.inventory.order.OrderHistoryInterface
import org.allbinary.business.user.commerce.money.Money
import org.allbinary.data.tables.user.commerce.inventory.order.OrderHistoryEntityFactory
import org.allbinary.data.tables.user.commerce.inventory.order.OrderHistoryEntityInterface

open public class StoreFrontOrdersHistoryStatistics
            : Object
        
                , StoreFrontOrdersHistoryStatisticsInterface {
        

    private var numberOfOrdersLong: Long

    private var subTotalMoney: Money

    private var shippingCostMoney: Money

    private var taxesMoney: Money

    private var totalMoney: Money
public constructor        (storeFrontInterface: StoreFrontInterface)
            : super()
        {

                    var storeFrontInterface = storeFrontInterface
this.subTotalMoney= Money()
this.shippingCostMoney= Money()
this.taxesMoney= Money()
this.totalMoney= Money()

    var orderHistoryEntityInterface: OrderHistoryEntityInterface = OrderHistoryEntityFactory.getInstance()!!


    var orderHistoryInterfaceVector: Vector = orderHistoryEntityInterface!!.getStoreOrders(storeFrontInterface)!!


    var numberOfOrders: Long = 0


    var orderHistoryInterface: OrderHistoryInterface


    var size: Int = orderHistoryInterfaceVector!!.size!!





                        for (index in 0 until size)


        {orderHistoryInterface= orderHistoryInterfaceVector!!.get(index) as OrderHistoryInterface
numberOfOrders= numberOfOrders +1
this.subTotalMoney!!.add(orderHistoryInterface!!.getSubTotal())
this.shippingCostMoney!!.add(orderHistoryInterface!!.getShippingCost())
this.taxesMoney!!.add(orderHistoryInterface!!.getTaxes())
this.totalMoney!!.add(orderHistoryInterface!!.getTotal())
}

this.numberOfOrdersLong= numberOfOrders as Long
}


open fun getNumberOfOrders()
        //nullable = true from not(false or (false and true)) = true
: Long{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.numberOfOrdersLong
}


open fun getSubTotal()
        //nullable = true from not(false or (false and true)) = true
: Money{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.subTotalMoney
}


open fun getShippingCost()
        //nullable = true from not(false or (false and true)) = true
: Money{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.shippingCostMoney
}


open fun getTaxes()
        //nullable = true from not(false or (false and true)) = true
: Money{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.taxesMoney
}


open fun getTotal()
        //nullable = true from not(false or (false and true)) = true
: Money{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.totalMoney
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()


    var storeFrontOrdersHistoryStatisticsData: StoreFrontOrdersHistoryStatisticsData = StoreFrontOrdersHistoryStatisticsData.getInstance()!!

hashMap!!.put(storeFrontOrdersHistoryStatisticsData!!.NUMBEROFORDERS, this.getNumberOfOrders()!!.toString())
hashMap!!.put(storeFrontOrdersHistoryStatisticsData!!.SUBTOTAL, this.getSubTotal()!!.toString())
hashMap!!.put(storeFrontOrdersHistoryStatisticsData!!.SHIPPINGCOST, this.getShippingCost()!!.toString())
hashMap!!.put(storeFrontOrdersHistoryStatisticsData!!.TAXES, this.getTaxes()!!.toString())
hashMap!!.put(storeFrontOrdersHistoryStatisticsData!!.TOTAL, this.getTotal()!!.toString())



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
                
            

