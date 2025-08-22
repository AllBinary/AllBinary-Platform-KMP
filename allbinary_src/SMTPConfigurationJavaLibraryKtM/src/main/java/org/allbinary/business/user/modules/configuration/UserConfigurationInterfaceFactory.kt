
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
        package org.allbinary.business.user.modules.configuration




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.user.role.UserRole
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.globals.FREEBLISKET_PATH_GLOBALS
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.control.crypt.file.CryptFileReader
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.io.path.AbPathData
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class UserConfigurationInterfaceFactory
            : Object
         {
        

        companion object {
            
    private val configurationName: String = "DefaultUserConfiguration"

                @Throws(Exception::class)
            
open fun getInstance(document: Document)
        //nullable =  from not(true or (false and false)) = 
: UserConfigurationInterface{

                    var document = document

    var configurationNode: Node = DomSearchHelper.getNode(UserConfigurationData.NAME, document.getChildNodes())!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return UserConfigurationView(configurationNode).
                            getUserConfigurationInterface() as UserConfigurationInterface
}


                @Throws(Exception::class)
            
open fun getInstance(userRole: UserRole)
        //nullable =  from not(true or (false and false)) = 
: UserConfigurationInterface{

                    var userRole = userRole

    var abPath: AbPath = AbPath(URLGLOBALS.getMainPath() +FREEBLISKET_PATH_GLOBALS.getInstance()!!.USERCONFIGURATIONPATH, configurationName +userRole!!.toString() +AbPathData.getInstance()!!.EXTENSION_SEP +UserConfigurationData.UNCRYPTED_EXTENSION)


    var documentString: String = CryptFileReader(UserConfigurationData.UNCRYPTED_EXTENSION, UserConfigurationData.ENCRYPTED_EXTENSION).
                            get(abPath)!!


    var document: Document = DomDocumentHelper.create(documentString)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return UserConfigurationInterfaceFactory.getInstance(document)
}


                @Throws(Exception::class)
            
open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: UserConfigurationInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return UserConfiguration()
}


        }
            private constructor        ()
            : super()
        {}


}
                
            

