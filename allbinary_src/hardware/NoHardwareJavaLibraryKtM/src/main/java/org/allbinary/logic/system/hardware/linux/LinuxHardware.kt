
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
        package org.allbinary.logic.system.hardware.linux




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.logic.NullUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.system.hardware.HardwareInterface
import org.allbinary.logic.system.hardware.components.interfaces.BridgeInterface
import org.allbinary.logic.system.hardware.components.interfaces.CpuInterface
import org.allbinary.logic.system.hardware.components.interfaces.EthernetInterface
import org.allbinary.logic.system.hardware.components.interfaces.FireWireInterface
import org.allbinary.logic.system.hardware.components.interfaces.HardDriveControllerInterface
import org.allbinary.logic.system.hardware.components.interfaces.HardDriveInterface
import org.allbinary.logic.system.hardware.components.interfaces.HardwareComponentInterface
import org.allbinary.logic.system.hardware.components.interfaces.MachineAccessControlAddressInterface
import org.allbinary.logic.system.hardware.components.interfaces.MediaInterface
import org.allbinary.logic.system.hardware.components.interfaces.MonitorInterface
import org.allbinary.logic.system.hardware.components.interfaces.UsbInterface
import org.allbinary.logic.system.hardware.components.interfaces.VideoInterface

open public class LinuxHardware
            : Object
        
                , HardwareInterface {
        
public constructor        ()
            : super()
        {}


open fun getMultimedia(index: Int)
        //nullable = true from not(false or (false and false)) = true
: MediaInterface{

                    var index = index



                            throw RuntimeException()
}


open fun getBridge(index: Int)
        //nullable = true from not(false or (false and false)) = true
: BridgeInterface{

                    var index = index



                            throw RuntimeException()
}


open fun getCpu(index: Int)
        //nullable = true from not(false or (false and false)) = true
: CpuInterface{

                    var index = index



                            throw RuntimeException()
}


open fun getEthernet(index: Int)
        //nullable = true from not(false or (false and false)) = true
: EthernetInterface{

                    var index = index



                            throw RuntimeException()
}


open fun getFireWire(index: Int)
        //nullable = true from not(false or (false and false)) = true
: FireWireInterface{

                    var index = index



                            throw RuntimeException()
}


open fun getHardDriveController(index: Int)
        //nullable = true from not(false or (false and false)) = true
: HardDriveControllerInterface{

                    var index = index



                            throw RuntimeException()
}


open fun getHardDrive(index: Int)
        //nullable = true from not(false or (false and false)) = true
: HardDriveInterface{

                    var index = index



                            throw RuntimeException()
}


open fun getMachineAccessControlAddress(index: Int)
        //nullable = true from not(false or (false and false)) = true
: MachineAccessControlAddressInterface{

                    var index = index



                            throw RuntimeException()
}


open fun getMonitor(index: Int)
        //nullable = true from not(false or (false and false)) = true
: MonitorInterface{

                    var index = index



                            throw RuntimeException()
}


open fun getUsb(index: Int)
        //nullable = true from not(false or (false and false)) = true
: UsbInterface{

                    var index = index



                            throw RuntimeException()
}


open fun getVideo(index: Int)
        //nullable = true from not(false or (false and false)) = true
: VideoInterface{

                    var index = index



                            throw RuntimeException()
}

override fun getComponent(index: Int)
        //nullable = true from not(false or (false and false)) = true
: HardwareComponentInterface{

                    var index = index



                            throw RuntimeException()
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING
}

override fun compareTo(hardwareInterface: HardwareInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var hardwareInterface = hardwareInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}

override fun difference(hardwareInterface: HardwareInterface)
        //nullable = true from not(false or (false and false)) = true
: Hashtable<Any, Any>{

                    var hardwareInterface = hardwareInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullUtil.getInstance()!!.NULL_TABLE
}


open fun isNextHardware(nextLine: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var nextLine = nextLine



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

