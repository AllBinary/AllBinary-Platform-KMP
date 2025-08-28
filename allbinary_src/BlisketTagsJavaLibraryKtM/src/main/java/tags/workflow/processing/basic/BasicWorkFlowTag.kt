
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
        package tags.workflow.processing.basic




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.servlet.jsp.JspTagException
import org.allbinary.business.DynamicObjectData
import org.allbinary.logic.communication.http.request.AbResponseHandler
import org.allbinary.logic.communication.log.LogUtil
import tags.StoreWorkFlowTag

open public class BasicWorkFlowTag : StoreWorkFlowTag {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor        (){

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
}


                @Throws(JspTagException::class)
            
open fun doStartTag()
        //nullable = true from not(false or (false and true)) = true
: Int{

        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, "doStartTag()")

                                    }
                                
this.getPropertiesHashMap()!!.put(DynamicObjectData.NAME, "workflows.template.data.BasicStoreWorkFlow")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.doStartTag()
} catch(e: Exception)
            {
AbResponseHandler.sendJspTagRedirect(this.pageContext, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
}

}


}
                
            

