
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
        package org.allbinary.game.input



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonStrings

open public class InputFactory
            : Object
         {
        

        companion object {
            
    private val instance: InputFactory = InputFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: InputFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    val KEY_CODE_LABEL: String = "KeyCode: "

    val DEVICE_ID_LABEL: String = "DeviceId: "

    val MAX: Int = SmallIntegerSingletonFactory.getInstance()!!.MIN

    val inputIntegerArray: Array<Input?> = arrayOfNulls(this.MAX)

    val NO_INPUT: Input = Input(0, commonStrings!!.UNKNOWN)
private constructor        ()
            : super()
        {
    var size: Int = inputIntegerArray!!.size
                





                        for (index in 0 until size)


        {inputIntegerArray[index]= NO_INPUT
}

}


open fun add(id: Int, input: Input)
        //nullable = true from not(false or (false and false)) = true
{

                    var id = id


                    var input = input
this.inputIntegerArray[id]= input
}


open fun getInstance(id: Int)
        //nullable =  from not(true or (false and false)) = 
: Input{

                    var id = id

    
                        if(id < 0)
                        
                                    {
                                    id=  -id

                                    }
                                

    
                        if(id > inputIntegerArray!!.size)
                        
                                    {
                                    logUtil!!.put(StringMaker().
                            append(
                            "Warning id: ")!!.append(id)!!.toString(), this, commonStrings!!.GET_INSTANCE)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NO_INPUT

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputIntegerArray[id]!!
}


}
                
            

