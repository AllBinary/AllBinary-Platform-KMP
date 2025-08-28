
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
        
import java.io.FileReader
import java.io.LineNumberReader
import java.util.HashMap
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory
import org.allbinary.logic.communication.log.config.type.LogConfigTypes
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.FilePathData
import org.allbinary.logic.io.file.directory.SubDirectory
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.hardware.components.interfaces.CpuInterface
import org.allbinary.logic.system.hardware.components.interfaces.HardwareComponentInterface
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class Cpu
            : Object
        
                , CpuInterface
                , HardwareComponentInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val CPUFILE: String = "/proc/cpuinfo"

    private var cpuHashMap: HashMap<Any, Any>
public constructor        (filePath: String)
            : super()
        {
var filePath = filePath
this.init(filePath)
}

public constructor        ()
            : super()
        {
this.init(CPUFILE)
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
                                    logUtil!!.put(StringMaker().
                            append("Cpu Data: ")!!.append(this.toString())!!.toString(), this, this.commonStrings!!.CONSTRUCTOR, e)

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
            
    var fileReader: FileReader = FileReader(filePath)

lineNumberReader= LineNumberReader(fileReader)
cpuHashMap= HashMap<Any, Any>()

    
                        if(lineNumberReader == 
                                    null
                                )
                        
                                    {
                                    
    var fileVector: BasicArrayList = SubDirectory.getInstance()!!.search(filePath, AbFile(FilePathData.getInstance()!!.SEPARATOR))!!


    
                        if(LogConfigTypes.LOGGING.contains(LogConfigTypeFactory.getInstance()!!.OS))
                        
                                    {
                                    logUtil!!.put(StringMaker().
                            append("Cpu File Vector Size: ")!!.append(fileVector!!.size())!!.toString(), this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                

    
                        if(!fileVector!!.isEmpty())
                        
                                    {
                                    
    var file: AbFile = fileVector!!.get(0) as AbFile

lineNumberReader= LineNumberReader(FileReader(file.getPath()))

                                    }
                                

                                    }
                                

    
                        if(lineNumberReader != 
                                    null
                                )
                        
                                    {
                                    
    var nextLine: String = lineNumberReader!!.readLine()!!


        while(lineNumberReader != 
                                    null
                                 && nextLine != 
                                    null
                                )
        {

    var index: Int = nextLine!!.indexOf(':')!!


    
                        if(index >= 0)
                        
                                    {
                                    
    var key: String = nextLine!!.substring(0, index)!!


    var valueIndex: Int = index +1


    var value: String = nextLine!!.substring(valueIndex, nextLine!!.length)!!


    
                        if(key.indexOf(CpuInfo.PROCESSOR.toString()) >= 0)
                        cpuHashMap!!.put(CpuInfo.PROCESSOR, value)

    
                        if(key.indexOf(CpuInfo.VENDORID.toString()) >= 0)
                        cpuHashMap!!.put(CpuInfo.VENDORID, value)

    
                        if(key.indexOf(CpuInfo.CPUFAMILY.toString()) >= 0)
                        cpuHashMap!!.put(CpuInfo.CPUFAMILY, value)

    
                        if(key.indexOf(CpuInfo.MODEL.toString()) >= 0)
                        cpuHashMap!!.put(CpuInfo.MODEL, value)

    
                        if(key.indexOf(CpuInfo.MODELNAME.toString()) >= 0)
                        cpuHashMap!!.put(CpuInfo.MODELNAME, value)

    
                        if(key.indexOf(CpuInfo.STEPPING.toString()) >= 0)
                        cpuHashMap!!.put(CpuInfo.STEPPING, value)

    
                        if(key.indexOf(CpuInfo.CPUMHZ.toString()) >= 0)
                        cpuHashMap!!.put(CpuInfo.CPUMHZ, value)

    
                        if(key.indexOf(CpuInfo.CACHESIZE.toString()) >= 0)
                        cpuHashMap!!.put(CpuInfo.CACHESIZE, value)

                                    }
                                
nextLine= lineNumberReader!!.readLine()
}


                                    }
                                

         finally {
            
    
                        if(lineNumberReader != 
                                    null
                                )
                        lineNumberReader!!.close()

         }
        
}


open fun getProcessor()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cpuHashMap!!.get(CpuInfo.PROCESSOR) as String
}


open fun getVendorId()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cpuHashMap!!.get(CpuInfo.VENDORID) as String
}


open fun getCpuFamily()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cpuHashMap!!.get(CpuInfo.CPUFAMILY) as String
}


open fun getModel()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cpuHashMap!!.get(CpuInfo.MODEL) as String
}


open fun getModelName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cpuHashMap!!.get(CpuInfo.MODELNAME) as String
}


open fun getStepping()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cpuHashMap!!.get(CpuInfo.STEPPING) as String
}


open fun getCpuSpeed()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cpuHashMap!!.get(CpuInfo.CPUMHZ) as String
}


open fun getCacheSize()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cpuHashMap!!.get(CpuInfo.CACHESIZE) as String
}


open fun compareTo(cpuInterface: CpuInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var cpuInterface = cpuInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


open fun compareTo(componentInterface: HardwareComponentInterface)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var componentInterface = componentInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var commonLabels: CommonLabels = CommonLabels.getInstance()!!


    var commonSeps: CommonSeps = CommonSeps.getInstance()!!


    var stringMaker: StringMaker = StringMaker()

stringMaker!!.append(CpuInfo.PROCESSOR.toString())!!.append(commonLabels!!.COLON_SEP)!!.append(this.getProcessor())
stringMaker!!.append(commonSeps!!.NEW_LINE)
stringMaker!!.append(CpuInfo.VENDORID.toString())!!.append(commonLabels!!.COLON_SEP)!!.append(this.getVendorId())
stringMaker!!.append(commonSeps!!.NEW_LINE)
stringMaker!!.append(CpuInfo.CPUFAMILY.toString())!!.append(commonLabels!!.COLON_SEP)!!.append(this.getCpuFamily())
stringMaker!!.append(commonSeps!!.NEW_LINE)
stringMaker!!.append(CpuInfo.MODEL.toString())!!.append(commonLabels!!.COLON_SEP)!!.append(this.getModel())
stringMaker!!.append(commonSeps!!.NEW_LINE)
stringMaker!!.append(CpuInfo.MODELNAME.toString())!!.append(commonLabels!!.COLON_SEP)!!.append(this.getModelName())
stringMaker!!.append(commonSeps!!.NEW_LINE)
stringMaker!!.append(CpuInfo.STEPPING.toString())!!.append(commonLabels!!.COLON_SEP)!!.append(this.getStepping())
stringMaker!!.append(commonSeps!!.NEW_LINE)
stringMaker!!.append(CpuInfo.CPUMHZ.toString())!!.append(commonLabels!!.COLON_SEP)!!.append(this.getCpuSpeed())
stringMaker!!.append(commonSeps!!.NEW_LINE)
stringMaker!!.append(CpuInfo.CACHESIZE.toString())!!.append(commonLabels!!.COLON_SEP)!!.append(this.getCacheSize())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringMaker!!.toString()
}


}
                
            

