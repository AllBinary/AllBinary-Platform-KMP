
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
        package org.allbinary.canvas




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

expect open public class GameStatisticsFactory : BaseGameStatistics {
        
companion object {
            
    //private val instance: GameStatisticsFactory
    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameStatisticsFactory

        }
            
    override fun add(string: String)
        //nullable = true from not(false or (false and false)) = true


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

}
                
            

