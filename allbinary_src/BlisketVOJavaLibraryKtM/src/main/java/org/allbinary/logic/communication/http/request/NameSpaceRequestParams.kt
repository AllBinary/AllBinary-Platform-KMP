
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
        package org.allbinary.logic.communication.http.request




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Set
import java.util.Vector
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.PageContext
import org.allbinary.data.tree.dom.DomData
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonSeps
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class NameSpaceRequestParams : RequestParams {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor ()                        

                            : super(){


                            //For kotlin this is before the body of the constructor.
                    

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("Constructing empty", this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
}

public constructor (httpServletRequest: HttpServletRequest)                        

                            : super(httpServletRequest){
var httpServletRequest = httpServletRequest


                            //For kotlin this is before the body of the constructor.
                    

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("Constructing from HttpServletRequest", this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
}

public constructor (pageContext: PageContext)                        

                            : super(pageContext){
var pageContext = pageContext


                            //For kotlin this is before the body of the constructor.
                    

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("Constructing from PageContext", this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
}


                @Throws(Exception::class)
            
    open fun createPackageNode(document: Document, packageName: String, packagePropertiesHashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
: Node{
var document = document
var packageName = packageName
var packagePropertiesHashMap = packagePropertiesHashMap

    var node: Node = document.createElement(packageName)!!


    var propertyKeySet: Set = packagePropertiesHashMap!!.keys!!


    var propertyKeySetArray: Array<Any?> = propertyKeySet!!.toArray()!!


    var size: Int = propertyKeySetArray!!.size
                





                        for (index in 0 until size)

        {

    var propertyName: String = propertyKeySetArray[index]!! as String


    var propertyValue: String = packagePropertiesHashMap!!.get(propertyName as Object) as String


    var propertyNode: Node = ModDomHelper.createTextNode(document, propertyName, propertyValue)!!

node.appendChild(propertyNode)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


                @Throws(Exception::class)
            
    open fun createPackageMultiNode(document: Document, nameSpaceRequestParam: NameSpaceRequestParam, packageName: String, packagePropertiesHashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
: Node{
var document = document
var nameSpaceRequestParam = nameSpaceRequestParam
var packageName = packageName
var packagePropertiesHashMap = packagePropertiesHashMap

    var beginIndex: Int = packageName!!.indexOf('[')!!


    var indexValue: String = packageName!!.substring(beginIndex +1, packageName!!.length -1)!!


    var multiElementPackage: String = packageName!!.substring(0, beginIndex)!!


    var selectedValue: String = nameSpaceRequestParam!!.getValue()!!


    var propertyValue: String = packagePropertiesHashMap!!.get(DomData.VALUE) as String


    
                        if(propertyValue!!.compareTo(NameSpaceRequestParamData.VALUE) != 0)
                        
                                    {
                                    selectedValue= propertyValue

                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("\nAppending Multinode Element: " +multiElementPackage +"[" +indexValue +"] " +selectedValue, this, "createPackageMultiNode")

                                    }
                                

    var nextNode: Node = ModDomHelper.createNameValueNodes(document, multiElementPackage, selectedValue)!!


    var indexNode: Node = ModDomHelper.createTextNode(document, DomData.INDEX, indexValue)!!

nextNode!!.appendChild(indexNode)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return nextNode
}


                @Throws(Exception::class)
            
    open fun getRootNode(rootElementPackage: String, packagePropertiesHashMap: HashMap<Any, Any>, document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{
var rootElementPackage = rootElementPackage
var packagePropertiesHashMap = packagePropertiesHashMap
var document = document

    var rootNode: Node = DomSearchHelper.getNodeNoThrow(rootElementPackage, document.getChildNodes())!!


    
                        if(rootNode == 
                                    null
                                )
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("\nAppending Document Root: " +"\nElementName: " +rootElementPackage +"\nProperties: " +packagePropertiesHashMap!!.toString(), this, "getRootNode")

                                    }
                                

    var node: Node = this.createPackageNode(document, rootElementPackage, packagePropertiesHashMap)!!

document.appendChild(node)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("\nAppended Document Created: " +DomDocumentHelper.toString(document), this, "getRootNode")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("\nUsing Existing Root Node", this, "getRootNode")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rootNode

                        }
                            
}


                @Throws(Exception::class)
            
    open fun addNewProperties(document: Document, node: Node, nextPackagePropertiesHashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
: Node{
var document = document
var node = node
var nextPackagePropertiesHashMap = nextPackagePropertiesHashMap

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put(StringMaker().
                            append("\nAdding Any New Properties: ")!!.append(nextPackagePropertiesHashMap!!.toString())!!.append("\nto node: ")!!.append(node.getNodeName())!!.toString(), this, "addNewProperties")

                                    }
                                

    var propertyNameSet: Set = nextPackagePropertiesHashMap!!.keys!!


    var propertyNameSetArray: Array<Any?> = propertyNameSet!!.toArray()!!


    var size: Int = propertyNameSetArray!!.size
                





                        for (index in 0 until size)

        {

    var nextPropertyName: String = propertyNameSetArray[index]!! as String


    var propertyValue: String = StringUtil.getInstance()!!.getInstance(nextPackagePropertiesHashMap!!.get(nextPropertyName as Object) as String)!!


    var valueNode: Node = DomSearchHelper.getNodeNoThrow(nextPropertyName, node.getChildNodes())!!


    
                        if(valueNode != 
                                    null
                                )
                        
                                    {
                                    
    var existingElementNodeTextNodeValue: String = DomNodeHelper.getTextNodeValue(valueNode)!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("\nIf property: \"" +nextPropertyName +" is the same as:\n" +"Node: " +node.getNodeName() +" then: " +propertyValue +"==" +existingElementNodeTextNodeValue, this, "addNewProperties")

                                    }
                                

    
                        if(propertyValue!!.compareTo(existingElementNodeTextNodeValue) != 0)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("At least one Property from NameSpaceRequest Package was different from Node", this, "addNewProperties")

                                    }
                                



                            throw Exception("Property Modifications Should Not Occur")

                                    }
                                

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("Adding a new Property: " +nextPropertyName +"=" +propertyValue, this, "addNewProperties")

                                    }
                                

    var newPropertyNode: Node = ModDomHelper.createTextNode(document, nextPropertyName, propertyValue)!!

node.appendChild(newPropertyNode)

                        }
                            
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


                @Throws(Exception::class)
            
    open fun isElementValueTextNodeEqual(nextPackagePropertiesHashMap: HashMap<Any, Any>, node: Node)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var nextPackagePropertiesHashMap = nextPackagePropertiesHashMap
var node = node

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("\nComparing the value property in: " +nextPackagePropertiesHashMap!!.toString() +"\nto node child leaves of node: " +node.getNodeName(), this, "isElementValueTextNodeEqual")

                                    }
                                

    var propertyValue: String = nextPackagePropertiesHashMap!!.get(DomData.VALUE) as String


    var valueNode: Node = DomSearchHelper.getNodeNoThrow(DomData.VALUE, node.getChildNodes())!!


    
                        if(valueNode != 
                                    null
                                )
                        
                                    {
                                    
    var existingElementNodeTextNodeValue: String = DomNodeHelper.getTextNodeValue(valueNode)!!


    
                        if(propertyValue!!.compareTo(existingElementNodeTextNodeValue) == 0)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("Value Node is the same", this, "isElementValueTextNodeEqual")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
    open fun isElementValueTextNodeUnique(nextPackagePropertiesHashMap: HashMap<Any, Any>, elementNodeVector: Vector)
        //nullable = true from not(false or (false and false)) = true
: Int{
var nextPackagePropertiesHashMap = nextPackagePropertiesHashMap
var elementNodeVector = elementNodeVector

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("\nComparing Properties of: " +elementNodeVector!!.size +" Nodes", this, "isElementValueTextNodeUnique")

                                    }
                                

    var size: Int = elementNodeVector!!.size!!





                        for (index in 0 until size)

        {

    var existingElementNode: Node = elementNodeVector!!.get(index) as Node


    
                        if(this.isElementValueTextNodeEqual(nextPackagePropertiesHashMap, existingElementNode))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return index

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}


                @Throws(Exception::class)
            
    open fun addChildren(document: Document, rootNode: Node, nameSpaceRequestParam: NameSpaceRequestParam)
        //nullable = true from not(false or (false and false)) = true
: Document{
var document = document
var rootNode = rootNode
var nameSpaceRequestParam = nameSpaceRequestParam

    var node: Node = rootNode


    var packageVector: Vector = nameSpaceRequestParam!!.getPackages()!!


    var size: Int = packageVector!!.size!!





                        for (index in 1 until size)

        {

    var nextPackageName: String = packageVector!!.get(index) as String


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put(StringMaker().
                            append("\nTrying to Add Child to Node: ")!!.append(node.getNodeName())!!.append("\nwith new PackageName: ")!!.append(nextPackageName)!!.toString(), this, "addChildren")

                                    }
                                

    var nextPackagePropertiesHashMap: HashMap<Any, Any> = nameSpaceRequestParam!!.getPackageProperties(index)!!


    var elementNodeVector: Vector = DomSearchHelper.getAllNodesNoThrow(nextPackageName, node.getChildNodes())!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("\nDocument Contains " +elementNodeVector!!.size +" Node(s) With Same Name", this, "addChildren")

                                    }
                                

    var isElementValueTextNodeUniqueIndex: Int = this.isElementValueTextNodeUnique(nextPackagePropertiesHashMap, elementNodeVector)!!


    
                        if((elementNodeVector!!.size == 0 || isElementValueTextNodeUniqueIndex ==  -1) && !nextPackageName!!.endsWith(CommonSeps.getInstance()!!.BRACKET_CLOSE))
                        
                                    {
                                    
    var nextNode: Node = this.createPackageNode(document, nextPackageName, nextPackagePropertiesHashMap)!!

node.appendChild(nextNode)
node= nextNode

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("\nAppended Package: " +node.getNodeName(), this, "addChildren")
logUtil!!.put("\nAppended Document Created: " +DomDocumentHelper.toString(document), this, "addChildren")

                                    }
                                

                                    }
                                
                             else 
    
                        if(nextPackageName!!.endsWith(CommonSeps.getInstance()!!.BRACKET_CLOSE))
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("Package is MultiNode: just append", this, "addChildren")

                                    }
                                

    var nextNode: Node = this.createPackageMultiNode(document, nameSpaceRequestParam, nextPackageName, nextPackagePropertiesHashMap)!!

node.appendChild(nextNode)
node= nextNode

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("\nAppended Multinode Element: " +DomDocumentHelper.toString(document), this, "addChildren")

                                    }
                                

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("Value Node already exists: Now compare (properties to leaf nodes)", this, "addChildren")

                                    }
                                

    var nodeNameDuplicateNode: Node = elementNodeVector!!.get(isElementValueTextNodeUniqueIndex) as Node

node= this.addNewProperties(document, nodeNameDuplicateNode, nextPackagePropertiesHashMap)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("\nDuplicate Node Found: Moving to next child ^", this, "addChildre")

                                    }
                                

                        }
                            
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return document
}


                @Throws(Exception::class)
            
    open fun addNameSpace(key: String, value: String, document: Document)
        //nullable = true from not(false or (false and false)) = true
: Document{
var key = key
var value = value
var document = document

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put(StringMaker().
                            append("NameSpace key: ")!!.append(key)!!.append(" Value: ")!!.append(value)!!.toString(), this, "addNameSpace")

                                    }
                                

    var nameSpaceRequestParam: NameSpaceRequestParam = NameSpaceRequestParam(key, value)


    var packageVector: Vector = nameSpaceRequestParam!!.getPackages()!!


    var size: Int = packageVector!!.size!!





                        for (index in 0 until size)

        {

    var packageName: String = packageVector!!.get(index) as String


    var packagePropertiesHashMap: HashMap<Any, Any> = nameSpaceRequestParam!!.getPackageProperties(packageVector!!.indexOf(packageName))!!


    var rootNode: Node = this.getRootNode(packageName, packagePropertiesHashMap, document)!!


    
                        if(index < size -1)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.addChildren(document, rootNode as Node, nameSpaceRequestParam)

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return document
}


                @Throws(Exception::class)
            
    open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{

    var document: Document = DomDocumentHelper.create()!!


    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()


    var keys: Set = this.getMap()!!.keySet()!!


    var keyArray: Array<Any?> = keys.toArray()!!


    var keySize: Int = keyArray!!.size
                


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("NameSpace Request Size: " +keys.size(), this, "toHashMap")

                                    }
                                




                        for (i in 0 until keySize)

        {

    var key: String = keyArray[i]!! as String


    var anyType: Any = this.getMap()!!.get(key)!!


    var className: String = anyType!!::class.toString()!! as String


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("Request Param Class: " +className, this, "toHashMap")

                                    }
                                

    
                        if(this.getMap()!!.get(key) is String)
                        
                                    {
                                    
    var value: String = this.getMap()!!.get(key) as String


    
                        if(key.indexOf(NameSpaceRequestParamData.NAME) < 0)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("Not NameSpace key: " +key +" Value: " +value, this, "toHashMap()")

                                    }
                                
hashMap!!.put(key.toCharArray().concatToString(), value.toCharArray().concatToString())

                                    }
                                
                        else {
                            document= this.addNameSpace(key.toCharArray().concatToString(), value.toCharArray().concatToString(), document)

                        }
                            

                                    }
                                
                             else 
    
                        if(this.getMap()!!.get(key) is )
                        
                                    {
                                    
    var values: Array<String?> = this.getMap()!!.get(key) as Array<String?>


    
                        if(key.indexOf(NameSpaceRequestParamData.NAME) < 0)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("Not NameSpace key: " +key +" Value: " +values[0], this, "toHashMap()")

                                    }
                                
hashMap!!.put(key.toCharArray().concatToString(), .toCharArray())

                                    }
                                
                        else {
                            document= this.addNameSpace(key.toCharArray().concatToString(), .toCharArray(), document)

                        }
                            

                                    }
                                
}


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("NameSpaceRequestParams: " +this.getMap()!!.toString() +"\ntoHashMap(): " +hashMap!!.toString() +"\nDocument Created: " +DomDocumentHelper.toString(document), this, "toHashMap()")

                                    }
                                
hashMap!!.put(NameSpaceRequestParamData.DOCUMENT, document)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


}
                
            

