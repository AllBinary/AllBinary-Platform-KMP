
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
        package org.allbinary.logic.visual.transform.info.dom




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.document.DomDocumentFileHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.visual.transform.info.TransformInfoData
import org.allbinary.logic.visual.transform.info.TransformInfoProperties
import org.allbinary.logic.visual.transform.info.TransformInfoPropertiesFactory
import org.allbinary.logic.visual.transform.info.TransformInfosData
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class TransformInfoPropertiesDocument
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val document: Document
public constructor        (filePath: String)
            : super()
        {

                    var filePath = filePath

    var xmlFile: AbFile = AbFile(filePath)

this.document= DomDocumentFileHelper.create(xmlFile)
}


open fun toTransformInfoPropertiesHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
        try {
            
    var transformInfoPropertiesHashMap: HashMap<Any, Any> = HashMap<Any, Any>()


    var transformInfosNode: Node = this.document.getElementsByTagName(TransformInfosData.getInstance()!!.NAME)!!.item(0)!!


    var transformInfosChildNodeList: NodeList = transformInfosNode!!.getChildNodes()!!


    var transformInfoNodeVector: Vector = DomSearchHelper.getAllNodes(TransformInfoData.getInstance()!!.NAME, transformInfosChildNodeList)!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Size: " +transformInfoNodeVector!!.size, this, "toTransformInfoPropertiesHashMap()")

                                    }
                                

    var size: Int = transformInfoNodeVector!!.size!!


    var node: Node


    var transformInfoProperties: TransformInfoProperties





                        for (index in 0 until size)

        {node= transformInfoNodeVector!!.get(index) as Node
transformInfoProperties= TransformInfoPropertiesFactory.getInstance()!!.getInstance(node)
transformInfoPropertiesHashMap!!.put(transformInfoProperties!!.getName(), transformInfoProperties)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return transformInfoPropertiesHashMap
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, this, "toTransformInfoPropertiesHashMap()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


}
                
            

