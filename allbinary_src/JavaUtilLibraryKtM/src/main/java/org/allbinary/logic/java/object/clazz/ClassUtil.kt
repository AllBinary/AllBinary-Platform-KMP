
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
        package org.allbinary.logic.java.anyType.clazz




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.java.anyType.ConstructorUtil
import org.allbinary.logic.java.anyType.InterfaceUtil
import org.allbinary.logic.java.anyType.MethodUtil
import org.allbinary.logic.string.StringMaker

open public class ClassUtil
            : Object
         {
        

        companion object {
            
open fun viewAll(anyType: Any, lineBreak: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var anyType = anyType


                    var lineBreak = lineBreak

    
                        if(anyType != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ClassUtil.viewAll(anyType!!::class, lineBreak)

                                    }
                                
                             else 
    
                        if()
                        
}


open fun viewAll(myClass: KClass<*>, lineBreak: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var myClass = myClass


                    var lineBreak = lineBreak

    
                        if(myClass != 
                                    null
                                )
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()


    var classes: Array<KClass<*>?> = myClass!!.getClasses()!!
            

stringBuffer!!.append(lineBreak)
stringBuffer!!.append(
                            "Class: ")
stringBuffer!!.append(myClass!!.getName())
stringBuffer!!.append(
                            " uses ")
stringBuffer!!.append(classes.size)
stringBuffer!!.append(
                            " other classes")
stringBuffer!!.append(lineBreak)
stringBuffer!!.append(lineBreak)
stringBuffer!!.append(
                            "Classes: ")
stringBuffer!!.append(lineBreak)




                        for (index in 0 until classes.size)


        {stringBuffer!!.append(
                            "Class: ")
stringBuffer!!.append(classes[index]!!.getName())
stringBuffer!!.append(lineBreak)
}

stringBuffer!!.append(InterfaceUtil.viewAll(myClass, lineBreak))
stringBuffer!!.append(lineBreak)
stringBuffer!!.append(ConstructorUtil.viewAll(myClass, lineBreak))
stringBuffer!!.append(lineBreak)
stringBuffer!!.append(MethodUtil.viewAll(myClass, lineBreak))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()

                                    }
                                
                             else 
    
                        if()
                        
}


        }
            private constructor        ()
            : super()
        {}


}
                
            

