
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
        package org.allbinary.logic.java.anyType




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.lang.reflect.Method
import org.allbinary.logic.string.StringMaker

open public class MethodUtil
            : Object
         {
        
companion object {
            
    open fun viewAll(myClass: KClass<*>, lineBreak: String)
        //nullable = true from not(false or (false and false)) = true
: String{
var myClass = myClass
var lineBreak = lineBreak

    var stringBuffer: StringMaker = StringMaker()


    var method: Array<Method?> = myClass!!.getMethods()!!

stringBuffer!!.append("Methods: ")
stringBuffer!!.append(lineBreak)




                        for (index in 0 until method.size)

        {
stringBuffer!!.append(method[index]!!.getReturnType()!!.getName())
stringBuffer!!.append(" ")
stringBuffer!!.append(method[index]!!.getName())
stringBuffer!!.append("(")
ParamsUtil.viewParams(method[index]!!.getParameterTypes())
stringBuffer!!.append(")")
stringBuffer!!.append(lineBreak)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


        }
            private constructor ()
            : super()
        {
}


}
                
            

