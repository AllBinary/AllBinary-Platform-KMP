
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
        
interface InventoryViewSearchInterface {
        

                @Throws(Exception::class)
            
open fun searchSingleStaticPage()
        //nullable = true from not(false or (false and true)) = true
: String

                @Throws(Exception::class)
            
open fun searchSingleDynamicPage()
        //nullable = true from not(false or (false and true)) = true
: String

                @Throws(Exception::class)
            
open fun search()
        //nullable = true from not(false or (false and true)) = true
: Array<String?>

                @Throws(Exception::class)
            
open fun getProduct(product: String)
        //nullable = true from not(false or (false and false)) = true
: String

}
                
            

