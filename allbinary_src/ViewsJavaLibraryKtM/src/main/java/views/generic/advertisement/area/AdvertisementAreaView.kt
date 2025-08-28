
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
        package views.generic.advertisement.area




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.advertisement.area.AdvertisementAreaData
import org.allbinary.business.advertisement.area.AdvertisementAreaInterface
import org.allbinary.data.tables.advertisement.areas.AdvertisementAreasEntityFactory
import org.allbinary.data.tables.advertisement.areas.AdvertisementAreasEntityInterface
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Document
import org.w3c.dom.Node
import views.business.context.modules.storefront.HttpStoreComponentView

open public class AdvertisementAreaView : HttpStoreComponentView
                , DomNodeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var advertisementAreaName: String
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface){
var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
this.advertisementAreaName= this.getPropertiesHashMap()!!.get(AdvertisementAreaData.getInstance()!!.NAME) as String
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{
var document = document

        try {
            
    var advertisementAreasEntityInterface: AdvertisementAreasEntityInterface = AdvertisementAreasEntityFactory.getInstance()!!


    var advertisementAreaInterface: AdvertisementAreaInterface = advertisementAreasEntityInterface!!.get(this.getTransformInfoInterface()!!.getStoreName(), advertisementAreaName)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.XSLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, "toXmlNode", e)

                                    }
                                



                            throw e
}

}


open fun addDomNodeInterfaces()
        //nullable = true from not(false or (false and true)) = true
{
this.addDomNodeInterface(this as DomNodeInterface)
}


                @Throws(Exception::class)
            
open fun view()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            this.addDomNodeInterfaces()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.view()
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
                
            

