
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
        package tags




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.servlet.jsp.JspTagException
import admin.taghelpers.TagHelperFactoryInterface
import org.allbinary.logic.communication.http.request.AbResponseHandler
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.security.licensing.LicensingException
import taghelpers.ViewHelperFactory
import tags.transform.info.TransformInfoTag

open public class TransformTag : TransformInfoTag {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor        ()                        

                            : super(ViewHelperFactory())

        Updates for KMP build        
        {


                            //For kotlin this is before the body of the constructor.
                    

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
}

public constructor        (tagHelperFactoryInterface: TagHelperFactoryInterface)                        

                            : super(tagHelperFactoryInterface)

        Updates for KMP build        
        {
var tagHelperFactoryInterface = tagHelperFactoryInterface


                            //For kotlin this is before the body of the constructor.
                    

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
}


                @Throws(Exception::class)
            
open fun view()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var result: String = this.getHelper()!!.::class.getMethod("view", 
                            null)!!.invoke(this.getHelper(), 
                            null) as String




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            

        Updates for KMP build        
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "view()", e)

                                    }
                                



                            throw e
}

}


                @Throws(JspTagException::class)
            
open fun doStartTag()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {

        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put("Creating with: \n" +this.getPropertiesHashMap()!!.toString(), this, "doStartTag")

                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("ViewTag Start For: ")
stringBuffer!!.append(this.getName())
stringBuffer!!.append("\nViewFile: ")
stringBuffer!!.append(this.getObjectFile())
logUtil!!.put(stringBuffer!!.toString(), this, "doStartTag")

                                    }
                                
this.setHelper()
pageContext!!.getOut()!!.print(this.view())

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put("Tag End", this, "doStartTag")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
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
                
            

