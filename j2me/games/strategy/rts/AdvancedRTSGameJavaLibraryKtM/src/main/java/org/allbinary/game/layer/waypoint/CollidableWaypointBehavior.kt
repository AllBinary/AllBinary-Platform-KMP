
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
        
public constructor (collidable: Boolean)                        

                            : super(collidable){
var collidable = collidable


                            //For kotlin this is before the body of the constructor.
                    
}


    override fun isCollision(ownerLayer: CollidableCompositeLayer, collisionLayer: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var ownerLayer = ownerLayer
var collisionLayer = collisionLayer



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
    override fun collide(ownerLayer: CollidableCompositeLayer, collisionLayer: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true
{
    //var ownerLayer = ownerLayer
var collisionLayer = collisionLayer
}


    override fun isCollisionInterface(ownerLayer: CollidableCompositeLayer, collidableInterface: CollidableInterfaceCompositeInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var ownerLayer = ownerLayer
var collidableInterface = collidableInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
    override fun collideInterface(ownerLayer: CollidableCompositeLayer, collidableInterface: CollidableInterfaceCompositeInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var ownerLayer = ownerLayer
var collidableInterface = collidableInterface
}


}
                
            

