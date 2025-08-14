
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
        

open public class EmailQueueFactory
            : Object
         {
        

        companion object {
            
    private var emailQueueInterface: EmailQueueInterface = BasicEmailQueue.getInstance() as EmailQueueInterface

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: EmailQueueInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return emailQueueInterface
}


        }
            private constructor        ()
            : super()
        {}


}
                
            

