
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
        package tags.generic.inventory




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.lang.reflect.Method
import javax.servlet.jsp.JspTagException
import org.allbinary.logic.communication.http.request.AbResponseHandler
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.security.licensing.LicensingException
import taghelpers.InventoryHelperFactory
import tags.StoreValidationTransformTag

open public class InventoryTag : StoreValidationTransformTag {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
public constructor        ()                        

                            : super(){


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(LicensingException::class)
            
open fun search()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            
    var anyType: Any = InventoryHelperFactory().
                            getInstance(this.getPropertiesHashMap(), this.pageContext)!!


    var addressHelperClass: KClass<*> = anyType!!::class!!


    var method: Method = addressHelperClass!!.getMethod("search", 
                            null)!!


    var result: String = method.invoke(anyType, 
                            null) as String

pageContext!!.getOut()!!.print(result)
} catch(e: LicensingException)
            {



                            throw e
}
 catch(e: Exception)
            {

    var error: String = "Failed to search Inventory by keyword"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "search()", e)

                                    }
                                

        try {
            pageContext!!.getOut()!!.print(error +"<br>")
pageContext!!.getOut()!!.print("Exception: " +e +"<br>")
} catch(e2: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.LICENSINGERROR))
                        
                                    {
                                    logUtil!!.put("Exception in Exception Handling", this, "search()", e)

                                    }
                                
}

}

}


                @Throws(LicensingException::class)
            
open fun viewSummary()
        //nullable = true from not(false or (false and true)) = true
{

        try {
            
    var anyType: Any = InventoryHelperFactory().
                            getInstance(this.getPropertiesHashMap(), this.pageContext)!!


    var helperClass: KClass<*> = anyType!!::class!!


    var method: Method = helperClass!!.getMethod("viewSummary", 
                            null)!!


    var result: String = method.invoke(anyType, 
                            null) as String

pageContext!!.getOut()!!.print(result)
} catch(e: LicensingException)
            {



                            throw e
}
 catch(e: Exception)
            {

    var error: String = "Failed to View Summary"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "viewSummary()", e)

                                    }
                                

        try {
            pageContext!!.getOut()!!.print(error +"<br>")
pageContext!!.getOut()!!.print("Exception: " +e +"<br>")
} catch(e2: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.LICENSINGERROR))
                        
                                    {
                                    logUtil!!.put("Exception in Exception Handling", this, "viewSummary())", e)

                                    }
                                
}

}

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
                                    
    
                        if(this.getCommand()!!.compareTo(org.allbinary.globals.GLOBALS2.SEARCH) == 0)
                        
                                    {
                                    this.setName("Basic Search Inventory View")
this.setObjectFile("views.generic.inventory.AutoSearchValidationInventoryView")
this.search()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return EVAL_BODY_INCLUDE

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(org.allbinary.globals.GLOBALS2.VIEWSUMMARY) == 0)
                        
                                    {
                                    this.setName("Basic Inventory View")
this.setObjectFile("views.generic.inventory.AutoValidationInventoryView")
this.viewSummary()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return EVAL_BODY_INCLUDE

                                    }
                                
                             else 
    
                        if(this.getCommand()!!.compareTo(org.allbinary.globals.GLOBALS2.VIEW) == 0)
                        
                                    {
                                    this.setName("Basic Inventory View")
this.setObjectFile("views.generic.inventory.AutoValidationInventoryView")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.doStartTag()

                                    }
                                
                        else {
                            


                            throw Exception("No Such View Command: " +this.getCommand())

                        }
                            

                                    }
                                



                            throw Exception("Command Null")
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
                
            

