
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
        package org.allbinary.data.tables.advertisement.sales



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class AffiliateSalesEntityFactory
            : Object
         {
        

        companion object {
            
    private val CLASSNAME: String = "org.allbinary.data.tables.AffiliatesSalesEntity"

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AffiliateSalesEntityInterface{
    var logUtil: LogUtil = LogUtil.getInstance()!!
            


        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AffiliateSalesEntity() as AffiliateSalesEntityInterface
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.ENTITYFACTORYERROR))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, 
                            "AffiliateEntityFactory", commonStrings!!.GET_INSTANCE, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


        }
            private constructor        ()
            : super()
        {}


}
                
            

