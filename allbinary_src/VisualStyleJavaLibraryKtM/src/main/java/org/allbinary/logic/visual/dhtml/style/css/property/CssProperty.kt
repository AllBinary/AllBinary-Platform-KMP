
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.data.tree.dom.DomData
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.logic.communication.log.LogUtil
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class CssProperty
            : Object
        
                , DomNodeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var propertyName: String

    private var cssPropertyValues: CssPropertyValues
public constructor        (name: String)
            : super()
        {

                    var name = name
this.propertyName= name
this.cssPropertyValues= CssPropertyValues()
}

public constructor        (node: Node)
            : super()
        {

                    var node = node

    var propertyNode: Node = DomSearchHelper.getNode(DomData.VALUE, node.getChildNodes())!!
            

this.propertyName= DomNodeHelper.getTextNodeValue(propertyNode)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.STYLE))
                        
                                    {
                                    logUtil!!.put("Name: " +this.getName(), this, 
                            "CssProperty()")

                                    }
                                

    var propertyValuesNode: Node = DomSearchHelper.getNode(CssPropertyData.getInstance()!!.VALUES, node.getChildNodes())!!
            

this.cssPropertyValues= CssPropertyValues(propertyValuesNode)
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.propertyName
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(CssPropertyData.getInstance()!!.NAME, this.propertyName)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var hashMap: HashMap<Any, Any> = this.toHashMap()!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("CssView HashMap: " +hashMap!!.toString(), this, 
                            "toXmlNode()")

                                    }
                                

    var node: Node = ModDomHelper.createNameValueNodes(document, CssPropertyData.getInstance()!!.NAME, this.propertyName)!!
            

node.appendChild(this.cssPropertyValues!!.toXmlNode(document))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            

