
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
        package org.allbinary.logic.system.hardware.android




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.Closeable
import java.io.FileReader
import java.io.LineNumberReader
import java.util.Hashtable
import org.allbinary.logic.io.NullCloseable
import org.allbinary.logic.NullUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.hardware.HardwareInterface
import org.allbinary.logic.system.hardware.components.android.UnknownHardware
import org.allbinary.logic.system.hardware.components.interfaces.HardwareComponentInterface
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class AndroidHardware
            : Object
        
                , HardwareInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var componentInterfaceVector: BasicArrayList = BasicArrayList()

    private val PROC_BUS_INPUT_DIRECTORY: String = "/proc/bus/input/"

    private val DEVICES: String = PROC_BUS_INPUT_DIRECTORY +"devices/"

    private val MINHARDWARE: Int = 3
public constructor        ()
            : super()
        {this.init(DEVICES)

    
                        if(componentInterfaceVector!!.size() < MINHARDWARE)
                        
                                    {
                                    


                            throw Exception("Not Enough Data For A Valid License On Linux")

                                    }
                                
}


                @Throws(Exception::class)
            
open fun init(filePath: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var filePath = filePath

    var lineNumberReader: Closeable = NullCloseable.NULL_CLOSEABLE


        try {
            lineNumberReader= this.get(filePath)
} catch(e: Exception)
            {logUtil!!.put("Hardware Data: " +this.toString(), this, commonStrings!!.INIT, e)



                            throw e
}

         finally {
            
    
                        if(lineNumberReader != 
                                    null
                                )
                        
                                    {
                                    lineNumberReader!!.close()

                                    }
                                

         }
        
}


                @Throws(Exception::class)
            
open fun get(filePath: String)
        //nullable = true from not(false or (false and false)) = true
: LineNumberReader{

                    var filePath = filePath
componentInterfaceVector= BasicArrayList()

    var pciFile: FileReader = FileReader(filePath)


    var lineNumberReader: LineNumberReader = LineNumberReader(pciFile)

logUtil!!.put("File Found", this, commonStrings!!.CONSTRUCTOR)

    var nextLine: String = lineNumberReader!!.readLine()!!
            


        while(nextLine != 
                                    null
                                )
        {nextLine= lineNumberReader!!.readLine()
componentInterfaceVector!!.add(UnknownHardware(nextLine))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return lineNumberReader
}

override fun getComponent(index: Int)
        //nullable = true from not(false or (false and false)) = true
: HardwareComponentInterface{

                    var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return componentInterfaceVector!!.get(index) as HardwareComponentInterface
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var hardwareBuffer: StringBuilder = StringBuilder()


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


}
                
            

