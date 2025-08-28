
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
        package org.allbinary.logic.communication.smtp.event.handler




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.logic.communication.smtp.event.EmailEvent
import org.allbinary.logic.communication.smtp.event.UserEmailEventListenerInterface
import org.allbinary.logic.communication.smtp.event.UserEmailEventNameData
import org.allbinary.logic.communication.smtp.info.EmailInfo

open public class UserEmailEventHandler
            : Object
         {
        

    private var emailVector: Vector

    private var emailInfo: EmailInfo

    private var userEmailEventNameData: UserEmailEventNameData
public constructor        ()
            : super()
        {
this.emailVector= Vector()
}


                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun receiveEmailInfo(userEmailEventNameData: UserEmailEventNameData, emailInfo: EmailInfo)
        //nullable = true from not(false or (false and false)) = true
{
var userEmailEventNameData = userEmailEventNameData
var emailInfo = emailInfo
this.userEmailEventNameData= userEmailEventNameData
this.emailInfo= emailInfo
this.fireEmailEvent()
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun addListener(vector: Vector)
        //nullable = true from not(false or (false and false)) = true
{
var vector = vector

    var size: Int = vector.size!!





                        for (index in 0 until size)

        {

    var userEmailEventListenerInterface: UserEmailEventListenerInterface = vector.get(index) as UserEmailEventListenerInterface

this.addListener(userEmailEventListenerInterface)
}

}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun addListener(emailEventListenerInterface: UserEmailEventListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{
var emailEventListenerInterface = emailEventListenerInterface
this.emailVector!!.add(emailEventListenerInterface)
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun removeListener(emailEventListenerInterface: UserEmailEventListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{
var emailEventListenerInterface = emailEventListenerInterface
this.emailVector!!.remove(emailEventListenerInterface)
}


                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun fireEmailEvent()
        //nullable = true from not(false or (false and true)) = true
{

    var emailEvent: EmailEvent = EmailEvent(this, this.userEmailEventNameData, this.emailInfo, 0)


    var size: Int = emailVector!!.size!!





                        for (index in 0 until size)

        {

    var emailEventListenerInterface: UserEmailEventListenerInterface = emailVector!!.get(index) as UserEmailEventListenerInterface

emailEventListenerInterface!!.onEmailSendRequest(emailEvent)
}

}


}
                
            

