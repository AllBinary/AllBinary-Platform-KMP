
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

open public class HighScoresHelper2 : HighScoresHelperBase {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val circularIndexUtil: CircularIndexUtil = CircularIndexUtil.getInstance(0, 0)!!

    private var selectedHighScores: HighScores = NullHighScoresSingletonFactory.getInstance()!!

    override fun setSelectedHighScores(selectedHighScores: HighScores)
        //nullable = true from not(false or (false and false)) = true
{
    //var selectedHighScores = selectedHighScores
this.selectedHighScores= selectedHighScores
}


    override fun getSelectedHighScores()
        //nullable = true from not(false or (false and true)) = true
: HighScores{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return selectedHighScores
}


    override fun setHighScoresArray(highScoresArrayP: Array<HighScores?>)
        //nullable = true from not(false or (false and false)) = true
{
    //var highScoresArrayP = highScoresArrayP
super.setHighScoresArray(highScoresArrayP)
this.circularIndexUtil!!.setSize(this.highScoresArrayP!!.size)
this.selectHighScores()
}


    override fun selectHighScores()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(this.highScoresArrayP!!.size == 0)
                        
                                    {
                                    this.setSelectedHighScores(NullHighScoresSingletonFactory.getInstance())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
this.circularIndexUtil!!.next()

    var highScores: HighScores = this.highScoresArrayP[this.circularIndexUtil!!.getIndex()]!!


    var index: Int = 0


        while(highScores!!.getTotal() < 1 && index < this.highScoresArrayP!!.size)
        {
highScores= this.highScoresArrayP[this.circularIndexUtil!!.next()]!!
index++
}

this.setSelectedHighScores(highScores)
}


}
                
            

