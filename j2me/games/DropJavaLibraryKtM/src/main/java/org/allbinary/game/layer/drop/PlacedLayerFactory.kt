
        /* Generated Code Do Not Modify */
        package org.allbinary.game.layer.drop




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.layer.AllBinaryLayerFactoryInterface
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil

open public class PlacedLayerFactory
            : Object
         {
        

        companion object {
            
    private val instance: PlacedLayerFactory = PlacedLayerFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PlacedLayerFactory

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    private val list: BasicArrayList = BasicArrayList()
private constructor        ()
            : super()
        

        Updates for KMP build        
        {
}


open fun clear()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
list.clear()
}


open fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list.size()
}


    private val basicArrayListUtil: BasicArrayListUtil = BasicArrayListUtil.getInstance()!!

open fun getRandomInstance()
        //nullable = true from not(false or (false and true)) = true
: AllBinaryLayerFactoryInterface

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return basicArrayListUtil!!.getRandom(list) as AllBinaryLayerFactoryInterface
}


open fun add(layerInterfaceFactoryInterface: AllBinaryLayerFactoryInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var layerInterfaceFactoryInterface = layerInterfaceFactoryInterface
list.add(layerInterfaceFactoryInterface)
}


}
                
            

