
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
        package org.allbinary.game.configuration.feature




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class GameFeatureFactory
            : Object
         {
        

        companion object {
            
    private val instance: GameFeatureFactory = GameFeatureFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameFeatureFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        {
}


    val SOUND: GameFeature = GameFeature("Sound")

    val MUSIC: GameFeature = GameFeature("Music")

    val SCREEN_SHAKE: Feature = Feature("Screen Shake")

    val POST_IMAGE_LOADING_MODIFICATION: Feature = Feature("Post Image Loading Modification (Scaling, Rotation, or Other)")

    val HEALTH_BARS: GameFeature = GameFeature("Health Bars")

    val DAMAGE_FLOATERS: GameFeature = GameFeature("Damage Floaters")

    val GAME_INPUT_LAYER_PROCESSOR: GameFeature = GameFeature("Game Input Layer Processor")

    val ARTIFICIAL_INTELLEGENCE_PROCESSOR: GameFeature = GameFeature("Artificial Intelligence Layer Processor")

    val COLLIDABLE_INTERFACE_LAYER_PROCESSOR: GameFeature = GameFeature("Collidable Interface Layer Processor")

    val TICKABLE_LAYER_PROCESSOR: GameFeature = GameFeature("Tickable Layer Processor")

    val CHEATING: GameFeature = GameFeature("Cheating")

    val DROPPED_ITEMS: GameFeature = GameFeature("Drops")

    val DROPPED_ITEMS_FROM_DEATH: GameFeature = GameFeature("Drops from Dead")

    val TEST_DESTROYED_LAYER_PROCESSOR: GameFeature = GameFeature("Destroyed Layer Processor")

    val COLLISIONS_WITH_SOURCE: GameFeature = GameFeature("Allow Collisions With Source")

    val COLLISIONS_FORCED_TWO_DIMENSIONAL: GameFeature = GameFeature("Collisions Forced Two Dimensional")

}
                
            

