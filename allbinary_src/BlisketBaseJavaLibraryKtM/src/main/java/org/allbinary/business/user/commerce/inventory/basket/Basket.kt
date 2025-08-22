
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
        package org.allbinary.business.user.commerce.inventory.basket




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.Serializable
import java.util.HashMap
import java.util.Set
import org.allbinary.business.user.commerce.inventory.item.ItemInterface
import org.allbinary.business.user.commerce.money.Money
import org.allbinary.business.user.commerce.money.MoneyException
import org.allbinary.data.tables.user.commerce.inventory.item.InventoryEntity
import org.allbinary.data.tables.user.commerce.inventory.item.InventoryEntityFactory

open public class Basket
            : Object
        
                , BasketInterface
                , Serializable {
        

    private var items: HashMap<Any, Any> = HashMap<Any, Any>()
public constructor        ()
            : super()
        {}


open fun addItem(id: String, num: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var id = id


                    var num = num

    
                        if(items.containsKey(id))
                        
                                    {
                                    
    var oldNumStr: String = .toCharArray()


    var oldNumInt: Integer = Integer(Integer.valueOf(oldNumStr))!!


    var numInt: Integer = Integer(Integer.valueOf(num))!!


    var newNumInt: Integer = Integer(oldNumInt!!.toInt() +numInt!!.toInt())

items.put(id, newNumInt!!.toString())

                                    }
                                
                        else {
                            items.put(id, num)

                        }
                            
}


open fun removeItem(id: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var id = id
items.remove(id)
}


open fun adjustItem(id: String, num: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var id = id


                    var num = num

    
                        if(Integer.valueOf(num)!!.toInt() > 0)
                        
                                    {
                                    items.put(id, num)

                                    }
                                
                        else {
                            items.remove(id)

                        }
                            
}


open fun getTotalWeight()
        //nullable = true from not(false or (false and true)) = true
: String{
    var itemsAndNumberInBasket: HashMap<Any, Any> = getItems()!!


    var totalWeight: Money = Money()


    
                        if(itemsAndNumberInBasket!!.size() > 0)
                        
                                    {
                                    
    var items: Set = itemsAndNumberInBasket!!.keySet()!!


    var product: String


    var weightFloat: Float


    var itemArray: Array<Any?> = items.toArray()!!


    var size: Int = itemArray!!.size
                





                        for (index in 0 until size)


        {product= .toCharArray()
weightFloat= Float(InventoryEntity().
                            getWeight(product))
weightFloat= Float(getNumberOf(product)!!.toFloat() *weightFloat!!.toFloat())
totalWeight!!.add(weightFloat!!.toString())
}


                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return totalWeight!!.toString()
}


open fun getNumberOfItems()
        //nullable = true from not(false or (false and true)) = true
: Integer{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Integer(items.size())
}


open fun getIds()
        //nullable = true from not(false or (false and true)) = true
: Set{
    var set: Set = items.keySet()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return set
}


open fun getItems()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return items
}


open fun getNumberOf(product: String)
        //nullable = true from not(false or (false and false)) = true
: Integer{

                    var product = product

    var numStr: String = items.get(product) as String




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Integer(Integer.valueOf(numStr))
}


                @Throws(MoneyException::class)
            
open fun getSubTotal()
        //nullable = true from not(false or (false and true)) = true
: Money{
    var itemsAndNumberInBasket: HashMap<Any, Any> = getItems()!!


    var subTotal: Money = Money()


    
                        if(itemsAndNumberInBasket!!.size() > 0)
                        
                                    {
                                    
    var items: Set = itemsAndNumberInBasket!!.keySet()!!


    var inventoryEntityFactory: InventoryEntityFactory = InventoryEntityFactory.getInstance()!!


    var inventoryEntity: InventoryEntity = inventoryEntityFactory!!.getInventoryEntityInstance() as InventoryEntity


    var itemArray: Array<Any?> = items.toArray()!!


    var size: Int = itemArray!!.size
                





                        for (index in 0 until size)


        {
    var product: String = .toCharArray()


    var itemInterface: ItemInterface = inventoryEntity!!.getItem(product)!!


    var productTotal: Money = itemInterface!!.getPrice()!!

productTotal!!.multiply(getNumberOf(product)!!.toInt())
subTotal!!.add(productTotal!!.toString())
}


                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return subTotal
}


}
                
            

