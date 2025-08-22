
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
        package org.allbinary.logic.visual.transform.info




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.w3c.dom.Attr
import org.w3c.dom.NamedNodeMap
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class TransformInfoDomNode
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var transformInfoInterface: TransformInfoInterface

    private var mappedName: String
public constructor        (node: Node)
            : super()
        {

                    var node = node

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Constructing TransformInfo From TransformInfoDomNode: " +node.getNodeName(), this, "TransformInfoDomNode(Node node)")

                                    }
                                

    var transformInfoData: TransformInfoData = TransformInfoData.getInstance()!!


    var attributes: NamedNodeMap = node.getAttributes()!!


    var attrNode: Attr = attributes.getNamedItem(transformInfoData!!.NAME) as Attr


    var name: String = attrNode!!.getValue()!!


    var nodeList: NodeList = node.getChildNodes()!!


    
                        if(nodeList!!.getLength() > 1)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Constructing Complete TransformInfo Node For: ")
stringBuffer!!.append(name)
stringBuffer!!.append(" with ")
stringBuffer!!.append(nodeList!!.getLength())
stringBuffer!!.append(" children")
logUtil!!.put(stringBuffer!!.toString(), this, "TransformInfoObjectConfigComponent(Node node)")

                                    }
                                

    var objectFileNameNode: Node = DomSearchHelper.getNode(transformInfoData!!.OBJECTFILENAME, nodeList)!!


    var objectFileName: String = DomNodeHelper.getTextNodeValue(objectFileNameNode)!!


    var objectConfigFileNameNode: Node = DomSearchHelper.getNode(transformInfoData!!.OBJECTCONFIGFILENAME, nodeList)!!


    var objectConfigFileName: String = DomNodeHelper.getTextNodeValue(objectConfigFileNameNode)!!


    var templateFileNameNode: Node = DomSearchHelper.getNode(transformInfoData!!.TEMPLATEFILENAME, nodeList)!!


    var templateFileName: String = DomNodeHelper.getTextNodeValue(templateFileNameNode)!!


    var dataFileNameNode: Node = DomSearchHelper.getNode(transformInfoData!!.DATAFILENAME, nodeList)!!


    var dataFileName: String = DomNodeHelper.getTextNodeValue(dataFileNameNode)!!

this.transformInfoInterface= TransformInfo(name, objectFileName, objectConfigFileName, templateFileName, dataFileName) as TransformInfoInterface

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Constructing Partial TransformInfo Node For: ")
stringBuffer!!.append(name)
stringBuffer!!.append(" with ")
stringBuffer!!.append(nodeList!!.getLength())
stringBuffer!!.append(" children")
logUtil!!.put(stringBuffer!!.toString(), this, "TransformInfoObjectConfigComponent(Node node)")

                                    }
                                
this.transformInfoInterface= TransformInfo(name) as TransformInfoInterface

                        }
                            

    var templateAttrNode: Attr = attributes.getNamedItem(transformInfoData!!.MAPPED) as Attr


    
                        if(templateAttrNode != 
                                    null
                                )
                        
                                    {
                                    this.mappedName= templateAttrNode!!.getValue()

                                    }
                                
                        else {
                            this.mappedName= this.getTransformInfoInterface()!!.getName()

                        }
                            
}

public constructor        (transformInfoInterface: TransformInfoInterface)
            : super()
        {

                    var transformInfoInterface = transformInfoInterface
this.transformInfoInterface= transformInfoInterface
this.mappedName= transformInfoInterface!!.getName()
}

public constructor        (transformInfoInterface: TransformInfoInterface, mappedName: String)
            : super()
        {

                    var transformInfoInterface = transformInfoInterface


                    var mappedName = mappedName
this.transformInfoInterface= transformInfoInterface
this.mappedName= mappedName
}

public constructor        (name: String, mappedName: String)
            : super()
        {

                    var name = name


                    var mappedName = mappedName
this.transformInfoInterface= TransformInfo(name)
this.mappedName= mappedName
}


open fun getTransformInfoInterface()
        //nullable = true from not(false or (false and true)) = true
: TransformInfoInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.transformInfoInterface
}


open fun getMappedName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.mappedName
}


open fun getReplaceKey()
        //nullable = true from not(false or (false and true)) = true
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("<transform:component name=\"")
stringBuffer!!.append("body")
stringBuffer!!.append("\"/>")

    var key: String = stringBuffer!!.toString()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Component Key: " +key, this, "getReplaceKey()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return key
}


}
                
            

