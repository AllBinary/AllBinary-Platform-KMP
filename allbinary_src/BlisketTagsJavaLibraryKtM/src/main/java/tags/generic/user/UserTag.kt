
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
        package tags.generic.user



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.servlet.jsp.JspTagException
import org.allbinary.business.user.role.UserRoleData
import org.allbinary.logic.communication.http.request.AbResponseHandler
import tags.StoreValidationTransformTag

open public class UserTag : StoreValidationTransformTag {
        

    private var role: String
public constructor        (){}


open fun setRole(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.role= value
this.getPropertiesHashMap()!!.put(UserRoleData.NAME, this.role)
}


                @Throws(JspTagException::class)
            
open fun doStartTag()
        //nullable = true from not(false or (false and true)) = true
: Int{
        try {
            
    
                        if(this.getCommand() != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(this.getCommand()!!.compareTo(org!!.allbinary!!.globals!!.GLOBALS2.EDIT +org!!.allbinary!!.globals!!.GLOBALS2.EDIT) == 0)
                        
                                    {
                                    this.setName(
                            "Edit Session Validation User View - i.e. User Profile Edit")
this.setObjectFile(
                            "views.generic.user.EditValidationView")

                                    }
                                

    
                        if(this.getCommand()!!.compareTo(org!!.allbinary!!.globals!!.GLOBALS2.NEW) == 0)
                        
                                    {
                                    this.setName(
                            "New User View")
this.setObjectFile(
                            "views.generic.user.NewUserView")

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(this.commonStrings!!.INSERT) == 0)
                        
                                    {
                                    this.setName(
                            "Add Validation User View")
this.setObjectFile(
                            "views.generic.user.AddValidationUserView")

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(org!!.allbinary!!.globals!!.GLOBALS2.VIEW) == 0)
                        
                                    {
                                    this.setName(
                            "Validation User View")
this.setObjectFile(
                            "views.generic.user.ViewValidationUserView")

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(org!!.allbinary!!.globals!!.GLOBALS2.EDIT) == 0)
                        
                                    {
                                    this.setName(
                            "Validation User View")
this.setObjectFile(
                            "views.generic.user.EditValidationUserView")

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(this.commonStrings!!.UPDATE) == 0)
                        
                                    {
                                    this.setName(
                            "Update Validation User View")
this.setObjectFile(
                            "views.generic.user.UpdateValidationUserView")

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(this.commonStrings!!.DELETE) == 0)
                        
                                    {
                                    this.setName(
                            "Delete Validation User View")
this.setObjectFile(
                            "views.generic.user.DeleteValidationUserView")

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(org!!.allbinary!!.globals!!.GLOBALS2.BACKUP) == 0)
                        
                                    {
                                    


                            throw Exception(
                            "View not implemented")

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(org!!.allbinary!!.globals!!.GLOBALS2.RESTORE) == 0)
                        
                                    {
                                    


                            throw Exception(
                            "View not implemented")

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(this.commonStrings!!.DROP) == 0)
                        
                                    {
                                    


                            throw Exception(
                            "View not implemented")

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(this.commonStrings!!.CREATE) == 0)
                        
                                    {
                                    


                            throw Exception(
                            "View not implemented")

                                    }
                                
                        else {
                            


                            throw Exception("No Such View Command: " +this.getCommand())

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.doStartTag()

                                    }
                                



                            throw Exception(
                            "Command Null")
} catch(e: Exception)
            {AbResponseHandler.sendJspTagRedirect(this.pageContext, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
}

}


}
                
            

