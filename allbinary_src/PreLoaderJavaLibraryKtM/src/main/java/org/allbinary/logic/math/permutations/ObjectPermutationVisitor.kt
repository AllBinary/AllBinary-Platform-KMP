
        /* Generated Code Do Not Modify */
        package org.allbinary.logic.math.permutations




        import java.lang.Object        
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.util.visitor.Visitor
import org.allbinary.string.CommonSeps

open public class ObjectPermutationVisitor : Visitor {
        

    val data: Array<Any?>
public constructor        (data: Array<Any?>)

        Updates for KMP build        
        {
var data = data
this.data= data
}


    private var stringBuilder: StringBuilder = StringBuilder()

open fun visit(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Any

        Updates for KMP build        
        {
var anyType = anyType
stringBuilder!!.delete(0, stringBuilder!!.length())
this.print(data, stringBuilder)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun print(data: Array<Any?>)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var data = data

    var stringBuilder: StringBuilder = StringBuilder()

this.print(data, stringBuilder)
}


open fun print(data: Array<Any?>, stringBuilder: StringBuilder)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var data = data
var stringBuilder = stringBuilder

    var size: Int = data.size
                





                        for (i in 0 until size)

        

        Updates for KMP build        
        {
stringBuilder!!.append(data[i]!!.hashCode())
stringBuilder!!.append(CommonSeps.getInstance()!!.SPACE)
}

System.out.println(stringBuilder!!.toString())
}


}
                
            

