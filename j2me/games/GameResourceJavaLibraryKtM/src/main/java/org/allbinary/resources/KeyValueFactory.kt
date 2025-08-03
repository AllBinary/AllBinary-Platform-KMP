
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
        package org.allbinary.resources



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable

open public class KeyValueFactory
            : Object
         {
        

        companion object {


    private val instance: KeyValueFactory = KeyValueFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: KeyValueFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val MAP: Hashtable<Any, Any> = Hashtable<Any, Any>()

open fun get(key: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var key = key

    var value: String = MAP.get(key as Object) as String


    
                        if(value == 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return key

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return value
}


}
                
            

