
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
        package org.allbinary.logic.system.security.licensing




        import java.lang.Object        
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.BufferedReader
import java.io.InputStreamReader
import org.allbinary.business.init.LicenseInitInfo
import org.allbinary.business.init.LicenseInitInfoUtil
import org.allbinary.logic.io.file.FileFactory
import org.allbinary.globals.PATH_GLOBALS
import java.io.File
import java.io.FileReader
import java.io.LineNumberReader
import org.allbinary.util.BasicArrayList

open public class SetLicenseInitInfo
            : Object
         {
        

        companion object {
            
    private var stdinput: BufferedReader = BufferedReader(InputStreamReader(System.in))

                @Throws(Exception::class)
            
open fun main(args: Array<String?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var args = args

    var initInfo: SetLicenseInitInfo = SetLicenseInitInfo(args)

initInfo!!.createNewLicenseInitInfo(BasicArrayList())
}


        }
            
    private var vector: BasicArrayList = BasicArrayList()
public constructor        (options: Array<String?>)
            : super()
        {

                    var options = options
LicenseInitInfoUtil.getInstance()!!.setFilePath(PrintLicenseInitInfo.PATH +PATH_GLOBALS.getInstance()!!.INIT_PATH)




                        for (index in 1 until options.size)


        {vector.add(options[index]!!)
}

}


                @Throws(Exception::class)
            
open fun getLicenseInitInfo()
        //nullable = true from not(false or (false and true)) = true
: LicenseInitInfo{
    var licenseInitInfoUtil: LicenseInitInfoUtil = LicenseInitInfoUtil.getInstance()!!
            


    
                        if(FileFactory.getInstance()!!.isFile(licenseInitInfoUtil!!.INITFILENAME))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return licenseInitInfoUtil!!.read()

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return LicenseInitInfo()

                        }
                            
}


open fun createNewLicenseInitInfo(licenceServerVector: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var licenceServerVector = licenceServerVector

        try {
            
    
                        if(licenceServerVector == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception(
                            "null Vector Passed - Just Make Empty if you want")

                                    }
                                

    var licenseInitInfo: LicenseInitInfo = this.getLicenseInitInfo()!!
            

System.out.println(
                            "License Serv Example: http://www.dartstatistics.com/LicServ/serverssl.php")
licenseInitInfo!!.clearServers()

    var file: File = File(PrintLicenseInitInfo.PATH +"licenseservers.txt")


    var reader: FileReader = FileReader(file)


    var lineNumberReader: LineNumberReader = LineNumberReader(reader)

)


        {
    var line: String = lineNumberReader!!.readLine()!!
            


    
                        if(line != 
                                    null
                                )
                        
                                    {
                                    licenseInitInfo!!.addServer(line)

                                    }
                                
                        else {
                            break;

                    

                        }
                            
}

LicenseInitInfoUtil.getInstance()!!.write(licenseInitInfo)
LicenseInitInfoUtil.getInstance()!!.read()
} catch(e: Exception)
            {System.out.print("Error: " +e)
e.printStackTrace()
}

}


}
                
            

