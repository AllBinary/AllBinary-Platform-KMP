
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
        
import java.util.HashMap
import java.util.Vector
import javax.servlet.jsp.JspTagException
import javax.servlet.jsp.tagext.Tag
import admin.taghelpers.MultipartRequestParamForwardHelper
import org.allbinary.logic.communication.http.request.AbResponseHandler
import org.allbinary.logic.system.security.licensing.LicensingException
import tags.CustomTagSupport
import tags.HelperTag

open public class MultipartRequestParamForwardTag : CustomTagSupport {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private var page: String

    private var command: String

    private var paramVector: Vector

open fun setPage(page: String)
        //nullable = true from not(false or (false and false)) = true
{
var page = page
this.page= page
}


open fun setCommand(command: String)
        //nullable = true from not(false or (false and false)) = true
{
var command = command
this.command= command
}


open fun setParamVector(paramVector: Vector)
        //nullable = true from not(false or (false and false)) = true
{
var paramVector = paramVector
this.paramVector= paramVector
}


                @Throws(JspTagException::class)
            
open fun doStartTag()
        //nullable = true from not(false or (false and true)) = true
: Int{

        try {
            
    var parentTag: HelperTag = this.getParent() as HelperTag

ParentInventoryTagHelper.getInstance()!!.isValid(this, parentTag)

    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(AbTagData.PARENT, parentTag)

    var multipartRequestParamForwardHelper: MultipartRequestParamForwardHelper = MultipartRequestParamForwardHelper(parentTag, this.page, this.command, this.paramVector, this.pageContext)

multipartRequestParamForwardHelper!!.forward()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Tag.SKIP_BODY
} catch(e: LicensingException)
            {
AbResponseHandler.sendJspTagLicensingRedirect(this.pageContext, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Tag.SKIP_BODY
}
 catch(e: Exception)
            {
AbResponseHandler.sendJspTagRedirect(this.pageContext, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Tag.SKIP_BODY
}

}


}
                
            

