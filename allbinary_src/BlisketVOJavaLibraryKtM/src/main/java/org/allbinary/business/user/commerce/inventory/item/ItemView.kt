
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Set
import java.util.Vector
import org.allbinary.business.user.address.StreetAddressData
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.logic.string.StringUtil
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class ItemView
            : Object
         {
        

    private val itemInterface: OrderItemInterface

    private val vector: Vector
public constructor        (itemInterface: OrderItemInterface, vector: Vector)
            : super()
        {

                    var itemInterface = itemInterface


                    var vector = vector
this.itemInterface= itemInterface
this.vector= vector
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var hashMap: HashMap<Any, Any> = this.itemInterface!!.toHashMap()!!
            


    var keySet: Set = hashMap!!.keySet()!!
            


    var node: Node = document!!.createElement(ItemData.ITEM)!!
            


    var basicItemView: BasicItemView = BasicItemView(this.itemInterface, vector)

node!!.appendChild(basicItemView!!.toXmlNode(document))

    var stringUtil: StringUtil = StringUtil.getInstance()!!
            


    var nameArray: Array<Any?> = keySet!!.toArray()!!
            


    var size: Int = nameArray!!.size
                





                        for (index in 0 until size)


        {
    var name: String = nameArray[index]!! as String


    var value: String = hashMap!!.get(name as Object?) as String

value= stringUtil!!.getInstance(value)
node!!.appendChild(ModDomHelper.createNameValueNodes(document, name, value))
}


    var shippingAddressNode: Node = document!!.createElement(StreetAddressData.NAME)!!
            

shippingAddressNode!!.appendChild(this.itemInterface!!.getShippingAddress()!!.toXmlNode(document))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            

