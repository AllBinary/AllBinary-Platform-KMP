
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
        package org.allbinary.game.layer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.BasicArrayList
import org.allbinary.animation.RotationAnimation
import org.allbinary.layer.LayerInterface
import org.allbinary.logic.math.BasicDecimal
import org.allbinary.media.graphics.geography.map.GeographicMapCellHistory
import org.allbinary.media.graphics.geography.map.GeographicMapCellPositionTracking
interface VehicleLayerInterface : LayerInterface, VehiclePropertiesCompositeInterface {
        

open fun getGameKeyEventList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList

        Updates for KMP build        
        

open fun getSpeedBasicDecimal()
        //nullable = true from not(false or (false and true)) = true
: BasicDecimal

        Updates for KMP build        
        

open fun isReadyForExplosion()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        

open fun getRotationAnimationInterface()
        //nullable = true from not(false or (false and true)) = true
: RotationAnimation

        Updates for KMP build        
        

open fun setRotationAnimationInterface(animationInterface: RotationAnimation)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun isDestroyed()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        

open fun isFinish()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        

open fun getFinalPosition()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun handleFinish()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        

open fun getGeographicMapCellPositionTracking()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPositionTracking

        Updates for KMP build        
        

open fun getGeographicMapCellHistoryArray()
        //nullable = true from not(false or (false and true)) = true
: Array<GeographicMapCellHistory?>

        Updates for KMP build        
        

open fun setGeographicMapCellHistoryArray(geographicMapCellHistory: Array<GeographicMapCellHistory?>)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

}
                
            

