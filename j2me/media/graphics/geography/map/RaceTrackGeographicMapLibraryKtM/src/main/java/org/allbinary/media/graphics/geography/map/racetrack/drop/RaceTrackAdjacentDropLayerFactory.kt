
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
        package org.allbinary.media.graphics.geography.map.racetrack.drop




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil
import org.allbinary.layer.LayerInterfaceFactoryInterface

open public class RaceTrackAdjacentDropLayerFactory
            : Object
         {
        

        companion object {
            
    private var DROP_LAYER_FACTORY: RaceTrackAdjacentDropLayerFactory = RaceTrackAdjacentDropLayerFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: RaceTrackAdjacentDropLayerFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return DROP_LAYER_FACTORY
}


        }
            
    private var list: BasicArrayList = BasicArrayList()
private constructor        ()
            : super()
        {
}


open fun clear()
        //nullable = true from not(false or (false and true)) = true
{
list.clear()
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
: LayerInterfaceFactoryInterface{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return basicArrayListUtil!!.getRandom(list) as LayerInterfaceFactoryInterface
}


open fun add(layerInterfaceFactoryInterface: LayerInterfaceFactoryInterface)
        //nullable = true from not(false or (false and false)) = true
{
var layerInterfaceFactoryInterface = layerInterfaceFactoryInterface
list.add(layerInterfaceFactoryInterface)
}


}
                
            

