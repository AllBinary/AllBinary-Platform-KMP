
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.CircularIndexUtil

open public class HighScoresHelper : HighScoresHelperBase {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val circularIndexUtil: CircularIndexUtil = CircularIndexUtil.getInstance(0, 0)!!
override fun setHighScoresArray(highScoresArrayP: Array<HighScores?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var highScoresArrayP = highScoresArrayP
super.setHighScoresArray(highScoresArrayP)
this.circularIndexUtil!!.setSize(this.highScoresArrayP!!.size)
}


    var lastIndex: Int =  -1
override fun getNextHighScores()
        //nullable = true from not(false or (false and true)) = true
: HighScores{
    var highScores: HighScores = this.highScoresArrayP[this.circularIndexUtil!!.getIndex()]!!


    var index: Int = 0


        while((highScores!!.getTotal() < 1 || lastIndex == this.circularIndexUtil!!.getIndex()) && index < this.highScoresArrayP!!.size)
        {this.circularIndexUtil!!.next()
highScores= this.highScoresArrayP[this.circularIndexUtil!!.getIndex()]!!
index++
}

lastIndex= this.circularIndexUtil!!.getIndex()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return highScores
}

override fun isAnyHighScores()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(highScoresArrayP!!.size < 1)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                

    var anyScores: Boolean = false


    var highScores: HighScores





                        for (index in highScoresArrayP!!.size -1 downTo 0)


        {highScores= highScoresArrayP[index]!!

    
                        if(highScores!!.getTotal() > 0)
                        
                                    {
                                    anyScores= true

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return anyScores
}


}
                
            

