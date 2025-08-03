
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.servlet.jsp.JspTagException
import javax.servlet.jsp.tagext.Tag
import admin.taghelpers.InventoryHelperFactory
import admin.taghelpers.InventoryRequestHelperFactory
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.logic.communication.http.request.AbResponseHandler

open public class InventoryTag : TableTag {
        

    private var storeName: String
public constructor        ()                        

                            : super(){

                            //For kotlin this is before the body of the constructor.
                    
this.setTagHelperFactory(InventoryHelperFactory())
this.setTagRequestHelperFactory(InventoryRequestHelperFactory())
}


open fun setStoreName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.storeName= value
}


                @Throws(JspTagException::class)
            
open fun doStartTag()
        //nullable = true from not(false or (false and true)) = true
: Int{
        try {
            
    
                        if(this.isEnabled())
                        
                                    {
                                    
    
                        if(this.getCommand() != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(this.getCommand()!!.compareTo(org!!.allbinary!!.globals!!.GLOBALS2.BACKUP) != 0 && this.getCommand()!!.compareTo(org!!.allbinary!!.globals!!.GLOBALS2.RESTORE) != 0 && this.getCommand()!!.compareTo(this.commonStrings!!.CREATE) != 0 && this.getCommand()!!.compareTo(this.commonStrings!!.DROP) != 0)
                        
                                    {
                                    
    var parentTag: Tag = this.getParent()!!
            

ParentInventoryTagHelper.getInstance()!!.isValid(this, parentTag)
this.getPropertiesHashMap()!!.put(AbTagData.PARENT, parentTag)
this.getPropertiesHashMap()!!.put(StoreFrontData.getInstance()!!.NAME, this.storeName)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.doStartTag()

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
} catch(e: Exception)
            {AbResponseHandler.sendJspTagRedirect(this.pageContext, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
}

}


}
                
            

