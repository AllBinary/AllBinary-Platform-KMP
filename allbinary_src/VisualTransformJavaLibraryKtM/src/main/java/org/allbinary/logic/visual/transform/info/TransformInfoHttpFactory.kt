
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
        
import java.util.HashMap
import javax.servlet.jsp.PageContext
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.logic.communication.http.request.session.WeblisketSession
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.string.CommonStrings

open public class TransformInfoHttpFactory
            : Object
         {
        

        companion object {
            
                @Throws(Exception::class)
            
open fun getInstance(propertiesHashMap: HashMap<Any, Any>, pageContext: PageContext)
        //nullable =  from not(true or (false and false)) = 
: TransformInfoInterface

        Updates for KMP build        
        {
var propertiesHashMap = propertiesHashMap
var pageContext = pageContext

    var logUtil: LogUtil = LogUtil.getInstance()!!


        try {
            
    var weblisketSession: WeblisketSession = WeblisketSession(propertiesHashMap, pageContext)


    
                        if(!StringValidationUtil.getInstance()!!.isEmpty(weblisketSession!!.getStoreName()))
                        
                                    {
                                    
    var storeFrontInterface: StoreFrontInterface = StoreFrontFactory.getInstance(weblisketSession!!.getStoreName())!!


    
                        if(storeFrontInterface != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TransformInfoHttpStore(storeFrontInterface, propertiesHashMap, pageContext) as TransformInfoInterface

                                    }
                                
                        else {
                            


                            throw Exception("No StoreFront with: " +weblisketSession!!.getStoreName())

                        }
                            

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TransformInfoHttpContext(propertiesHashMap, pageContext) as TransformInfoInterface

                        }
                            
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORYERROR))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(commonStrings!!.EXCEPTION, "TransformInfoFactory", commonStrings!!.GET_INSTANCE, e)

                                    }
                                



                            throw e
}

}


        }
            private constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


}
                
            

