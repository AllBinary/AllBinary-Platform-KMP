
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
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.direction.DirectionFactory

open public class LayerPlacementTypeFactory
            : Object
         {
        
companion object {
            
    private val instance: LayerPlacementTypeFactory = LayerPlacementTypeFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: LayerPlacementTypeFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val MAP: LayerPlacementType = LayerPlacementType(Integer.MAX_VALUE)

    val LEFT: LayerPlacementType = LayerPlacementType(DirectionFactory.getInstance()!!.LEFT.getValue())

    val DOWN: LayerPlacementType = LayerPlacementType(DirectionFactory.getInstance()!!.DOWN.getValue())

    val UP: LayerPlacementType = LayerPlacementType(DirectionFactory.getInstance()!!.UP.getValue())

    val RIGHT: LayerPlacementType = LayerPlacementType(DirectionFactory.getInstance()!!.RIGHT.getValue())

}
                
            

