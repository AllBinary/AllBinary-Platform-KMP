
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
        package org.allbinary.game.layer.drop




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.pickup.PickedUpLayerInterfaceFactoryInterface
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil

open public class DropLayerFactory
            : Object
         {
        

        companion object {
            
    private val DROP_LAYER_FACTORY: DropLayerFactory = DropLayerFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: DropLayerFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DROP_LAYER_FACTORY
}


        }
            
    private val list: BasicArrayList = BasicArrayList()
private constructor        ()
            : super()
        {}


open fun clear()
        //nullable = true from not(false or (false and true)) = true
{list.clear()
}


open fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list.size()
}


    private val basicArrayListUtil: BasicArrayListUtil = BasicArrayListUtil.getInstance()!!

open fun getRandomInstance()
        //nullable = true from not(false or (false and true)) = true
: PickedUpLayerInterfaceFactoryInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return basicArrayListUtil!!.getRandom(list) as PickedUpLayerInterfaceFactoryInterface
}


open fun add(layerInterfaceFactoryInterface: PickedUpLayerInterfaceFactoryInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerInterfaceFactoryInterface = layerInterfaceFactoryInterface
list.add(layerInterfaceFactoryInterface)
}


open fun getList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
}


}
                
            

