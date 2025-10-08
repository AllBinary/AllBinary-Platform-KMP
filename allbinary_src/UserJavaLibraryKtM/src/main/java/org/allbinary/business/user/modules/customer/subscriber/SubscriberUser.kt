
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
        package org.allbinary.business.user.modules.customer.subscriber




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.business.user.modules.User
import org.allbinary.business.user.subscription.Subscription
import org.allbinary.logic.communication.http.request.session.WeblisketSessionInterface

open public class SubscriberUser : User {
        

    private var subscription: Subscription
public constructor ()                        

                            : super(){


                            //For kotlin this is before the body of the constructor.
                    
this.subscription= Subscription()
}

public constructor (userHashMap: HashMap<Any, Any>)                        

                            : super(userHashMap){
var userHashMap = userHashMap


                            //For kotlin this is before the body of the constructor.
                    
this.subscription= Subscription()
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


    open fun isSessionValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.subscription.isSubscribed()
}


}
                
            

