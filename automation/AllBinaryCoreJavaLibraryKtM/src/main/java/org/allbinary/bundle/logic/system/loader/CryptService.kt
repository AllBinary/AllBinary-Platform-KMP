
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
        package org.allbinary.bundle.logic.system.loader



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.ByteArrayInputStream
import java.io.InputStream
import org.allbinary.globals.Globals
import org.allbinary.globals.URLGLOBALS
import org.allbinary.gui.dialog.BasicTextJDialog
import org.allbinary.gui.dialog.ExitCloseListener
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.security.AbCryptUtil
import org.allbinary.logic.system.security.AbKeys
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.AbeLicenseInterface
import org.allbinary.logic.system.security.licensing.AbeLicenseInterfaceFactory
import org.allbinary.logic.system.security.licensing.AbeNoLicense
import org.allbinary.logic.system.security.licensing.LicensingException
import org.allbinary.string.CommonStrings

open public class CryptService
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val abCryptUtil: AbCryptUtil = AbCryptUtil.getInstance()!!
            
public constructor        ()
            : super()
        {Globals.getInstance()!!.init(this::class.getClassLoader(), 
                            "./")
logUtil!!.put("Set Globals: " +URLGLOBALS.getWebappPath(), this, this.commonStrings!!.CONSTRUCTOR)
}


open fun getDecryptedInputStream(abeClientInformation: AbeClientInformationInterface, name: String, inputStream: InputStream)
        //nullable = true from not(false or (false and false)) = true
: InputStream{

                    var abeClientInformation = abeClientInformation


                    var name = name


                    var inputStream = inputStream

        try {
            
    var key: String = AbKeys.getInstance()!!.getKey(abeClientInformation, name)!!
            


    var decrypted: ByteArray = this.abCryptUtil!!.decrypt(inputStream, key)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ByteArrayInputStream(decrypted)
} catch(e: LicensingException)
            {this.showLicenseDialog(abeClientInformation, e)
}
 catch(e: Exception)
            {this.showLicenseDialog(abeClientInformation, e)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun showLicenseDialog(abeClientInformation: AbeClientInformationInterface, e: Exception)
        //nullable = true from not(false or (false and false)) = true
{

                    var abeClientInformation = abeClientInformation


                    var e = e

        try {
            logUtil!!.put(commonStrings!!.EXCEPTION, this, this.commonStrings!!.INIT, e)

    var basicTextJDialog: BasicTextJDialog = BasicTextJDialog(e.getMessage())


        try {
            
    var abeLicenseInterface: AbeLicenseInterface = AbeLicenseInterfaceFactory.getInstance()!!.getLicenseInstance(abeClientInformation)!!
            


    
                        if(abeLicenseInterface != AbeNoLicense.getInstance())
                        
                                    {
                                    
    
                        if(abeLicenseInterface!!.isValid())
                        
                                    {
                                    basicTextJDialog!!.setText(
                            "Subscription Invalid")

                                    }
                                

                                    }
                                
} catch(e2: LicensingException)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, this.commonStrings!!.INIT, e2)
}

basicTextJDialog!!.addCloseListener(ExitCloseListener())
basicTextJDialog!!.setVisible(true)
} catch(e3: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, this.commonStrings!!.INIT, e3)
}

}


}
                
            

