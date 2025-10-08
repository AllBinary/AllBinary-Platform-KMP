
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
        

open public class NoScoreable : Scoreable {
        
companion object {
            
    private val SINGLETON: NoScoreable = NoScoreable()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: NoScoreable{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            private constructor ()                        

                            : super(0){


                            //For kotlin this is before the body of the constructor.
                    
}


    override fun addPoints(points: Int)
        //nullable = true from not(false or (false and false)) = true
{
var points = points
}


    override fun removePoints(points: Int)
        //nullable = true from not(false or (false and false)) = true
{
var points = points
}


}
                
            

