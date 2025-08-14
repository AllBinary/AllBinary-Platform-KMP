
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
        package org.allbinary.logic.communication.smtp.queue




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.mail.Transport
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.smtp.EmailInterface
import org.allbinary.logic.util.queue.BasicQueue

open public class BasicEmailQueue : BasicQueue
                , EmailQueueInterface {
        

        companion object {
            
    private val instance: BasicEmailQueue = BasicEmailQueue()

    private var basicEmailQueue: BasicEmailQueue

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BasicEmailQueue{
    
                        if(BasicEmailQueue.basicEmailQueue == 
                                    null
                                )
                        
                                    {
                                    BasicEmailQueue.basicEmailQueue= BasicEmailQueue()

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasicEmailQueue.basicEmailQueue
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            
private constructor        (){}


                @Throws(Exception::class)
            
open fun offer(emailInterface: EmailInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var emailInterface = emailInterface
this.offer(emailInterface as Object)
this.post(emailInterface)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


open fun remove(emailInterface: EmailInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var emailInterface = emailInterface
this.remove(emailInterface as Object)
}


open fun remove()
        //nullable = true from not(false or (false and true)) = true
: EmailInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(Exception::class)
            
open fun post(emailInterface: EmailInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var emailInterface = emailInterface

    
                        if(this.send(emailInterface))
                        
                                    {
                                    this.remove(emailInterface)
processAllUnsent()

                                    }
                                
}


                @Throws(Exception::class)
            
open fun processAllUnsent()
        //nullable = true from not(false or (false and true)) = true
{
    var size: Int = queueVector!!.size()!!
            





                        for (index in 0 until size)


        {
    var emailInterface: EmailInterface = queueVector!!.get(index) as EmailInterface


    
                        if(this.send(emailInterface))
                        
                                    {
                                    this.remove(emailInterface)
processAllUnsent()

                                    }
                                
}

}


open fun send(emailInterface: EmailInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var emailInterface = emailInterface

        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    logUtil!!.put("Sending: " +emailInterface!!.log(), this, 
                            "send")

                                    }
                                
Transport.send(emailInterface!!.getMimeMessage())

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    logUtil!!.put("Email Send Debug: " +emailInterface!!.getDebugInfo(), this, 
                            "send")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.EMAILLOGGING))
                        
                                    {
                                    logUtil!!.put("Failed Email Send Debug: " +emailInterface!!.getDebugInfo(), this, 
                            "send", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


}
                
            

