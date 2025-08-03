
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.FileReader
import java.io.LineNumberReader
import java.util.Hashtable
import java.util.Vector
import org.allbinary.logic.NullUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory
import org.allbinary.logic.communication.log.config.type.LogConfigTypes
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.FilePathData
import org.allbinary.logic.io.file.directory.SubDirectory
import org.allbinary.logic.string.StringMaker
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
import org.allbinary.logic.system.hardware.components.linux.Cpu
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class LinuxHardware
            : Object
        
                , HardwareInterface {
        

        companion object {


    private val PCIFILE: String = "/proc/pci"


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var componentInterfaceVector: Vector

    private var videoInterfaceVector: Vector

    private var hardDriveControllerInterfaceVector: Vector

    private var cpuInterfaceVector: Vector

    private var usbInterfaceVector: Vector

    private var ethernetInterfaceVector: Vector

    private var multimediaInterfaceVector: Vector

    private var fireWireInterfaceVector: Vector

    private var bridgeInterfaceVector: Vector

    private var hardDriveInterfaceVector: Vector

    private var macInterfaceVector: Vector

    private var monitorInterfaceVector: Vector

    private val NAME: String = "Linux Hardware Profile"

    private val MINHARDWARE: Int = 5
public constructor        (path: String)
            : super()
        {

                    var path = path
this.init(path)
}

public constructor        ()
            : super()
        {this.init(PCIFILE)

    
                        if(componentInterfaceVector!!.size < MINHARDWARE)
                        
                                    {
                                    


                            throw Exception(
                            "Not Enough Data For A Valid License On Linux")

                                    }
                                

    var cpu: Cpu = Cpu()


    
                        if(cpu != 
                                    null
                                )
                        
                                    {
                                    cpuInterfaceVector!!.add(cpu)
componentInterfaceVector!!.add(cpu)

                                    }
                                

    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.OS))
                        
                                    {
                                    logUtil!!.put("Hardware Data: " +this.toString(), this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
}


                @Throws(Exception::class)
            
open fun init(filePath: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var filePath = filePath

    var lineNumberReader: LineNumberReader = 
                null
            


        try {
            init(lineNumberReader, filePath)
} catch(e: Exception)
            {
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.OS))
                        
                                    {
                                    logUtil!!.put("Hardware Data: " +this.toString(), this, this.commonStrings!!.CONSTRUCTOR, e)

                                    }
                                



                            throw e
}

}


                @Throws(Exception::class)
            
open fun init(lineNumberReader: LineNumberReader, filePath: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var lineNumberReader = lineNumberReader


                    var filePath = filePath

        try {
            componentInterfaceVector= Vector()
videoInterfaceVector= Vector()
hardDriveControllerInterfaceVector= Vector()
cpuInterfaceVector= Vector()
usbInterfaceVector= Vector()
ethernetInterfaceVector= Vector()
multimediaInterfaceVector= Vector()
fireWireInterfaceVector= Vector()
bridgeInterfaceVector= Vector()
hardDriveInterfaceVector= Vector()
macInterfaceVector= Vector()
monitorInterfaceVector= Vector()

    var pciFile: FileReader = FileReader(filePath)

lineNumberReader= LineNumberReader(pciFile)

    
                        if(lineNumberReader == 
                                    null
                                )
                        
                                    {
                                    
    var fileVector: BasicArrayList = SubDirectory.getInstance()!!.search(filePath, AbFile(FilePathData.getInstance()!!.SEPARATOR))!!
            


    
                        if(!fileVector!!.isEmpty())
                        
                                    {
                                    
    var file: AbFile = fileVector!!.get(0) as AbFile

lineNumberReader= LineNumberReader(FileReader(file!!.getPath()))

                                    }
                                

    
                        if(lineNumberReader == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception(
                            "No Linux File Data")

                                    }
                                

                                    }
                                

    
                        if(lineNumberReader != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.OS))
                        
                                    {
                                    logUtil!!.put(
                            "PCI File Found", this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                

    var nextLine: String = lineNumberReader!!.readLine()!!
            


        while(lineNumberReader != 
                                    null
                                 && nextLine != 
                                    null
                                )
        {
    
                        if(this.isNextHardware(nextLine))
                        
                                    {
                                    break;

                    

                                    }
                                
nextLine= lineNumberReader!!.readLine()
}


        while(this.isNextHardware(nextLine))
        {
    var componentData: StringMaker = StringMaker()


    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.OS))
                        
                                    {
                                    logUtil!!.put("Found Hardware Device: " +componentInterfaceVector!!.size, this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
componentData!!.append(nextLine)
componentData!!.append(
                            "\n")
nextLine= lineNumberReader!!.readLine()

    var componentType: String = PCComponentFactory.getInstance()!!.getComponentType(nextLine)!!
            


        while(lineNumberReader != 
                                    null
                                )
        {componentData!!.append(nextLine)
componentData!!.append(
                            "\n")
nextLine= lineNumberReader!!.readLine()

    
                        if(nextLine == 
                                    null
                                 || this.isNextHardware(nextLine))
                        
                                    {
                                    break;

                    

                                    }
                                
}


    var componentInterface: HardwareComponentInterface = PCComponentFactory.getInstance()!!.getInstance(componentType, componentData!!.toString())!!
            


    
                        if(componentInterface != 
                                    null
                                )
                        
                                    {
                                    componentInterfaceVector!!.add(componentInterface)

                                    }
                                
}


                                    }
                                
                        else {
                            
    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.OS))
                        
                                    {
                                    logUtil!!.put(
                            "Could not load PCI File", this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                

                        }
                            
lineNumberReader!!.close()

         finally {
            
    
                        if(lineNumberReader != 
                                    null
                                )
                        lineNumberReader!!.close()

         }
        
}


open fun getMultimedia(index: Int)
        //nullable = true from not(false or (false and false)) = true
: MediaInterface{

                    var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return multimediaInterfaceVector!!.get(index) as MediaInterface
}


open fun getBridge(index: Int)
        //nullable = true from not(false or (false and false)) = true
: BridgeInterface{

                    var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bridgeInterfaceVector!!.get(index) as BridgeInterface
}


open fun getCpu(index: Int)
        //nullable = true from not(false or (false and false)) = true
: CpuInterface{

                    var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cpuInterfaceVector!!.get(index) as CpuInterface
}


open fun getEthernet(index: Int)
        //nullable = true from not(false or (false and false)) = true
: EthernetInterface{

                    var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ethernetInterfaceVector!!.get(index) as EthernetInterface
}


open fun getFireWire(index: Int)
        //nullable = true from not(false or (false and false)) = true
: FireWireInterface{

                    var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return fireWireInterfaceVector!!.get(index) as FireWireInterface
}


open fun getHardDriveController(index: Int)
        //nullable = true from not(false or (false and false)) = true
: HardDriveControllerInterface{

                    var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hardDriveControllerInterfaceVector!!.get(index) as HardDriveControllerInterface
}


open fun getHardDrive(index: Int)
        //nullable = true from not(false or (false and false)) = true
: HardDriveInterface{

                    var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hardDriveInterfaceVector!!.get(index) as HardDriveInterface
}


open fun getMachineAccessControlAddress(index: Int)
        //nullable = true from not(false or (false and false)) = true
: MachineAccessControlAddressInterface{

                    var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return macInterfaceVector!!.get(index) as MachineAccessControlAddressInterface
}


open fun getMonitor(index: Int)
        //nullable = true from not(false or (false and false)) = true
: MonitorInterface{

                    var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return monitorInterfaceVector!!.get(index) as MonitorInterface
}


open fun getUsb(index: Int)
        //nullable = true from not(false or (false and false)) = true
: UsbInterface{

                    var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return usbInterfaceVector!!.get(index) as UsbInterface
}


open fun getVideo(index: Int)
        //nullable = true from not(false or (false and false)) = true
: VideoInterface{

                    var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return videoInterfaceVector!!.get(index) as VideoInterface
}


open fun getComponent(index: Int)
        //nullable = true from not(false or (false and false)) = true
: HardwareComponentInterface{

                    var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return componentInterfaceVector!!.get(index) as HardwareComponentInterface
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var hardwareBuffer: StringMaker = StringMaker()


    var size: Int = componentInterfaceVector!!.size!!
            





                        for (index in 0 until size)


        {
    var componentInterface: HardwareComponentInterface = componentInterfaceVector!!.get(index) as HardwareComponentInterface

hardwareBuffer!!.append(
                            "Component ")
hardwareBuffer!!.append(index)
hardwareBuffer!!.append(
                            ": \n")
hardwareBuffer!!.append(componentInterface!!.toString())
hardwareBuffer!!.append(
                            "\n")
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
                        return NullUtil.getInstance()!!.NULL_TABLE
}


open fun isNextHardware(nextLine: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var nextLine = nextLine

    
                        if(nextLine != 
                                    null
                                )
                        
                                    {
                                    
    var index: Int = nextLine!!.indexOf(
                            "Bus")!!
            


    
                        if(index >= 0 && index < 4)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

