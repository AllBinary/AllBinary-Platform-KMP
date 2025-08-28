
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
        package views.admin.inventory




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.business.user.commerce.inventory.item.BasicItemData
import org.allbinary.data.tables.user.commerce.inventory.item.InventoryEntityFactory
import org.allbinary.logic.communication.http.request.RequestParams
import org.allbinary.logic.control.validate.ValidationComponentInterface
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class DeleteFileValidationView : InventoryItemView
                , ValidationComponentInterface {
        

    private var id: String
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface, StringUtil.getInstance()!!.EMPTY_STRING)

        Updates for KMP build        
        {
var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
this.getFormData()
}


                @Throws(Exception::class)
            
open fun getFormData()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    var hashMap: HashMap<Any, Any> = RequestParams(request).
                            toHashMap()!!


    
                        if(hashMap == 
                                    null
                                )
                        
                                    throw Exception("No Request Params Found")
this.id= hashMap!!.get(BasicItemData.ID) as String
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        {

        try {
            
    
                        if(id == 
                                    null
                                 || !StringValidationUtil.getInstance()!!.isNumber(this.id))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                
this.itemInterface= InventoryEntityFactory.getInstance()!!.getInventoryEntityInstance()!!.getItem(this.id)

    
                        if(this.itemInterface == 
                                    null
                                )
                        


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
} catch(e: Exception)
            

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


open fun toValidationInfoDoc()
        //nullable = true from not(false or (false and true)) = true
: Document

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun toValidationInfoNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node

        Updates for KMP build        
        {
var document = document



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {

        try {
            
    var stringBuffer: StringMaker = StringMaker()


    
                        if(id == 
                                    null
                                 || !StringValidationUtil.getInstance()!!.isNumber(this.id))
                        
                                    {
                                    stringBuffer!!.append("Id is not valid.<br />")

                                    }
                                

    
                        if(InventoryEntityFactory.getInstance()!!.getInventoryEntityInstance()!!.getItem(this.id) == 
                                    null
                                )
                        
                                    {
                                    stringBuffer!!.append("Item does not exist.<br />")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
} catch(e: Exception)
            

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Unkown Validation Error.<br />"
}

}


}
                
            

