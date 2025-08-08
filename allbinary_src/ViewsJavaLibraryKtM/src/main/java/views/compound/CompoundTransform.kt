
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
        package views.compound



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.InputStream
import javax.xml.transform.URIResolver
import org.allbinary.data.tree.dom.BasicUriResolver
import org.allbinary.data.tree.dom.StoreUriResolver
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.ServiceClientInformationInterfaceFactory
import org.allbinary.logic.visual.transform.AbTransformer
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import views.compound.objectConfig.CompoundContextTransformInfoObjectConfig

open public class CompoundTransform : AbTransformer {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val abeClientInformation: AbeClientInformationInterface = ServiceClientInformationInterfaceFactory.getInstance()!!
            
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface){

                    var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
this.setURIResolver(StoreUriResolver(this.getTransformInfoInterface(), this.getURIResolver() as BasicUriResolver) as URIResolver)

    var objectConfig: CompoundContextTransformInfoObjectConfig = CompoundContextTransformInfoObjectConfig(this.abeClientInformation, this.getTransformInfoInterface(), this.getTransformInfoInterface()!!.getObjectConfigInterface()!!.toXmlDoc())


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("\nObjectConfig: \n" +objectConfig!!.toString(), this, 
                            "CompoundTransform(")

                                    }
                                

    var templateInputStream: InputStream = objectConfig!!.createInputStream()!!
            

this.setInputStream(templateInputStream)
}


}
                
            

