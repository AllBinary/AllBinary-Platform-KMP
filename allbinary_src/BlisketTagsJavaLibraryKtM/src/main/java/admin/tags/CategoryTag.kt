
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
import admin.taghelpers.CategoryHelperFactory
import admin.taghelpers.CategoryRequestHelperFactory
import org.allbinary.business.category.CategoryData
import org.allbinary.logic.communication.http.request.AbResponseHandler
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.security.licensing.LicensingException
import org.allbinary.logic.visual.transform.info.TransformInfoData

open public class CategoryTag : TableTag {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var xsl: String
public constructor        (){this.setTagHelperFactory(CategoryHelperFactory())
this.setTagRequestHelperFactory(CategoryRequestHelperFactory())
}


open fun setXsl(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.xsl= value
}


                @Throws(LicensingException::class)
            
open fun viewCategory()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var anyType: Any = CategoryRequestHelperFactory().
                            getInstance(this.getPropertiesHashMap(), this.pageContext)!!
            


    var helperClass: KClass<*> = anyType!!::class!!
            


    var method: Method = helperClass!!.getMethod(
                            "viewCategory", 
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
    var error: String = "Failed to view a Category"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "viewCategory()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return error
}

}


                @Throws(LicensingException::class)
            
open fun viewCategories()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var anyType: Any = CategoryRequestHelperFactory().
                            getInstance(this.getPropertiesHashMap(), this.pageContext)!!
            


    var helperClass: KClass<*> = anyType!!::class!!
            


    var method: Method = helperClass!!.getMethod(
                            "viewCategories", 
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
    var error: String = "Failed to view a Categories"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "viewCategories()", e)

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
                                    this.getPropertiesHashMap()!!.put(TransformInfoData.getInstance()!!.TEMPLATEFILENAME, this.xsl)

    
                        if(this.getCommand()!!.compareTo(CategoryData.getInstance()!!.VIEW) == 0)
                        
                                    {
                                    
    var output: String = this.viewCategory()!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGEXTRAOUTPUT))
                        
                                    {
                                    pageContext!!.getOut()!!.print(output)

                                    }
                                

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(CategoryData.getInstance()!!.VIEW) == 0)
                        
                                    {
                                    
    var output: String = this.viewCategories()!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAGEXTRAOUTPUT))
                        
                                    {
                                    pageContext!!.getOut()!!.print(output)

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
                
            

