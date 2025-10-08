
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
        package taghelpers




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.jsp.PageContext
import admin.taghelpers.TagHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.workflow.StoreTagWorkFlowFactory
import org.allbinary.logic.control.workflow.StoreWorkFlowInterface
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.ServiceClientInformationInterfaceFactory

open public class StoreTagWorkFlowHelper : TagHelper {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val abeClientInformation: AbeClientInformationInterface = ServiceClientInformationInterfaceFactory.getInstance()!!

    private var storeWorkFlowInterface: StoreWorkFlowInterface
public constructor (hashMap: HashMap<Any, Any>, pageContext: PageContext){
var hashMap = hashMap
var pageContext = pageContext

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPER))
                        
                                    {
                                    logUtil!!.put("Properties: " +hashMap!!.toString(), this, "StoreTagWorkFlowHelper()")

                                    }
                                
this.storeWorkFlowInterface= StoreTagWorkFlowFactory.getInstance()!!.getInstance(this.abeClientInformation, hashMap, pageContext)
}


                @Throws(Exception::class)
            
    open fun process()
        //nullable = true from not(false or (false and true)) = true
: Integer{

        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPER))
                        
                                    {
                                    logUtil!!.put("Process", this, commonStrings!!.PROCESS)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.storeWorkFlowInterface!!.process()
} catch(e: Exception)
            {

    var error: String = "Failed to process workflow: "


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "view()", e)

                                    }
                                



                            throw e
}

}


}
                
            

