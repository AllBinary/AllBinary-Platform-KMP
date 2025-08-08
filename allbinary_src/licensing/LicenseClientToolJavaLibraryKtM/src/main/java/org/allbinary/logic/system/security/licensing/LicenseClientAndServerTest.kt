
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.business.init.LicenseInitInfo
import org.allbinary.business.init.LicenseInitInfoUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.security.licensing.client.XmlRpcAbeLicenseRetrievalClient
import org.allbinary.globals.PATH_GLOBALS
import java.io.File
import java.io.FileReader
import java.io.LineNumberReader
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.util.BasicArrayList

open public class LicenseClientAndServerTest
            : Object
         {
        

        companion object {


open fun main(args: Array<String?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var args = args

        try {
            
    var licensingTest: LicenseClientAndServerTest = LicenseClientAndServerTest(args)

licensingTest!!.test()
} catch(e: Exception)
            {logUtil!!.put(this.commonStrings!!.EXCEPTION, 
                            "main()", 
                            "main()", e)
}

}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var vector: BasicArrayList = BasicArrayList()
public constructor        (options: Array<String?>)
            : super()
        {

                    var options = options
LicenseInitInfoUtil.getInstance()!!.setFilePath(PrintLicenseInitInfo.PATH +PATH_GLOBALS.getInstance()!!.INIT_PATH)




                        for (index in 1 until options.size)


        {vector.add(options[index]!!)
}


    
                        if(options.size < 2)
                        
                                    {
                                    
    var file: File = File(PrintLicenseInitInfo.PATH +"testlicenseservers.txt")


    var reader: FileReader = FileReader(file)


    var lineNumberReader: LineNumberReader = LineNumberReader(reader)

)


        {
    var line: String = lineNumberReader!!.readLine()!!
            


    
                        if(line != 
                                    null
                                )
                        
                                    {
                                    vector.add(line)

                                    }
                                
                        else {
                            break;

                    

                        }
                            
}


                                    }
                                
}


open fun test()
        //nullable = true from not(false or (false and true)) = true
{
    var stringBuffer: StringMaker = StringMaker()


        try {
            
    var list: BasicArrayList = BasicArrayList()


    var TESTING: String = "Testing with new licence:<br/>"


    var PROCESSING: String = "Processing: <br/>"


    var END: String = "<br/>End<br/>"


    var RESULT: String = "Test Result: "





                        for (index in 0 until vector.size()!!)


        {stringBuffer!!.append(TESTING)

    var serverName: String = vector.get(index) as String


        try {
            
    var licenseInitInfo: LicenseInitInfo = LicenseInitInfo()

licenseInitInfo!!.addServer(serverName)
LicenseInitInfoUtil.getInstance()!!.write(licenseInitInfo)

    var abeClientInformation: AbeClientInformationInterface = AbeClientInformationInterfaceFactory.getInstance()!!
            


    var xmlRpcAbeLicenseClient: XmlRpcAbeLicenseRetrievalClient = XmlRpcAbeLicenseRetrievalClient(abeClientInformation)


    var abeLicenseInterface: AbeLicenseInterface = xmlRpcAbeLicenseClient!!.get(
                            null) as AbeLicenseInterface


    
                        if(abeLicenseInterface != 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append(PROCESSING)
stringBuffer!!.append(abeLicenseInterface!!.toString())

                                    }
                                
stringBuffer!!.append(END)
logUtil!!.put(RESULT +stringBuffer!!.toString(), this, 
                            "test")
stringBuffer!!.delete(0, stringBuffer!!.length())
} catch(e: Exception)
            {list.add(serverName)
logUtil!!.put("Test Error: " +stringBuffer!!.toString(), this, 
                            "test", e)
}

}

logUtil!!.put("Total Servers Failed: " +list.size() +" Failed Servers: " +list.toString(), this, 
                            "test")
} catch(e: Exception)
            {logUtil!!.put("Test Error: " +stringBuffer!!.toString(), this, 
                            "test", e)
}

}


}
                
            

