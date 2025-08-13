
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
        package org.allbinary.game.collision.layer



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.collision.CollidableBaseBehavior
import org.allbinary.game.collision.CollidableInterfaceCompositeInterface
import org.allbinary.layer.LayerManager

open public class AllBinaryCollisionManager
            : Object
         {
        

        companion object {
            
    private var allBinaryCollisionManager: AllBinaryCollisionManager = AllBinaryCollisionManager()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AllBinaryCollisionManager{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AllBinaryCollisionManager.allBinaryCollisionManager
}


        }
            private constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun process(layerManager: LayerManager, collidableInterfaceCompositeInterface: CollidableInterfaceCompositeInterface, startIndex: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerManager = layerManager


                    var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface


                    var startIndex = startIndex

    var size: Int = layerManager!!.getSize()!!
            





                        for (index in startIndex +1 until size)


        {
    var collidableInterfaceCompositeInterface2: CollidableInterfaceCompositeInterface = layerManager!!.getLayerAt(index) as CollidableInterfaceCompositeInterface

this.collide(layerManager, collidableInterfaceCompositeInterface, collidableInterfaceCompositeInterface2)
}

}


                @Throws(Exception::class)
            
open fun collide(layerManager: LayerManager, collidableInterfaceCompositeInterface: CollidableInterfaceCompositeInterface, collidableInterfaceCompositeInterface2: CollidableInterfaceCompositeInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerManager = layerManager


                    var collidableInterfaceCompositeInterface = collidableInterfaceCompositeInterface


                    var collidableInterfaceCompositeInterface2 = collidableInterfaceCompositeInterface2

    var collidableBase2: CollidableBaseBehavior = collidableInterfaceCompositeInterface2!!.getCollidableInferface()!!
            


    var collidableBase: CollidableBaseBehavior = collidableInterfaceCompositeInterface!!.getCollidableInferface()!!
            


    
                        if(collidableBase2!!.isCollidable())
                        
                                    {
                                    
    
                        if(collidableBase!!.isCollision(collidableInterfaceCompositeInterface2))
                        
                                    {
                                    collidableBase!!.collide(collidableInterfaceCompositeInterface2)
collidableBase2!!.collide(collidableInterfaceCompositeInterface)

                                    }
                                

                                    }
                                
}


}
                
            

