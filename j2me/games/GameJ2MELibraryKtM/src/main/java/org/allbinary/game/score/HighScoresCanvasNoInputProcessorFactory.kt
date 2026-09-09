
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
        
import org.allbinary.game.score.displayable.HighScoresCanvas

open public class HighScoresCanvasNoInputProcessorFactory
            : Object
        
                , HighScoresCanvasInputProcessorFactoryInterface {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    override fun getInstance(highScoresCanvas: HighScoresCanvas)
        //nullable =  from not(true or (false and false)) = 
: HighScoresCanvasInputProcessor{
var highScoresCanvas = highScoresCanvas



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return HighScoresCanvasInputProcessor(highScoresCanvas)
}


}
                
            

