
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
        
import java.util.Hashtable
import org.allbinary.game.configuration.event.ChangedGameFeatureListener

open public class Feature
            : Object
         {
        

        companion object {
            
    private var hashtable: Hashtable<Any, Any> = Hashtable<Any, Any>()

open fun getInstance(name: String)
        //nullable =  from not(true or (false and false)) = 
: Feature{

                    var name = name



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashtable.get(name as Object?) as Feature
}


open fun add(name: String, gameFeature: Feature)
        //nullable = true from not(false or (false and false)) = true
{

                    var name = name


                    var gameFeature = gameFeature
hashtable.put(name, gameFeature)
}


        }
            
    private val name: String
public constructor        (name: String)
            : super()
        {

                    var name = name
this.name= name
add(name, this)
ChangedGameFeatureListener.getInstance()!!.add(this)
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return getName()
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}


}
                
            

