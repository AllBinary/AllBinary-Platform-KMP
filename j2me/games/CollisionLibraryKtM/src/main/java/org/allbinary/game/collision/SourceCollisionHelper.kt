
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

open public class SourceCollisionHelper : CollisionHelper {
        
public constructor (layerInterface: AllBinaryLayer)                        

                            : super(layerInterface){
var layerInterface = layerInterface


                            //For kotlin this is before the body of the constructor.
                    
}


    override fun isCollidable(layerInterface: CollidableCompositeLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var layerInterface = layerInterface

    
                        if(this.sourceLayerInterface != layerInterface)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

