
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
        
import java.util.Hashtable
import java.util.Vector

/*actual*/ open public class NullUtil
            : Object
         {
        
/*actual*/ companion object {
            
    private val instance: NullUtil = NullUtil()

    /*actual*/ open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: NullUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    /*actual*/ val NULL_OBJECT: Any = Any()

    /*actual*/ val NULL_CLASS: KClass<*> = NULL_OBJECT::class!!

    /*actual*/ val NULL_OBJECT_ARRAY: Array<Any?> = arrayOfNulls(0)

    /*actual*/ val NULL_CHAR_ARRAY: CharArray = 
                                                        
                                                        CharArray(0)
                                                    

    /*actual*/ val NULL_BYTE_ARRAY: ByteArray = ByteArray(0)

    /*actual*/ val NULL_SHORT_ARRAY_ARRAY: Array<ShortArray?> = Array(0) { ShortArray(0) }

    /*actual*/ val NULL_INT_ARRAY: IntArray = IntArray(0)

    /*actual*/ val NULL_INT_ARRAY_ARRAY: Array<IntArray?> = Array(0) { IntArray(0) }

    /*actual*/ val NULL_INT_ARRAY_ARRAY_ARRAY: Array<Array<IntArray?>?> = Array(0) { Array(0) { IntArray(0) } }

    /*actual*/ val NULL_FLOAT_ARRAY: FloatArray = FloatArray(0)

    /*actual*/ val EMPTY_VECTOR: Vector<Any> = Vector<Any>()

    /*actual*/ val NULL_TABLE: Hashtable<Any, Any> = Hashtable<Any, Any>()

}
                
            

