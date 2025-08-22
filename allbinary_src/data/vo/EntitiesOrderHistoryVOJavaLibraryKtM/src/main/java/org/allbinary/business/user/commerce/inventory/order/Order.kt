
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
        
import java.io.Serializable
import java.util.HashMap
import java.util.Set
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.entry.EntryData
import org.allbinary.business.user.commerce.inventory.basket.BasketInterface
import org.allbinary.business.user.commerce.money.payment.PaymentData
import org.allbinary.business.user.commerce.shipping.ShippingMethodData
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.StringValidationUtil
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class Order
            : Object
        
                , OrderInterface
                , Serializable {
        

    private val basket: BasketInterface

    private var paymentMethod: String

    private var shippingType: String

    private var storeName: String

    private var special: String

    private var id: String

    private var userComment: String

    private var userCancelComment: String

    private var storeComment: String

    private var storeCancelComment: String
public constructor        (basket: BasketInterface)
            : super()
        {

                    var basket = basket
this.basket= basket
id= 
                                        null
                                    
shippingType= StringUtil.getInstance()!!.EMPTY_STRING
}

public constructor        (storeName: String, basket: BasketInterface, id: String, shippingType: String, special: String, paymentMethod: String)
            : super()
        {

                    var storeName = storeName


                    var basket = basket


                    var id = id


                    var shippingType = shippingType


                    var special = special


                    var paymentMethod = paymentMethod
this.storeName= storeName
this.basket= basket
this.id= id
this.shippingType= shippingType
this.special= special
this.paymentMethod= paymentMethod
}


open fun isIdValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(this.getId() == 
                                    null
                                 || this.getId()!!.compareTo(StringUtil.getInstance()!!.EMPTY_STRING) == 0 || this.getId()!!.length() > OrderHistoryData.MAXIDLEN || !StringValidationUtil.getInstance()!!.isNumber(this.getId()))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
}


open fun getIdValidationInfo()
        //nullable = true from not(false or (false and true)) = true
: String{
    var EMPTY_STRING: String = StringUtil.getInstance()!!.EMPTY_STRING


    
                        if(this.getId() == 
                                    null
                                 || this.getId()!!.compareTo(EMPTY_STRING) == 0 || this.getId()!!.length() > OrderHistoryData.MAXIDLEN || !StringValidationUtil.getInstance()!!.isNumber(this.getId()))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Please enter a valid order Id < " +OrderHistoryData.MAXIDLEN +" digits in length.<br>"

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return EMPTY_STRING
}


open fun setShippingMethod(shippingType: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var shippingType = shippingType
this.shippingType= shippingType
}


open fun setPaymentMethod(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.paymentMethod= value
}


open fun setSpecial(special: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var special = special
this.special= special
}


open fun setId(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.id= value
}


open fun setStoreName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.storeName= value
}


open fun setUserComments(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.userComment= value
}


open fun setUserCancelComments(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.userCancelComment= value
}


open fun setStoreComments(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.storeComment= value
}


open fun setStoreCancelComments(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.storeCancelComment= value
}


open fun getBasket()
        //nullable = true from not(false or (false and true)) = true
: BasketInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.basket
}


open fun getShippingMethod()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.shippingType
}


open fun getPaymentMethod()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.paymentMethod
}


open fun getSpecial()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.special
}


open fun getId()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.id
}


open fun getStoreName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.storeName
}


open fun getUserComments()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.userComment
}


open fun getUserCancelComments()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.userCancelComment
}


open fun getStoreComments()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.storeComment
}


open fun getStoreCancelComments()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.storeCancelComment
}


open fun reviewOrder(paymentMethod: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var paymentMethod = paymentMethod



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Create your own Order.reviewOrder"
}


open fun viewOrder(paymentMethod: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var paymentMethod = paymentMethod



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Create your own Order.viewOrder"
}


open fun emailOrder(userName: String, paymentMethod: String, storeFrontInterface: StoreFrontInterface)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var userName = userName


                    var paymentMethod = paymentMethod


                    var storeFrontInterface = storeFrontInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Create your own Order.emailOrder"
}


open fun toHashMapOrder()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(PaymentData.METHOD, this.paymentMethod)
hashMap!!.put(ShippingMethodData.NAME, this.shippingType)
hashMap!!.put(StoreFrontData.getInstance()!!.NAME, this.storeName)
hashMap!!.put(EntryData.getInstance()!!.SPECIAL, this.special)
hashMap!!.put(OrderData.ID, this.id)
hashMap!!.put(OrderData.CUSTOMERCOMMENT, this.userComment)
hashMap!!.put(OrderData.CUSTOMERCANCELCOMMENT, this.userCancelComment)
hashMap!!.put(OrderData.STORECOMMENT, this.storeComment)
hashMap!!.put(OrderData.STORECANCELCOMMENT, this.storeCancelComment)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var hashMap: HashMap<Any, Any> = this.toHashMapOrder()!!


    var keySet: Set = hashMap!!.keys!!


    var keyArray: Array<Any?> = keySet!!.toArray()!!


    var size: Int = keyArray!!.size
                


    var node: Node = document.createElement(OrderData.ORDER)!!





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
                
            

