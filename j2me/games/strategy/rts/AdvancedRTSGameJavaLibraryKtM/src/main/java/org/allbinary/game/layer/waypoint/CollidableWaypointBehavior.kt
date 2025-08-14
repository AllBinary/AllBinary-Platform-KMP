
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
        package org.allbinary.game.layer.waypoint




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.CollidableCompositeLayer
import org.allbinary.game.layer.CollidableRTSBehavior
import org.allbinary.game.collision.CollidableInterfaceCompositeInterface

open public class CollidableWaypointBehavior : CollidableRTSBehavior {
        
public constructor        (ownerLayer: CollidableCompositeLayer, collidable: Boolean)                        

                            : super(ownerLayer, collidable){

                    var ownerLayer = ownerLayer


                    var collidable = collidable


                            //For kotlin this is before the body of the constructor.
                    
}


open fun isCollision(collisionLayer: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var collisionLayer = collisionLayer



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
open fun collide(collisionLayer: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var collisionLayer = collisionLayer
}


open fun isCollision(collidableInterface: CollidableInterfaceCompositeInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var collidableInterface = collidableInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
open fun collide(collidableInterface: CollidableInterfaceCompositeInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var collidableInterface = collidableInterface
}


}
                
            

