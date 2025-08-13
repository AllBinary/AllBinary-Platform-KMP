
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
        package org.allbinary.game.combat.destroy



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.string.CommonStrings

open public class DestroyableBaseBehavior
            : Object
        
                , DestroyableInterface {
        

        companion object {
            
    private val instance: DestroyableBaseBehavior = DestroyableBaseBehavior()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: DestroyableBaseBehavior{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        override fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this::class.qualifiedName!!
}


                @Throws(Exception::class)
            override fun isDestroyed()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                            throw Exception(CommonStrings.getInstance()!!.NOT_IMPLEMENTED)
}


open fun setDestroyed(destroyed: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var destroyed = destroyed
}


}
                
            

