
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
        package org.allbinary.game.configuration



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class GameSpeed
            : Object
         {
        

        companion object {
            
    private val instance: GameSpeed = GameSpeed()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameSpeed{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun getSpeed()
        //nullable = true from not(false or (false and true)) = true
: Int{
    var speedGameConfiguration: GameConfiguration = GameConfigurationCentral.getInstance()!!.SPEED




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return (speedGameConfiguration!!.getMaxValue()!!.toInt() -speedGameConfiguration!!.getValue()!!.toInt() +1)
}


open fun getDelay()
        //nullable = true from not(false or (false and true)) = true
: Int{
    var speedGameConfiguration: GameConfiguration = GameConfigurationCentral.getInstance()!!.SPEED




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 19 *(speedGameConfiguration!!.getMaxValue()!!.toInt() -speedGameConfiguration!!.getValue()!!.toInt())
}


}
                
            

