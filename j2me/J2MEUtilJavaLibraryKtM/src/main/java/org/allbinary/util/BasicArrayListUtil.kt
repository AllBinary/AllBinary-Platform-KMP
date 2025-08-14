
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
        package org.allbinary.util




        import java.lang.Object        
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.rand.MyRandomFactory
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonPhoneStrings

open public class BasicArrayListUtil
            : Object
         {
        

        companion object {
            
    private val instance: BasicArrayListUtil = BasicArrayListUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BasicArrayListUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


open fun main(args: Array<String?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var args = args

    var commonPhoneStrings: CommonPhoneStrings = CommonPhoneStrings.getInstance()!!
            


    var list: BasicArrayList = BasicArrayList()

list.add(commonPhoneStrings!!.ONE)
list.add(commonPhoneStrings!!.TWO)
list.add(commonPhoneStrings!!.THREE)
list.add(commonPhoneStrings!!.FOUR)
list.add(commonPhoneStrings!!.FIVE)
list.add(commonPhoneStrings!!.SIX)
list.add(commonPhoneStrings!!.SEVEN)
list.add(commonPhoneStrings!!.EIGHT)
list.add(commonPhoneStrings!!.NINE)
BasicArrayListUtil.getInstance()!!.reverse(list)
System.out.println(list)
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val myRandomFactory: MyRandomFactory = MyRandomFactory.getInstance()!!
            

    private val immutableInstance: BasicArrayList = ImmutableBasicArrayList(0)

open fun getRandom(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: Any{

                    var list = list

    var i_random: Int = this.getRandomIndex(list)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list.objectArray[i_random]!!
}


open fun getRandomIndex(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var list = list



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return myRandomFactory!!.getAbsoluteNextInt(list.size())
}


open fun reverse(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var list = list

    var lastMinusOneIndex: Int = list.size() -2


    var temp: Any


    var size: Int = lastMinusOneIndex /2


    var secondSwapIndex: Int= 0





                        for (index in 0 until size)


        {secondSwapIndex= lastMinusOneIndex -index
temp= list.remove(index)
list.add(index, list.remove(secondSwapIndex))
list.add(secondSwapIndex +1, temp)
}

}


open fun log(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var list = list

    var size: Int = list.size()!!
            


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(CommonLabels.getInstance()!!.TOTAL_LABEL)
stringBuffer!!.append(size)




                        for (index in size -1 downTo 0)


        {
    var usedList: BasicArrayList = list.objectArray[index]!! as BasicArrayList

stringBuffer!!.append(
                            " s: ")
stringBuffer!!.append(usedList!!.size())
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun getImmutableInstance()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return immutableInstance
}


}
                
            

