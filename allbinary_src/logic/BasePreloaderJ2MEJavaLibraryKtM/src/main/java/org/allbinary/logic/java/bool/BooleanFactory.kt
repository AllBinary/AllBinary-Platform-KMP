
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
        package org.allbinary.logic.java.bool




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class BooleanFactory
            : Object
         {
        

        companion object {
            
    private val instance: BooleanFactory = BooleanFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BooleanFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val TRUE: Boolean = true

    val FALSE: Boolean = false

    val TRUE_STRING: String = TRUE.toString()!!

    val FALSE_STRING: String = FALSE.toString()!!

    val YES: String = "yes"

    val NO: String = "no"

open fun toString(bool: Boolean)
        //nullable = true from not(false or (true and false)) = true
: String{

                    var bool = bool

    
                        if(bool)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TRUE_STRING

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return FALSE_STRING

                        }
                            
}


}
                
            

