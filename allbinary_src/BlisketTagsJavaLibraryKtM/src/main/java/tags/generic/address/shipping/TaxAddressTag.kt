
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
        package tags.generic.address.shipping




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.servlet.jsp.JspTagException
import org.allbinary.logic.communication.http.request.AbResponseHandler
import org.allbinary.logic.system.security.licensing.LicensingException
import tags.StoreValidationTransformTag

open public class TaxAddressTag : StoreValidationTransformTag {
        
public constructor        (){}


                @Throws(JspTagException::class)
            
open fun doStartTag()
        //nullable = true from not(false or (false and true)) = true
: Int{
        try {
            
    
                        if(this.getCommand() != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(this.getCommand()!!.compareTo(org.allbinary.globals.GLOBALS2.VIEW) == 0)
                        
                                    {
                                    this.setName("Basic Shipping Address View")
this.setObjectFile("views.generic.address.shipping.TaxValidationView")

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(org.allbinary.globals.GLOBALS2.NEW) == 0)
                        
                                    {
                                    this.setName("Basic Shipping Address View")
this.setObjectFile("views.generic.address.shipping.NewValidationView")

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(this.commonStrings!!.INSERT) == 0)
                        
                                    {
                                    this.setName("Basic Shipping Address View")
this.setObjectFile("views.generic.address.shipping.AddTaxValidationView")

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(this.commonStrings!!.UPDATE) == 0)
                        
                                    {
                                    this.setName("Basic Shipping Address View")
this.setObjectFile("views.generic.address.shipping.UpdateTaxValidationView")

                                    }
                                
                        else {
                            


                            throw Exception("No Such View Command: " +this.getCommand())

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.doStartTag()

                                    }
                                



                            throw Exception("Command Null")
} catch(e: LicensingException)
            {AbResponseHandler.sendJspTagLicensingRedirect(this.pageContext, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
}
 catch(e: Exception)
            {AbResponseHandler.sendJspTagRedirect(this.pageContext, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
}

}


}
                
            

