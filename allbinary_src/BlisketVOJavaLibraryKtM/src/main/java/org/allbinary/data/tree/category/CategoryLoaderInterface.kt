
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
        
import org.allbinary.business.category.CategoryInterface
import org.w3c.dom.Document
interface CategoryLoaderInterface : CategoryModifierTreeInterface {
        

open fun getDoc(categoryInterface: CategoryInterface)
        //nullable = true from not(false or (false and false)) = true
: Document

open fun get(categoryInterface: CategoryInterface)
        //nullable = true from not(false or (false and false)) = true
: CategoryInterface

open fun getAll(categoryInterface: CategoryInterface)
        //nullable = true from not(false or (false and false)) = true
: CategoryInterface

}
                
            

