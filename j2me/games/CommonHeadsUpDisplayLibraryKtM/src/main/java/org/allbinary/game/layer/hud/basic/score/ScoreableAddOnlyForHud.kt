
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
        package org.allbinary.game.layer.hud.basic.score




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.score.Scoreable

open public class ScoreableAddOnlyForHud : Scoreable {
        

    private val scoreHudWidget: ScoreHudWidget
public constructor        (scoreVectorGraphic: ScoreHudWidget)                        

                            : super(0)

        Updates for KMP build        
        {
var scoreVectorGraphic = scoreVectorGraphic


                            //For kotlin this is before the body of the constructor.
                    
this.scoreHudWidget= scoreVectorGraphic
this.getScoreHudWidget()!!.set(0)
}

override fun removePoints(points: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var points = points
}

override fun addPoints(points: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var points = points
super.addPoints(points)
this.getScoreHudWidget()!!.add(points)
}


open fun getScoreHudWidget()
        //nullable = true from not(false or (false and true)) = true
: ScoreHudWidget

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return scoreHudWidget
}


}
                
            

