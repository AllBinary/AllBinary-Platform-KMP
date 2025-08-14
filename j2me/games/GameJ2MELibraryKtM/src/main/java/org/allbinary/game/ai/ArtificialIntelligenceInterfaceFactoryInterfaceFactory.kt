
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
        package org.allbinary.game.ai




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil

open public class ArtificialIntelligenceInterfaceFactoryInterfaceFactory
            : Object
         {
        

        companion object {
            
    private var SINGLETON: ArtificialIntelligenceInterfaceFactoryInterfaceFactory = ArtificialIntelligenceInterfaceFactoryInterfaceFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ArtificialIntelligenceInterfaceFactoryInterfaceFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private var list: BasicArrayList = BasicArrayListUtil.getInstance()!!.getImmutableInstance()!!
            

open fun clear()
        //nullable = true from not(false or (false and true)) = true
{list= BasicArrayList()
}


open fun getInstance(hashtable: Hashtable<Any, Any>)
        //nullable =  from not(true or (false and false)) = 
: ArtificialIntelligenceInterfaceFactoryInterface{

                    var hashtable = hashtable

    var typeInteger: Integer = hashtable.get(BasicAI.ID as Object) as Integer


    var type: Int = typeInteger!!.toInt()!!
            


    var artificialIntelligenceInterfaceFactoryInterface: ArtificialIntelligenceInterfaceFactoryInterface = list.objectArray[type -1]!! as ArtificialIntelligenceInterfaceFactoryInterface




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return artificialIntelligenceInterfaceFactoryInterface
}


open fun add(artificialIntelligenceInterfaceFactoryInterface: ArtificialIntelligenceInterfaceFactoryInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var artificialIntelligenceInterfaceFactoryInterface = artificialIntelligenceInterfaceFactoryInterface
list.add(artificialIntelligenceInterfaceFactoryInterface)
}


}
                
            

