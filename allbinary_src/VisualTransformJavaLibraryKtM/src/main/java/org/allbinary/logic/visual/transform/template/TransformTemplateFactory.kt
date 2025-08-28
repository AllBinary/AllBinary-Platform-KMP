
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
        package org.allbinary.logic.visual.transform.template




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.jsp.PageContext
import org.allbinary.data.tables.transform.info.TransformInfoEntity
import org.allbinary.data.tables.transform.info.TransformInfoEntityBuilder
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.logic.visual.transform.info.TransformInfoObjectFactory

open public class TransformTemplateFactory
            : Object
         {
        

        companion object {
            
    private val instance: TransformTemplateFactory = TransformTemplateFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TransformTemplateFactory

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
private constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


                @Throws(Exception::class)
            
open fun getInstance(abeClientInformation: AbeClientInformationInterface, templateName: String, propertiesHashMap: HashMap<Any, Any>, pageContext: PageContext)
        //nullable =  from not(true or (false and false)) = 
: TransformTemplateInterface

        Updates for KMP build        
        {
    //var abeClientInformation = abeClientInformation
    //var templateName = templateName
    //var propertiesHashMap = propertiesHashMap
var pageContext = pageContext

        try {
            
    var transformInfoEntity: TransformInfoEntity = TransformInfoEntityBuilder.getInstance()!!


    var transformInfoInterface: TransformInfoInterface = transformInfoEntity!!.get(templateName, propertiesHashMap, pageContext)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TransformInfoObjectFactory.getInstance()!!.getInstance(abeClientInformation, transformInfoInterface) as TransformTemplateInterface
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var error: String = "Failed To Get Instance"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(error +templateName +"->TemplateFactory", this, "getInstance(viewName, HashMap, PageContext)", e)

                                    }
                                



                            throw e
}

}


}
                
            

