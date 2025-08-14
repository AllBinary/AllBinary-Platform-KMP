
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.jsp.PageContext
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.logic.control.workflow.StoreWorkFlowInterface

open public class BasicStoreWorkFlow : BasicWorkFlow
                , StoreWorkFlowInterface {
        
public constructor        (propertiesHashMap: HashMap<Any, Any>, pageContext: PageContext)                        

                            : super(propertiesHashMap, pageContext){

                    var propertiesHashMap = propertiesHashMap


                    var pageContext = pageContext


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
open fun getStoreName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getPropertiesHashMap()!!.get(StoreFrontData.getInstance()!!.NAME) as String
}


}
                
            

