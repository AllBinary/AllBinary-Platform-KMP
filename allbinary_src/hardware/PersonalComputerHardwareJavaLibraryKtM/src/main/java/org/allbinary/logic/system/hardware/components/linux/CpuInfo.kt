
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
        package org.allbinary.logic.system.hardware.components.linux




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class CpuInfo
            : Object
         {
        

        companion object {
            
    val PROCESSOR: CpuInfo = CpuInfo(
                            "processor")

    val VENDORID: CpuInfo = CpuInfo(
                            "vendor_id")

    val CPUFAMILY: CpuInfo = CpuInfo(
                            "cpu family")

    val MODEL: CpuInfo = CpuInfo(
                            "model")

    val MODELNAME: CpuInfo = CpuInfo(
                            "model name")

    val STEPPING: CpuInfo = CpuInfo(
                            "stepping")

    val CPUMHZ: CpuInfo = CpuInfo(
                            "cpu MHz")

    val CACHESIZE: CpuInfo = CpuInfo(
                            "cache size")

    val FDIVBUG: CpuInfo = CpuInfo(
                            "fdiv_bug")

    val HLTBUG: CpuInfo = CpuInfo(
                            "hlt_bug")

    val F00FBUG: CpuInfo = CpuInfo(
                            "f00f_bug")

    val COMABUG: CpuInfo = CpuInfo(
                            "coma_bug")

    val FPU: CpuInfo = CpuInfo(
                            "fpu")

    val FPUEXCEPTION: CpuInfo = CpuInfo(
                            "fpu_exception")

    val CPUIDLEVEL: CpuInfo = CpuInfo(
                            "cache size")

    val WP: CpuInfo = CpuInfo(
                            "yes")

    val FLAGS: CpuInfo = CpuInfo(
                            "flags")

    val BOGOMIPS: CpuInfo = CpuInfo(
                            "bogomips")

        }
            
    private var name: String
private constructor        (name: String)
            : super()
        {

                    var name = name
this.name= name
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}


}
                
            

