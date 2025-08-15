
        /* Generated Code Do Not Modify */
        package org.allbinary.logic.system.os.env




        import java.lang.Object        
        
        import java.lang.System
        
        import java.lang.Runtime
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Properties
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.os.GenericOperatingSystem
import org.allbinary.logic.system.os.OperatingSystemFactory
import org.allbinary.logic.system.os.OperatingSystems
import org.allbinary.string.CommonStrings

open public class RuntimeEnvironmentVariables
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            
public constructor        ()
            : super()
        {}


open fun getTest1()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return System.getProperty("java.java.home")
}


open fun getVariable(var: String)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var var = var

    var environmentVariables: Properties = this.get()!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return environmentVariables!!.getProperty(var)
}


open fun get()
        //nullable = true from not(false or (false and true)) = true
: Properties{
        try {
            
    var process: Process


    var environmentVariables: Properties = Properties()


    var operatingSystemInterface: GenericOperatingSystem = OperatingSystemFactory.getInstance()!!.getOperatingSystemInstance()!!
            


    var osName: String = operatingSystemInterface!!.getName()!!
            


    var linuxCommand: String = "env"


    var windowsCommand: String = "cmd.exe /c set"


    var solarisCommand: String = linuxCommand


    var operatingSystems: OperatingSystems = OperatingSystems.getInstance()!!
            


    
                        if(osName!!.compareTo(operatingSystems!!.LINUX) == 0)
                        
                                    {
                                    process= Runtime.getRuntime()!!.exec(linuxCommand)

                                    }
                                
                             else 
    
                        if(osName!!.indexOf(operatingSystems!!.WINDOWS) >= 0)
                        
                                    {
                                    process= Runtime.getRuntime()!!.exec(windowsCommand)

                                    }
                                
                             else 
    
                        if(osName!!.compareTo(operatingSystems!!.SOLARIS) == 0)
                        
                                    {
                                    process= Runtime.getRuntime()!!.exec(solarisCommand)

                                    }
                                
                        else {
                            


                            throw Exception()

                        }
                            

    var processInputStreamReader: InputStreamReader = InputStreamReader(process.getInputStream())


    var bufferedReader: BufferedReader = BufferedReader(processInputStreamReader)


    var keyValuePair: String


        while((keyValuePair= bufferedReader!!.readLine()) != 
                                    null
                                )
        {
    var index: Int = keyValuePair!!.indexOf('=')!!
            


    var key: String = keyValuePair!!.substring(0, index)!!
            


    var value: String = keyValuePair!!.substring(index +1)!!
            

environmentVariables!!.put(key, value)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return environmentVariables
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.OSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "get()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun getTempDir()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return System.getProperty("java.io.tmpdir")
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.OSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "getTempDir()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun getLibraryPath()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return System.getProperty("java.library.path")
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.OSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "getLibraryPath()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun getClassPath()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return System.getProperty("java.class.path")
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.OSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "getClassPath()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun updateLibraryPath(libPath: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var libPath = libPath

        try {
            
    var existingPath: String = this.getLibraryPath()!!
            

System.setProperty("java.library.path", libPath +":" +existingPath)
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.OSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "updateLibraryPath()", e)

                                    }
                                
}

}


open fun getUserHome()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return System.getProperty("user.home")
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.OSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "getUserHome()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun getUserDir()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return System.getProperty("user.dir")
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.OSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "getUserDir()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun set()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            } catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.OSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "get()", e)

                                    }
                                
}

}


open fun setVariable(var: String, val: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var var = var


                    var val = val

        try {
            
    var process: Process


    var operatingSystemInterface: GenericOperatingSystem = OperatingSystemFactory.getInstance()!!.getOperatingSystemInstance()!!
            


    var operatingSystems: OperatingSystems = OperatingSystems.getInstance()!!
            


    var osName: String = operatingSystemInterface!!.getName()!!
            


    var windowsCommand: String = "cmd.exe /c set" +var +"=" +val


    
                        if(osName!!.compareTo(operatingSystems!!.LINUX) == 0)
                        
                                    {
                                    


                            throw Exception()

                                    }
                                
                             else 
    
                        if(osName!!.indexOf(operatingSystems!!.WINDOWS) >= 0)
                        
                                    {
                                    process= Runtime.getRuntime()!!.exec(windowsCommand)

                                    }
                                
                             else 
    
                        if(osName!!.compareTo(operatingSystems!!.SOLARIS) == 0)
                        
                                    {
                                    


                            throw Exception()

                                    }
                                
                        else {
                            


                            throw Exception()

                        }
                            
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.OSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "setVariable()", e)

                                    }
                                
}

}


}
                
            

