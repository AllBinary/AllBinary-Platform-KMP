
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.BasicArrayList
interface HighScoresInterface {
        

open fun getList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList

open fun addHighScore(newHighScore: HighScore)
        //nullable = true from not(false or (false and false)) = true


open fun getTotal()
        //nullable = true from not(false or (false and true)) = true
: Int

                @Throws(Exception::class)
            
open fun isBestScore(newHighScore: HighScore)
        //nullable = true from not(false or (false and false)) = true
: Boolean

}
                
            

