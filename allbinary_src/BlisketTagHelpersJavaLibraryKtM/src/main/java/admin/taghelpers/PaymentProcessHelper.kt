
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
        package admin.taghelpers




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.jsp.PageContext
import org.allbinary.logic.visual.transform.info.TransformInfoHttpFactory
import org.allbinary.logic.visual.transform.info.TransformInfoHttpInterface
import views.admin.payment.PaymentProcessorComponent

open public class PaymentProcessHelper : TagHelper {
        

    private var paymentProcessorComponent: PaymentProcessorComponent
public constructor        (propertiesHashMap: HashMap<Any, Any>, pageContext: PageContext){
var propertiesHashMap = propertiesHashMap
var pageContext = pageContext

    var transformInfoInterface: TransformInfoHttpInterface = TransformInfoHttpFactory.getInstance(propertiesHashMap, pageContext) as TransformInfoHttpInterface

this.paymentProcessorComponent= PaymentProcessorComponent(transformInfoInterface)
}


                @Throws(Exception::class)
            
open fun process()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.paymentProcessorComponent!!.view()
}


}
                
            

