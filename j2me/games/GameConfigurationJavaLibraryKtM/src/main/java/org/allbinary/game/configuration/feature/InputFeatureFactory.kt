
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
        

open public class InputFeatureFactory
            : Object
         {
        
companion object {
            
    private val instance: InputFeatureFactory = InputFeatureFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: InputFeatureFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor ()
            : super()
        {
}


    val REMOVE_DUPLICATE_KEY_PRESSES: InputFeature = InputFeature("Remove Duplicate Key Presses")

    val INPUT_MAPPING: InputFeature = InputFeature("Input Mapping")

    val MULTI_KEY_PRESS: InputFeature = InputFeature("Multi Key Press")

    val SINGLE_KEY_REPEAT_PRESS: InputFeature = InputFeature("Single Key Repeat Press")

    val SINGLE_KEY_PRESS: InputFeature = InputFeature("Single Key Press")

    open fun isSingleKeyProcessing()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

    var features: Features = Features.getInstance()!!


    
                        if(features.isFeature(this.SINGLE_KEY_REPEAT_PRESS) || features.isFeature(this.SINGLE_KEY_PRESS))
                        
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
                
            

