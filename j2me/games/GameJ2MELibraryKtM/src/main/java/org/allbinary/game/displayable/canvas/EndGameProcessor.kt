
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
        package org.allbinary.game.displayable.canvas




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.canvas.Processor
import org.allbinary.game.score.HighScores
import org.allbinary.game.score.NullHighScoresSingletonFactory
import org.allbinary.graphics.paint.NullPaintable

open public class EndGameProcessor : Processor {
        

    private var gameCanvas: AllBinaryGameCanvas

    private val WAIT: Long = 5000
public constructor        (gameCanvas: AllBinaryGameCanvas){
var gameCanvas = gameCanvas
this.gameCanvas= gameCanvas
}


                @Throws(Exception::class)
            override fun process()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(this.gameCanvas!!.isHighScoreSubmitted())
                        
                                    {
                                    
    
                        if(this.gameCanvas!!.getGameStateTimeHelper()!!.isElapsed(WAIT))
                        
                                    {
                                    
    
                        if(this.gameCanvas!!.getGameState() == AllBinaryGameCanvas.SHOW_END_RESULT_GAME_STATE)
                        
                                    {
                                    
    var highScores: HighScores = this.gameCanvas!!.highScoresHelper!!.getSelectedHighScores()!!


    
                        if(highScores != NullHighScoresSingletonFactory.getInstance())
                        
                                    {
                                    this.gameCanvas!!.highScoresHelper!!.selectHighScores()
this.gameCanvas!!.getRealHighScoresPaintable()!!.setHighScores(highScores)
this.gameCanvas!!.setGameState(AllBinaryGameCanvas.SHOW_HIGH_SCORE_GAME_STATE)
this.gameCanvas!!.setHighScoresPaintable(this.gameCanvas!!.getRealHighScoresPaintable())

                                    }
                                

                                    }
                                
                             else 
    
                        if(this.gameCanvas!!.getGameState() == AllBinaryGameCanvas.SHOW_HIGH_SCORE_GAME_STATE)
                        
                                    {
                                    this.gameCanvas!!.setGameState(AllBinaryGameCanvas.SHOW_END_RESULT_GAME_STATE)
this.gameCanvas!!.setHighScoresPaintable(NullPaintable.getInstance())

                                    }
                                

                                    }
                                

                                    }
                                
}


}
                
            

