
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
        package org.allbinary.game.input




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class GameInputProcessorUtil
            : Object
         {
        

        companion object {
            
open fun init(inputProcessorArray: Array<GameInputProcessor?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var inputProcessorArray = inputProcessorArray

    var inputProcessor: GameInputProcessor


    var noInputProcessor: GameInputProcessor = GameInputProcessor.getInstance()!!


    var total: Int = InputFactory.getInstance()!!.MAX





                        for (index in 0 until total)


        {inputProcessor= inputProcessorArray[index]!!

    
                        if(inputProcessor == 
                                    null
                                )
                        
                                    {
                                    inputProcessorArray[index]= noInputProcessor

                                    }
                                
}

}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

