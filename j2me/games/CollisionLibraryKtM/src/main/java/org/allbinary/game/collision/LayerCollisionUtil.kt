
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
        
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.GameFeatureFactory
import org.allbinary.graphics.opengles.OpenGLFeatureUtil
import org.allbinary.layer.AllBinaryLayer

open public class LayerCollisionUtil
            : Object
         {
        

        companion object {
            
    private val instance: LayerCollisionUtil = LayerCollisionUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: LayerCollisionUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private val collisionProcessor: CollisionProcessor
private constructor        ()
            : super()
        {
    var features: Features = Features.getInstance()!!
            


    var gameFeatureFactory: GameFeatureFactory = GameFeatureFactory.getInstance()!!
            


    
                        if(OpenGLFeatureUtil.getInstance()!!.isAnyThreed() && !features.isFeature(gameFeatureFactory!!.COLLISIONS_FORCED_TWO_DIMENSIONAL))
                        
                                    {
                                    this.collisionProcessor= CollisionThreedProcessor()

                                    }
                                
                        else {
                            this.collisionProcessor= Collision2DProcessor()

                        }
                            
}


open fun isCollision(myLayer: AllBinaryLayer, myLayer2: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var myLayer = myLayer


                    var myLayer2 = myLayer2



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.collisionProcessor!!.isCollision(myLayer, myLayer2)
}


}
                
            

