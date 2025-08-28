
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
        package org.allbinary.game.layer.pickup




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringUtil

open public class PickedUpLayerTypeFactory
            : Object
         {
        

        companion object {
            
    private val instance: PickedUpLayerTypeFactory = PickedUpLayerTypeFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PickedUpLayerTypeFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    var NONE: PickedUpLayerType = PickedUpLayerType(StringUtil.getInstance()!!.NULL_STRING)

    var BEAM: PickedUpLayerType = PickedUpLayerType("BEAM")

    var MINE: PickedUpLayerType = PickedUpLayerType("MINE")

    var PROJECTILE: PickedUpLayerType = PickedUpLayerType("PROJECTILE")

    var ENHANCEMENT: PickedUpLayerType = PickedUpLayerType("Enhancement")

    var MORPH: PickedUpLayerType = PickedUpLayerType("Morph")

    var PART: PickedUpLayerType = PickedUpLayerType("Part")

    var HEAL: PickedUpLayerType = PickedUpLayerType("Heal")

    var LIFE: PickedUpLayerType = PickedUpLayerType("Life")

    var POINTS: PickedUpLayerType = PickedUpLayerType("Points")

}
                
            

