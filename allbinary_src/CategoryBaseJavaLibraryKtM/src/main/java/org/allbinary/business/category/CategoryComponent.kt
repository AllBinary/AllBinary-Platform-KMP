
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
        package org.allbinary.business.category



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.logic.visual.transform.TransformInterface
import org.allbinary.logic.visual.transform.data.TransformDocumentInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Document

open public class CategoryComponent : CategoryView
                , TransformInterface {
        
public constructor        (categoryInterface: CategoryInterface)                        

                            : super(categoryInterface){

                    var categoryInterface = categoryInterface


                            //For kotlin this is before the body of the constructor.
                    
}


    var NO_TYPE: Int = 0

open fun getTypeId()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NO_TYPE
}


open fun getTransformDocumentInterface()
        //nullable = true from not(false or (false and true)) = true
: TransformDocumentInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(Exception::class)
            
open fun getTransformInfoInterface()
        //nullable = true from not(false or (false and true)) = true
: TransformInfoInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun setTransformDocumentInterface(viewDocumentInterface: TransformDocumentInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var viewDocumentInterface = viewDocumentInterface
}


                @Throws(Exception::class)
            
open fun toXmlDoc()
        //nullable = true from not(false or (false and true)) = true
: Document{
    var document: Document = DomDocumentHelper.create()!!
            

document!!.appendChild(CategoryView(this.getCategoryInterface()).
                            toXmlNode(document))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return document
}


                @Throws(Exception::class)
            
open fun view()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


}
                
            

