
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
        package org.allbinary.data.tables.user.address.shipping




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.data.tables.user.address.StreetAddressesEntity
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class ShippingAddressesEntityFactory
            : Object
         {
        

        companion object {
            
    private val instance: ShippingAddressesEntityFactory = ShippingAddressesEntityFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ShippingAddressesEntityFactory

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
private constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


open fun getInstance(userName: String)
        //nullable =  from not(true or (false and false)) = 
: StreetAddressesEntity

        Updates for KMP build        
        {
var userName = userName

        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ShippingAddressesEntity(userName)
} catch(e: Exception)
            

        Updates for KMP build        
        {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.ENTITYFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "getShippingAddressesEntityInstance()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


}
                
            

