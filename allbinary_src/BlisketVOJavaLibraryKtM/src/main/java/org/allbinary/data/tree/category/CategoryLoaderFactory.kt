
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
        package org.allbinary.data.tree.category




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.category.CategoryFactoryInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class CategoryLoaderFactory
            : Object
         {
        

        companion object {
            
open fun getInstance(categoryFactoryInterface: CategoryFactoryInterface)
        //nullable =  from not(true or (false and false)) = 
: CategoryLoaderInterface{
var categoryFactoryInterface = categoryFactoryInterface

    var logUtil: LogUtil = LogUtil.getInstance()!!


        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CategoryLoader(categoryFactoryInterface)
} catch(e: Exception)
            {

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.ENTITYFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, "CategoryNodeFactory", commonStrings!!.GET_INSTANCE, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


        }
            private constructor        ()
            : super()
        {
}


}
                
            

