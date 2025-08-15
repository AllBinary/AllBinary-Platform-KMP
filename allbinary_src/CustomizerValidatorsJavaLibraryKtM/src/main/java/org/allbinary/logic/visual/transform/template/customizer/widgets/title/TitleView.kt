
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
        package org.allbinary.logic.visual.transform.template.customizer.widgets.title




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.data.tree.dom.DomData
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class TitleView
            : Object
        
                , DomNodeInterface {
        

        companion object {
            
    private val NAME: String = "None"

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var title: String
public constructor        ()
            : super()
        {this.title= NAME
}

public constructor        (node: Node)
            : super()
        {

                    var node = node

    var titleTextNode: Node = DomSearchHelper.getNode(TitleData.getInstance()!!.TEXT, node.getChildNodes())!!
            


    var valueNode: Node = DomSearchHelper.getNode(DomData.VALUE, titleTextNode!!.getChildNodes())!!
            

this.title= DomNodeHelper.getTextNodeValue(valueNode)

    
                        if(StringValidationUtil.getInstance()!!.isEmpty(this.title))
                        
                                    {
                                    this.title= NAME

                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Title: " +this.getTitle(), this, "Consructor()")

                                    }
                                
}

public constructor        (hashMap: HashMap<Any, Any>)
            : super()
        {

                    var hashMap = hashMap

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("HashMap: " +hashMap!!.toString(), this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
this.getFormData(hashMap)
}


open fun getTitle()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.title
}


open fun getFormData(hashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var hashMap = hashMap
this.title= hashMap!!.get(TitleData.getInstance()!!.TEXT) as String

    
                        if(StringValidationUtil.getInstance()!!.isEmpty(this.title))
                        
                                    {
                                    this.title= NAME

                                    }
                                
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(TitleData.getInstance()!!.TEXT, this.getTitle())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var hashMap: HashMap<Any, Any> = this.toHashMap()!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("TitleView HashMap: " +hashMap!!.toString(), this, "toXmlNode()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ModDomHelper.createNameValueNodes(document, TitleData.getInstance()!!.NAME, hashMap)
}


}
                
            

