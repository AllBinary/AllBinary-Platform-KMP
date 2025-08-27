
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
        package org.allbinary.graphics.color




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable

open public class BasicColorCacheFactory
            : Object
         {
        

        companion object {
            
    private val instance: BasicColorCacheFactory = BasicColorCacheFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BasicColorCacheFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private val hashtable: Hashtable<Any, Any> = Hashtable<Any, Any>()
private constructor        ()
            : super()
        {}


open fun add(basicDefaultColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{

                    var basicDefaultColor = basicDefaultColor
hashtable.put(Integer(basicDefaultColor!!.toInt()), basicDefaultColor)
}

@Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

open fun getInstance(integer: Integer)
        //nullable =  from not(true or (false and false)) = 
: BasicColor{

                    var integer = integer

    var basicColor: BasicColor = hashtable.get(integer as Object) as BasicColor


    
                        if(basicColor == 
                                    null
                                )
                        
                                    {
                                    basicColor= BasicColor(integer.toInt())
hashtable.put(integer, basicColor)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return basicColor
}


}
                
            

