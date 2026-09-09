
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
        
import org.allbinary.util.ABHashMap
import org.allbinary.util.ABHashtable
import org.allbinary.util.ABStack
import org.allbinary.util.ABVector
//ActualPlatform
/*actual*/ open public class StdUtil
            : Object
         {
        
/*actual*/ companion object {
            
    private val instance: StdUtil = StdUtil()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: StdUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StdUtil.instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    /*actual*/ val EMPTY_VECTOR: ABVector<Any> = this.createVector()!!

    /*actual*/ val NULL_TABLE: ABHashtable<Any, Any> = this.createHashtable()!!

    /*actual*/ val NULL_MAP: ABHashMap<Any, Any> = this.createHashMap()!!

    open fun createStack()
        //nullable = true from not(false or (false and true)) = true
: ABStack<Any>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ABStack<Any>()
}


    open fun createVector()
        //nullable = true from not(false or (false and true)) = true
: ABVector<Any>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ABVector<Any>()
}


    open fun createHashtable()
        //nullable = true from not(false or (false and true)) = true
: ABHashtable<Any, Any>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ABHashtable<Any, Any>()
}


    open fun createHashMap()
        //nullable = true from not(false or (false and true)) = true
: ABHashMap<Any, Any>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ABHashMap<Any, Any>()
}


}
                
            

