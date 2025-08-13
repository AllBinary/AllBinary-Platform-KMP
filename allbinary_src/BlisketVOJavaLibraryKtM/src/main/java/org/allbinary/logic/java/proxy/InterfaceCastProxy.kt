
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
        package org.allbinary.logic.java.proxy



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.lang.reflect.Method
import java.lang.reflect.Proxy

open public class InterfaceCastProxy
            : Object
        
                , java.lang.reflect.InvocationHandler {
        

        companion object {
            
open fun newInstance(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Any{

                    var anyType = anyType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Proxy.newProxyInstance(anyType!!::class.java.classLoader, anyType!!::class.getInterfaces(), InterfaceCastProxy(anyType))
}


        }
            
    private var anyType: Any
private constructor        (anyType: Any)
            : super()
        {

                    var anyType = anyType
this.anyType= anyType
}


                @Throws(Throwable::class)
            
open fun invoke(proxyObject: Any, proxyMethod: Method, proxyArgs: Array<Any?>)
        //nullable = true from not(false or (false and false)) = true
: Any{

                    var proxyObject = proxyObject


                    var proxyMethod = proxyMethod


                    var proxyArgs = proxyArgs

    var methodName: String = proxyMethod!!.getName()!!
            


    var realMethod: Method = this.anyType!!.::class.getMethod(methodName, proxyMethod!!.getParameterTypes())!!
            


    
                        if(!realMethod!!.isAccessible())
                        realMethod!!.setAccessible(true)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return proxyMethod!!.invoke(this.anyType, proxyArgs)
}


}
                
            

