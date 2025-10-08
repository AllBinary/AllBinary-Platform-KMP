
        /* Generated Code Do Not Modify */
        package org.allbinary.logic.math.permutations




        import java.lang.Object        
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.util.visitor.Visitor
import org.allbinary.string.CommonSeps

open public class IntPermutationVisitor : Visitor {
        

    val data: IntArray
public constructor (data: IntArray){
var data = data
this.data= data
}


    private var stringBuilder: StringBuilder = StringBuilder()

    open fun visit(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Any{
var anyType = anyType
stringBuilder!!.delete(0, stringBuilder!!.length())
this.print(data, stringBuilder)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


    open fun print(data: IntArray)
        //nullable = true from not(false or (false and false)) = true
{
var data = data

    var stringBuilder: StringBuilder = StringBuilder()

this.print(data, stringBuilder)
}


    open fun print(data: IntArray, stringBuilder: StringBuilder)
        //nullable = true from not(false or (false and false)) = true
{
var data = data
var stringBuilder = stringBuilder

    var size: Int = data.size
                





                        for (i in 0 until size)

        {
stringBuilder!!.append(data[i]!!)
stringBuilder!!.append(CommonSeps.getInstance()!!.SPACE)
}

System.out.println(stringBuilder!!.toString())
}


}
                
            

