
        /* Generated Code Do Not Modify */
        package org.allbinary.util




        import java.lang.Object        
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.math.MathUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonSeps

open public class ArrayUtil
            : Object
         {
        

        companion object {
            
    private val instance: ArrayUtil = ArrayUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ArrayUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val mathUtil: MathUtil = MathUtil.getInstance()!!
            

open fun copyOf(original: Array<Any?>, newLength: Int)
        //nullable = true from not(false or (false and false)) = true
: Array<Any?>{

                    var original = original


                    var newLength = newLength



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return copyOf(original, newLength, original::class)
}


open fun copyOf(original: Array<Any?>, newLength: Int, newType: KClass<*>)
        //nullable = true from not(false or (false and false)) = true
: Array<Any?>{

                    var original = original


                    var newLength = newLength


                    var newType = newType

    var copy: Array<Any?> = arrayOfNulls(newLength)

System.arraycopy(original, 0, copy, 0, mathUtil!!.min(original.size, newLength))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return copy
}


open fun copyOf(original: ByteArray, newLength: Int)
        //nullable = true from not(false or (false and false)) = true
: ByteArray{

                    var original = original


                    var newLength = newLength

    var copy: ByteArray = ByteArray(newLength)

System.arraycopy(original, 0, copy, 0, mathUtil!!.min(original.size, newLength))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return copy
}


open fun copyOf(original: ShortArray, newLength: Int)
        //nullable = true from not(false or (false and false)) = true
: ShortArray{

                    var original = original


                    var newLength = newLength

    var copy: ShortArray = ShortArray(newLength)

System.arraycopy(original, 0, copy, 0, mathUtil!!.min(original.size, newLength))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return copy
}


open fun copyOf(original: IntArray, newLength: Int)
        //nullable = true from not(false or (false and false)) = true
: IntArray{

                    var original = original


                    var newLength = newLength

    var copy: IntArray = IntArray(newLength)

System.arraycopy(original, 0, copy, 0, mathUtil!!.min(original.size, newLength))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return copy
}


open fun copyOf(original: LongArray, newLength: Int)
        //nullable = true from not(false or (false and false)) = true
: LongArray{

                    var original = original


                    var newLength = newLength

    var copy: LongArray = LongArray(newLength)

System.arraycopy(original, 0, copy, 0, mathUtil!!.min(original.size, newLength))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return copy
}


open fun copyOf(original: CharArray, newLength: Int)
        //nullable = true from not(false or (false and false)) = true
: CharArray{

                    var original = original


                    var newLength = newLength

    var copy: CharArray = 
                                                        
                                                        CharArray(newLength)
                                                    

System.arraycopy(original, 0, copy, 0, mathUtil!!.min(original.size, newLength))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return copy
}


open fun copyOf(original: FloatArray, newLength: Int)
        //nullable = true from not(false or (false and false)) = true
: FloatArray{

                    var original = original


                    var newLength = newLength

    var copy: FloatArray = FloatArray(newLength)

System.arraycopy(original, 0, copy, 0, mathUtil!!.min(original.size, newLength))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return copy
}


open fun copyOf(original: DoubleArray, newLength: Int)
        //nullable = true from not(false or (false and false)) = true
: DoubleArray{

                    var original = original


                    var newLength = newLength

    var copy: DoubleArray = DoubleArray(newLength)

System.arraycopy(original, 0, copy, 0, mathUtil!!.min(original.size, newLength))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return copy
}


open fun copyOf(original: BooleanArray, newLength: Int)
        //nullable = true from not(false or (false and false)) = true
: BooleanArray{

                    var original = original


                    var newLength = newLength

    var copy: BooleanArray = BooleanArray(newLength)

System.arraycopy(original, 0, copy, 0, mathUtil!!.min(original.size, newLength))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return copy
}


open fun reverse(intArray: IntArray)
        //nullable = true from not(false or (false and false)) = true
{

                    var intArray = intArray

    var length: Int = intArray!!.size -1


    var temp: Int= 0


    var size: Int = length /2





                        for (index in 0 until size)


        {temp= intArray[index]!!
intArray[index]= intArray[length -index]!!
intArray[length -index]= temp
}

}


open fun flip(intArray: IntArray, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var intArray = intArray


                    var width = width


                    var height = height

    var length: Int = height -1


    var temp: Int= 0


    var index: Int= 0


    var rowIndex: Int= 0





                        for (y in 0 until length /2)


        {



                        for (x in 0 until width)


        {rowIndex= ((length -y) *width)
index= x +(y *width)
temp= intArray[index]!!
intArray[index]= intArray[rowIndex +x]!!
intArray[rowIndex +x]= temp
}

}

}


open fun toString(twoDimensionalIntArray: Array<IntArray?>)
        //nullable = true from not(false or (true and false)) = true
: String{

                    var twoDimensionalIntArray = twoDimensionalIntArray

    var stringBuffer: StringMaker = StringMaker()


    var commonSeps: CommonSeps = CommonSeps.getInstance()!!
            


    var endIndex: Int = twoDimensionalIntArray!!.size
                


    var endIndex2: Int = twoDimensionalIntArray[0]!!.size
                





                        for (index in 0 until endIndex)


        {stringBuffer!!.append(commonSeps!!.BRACE_OPEN)




                        for (index2 in 0 until endIndex2)


        {stringBuffer!!.append(twoDimensionalIntArray[index]!![index2]!!)
stringBuffer!!.append(commonSeps!!.COMMA_SEP)
}

stringBuffer!!.append(commonSeps!!.BRACE_CLOSE)
stringBuffer!!.append(commonSeps!!.NEW_LINE)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun toString(objectArray: Array<Any?>)
        //nullable = true from not(false or (true and false)) = true
: String{

                    var objectArray = objectArray

    var stringBuffer: StringMaker = StringMaker()


    var commonSeps: CommonSeps = CommonSeps.getInstance()!!
            





                        for (index in 0 until objectArray!!.size)


        {stringBuffer!!.append(StringUtil.getInstance()!!.toString(objectArray[index]!!))
stringBuffer!!.append(commonSeps!!.COMMA_SEP)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun toString(byteArray: ByteArray)
        //nullable = true from not(false or (true and false)) = true
: String{

                    var byteArray = byteArray

    var stringBuffer: StringMaker = StringMaker()


    var commonSeps: CommonSeps = CommonSeps.getInstance()!!
            





                        for (index in 0 until byteArray!!.size)


        {stringBuffer!!.append(byteArray[index]!!)
stringBuffer!!.append(commonSeps!!.COMMA_SEP)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

