
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.math.SmallIntegerSingletonFactory

open public class NumberInSameGroupSequence
            : Object
         {
        

        companion object {
            
open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: NumberInSameGroupSequence{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NumberInSameGroupSequence()
}


        }
            
    var NUMBER_ON_SAME_TEAM_SEQUENCE_ZERO: Integer

    var NUMBER_ON_SAME_TEAM_SEQUENCE_ONE: Integer

    var NUMBER_ON_SAME_TEAM_SEQUENCE_TWO: Integer

    var NUMBER_ON_SAME_TEAM_SEQUENCE_THREE: Integer

    var NUMBER_ON_SAME_TEAM_SEQUENCE_FOUR: Integer

    var NUMBER_ON_SAME_TEAM_SEQUENCE_FIVE: Integer

    var NUMBER_ON_SAME_TEAM_SEQUENCE_SIX: Integer

    var NUMBER_ON_SAME_TEAM_SEQUENCE_SEVEN: Integer

    var NUMBER_ON_SAME_TEAM_SEQUENCE_EIGHT: Integer

    var NUMBER_ON_SAME_TEAM_SEQUENCE_NINE: Integer

    var NUMBER_ON_SAME_TEAM_SEQUENCE: Array<Integer?>
private constructor        ()
            : super()
        {
    var smallIntegerSingletonFactory: SmallIntegerSingletonFactory = SmallIntegerSingletonFactory.getInstance()!!
            

NUMBER_ON_SAME_TEAM_SEQUENCE_ZERO= smallIntegerSingletonFactory!!.getInstance(100)
NUMBER_ON_SAME_TEAM_SEQUENCE_ONE= smallIntegerSingletonFactory!!.getInstance(101)
NUMBER_ON_SAME_TEAM_SEQUENCE_TWO= smallIntegerSingletonFactory!!.getInstance(102)
NUMBER_ON_SAME_TEAM_SEQUENCE_THREE= smallIntegerSingletonFactory!!.getInstance(103)
NUMBER_ON_SAME_TEAM_SEQUENCE_FOUR= smallIntegerSingletonFactory!!.getInstance(104)
NUMBER_ON_SAME_TEAM_SEQUENCE_FIVE= smallIntegerSingletonFactory!!.getInstance(105)
NUMBER_ON_SAME_TEAM_SEQUENCE_SIX= smallIntegerSingletonFactory!!.getInstance(106)
NUMBER_ON_SAME_TEAM_SEQUENCE_SEVEN= smallIntegerSingletonFactory!!.getInstance(107)
NUMBER_ON_SAME_TEAM_SEQUENCE_EIGHT= smallIntegerSingletonFactory!!.getInstance(108)
NUMBER_ON_SAME_TEAM_SEQUENCE_NINE= smallIntegerSingletonFactory!!.getInstance(109)
NUMBER_ON_SAME_TEAM_SEQUENCE= arrayOf(NUMBER_ON_SAME_TEAM_SEQUENCE_ZERO,NUMBER_ON_SAME_TEAM_SEQUENCE_ONE,NUMBER_ON_SAME_TEAM_SEQUENCE_THREE,NUMBER_ON_SAME_TEAM_SEQUENCE_FOUR,NUMBER_ON_SAME_TEAM_SEQUENCE_FIVE,NUMBER_ON_SAME_TEAM_SEQUENCE_SIX,NUMBER_ON_SAME_TEAM_SEQUENCE_SEVEN,NUMBER_ON_SAME_TEAM_SEQUENCE_EIGHT,NUMBER_ON_SAME_TEAM_SEQUENCE_NINE)
}


}
                
            

