
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
import java.util.Set
import java.util.Vector
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class BasicItemView
            : Object
        
                , DomNodeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val itemInterface: ItemInterface

    private val vector: Vector
public constructor        (itemInterface: ItemInterface, vector: Vector)
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

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.PRODUCTSEARCHLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, "toXmlNode")

                                    }
                                

    var hashMap: HashMap<Any, Any> = itemInterface!!.toHashMap()!!


    var EMPTY_STRING: String = StringUtil.getInstance()!!.EMPTY_STRING

hashMap!!.put(BasicItemData.IMAGE, EMPTY_STRING)

    var stringUtil: StringUtil = StringUtil.getInstance()!!


    var keySet: Set = hashMap!!.keys!!


    var node: Node = document.createElement(BasicItemData.ITEM)!!


    var nameArray: Array<Any?> = keySet!!.toArray()!!


    var size2: Int = nameArray!!.size
                





                        for (index in 0 until size2)

        {

    var name: String = nameArray[index]!! as String


    var value: String = hashMap!!.get(name as Object) as String

value= stringUtil!!.getInstance(value)
node.appendChild(ModDomHelper.createNameValueNodes(document, name, value))
}


    var totalNode: Node = ModDomHelper.createNameValueNodes(document, BasicItemData.TOTAL, this.itemInterface!!.getTotal()!!.toString())!!

node.appendChild(totalNode)

    var size: Int = this.vector.size!!





                        for (index in 0 until size)

        {

    var domNodeInterface: DomNodeInterface = this.vector.get(index) as DomNodeInterface


    var customNode: Node = domNodeInterface!!.toXmlNode(document)!!

node.appendChild(customNode)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


open fun toXmlDoc()
        //nullable = true from not(false or (false and true)) = true
: Document{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun view()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


}
                
            

