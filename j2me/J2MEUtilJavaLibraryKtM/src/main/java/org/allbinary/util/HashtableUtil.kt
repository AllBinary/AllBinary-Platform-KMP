
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Enumeration
import java.util.Hashtable
import org.allbinary.logic.NullUtil

open public class HashtableUtil
            : Object
         {
        
companion object {
            
    private val instance: HashtableUtil = HashtableUtil()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: HashtableUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return HashtableUtil.instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val enumerationUtil: EnumerationUtil = EnumerationUtil.getInstance()!!

    open fun putAll(fromHashtable: Hashtable<Any, Any>, hashtable: Hashtable<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{
    //var fromHashtable = fromHashtable
    //var hashtable = hashtable

    var enumeration: Enumeration<Any?> = fromHashtable!!.keys()!!


    var keyCanBeNull: Any?


    var valueCanBeNull: Any?


        while(this.enumerationUtil!!.hasMoreElements(enumeration))
        {
keyCanBeNull= this.enumerationUtil!!.nextElement(enumeration)!!
valueCanBeNull= hashtable.get(keyCanBeNull as Object)

    
                        if(valueCanBeNull == 
                                    null
                                )
                        
                                    {
                                    
                                    }
                                
                        else {
                            hashtable.put(keyCanBeNull, valueCanBeNull)

                        }
                            
}

}


    open fun getKeysAsArray(hashtable: Hashtable<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
: Array<Any?>{
    //var hashtable = hashtable

    var objectArray: Array<Any?> = arrayOfNulls(hashtable.size)


    var index: Int = 0


    var enumeration: Enumeration<Any?> = hashtable.keys()!!


        while(this.enumerationUtil!!.hasMoreElements(enumeration))
        {
objectArray[index++]= this.enumerationUtil!!.nextElement(enumeration)!!
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return objectArray
}


    open fun getKeysAsList(hashtable: Hashtable<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{
    //var hashtable = hashtable

    var list: BasicArrayList = BasicArrayListS(hashtable.size)


    var enumeration: Enumeration<Any?> = hashtable.keys()!!


        while(this.enumerationUtil!!.hasMoreElements(enumeration))
        {
list.add(this.enumerationUtil!!.nextElement(enumeration)!!)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
}


}
                
            

