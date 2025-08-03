
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
        package org.allbinary.graphics.color



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringUtil

open public class SmallBasicColorCacheFactory
            : Object
         {
        

        companion object {


    private val instance: SmallBasicColorCacheFactory = SmallBasicColorCacheFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: SmallBasicColorCacheFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
    private val SIZE: Int = 255

    private val INDEX_TO_COLOR: IntArray = IntArray(SIZE)

    private val BASIC_COLOR_ARRAY: Array<BasicColor?> = arrayOfNulls(SIZE)

    private var colorIndex: Int = 0
private constructor        ()
            : super()
        {}


open fun add(basicDefaultColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{

                    var basicDefaultColor = basicDefaultColor
BASIC_COLOR_ARRAY[colorIndex]= basicDefaultColor
INDEX_TO_COLOR[colorIndex]= basicDefaultColor!!.toInt()
colorIndex++
}


open fun getInstance(colorAsInt: Int)
        //nullable =  from not(true or (false and false)) = 
: BasicColor{

                    var colorAsInt = colorAsInt

    var basicColor: BasicColor





                        for (index in 0 until SIZE)


        {
    
                        if(INDEX_TO_COLOR[index] == colorAsInt)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BASIC_COLOR_ARRAY[index]!!

                                    }
                                
}


    var ALPHA_MASK: Int = 0xFF000000.toInt()

basicColor= BasicColor(colorAsInt and ALPHA_MASK, colorAsInt and 0x00FFFFFF, StringUtil.getInstance()!!.EMPTY_STRING)
this.add(basicColor)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return basicColor
}


}
                
            

