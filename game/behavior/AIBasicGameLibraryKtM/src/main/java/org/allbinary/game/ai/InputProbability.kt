
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
        package org.allbinary.game.ai




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.time.TimeDelayHelper

open public class InputProbability
            : Object
         {
        
companion object {
            
    var INPUT_PROBABILITY: Integer = SmallIntegerSingletonFactory.getInstance()!!.getInstance(0)!!

        }
            
    private val likelyhoodIntegerArray: Array<Array<Integer?>?>

    private val repeatLikelyhoodIntegerArray: Array<Integer?>

    private val max: Int

    private val timeDelayHelper: TimeDelayHelper
public constructor (likelyhoodIntegerArray: Array<Array<Integer?>?>, repeatLikelyhoodIntegerArray: Array<Integer?>, max: Int, timeDelayHelper: TimeDelayHelper)
            : super()
        {
var likelyhoodIntegerArray = likelyhoodIntegerArray
var repeatLikelyhoodIntegerArray = repeatLikelyhoodIntegerArray
var max = max
var timeDelayHelper = timeDelayHelper
this.likelyhoodIntegerArray= likelyhoodIntegerArray
this.repeatLikelyhoodIntegerArray= repeatLikelyhoodIntegerArray
this.max= max
this.timeDelayHelper= timeDelayHelper
}


    open fun getLikelyhoodIntegerArray()
        //nullable = true from not(false or (false and true)) = true
: Array<Array<Integer?>?>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return likelyhoodIntegerArray
}


    open fun getRepeatLikelyhoodIntegerArray()
        //nullable = true from not(false or (false and true)) = true
: Array<Integer?>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return repeatLikelyhoodIntegerArray
}


    open fun getMax()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return max
}


    open fun getTimeDelayHelper()
        //nullable = true from not(false or (false and true)) = true
: TimeDelayHelper{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return timeDelayHelper
}


    open fun toHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>{

    var hashtable: Hashtable<Any, Any> = Hashtable<Any, Any>()

hashtable.put(INPUT_PROBABILITY, this)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashtable
}


}
                
            

