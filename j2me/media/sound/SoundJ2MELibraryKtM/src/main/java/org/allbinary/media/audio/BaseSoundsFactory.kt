
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
        package org.allbinary.media.audio



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class BaseSoundsFactory
            : Object
        
                , SoundsFactoryInterface {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private var initialized: Boolean= false
override fun init()
        //nullable = true from not(false or (false and true)) = true
{}


                @Throws(Exception::class)
            override fun getSoundInterfaceArray()
        //nullable = true from not(false or (false and true)) = true
: Array<Sound?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return arrayOfNulls(0)
}

override fun setInitialized(initialized: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var initialized = initialized
this.initialized= initialized
}

override fun isInitialized()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return initialized
}


}
                
            

