
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
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.layer.LayerManager
import org.allbinary.layer.LayerProcessor

open public class OptimizedAllBinaryCollisionLayerProcessorForCollidableLayer : LayerProcessor {
        
public constructor        ()                        

                            : super(OptimizedAllBinaryCollisionLayerManager()){


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            override fun process(allBinaryLayerManager: AllBinaryLayerManager, layerInterface: AllBinaryLayer, startIndex: Int)
        //nullable = true from not(false or (false and false)) = true
{
var allBinaryLayerManager = allBinaryLayerManager
var layerInterface = layerInterface
var startIndex = startIndex

    var collidableInterfaceCompositeInterface: CollidableCompositeLayer = layerInterface as CollidableCompositeLayer


    var collidableBase: CollidableBaseBehavior = collidableInterfaceCompositeInterface!!.getCollidableInferface()!!


    
                        if(collidableBase!!.isCollidable())
                        
                                    {
                                    
    var layerManager: LayerManager = this.getLayerManager()!!


    var size: Int = layerManager!!.getSize()!!


    var collidableInterfaceCompositeInterface2: CollidableCompositeLayer


    var collidableBase2: CollidableBaseBehavior





                        for (index in startIndex +1 until size)

        {
collidableInterfaceCompositeInterface2= layerManager!!.getLayerAt(index) as CollidableCompositeLayer
collidableBase2= collidableInterfaceCompositeInterface2!!.getCollidableInferface()

    
                        if(collidableBase2!!.isCollidable() && collidableBase!!.isCollision(collidableInterfaceCompositeInterface2))
                        
                                    {
                                    collidableBase!!.collide(collidableInterfaceCompositeInterface2)
collidableBase2!!.collide(collidableInterfaceCompositeInterface)

                                    }
                                
}


                                    }
                                
}

override fun isProcessorLayer(layerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var layerInterface = layerInterface

    
                        if(layerInterface!!.implmentsCollidableInterface())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


}
                
            

