
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
        package org.allbinary.layer




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil

open public class LayerInterfaceFactory
            : Object
         {
        

        companion object {
            
    private val SINGLETON: LayerInterfaceFactory = LayerInterfaceFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: LayerInterfaceFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var list: BasicArrayList = BasicArrayListUtil.getInstance()!!.getImmutableInstance()!!
            

open fun init()
        //nullable = true from not(false or (false and true)) = true
{list= BasicArrayList()
}


    private val HASHTABLE_LABEL: String = "Hashtable: "

                @Throws(Exception::class)
            
open fun getInstance(hashtable: Hashtable<Any, Any>, x: Int, y: Int, z: Int)
        //nullable =  from not(true or (false and false)) = 
: AllBinaryLayer{

                    var hashtable = hashtable


                    var x = x


                    var y = y


                    var z = z

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(StringMaker().
                            append(HASHTABLE_LABEL)!!.append(StringUtil.getInstance()!!.toString(hashtable))!!.toString(), this, commonStrings!!.GET_INSTANCE)

    var typeInteger: Integer = hashtable.get(Layer.ID as Object) as Integer


    var layerInterfaceFactoryInterface: LayerInterfaceFactoryInterface = list.objectArray[typeInteger!!.toInt() -1]!! as LayerInterfaceFactoryInterface




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return layerInterfaceFactoryInterface!!.getInstance(hashtable, x, y, z)
}


open fun add(layerInterfaceFactoryInterface: LayerInterfaceFactoryInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerInterfaceFactoryInterface = layerInterfaceFactoryInterface
list.add(layerInterfaceFactoryInterface)
}


}
                
            

