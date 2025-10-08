
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
        package admin.tags




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.servlet.jsp.JspTagException
import admin.taghelpers.UserHelperFactory
import org.allbinary.business.entry.EntryData
import org.allbinary.business.user.role.UserRoleData
import org.allbinary.logic.communication.http.request.AbResponseHandler

open public class UserTag : TableTag {
        

    private var role: String

    private var enable: String
public constructor (){
this.setTagHelperFactory(UserHelperFactory())
this.setTagRequestHelperFactory(UserHelperFactory())
}


    open fun setRole(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.role= value
this.getPropertiesHashMap()!!.put(UserRoleData.NAME, this.role)
}


    open fun setEnable(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.enable= value
this.getPropertiesHashMap()!!.put(EntryData.getInstance()!!.ENABLE, this.enable)
}


                @Throws(JspTagException::class)
            
    open fun doStartTag()
        //nullable = true from not(false or (false and true)) = true
: Int{

        try {
            
    
                        if(this.isEnabled())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.doStartTag()

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
} catch(e: Exception)
            {
AbResponseHandler.sendJspTagRedirect(this.pageContext, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
}

}


}
                
            

