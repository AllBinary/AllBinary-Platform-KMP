
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
        package org.allbinary.game.layer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.collision.CollisionType
import org.allbinary.game.collision.CollisionTypeFactory
import org.allbinary.game.layer.special.CollidableDestroyableDamageableBehavior

open public class CollidableRTSBehavior : CollidableDestroyableDamageableBehavior {
        
public constructor        (ownerLayer: CollidableCompositeLayer, collidable: Boolean)                        

                            : super(ownerLayer, collidable){
    //var ownerLayer = ownerLayer
    //var collidable = collidable


                            //For kotlin this is before the body of the constructor.
                    
}


open fun isCollision(collidableInterfaceCompositeInterface: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface

    var collisionTypeFactory: CollisionTypeFactory = CollisionTypeFactory.getInstance()!!


    var collisionType: CollisionType = collidableInterfaceCompositeInterface!!.getCollidableInferface()!!.getCollisionTypeWith(this.ownerLayer)!!


    
                        if(collisionType == collisionTypeFactory!!.PICKUP)
                        
                                    {
                                    
                                    }
                                
                             else 
    
                        if(collisionType == collisionTypeFactory!!.COLLISION)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.isCollision(collidableInterfaceCompositeInterface)

                                    }
                                
                        else {
                            
    
                        if(collidableInterfaceCompositeInterface!!.getX2() <= this.ownerLayer!!.getXP() || collidableInterfaceCompositeInterface!!.getY2() <= this.ownerLayer!!.getYP() || collidableInterfaceCompositeInterface!!.getYP() >= this.ownerLayer!!.getY2() || collidableInterfaceCompositeInterface!!.getXP() >= this.ownerLayer!!.getX2())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                        }
                            

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
open fun collide(collidableInterfaceCompositeInterface: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true
{
    //var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface

    var collisionTypeFactory: CollisionTypeFactory = CollisionTypeFactory.getInstance()!!


    var collisionType: CollisionType = collidableInterfaceCompositeInterface!!.getCollidableInferface()!!.getCollisionTypeWith(this.ownerLayer)!!


    
                        if(collisionType == collisionTypeFactory!!.PICKUP)
                        
                                    {
                                    
                                    }
                                
                             else 
    
                        if(collisionType == collisionTypeFactory!!.COLLISION)
                        
                                    {
                                    super.collide(collidableInterfaceCompositeInterface)

                                    }
                                
                        else {
                            this.collideNone(collidableInterfaceCompositeInterface)

                        }
                            
}


                @Throws(Exception::class)
            
open fun collideNone(collidableInterface: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true
{
    //var collidableInterface = collidableInterface
}


}
                
            

