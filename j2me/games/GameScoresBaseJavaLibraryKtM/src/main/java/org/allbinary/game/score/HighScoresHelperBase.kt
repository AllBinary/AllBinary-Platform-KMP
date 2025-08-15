
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonStrings

open public class HighScoresHelperBase
            : Object
        
                , HighScoresResultsListener {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    var highScoresArrayP: Array<HighScores?> = LastFetchHighScoresFactory.getInstance()!!.highScoresArray
override fun setHighScoresArray(highScoresArrayP: Array<HighScores?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var highScoresArrayP = highScoresArrayP

    
                        if(highScoresArrayP != 
                                    null
                                )
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(StringMaker().
                            append(commonStrings!!.START)!!.append(highScoresArrayP!!.size)!!.toString(), this, "setHighScoresArray")

                                    }
                                
                        else {
                            
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.START, this, "setHighScoresArray")

                        }
                            
this.highScoresArrayP= highScoresArrayP
}


open fun getNextHighScores()
        //nullable = true from not(false or (false and true)) = true
: HighScores{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullHighScoresSingletonFactory.getInstance()
}


open fun isAnyHighScores()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                            throw RuntimeException()
}


open fun setSelectedHighScores(selectedHighScores: HighScores)
        //nullable = true from not(false or (false and false)) = true
{

                    var selectedHighScores = selectedHighScores
}


open fun getSelectedHighScores()
        //nullable = true from not(false or (false and true)) = true
: HighScores{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullHighScoresSingletonFactory.getInstance()
}


open fun getHighScoresArray()
        //nullable = true from not(false or (false and true)) = true
: Array<HighScores?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.highScoresArrayP
}


open fun selectHighScores()
        //nullable = true from not(false or (false and true)) = true
{}


}
                
            

