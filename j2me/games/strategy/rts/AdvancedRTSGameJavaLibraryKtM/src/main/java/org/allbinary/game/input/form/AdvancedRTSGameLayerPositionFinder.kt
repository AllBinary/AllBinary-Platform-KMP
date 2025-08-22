
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
        package org.allbinary.game.input.form




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.LayerPositionFinderInterface
import org.allbinary.game.layer.waypoint.WaypointCellPositionHistory
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.drop.DropCellPositionHistory

open public class AdvancedRTSGameLayerPositionFinder
            : Object
        
                , LayerPositionFinderInterface {
        

        companion object {
            
    private val instance: AdvancedRTSGameLayerPositionFinder = AdvancedRTSGameLayerPositionFinder()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AdvancedRTSGameLayerPositionFinder{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        {}


open fun getLayerInterface(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: AllBinaryLayer{

                    var geographicMapCellPosition = geographicMapCellPosition

    var layerInterface: AllBinaryLayer = DropCellPositionHistory.getInstance()!!.getLayerInterface(geographicMapCellPosition)!!


    
                        if(layerInterface == 
                                    null
                                )
                        
                                    {
                                    layerInterface= WaypointCellPositionHistory.getInstance()!!.getLayerInterface(geographicMapCellPosition)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return layerInterface
}


}
                
            

