
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
        
import java.util.Stack
import jsinterop.annotations.JsType

open public class ABStack<E> : Stack<E> {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    override fun push(item: E)
        //nullable = true from not(false or (false and false)) = true
: E{
var item = item



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.push(item)
}


    override fun pop()
        //nullable = true from not(false or (false and true)) = true
: E{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.pop()
}


    override fun peek()
        //nullable = true from not(false or (false and true)) = true
: E{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.peek()
}


    override fun empty()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.empty()
}


    override fun search(obj: Any)
        //nullable = true from not(false or (false and false)) = true
: Int{
var obj = obj



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.search(obj)
}


    override fun removeElement(obj: Any)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var obj = obj



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.removeElement(obj)
}


}
                
            

