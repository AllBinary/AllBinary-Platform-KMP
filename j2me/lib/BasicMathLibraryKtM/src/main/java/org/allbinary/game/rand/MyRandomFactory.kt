
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
        package org.allbinary.game.rand




        import java.lang.Object        
        
        import java.lang.Integer
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Random
import org.allbinary.logic.math.MathUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonSeps

open public class MyRandomFactory
            : Object
         {
        
companion object {
            
    private val instance: MyRandomFactory = MyRandomFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: MyRandomFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return MyRandomFactory.instance
}


    open fun main(args: Array<String?>)
        //nullable = true from not(false or (false and false)) = true
{
    //var args = args

    var randomFactory: MyRandomFactory = MyRandomFactory.getInstance()!!


    var stringBuilder: StringMaker = StringMaker()


    var commonSeps: CommonSeps = CommonSeps.getInstance()!!


    var size2: Int = 100





                        for (index in 0 until size2)

        {
stringBuilder!!.appendint(randomFactory!!.getAbsoluteNextInt(3))!!.append(commonSeps!!.COMMA)
}

System.out.println(stringBuilder!!.toString())
stringBuilder!!.delete(0, stringBuilder!!.length())

    var intArray: IntArray = IntArray(52)


    var intArray2: IntArray = IntArray(52)


    var size: Int = intArray!!.size
                





                        for (index in 0 until size)

        {
intArray[index]= index
intArray2[index]= index
}

randomFactory!!.shuffle2(intArray, intArray2)




                        for (index in 0 until size)

        {
stringBuilder!!.appendint(intArray[index]!!)!!.append(commonSeps!!.COMMA)
}

System.out.println(stringBuilder!!.toString())
stringBuilder!!.delete(0, stringBuilder!!.length())




                        for (index in 0 until size)

        {
stringBuilder!!.appendint(intArray2[index]!!)!!.append(commonSeps!!.COMMA)
}

System.out.println(stringBuilder!!.toString())

    var found: Boolean= false





                        for (index in 0 until size)

        {
found= false




                        for (index2 in 0 until size)

        {

    
                        if(intArray[index2] == index)
                        
                                    {
                                    found= true

                                    }
                                
}


    
                        if(!found)
                        
                                    throw RuntimeException()
}

}


        }
            
    private val mathUtil: MathUtil = MathUtil.getInstance()!!

    private var rand: Random
private constructor ()
            : super()
        {
this.rand= Random(System.currentTimeMillis())
}


    open fun setSeed(seed: Long)
        //nullable = true from not(false or (false and false)) = true
{
var seed = seed
this.rand= Random(seed)
}


    open fun getNextInt(range: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
var range = range

    var div: Int = (Integer.MAX_VALUE /range) +1




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return (this.rand.nextInt() /div).toInt()
}


    open fun getAbsoluteNextInt(range: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
var range = range



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.mathUtil!!.abs(this.getNextInt(range))
}


    open fun getAbsoluteNextIntAllowZero(range: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
var range = range

    
                        if(range == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.mathUtil!!.abs(this.getNextInt(range))

                        }
                            
}


    open fun shuffle(intArray: IntArray)
        //nullable = true from not(false or (false and false)) = true
{
    //var intArray = intArray
this.shuffleTotal(intArray, intArray!!.size *7)
}


    open fun shuffleTotal(intArray: IntArray, shuffleTotal: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var intArray = intArray
    //var shuffleTotal = shuffleTotal

    var size: Int = intArray!!.size
                


    var randomIndex: Int= 0


    var randomIndex2: Int= 0


    var value: Int= 0





                        for (index in 0 until shuffleTotal)

        {
randomIndex= this.getAbsoluteNextIntAllowZero(size)
randomIndex2= this.getAbsoluteNextIntAllowZero(size)
value= intArray[randomIndex]!!
intArray[randomIndex]= intArray[randomIndex2]!!
intArray[randomIndex2]= value
}

}


    open fun shuffle2(intArray: IntArray, intArray2: IntArray)
        //nullable = true from not(false or (false and false)) = true
{
    //var intArray = intArray
    //var intArray2 = intArray2
this.shuffle2Total(intArray, intArray2, intArray!!.size *7)
}


    open fun shuffle2Total(intArray: IntArray, intArray2: IntArray, shuffleTotal: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var intArray = intArray
    //var intArray2 = intArray2
    //var shuffleTotal = shuffleTotal

    var size: Int = intArray!!.size
                


    var randomIndex: Int= 0


    var randomIndex2: Int= 0


    var value: Int= 0


    var value2: Int= 0





                        for (index in 0 until shuffleTotal)

        {
randomIndex= this.getAbsoluteNextIntAllowZero(size)
randomIndex2= this.getAbsoluteNextIntAllowZero(size)
value= intArray[randomIndex]!!
value2= intArray2[randomIndex]!!
intArray[randomIndex]= intArray[randomIndex2]!!
intArray[randomIndex2]= value
intArray2[randomIndex]= intArray2[randomIndex2]!!
intArray2[randomIndex2]= value2
}

}


}
                
            

