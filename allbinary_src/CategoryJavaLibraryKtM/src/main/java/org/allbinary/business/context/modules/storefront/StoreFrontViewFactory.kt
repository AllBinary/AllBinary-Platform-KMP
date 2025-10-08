
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
        package org.allbinary.business.context.modules.storefront




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.data.tables.context.module.storefronts.StoreFrontsEntity
import org.allbinary.data.tables.context.module.storefronts.StoreFrontsEntityFactory
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class StoreFrontViewFactory
            : Object
         {
        
companion object {
            
    open fun getInstance(storeName: String)
        //nullable =  from not(true or (false and false)) = 
: DomNodeInterface{
var storeName = storeName

    var logUtil: LogUtil = LogUtil.getInstance()!!


        try {
            
    var storeFronts: StoreFrontsEntity = StoreFrontsEntityFactory.getInstance()!!.getStoreFrontsEntityInstance()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StoreFrontView(storeFronts!!.getStoreFrontInterface(storeName)) as DomNodeInterface
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.FACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, "StoreFrontFactory", commonStrings!!.GET_INSTANCE, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
private constructor ()
            : super()
        {
}


}
                
            

