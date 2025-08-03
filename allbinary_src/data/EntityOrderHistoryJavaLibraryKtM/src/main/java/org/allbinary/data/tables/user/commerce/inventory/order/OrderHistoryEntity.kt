
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
        package org.allbinary.data.tables.user.commerce.inventory.order



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Calendar
import java.util.HashMap
import java.util.Random
import java.util.Vector
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.entry.EntryData
import org.allbinary.business.init.db.HistoryDbInitInfo
import org.allbinary.business.user.UserData
import org.allbinary.business.user.address.BillingAddressData
import org.allbinary.business.user.address.ShippingAddressData
import org.allbinary.business.user.address.StreetAddress
import org.allbinary.business.user.commerce.inventory.basket.Basket
import org.allbinary.business.user.commerce.inventory.basket.BasketInterface
import org.allbinary.business.user.commerce.inventory.order.Order
import org.allbinary.business.user.commerce.inventory.order.OrderData
import org.allbinary.business.user.commerce.inventory.order.OrderHistory
import org.allbinary.business.user.commerce.inventory.order.OrderHistoryData
import org.allbinary.business.user.commerce.money.Money
import org.allbinary.business.user.commerce.money.payment.PaymentData
import org.allbinary.business.user.commerce.money.payment.PaymentInterface
import org.allbinary.business.user.commerce.money.tax.TaxFactory
import org.allbinary.business.user.commerce.shipping.ShippingMethodData
import org.allbinary.business.user.commerce.shipping.ShippingMethods
import org.allbinary.business.user.commerce.shipping.modules.ShippingInterface
import org.allbinary.data.generator.OrderHistoryIdGenerator
import org.allbinary.data.tables.TableDataFactory
import org.allbinary.data.tables.user.address.billing.BillingAddressesEntity
import org.allbinary.data.tables.user.address.shipping.ShippingAddressesEntity
import org.allbinary.data.tables.user.commerce.money.payment.PaymentEntity
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.AbSqlBean
import org.allbinary.logic.control.crypt.SuperCrypt
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.ServiceClientInformationInterfaceFactory

open public class OrderHistoryEntity : AbSqlBean
                , OrderHistoryEntityInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val tableName: String = "orderhistory"
public constructor        ()                        

                            : super(HistoryDbInitInfo()){

                            //For kotlin this is before the body of the constructor.
                    
this.setTableName(tableName)
}


open fun insert(userName: String, order: Order)
        //nullable = true from not(false or (false and false)) = true
{

                    var userName = userName


                    var order = order

    var vector: Vector = Vector()


        try {
            
    var paymentInterface: PaymentInterface = PaymentEntity().
                            getDefault(userName)!!
            


    var billingAddress: StreetAddress = BillingAddressesEntity(userName).
                            getDefault()!!
            


    var shippingAddress: StreetAddress = ShippingAddressesEntity(userName).
                            getDefault()!!
            


    var abeClientInformation: AbeClientInformationInterface = ServiceClientInformationInterfaceFactory.getInstance()!!
            


    var storeFrontInterface: StoreFrontInterface = StoreFrontFactory.getInstance(order!!.getStoreName())!!
            


    var shippingInterface: ShippingInterface = ShippingMethods(abeClientInformation, storeFrontInterface).
                            getShippingInterface(order!!.getShippingMethod())!!
            


    var shippingCost: Money = shippingInterface!!.getCost(order)!!
            


    var basketInterface: BasketInterface = order!!.getBasket()!!
            


    var subTotal: Money = basketInterface!!.getSubTotal()!!
            


    var taxRate: Float = TaxFactory.getInstance()!!.getInstance(abeClientInformation, storeFrontInterface)!!.getTaxRate(shippingAddress, storeFrontInterface)!!
            


    var tax: Money = Money()


    var total: Money = Money()

total!!.add(shippingCost!!.toString())
total!!.add(subTotal!!.toString())
tax!!.add(total!!.toString())
tax!!.multiply(taxRate)
total!!.add(tax!!.toString())

    var empty: String = StringUtil.getInstance()!!.EMPTY_STRING

vector!!.add(OrderHistoryIdGenerator().
                            getNext())

    var ZERO: String = TableDataFactory.getInstance()!!.ZERO_STRING

vector!!.add(order!!.getId())
vector!!.add(userName)
vector!!.add(order!!.getStoreName())

    var calendar: Calendar = Calendar.getInstance()!!
            


    var time: String = Long(calendar!!.getTimeInMillis()).
                            toString().toCharArray().concatToString()
                                

vector!!.add(ZERO)
vector!!.add(time)
vector!!.add(ZERO)
vector!!.add(ZERO)
vector!!.add(OrderHistoryData.PREPROCESSING)
vector!!.add(order!!.getPaymentMethod())

    
                        if(paymentInterface != 
                                    null
                                )
                        
                                    {
                                    vector!!.add(paymentInterface!!.getName())
vector!!.add(paymentInterface!!.getType())
vector!!.add(paymentInterface!!.getExpiration())

    var random: Int = Random().
                            nextInt(SuperCrypt.KEYMAX)!!
            

vector!!.add(SuperCrypt(random).
                            encrypt(paymentInterface!!.getNumber()))
vector!!.add(Integer(random).
                            toString())

                                    }
                                
                        else {
                            vector!!.add(empty)
vector!!.add(empty)
vector!!.add(empty)
vector!!.add(empty)
vector!!.add(ZERO)

                        }
                            

    
                        if(billingAddress != 
                                    null
                                )
                        
                                    {
                                    vector!!.add(billingAddress!!.getName())
vector!!.add(billingAddress!!.getStreet())
vector!!.add(billingAddress!!.getCity())
vector!!.add(billingAddress!!.getState())
vector!!.add(billingAddress!!.getCode())
vector!!.add(billingAddress!!.getCountry())

                                    }
                                
                        else {
                            vector!!.add(empty)
vector!!.add(empty)
vector!!.add(empty)
vector!!.add(empty)
vector!!.add(empty)
vector!!.add(empty)

                        }
                            

    
                        if(shippingAddress != 
                                    null
                                )
                        
                                    {
                                    vector!!.add(shippingAddress!!.getName())
vector!!.add(shippingAddress!!.getStreet())
vector!!.add(shippingAddress!!.getCity())
vector!!.add(shippingAddress!!.getState())
vector!!.add(shippingAddress!!.getCode())
vector!!.add(shippingAddress!!.getCountry())

                                    }
                                
                        else {
                            vector!!.add(empty)
vector!!.add(empty)
vector!!.add(empty)
vector!!.add(empty)
vector!!.add(empty)
vector!!.add(empty)

                        }
                            
vector!!.add(order!!.getShippingMethod())
vector!!.add(subTotal!!.toString())
vector!!.add(shippingCost!!.toString())
vector!!.add(tax!!.toString())
vector!!.add(total!!.toString())
vector!!.add(order!!.getSpecial())
vector!!.add(order!!.getUserComments())
vector!!.add(order!!.getUserCancelComments())
vector!!.add(order!!.getStoreComments())
vector!!.add(order!!.getStoreCancelComments())
this.insert(vector)

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, INSERT)

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put("Command Failed: " +vector, this, INSERT, e)

                                    }
                                
}

}


open fun insert(values: Vector)
        //nullable = true from not(false or (false and false)) = true
{

                    var values = values

        try {
            super.insert(values)

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.SUCCESS, this, INSERT)

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, INSERT, e)

                                    }
                                
}

}


open fun setStatus(orderId: String, status: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var orderId = orderId


                    var status = status

        try {
            
    var calendar: Calendar = Calendar.getInstance()!!
            


    var time: String = Long(calendar!!.getTimeInMillis()).
                            toString().toCharArray().concatToString()
                                


    var updateHashMap: HashMap<Any, Any> = HashMap<Any, Any>()

updateHashMap!!.put(OrderHistoryData.STATUS, status)

    
                        if(status!!.compareTo(OrderHistoryData.CANCELLED) == 0)
                        
                                    {
                                    updateHashMap!!.put(OrderHistoryData.CANCELDATE, time)

                                    }
                                
                             else 
    
                        if(status!!.compareTo(OrderHistoryData.SHIPPED) == 0)
                        
                                    {
                                    updateHashMap!!.put(OrderHistoryData.SHIPPEDDATE, time)

                                    }
                                
super.updateWhere(OrderData.ID, orderId, updateHashMap)
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, 
                            "setStatus", e)

                                    }
                                
}

}


open fun setPaymentMethod(orderId: String, paymentMethod: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var orderId = orderId


                    var paymentMethod = paymentMethod

        try {
            
    var calendar: Calendar = Calendar.getInstance()!!
            


    var time: String = Long(calendar!!.getTimeInMillis()).
                            toString().toCharArray().concatToString()
                                


    var updateHashMap: HashMap<Any, Any> = HashMap<Any, Any>()

updateHashMap!!.put(PaymentData.METHOD, paymentMethod)
updateHashMap!!.put(OrderHistoryData.TRANSDATE, time)
super.updateWhere(OrderData.ID, orderId, updateHashMap)
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, 
                            "setPaymentMethod", e)

                                    }
                                
}

}


                @Throws(Exception::class)
            
open fun getStoreOrders(storeFrontInterface: StoreFrontInterface)
        //nullable = true from not(false or (false and false)) = true
: Vector{

                    var storeFrontInterface = storeFrontInterface

    var orderReviewVector: Vector = Vector()


    var whereHashMap: HashMap<Any, Any> = HashMap<Any, Any>()

whereHashMap!!.put(StoreFrontData.getInstance()!!.NAME, storeFrontInterface!!.getName())

    var orderHashMapVector: Vector = super.getRows(whereHashMap)!!
            


    var size: Int = orderHashMapVector!!.size!!
            





                        for (i in 0 until size)


        {
    var orderReviewHashMap: HashMap<Any, Any> = orderHashMapVector!!.get(i as Object?) as HashMap<Any, Any>


    var orderReview: OrderHistory = OrderHistory(Basket(), orderReviewHashMap)

orderReviewVector!!.add(orderReview)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return orderReviewVector
}


                @Throws(Exception::class)
            
open fun getOrders(userName: String)
        //nullable = true from not(false or (false and false)) = true
: Vector{

                    var userName = userName

    var orderReviewVector: Vector = Vector()


    var whereHashMap: HashMap<Any, Any> = HashMap<Any, Any>()

whereHashMap!!.put(UserData.USERNAME, userName)

    var orderHashMapVector: Vector = super.getRows(whereHashMap)!!
            


    var size: Int = orderHashMapVector!!.size!!
            





                        for (index in 0 until size)


        {
    var orderReviewHashMap: HashMap<Any, Any> = orderHashMapVector!!.get(index as Object?) as HashMap<Any, Any>


    var orderReview: OrderHistory = OrderHistory(Basket(), orderReviewHashMap)

orderReviewVector!!.add(orderReview)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return orderReviewVector
}


                @Throws(Exception::class)
            
open fun getOrders(status: String, fromDate: String, toDate: String)
        //nullable = true from not(false or (false and false)) = true
: Vector{

                    var status = status


                    var fromDate = fromDate


                    var toDate = toDate

    var orderReviewVector: Vector = Vector()


    var whereHashMap: HashMap<Any, Any> = HashMap<Any, Any>()

whereHashMap!!.put(OrderHistoryData.STATUS, status)

    var orderHashMapVector: Vector = super.getRowsWhereBetween(whereHashMap, OrderHistoryData.ORDERDATE, fromDate, toDate)!!
            


    var size: Int = orderHashMapVector!!.size!!
            





                        for (index in 0 until size)


        {
    var orderReviewHashMap: HashMap<Any, Any> = orderHashMapVector!!.get(index as Object?) as HashMap<Any, Any>


    var orderReview: OrderHistory = OrderHistory(Basket(), orderReviewHashMap)

orderReviewVector!!.add(orderReview)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return orderReviewVector
}


                @Throws(Exception::class)
            
open fun getOrders(fromDate: String, toDate: String)
        //nullable = true from not(false or (false and false)) = true
: Vector{

                    var fromDate = fromDate


                    var toDate = toDate

    var orderReviewVector: Vector = Vector()


    var orderHashMapVector: Vector = super.getRowsWhereBetween(OrderHistoryData.ORDERDATE, fromDate, toDate)!!
            


    var size: Int = orderHashMapVector!!.size!!
            





                        for (index in 0 until size)


        {
    var orderReviewHashMap: HashMap<Any, Any> = orderHashMapVector!!.get(index as Object?) as HashMap<Any, Any>


    var orderReview: OrderHistory = OrderHistory(Basket(), orderReviewHashMap)

orderReviewVector!!.add(orderReview)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return orderReviewVector
}


                @Throws(Exception::class)
            
open fun getOrder(id: String)
        //nullable = true from not(false or (false and false)) = true
: OrderHistory{

                    var id = id

    var whereHashMap: HashMap<Any, Any> = HashMap<Any, Any>()

whereHashMap!!.put(OrderData.ID, id)

    var orderReviewHashMap: HashMap<Any, Any> = super.getRow(whereHashMap)!!
            


    
                        if(orderReviewHashMap != 
                                    null
                                )
                        
                                    {
                                    
    var orderHistory: OrderHistory = OrderHistory(Basket(), orderReviewHashMap)




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return orderHistory

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                        }
                            
}


open fun createTableStatement()
        //nullable = true from not(false or (false and true)) = true
: String{
    var entryData: EntryData = EntryData.getInstance()!!
            


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "CREATE TABLE ")
stringBuffer!!.append(tableName)
stringBuffer!!.append(
                            " (")
stringBuffer!!.append(entryData!!.ID)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)
stringBuffer!!.append(OrderData.ID)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)
stringBuffer!!.append(UserData.USERNAME)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(StoreFrontData.getInstance()!!.NAME)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(OrderHistoryData.SHIPPEDDATE)
stringBuffer!!.append(
                            " BIGINT(19) UNSIGNED ,")
stringBuffer!!.append(OrderHistoryData.ORDERDATE)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)
stringBuffer!!.append(OrderHistoryData.TRANSDATE)
stringBuffer!!.append(
                            " BIGINT(19) UNSIGNED ,")
stringBuffer!!.append(OrderHistoryData.CANCELDATE)
stringBuffer!!.append(
                            " BIGINT(19) UNSIGNED ,")
stringBuffer!!.append(OrderHistoryData.STATUS)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentData.METHOD)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(PaymentData.NAME)
stringBuffer!!.append(
                            " VARCHAR(255) ,")
stringBuffer!!.append(PaymentData.TYPE)
stringBuffer!!.append(
                            " VARCHAR(255) ,")
stringBuffer!!.append(PaymentData.EXPIRATION)
stringBuffer!!.append(
                            " VARCHAR(255) ,")
stringBuffer!!.append(PaymentData.NUMBER)
stringBuffer!!.append(
                            " VARCHAR(255) ,")
stringBuffer!!.append(entryData!!.ENCRYPTION)
stringBuffer!!.append(
                            " BIGINT(19) UNSIGNED ,")
stringBuffer!!.append(BillingAddressData.NAME)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(BillingAddressData.STREET)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(BillingAddressData.CITY)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(BillingAddressData.STATE)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(BillingAddressData.CODE)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(BillingAddressData.COUNTRY)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(ShippingAddressData.NAME)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(ShippingAddressData.STREET)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(ShippingAddressData.CITY)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(ShippingAddressData.STATE)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(ShippingAddressData.CODE)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(ShippingAddressData.COUNTRY)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(ShippingMethodData.NAME)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(OrderHistoryData.SUBTOTAL)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(OrderHistoryData.SHIPPINGCOST)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(OrderHistoryData.TAX)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(OrderHistoryData.TOTAL)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(entryData!!.SPECIAL)
stringBuffer!!.append(
                            " VARCHAR(255) ,")
stringBuffer!!.append(OrderData.CUSTOMERCOMMENT)
stringBuffer!!.append(this.sqlTypeStrings!!.BLOB_NOT_NULL)
stringBuffer!!.append(OrderData.CUSTOMERCANCELCOMMENT)
stringBuffer!!.append(this.sqlTypeStrings!!.BLOB_NOT_NULL)
stringBuffer!!.append(OrderData.STORECOMMENT)
stringBuffer!!.append(this.sqlTypeStrings!!.BLOB_NOT_NULL)
stringBuffer!!.append(OrderData.STORECANCELCOMMENT)
stringBuffer!!.append(this.sqlTypeStrings!!.BLOB_NOT_NULL)
stringBuffer!!.append(
                            "PRIMARY KEY(")
stringBuffer!!.append(entryData!!.ID)
stringBuffer!!.append(
                            ") )")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun createTable()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.createTable(this.createTableStatement())
}


open fun dropTable()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.dropTable()
}


                @Throws(Exception::class)
            
open fun update(whereHashMap: HashMap<Any, Any>, orderHashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var whereHashMap = whereHashMap


                    var orderHashMap = orderHashMap

        try {
            updateWhere(whereHashMap, orderHashMap)
} catch(e: Exception)
            {


                            throw e
}

}


}
                
            

