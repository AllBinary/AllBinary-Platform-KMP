
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
        package views.admin.customizers




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Arrays
import java.util.Vector
import org.allbinary.data.tables.transform.info.TransformInfoEntityBuilder
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.globals.GLOBALS2
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.sort.StringComparator
import org.allbinary.logic.visual.transform.info.CustomizerTransformInfoData
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.logic.visual.transform.template.customizer.TransformTemplateCustomizerData
import org.allbinary.logic.visual.transform.template.customizer.TransformTemplateCustomizersData
import org.allbinary.logic.visual.transform.template.customizer.bodies.BodyData
import org.allbinary.logic.visual.transform.template.customizer.widgets.title.TitleData
import org.allbinary.logic.visual.transform.template.util.TransformTemplateCustomizerUtil
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node
import views.business.context.modules.storefront.HttpStoreComponentView

open public class CustomizersView : HttpStoreComponentView
                , DomNodeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    val customizersVector: Vector
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface){

                    var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
this.customizersVector= TransformInfoEntityBuilder.getInstance()!!.getNames(this.getWeblisketSession()!!.getStoreName())
}


open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

        try {
            
    var node: Node = document.createElement(TransformTemplateCustomizersData.NAME)!!
            


    var unsortedCustomizerViewVector: Vector = Vector()


    var size: Int = customizersVector!!.size!!
            





                        for (index in 0 until size)


        {
    var viewName: String = customizersVector!!.get(index) as String


    
                        if(viewName!!.indexOf(CustomizerTransformInfoData.NAME) > 0 && viewName!!.indexOf(GLOBALS2.EDIT) > 0 && viewName!!.indexOf(BodyData.getInstance()!!.VIEWNAMEKEY) > 0 && viewName!!.indexOf(TitleData.getInstance()!!.VIEWNAMEKEY) > 0)
                        
                                    {
                                    unsortedCustomizerViewVector!!.add(viewName)

                                    }
                                
}


    var objectArray: Array<Any?> = unsortedCustomizerViewVector!!.toArray() as Array<Any?>

Arrays.sort(objectArray, StringComparator())




                        for (index in 0 until objectArray!!.size)


        {
    var viewName: String = objectArray[index]!! as String


    var viewNameNode: Node = ModDomHelper.createNameValueNodes(document, TransformTemplateCustomizerData.NAME, viewName, TransformTemplateCustomizerUtil.getInstance()!!.getPageNameHack(viewName, this.getWeblisketSession()!!.getStoreName()))!!
            

node.appendChild(viewNameNode)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.XSLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, 
                            "toXmlNode", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun addDomNodeInterfaces()
        //nullable = true from not(false or (false and true)) = true
{this.addDomNodeInterface(this as DomNodeInterface)
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
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "view()", e)

                                    }
                                



                            throw e
}

}


}
                
            

