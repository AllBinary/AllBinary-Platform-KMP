
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
        package views.business.context




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.visual.transform.TransformFactory
import org.allbinary.logic.visual.transform.TransformInterface
import org.allbinary.logic.visual.transform.info.GeneratorTransformInfoData
import org.allbinary.logic.visual.transform.info.RootTransformInfoData
import org.allbinary.logic.visual.transform.info.TransformInfoHttp
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.logic.visual.transform.info.objectConfig.TransformInfoObjectConfigAndManipulatorFactory
import org.allbinary.logic.visual.transform.info.objectConfig.TransformInfoObjectConfigInterface
import org.allbinary.logic.visual.transform.template.TransformTemplateInterface
import org.allbinary.string.CommonSeps
import org.w3c.dom.Document
import views.business.context.modules.storefront.HttpStoreComponentView

open public class OverrideObjectConfigRootContextView : HttpStoreComponentView {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            
public constructor        (transformInfoInterface: Object)                        

                            : super(transformInfoInterface){

                    var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("View Name: " +transformInfoInterface!!.getName(), this, "OverrideObjectRootContextView()")

                                    }
                                
}


                @Throws(Exception::class)
            
open fun view()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("View Name: " +this.getTransformInfoInterface()!!.getName(), this, "view()")

                                    }
                                

    var rootTransformInfoInterface: TransformInfoInterface = TransformInfoHttp(this.getTransformInfoInterface() as TransformInfoHttp) as TransformInfoInterface


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(this.getTransformInfoInterface()!!.getStoreName())
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)

    var nameStart: String = stringBuffer!!.toString()!!
            


    
                        if(this.getTransformInfoInterface()!!.getName()!!.indexOf(GeneratorTransformInfoData.NAME) > 0)
                        
                                    {
                                    rootTransformInfoInterface!!.setName(nameStart +GeneratorTransformInfoData.NAME)

                                    }
                                
                             else 
    
                        if(this.getTransformInfoInterface()!!.getName()!!.indexOf(RootTransformInfoData.NAME) > 0)
                        
                                    {
                                    rootTransformInfoInterface!!.setName(nameStart +RootTransformInfoData.NAME)

                                    }
                                
                        else {
                            


                            throw Exception("Override Currently Not Supported")

                        }
                            

    var overrideObjectConfigDocument: Document = this.getTransformInfoInterface()!!.getObjectConfigInterface()!!.toXmlDoc()!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Retrieved OverrideObjectConfig: " +DomDocumentHelper.toString(overrideObjectConfigDocument), this, "view()")

                                    }
                                

    var transformFactory: TransformFactory = TransformFactory.getInstance()!!
            


    var rootComponentInterface: TransformInterface = transformFactory!!.getInstance(this.abeClientInformation, rootTransformInfoInterface!!.getName(), rootTransformInfoInterface)!!
            


    var transformTemplateInterface: TransformTemplateInterface = rootComponentInterface as TransformTemplateInterface


    var componentInterface: TransformInterface = transformFactory!!.getInstance(this.abeClientInformation, transformTemplateInterface!!.getName(), rootComponentInterface!!.getTransformInfoInterface())!!
            


    var transformInfoObjectConfigInterface: TransformInfoObjectConfigInterface = TransformInfoObjectConfigAndManipulatorFactory.getInstance()!!.getInstance(this.abeClientInformation, componentInterface!!.getTransformInfoInterface(), overrideObjectConfigDocument)!!
            

componentInterface!!.getTransformInfoInterface()!!.setObjectConfigInterface(transformInfoObjectConfigInterface)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Set OverrideObjectConfig: " +componentInterface!!.getTransformInfoInterface()!!.getObjectConfigInterface()!!.toString(), this, "view()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return componentInterface!!.view()
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
                
            

