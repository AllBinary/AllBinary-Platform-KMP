
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
import java.util.HashMap
import javax.servlet.jsp.JspTagException
import admin.taghelpers.BasketHelperFactory
import admin.taghelpers.BasketRequestHelperFactory
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.user.commerce.inventory.basket.BasketData
import org.allbinary.logic.communication.http.request.AbResponseHandler
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.security.licensing.LicensingException
import tags.CustomTagSupport

open public class BasketTag : CustomTagSupport {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var command: String

    private var storeName: String

    private var propertiesHashMap: HashMap<Any, Any>
public constructor        (){}


open fun setCommand(command: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var command = command
this.command= command
}


open fun setStoreName(value: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var value = value
this.storeName= value
}


                @Throws(LicensingException::class)
            
open fun isBasketEmpty()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var anyType: Any = BasketHelperFactory().
                            getInstance(this.propertiesHashMap, this.pageContext)!!
            


    var method: Method = anyType!!::class.getMethod("isBasketEmpty", 
                            null)!!
            


    var emptyBoolean: Boolean = method.invoke(anyType, 
                            null) as Boolean




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return emptyBoolean
} catch(e: LicensingException)
            {


                            throw e
}
 catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "isBasketEmpty()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}

}


                @Throws(LicensingException::class)
            
open fun addItemToBasket()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var anyType: Any = BasketRequestHelperFactory().
                            getInstance(this.propertiesHashMap, this.pageContext)!!
            


    var method: Method = anyType!!::class.getMethod("addItemToBasket", 
                            null)!!
            


    var emptyBoolean: Boolean = method.invoke(anyType, 
                            null) as Boolean




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return emptyBoolean
} catch(e: LicensingException)
            {


                            throw e
}
 catch(e: Exception)
            {
    var error: String = "Failed to add item from Basket"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "addItemToBasket()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


                @Throws(LicensingException::class)
            
open fun removeItemFromBasket()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var anyType: Any = BasketRequestHelperFactory().
                            getInstance(this.propertiesHashMap, this.pageContext)!!
            


    var method: Method = anyType!!::class.getMethod("removeItemFromBasket", 
                            null)!!
            


    var emptyBoolean: Boolean = method.invoke(anyType, 
                            null) as Boolean




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return emptyBoolean
} catch(e: LicensingException)
            {


                            throw e
}
 catch(e: Exception)
            {
    var error: String = "Failed to remove item from Basket"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "removeItemFromBasket()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


                @Throws(LicensingException::class)
            
open fun adjustBasket()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var anyType: Any = BasketRequestHelperFactory().
                            getInstance(this.propertiesHashMap, this.pageContext)!!
            


    var method: Method = anyType!!::class.getMethod("adjustBasket", 
                            null)!!
            


    var emptyBoolean: Boolean = method.invoke(anyType, 
                            null) as Boolean




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return emptyBoolean
} catch(e: LicensingException)
            {


                            throw e
}
 catch(e: Exception)
            {
    var error: String = "Failed to Adjust Basket"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "adjustBasket()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


                @Throws(JspTagException::class)
            
open fun doStartTag()
        //nullable = true from not(false or (false and true)) = true
: Int{
        try {
            
    
                        if(command != 
                                    null
                                )
                        
                                    {
                                    this.propertiesHashMap= HashMap<Any, Any>()
this.propertiesHashMap!!.put(StoreFrontData.getInstance()!!.NAME, this.storeName)

    
                        if(command.compareTo(BasketData.INSERT) == 0)
                        
                                    {
                                    
    
                        if(!this.addItemToBasket())
                        
                                    {
                                    this.pageContext!!.getOut()!!.println("Item is not currently being sold.<p/>")

                                    }
                                

                                    }
                                
                             else 
    
                        if(command.compareTo(BasketData.DELETE) == 0)
                        
                                    {
                                    this.removeItemFromBasket()

                                    }
                                
                             else 
    
                        if(command.compareTo(BasketData.ADJUST) == 0)
                        
                                    {
                                    this.adjustBasket()

                                    }
                                
                             else 
    
                        if(command.compareTo(BasketData.ISEMPTY) == 0)
                        
                                    {
                                    
    
                        if(this.isBasketEmpty())
                        


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.EVAL_BODY_INCLUDE
                             else 
    
                        if()
                        

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
                
            

