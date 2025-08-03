
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
        package org.allbinary.business.user.commerce.inventory.order



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.data.tables.user.commerce.inventory.order.OrderHistoryEntity
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class OrderHistoryFactory
            : Object
         {
        

        companion object {


open fun getInstance(id: String)
        //nullable =  from not(true or (false and false)) = 
: OrderHistory{

                    var id = id

    var logUtil: LogUtil = LogUtil.getInstance()!!
            


        try {
            
    var orderHistoryEntityInterface: OrderHistoryEntity = OrderHistoryEntity()




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return orderHistoryEntityInterface!!.getOrder(id) as OrderHistory
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            


    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.FACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, 
                            "OrderHistoryFactory", commonStrings!!.GET_INSTANCE, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            
private constructor        ()
            : super()
        {}


}
                
            

