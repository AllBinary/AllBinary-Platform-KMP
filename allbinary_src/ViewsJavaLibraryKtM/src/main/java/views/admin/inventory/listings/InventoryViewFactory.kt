
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
        package views.admin.inventory.listings



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.search.SearchRequest
import org.allbinary.logic.system.security.licensing.LicensingException
import org.allbinary.string.CommonStrings
import views.generic.inventory.InventorySearch

open public class InventoryViewFactory
            : Object
         {
        

        companion object {


                @Throws(LicensingException::class)
            
open fun getInstance(searchRequest: SearchRequest)
        //nullable =  from not(true or (false and false)) = 
: InventoryViewSearchInterface{

                    var searchRequest = searchRequest

    var logUtil: LogUtil = LogUtil.getInstance()!!
            


        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return InventorySearch(searchRequest)
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORYERROR))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, 
                            "InventoryViewFactory", 
                            "getInstance(SearchRequest)", e)

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
                
            

