
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
        package views.business.context.modules.storefront.generator




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.visual.transform.generator.TransformsGeneratorUtil
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.logic.visual.transform.info.TransformInfosData
import views.business.context.modules.storefront.HttpStoreComponentView

open public class GeneratorStoreFrontContextView : HttpStoreComponentView {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface)

        Updates for KMP build        
        {
var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("View Name: " +transformInfoInterface!!.getName(), this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
}


                @Throws(Exception::class)
            
open fun view(group: String)
        //nullable = true from not(false or (false and false)) = true
: String

        Updates for KMP build        
        {
var group = group

    var result: String = TransformsGeneratorUtil.getInstance()!!.generateComponentsFromObjectConfig(this.abeClientInformation, this.getTransformInfoInterface(), group)!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPEXTRAOUTPUT))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING

                        }
                            
}


                @Throws(Exception::class)
            
open fun view()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.view(TransformInfosData.getInstance()!!.ALL)
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "view()", e)

                                    }
                                



                            throw e
}

}


}
                
            

