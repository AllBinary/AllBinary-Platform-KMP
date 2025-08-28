
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
        
import org.allbinary.util.BasicArrayList
interface HighScoresInterface {
        

open fun getList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList

        Updates for KMP build        
        

open fun addHighScore(newHighScore: HighScore)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun getTotal()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun isBestScore(newHighScore: HighScore)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        

}
                
            

