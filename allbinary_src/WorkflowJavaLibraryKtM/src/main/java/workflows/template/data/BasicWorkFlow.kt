
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
        package workflows.template.data




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.jsp.PageContext
import javax.servlet.jsp.tagext.TagSupport
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.validate.ValidationComponentInterface
import org.allbinary.logic.control.workflow.WorkFlowData
import org.allbinary.logic.control.workflow.WorkFlowInterface
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.ServiceClientInformationInterfaceFactory
import org.allbinary.logic.visual.transform.TransformFactory
import org.allbinary.string.CommonStrings

open public class BasicWorkFlow
            : Object
        
                , WorkFlowInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val abeClientInformation: AbeClientInformationInterface = ServiceClientInformationInterfaceFactory.getInstance()!!

    private var validationDomNodeInterface: ValidationComponentInterface

    private var propertiesHashMap: HashMap<Any, Any>

    private var pageContext: PageContext
public constructor        (propertiesHashMap: HashMap<Any, Any>, pageContext: PageContext)
            : super()
        

        Updates for KMP build        
        {
var propertiesHashMap = propertiesHashMap
var pageContext = pageContext

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.WORKFLOW))
                        
                                    {
                                    logUtil!!.put("Properties: " +propertiesHashMap!!.toString(), this, "BasicWorkFlow()")

                                    }
                                
this.propertiesHashMap= propertiesHashMap
this.pageContext= pageContext
this.validationDomNodeInterface= TransformFactory.getInstance()!!.getInstance(abeClientInformation, propertiesHashMap, pageContext) as ValidationComponentInterface
}


                @Throws(Exception::class)
            
open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getPropertiesHashMap()!!.get(WorkFlowData.getInstance()!!.NAME) as String
}


open fun getPropertiesHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.propertiesHashMap
}


open fun getPageContext()
        //nullable = true from not(false or (false and true)) = true
: PageContext

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.pageContext
}


                @Throws(Exception::class)
            
open fun process()
        //nullable = true from not(false or (false and true)) = true
: Integer

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.WORKFLOW))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, commonStrings!!.PROCESS)

                                    }
                                

    
                        if(this.validationDomNodeInterface!!.isValid())
                        
                                    {
                                    pageContext!!.getOut()!!.print(this.validationDomNodeInterface!!.view())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Integer(Integer.valueOf(TagSupport.EVAL_BODY_INCLUDE))

                                    }
                                
                        else {
                            pageContext!!.getOut()!!.print(this.validationDomNodeInterface!!.validationInfo())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Integer(Integer.valueOf(TagSupport.SKIP_BODY))

                        }
                            
}


}
                
            

