
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
        package org.allbinary.logic




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Hashtable
import java.util.Stack
//NoPlatform
expect open public class StdUtil
            : Object
         {
        
/*actual*/ companion object {
            
    //private val instance: StdUtil
    /*actual*/ open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: StdUtil

        }
            
    /*actual*/ val NULL_TABLE: Hashtable<Any, Any>
    open fun createStack()
        //nullable = true from not(false or (false and true)) = true
: Stack<Any>

    open fun createHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>

    open fun createHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>

}
                
            

