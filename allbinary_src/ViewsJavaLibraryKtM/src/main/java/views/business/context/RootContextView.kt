
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
        
import java.util.Vector
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.visual.transform.TransformFactory
import org.allbinary.logic.visual.transform.TransformInterface
import org.allbinary.logic.visual.transform.info.TransformInfo
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.logic.visual.transform.template.TransformTemplateInterface
import views.business.context.modules.storefront.HttpStoreComponentView
import views.business.context.modules.storefront.customizer.template.objectConfig.NoTemplateTransformInfoObjectConfig

open public class RootContextView : HttpStoreComponentView
                , TransformTemplateInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface){
var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("View Name: " +transformInfoInterface!!.getName(), this, "RootContextView()")

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
                                

    var viewName: String = this.getName()!!


    var componentInterface: TransformInterface = TransformFactory.getInstance()!!.getInstance(this.abeClientInformation, viewName, this.getTransformInfoInterface())!!




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


                @Throws(Exception::class)
            
open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            
    var objectConfig: NoTemplateTransformInfoObjectConfig = NoTemplateTransformInfoObjectConfig(this.getTransformInfoInterface(), this.getTransformInfoInterface()!!.getObjectConfigInterface()!!.toXmlDoc())


    var componentsVector: Vector = objectConfig!!.getTransforms()!!


    
                        if(componentsVector!!.size == 0)
                        
                                    {
                                    


                            throw Exception("Template View Not Set - No Components")

                                    }
                                

    
                        if(componentsVector!!.size > 1)
                        
                                    {
                                    


                            throw Exception("To Many Root Template Views: " +componentsVector!!.size)

                                    }
                                

    var transformInfoInterface: TransformInfo = componentsVector!!.get(0) as TransformInfo


    var viewName: String = transformInfoInterface!!.getName()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Root Template With View Name: " +viewName, this, "getName()")

                                    }
                                

    
                        if(StringValidationUtil.getInstance()!!.isEmpty(viewName))
                        
                                    {
                                    


                            throw Exception("Template View Not Set - No View Name")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return viewName
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "getName()", e)

                                    }
                                



                            throw e
}

}


}
                
            

