
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
        package org.allbinary.data.tables.user.commerce.money.payment.gateway




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class PaymentGatewayEntityFactory
            : Object
         {
        

        companion object {
            
                @Throws(Exception::class)
            
open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PaymentGatewayEntity{
    var logUtil: LogUtil = LogUtil.getInstance()!!
            


        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return org.allbinary.data.tables.user.commerce.money.payment.gateway.PaymentGatewayEntity()
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.ENTITYFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, "PaymentGatewayEntityFactory", commonStrings!!.GET_INSTANCE, e)

                                    }
                                



                            throw e
}

}


        }
            private constructor        ()
            : super()
        {}


}
                
            

