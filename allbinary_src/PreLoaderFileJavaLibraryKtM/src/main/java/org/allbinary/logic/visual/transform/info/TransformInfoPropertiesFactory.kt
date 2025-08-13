
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.logic.communication.log.LogUtil
import org.w3c.dom.Attr
import org.w3c.dom.NamedNodeMap
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class TransformInfoPropertiesFactory
            : Object
         {
        

        companion object {
            
    private val instance: TransformInfoPropertiesFactory = TransformInfoPropertiesFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TransformInfoPropertiesFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            
private constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun getInstance(node: Node)
        //nullable =  from not(true or (false and false)) = 
: TransformInfoProperties{

                    var node = node

    var transformInfoChildNodeList: NodeList = node.getChildNodes()!!
            


    var transformInfoData: TransformInfoData = TransformInfoData.getInstance()!!
            


    var attributes: NamedNodeMap = node.getAttributes()!!
            


    var attrNode: Attr = attributes.getNamedItem(transformInfoData!!.NAME) as Attr


    var name: String = attrNode!!.getValue()!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Next View Name: " +name, this, 
                            "toTransformInfoPropertiesHashMap()")

                                    }
                                

    var labelNode: Node = DomSearchHelper.getNodeNoThrow(transformInfoData!!.LABEL, transformInfoChildNodeList)!!
            


    var label: String = DomNodeHelper.getTextNodesValue(labelNode)!!
            


    
                        if(label == 
                                    null
                                )
                        
                                    {
                                    label= name

                                    }
                                

    var descriptionNode: Node = DomSearchHelper.getNode(transformInfoData!!.DESCRIPTION, transformInfoChildNodeList)!!
            


    var description: String = DomNodeHelper.getTextNodesValue(descriptionNode)!!
            


    var objectFileNode: Node = DomSearchHelper.getNode(transformInfoData!!.OBJECTFILENAME, transformInfoChildNodeList)!!
            


    var objectFileName: String = DomNodeHelper.getTextNodeValue(objectFileNode)!!
            


    var objectConfigFileNode: Node = DomSearchHelper.getNode(transformInfoData!!.OBJECTCONFIGFILENAME, transformInfoChildNodeList)!!
            


    var objectConfigFileName: String = DomNodeHelper.getTextNodeValue(objectConfigFileNode)!!
            


    var templateFileNode: Node = DomSearchHelper.getNode(transformInfoData!!.TEMPLATEFILENAME, transformInfoChildNodeList)!!
            


    var templateFileName: String = DomNodeHelper.getTextNodeValue(templateFileNode)!!
            


    var transformInfoProperties: TransformInfoProperties = TransformInfoProperties(name, label, description, objectFileName, objectConfigFileName, templateFileName)




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return transformInfoProperties
}


}
                
            

