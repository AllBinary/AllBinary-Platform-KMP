
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
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory
import org.allbinary.logic.communication.log.config.type.LogConfigTypes
import org.allbinary.logic.system.hardware.components.ComponentFactory
import org.allbinary.logic.system.hardware.components.interfaces.HardwareComponentInterface
import org.allbinary.logic.system.hardware.components.linux.Bridge
import org.allbinary.logic.system.hardware.components.linux.Ethernet
import org.allbinary.logic.system.hardware.components.linux.HardDriveController
import org.allbinary.logic.system.hardware.components.linux.Media
import org.allbinary.logic.system.hardware.components.linux.PCI
import org.allbinary.logic.system.hardware.components.linux.Unknown
import org.allbinary.logic.system.hardware.components.linux.Usb
import org.allbinary.logic.system.hardware.components.linux.Video
import org.allbinary.string.CommonStrings

open public class PCComponentFactory
            : Object
         {
        

        companion object {


    private val instance: PCComponentFactory = PCComponentFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PCComponentFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val componentFactory: ComponentFactory = ComponentFactory.getInstance()!!
            
private constructor        ()
            : super()
        {}


open fun getInstance(component: String, componentData: String)
        //nullable =  from not(true or (false and false)) = 
: HardwareComponentInterface{

                    var component = component


                    var componentData = componentData

        try {
            
    
                        if(component != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(component!!.compareTo(this.componentFactory!!.ETHERNET.toString()) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Ethernet(componentData) as HardwareComponentInterface

                                    }
                                
                             else 
    
                        if(component!!.compareTo(this.componentFactory!!.BRIDGE.toString()) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Bridge(componentData) as HardwareComponentInterface

                                    }
                                
                             else 
    
                        if(component!!.compareTo(this.componentFactory!!.IDE.toString()) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return HardDriveController(componentData) as HardwareComponentInterface

                                    }
                                
                             else 
    
                        if(component!!.compareTo(this.componentFactory!!.MULTIMEDIA.toString()) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Media(componentData) as HardwareComponentInterface

                                    }
                                
                             else 
    
                        if(component!!.compareTo(this.componentFactory!!.SCSI.toString()) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return HardDriveController(componentData) as HardwareComponentInterface

                                    }
                                
                             else 
    
                        if(component!!.compareTo(this.componentFactory!!.USB.toString()) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Usb(componentData) as HardwareComponentInterface

                                    }
                                
                             else 
    
                        if(component!!.compareTo(this.componentFactory!!.VGA.toString()) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Video(componentData) as HardwareComponentInterface

                                    }
                                
                             else 
    
                        if(component!!.compareTo(this.componentFactory!!.PCI.toString()) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PCI(componentData) as HardwareComponentInterface

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Unknown(componentData) as HardwareComponentInterface
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            


    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.FACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.GET_INSTANCE, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Unknown(commonStrings!!.EXCEPTION)
}

}


open fun getComponentType(component: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var component = component

    
                        if(component!!.indexOf(this.componentFactory!!.ETHERNET.toString()) >= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.componentFactory!!.ETHERNET.toString()

                                    }
                                
                             else 
    
                        if(component!!.indexOf(this.componentFactory!!.BRIDGE.toString()) >= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.componentFactory!!.BRIDGE.toString()

                                    }
                                
                             else 
    
                        if(component!!.indexOf(this.componentFactory!!.IDE.toString()) >= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.componentFactory!!.IDE.toString()

                                    }
                                
                             else 
    
                        if(component!!.indexOf(this.componentFactory!!.MULTIMEDIA.toString()) >= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.componentFactory!!.MULTIMEDIA.toString()

                                    }
                                
                             else 
    
                        if(component!!.indexOf(this.componentFactory!!.SCSI.toString()) >= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.componentFactory!!.SCSI.toString()

                                    }
                                
                             else 
    
                        if(component!!.indexOf(this.componentFactory!!.USB.toString()) >= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.componentFactory!!.USB.toString()

                                    }
                                
                             else 
    
                        if(component!!.indexOf(this.componentFactory!!.VGA.toString()) >= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.componentFactory!!.VGA.toString()

                                    }
                                
                             else 
    
                        if(component!!.compareTo(this.componentFactory!!.PCI.toString()) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.componentFactory!!.PCI.toString()

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.componentFactory!!.UNKNOWN.toString()
}


}
                
            

