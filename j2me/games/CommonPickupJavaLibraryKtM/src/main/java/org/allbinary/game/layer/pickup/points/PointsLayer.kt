
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
        package org.allbinary.game.layer.pickup.points




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.game.score.ScoreableInterface
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.Rectangle
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.view.ViewPosition

open public class PointsLayer : AllBinaryLayer {
        

    private val points: Int
public constructor        (points: Int)                        

                            : super(Rectangle(PointFactory.getInstance()!!.ZERO_ZERO, 0, 0), ViewPosition())

        Updates for KMP build        
        {
var points = points


                            //For kotlin this is before the body of the constructor.
                    
this.points= points
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graphics = graphics
}


open fun visit(scoreableInterface: ScoreableInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var scoreableInterface = scoreableInterface
scoreableInterface!!.addPoints(this.points)
}


}
                
            

