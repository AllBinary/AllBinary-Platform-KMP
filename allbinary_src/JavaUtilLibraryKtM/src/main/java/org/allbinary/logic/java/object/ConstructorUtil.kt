
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
        
import java.lang.reflect.Constructor
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonSeps

open public class ConstructorUtil
            : Object
         {
        

        companion object {
            
open fun viewAll(myClass: KClass<*>, lineBreak: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var myClass = myClass


                    var lineBreak = lineBreak

    var stringBuffer: StringMaker = StringMaker()


    var constructor: Array<Constructor?> = myClass!!.getConstructors()!!
            

stringBuffer!!.append(
                            "Constructors: ")
stringBuffer!!.append(lineBreak)




                        for (index in 0 until constructor.size)


        {stringBuffer!!.append(ConstructorUtil.view(constructor[index]!!, lineBreak))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun view(constructor: Constructor, lineBreak: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var constructor = constructor


                    var lineBreak = lineBreak

    
                        if(constructor != 
                                    null
                                )
                        
                                    {
                                    
    var commonSeps: CommonSeps = CommonSeps.getInstance()!!
            


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(constructor.getName())

    var classes: Array<KClass<*>?> = constructor.getParameterTypes()!!
            





                        for (index in 0 until classes.size)


        {stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(classes[index]!!.getName())
stringBuffer!!.append(commonSeps!!.COLON)
stringBuffer!!.append(index)
}

stringBuffer!!.append(lineBreak)



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
                
            

