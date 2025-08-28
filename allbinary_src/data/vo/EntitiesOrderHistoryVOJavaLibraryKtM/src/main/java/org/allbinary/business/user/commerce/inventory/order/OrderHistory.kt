
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
        package org.allbinary.business.user.commerce.inventory.order




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Date
import java.util.HashMap
import java.util.Set
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.entry.EntryData
import org.allbinary.business.user.UserData
import org.allbinary.business.user.address.BillingAddressData
import org.allbinary.business.user.address.ShippingAddressData
import org.allbinary.business.user.address.StreetAddress
import org.allbinary.business.user.commerce.inventory.basket.BasketInterface
import org.allbinary.business.user.commerce.money.Money
import org.allbinary.business.user.commerce.money.MoneyException
import org.allbinary.business.user.commerce.money.payment.Payment
import org.allbinary.business.user.commerce.money.payment.PaymentData
import org.allbinary.business.user.commerce.shipping.ShippingMethodData
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.logic.string.StringUtil
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class OrderHistory : Order
                , OrderHistoryInterface {
        

    private var userName: String

    private var shippingAddress: StreetAddress

    private var billingAddress: StreetAddress

    private var payment: Payment

    private var shipDate: String

    private var orderDate: String

    private var transDate: String

    private var cancelDate: String

    private var status: String

    private var subTotal: Money

    private var shippingCost: Money

    private var taxes: Money

    private var total: Money
public constructor        (basketInterface: BasketInterface)                        

                            : super(basketInterface){
var basketInterface = basketInterface


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (basketInterface: BasketInterface, orderHistory: OrderHistory)                        

                            : super(orderHistory!!.getStoreName(), basketInterface, orderHistory!!.getId(), orderHistory!!.getShippingMethod(), orderHistory!!.getSpecial(), orderHistory!!.getPaymentMethod()){
var basketInterface = basketInterface
var orderHistory = orderHistory


                            //For kotlin this is before the body of the constructor.
                    
this.userName= orderHistory!!.getUserName()
this.shippingAddress= orderHistory!!.getShippingAddress()
this.billingAddress= orderHistory!!.getBillingAddress()
this.payment= orderHistory!!.getPaymentInfo()
this.shipDate= orderHistory!!.getShipDate()
this.orderDate= orderHistory!!.getOrderDate()
this.transDate= orderHistory!!.getTransDate()
this.cancelDate= orderHistory!!.getCancelDate()
this.status= orderHistory!!.getStatus()
this.subTotal= orderHistory!!.getSubTotal()
this.shippingCost= orderHistory!!.getShippingCost()
this.taxes= orderHistory!!.getTaxes()
this.total= orderHistory!!.getTotal()
super.setUserComments(orderHistory!!.getUserComments() as String)
super.setUserCancelComments(orderHistory!!.getUserCancelComments() as String)
super.setStoreComments(orderHistory!!.getStoreComments() as String)
super.setStoreCancelComments(orderHistory!!.getStoreCancelComments() as String)
}

public constructor        (basketInterface: BasketInterface, orderHistoryHashMap: HashMap<Any, Any>)                        

                            : super(orderHistoryHashMap!!.get(StoreFrontData.getInstance()!!.NAME) as String, basketInterface, orderHistoryHashMap!!.get(OrderData.ID) as String, orderHistoryHashMap!!.get(ShippingMethodData.NAME) as String, orderHistoryHashMap!!.get(EntryData.getInstance()!!.SPECIAL) as String, orderHistoryHashMap!!.get(PaymentData.METHOD) as String){
var basketInterface = basketInterface
var orderHistoryHashMap = orderHistoryHashMap


                            //For kotlin this is before the body of the constructor.
                    
this.shippingAddress= StreetAddress(orderHistoryHashMap!!.get(ShippingAddressData.NAME) as String, orderHistoryHashMap!!.get(ShippingAddressData.STREET) as String, orderHistoryHashMap!!.get(ShippingAddressData.CITY) as String, orderHistoryHashMap!!.get(ShippingAddressData.STATE) as String, orderHistoryHashMap!!.get(ShippingAddressData.CODE) as String, orderHistoryHashMap!!.get(ShippingAddressData.COUNTRY) as String)
this.billingAddress= StreetAddress(orderHistoryHashMap!!.get(BillingAddressData.NAME) as String, orderHistoryHashMap!!.get(BillingAddressData.STREET) as String, orderHistoryHashMap!!.get(BillingAddressData.CITY) as String, orderHistoryHashMap!!.get(BillingAddressData.STATE) as String, orderHistoryHashMap!!.get(BillingAddressData.CODE) as String, orderHistoryHashMap!!.get(BillingAddressData.COUNTRY) as String)
this.payment= Payment(orderHistoryHashMap)
this.userName= orderHistoryHashMap!!.get(UserData.USERNAME) as String
this.orderDate= orderHistoryHashMap!!.get(OrderHistoryData.ORDERDATE) as String
this.shipDate= orderHistoryHashMap!!.get(OrderHistoryData.SHIPPEDDATE) as String
this.transDate= orderHistoryHashMap!!.get(OrderHistoryData.TRANSDATE) as String
this.cancelDate= orderHistoryHashMap!!.get(OrderHistoryData.CANCELDATE) as String
this.status= orderHistoryHashMap!!.get(OrderHistoryData.STATUS) as String
this.subTotal= Money(orderHistoryHashMap!!.get(OrderHistoryData.SUBTOTAL) as String)
this.total= Money(orderHistoryHashMap!!.get(OrderHistoryData.TOTAL) as String)
this.shippingCost= Money(orderHistoryHashMap!!.get(OrderHistoryData.SHIPPINGCOST) as String)
this.taxes= Money(orderHistoryHashMap!!.get(OrderHistoryData.TAX) as String)
super.setUserComments(orderHistoryHashMap!!.get(OrderData.CUSTOMERCOMMENT) as String)
super.setUserCancelComments(orderHistoryHashMap!!.get(OrderData.CUSTOMERCANCELCOMMENT) as String)
super.setStoreComments(orderHistoryHashMap!!.get(OrderData.STORECOMMENT) as String)
super.setStoreCancelComments(orderHistoryHashMap!!.get(OrderData.STORECANCELCOMMENT) as String)
}


open fun setUserName(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.userName= value
}


open fun setDefaultShippingAddress(shippingAddress: StreetAddress)
        //nullable = true from not(false or (false and false)) = true
{
var shippingAddress = shippingAddress
this.shippingAddress= shippingAddress
}


open fun setBillingAddress(billingAddress: StreetAddress)
        //nullable = true from not(false or (false and false)) = true
{
var billingAddress = billingAddress
this.billingAddress= billingAddress
}


open fun setPaymentInfo(payment: Payment)
        //nullable = true from not(false or (false and false)) = true
{
var payment = payment
this.payment= payment
}


open fun setShipDate(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.shipDate= value
}


open fun setOrderDate(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.orderDate= value
}


open fun setTransDate(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.transDate= value
}


open fun setCancelDate(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.cancelDate= value
}


open fun setStatus(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.status= value
}


open fun setSubTotal(value: Money)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.subTotal= value
}


open fun setShippingCost(value: Money)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.shippingCost= value
}


open fun setTaxes(value: Money)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.taxes= value
}


open fun setTotal(value: Money)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.total= value
}


open fun getUserName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.userName
}


open fun getShippingAddress()
        //nullable = true from not(false or (false and true)) = true
: StreetAddress{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.shippingAddress
}


open fun getBillingAddress()
        //nullable = true from not(false or (false and true)) = true
: StreetAddress{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.billingAddress
}


open fun getPaymentInfo()
        //nullable = true from not(false or (false and true)) = true
: Payment{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.payment
}


open fun getShipDate()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.shipDate
}


open fun getOrderDate()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.orderDate
}


open fun getTransDate()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.transDate
}


open fun getCancelDate()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.cancelDate
}


open fun getStatus()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.status
}


open fun getSubTotal()
        //nullable = true from not(false or (false and true)) = true
: Money{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.subTotal
}


open fun getShippingCost()
        //nullable = true from not(false or (false and true)) = true
: Money{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.shippingCost
}


open fun getTaxes()
        //nullable = true from not(false or (false and true)) = true
: Money{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.taxes
}


open fun getTotal()
        //nullable = true from not(false or (false and true)) = true
: Money{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.total
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{

    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(UserData.USERNAME, this.userName)
hashMap!!.put(OrderHistoryData.ORDERDATE, this.orderDate)
hashMap!!.put(OrderHistoryData.SHIPPEDDATE, this.shipDate)
hashMap!!.put(OrderHistoryData.TRANSDATE, this.transDate)
hashMap!!.put(OrderHistoryData.CANCELDATE, this.cancelDate)
hashMap!!.put(OrderHistoryData.ORDERDATEFORMATTED, Date(this.orderDate as Long.
                            longValue()).
                            toString())
hashMap!!.put(OrderHistoryData.SHIPPEDDATEFORMATTED, Date(this.shipDate as Long.
                            longValue()).
                            toString())
hashMap!!.put(OrderHistoryData.TRANSDATEFORMATTED, Date(this.transDate as Long.
                            longValue()).
                            toString())
hashMap!!.put(OrderHistoryData.CANCELDATEFORMATTED, Date(this.cancelDate as Long.
                            longValue()).
                            toString())
hashMap!!.put(OrderHistoryData.STATUS, this.status)
hashMap!!.put(OrderHistoryData.SUBTOTAL, this.subTotal!!.toString())
hashMap!!.put(OrderHistoryData.TOTAL, this.total.toString())
hashMap!!.put(OrderHistoryData.SHIPPINGCOST, this.shippingCost!!.toString())
hashMap!!.put(OrderHistoryData.TAX, this.taxes.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{
var document = document

    var hashMap: HashMap<Any, Any> = this.toHashMap()!!


    var keySet: Set = hashMap!!.keys!!


    var keyArray: Array<Any?> = keySet!!.toArray()!!


    var size: Int = keyArray!!.size
                


    var node: Node = document.createElement(OrderHistoryData.ORDERHISTORY)!!

node.appendChild(super.toXmlNode(document))

    var billingAddressNode: Node = document.createElement(BillingAddressData.BILLINGADDRESS)!!

billingAddressNode!!.appendChild(this.billingAddress!!.toXmlNode(document))

    var shippingAddressNode: Node = document.createElement(ShippingAddressData.SHIPPINGADDRESS)!!

shippingAddressNode!!.appendChild(this.shippingAddress!!.toXmlNode(document))
node.appendChild(billingAddressNode)
node.appendChild(shippingAddressNode)
node.appendChild(this.payment.toXmlNode(document))




                        for (i in 0 until size)

        {

    var name: String = keyArray[i]!! as String


    var value: String = hashMap!!.get(name as Object) as String

value= StringUtil.getInstance()!!.getInstance(value)
node.appendChild(ModDomHelper.createNameValueNodes(document, name, value))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            

