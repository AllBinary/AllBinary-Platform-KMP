
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
        package org.allbinary.logic.visual.transform.info




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.loader.AbeFactory
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.LicensingException
import org.allbinary.logic.visual.transform.TransformInterface
import org.allbinary.string.CommonStrings

open public class TransformInfoObjectFactory
            : Object
         {
        

        companion object {
            
    private val instance: TransformInfoObjectFactory = TransformInfoObjectFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TransformInfoObjectFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
private constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun getInstance(abeClientInformation: AbeClientInformationInterface, transformInfoInterface: TransformInfoInterface)
        //nullable =  from not(true or (false and false)) = 
: TransformInterface{

                    var abeClientInformation = abeClientInformation


                    var transformInfoInterface = transformInfoInterface

        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORY))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put("Creating View: " +transformInfoInterface!!.getName(), this, commonStrings!!.GET_INSTANCE)

                                    }
                                

    var params: Array<Any?> = arrayOfNulls(1)


    var classes: Array<KClass<*>?> = arrayOfNulls(1)

classes[0]= 
                                    //Otherwise - expression - AssignExpr - value - ClassExpr

params[0]= transformInfoInterface as Object

    var anyType: TransformInterface = AbeFactory.getInstance()!!.getInstance(abeClientInformation, transformInfoInterface!!.getObjectFile(), classes, params) as TransformInterface


    
                        if(anyType == 
                                    null
                                )
                        
                                    {
                                    
    
                        if(transformInfoInterface != 
                                    null
                                )
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("\nNo Such View Name: ")
stringBuffer!!.append(transformInfoInterface!!.getName())
stringBuffer!!.append("\nNo Such View Object: ")
stringBuffer!!.append(transformInfoInterface!!.getObjectFile())



                            throw Exception(stringBuffer!!.toString())

                                    }
                                
                        else {
                            


                            throw Exception("No Such View Object since transformInfo is null")

                        }
                            

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return anyType
} catch(e: LicensingException)
            {
    var error: String = "Failed To Get Instance: "


    
                        if(transformInfoInterface != 
                                    null
                                )
                        
                                    {
                                    error= error +transformInfoInterface!!.getName()

                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORYERROR))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(error, this, commonStrings!!.GET_INSTANCE, e)

                                    }
                                



                            throw e
}
 catch(e: Exception)
            {
    var error: String = "Failed To Get Instance: "


    
                        if(transformInfoInterface != 
                                    null
                                )
                        
                                    {
                                    error= error +transformInfoInterface!!.getName()

                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORYERROR))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put(error, this, commonStrings!!.GET_INSTANCE, e)

                                    }
                                



                            throw e
}

}


}
                
            

