
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
        package admin.taghelpers



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.PageContext
import org.allbinary.business.context.modules.storefront.StoreFront
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.user.commerce.inventory.basket.BasketData
import org.allbinary.business.user.commerce.inventory.basket.BasketInterface
import org.allbinary.business.user.commerce.inventory.item.BasicItemData
import org.allbinary.data.tables.user.commerce.inventory.item.InventoryEntityFactory
import org.allbinary.logic.communication.http.request.session.WeblisketSession
import org.allbinary.logic.communication.log.LogUtil

open public class BasketRequestHelper : TagHelper {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val weblisketSession: WeblisketSession

    private val storeFrontInterface: StoreFrontInterface

    private val propertiesHashMap: HashMap<Any, Any>

    private val pageContext: PageContext

    private val request: HttpServletRequest

    private var id: String

    private var num: String

    private val MAX: Int = 200
public constructor        (propertiesHashMap: HashMap<Any, Any>, pageContext: PageContext){

                    var propertiesHashMap = propertiesHashMap


                    var pageContext = pageContext
this.propertiesHashMap= propertiesHashMap
this.pageContext= pageContext
this.request= pageContext!!.getRequest() as HttpServletRequest

    var storeName: String = propertiesHashMap!!.get(StoreFrontData.getInstance()!!.NAME) as String


    
                        if(storeName != 
                                    null
                                )
                        
                                    {
                                    this.storeFrontInterface= StoreFrontFactory.getInstance(storeName)

                                    }
                                
                        else {
                            this.storeFrontInterface= StoreFront()

                        }
                            
this.weblisketSession= WeblisketSession(propertiesHashMap, pageContext)
this.getFormData()
}


open fun getFormData()
        //nullable = true from not(false or (false and true)) = true
{this.id= request!!.getParameter(BasicItemData.ID)
this.num= request!!.getParameter(BasketData.ITEMTOTALINBASKET)
}


open fun addItemToBasket()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    
                        if(id != 
                                    null
                                 && num != 
                                    null
                                )
                        
                                    {
                                    
    var basket: BasketInterface = this.weblisketSession!!.getOrder()!!.getBasket()!!
            


    
                        if(InventoryEntityFactory.getInstance()!!.getInventoryEntityInstance()!!.getItem(id) == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                
basket!!.addItem(id, num)

                                    }
                                

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(
                            "Successfully added item to Basket", this, 
                            "addItemToBasket()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "addItemToBasket()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


open fun removeItemFromBasket()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    
                        if(id != 
                                    null
                                )
                        
                                    {
                                    
    var basket: BasketInterface = this.weblisketSession!!.getOrder()!!.getBasket()!!
            

basket!!.removeItem(id)

                                    }
                                

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(
                            "Successfully removed item from Basket", this, 
                            "removeItemFromBasket()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "removeItemFromBasket()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


open fun adjustBasket()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var basket: BasketInterface = this.weblisketSession!!.getOrder()!!.getBasket()!!
            


    
                        if(id != 
                                    null
                                 && num != 
                                    null
                                )
                        basket!!.adjustItem(id, num)

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLTAGS))
                        
                                    {
                                    logUtil!!.put(
                            "Successfull Adjusted Basket", this, 
                            "adjustBasket()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "adjustBasket()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


}
                
            

