
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
        package org.allbinary.game.layer



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Enumeration
import java.util.Hashtable
import org.allbinary.layer.Layer
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.util.BasicArrayList

open public class LevelLayersFinder
            : Object
         {
        

        companion object {


    private val instance: LevelLayersFinder = LevelLayersFinder()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: LevelLayersFinder{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
open fun get(hashtable: Hashtable<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var hashtable = hashtable

    var smallIntegerSingletonFactory: SmallIntegerSingletonFactory = SmallIntegerSingletonFactory.getInstance()!!
            


    var list: BasicArrayList = BasicArrayList()


    var enumeration: Enumeration<Any?> = hashtable!!.keys()!!
            


        while(enumeration!!.hasMoreElements())
        {
    var layerHashtable: Hashtable<Any, Any> = hashtable!!.get(enumeration!!.nextElement()!! as Object) as Hashtable<Any, Any>


    var integer: Integer = layerHashtable!!.get(Layer.ID as Object) as Integer


    var cachedInteger: Integer = smallIntegerSingletonFactory!!.getInstance(integer!!.toInt())!!
            


    
                        if(!list!!.contains(cachedInteger))
                        
                                    {
                                    list!!.add(cachedInteger)

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
}


}
                
            

