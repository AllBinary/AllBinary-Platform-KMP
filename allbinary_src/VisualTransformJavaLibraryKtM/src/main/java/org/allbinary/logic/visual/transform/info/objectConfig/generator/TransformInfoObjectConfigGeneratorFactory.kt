
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
        package org.allbinary.logic.visual.transform.info.objectConfig.generator




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.InputOutputTypeData
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.string.CommonStrings

open public class TransformInfoObjectConfigGeneratorFactory
            : Object
        
                , TransformInfoObjectConfigGeneratorFactoryInterface {
        
companion object {
            
    private val instance: TransformInfoObjectConfigGeneratorFactory = TransformInfoObjectConfigGeneratorFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: TransformInfoObjectConfigGeneratorFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
private constructor ()
            : super()
        {
}


                @Throws(Exception::class)
            
    open fun getInstance(transformInfoInterface: TransformInfoInterface)
        //nullable =  from not(true or (false and false)) = 
: TransformInfoObjectConfigGenerator{
var transformInfoInterface = transformInfoInterface

    var type: String = transformInfoInterface!!.getObjectConfigInterface()!!.getOutputTypeName() as String


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

logUtil!!.put("Generating Instance for type: " +type, this, commonStrings!!.GET_INSTANCE)

                                    }
                                

    
                        if(type == 
                                    null
                                 || type.compareTo(InputOutputTypeData.getInstance()!!.RESPONSE) == 0 || transformInfoInterface!!.isChild())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return BasicGenerator()

                                    }
                                
                             else 
    
                        if(type.compareTo(InputOutputTypeData.getInstance()!!.FILE) == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StoreFileGenerator(transformInfoInterface)

                                    }
                                
                        else {
                            


                            throw Exception("No Such TransformInfoObjectConfigGenerator Type")

                        }
                            
}


}
                
            

