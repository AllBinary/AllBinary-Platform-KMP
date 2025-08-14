
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
        
import org.allbinary.business.init.LicenseInitInfo
import org.allbinary.business.init.LicenseInitInfoUtil
import org.allbinary.logic.io.file.FileFactory
import org.allbinary.globals.PATH_GLOBALS
import org.allbinary.util.BasicArrayList

open public class PrintLicenseInitInfo
            : Object
         {
        

        companion object {
            
    val PATH: String = "G:\\mnt\\bc\\mydev\\work\\allbinary_src\\licensing\\data\\"

                @Throws(Exception::class)
            
open fun main(args: Array<String?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var args = args

    var initInfo: PrintLicenseInitInfo = PrintLicenseInitInfo(args)

initInfo!!.printInitInfo()
}


        }
            public constructor        (options: Array<String?>)
            : super()
        {

                    var options = options
LicenseInitInfoUtil.getInstance()!!.setFilePath(PATH +PATH_GLOBALS.getInstance()!!.INIT_PATH)
}


                @Throws(Exception::class)
            
open fun getLicenseInitInfo()
        //nullable = true from not(false or (false and true)) = true
: LicenseInitInfo{
    var licenseInitInfoUtil: LicenseInitInfoUtil = LicenseInitInfoUtil.getInstance()!!
            


    
                        if(FileFactory.getInstance()!!.isFile(licenseInitInfoUtil!!.getFilePath()))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return licenseInitInfoUtil!!.read()

                                    }
                                
                        else {
                            System.out.println("No Licence File at: " +licenseInitInfoUtil!!.getFilePath())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return LicenseInitInfo()

                        }
                            
}


open fun printInitInfo()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    var licenseInitInfo: LicenseInitInfo = this.getLicenseInitInfo()!!
            

System.out.println("License ID: " +licenseInitInfo!!.getLicenseId())

    var list: BasicArrayList = licenseInitInfo!!.getServerList()!!
            





                        for (index in 0 until list.size()!!)


        {System.out.println("Lic Serv: " +list.get(index))
}

} catch(e: Exception)
            {System.out.print("Error: " +e)
e.printStackTrace()
}

}


}
                
            

