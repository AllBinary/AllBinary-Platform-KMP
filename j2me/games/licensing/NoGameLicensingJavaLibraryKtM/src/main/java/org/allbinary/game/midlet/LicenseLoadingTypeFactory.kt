
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
        package org.allbinary.game.midlet




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class LicenseLoadingTypeFactory
            : Object
         {
        

        companion object {
            
    private val instance: LicenseLoadingTypeFactory = LicenseLoadingTypeFactory()

open fun getIntance()
        //nullable = true from not(false or (false and true)) = true
: LicenseLoadingTypeFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val INITIAL_LOADING: LicenseLoadingType = LicenseLoadingType(
                            "Initial Loading")

    val GAME_START: LicenseLoadingType = LicenseLoadingType(
                            "Game Start")

    val LOGIN: LicenseLoadingType = LicenseLoadingType(
                            "Login")

    val OTHER: LicenseLoadingType = LicenseLoadingType(
                            "Other/Usually The First Non Demo Level")

}
                
            

