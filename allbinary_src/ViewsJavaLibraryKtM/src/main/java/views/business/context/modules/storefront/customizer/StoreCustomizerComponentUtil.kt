
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
        package views.business.context.modules.storefront.customizer



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.visual.transform.generator.TransformGeneratorUtil
import org.allbinary.logic.visual.transform.info.TransformInfo
import org.allbinary.logic.visual.transform.info.TransformInfoInterface

open public class StoreCustomizerComponentUtil
            : Object
         {
        

        companion object {


    private val instance: StoreCustomizerComponentUtil = StoreCustomizerComponentUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: StoreCustomizerComponentUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            
private constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun generate(abeClientInformation: AbeClientInformationInterface, transformInfoInterface: TransformInfoInterface)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var abeClientInformation = abeClientInformation


                    var transformInfoInterface = transformInfoInterface

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Generating Modified Views For: " +transformInfoInterface!!.getName(), this, 
                            "generateModifiedViews()")

                                    }
                                

    var customizerUtil: CustomizerUtil = CustomizerUtil.getInstance()!!
            


    var allCustomizedViews: Vector = customizerUtil!!.getTransformInfoObjectConfigGroupComponentNodes(transformInfoInterface)!!
            


    var size: Int = allCustomizedViews!!.size!!
            





                        for (index in 0 until size)


        {
    var nextTransformInfoInterface: TransformInfo = allCustomizedViews!!.get(index) as TransformInfo


    var allViewsToBeModified: Vector = customizerUtil!!.getTransformInfoObjectConfigComponentNodesToCustomize(transformInfoInterface, nextTransformInfoInterface)!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("View or component that was modified by a Customizer: " +nextTransformInfoInterface!!.getName(), this, 
                            "generateModifiedViews()")

                                    }
                                
generate(abeClientInformation, transformInfoInterface, allViewsToBeModified)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING
}


                @Throws(Exception::class)
            
open fun generate(abeClientInformation: AbeClientInformationInterface, transformInfoInterface: TransformInfoInterface, allViewsToBeModifiedVector: Vector)
        //nullable = true from not(false or (false and false)) = true
{

                    var abeClientInformation = abeClientInformation


                    var transformInfoInterface = transformInfoInterface


                    var allViewsToBeModifiedVector = allViewsToBeModifiedVector

    var customizerUtil: CustomizerUtil = CustomizerUtil.getInstance()!!
            


    var size: Int = allViewsToBeModifiedVector!!.size!!
            





                        for (index in 0 until size)


        {
    var nextTransformInfoInterface: TransformInfo = allViewsToBeModifiedVector!!.get(index) as TransformInfo


    var specifiedTransformInfoInterface: TransformInfoInterface = customizerUtil!!.getTransformInfoInterfaceToCustomize(transformInfoInterface, nextTransformInfoInterface)!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Retrieved: " +specifiedTransformInfoInterface!!.getName(), this, 
                            "generateModifiedViews()")

                                    }
                                
TransformGeneratorUtil.getInstance()!!.generate(abeClientInformation, nextTransformInfoInterface, specifiedTransformInfoInterface)
}

}


}
                
            

