
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
        package org.allbinary.graphics.displayable




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class GameTickDisplayInfoSingleton
            : Object
         {
        

        companion object {
            
    private val instance: GameTickDisplayInfoSingleton = GameTickDisplayInfoSingleton()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameTickDisplayInfoSingleton{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val displayInfoSingleton: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!
            

    private var lastWidth: Int = displayInfoSingleton!!.getLastWidth()!!
            

    private var lastHeight: Int = displayInfoSingleton!!.getLastHeight()!!
            

    private var lastHalfWidth: Int = displayInfoSingleton!!.getLastHalfWidth()!!
            

    private var lastHalfHeight: Int = displayInfoSingleton!!.getLastHalfHeight()!!
            

open fun update()
        //nullable = true from not(false or (false and true)) = true
{this.lastWidth= displayInfoSingleton!!.getLastWidth()
this.lastHeight= displayInfoSingleton!!.getLastHeight()
this.lastHalfWidth= displayInfoSingleton!!.getLastHalfWidth()
this.lastHalfHeight= displayInfoSingleton!!.getLastHalfHeight()
}


open fun getLastWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.lastWidth
}


open fun getLastHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.lastHeight
}


open fun getLastHalfWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.lastHalfWidth
}


open fun getLastHalfHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.lastHalfHeight
}


}
                
            

