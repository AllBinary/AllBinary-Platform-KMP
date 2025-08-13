
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
        package org.allbinary.logic.java.array



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker

open public class IntArrayUtil
            : Object
         {
        

        companion object {
            
open fun toString(array: IntArray)
        //nullable = true from not(false or (true and false)) = true
: String{

                    var array = array

    var stringBuffer: StringMaker = StringMaker()





                        for (index in 0 until array.size)


        {stringBuffer!!.append(array[index]!!)

    
                        if(index < array.size)
                        
                                    {
                                    stringBuffer!!.append(
                            ", ")

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun toString(array: Array<IntArray?>)
        //nullable = true from not(false or (true and false)) = true
: String{

                    var array = array

    var stringBuffer: StringMaker = StringMaker()





                        for (index in 0 until array.size)


        {stringBuffer!!.append(
                            "{")




                        for (index2 in 0 until array[index]!!.length)


        {stringBuffer!!.append(array[index]!![index2]!!)

    
                        if(index2 < array[index]!!.length -1)
                        
                                    {
                                    stringBuffer!!.append(
                            ", ")

                                    }
                                
}

stringBuffer!!.append(
                            "}")

    
                        if(index < array.size -1)
                        
                                    {
                                    stringBuffer!!.append(
                            ", \n")

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun toString(array: Array<Array<IntArray?>?>)
        //nullable = true from not(false or (true and false)) = true
: String{

                    var array = array

    var stringBuffer: StringMaker = StringMaker()





                        for (index in 0 until array.size)


        {stringBuffer!!.append(
                            "{")




                        for (index2 in 0 until array[index]!!.length)


        {stringBuffer!!.append(
                            "{")




                        for (index3 in 0 until array[index]!![index2]!!.length)


        {stringBuffer!!.append(array[index]!![index2]!![index3]!!)

    
                        if(index3 < array[index]!![index2]!!.length -1)
                        
                                    {
                                    stringBuffer!!.append(
                            ", ")

                                    }
                                
}

stringBuffer!!.append(
                            "}")

    
                        if(index2 < array[index]!!.length -1)
                        
                                    {
                                    stringBuffer!!.append(
                            ", ")

                                    }
                                
}

stringBuffer!!.append(
                            "}")

    
                        if(index < array.size -1)
                        
                                    {
                                    stringBuffer!!.append(
                            ", \n")

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


        }
            private constructor        ()
            : super()
        {}


}
                
            

