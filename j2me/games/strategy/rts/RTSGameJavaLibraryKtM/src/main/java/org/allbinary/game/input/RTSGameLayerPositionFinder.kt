
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
        package org.allbinary.game.input



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition
import org.allbinary.media.graphics.geography.map.drop.DropCellPositionHistory

open public class RTSGameLayerPositionFinder
            : Object
        
                , LayerPositionFinderInterface {
        

        companion object {


    private val instance: RTSGameLayerPositionFinder = RTSGameLayerPositionFinder()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: RTSGameLayerPositionFinder{


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



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DropCellPositionHistory.getInstance()!!.getLayerInterface(geographicMapCellPosition)
}


}
                
            

