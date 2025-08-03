
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
        package org.allbinary.logic.visual.transform.template.customizer.includes.style.css.template.retail



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.logic.control.validate.ValidationInterface
import org.allbinary.logic.visual.dhtml.style.StyleData
import org.allbinary.logic.visual.dhtml.style.StylesData
import org.allbinary.logic.visual.dhtml.style.color.ColorsView
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class EditCssStyleValidation : CssStyleValidation
                , ValidationInterface
                , DomNodeInterface {
        
public constructor        (){}

public constructor        (document: Document)                        

                            : super(document){

                    var document = document


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (hashMap: HashMap<Any, Any>)                        

                            : super(hashMap){

                    var hashMap = hashMap


                            //For kotlin this is before the body of the constructor.
                    
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.isValid()
}


open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.validationInfo()
}


open fun toValidationInfoDoc()
        //nullable = true from not(false or (false and true)) = true
: Document{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun toValidationInfoNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var node: Node = document!!.createElement(StylesData.getInstance()!!.NAME)!!
            


    var styleNode: Node = document!!.createElement(StyleData.getInstance()!!.NAME)!!
            

node!!.appendChild(styleNode)
styleNode!!.appendChild(ColorsView().
                            toXmlNode(document))

    var size: Int = cssStyleElementVector!!.size()!!
            





                        for (i in 0 until size)


        {
    var styleDomNodeInterface: DomNodeInterface = cssStyleElementVector!!.get(i) as DomNodeInterface

styleNode!!.appendChild(styleDomNodeInterface!!.toXmlNode(document))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            

