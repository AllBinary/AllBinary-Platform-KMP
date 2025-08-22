
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
        package org.allbinary.logic.visual.transform.info.objectConfig




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.InputOutputTypeData
import org.allbinary.logic.io.OutputTypeData
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.visual.transform.info.TransformInfoData
import org.allbinary.logic.visual.transform.info.TransformInfoDomNode
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.logic.visual.transform.info.TransformInfosData
import org.allbinary.logic.visual.transform.template.XslData
import org.allbinary.string.CommonStrings
import org.w3c.dom.Attr
import org.w3c.dom.Document
import org.w3c.dom.NamedNodeMap
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class TransformInfoObjectConfig
            : Object
        
                , TransformInfoObjectConfigInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val ownerTransformInfoInterface: TransformInfoInterface

    private var document: Document

    private var outputTypeName: String
public constructor        (transformInfoInterface: Object)
            : super()
        {

                    var transformInfoInterface = transformInfoInterface
this.ownerTransformInfoInterface= transformInfoInterface
this.createDocument()

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("TransformInfo: ")

    
                        if(this.ownerTransformInfoInterface != 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append(this.ownerTransformInfoInterface!!.getName())

                                    }
                                
                        else {
                            stringBuffer!!.append("No Owner!?#@")

                        }
                            
stringBuffer!!.append("\nConstructed with document: ")
stringBuffer!!.append(this.toString())
logUtil!!.put(stringBuffer!!.toString(), this, "Constructor(TransformInfoInterface)")

                                    }
                                
}

public constructor        (transformInfoInterface: Object, document: Object)
            : super()
        {

                    var transformInfoInterface = transformInfoInterface


                    var document = document
this.ownerTransformInfoInterface= transformInfoInterface
this.document= document

    var node: Node = DomSearchHelper.getNodeNoThrow(OutputTypeData.getInstance()!!.NAME, this.getRootNode()!!.getChildNodes())!!


    
                        if(node != 
                                    null
                                )
                        
                                    {
                                    this.setOutputTypeName(DomNodeHelper.getTextNodeValue(node))

                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("TransformInfo: ")

    
                        if(this.ownerTransformInfoInterface != 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append(this.ownerTransformInfoInterface!!.getName())

                                    }
                                
                        else {
                            stringBuffer!!.append("No Owner!?#@")

                        }
                            
stringBuffer!!.append("\nConstructed with document: ")
stringBuffer!!.append(this.toString())
logUtil!!.put(stringBuffer!!.toString(), this, "Constructor(TransformInfoInterface, Document)")

                                    }
                                
}

public constructor        (transformInfoInterface: Object, name: Object, type: Object)
            : super()
        {

                    var transformInfoInterface = transformInfoInterface


                    var name = name


                    var type = type
this.ownerTransformInfoInterface= transformInfoInterface
this.createDocument()

    var configNameAttr: Attr = this.document.createAttribute(TransformInfoObjectConfigData.getInstance()!!.NAME)!!

configNameAttr!!.setValue(name)

    var objectConfigNode: Node = this.document.getElementsByTagName(TransformInfoObjectConfigData.getInstance()!!.NAME)!!.item(0)!!

objectConfigNode!!.appendChild(configNameAttr)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("TransformInfo: ")

    
                        if(this.ownerTransformInfoInterface != 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append(this.ownerTransformInfoInterface!!.getName())

                                    }
                                
                        else {
                            stringBuffer!!.append("No Owner!?#@")

                        }
                            
stringBuffer!!.append("\nConstructed with document: ")
stringBuffer!!.append(this.toString())
logUtil!!.put(stringBuffer!!.toString(), this, "Constructor(TransformInfoInterface, name, type)")

                                    }
                                
}


open fun createDocument()
        //nullable = true from not(false or (false and true)) = true
{this.document= DomDocumentHelper.create()

    var objectConfigNode: Node = document.createElement(TransformInfoObjectConfigData.getInstance()!!.NAME)!!

this.document.appendChild(objectConfigNode)
}


open fun getTransformInfoInterface()
        //nullable = true from not(false or (false and true)) = true
: TransformInfoInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.ownerTransformInfoInterface
}


                @Throws(Exception::class)
            
open fun toXmlDoc()
        //nullable = true from not(false or (false and true)) = true
: Document{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.document
}


open fun setDocument(document: Document)
        //nullable = true from not(false or (false and false)) = true
{

                    var document = document
this.document= document
}


open fun containsView(transformInfoInterface: TransformInfoInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var transformInfoInterface = transformInfoInterface

    var objectConfigNode: Node = this.document.getElementsByTagName(TransformInfoObjectConfigData.getInstance()!!.NAME)!!.item(0)!!


    var viewNodeList: NodeList = objectConfigNode!!.getChildNodes()!!


    var numberOfViews: Int = viewNodeList!!.getLength()!!





                        for (index in 0 until numberOfViews)


        {
    var viewNode: Node = viewNodeList!!.item(index)!!


    var viewAttributes: NamedNodeMap = viewNode!!.getAttributes()!!


    var attrNode: Attr = viewAttributes!!.getNamedItem(TransformInfoData.getInstance()!!.NAME) as Attr


    
                        if(transformInfoInterface!!.getName()!!.compareTo(attrNode!!.getValue()) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
open fun getTemplateAttributes()
        //nullable = true from not(false or (false and true)) = true
: NamedNodeMap{
    var componentNode: Node = this.document.getElementsByTagName(TransformInfoObjectConfigData.getInstance()!!.NAME)!!.item(0)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return componentNode!!.getAttributes()
}


                @Throws(Exception::class)
            
open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{
    var attrNode: Attr = this.getTemplateAttributes()!!.getNamedItem(TransformInfoObjectConfigData.getInstance()!!.NAME) as Attr




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return attrNode!!.getValue()
}


                @Throws(Exception::class)
            
open fun setName(name: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var name = name

    var attrNode: Attr = this.getTemplateAttributes()!!.getNamedItem(TransformInfoObjectConfigData.getInstance()!!.NAME) as Attr

attrNode!!.setValue(name)
}


                @Throws(Exception::class)
            
open fun getNodeVector(nodeName: String)
        //nullable = true from not(false or (false and false)) = true
: Vector{

                    var nodeName = nodeName

    var componentsNodeList: NodeList = this.document.getElementsByTagName(nodeName)!!


    
                        if(componentsNodeList != 
                                    null
                                 && componentsNodeList!!.getLength() > 0)
                        
                                    {
                                    
    var viewNodeVector: Vector = DomSearchHelper.getAllNodes(TransformInfoData.getInstance()!!.NAME, componentsNodeList!!.item(0)!!.getChildNodes())!!


    var numberOfViews: Int = viewNodeVector!!.size!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Number Of ")
stringBuffer!!.append(nodeName)
stringBuffer!!.append(" Nodes: ")
stringBuffer!!.append(numberOfViews)
logUtil!!.put(stringBuffer!!.toString(), this, "getNodeVector(nodename)")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return viewNodeVector

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Vector()
}


                @Throws(Exception::class)
            
open fun getTransformDomNodes(nodeName: String)
        //nullable = true from not(false or (false and false)) = true
: Vector{

                    var nodeName = nodeName

    var viewVector: Vector = Vector()


    var viewNodeVector: Vector = this.getNodeVector(nodeName)!!


    var size: Int = viewNodeVector!!.size!!





                        for (index in 0 until size)


        {
    var viewNode: Node = viewNodeVector!!.get(index) as Node

viewVector!!.add(TransformInfoDomNode(viewNode))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return viewVector
}


                @Throws(Exception::class)
            
open fun getTransforms(nodeName: String)
        //nullable = true from not(false or (false and false)) = true
: Vector{

                    var nodeName = nodeName

    var viewVector: Vector = Vector()


    var viewNodeVector: Vector = this.getNodeVector(nodeName)!!


    var size: Int = viewNodeVector!!.size!!





                        for (index in 0 until size)


        {
    var viewNode: Node = viewNodeVector!!.get(index) as Node

viewVector!!.add(TransformInfoDomNode(viewNode).
                            getTransformInfoInterface())
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return viewVector
}


                @Throws(Exception::class)
            
open fun getTransformsGroup(group: String)
        //nullable = true from not(false or (false and false)) = true
: Vector{

                    var group = group

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Started: " +group, this, "getTransformsGroup()")

                                    }
                                

    var viewVector: Vector = Vector()


    var GROUP: String = TransformInfosData.getInstance()!!.GROUP


    var componentsNodeList: NodeList = this.document.getElementsByTagName(GROUP)!!


    
                        if(componentsNodeList != 
                                    null
                                 && componentsNodeList!!.getLength() > 0)
                        
                                    {
                                    
    var componentsNode: Node = componentsNodeList!!.item(0)!!


    var length: Int = componentsNodeList!!.getLength()!!





                        for (index in 0 until length)


        {
    var node: Node = componentsNodeList!!.item(index)!!


    var attributes: NamedNodeMap = node.getAttributes()!!


    var attrNode: Attr = attributes.getNamedItem(GROUP) as Attr


    var value: String = attrNode!!.getValue()!!


    
                        if(value.compareTo(group) == 0)
                        
                                    {
                                    componentsNode= node
break;

                    

                                    }
                                
}


    var viewNodeVector: Vector = DomSearchHelper.getAllNodes(TransformInfoData.getInstance()!!.NAME, componentsNode!!.getChildNodes())!!


    var numberOfViews: Int = viewNodeVector!!.size!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Number Of Nodes: " +numberOfViews, this, "getTransformsGroup()")

                                    }
                                

    var size: Int = viewNodeVector!!.size!!





                        for (index in 0 until size)


        {
    var viewNode: Node = viewNodeVector!!.get(index) as Node

viewVector!!.add(TransformInfoDomNode(viewNode))
}


                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    
                        if(componentsNodeList == 
                                    null
                                )
                        
                                    {
                                    logUtil!!.put("Number Of Nodes: NULL", this, "getTransformsGroup()")

                                    }
                                
                        else {
                            logUtil!!.put("Number Of Nodes: 0", this, "getTransformsGroup()")

                        }
                            

                                    }
                                

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return viewVector
}


                @Throws(Exception::class)
            
open fun getTransformDomNodes()
        //nullable = true from not(false or (false and true)) = true
: Vector{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getTransformDomNodes(TransformInfosData.getInstance()!!.GROUP)
}


                @Throws(Exception::class)
            
open fun getTransforms()
        //nullable = true from not(false or (false and true)) = true
: Vector{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getTransforms(TransformInfosData.getInstance()!!.NAME)
}


                @Throws(Exception::class)
            
open fun getGroupTransforms()
        //nullable = true from not(false or (false and true)) = true
: Vector{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getTransforms(TransformInfosData.getInstance()!!.GROUP)
}


                @Throws(Exception::class)
            
open fun getParentTransforms()
        //nullable = true from not(false or (false and true)) = true
: Vector{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getTransforms(TransformInfoData.getInstance()!!.PARENT)
}


open fun getRootNode()
        //nullable = true from not(false or (false and true)) = true
: Node{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.document.getElementsByTagName(TransformInfoObjectConfigData.getInstance()!!.NAME)!!.item(0)
}


open fun setOutputTypeName(outputTypeName: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var outputTypeName = outputTypeName
this.outputTypeName= outputTypeName
}


                @Throws(Exception::class)
            
open fun getOutputTypeName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.outputTypeName
}


                @Throws(Exception::class)
            
open fun getInputOutputTypeName()
        //nullable = true from not(false or (false and true)) = true
: String{
    var node: Node = DomSearchHelper.getNode(InputOutputTypeData.getInstance()!!.NAME, this.getRootNode()!!.getChildNodes())!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DomNodeHelper.getTextNodeValue(node)
}


                @Throws(Exception::class)
            
open fun getInputOutputTypeFile()
        //nullable = true from not(false or (false and true)) = true
: String{
    var node: Node = DomSearchHelper.getNode(InputOutputTypeData.getInstance()!!.FILE, this.getRootNode()!!.getChildNodes())!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DomNodeHelper.getTextNodeValue(node)
}


                @Throws(Exception::class)
            
open fun getImportUriPath()
        //nullable = true from not(false or (false and true)) = true
: String{
    var node: Node = DomSearchHelper.getNode(XslData.getInstance()!!.ROOT_IMPORT_URI, this.getRootNode()!!.getChildNodes())!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DomNodeHelper.getTextNodeValue(node)
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
        try {
            
    
                        if(this.document != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DomDocumentHelper.toString(this.document)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                        }
                            
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put("DOM Document error", this, commonStrings!!.TOSTRING)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


}
                
            

