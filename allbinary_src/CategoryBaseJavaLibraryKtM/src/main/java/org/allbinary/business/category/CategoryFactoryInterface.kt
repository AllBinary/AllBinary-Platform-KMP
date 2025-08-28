
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
        package org.allbinary.business.category




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.logic.io.path.AbPath
import org.w3c.dom.Node
interface CategoryFactoryInterface {
        

open fun getRootInstance()
        //nullable = true from not(false or (false and true)) = true
: CategoryInterface

        Updates for KMP build        
        

open fun getRootInstance(categoryPath: AbPath)
        //nullable = true from not(false or (false and false)) = true
: CategoryInterface

        Updates for KMP build        
        

open fun getRootInstanceFromNode(node: Node)
        //nullable = true from not(false or (false and false)) = true
: CategoryInterface

        Updates for KMP build        
        

open fun getInstance(rootCategoryInterface: CategoryInterface, parentCategoryInterface: CategoryInterface, name: String)
        //nullable =  from not(true or (false and false)) = 
: CategoryInterface

        Updates for KMP build        
        

open fun getInstance(rootCategoryInterface: CategoryInterface, parentCategoryInterface: CategoryInterface, node: Node)
        //nullable =  from not(true or (false and false)) = 
: CategoryInterface

        Updates for KMP build        
        

open fun getInstance(rootCategoryInterface: CategoryInterface, parentCategoryInterface: CategoryInterface, categoryPropertiesHashMap: HashMap<Any, Any>)
        //nullable =  from not(true or (false and false)) = 
: CategoryInterface

        Updates for KMP build        
        

}
                
            

