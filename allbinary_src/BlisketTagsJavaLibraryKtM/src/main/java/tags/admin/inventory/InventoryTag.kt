
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
        package tags.admin.inventory




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.servlet.jsp.JspTagException
import org.allbinary.logic.communication.http.request.AbResponseHandler
import org.allbinary.logic.system.security.licensing.LicensingException
import tags.StoreValidationTransformTag

open public class InventoryTag : StoreValidationTransformTag {
        
public constructor        ()

        Updates for KMP build        
        {
}


                @Throws(JspTagException::class)
            
open fun doStartTag()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {

        try {
            
    
                        if(this.getCommand() != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(this.getCommand()!!.compareTo(org.allbinary.globals.GLOBALS2.VIEW) == 0)
                        
                                    {
                                    


                            throw Exception("No Such View Command: " +this.getCommand())

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(this.commonStrings!!.INSERT) == 0)
                        
                                    {
                                    this.setName("Add Inventory Item Validation View")
this.setObjectFile("views.admin.inventory.AddFileValidationView")

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(this.commonStrings!!.DELETE) == 0)
                        
                                    {
                                    this.setName("Delete Inventory Item Validation View")
this.setObjectFile("views.admin.inventory.DeleteFileValidationView")

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(org.allbinary.globals.GLOBALS2.EDIT) == 0)
                        
                                    {
                                    this.setName("Edit Inventory Item Validation View")
this.setObjectFile("views.admin.inventory.EditValidationView")

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(org.allbinary.globals.GLOBALS2.NEW) == 0)
                        
                                    {
                                    this.setName("New Inventory Item Validation View")
this.setObjectFile("views.admin.inventory.NewValidationView")

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(this.commonStrings!!.UPDATE) == 0)
                        
                                    {
                                    this.setName("Update Inventory Item Validation View")
this.setObjectFile("views.admin.inventory.UpdateFileValidationView")

                                    }
                                
                        else {
                            


                            throw Exception("No Such View Command: " +this.getCommand())

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.doStartTag()

                                    }
                                



                            throw Exception("Command Null")
} catch(e: LicensingException)
            

        Updates for KMP build        
        {
AbResponseHandler.sendJspTagLicensingRedirect(this.pageContext, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
}
 catch(e: Exception)
            

        Updates for KMP build        
        {
AbResponseHandler.sendJspTagRedirect(this.pageContext, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
}

}


}
                
            

