
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.jsp.PageContext
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.context.modules.storefront.StoreFrontFactory
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.user.commerce.inventory.basket.BasketInterface
import org.allbinary.logic.communication.http.request.session.WeblisketSession
import org.allbinary.logic.communication.log.LogUtil

open public class BasketHelper : TagHelper {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var weblisketSession: WeblisketSession

    private var storeFrontInterface: StoreFrontInterface

    private var propertiesHashMap: HashMap<Any, Any>

    private var pageContext: PageContext

    private val MAX: Int = 200
public constructor        (hashMap: HashMap<Any, Any>, pageContext: PageContext){
var hashMap = hashMap
var pageContext = pageContext
this.propertiesHashMap= hashMap
this.pageContext= pageContext

    var storeName: String = propertiesHashMap!!.get(StoreFrontData.getInstance()!!.NAME) as String


    
                        if(storeName != 
                                    null
                                )
                        
                                    {
                                    this.storeFrontInterface= StoreFrontFactory.getInstance(storeName)

                                    }
                                
this.weblisketSession= WeblisketSession(hashMap, pageContext)
}


open fun isBasketEmpty()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

        try {
            
    var basket: BasketInterface = this.weblisketSession!!.getOrder()!!.getBasket()!!


    
                        if(basket.getNumberOfItems()!!.toInt() <= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                        }
                            
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "isBasketEmpty()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
}

}


}
                
            

