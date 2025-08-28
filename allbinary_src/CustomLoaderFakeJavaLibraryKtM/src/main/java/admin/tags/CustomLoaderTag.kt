
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
import org.allbinary.globals.AppUrlGlobals
import org.allbinary.globals.GLOBALS2
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.http.request.AbResponseHandler
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.security.licensing.LicensingException
import tags.CustomTagSupport

open public class CustomLoaderTag : CustomTagSupport {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var command: String

    private var webappPath: String
public constructor        (){
}


open fun setCommand(command: String)
        //nullable = true from not(false or (false and false)) = true
{
var command = command
this.command= command
}


open fun setWebappPath(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.webappPath= value
}


                @Throws(LicensingException::class)
            
open fun setCustomLoaderWebappPath()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            
    var urlGlobals: AppUrlGlobals = AppUrlGlobals()

urlGlobals!!.setWebappPath(this.webappPath)
URLGLOBALS.init(urlGlobals)
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "setCustomLoaderWebappPath()", e)

                                    }
                                
}

}


                @Throws(JspTagException::class)
            
open fun doStartTag()
        //nullable = true from not(false or (false and true)) = true
: Int{

        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, "doStartTag()")

                                    }
                                

    
                        if(command != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(command.compareTo(GLOBALS2.SET) == 0)
                        
                                    {
                                    this.setCustomLoaderWebappPath()

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
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
                
            

