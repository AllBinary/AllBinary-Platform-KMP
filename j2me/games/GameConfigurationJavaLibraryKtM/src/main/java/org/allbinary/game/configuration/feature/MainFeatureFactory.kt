
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
        

open public class MainFeatureFactory
            : Object
         {
        

        companion object {
            
    private val instance: MainFeatureFactory = MainFeatureFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: MainFeatureFactory

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val FULL_SCREEN: Feature = Feature("Full Screen")

    val TITLE_BAR: Feature = Feature("Title Bar")

    val STATIC: Feature = Feature("Static Dependent Feature")

    val LOAD_ONDEMAND: Feature = Feature("Load OnDemand")

    val LOAD_ALL: Feature = Feature("Load All")

}
                
            

