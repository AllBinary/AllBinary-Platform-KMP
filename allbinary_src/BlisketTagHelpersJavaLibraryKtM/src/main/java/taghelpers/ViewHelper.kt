
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
        package taghelpers



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.jsp.PageContext
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.ServiceClientInformationInterfaceFactory
import org.allbinary.logic.visual.transform.TransformFactory
import org.allbinary.logic.visual.transform.TransformInterface
import org.allbinary.logic.visual.transform.data.TransformDocumentInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document

open public class ViewHelper
            : Object
        
                , TransformInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val abeClientInformation: AbeClientInformationInterface = ServiceClientInformationInterfaceFactory.getInstance()!!
            

    private var componentInterface: TransformInterface
public constructor        (hashMap: HashMap<Any, Any>, pageContext: PageContext)
            : super()
        {

                    var hashMap = hashMap


                    var pageContext = pageContext
this.componentInterface= TransformFactory.getInstance()!!.getInstance(this.abeClientInformation, hashMap, pageContext)
}


    var NO_TYPE: Int = 0

open fun getTypeId()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NO_TYPE
}


                @Throws(Exception::class)
            
open fun view()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return componentInterface!!.view()
} catch(e: Exception)
            {
    var error: String = "Failed to View: "


    
                        if(this.componentInterface != 
                                    null
                                )
                        error += this.componentInterface!!.::class.qualifiedName!!
                             else 
    
                        if()
                        

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "view()", e)

                                    }
                                



                            throw e
}

}


                @Throws(Exception::class)
            
open fun toXmlDoc()
        //nullable = true from not(false or (false and true)) = true
: Document{
        try {
            


                            throw Exception("Hmm: " +componentInterface!!.getTransformDocumentInterface()!!.getDoc())
} catch(e: Exception)
            {
    var error: String = "Failed to View: "


    
                        if(this.componentInterface != 
                                    null
                                )
                        error += this.componentInterface!!.::class.qualifiedName!!
                             else 
    
                        if()
                        

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "view()", e)

                                    }
                                



                            throw e
}

}


open fun getViewObject()
        //nullable = true from not(false or (false and true)) = true
: TransformInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.componentInterface
}


                @Throws(Exception::class)
            
open fun getTransformInfoInterface()
        //nullable = true from not(false or (false and true)) = true
: TransformInfoInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.componentInterface!!.getTransformInfoInterface()
}


open fun getTransformDocumentInterface()
        //nullable = true from not(false or (false and true)) = true
: TransformDocumentInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun setTransformDocumentInterface(viewDocumentInterface: TransformDocumentInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var viewDocumentInterface = viewDocumentInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 
}


}
                
            

