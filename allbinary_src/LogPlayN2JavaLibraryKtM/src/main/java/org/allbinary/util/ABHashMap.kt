
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2026 AllBinary 
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
        
import java.util.HashMap
import java.util.Map
import java.util.Set
import jsinterop.annotations.JsType

open public class ABHashMap<K, V> : HashMap<K, V> {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    override fun size()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.size()
}


    override fun isEmpty()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.isEmpty()
}


    override fun get(key: Any)
        //nullable = true from not(false or (false and false)) = true
: V{
var key = key



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.get(key)
}


    override fun containsKey(key: Any)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var key = key



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.containsKey(key)
}


    override fun put(key: K, value: V)
        //nullable = true from not(false or (false and false)) = true
: V{
var key = key
var value = value



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.put(key, value)
}


    override fun putAll(map: Map<
                //Otherwise - typeArguments - type - WildcardType

                //Otherwise - typeArguments - type - WildcardType
>)
        //nullable = true from not(false or (false and false)) = true
{
var map = map
super.putAll(map)
}


    override fun remove(key: Any)
        //nullable = true from not(false or (false and false)) = true
: V{
var key = key



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.remove(key)
}


    override fun clear()
        //nullable = true from not(false or (false and true)) = true
{
super.clear()
}


    override fun containsValue(value: Any)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var value = value



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.containsValue(value)
}


    override fun keySet()
        //nullable = true from not(false or (false and true)) = true
: Set<K>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.keySet()
}


    override fun entrySet()
        //nullable = true from not(false or (false and true)) = true
: Set<Entry>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.entrySet()
}


    override fun getOrDefault(key: Any, defaultValue: V)
        //nullable = true from not(false or (false and false)) = true
: V{
var key = key
var defaultValue = defaultValue



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.getOrDefault(key, defaultValue)
}


    override fun putIfAbsent(key: K, value: V)
        //nullable = true from not(false or (false and false)) = true
: V{
var key = key
var value = value



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.putIfAbsent(key, value)
}


    public override fun clone()
        //nullable = true from not(false or (false and true)) = true
: Any{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.clone()
}


}
                
            

