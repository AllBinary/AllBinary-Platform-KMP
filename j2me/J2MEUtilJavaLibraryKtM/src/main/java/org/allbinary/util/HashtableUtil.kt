
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
        package org.allbinary.util



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Enumeration
import java.util.Hashtable

open public class HashtableUtil
            : Object
         {
        

        companion object {


    private val instance: HashtableUtil = HashtableUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: HashtableUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun putAll(fromHashtable: Hashtable<Any, Any>, hashtable: Hashtable<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var fromHashtable = fromHashtable


                    var hashtable = hashtable

    var enumeration: Enumeration<Any?> = fromHashtable!!.keys()!!
            


        while(enumeration.hasMoreElements())
        {
    var key: Any = enumeration.nextElement()!!!!
            


    var value: Any = hashtable.get(key as Object?)!!
            


    
                        if(value == 
                                    null
                                )
                        
                                    {
                                    
                                    }
                                
                        else {
                            hashtable.put(key, value)

                        }
                            
}

}


open fun getKeysAsArray(hashtable: Hashtable<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
: Array<Any?>{

                    var hashtable = hashtable

    var objectArray: Array<Any?> = arrayOfNulls(hashtable.size)


    var index: Int = 0


    var enumeration: Enumeration<Any?> = hashtable.keys()!!
            


        while(enumeration.hasMoreElements())
        {objectArray[index++]= enumeration.nextElement()!!
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return objectArray
}


open fun getKeysAsList(hashtable: Hashtable<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var hashtable = hashtable

    var list: BasicArrayList = BasicArrayList(hashtable.size)


    var enumeration: Enumeration<Any?> = hashtable.keys()!!
            


        while(enumeration.hasMoreElements())
        {list.add(enumeration.nextElement()!!)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
}


}
                
            

