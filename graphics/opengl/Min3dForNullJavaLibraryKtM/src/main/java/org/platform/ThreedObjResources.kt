
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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
        package org.platform




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable

open public class ThreedObjResources
            : Object
         {
        

        companion object {
            
    private val instance: ThreedObjResources = ThreedObjResources()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ThreedObjResources{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val hashtable: Hashtable<Any, Any> = Hashtable<Any, Any>()

open fun get(resourceName: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var resourceName = resourceName

    var resourceName2: String = this.hashtable.get(resourceName as Object) as String


    
                        if(resourceName2 != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return resourceName2

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return resourceName
}


}
                
            

