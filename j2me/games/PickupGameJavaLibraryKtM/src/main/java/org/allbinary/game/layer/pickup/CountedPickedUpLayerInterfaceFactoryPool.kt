
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
        package org.allbinary.game.layer.pickup




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.BasicArrayList

open public class CountedPickedUpLayerInterfaceFactoryPool
            : Object
         {
        
companion object {
            
    private var SINGLETON: CountedPickedUpLayerInterfaceFactoryPool = CountedPickedUpLayerInterfaceFactoryPool()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CountedPickedUpLayerInterfaceFactoryPool{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


    open fun init()
        //nullable = true from not(false or (false and true)) = true
{
SINGLETON= CountedPickedUpLayerInterfaceFactoryPool()
}


        }
            
    private var list: BasicArrayList
private constructor ()
            : super()
        {
list= BasicArrayList()
}


    open fun getList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
}


}
                
            

