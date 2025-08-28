
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
        package org.allbinary.business.user.commerce.inventory.item




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.business.entry.EntryData
import org.allbinary.business.user.address.ShippingAddressData
import org.allbinary.business.user.address.StreetAddress
import org.allbinary.business.user.address.StreetAddressData
import org.allbinary.business.user.commerce.inventory.order.OrderHistoryData
import org.allbinary.business.user.commerce.money.MoneyException
import org.allbinary.business.user.commerce.shipping.ShippingMethodData
import org.allbinary.logic.string.StringUtil

open public class Item : BasicItem
                , OrderItemInterface {
        

    private var group: String

    private var tax: String

    private var shippingType: String

    private var shippingCost: String

    private var shippedDate: String

    private var shippingAddress: StreetAddress

    private var special: String
public constructor        (itemHashMap: HashMap<Any, Any>)                        

                            : super(itemHashMap){
var itemHashMap = itemHashMap


                            //For kotlin this is before the body of the constructor.
                    
this.setData(itemHashMap)
}

public constructor        (){

    var EMPTY: String = StringUtil.getInstance()!!.EMPTY_STRING

group= EMPTY
tax= EMPTY
shippingType= EMPTY
shippingCost= EMPTY
shippingAddress= StreetAddress()
}


open fun setData(itemHashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{
var itemHashMap = itemHashMap
this.group= itemHashMap!!.get(ShippingMethodData.GROUP) as String
this.tax= itemHashMap!!.get(OrderHistoryData.TAX) as String
this.shippingType= itemHashMap!!.get(ShippingMethodData.NAME) as String
this.shippingCost= itemHashMap!!.get(ShippingMethodData.COST) as String
this.shippedDate= itemHashMap!!.get(OrderHistoryData.SHIPPEDDATE) as String
itemHashMap!!.put(StreetAddressData.NAME, itemHashMap!!.get(ShippingAddressData.NAME))
itemHashMap!!.put(StreetAddressData.STREET, itemHashMap!!.get(ShippingAddressData.STREET))
itemHashMap!!.put(StreetAddressData.CITY, itemHashMap!!.get(ShippingAddressData.CITY))
itemHashMap!!.put(StreetAddressData.STATE, itemHashMap!!.get(ShippingAddressData.STATE))
itemHashMap!!.put(StreetAddressData.CODE, itemHashMap!!.get(ShippingAddressData.CODE))
itemHashMap!!.put(StreetAddressData.COUNTRY, itemHashMap!!.get(ShippingAddressData.COUNTRY))
this.shippingAddress= StreetAddress(itemHashMap)
}


open fun setGroup(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.group= value
}


open fun setTax(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.tax= value
}


open fun setShippingType(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.shippingType= value
}


open fun setShippingCost(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.shippingCost= value
}


open fun setShippingAddress(value: StreetAddress)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.shippingAddress= value
}


open fun setSpecial(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.special= value
}


open fun getGroup()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.group
}


open fun getTax()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.tax
}


open fun getShippingType()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.shippingType
}


open fun getShippingCost()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.shippingCost
}


open fun getShippingAddress()
        //nullable = true from not(false or (false and true)) = true
: StreetAddress{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.shippingAddress
}


open fun getSpecial()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.special
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{

    var hashMap: HashMap<Any, Any> = super.toHashMap()!!

hashMap!!.put(ShippingMethodData.GROUP, this.group)
hashMap!!.put(OrderHistoryData.TAX, this.tax)
hashMap!!.put(ShippingMethodData.NAME, this.shippingType)
hashMap!!.put(ShippingMethodData.COST, this.shippingCost)
hashMap!!.put(OrderHistoryData.SHIPPEDDATE, this.shippedDate)
hashMap!!.put(EntryData.getInstance()!!.SPECIAL, this.special)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


}
                
            

