
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

open public class EndLevelIntermissionProcessor : Processor {
        

    private var gameCanvas: AllBinaryGameCanvas
public constructor        (gameCanvas: AllBinaryGameCanvas)

        Updates for KMP build        
        {
var gameCanvas = gameCanvas
this.gameCanvas= gameCanvas
}


                @Throws(Exception::class)
            override fun process()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
this.gameCanvas!!.processEndLevelIntermissionGameState()
}


}
                
            

