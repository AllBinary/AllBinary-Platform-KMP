
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
        package org.allbinary.game.layer



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.combat.destroy.DestroyableInterface
import org.allbinary.game.identification.GroupInterfaceCompositeInterface
import org.allbinary.game.input.GameKeyEventSourceInterface
import org.allbinary.game.layer.waypoint.WaypointLayerInterface
import org.allbinary.util.BasicArrayList
interface PathFindingLayerInterface : WaypointLayerInterface, GameKeyEventSourceInterface, GroupInterfaceCompositeInterface, DestroyableInterface {
        

                @Throws(Exception::class)
            
open fun getEndGeographicMapCellPositionList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList

open fun shouldHandleStartSameAsEnd()
        //nullable = true from not(false or (false and true)) = true
: Boolean

open fun getGeographicMapCellPositionArea()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPositionArea

open fun getHudPaintable()
        //nullable = true from not(false or (false and true)) = true
: SelectionHudPaintable

                @Throws(Exception::class)
            
open fun handleCost(ownerLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true


open fun getParentLayer()
        //nullable = true from not(false or (false and true)) = true
: PathFindingLayerInterface

open fun getRTSLayer2LogHelper()
        //nullable = true from not(false or (false and true)) = true
: RTSLayer2LogHelper

                @Throws(Exception::class)
            
open fun setTarget(targetGameLayer: PathFindingLayerInterface)
        //nullable = true from not(false or (false and false)) = true


}
                
            

