
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
        
import java.lang.reflect.Method
import javax.servlet.jsp.JspTagException
import admin.taghelpers.StaticPagesHelperFactory
import admin.taghelpers.StaticPagesRequestHelperFactory
import org.allbinary.logic.communication.http.request.AbResponseHandler
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.search.SearchData
import org.allbinary.logic.system.security.licensing.LicensingException
import org.allbinary.logic.visual.transform.info.TransformInfoData

open public class StaticPagesTag : TableTag {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var xslFile: String
public constructor        (){this.setTagHelperFactory(StaticPagesHelperFactory())
this.setTagRequestHelperFactory(StaticPagesRequestHelperFactory())
}


open fun setXsl(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.xslFile= value
}


                @Throws(LicensingException::class)
            
open fun generateStaticPages()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var anyType: Any = StaticPagesRequestHelperFactory().
                            getInstance(this.getPropertiesHashMap(), this.pageContext)!!
            


    var helperClass: KClass<*> = anyType!!::class!!
            


    var method: Method = helperClass!!.getMethod(
                            "generateStaticPages", 
                            null)!!
            


    var result: String = method.invoke(anyType, 
                            null) as String




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: LicensingException)
            {


                            throw e
}
 catch(e: Exception)
            {
    var error: String = "Failed to generate staticpages table"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "generateStaticPages()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


                @Throws(LicensingException::class)
            
open fun makePublic()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var anyType: Any = StaticPagesRequestHelperFactory().
                            getInstance(this.getPropertiesHashMap(), this.pageContext)!!
            


    var helperClass: KClass<*> = anyType!!::class!!
            


    var method: Method = helperClass!!.getMethod(
                            "makePublic", 
                            null)!!
            


    var result: String = method.invoke(anyType, 
                            null) as String




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: LicensingException)
            {


                            throw e
}
 catch(e: Exception)
            {
    var error: String = "Failed to makePublic"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "makePublic()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

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
                                    
    
                        if(this.getCommand()!!.compareTo(SearchData.GENERATESTATICPAGES) == 0)
                        
                                    {
                                    this.getPropertiesHashMap()!!.put(TransformInfoData.getInstance()!!.TEMPLATEFILENAME, this.xslFile)

    var output: String = this.generateStaticPages()!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGEXTRAOUTPUT))
                        
                                    {
                                    this.pageContext!!.getOut()!!.print(output)

                                    }
                                

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(SearchData.MAKEPUBLIC) == 0)
                        
                                    {
                                    
    var output: String = this.makePublic()!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGEXTRAOUTPUT))
                        
                                    {
                                    this.pageContext!!.getOut()!!.print(output)

                                    }
                                

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.doStartTag()

                        }
                            

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
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
                
            

