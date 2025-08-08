
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
        package org.allbinary.logic.visual.dhtml.style



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.logic.communication.http.request.NameSpaceRequestParamData
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.visual.dhtml.style.css.CssElementData
import org.allbinary.logic.visual.dhtml.style.css.CssElementsValidationFactory
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList

open public class StylesValidationFactory
            : Object
         {
        

        companion object {


    private val instance: StylesValidationFactory = StylesValidationFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: StylesValidationFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


                @Throws(Exception::class)
            
open fun getInstance(hashMap: HashMap<Any, Any>)
        //nullable =  from not(true or (false and false)) = 
: Vector{

                    var hashMap = hashMap

    var stylesDocument: Document = hashMap!!.get(NameSpaceRequestParamData.DOCUMENT) as Document




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StylesValidationFactory.getInstance()!!.getInstance(stylesDocument)
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            
private constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun getInstance(document: Document)
        //nullable =  from not(true or (false and false)) = 
: Vector{

                    var document = document

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            


    var nodeList: NodeList = document.getElementsByTagName(StylesData.getInstance()!!.NAME)!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Style Present: " +DomDocumentHelper.toString(document), this, commonStrings!!.GET_INSTANCE)

                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Styles Present: " +nodeList!!.getLength(), this, commonStrings!!.GET_INSTANCE)

                                    }
                                




                        for (index in 0 until nodeList!!.getLength()!!)


        {
    var stylesNode: Node = nodeList!!.item(index)!!
            


    var styleNodeList: Vector = DomSearchHelper.getAllNodes(StyleData.getInstance()!!.NAME, stylesNode!!.getChildNodes())!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Number Of Style Nodes Present: " +styleNodeList!!.size, this, commonStrings!!.GET_INSTANCE)

                                    }
                                




                        for (styleNodesIndex in 0 until styleNodeList!!.size!!)


        {
    var styleNode: Node = styleNodeList!!.get(styleNodesIndex) as Node


    var cssElementStyleNodeList: Vector = DomSearchHelper.getAllNodes(CssElementData.getInstance()!!.NAME, styleNode!!.getChildNodes())!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Number Of Element Nodes Present: " +cssElementStyleNodeList!!.size, this, commonStrings!!.GET_INSTANCE)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CssElementsValidationFactory.getInstance(cssElementStyleNodeList)
}

}


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put(
                            "No Style Present", this, commonStrings!!.GET_INSTANCE)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Vector()
}


}
                
            

