
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
        
import java.util.HashSet
import java.util.Set
import java.util.Vector
import org.allbinary.business.user.commerce.inventory.item.Item
import org.allbinary.business.user.commerce.inventory.item.ItemView
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class BasketReview
            : Object
         {
        

    var items: Vector = Vector()
public constructor        ()
            : super()
        {}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
}


open fun addItem(item: Item)
        //nullable = true from not(false or (false and false)) = true
{

                    var item = item
items.add(item)
}


open fun getItems()
        //nullable = true from not(false or (false and true)) = true
: Vector{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return items
}


open fun removeItem(id: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var id = id

    var itemArray: Array<Any?> = items.toArray()!!


    var size: Int = itemArray!!.size
                





                        for (index in 0 until size)

        {
    var item: Item = itemArray[index]!! as Item


    
                        if(item.getId()!!.compareTo(id) == 0)
                        
                                    {
                                    items.remove(item)

                                    }
                                
}

}


open fun adjustItem(id: String, num: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var id = id


                    var num = num

    var itemArray: Array<Any?> = items.toArray()!!


    var size: Int = itemArray!!.size
                





                        for (index in 0 until size)

        {
    var item: Item = itemArray[index]!! as Item


    
                        if(item.getId()!!.compareTo(id) == 0)
                        
                                    {
                                    item.setNumber(num)

                                    }
                                
}

}


open fun getTotalWeight()
        //nullable = true from not(false or (false and true)) = true
: String{
    var weightFloat: Float = 0


    var itemArray: Array<Any?> = items.toArray()!!


    var size: Int = itemArray!!.size
                





                        for (index in 0 until size)

        {
    var item: Item = itemArray[index]!! as Item

weightFloat += Float(item.getWeight()).
                            toFloat()
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Float(weightFloat).
                            toString()
}


open fun getNumberOfItems()
        //nullable = true from not(false or (false and true)) = true
: Integer{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Integer(items.size)
}


open fun getIds()
        //nullable = true from not(false or (false and true)) = true
: Set{
    var idSet: HashSet = HashSet()


    var itemArray: Array<Any?> = items.toArray()!!


    var size: Int = itemArray!!.size
                





                        for (index in 0 until size)

        {
    var item: Item = itemArray[index]!! as Item

idSet!!.add(item.getId())
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return idSet as Set
}


open fun getNumberOf(id: String)
        //nullable = true from not(false or (false and false)) = true
: Integer{

                    var id = id

    var itemArray: Array<Any?> = items.toArray()!!


    var size: Int = itemArray!!.size
                





                        for (index in 0 until size)

        {
    var item: Item = itemArray[index]!! as Item


    
                        if(item.getId()!!.compareTo(id) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Integer(item.getNumber())

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Integer(0)
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var node: Node = document.createElement(BasketData.BASKET)!!


    var itemArray: Array<Any?> = items.toArray()!!


    var size: Int = itemArray!!.size
                





                        for (index in 0 until size)

        {
    var item: Item = itemArray[index]!! as Item

node.appendChild(ItemView(item, Vector()).
                            toXmlNode(document))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            

