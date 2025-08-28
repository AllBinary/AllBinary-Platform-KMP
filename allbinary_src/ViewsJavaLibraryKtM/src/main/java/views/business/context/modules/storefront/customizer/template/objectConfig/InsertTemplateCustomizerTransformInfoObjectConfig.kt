
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
        package views.business.context.modules.storefront.customizer.template.objectConfig




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.visual.transform.info.TransformInfoDomNodeView
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.logic.visual.transform.info.TransformInfosData
import org.allbinary.logic.visual.transform.info.objectConfig.TransformInfoObjectConfigData
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class InsertTemplateCustomizerTransformInfoObjectConfig : NoTemplateTransformInfoObjectConfig {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor        (transformInfoInterface: Object)                        

                            : super(transformInfoInterface){
var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (transformInfoInterface: Object, document: Object)                        

                            : super(transformInfoInterface, document){
var transformInfoInterface = transformInfoInterface
var document = document


                            //For kotlin this is before the body of the constructor.
                    
this.setDocument(this.generate(this.toXmlDoc()))
}

public constructor        (transformInfoInterface: Object, name: Object, type: Object)                        

                            : super(transformInfoInterface, name, type){
var transformInfoInterface = transformInfoInterface
var name = name
var type = type


                            //For kotlin this is before the body of the constructor.
                    
this.setDocument(this.generate(this.toXmlDoc()))
}


                @Throws(Exception::class)
            
open fun set(aParentViewName: String)
        //nullable = true from not(false or (false and false)) = true
{
var aParentViewName = aParentViewName

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Setting: " +aParentViewName, this, "set()")

                                    }
                                

    var document: Document = this.toXmlDoc()!!


    var parentComponentsNodeList: NodeList = document.getElementsByTagName(TransformInfosData.getInstance()!!.NAME)!!


    
                        if(parentComponentsNodeList != 
                                    null
                                 && parentComponentsNodeList!!.getLength() > 0)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Replacing", this, "set()")

                                    }
                                

    var componentNode: Node = parentComponentsNodeList!!.item(0)!!.getChildNodes()!!.item(0)!!


    
                        if(componentNode != 
                                    null
                                )
                        
                                    {
                                    document.removeChild(componentNode)

                                    }
                                
parentComponentsNodeList!!.item(0)!!.appendChild(TransformInfoDomNodeView(aParentViewName).
                            toXmlNode(document))

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Setting", this, "set()")

                                    }
                                

    var objectConfigNode: Node = document.getElementsByTagName(TransformInfoObjectConfigData.getInstance()!!.NAME)!!.item(0)!!


    var parentComponentsNode: Node = document.createElement(TransformInfosData.getInstance()!!.NAME)!!

objectConfigNode!!.appendChild(parentComponentsNode)

    var transformInfoDomNodeView: TransformInfoDomNodeView = TransformInfoDomNodeView(aParentViewName)

parentComponentsNode!!.appendChild(transformInfoDomNodeView!!.toXmlNode(document))

                        }
                            
}


}
                
            

