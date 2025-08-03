
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2003 AllBinary 
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
        
import org.allbinary.game.input.BuildMenuCompositeInterface
import org.allbinary.game.input.form.RTSFormInput
import org.allbinary.game.layer.capital.Capital
import org.allbinary.game.combat.destroy.event.DestroyedEventListenerInterface
import org.allbinary.game.input.PlayerGameInputCompositeInterface
import org.allbinary.game.layer.hud.basic.notification.GameNotificationHudCompositeInterface
import org.allbinary.game.tick.TickableInterface
import org.allbinary.media.audio.Sound
interface RTSPlayerLayerInterface : GameNotificationHudCompositeInterface, BuildMenuCompositeInterface, PlayerGameInputCompositeInterface, DestroyedEventListenerInterface, TickableInterface, PathFindingLayerInterface {
        

open fun getCapital()
        //nullable = true from not(false or (false and true)) = true
: Capital

open fun getRTSFormInput()
        //nullable = true from not(false or (false and true)) = true
: RTSFormInput

open fun add(sound: Sound)
        //nullable = true from not(false or (false and false)) = true


open fun getPlayerOwnedRTSLayers()
        //nullable = true from not(false or (false and true)) = true
: PlayerOwnedRTSLayers

open fun implmentsArtificialIntelligenceCompositeInterface()
        //nullable = true from not(false or (false and true)) = true
: Boolean

}
                
            

