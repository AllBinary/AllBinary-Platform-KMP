
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
        package org.allbinary.logic.visual.dhtml.style.css.property




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.data.tree.dom.DomData
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonSeps
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class CssPropertyValues
            : Object
        
                , DomNodeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var propertyValueVector: Vector
public constructor        ()
            : super()
        {
this.propertyValueVector= Vector()
}

public constructor        (node: Node)
            : super()
        {
var node = node

    var indexPropertyValueHashMap: HashMap<Any, Any> = HashMap<Any, Any>()

this.propertyValueVector= Vector()

    var cssPropertyNodeVector: Vector = DomSearchHelper.getAllNodes(CssPropertyValueData.getInstance()!!.NAME, node.getChildNodes())!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.STYLE))
                        
                                    {
                                    logUtil!!.put("Number Of Properties: " +cssPropertyNodeVector!!.size, this, "CssProperties()")

                                    }
                                

    var size: Int = cssPropertyNodeVector!!.size!!





                        for (index in 0 until size)

        {

    var cssPropertyValueNode: Node = cssPropertyNodeVector!!.get(index) as Node


    var valueNode: Node = DomSearchHelper.getNode(DomData.VALUE, cssPropertyValueNode!!.getChildNodes())!!


    var propertyValue: String = DomNodeHelper.getTextNodeValue(valueNode)!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.STYLE))
                        
                                    {
                                    logUtil!!.put("Property Value: " +propertyValue, this, "CssProperties()")

                                    }
                                

    var indexNode: Node = DomSearchHelper.getNode(DomData.INDEX, cssPropertyValueNode!!.getChildNodes())!!


    var indexValue: String = DomNodeHelper.getTextNodeValue(indexNode)!!

indexPropertyValueHashMap!!.put(indexValue, propertyValue)
}


    var size2: Int = indexPropertyValueHashMap!!.keys.size()!!





                        for (index in 0 until size2)

        {

    var indexInt: Integer = Integer(index)


    var propertyValue: String = indexPropertyValueHashMap!!.get(indexInt!!.toString()) as String

this.propertyValueVector!!.add(propertyValue)
}

}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{

    var commonSeps: CommonSeps = CommonSeps.getInstance()!!


    var cssPropertyValueData: CssPropertyValueData = CssPropertyValueData.getInstance()!!


    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()


    var stringBuffer: StringMaker = StringMaker()


    var size: Int = propertyValueVector!!.size!!





                        for (index in 0 until size)

        {

    var value: String = propertyValueVector!!.get(index) as String

stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(cssPropertyValueData!!.NAME)
stringBuffer!!.append(commonSeps!!.BRACKET_OPEN)
stringBuffer!!.append(index)
stringBuffer!!.append(commonSeps!!.BRACKET_CLOSE)
hashMap!!.put(stringBuffer!!.toString(), value)
index++
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{
var document = document

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var hashMap: HashMap<Any, Any> = this.toHashMap()!!

logUtil!!.put("CssPropertyValues HashMap: " +hashMap!!.toString(), this, "toXmlNode()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ModDomHelper.createNameValueIndexNodes(document, CssPropertyData.getInstance()!!.VALUES, CssPropertyValueData.getInstance()!!.NAME, this.propertyValueVector)
}


}
                
            

