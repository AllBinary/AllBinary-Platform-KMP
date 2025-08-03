
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.direction.Direction
import org.allbinary.game.state.GameState

open public class AdConfiguration
            : Object
         {
        

    val INNERACTIVE: String

    val LEADBOLT: String

    val ADMOB: String
public constructor        (advertIdArray: Array<Any?>)
            : super()
        {

                    var advertIdArray = advertIdArray
this.INNERACTIVE= advertIdArray[0]!! as String
this.ADMOB= advertIdArray[1]!! as String
this.LEADBOLT= advertIdArray[2]!! as String
}


open fun getValidAdSpots()
        //nullable = true from not(false or (false and true)) = true
: Array<Direction?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return arrayOfNulls(0)
}


open fun process(gameState: GameState)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameState = gameState
}


open fun process(state: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var state = state
}


open fun setShowAds()
        //nullable = true from not(false or (false and true)) = true
{}


open fun setShowAds(showAds: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var showAds = showAds
}


open fun isShowAds()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


}
                
            

