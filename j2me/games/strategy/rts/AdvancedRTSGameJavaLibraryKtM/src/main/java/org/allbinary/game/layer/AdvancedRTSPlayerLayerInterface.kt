
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2006 AllBinary 
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
        package org.allbinary.game.layer



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.GameType
import org.allbinary.graphics.color.BasicColor
interface AdvancedRTSPlayerLayerInterface : RTSPlayerLayerInterface {
        

open fun getAdvancedPlayerOwnedRTSLayers()
        //nullable = true from not(false or (false and true)) = true
: AdvancedPlayerOwnedRTSLayers

open fun isLocalPlayer()
        //nullable = true from not(false or (false and true)) = true
: Boolean

open fun getGameType()
        //nullable = true from not(false or (false and true)) = true
: GameType

open fun getDecalBasicColor()
        //nullable = true from not(false or (false and true)) = true
: BasicColor

}
                
            

