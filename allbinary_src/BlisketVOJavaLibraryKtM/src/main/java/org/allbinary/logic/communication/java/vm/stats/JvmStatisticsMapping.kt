
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
        package org.allbinary.logic.communication.java.vm.stats



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.data.tables.TableMappingInterface

open public class JvmStatisticsMapping : JvmStatistics
                , TableMappingInterface {
        
public constructor        ()                        

                            : super(){

                            //For kotlin this is before the body of the constructor.
                    
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(JvmStatisticsData.FREE_MEMORY_BYTES, this.getFreeMemoryBytesString())
hashMap!!.put(JvmStatisticsData.FREE_MEMORY_KILOBYTES, this.getFreeMemoryKilobytesString())
hashMap!!.put(JvmStatisticsData.FREE_MEMORY_MEGABYTES, this.getFreeMemoryMegabytesString())
hashMap!!.put(JvmStatisticsData.MAX_MEMORY_BYTES, this.getMaxMemoryBytesString())
hashMap!!.put(JvmStatisticsData.MAX_MEMORY_KILOBYTES, this.getMaxMemoryKilobytesString())
hashMap!!.put(JvmStatisticsData.MAX_MEMORY_MEGABYTES, this.getMaxMemoryMegabytesString())
hashMap!!.put(JvmStatisticsData.NUMBER_OF_THREADS, this.getNumberOfThreadsString())
hashMap!!.put(JvmStatisticsData.TOTAL_MEMORY_BYTES, this.getTotalMemoryBytesString())
hashMap!!.put(JvmStatisticsData.TOTAL_MEMORY_KILOBYTES, this.getTotalMemoryKilobytesString())
hashMap!!.put(JvmStatisticsData.TOTAL_MEMORY_MEGABYTES, this.getTotalMemoryMegabytesString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


                @Throws(Exception::class)
            
open fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Any{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return JvmStatisticsData.NAME
}


                @Throws(Exception::class)
            
open fun toVector()
        //nullable = true from not(false or (false and true)) = true
: Vector{
    var vector: Vector = Vector()

vector.add(this.getFreeMemoryBytesString())
vector.add(this.getFreeMemoryKilobytesString())
vector.add(this.getFreeMemoryMegabytesString())
vector.add(this.getMaxMemoryBytesString())
vector.add(this.getMaxMemoryKilobytesString())
vector.add(this.getMaxMemoryMegabytesString())
vector.add(this.getNumberOfThreadsString())
vector.add(this.getTotalMemoryBytesString())
vector.add(this.getTotalMemoryKilobytesString())
vector.add(this.getTotalMemoryMegabytesString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return vector
}


}
                
            

