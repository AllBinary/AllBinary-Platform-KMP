
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
        package org.allbinary.game.part




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.pickup.CountedPickedUpLayerInterfaceFactory
import org.allbinary.game.layer.pickup.CountedPickedUpLayerInterfaceFactoryPool
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil

open public class MakeCountedPartsSingletonArrayFactory
            : Object
         {
        

        companion object {
            
    private val instance: MakeCountedPartsSingletonArrayFactory = MakeCountedPartsSingletonArrayFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: MakeCountedPartsSingletonArrayFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var list: BasicArrayList = BasicArrayListUtil.getInstance()!!.getImmutableInstance()!!

                @Throws(Exception::class)
            
open fun getInstance(partInterfaceArray: Array<PartInterface?>)
        //nullable =  from not(true or (false and false)) = 
: Array<PartInterface?>{

                    var partInterfaceArray = partInterfaceArray
list= BasicArrayList()




                        for (index in 0 until partInterfaceArray!!.size)


        {list.add(partInterfaceArray[index]!!)
}


    var countedBasicArrayList: BasicArrayList = CountedPickedUpLayerInterfaceFactoryPool.getInstance()!!.getList()!!


    var layerInterfaceFactoryInterface: CountedPickedUpLayerInterfaceFactory


    var size: Int = countedBasicArrayList!!.size()!!





                        for (index in 0 until size)


        {layerInterfaceFactoryInterface= countedBasicArrayList!!.objectArray[index]!! as CountedPickedUpLayerInterfaceFactory
list.add(CountedLayerInterfaceFactoryPart(0, layerInterfaceFactoryInterface))
}


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Total Parts: ")
stringBuffer!!.append(list.size())
stringBuffer!!.append(" Counted: ")
stringBuffer!!.append(countedBasicArrayList!!.size())

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.GET_INSTANCE)

    var newPartInterfaceArray: Array<PartInterface?> = arrayOfNulls(list.size())


    var newSize: Int = newPartInterfaceArray!!.size
                





                        for (index in 0 until newSize)


        {newPartInterfaceArray[index]= list.get(index) as PartInterface
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newPartInterfaceArray
}


}
                
            

