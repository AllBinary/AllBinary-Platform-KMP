
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
        package views.business.context.modules.storefront.customizer.bodies.generic.title




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.page.PageData
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.visual.transform.StoreTransformer
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.logic.visual.transform.template.customizer.bodies.title.TitleBodyValidation
import org.allbinary.logic.visual.transform.template.util.TransformTemplateCustomizerUtil
import org.apache.commons.lang3.StringEscapeUtils
import org.w3c.dom.Document
import org.w3c.dom.Node
import views.business.context.modules.storefront.HttpStoreComponentView

open public class TitleBodyCustomizerView : HttpStoreComponentView
                , DomNodeInterface {
        

        companion object {
            
    private val NAME: String = "None"

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    var titleBody: TitleBodyValidation
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface){

                    var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
open fun addDomNodeInterfaces()
        //nullable = true from not(false or (false and true)) = true
{this.addDomNodeInterface(this.titleBody as DomNodeInterface)
this.addDomNodeInterface(this as DomNodeInterface)
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var pageName: String = TransformTemplateCustomizerUtil.getInstance()!!.getPageNameHack(this.getTransformInfoInterface()!!.getName(), this.getWeblisketSession()!!.getStoreName())!!


    
                        if(StringValidationUtil.getInstance()!!.isEmpty(pageName))
                        
                                    {
                                    pageName= NAME

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ModDomHelper.createNameValueNodes(document, PageData.getInstance()!!.NAME, pageName)
}


                @Throws(Exception::class)
            
open fun view()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var success: String = DomDocumentHelper.toString(this.getDoc())!!


    var result: String = StoreTransformer(this.abeClientInformation, this.getTransformInfoInterface()).
                            translate(success)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringEscapeUtils.unescapeHtml3(result)
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "view()", e)

                                    }
                                



                            throw e
}

}


}
                
            

