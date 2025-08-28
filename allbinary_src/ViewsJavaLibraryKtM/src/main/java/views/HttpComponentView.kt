
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
        package views




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.ServiceClientInformationInterfaceFactory
import org.allbinary.logic.visual.transform.BasicTransformer
import org.allbinary.logic.visual.transform.TransformInterface
import org.allbinary.logic.visual.transform.data.TransformDocumentInterface
import org.allbinary.logic.visual.transform.data.TransformHttpRequestDocumentFactory
import org.allbinary.logic.visual.transform.info.TransformInfoHttpComposite
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class HttpComponentView : TransformInfoHttpComposite
                , TransformInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val abeClientInformation: AbeClientInformationInterface = ServiceClientInformationInterfaceFactory.getInstance()!!

    private var domNodeInterfaceVector: Vector

    private var transformDocumentInterface: TransformDocumentInterface
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface){
var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("View Name: " +transformInfoInterface!!.getName(), this, "ComponentView()")

                                    }
                                
this.domNodeInterfaceVector= Vector()
this.setTransformDocumentInterface(TransformHttpRequestDocumentFactory.getInstance(this.getPageContext(), this.getWeblisketSession()))
}


    var NO_TYPE: Int = 0

open fun getTypeId()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NO_TYPE
}


open fun getTransformDocumentInterface()
        //nullable = true from not(false or (false and true)) = true
: TransformDocumentInterface{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return transformDocumentInterface
}


open fun setTransformDocumentInterface(transformDocumentInterface: TransformDocumentInterface)
        //nullable = true from not(false or (false and false)) = true
{
var transformDocumentInterface = transformDocumentInterface
this.transformDocumentInterface= transformDocumentInterface
}


open fun addDomNodeInterface(domNodeInterface: DomNodeInterface)
        //nullable = true from not(false or (false and false)) = true
{
var domNodeInterface = domNodeInterface
this.domNodeInterfaceVector!!.add(domNodeInterface)
}


                @Throws(Exception::class)
            
open fun toXmlDoc()
        //nullable = true from not(false or (false and true)) = true
: Document{

        try {
            
    var size: Int = domNodeInterfaceVector!!.size!!





                        for (index in 0 until size)

        {

    var domNodeInterface: DomNodeInterface = domNodeInterfaceVector!!.get(index) as DomNodeInterface

this.transformDocumentInterface!!.getBaseNode()!!.appendChild(domNodeInterface!!.toXmlNode(this.transformDocumentInterface!!.getDoc()))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getTransformDocumentInterface()!!.getDoc()
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "toXmlDoc()", e)

                                    }
                                



                            throw e
}

}


                @Throws(Exception::class)
            
open fun getDoc()
        //nullable = true from not(false or (false and true)) = true
: Document{

    var document: Document = this.getTransformInfoInterface()!!.getDataDocument()!!


    var node: Node = DomNodeHelper.getFirstChildElement(document)!!


    
                        if(node != 
                                    null
                                )
                        
                                    {
                                    
    var dataNode: Node = this.getTransformDocumentInterface()!!.getDoc()!!.importNode(node, true)!!


    
                        if(dataNode != 
                                    null
                                )
                        
                                    {
                                    this.getTransformDocumentInterface()!!.getBaseNode()!!.appendChild(dataNode)

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getTransformDocumentInterface()!!.getDoc()
}


                @Throws(Exception::class)
            
open fun view()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            this.toXmlDoc()

    var success: String = DomDocumentHelper.toString(this.getDoc())!!


    var result: String = BasicTransformer(this.abeClientInformation, this.getTransformInfoInterface()).
                            translate(success)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "view()", e)

                                    }
                                



                            throw e
}

}


}
                
            

