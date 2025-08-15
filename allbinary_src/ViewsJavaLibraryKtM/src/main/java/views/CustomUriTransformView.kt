
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
        
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.ServiceClientInformationInterfaceFactory
import org.allbinary.logic.visual.transform.TransformInfoCustomUriTransformer
import org.allbinary.logic.visual.transform.TransformInterface
import org.allbinary.logic.visual.transform.data.TransformDocumentFactory
import org.allbinary.logic.visual.transform.data.TransformDocumentInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class CustomUriTransformView
            : Object
        
                , TransformInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    val abeClientInformation: AbeClientInformationInterface = ServiceClientInformationInterfaceFactory.getInstance()!!
            

    private var transformInfoInterface: TransformInfoInterface

    private var transformDocumentInterface: TransformDocumentInterface
public constructor        (transformInfoInterface: TransformInfoInterface)
            : super()
        {

                    var transformInfoInterface = transformInfoInterface

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("View Name: " +transformInfoInterface!!.getName(), this, "CustomUriTransformView()")

                                    }
                                
this.setTransformInfoInterface(transformInfoInterface)
this.setTransformDocumentInterface(TransformDocumentFactory.getInstance())
}


    var NO_TYPE: Int = 0

open fun getTypeId()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NO_TYPE
}


open fun getTransformInfoInterface()
        //nullable = true from not(false or (false and true)) = true
: TransformInfoInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return transformInfoInterface
}


open fun setTransformInfoInterface(transformInfoInterface: TransformInfoInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var transformInfoInterface = transformInfoInterface
this.transformInfoInterface= transformInfoInterface
}


open fun getTransformDocumentInterface()
        //nullable = true from not(false or (false and true)) = true
: TransformDocumentInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.transformDocumentInterface
}


open fun setTransformDocumentInterface(transformDocumentInterface: TransformDocumentInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var transformDocumentInterface = transformDocumentInterface
this.transformDocumentInterface= transformDocumentInterface
}


open fun toXmlDoc()
        //nullable = true from not(false or (false and true)) = true
: Document{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.transformDocumentInterface!!.getDoc()
}


                @Throws(Exception::class)
            
open fun getDoc()
        //nullable = true from not(false or (false and true)) = true
: Document{
    var document: Document = this.getTransformInfoInterface()!!.getDataDocument()!!
            


    var dataNode: Node = this.getTransformDocumentInterface()!!.getDoc()!!.importNode(document.getFirstChild(), true)!!
            


    
                        if(dataNode != 
                                    null
                                )
                        
                                    {
                                    this.getTransformDocumentInterface()!!.getBaseNode()!!.appendChild(dataNode)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getTransformDocumentInterface()!!.getDoc()
}


                @Throws(Exception::class)
            
open fun view()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var success: String = DomDocumentHelper.toString(this.getDoc())!!
            


    var result: String = TransformInfoCustomUriTransformer(this.abeClientInformation, this.getTransformInfoInterface()).
                            translate(success)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "view()", e)

                                    }
                                



                            throw e
}

}


}
                
            

