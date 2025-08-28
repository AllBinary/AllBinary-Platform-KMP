
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
        package org.allbinary.business.user.commerce.money.payment.types




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class AuthorizationTypeFactory
            : Object
         {
        

        companion object {
            
    private val instance: AuthorizationTypeFactory = AuthorizationTypeFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AuthorizationTypeFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val NONE: AuthorizationType = AuthorizationType("None")

    val VOICE: AuthorizationType = AuthorizationType("Voice")

    val RETINAL: AuthorizationType = AuthorizationType("Retinal")

    val IMAGE: AuthorizationType = AuthorizationType("Image")

    val DNA: AuthorizationType = AuthorizationType("DNA")

    val PRINT: AuthorizationType = AuthorizationType("Print")

    val CHIP: AuthorizationType = AuthorizationType("Chip")

}
                
            

