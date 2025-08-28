
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
        package org.allbinary.media.audio




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.media.Player
import org.allbinary.string.CommonStrings

open public class PlayerStateUtil
            : Object
         {
        

        companion object {
            
    private val instance: PlayerStateUtil = PlayerStateUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PlayerStateUtil

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    val UNREALIZED: String = "UNREALIZED"

    val REALIZED: String = "REALIZED"

    val PREFETCHED: String = "PREFETCHED"

    val STARTED: String = "STARTED"

    val CLOSED: String = "CLOSED"

open fun convert(state: Int)
        //nullable = true from not(false or (false and false)) = true
: String

        Updates for KMP build        
        {
    //var state = state

    
                        if(state == Player.UNREALIZED)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.UNREALIZED

                                    }
                                
                             else 
    
                        if(state == Player.REALIZED)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.REALIZED

                                    }
                                
                             else 
    
                        if(state == Player.PREFETCHED)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.PREFETCHED

                                    }
                                
                             else 
    
                        if(state == Player.STARTED)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.STARTED

                                    }
                                
                             else 
    
                        if(state == Player.CLOSED)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.CLOSED

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return commonStrings!!.UNKNOWN
}


}
                
            

