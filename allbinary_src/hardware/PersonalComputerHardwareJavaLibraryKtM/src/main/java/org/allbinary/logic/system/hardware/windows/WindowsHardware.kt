
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
        package org.allbinary.logic.system.hardware.windows




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListD
import org.allbinary.logic.StdUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.hardware.HardwareInterface
import org.allbinary.logic.system.hardware.components.ComponentFactory
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
import org.allbinary.string.CommonSeps

open public class WindowsHardware
            : Object
        
                , HardwareInterface {
        

    private var componentInterfaceVector: BasicArrayList

    private var videoInterfaceVector: BasicArrayList

    private var hardDriveControllerInterfaceVector: BasicArrayList

    private var cpuInterfaceVector: BasicArrayList

    private var usbInterfaceVector: BasicArrayList

    private var ethernetInterfaceVector: BasicArrayList

    private var multimediaInterfaceVector: BasicArrayList

    private var fireWireInterfaceVector: BasicArrayList

    private var bridgeInterfaceVector: BasicArrayList

    private var hardDriveInterfaceVector: BasicArrayList

    private var macInterfaceVector: BasicArrayList

    private var monitorInterfaceVector: BasicArrayList

    private val NAME: String = "Windows Hardware Profile"

    private val MINHARDWARE: Int = 0

    private val componentFactory: ComponentFactory = ComponentFactory.getInstance()!!
public constructor ()
            : super()
        {

        try {
            this.componentInterfaceVector= BasicArrayListD()
this.videoInterfaceVector= BasicArrayListD()
this.hardDriveControllerInterfaceVector= BasicArrayListD()
this.cpuInterfaceVector= BasicArrayListD()
this.usbInterfaceVector= BasicArrayListD()
this.ethernetInterfaceVector= BasicArrayListD()
this.multimediaInterfaceVector= BasicArrayListD()
this.fireWireInterfaceVector= BasicArrayListD()
this.bridgeInterfaceVector= BasicArrayListD()
this.hardDriveInterfaceVector= BasicArrayListD()
this.macInterfaceVector= BasicArrayListD()
this.monitorInterfaceVector= BasicArrayListD()

    
                        if(this.componentInterfaceVector!!.size() < this.MINHARDWARE)
                        
                                    throw Exception("Not Enough Data For A Valid License On Windows")
} catch(e: Exception)
            {



                            throw e
}

}


    open fun getComponentType(component: String)
        //nullable = true from not(false or (false and false)) = true
: String{
var component = component

    
                        if(component.indexOf(this.componentFactory!!.ETHERNET.toString()) >= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.componentFactory!!.ETHERNET.toString()

                                    }
                                
                             else 
    
                        if(component.indexOf(this.componentFactory!!.BRIDGE.toString()) >= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.componentFactory!!.BRIDGE.toString()

                                    }
                                
                             else 
    
                        if(component.indexOf(this.componentFactory!!.IDE.toString()) >= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.componentFactory!!.IDE.toString()

                                    }
                                
                             else 
    
                        if(component.indexOf(this.componentFactory!!.MULTIMEDIA.toString()) >= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.componentFactory!!.MULTIMEDIA.toString()

                                    }
                                
                             else 
    
                        if(component.indexOf(this.componentFactory!!.SCSI.toString()) >= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.componentFactory!!.SCSI.toString()

                                    }
                                
                             else 
    
                        if(component.indexOf(this.componentFactory!!.USB.toString()) >= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.componentFactory!!.USB.toString()

                                    }
                                
                             else 
    
                        if(component.indexOf(this.componentFactory!!.VGA.toString()) >= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.componentFactory!!.VGA.toString()

                                    }
                                
                             else 
    
                        if()
                        
}


    open fun getMultimedia(index: Int)
        //nullable = true from not(false or (false and false)) = true
: MediaInterface{
var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.multimediaInterfaceVector!!.get(index) as MediaInterface
}


    open fun getBridge(index: Int)
        //nullable = true from not(false or (false and false)) = true
: BridgeInterface{
var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.bridgeInterfaceVector!!.get(index) as BridgeInterface
}


    open fun getCpu(index: Int)
        //nullable = true from not(false or (false and false)) = true
: CpuInterface{
var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.cpuInterfaceVector!!.get(index) as CpuInterface
}


    open fun getEthernet(index: Int)
        //nullable = true from not(false or (false and false)) = true
: EthernetInterface{
var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.ethernetInterfaceVector!!.get(index) as EthernetInterface
}


    open fun getFireWire(index: Int)
        //nullable = true from not(false or (false and false)) = true
: FireWireInterface{
var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.fireWireInterfaceVector!!.get(index) as FireWireInterface
}


    open fun getHardDriveController(index: Int)
        //nullable = true from not(false or (false and false)) = true
: HardDriveControllerInterface{
var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.hardDriveControllerInterfaceVector!!.get(index) as HardDriveControllerInterface
}


    open fun getHardDrive(index: Int)
        //nullable = true from not(false or (false and false)) = true
: HardDriveInterface{
var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.hardDriveInterfaceVector!!.get(index) as HardDriveInterface
}


    open fun getMachineAccessControlAddress(index: Int)
        //nullable = true from not(false or (false and false)) = true
: MachineAccessControlAddressInterface{
var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.macInterfaceVector!!.get(index) as MachineAccessControlAddressInterface
}


    open fun getMonitor(index: Int)
        //nullable = true from not(false or (false and false)) = true
: MonitorInterface{
var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.monitorInterfaceVector!!.get(index) as MonitorInterface
}


    open fun getUsb(index: Int)
        //nullable = true from not(false or (false and false)) = true
: UsbInterface{
var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.usbInterfaceVector!!.get(index) as UsbInterface
}


    open fun getVideo(index: Int)
        //nullable = true from not(false or (false and false)) = true
: VideoInterface{
var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.videoInterfaceVector!!.get(index) as VideoInterface
}


    open fun getComponent(index: Int)
        //nullable = true from not(false or (false and false)) = true
: HardwareComponentInterface{
var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.componentInterfaceVector!!.get(index) as HardwareComponentInterface
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var hardwareBuffer: StringMaker = StringMaker()


    var size: Int = this.componentInterfaceVector!!.size()!!





                        for (index in 0 until size)

        {

    var componentInterface: HardwareComponentInterface = this.componentInterfaceVector!!.get(index) as HardwareComponentInterface

hardwareBuffer!!.append(componentInterface!!.toString())
hardwareBuffer!!.append(CommonSeps.getInstance()!!.NEW_LINE)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hardwareBuffer!!.toString()
}


    open fun compareTo(hardwareInterface: HardwareInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var hardwareInterface = hardwareInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


    open fun difference(hardwareInterface: HardwareInterface)
        //nullable = true from not(false or (false and false)) = true
: Hashtable<Any, Any>{
var hardwareInterface = hardwareInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StdUtil.getInstance()!!.NULL_TABLE
}


}
                
            

