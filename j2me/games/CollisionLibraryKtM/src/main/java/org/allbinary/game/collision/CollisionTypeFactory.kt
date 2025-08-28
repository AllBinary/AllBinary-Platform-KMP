
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
        package org.allbinary.game.collision




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class CollisionTypeFactory
            : Object
         {
        

        companion object {
            
    private var SINGLETON: CollisionTypeFactory = CollisionTypeFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CollisionTypeFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    var NONE: CollisionType = CollisionType("None")

    var DAMAGE: CollisionType = CollisionType("Damage")

    var PICKUP: CollisionType = CollisionType("Pickup")

    var COLLISION: CollisionType = CollisionType("Collision")

}
                
            

