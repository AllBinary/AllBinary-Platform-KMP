
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
        package tags.generic.payment




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.servlet.jsp.JspTagException
import org.allbinary.business.user.commerce.money.payment.PaymentData
import org.allbinary.logic.communication.http.request.AbResponseHandler
import org.allbinary.logic.system.security.licensing.LicensingException
import tags.StoreValidationTransformTag

open public class PaymentTag : StoreValidationTransformTag {
        
public constructor        (){
}


                @Throws(JspTagException::class)
            
open fun doStartTag()
        //nullable = true from not(false or (false and true)) = true
: Int{

        try {
            this.setName("Basic Payment View")
this.setObjectFile("views.generic.payment.ValidationView")

    
                        if(this.getCommand() != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(this.getCommand()!!.compareTo(PaymentData.VIEW) == 0 || this.getCommand()!!.compareTo(PaymentData.CHANGE) == 0 || this.getCommand()!!.compareTo(PaymentData.ADDNEW) == 0)
                        
                                    {
                                    
                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(this.commonStrings!!.INSERT) == 0)
                        
                                    {
                                    
                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(this.commonStrings!!.DELETE) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.EVAL_BODY_INCLUDE

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(PaymentData.SELECT) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.EVAL_BODY_INCLUDE

                                    }
                                
                        else {
                            


                            throw Exception("No Such View Command: " +this.getCommand())

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.doStartTag()

                                    }
                                



                            throw Exception("Command Null")
} catch(e: LicensingException)
            {
AbResponseHandler.sendJspTagLicensingRedirect(this.pageContext, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
}
 catch(e: Exception)
            {
AbResponseHandler.sendJspTagRedirect(this.pageContext, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
}

}


}
                
            

