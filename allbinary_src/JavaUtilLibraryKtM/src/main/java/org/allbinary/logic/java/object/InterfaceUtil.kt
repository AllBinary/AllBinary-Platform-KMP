
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker

open public class InterfaceUtil
            : Object
         {
        

        companion object {
            
open fun viewAll(myClass: KClass<*>, lineBreak: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var myClass = myClass


                    var lineBreak = lineBreak

    var stringBuffer: StringMaker = StringMaker()


    var interfaces: Array<KClass<*>?> = myClass!!.getInterfaces()!!
            

stringBuffer!!.append(lineBreak)
stringBuffer!!.append(
                            "Interfaces: ")
stringBuffer!!.append(lineBreak)




                        for (index in 0 until interfaces.size)


        {stringBuffer!!.append(
                            "Interface: ")
stringBuffer!!.append(interfaces[index]!!.getName())
stringBuffer!!.append(lineBreak)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun ::class(interfaceName: String, interfaces: Array<KClass<*>?>)
        //nullable = true from not(false or (false and false)) = true
: KClass<*>{

                    var interfaceName = interfaceName


                    var interfaces = interfaces

    
                        if(interfaceName != 
                                    null
                                 && interfaces != 
                                    null
                                 && interfaces.size > 0)
                        
                                    {
                                    



                        for (index in 0 until interfaces.size)


        {
    
                        if(interfaces[index]!!.getName()!!.indexOf(interfaceName) >= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return interfaces[index]!!

                                    }
                                
}


                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun isImplemented(clazz: KClass<*>, anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var clazz = clazz


                    var anyType = anyType

    var classes: Array<KClass<*>?> = anyType!!::class.getInterfaces()!!
            





                        for (index in 0 until classes.size)


        {
    
                        if(clazz.
                                            qualifiedName!!.compareTo(classes[index]!!.getName()) == 0)
                        


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun isImplemented(className: String, anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var className = className


                    var anyType = anyType

    var classes: Array<KClass<*>?> = anyType!!::class.getInterfaces()!!
            





                        for (index in 0 until classes.size)


        {
    
                        if(classes[index]!!.getName()!!.indexOf(className) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun isImplementedView(clazz: KClass<*>, anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var clazz = clazz


                    var anyType = anyType

    var stringBuffer: StringMaker = StringMaker()


    var classes: Array<KClass<*>?> = anyType!!::class.getInterfaces()!!
            

stringBuffer!!.append(
                            "isImplementedView: \n")




                        for (index in 0 until classes.size)


        {stringBuffer!!.append(clazz.qualifiedName!!)
stringBuffer!!.append(
                            " should be = ")
stringBuffer!!.append(classes[index]!!.getName())
stringBuffer!!.append(classes[index]!!.getName())
stringBuffer!!.append(
                            "\n")
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


        }
            private constructor        ()
            : super()
        {}


}
                
            

