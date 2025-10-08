
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
        package org.allbinary.business.user.modules.admin.store.web.view.editor




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.business.user.UserFactoryInterface
import org.allbinary.business.user.UserInterface

open public class ViewEditorWebStoreAdminUserFactory
            : Object
        
                , UserFactoryInterface {
        
public constructor ()
            : super()
        {
}


                @Throws(Exception::class)
            
    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: UserInterface{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ViewEditorWebStoreAdminUser()
}


                @Throws(Exception::class)
            
    open fun getInstance(hashMap: HashMap<Any, Any>)
        //nullable =  from not(true or (false and false)) = 
: UserInterface{
var hashMap = hashMap



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ViewEditorWebStoreAdminUser(hashMap)
}


}
                
            

