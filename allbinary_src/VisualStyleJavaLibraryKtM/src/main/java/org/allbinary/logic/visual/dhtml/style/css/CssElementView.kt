
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
        package org.allbinary.logic.visual.dhtml.style.css




        import java.lang.Object        
        
        
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
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.visual.dhtml.style.css.property.CssPropertiesValidationFactory
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class CssElementView
            : Object
        
                , DomNodeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val TITLE: String = "title"

    private val DESCRIPTION: String = "description"

    private var value: String

    private var title: String

    private var description: String

    var cssElementVector: Vector

    var cssPropertyVector: Vector
public constructor        ()
            : super()
        {
this.cssPropertyVector= Vector()

    var stringUtil: StringUtil = StringUtil.getInstance()!!

this.title= stringUtil!!.EMPTY_STRING
this.description= stringUtil!!.EMPTY_STRING
this.value= stringUtil!!.EMPTY_STRING
}

public constructor        (node: Node)
            : super()
        {
var node = node

        try {
            
    var valueNode: Node = DomSearchHelper.getNode(DomData.VALUE, node.getChildNodes())!!

this.value= DomNodeHelper.getTextNodeValue(valueNode)

    var titleValueNode: Node = DomSearchHelper.getNodeNoThrow(TITLE, node.getChildNodes())!!


    
                        if(titleValueNode != 
                                    null
                                )
                        
                                    {
                                    this.title= DomNodeHelper.getTextNodeValue(titleValueNode)

                                    }
                                
                        else {
                            
    var stringUtil: StringUtil = StringUtil.getInstance()!!

this.title= stringUtil!!.EMPTY_STRING

                        }
                            

    var descriptionValueNode: Node = DomSearchHelper.getNodeNoThrow(DESCRIPTION, node.getChildNodes())!!


    
                        if(descriptionValueNode != 
                                    null
                                )
                        
                                    {
                                    this.description= DomNodeHelper.getTextNodeValue(descriptionValueNode)

                                    }
                                
                        else {
                            this.description= StringUtil.getInstance()!!.EMPTY_STRING

                        }
                            

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put(StringMaker().
                            append("Value: ")!!.append(this.value)!!.append("\nTitle: ")!!.append(this.title)!!.append("\nDescription: ")!!.append(this.description)!!.toString(), this, commonStrings!!.CONSTRUCTOR)

                                    }
                                

    var cssElementStyleNodeVector: Vector = DomSearchHelper.getAllNodes(CssElementData.getInstance()!!.NAME, node.getChildNodes())!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Child Css Elements: " +cssElementStyleNodeVector!!.size, this, "CssElementView()")

                                    }
                                
this.cssElementVector= CssElementsValidationFactory.getInstance(cssElementStyleNodeVector)

    var nodeList: NodeList = node.getChildNodes()!!

this.cssPropertyVector= CssPropertiesValidationFactory.getInstance(nodeList)
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put(StringMaker().
                            append("Value: ")!!.append(this.value)!!.append("\nTitle: ")!!.append(this.title)!!.append("\nDescription: ")!!.append(this.description)!!.toString(), this, this.commonStrings!!.CONSTRUCTOR, e)

                                    }
                                



                            throw Exception("CssElementView")
}

}


open fun getValue()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.value
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{

    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(DomData.VALUE, this.value)
hashMap!!.put(this.TITLE, this.title)
hashMap!!.put(this.DESCRIPTION, this.description)



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
                                    logUtil!!.put("CssView HashMap: " +hashMap!!.toString(), this, "toXmlNode")

                                    }
                                

    var node: Node = ModDomHelper.createNodeWithValueNodes(document, CssElementData.getInstance()!!.NAME, hashMap)!!


    var size: Int = cssPropertyVector!!.size!!





                        for (index in 0 until size)

        {

    var cssPropertyDomNodeInterface: DomNodeInterface = cssPropertyVector!!.get(index) as DomNodeInterface

node.appendChild(cssPropertyDomNodeInterface!!.toXmlNode(document))
}


    var size2: Int = cssElementVector!!.size!!





                        for (index in 0 until size2)

        {

    var cssElementDomNodeInterface: DomNodeInterface = cssElementVector!!.get(index) as DomNodeInterface

node.appendChild(cssElementDomNodeInterface!!.toXmlNode(document))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            

