
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class StoreFrontsData
            : Object
         {
        

        companion object {


    private val instance: StoreFrontsData = StoreFrontsData()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: StoreFrontsData{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val TYPE: String = "STOREFRONTS_TYPE"

    val RETAIL: String = "STOREFRONTS_RETAIL"

    val SUBSCRIPTION: String = "STOREFRONTS_SUBSCRIPTION"

    val AUCTION: String = "STOREFRONTS_AUCTION"

    val NEWS: String = "STOREFRONTS_NEWS"

    val BLOG: String = "STOREFRONTS_BLOG"

    val FORUM: String = "STOREFRONTS_FORUM"

}
                
            

