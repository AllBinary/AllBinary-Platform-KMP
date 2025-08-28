
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




        import java.lang.Object        
        
        import java.lang.Thread
        
        import java.lang.Runtime
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class JvmStatistics
            : Object
         {
        

    private var runtime: Runtime
public constructor        ()
            : super()
        

        Updates for KMP build        
        {
runtime= Runtime.getRuntime()
}


open fun getFreeMemoryBytes()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return runtime.freeMemory()
}


open fun getFreeMemoryKilobytes()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getFreeMemoryBytes() /1024
}


open fun getFreeMemoryMegabytes()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getFreeMemoryKilobytes() /1024
}


open fun getMaxMemoryBytes()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return runtime.maxMemory()
}


open fun getMaxMemoryKilobytes()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getMaxMemoryBytes() /1024
}


open fun getMaxMemoryMegabytes()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getMaxMemoryKilobytes() /1024
}


open fun getTotalMemoryBytes()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return runtime.totalMemory()
}


open fun getTotalMemoryKilobytes()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getTotalMemoryBytes() /1024
}


open fun getTotalMemoryMegabytes()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getTotalMemoryKilobytes() /1024
}


open fun getFreeMemoryBytesLong()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getFreeMemoryBytes() as Long
}


open fun getFreeMemoryKilobytesLong()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getFreeMemoryKilobytes() as Long
}


open fun getFreeMemoryMegabytesLong()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getFreeMemoryMegabytes() as Long
}


open fun getMaxMemoryBytesLong()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getMaxMemoryBytes() as Long
}


open fun getMaxMemoryKilobytesLong()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getMaxMemoryKilobytes() as Long
}


open fun getMaxMemoryMegabytesLong()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getMaxMemoryMegabytes() as Long
}


open fun getTotalMemoryBytesLong()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getTotalMemoryBytes() as Long
}


open fun getTotalMemoryKilobytesLong()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getTotalMemoryKilobytes() as Long
}


open fun getTotalMemoryMegabytesLong()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getTotalMemoryMegabytes() as Long
}


open fun getFreeMemoryBytesString()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getFreeMemoryBytesLong()!!.toString()
}


open fun getFreeMemoryKilobytesString()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getFreeMemoryKilobytesLong()!!.toString()
}


open fun getFreeMemoryMegabytesString()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getFreeMemoryMegabytesLong()!!.toString()
}


open fun getMaxMemoryBytesString()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getMaxMemoryBytesLong()!!.toString()
}


open fun getMaxMemoryKilobytesString()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getMaxMemoryKilobytesLong()!!.toString()
}


open fun getMaxMemoryMegabytesString()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getMaxMemoryMegabytesLong()!!.toString()
}


open fun getTotalMemoryBytesString()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getTotalMemoryBytesLong()!!.toString()
}


open fun getTotalMemoryKilobytesString()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getTotalMemoryKilobytesLong()!!.toString()
}


open fun getTotalMemoryMegabytesString()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getTotalMemoryMegabytesLong()!!.toString()
}


open fun getNumberOfThreads()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Thread.activeCount()
}


open fun getNumberOfThreadsLong()
        //nullable = true from not(false or (false and true)) = true
: Long

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getNumberOfThreads() as Long
}


open fun getNumberOfThreadsString()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getNumberOfThreadsLong()!!.toString()
}


open fun collectGarbage()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
runtime.gc()
}


}
                
            

