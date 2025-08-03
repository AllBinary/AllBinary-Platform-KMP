
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
        package org.allbinary.logic.math.permutations



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.util.visitor.Visitor

open public class OrderedIntArrayPermutationUtil
            : Object
         {
        

        companion object {


    private val instance: OrderedIntArrayPermutationUtil = OrderedIntArrayPermutationUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: OrderedIntArrayPermutationUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


open fun main(args: Array<String?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var args = args

    var TOTAL: Int = 3


    var data: IntArray = IntArray(TOTAL)





                        for (i in 0 until TOTAL)


        {data[i]= i
}


    var permutationVisitor: IntPermutationVisitor = IntPermutationVisitor(data)


    var ORIGINAL_DATA_LABEL: String = "Original Data: "

System.out!!.print(ORIGINAL_DATA_LABEL)
permutationVisitor!!.print(data)
OrderedIntArrayPermutationUtil.getInstance()!!.generate(data, permutationVisitor)
}



        }
            
    private val TOTAL_ITERATIONS_TABLE: String = "Total Iterations: "

    private val FINISHED: String = "\nFINISHED"
private constructor        ()
            : super()
        {}


open fun getNext(data: IntArray)
        //nullable = true from not(false or (false and false)) = true
{

                    var data = data

    var length: Int = data!!.size
                


    var i: Int = length -1


        while(data[i -1] >= data[i])
        {i= i -1
}


    var j: Int = length


        while(data[j -1] <= data[i -1])
        {j= j -1
}

this.swap(data, i -1, j -1)
i++
j= length

        while(i < j)
        {this.swap(data, i -1, j -1)
i++
j--
}

}


open fun swap(data: IntArray, a: Int, b: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var data = data


                    var a = a


                    var b = b

    var temp: Int = data[a]!!

data[a]= data[b]!!
data[b]= temp
}


open fun factorial(dataLength: Int)
        //nullable = true from not(false or (false and false)) = true
: Long{

                    var dataLength = dataLength

    var temp: Long = 1


    
                        if(dataLength > 1)
                        
                                    {
                                    



                        for (i in 1 until dataLength)


        {temp *= i
}


                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return temp
}


open fun generate(data: IntArray, visitor: Visitor)
        //nullable = true from not(false or (false and false)) = true
{

                    var data = data


                    var visitor = visitor

    var iterations: Long = this.factorial(data!!.size)!!
            

System.out!!.print(TOTAL_ITERATIONS_TABLE)
System.out!!.println(iterations)




                        for (count in 0 until iterations -1)


        {this.getNext(data)
visitor!!.visit(this)
}

System.out!!.println(FINISHED)
}


}
                
            

