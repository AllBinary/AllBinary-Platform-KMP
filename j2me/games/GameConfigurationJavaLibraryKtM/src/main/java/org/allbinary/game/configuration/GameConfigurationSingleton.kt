
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
        
import java.util.Hashtable
import org.allbinary.util.BasicArrayList

open public class GameConfigurationSingleton
            : Object
         {
        

        companion object {
            
    private var SINGLETON: GameConfigurationSingleton = GameConfigurationSingleton()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameConfigurationSingleton{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
    private var list: BasicArrayList

    private var hashtable: Hashtable<Any, Any>
private constructor        ()
            : super()
        {list= BasicArrayList()
hashtable= Hashtable<Any, Any>()
}


open fun getInstance(name: String)
        //nullable =  from not(true or (false and false)) = 
: GameConfiguration{

                    var name = name



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashtable.get(name as Object?) as GameConfiguration
}


open fun getOptionsBasicArrayList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
}


open fun add(gameConfiguration: GameConfiguration)
        //nullable = true from not(false or (false and false)) = true
{

                    var gameConfiguration = gameConfiguration
list.add(gameConfiguration)
}


open fun getHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.hashtable
}


}
                
            

