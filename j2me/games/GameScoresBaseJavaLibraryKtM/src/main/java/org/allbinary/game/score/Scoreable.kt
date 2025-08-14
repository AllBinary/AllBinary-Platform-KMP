
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
        package org.allbinary.game.score




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.math.SmallIntegerSingletonFactory

open public class Scoreable
            : Object
        
                , ScoreableInterface {
        

        companion object {
            
    val NULL_SCOREABLE: Scoreable = Scoreable( -1)

    var ID: Integer = SmallIntegerSingletonFactory.getInstance()!!.getInstance(3)!!
            

        }
            
    private var points: Int
public constructor        (points: Int)
            : super()
        {

                    var points = points
this.points= points
}

override fun addPoints(points: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var points = points
this.points += points
}

override fun removePoints(points: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var points = points
this.points -= points
}


open fun setPoints(points: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var points = points
this.points= points
}

override fun getPoints()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return points
}


}
                
            

