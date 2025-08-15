
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
        package views.business.context.modules.storefront




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.visual.transform.StoreTransformer
import org.allbinary.logic.visual.transform.data.TransformStoreDocumentFactory
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.string.CommonStrings
import views.HttpComponentView

open public class HttpStoreComponentView : HttpComponentView {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface){

                    var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("View Name: " +transformInfoInterface!!.getName(), this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
this.setTransformDocumentInterface(TransformStoreDocumentFactory.getInstance(this.getPageContext(), this.getWeblisketSession()))
}


                @Throws(Exception::class)
            
open fun view()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, "view")

                                    }
                                
this.toXmlDoc()

    var success: String = DomDocumentHelper.toString(this.getDoc())!!
            


    var result: String = StoreTransformer(this.abeClientInformation, this.getTransformInfoInterface()).
                            translate(success)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "view", e)

                                    }
                                



                            throw e
}

}


}
                
            

