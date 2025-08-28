
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
        
import org.allbinary.game.layer.CollidableCompositeLayer
import org.allbinary.graphics.RectangleFactory

open public class CollidableNeverCollideBehavior : CollidableBaseBehavior {
        
 constructor        (isCollidable: Boolean)                        

                            : super(CollidableCompositeLayer(RectangleFactory.SINGLETON), isCollidable)

        Updates for KMP build        
        {
var isCollidable = isCollidable


                            //For kotlin this is before the body of the constructor.
                    
}

override fun isCollision(allbinaryCollidableLayer: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
var allbinaryCollidableLayer = allbinaryCollidableLayer



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            override fun collide(allbinaryCollidableLayer: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var allbinaryCollidableLayer = allbinaryCollidableLayer
}

override fun collide(collidableInterfaceCompositeInterface: CollidableInterfaceCompositeInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface
}

override fun isCollision(collidableInterfaceCompositeInterface: CollidableInterfaceCompositeInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean

        Updates for KMP build        
        {
var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

