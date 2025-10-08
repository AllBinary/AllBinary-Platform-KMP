
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
        package org.allbinary.business.user.modules.admin.store.payment




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.business.user.modules.User
import org.allbinary.logic.communication.http.request.session.WeblisketSessionInterface

open public class PaymentStoreAdminUser : User {
        
public constructor ()                        

                            : super(){


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor (userHashMap: HashMap<Any, Any>)                        

                            : super(userHashMap){
var userHashMap = userHashMap


                            //For kotlin this is before the body of the constructor.
                    
}


    open fun validateSession(weblisketSession: WeblisketSessionInterface)
        //nullable = true from not(false or (false and false)) = true
{
var weblisketSession = weblisketSession
super.validateSession(weblisketSession)
this.updateSession(weblisketSession)
}


    open fun updateSession(weblisketSession: WeblisketSessionInterface)
        //nullable = true from not(false or (false and false)) = true
{
var weblisketSession = weblisketSession
weblisketSession!!.setStoreName(this.getPermissions())
}


}
                
            

