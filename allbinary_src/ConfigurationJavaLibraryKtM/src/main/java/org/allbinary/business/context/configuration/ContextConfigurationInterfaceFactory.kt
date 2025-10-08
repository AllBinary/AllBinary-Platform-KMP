
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
        package org.allbinary.business.context.configuration




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.logic.control.crypt.file.CryptFileReader
import org.allbinary.logic.io.path.AbPath
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class ContextConfigurationInterfaceFactory
            : Object
         {
        
companion object {
            
    private val instance: ContextConfigurationInterfaceFactory = ContextConfigurationInterfaceFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ContextConfigurationInterfaceFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor ()
            : super()
        {
}


                @Throws(Exception::class)
            
    open fun getInstance(document: Document)
        //nullable =  from not(true or (false and false)) = 
: ContextConfigurationInterface{
    //var document = document

    var contextConfigurationData: ContextConfigurationData = ContextConfigurationData.getInstance()!!


    var contextConfigurationNode: Node = DomSearchHelper.getNode(contextConfigurationData!!.NAME, document.getChildNodes())!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ContextConfigurationView(contextConfigurationNode).
                            getContextConfigurationInterface() as ContextConfigurationInterface
}


                @Throws(Exception::class)
            
    open fun getInstance(contextName: String)
        //nullable =  from not(true or (false and false)) = 
: ContextConfigurationInterface{
    //var contextName = contextName

    var abPath: AbPath = ContextConfigurationPathUtil.getAbPath(contextName)!!


    var contextConfigurationData: ContextConfigurationData = ContextConfigurationData.getInstance()!!


    var documentString: String = CryptFileReader(contextConfigurationData!!.UNCRYPTED_EXTENSION, contextConfigurationData!!.ENCRYPTED_EXTENSION).
                            get(abPath)!!


    var document: Document = DomDocumentHelper.create(documentString)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getInstance(document)
}


}
                
            

