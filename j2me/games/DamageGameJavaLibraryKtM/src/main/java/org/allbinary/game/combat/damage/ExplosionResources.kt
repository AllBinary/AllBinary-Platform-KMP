
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
        package org.allbinary.game.combat.damage




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class ExplosionResources
            : Object
         {
        

        companion object {
            
    private val instance: ExplosionResources = ExplosionResources()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ExplosionResources{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        {}


    val EXPLOSION_90_RESOURCE: String = "/explosion_sprite_90_by_90.png"

    val EXPLOSION_60_RESOURCE: String = "/explosion_sprite_60_by_60.png"

    val HALF_EXPLOSION_RESOURCE: String = "/explosion_sprite_30_by_30.png"

    val THIRD_EXPLOSION_RESOURCE: String = "/explosion_sprite_15_by_15.png"

}
                
            

