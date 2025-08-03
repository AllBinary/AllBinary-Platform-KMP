
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
        package org.allbinary.logic.visual.transform.info.objectConfig



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.crypt.file.CryptFileReader
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Document

open public class TransformInfoObjectConfigAndManipulatorFactory : TransformInfoObjectConfigAndManipulatorFactoryBase {
        

        companion object {


    private val instance: TransformInfoObjectConfigAndManipulatorFactory = TransformInfoObjectConfigAndManipulatorFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TransformInfoObjectConfigAndManipulatorFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            
private constructor        (){}


                @Throws(Exception::class)
            
open fun getInstance(abeClientInformation: AbeClientInformationInterface, transformInfoInterface: TransformInfoInterface, objectConfigFileAbPath: AbPath)
        //nullable =  from not(true or (false and false)) = 
: TransformInfoObjectConfigInterface{

                    var abeClientInformation = abeClientInformation


                    var transformInfoInterface = transformInfoInterface


                    var objectConfigFileAbPath = objectConfigFileAbPath

        try {
            
    var data: String = CryptFileReader(TransformInfoObjectConfigData.getInstance()!!.UNCRYPTED_EXTENSION, TransformInfoObjectConfigData.getInstance()!!.ENCRYPTED_EXTENSION).
                            get(objectConfigFileAbPath)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getInstance(abeClientInformation, transformInfoInterface, DomDocumentHelper.create(data))
} catch(e: Exception)
            {
    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put(
                            "Could Not Load Object Config", getInstance(), commonStrings!!.GET_INSTANCE, e)

                                    }
                                



                            throw e
}

}


                @Throws(Exception::class)
            
open fun getInstance(abeClientInformation: AbeClientInformationInterface, transformInfoInterface: TransformInfoInterface)
        //nullable =  from not(true or (false and false)) = 
: TransformInfoObjectConfigInterface{

                    var abeClientInformation = abeClientInformation


                    var transformInfoInterface = transformInfoInterface

        try {
            
    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!
            


    
                        if(transformInfoInterface != 
                                    null
                                 && !stringValidationUtil!!.isEmpty(transformInfoInterface!!.getStoreName()))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GenericStoreTransformInfoObjectConfig(abeClientInformation, transformInfoInterface) as TransformInfoObjectConfigInterface

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TransformInfoObjectConfig(transformInfoInterface) as TransformInfoObjectConfigInterface

                        }
                            
} catch(e: Exception)
            {
    var error: String = "Failed To Get Instance: "


    
                        if(transformInfoInterface != 
                                    null
                                )
                        
                                    {
                                    error= error +transformInfoInterface!!.getName()

                                    }
                                

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, getInstance(), commonStrings!!.GET_INSTANCE, e)

                                    }
                                



                            throw e
}

}


                @Throws(Exception::class)
            
open fun getInstance(abeClientInformation: AbeClientInformationInterface, transformInfoInterface: TransformInfoInterface, document: Document)
        //nullable =  from not(true or (false and false)) = 
: TransformInfoObjectConfigInterface{

                    var abeClientInformation = abeClientInformation


                    var transformInfoInterface = transformInfoInterface


                    var document = document

        try {
            
    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!
            


    
                        if(transformInfoInterface != 
                                    null
                                 && !stringValidationUtil!!.isEmpty(transformInfoInterface!!.getStoreName()))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GenericStoreTransformInfoObjectConfig(abeClientInformation, transformInfoInterface, document) as TransformInfoObjectConfigInterface

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TransformInfoObjectConfig(transformInfoInterface, document) as TransformInfoObjectConfigInterface

                        }
                            
} catch(e: Exception)
            {
    var error: String = "Failed To Get Instance: "


    
                        if(transformInfoInterface != 
                                    null
                                )
                        
                                    {
                                    error= error +transformInfoInterface!!.getName()

                                    }
                                

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORYERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, getInstance(), 
                            "getInstance(document)", e)

                                    }
                                



                            throw e
}

}


}
                
            

