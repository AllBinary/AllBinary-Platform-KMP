
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
        package views.generic.address.shipping




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.user.address.StreetAddress
import org.allbinary.logic.control.validate.ValidationComponentInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class UpdateValidationView : ShippingAddressView
                , ValidationComponentInterface {
        
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface){
var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
this.streetAddress= StreetAddress(this.getRequest())

    
                        if(this.streetAddress!!.isValid() == Boolean.FALSE)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.streetAddress!!.isValid()
}


open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.streetAddress!!.validationInfo()
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


}
                
            

