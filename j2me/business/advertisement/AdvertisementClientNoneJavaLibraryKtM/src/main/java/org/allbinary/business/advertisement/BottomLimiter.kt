
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
        package org.allbinary.business.advertisement




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.GameAdState
import org.allbinary.graphics.displayable.DisplayInfoSingleton

open public class BottomLimiter
            : Object
         {
        

        companion object {
            
    private val instance: BottomLimiter = BottomLimiter()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BottomLimiter{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private var bottom: Int= 0

    private var deltaY: Int= 0

    private var lower: Int= 0

    private var higher: Int= 0
private constructor        ()
            : super()
        {}


open fun init(lower: Int, higher: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var lower = lower


                    var higher = higher
this.lower= lower
this.higher= higher
}


open fun update()
        //nullable = true from not(false or (false and true)) = true
{
    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!


    var gameAdState: GameAdState = GameAdStateFactory.getInstance()!!.getCurrentInstance()!!


    
                        if(gameAdState!!.isShowingAt())
                        
                                    {
                                    deltaY= higher

                                    }
                                
                        else {
                            deltaY= lower

                        }
                            
bottom= displayInfo!!.getLastHeight() -deltaY
}


open fun getDeltaY()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return deltaY
}


open fun getBottom()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bottom
}


}
                
            

