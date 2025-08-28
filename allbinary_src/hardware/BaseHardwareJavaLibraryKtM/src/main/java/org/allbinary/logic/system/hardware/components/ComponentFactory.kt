
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
        package org.allbinary.logic.system.hardware.components




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.string.CommonStrings

open public class ComponentFactory
            : Object
         {
        

        companion object {
            
    private val instance: ComponentFactory = ComponentFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ComponentFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val VGA: Component = Component("VGA")

    val IDE: Component = Component("IDE")

    val SCSI: Component = Component("SCSI")

    val BRIDGE: Component = Component("bridge")

    val ETHERNET: Component = Component("Ethernet")

    val USB: Component = Component("USB")

    val MULTIMEDIA: Component = Component("Multimedia")

    val PCI: Component = Component("PCI")

    val RAID: Component = Component("RAID")

    val SMBUS: Component = Component("SMBus")

    val PIC: Component = Component("PIC")

    val Class: Component = Component("Class")

    val UNKNOWN: Component = Component(CommonStrings.getInstance()!!.UNKNOWN)

}
                
            

