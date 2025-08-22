
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
        package admin.taghelpers




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.http.request.RequestMapInterface
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.visual.transform.TransformInterface
import taghelpers.ValidationViewHelper
import tags.HelperTag
import views.admin.inventory.InventoryItemView
import views.admin.inventory.download.DownloadableInventoryItemView

open public class InventoryItemViewParentTagHelper
            : Object
         {
        

        companion object {
            
    private val instance: InventoryItemViewParentTagHelper = InventoryItemViewParentTagHelper()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: InventoryItemViewParentTagHelper{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            
open fun getInventoryItemView(inventoryTag: HelperTag)
        //nullable = true from not(false or (false and false)) = true
: InventoryItemView{

                    var inventoryTag = inventoryTag

    
                        if(inventoryTag != 
                                    null
                                )
                        
                                    {
                                    this.checkForValidationViewHelper(inventoryTag!!.getHelper())

    var validationViewHelper: ValidationViewHelper = inventoryTag!!.getHelper() as ValidationViewHelper


    var viewObject: TransformInterface = validationViewHelper!!.getViewObject()!!


    
                        if(viewObject!!.getTypeId() != InventoryItemView.TYPE_ID)
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Must have ")
stringBuffer!!.append("InventoryItemView and not: ")
stringBuffer!!.append(inventoryTag!!.getHelper()!!.::class.qualifiedName!!)



                            throw Exception(stringBuffer!!.toString())

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return viewObject as InventoryItemView

                                    }
                                
                        else {
                            


                            throw Exception("Must have parent tag.")

                        }
                            
}


                @Throws(Exception::class)
            
open fun getDownloadableInventoryItemView(inventoryTag: HelperTag)
        //nullable = true from not(false or (false and false)) = true
: DownloadableInventoryItemView{

                    var inventoryTag = inventoryTag

    
                        if(inventoryTag != 
                                    null
                                )
                        
                                    {
                                    this.checkForValidationViewHelper(inventoryTag!!.getHelper())

    var validationViewHelper: ValidationViewHelper = inventoryTag!!.getHelper() as ValidationViewHelper


    var viewObject: TransformInterface = validationViewHelper!!.getViewObject()!!


    
                        if(viewObject!!.getTypeId() != DownloadableInventoryItemView.TYPE_ID)
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Must have ")
stringBuffer!!.append("DownloadableInventoryItemView and not: ")
stringBuffer!!.append(inventoryTag!!.getHelper()!!.::class.qualifiedName!!)



                            throw Exception(stringBuffer!!.toString())

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return viewObject as DownloadableInventoryItemView

                                    }
                                
                        else {
                            


                            throw Exception("Must have parent tag.")

                        }
                            
}


                @Throws(Exception::class)
            
open fun getRequestMapInterface(inventoryTag: HelperTag)
        //nullable = true from not(false or (false and false)) = true
: RequestMapInterface{

                    var inventoryTag = inventoryTag

    
                        if(inventoryTag != 
                                    null
                                )
                        
                                    {
                                    this.checkForValidationViewHelper(inventoryTag!!.getHelper())

    var validationViewHelper: ValidationViewHelper = inventoryTag!!.getHelper() as ValidationViewHelper


    var viewObject: TransformInterface = validationViewHelper!!.getViewObject()!!


    
                        if(viewObject!!.getTypeId() != InventoryItemView.TYPE_ID && viewObject!!.getTypeId() != DownloadableInventoryItemView.TYPE_ID)
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Must have ")
stringBuffer!!.append("specific TYPE_ID and not: ")
stringBuffer!!.append(inventoryTag!!.getHelper()!!.::class.qualifiedName!!)



                            throw Exception(stringBuffer!!.toString())

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return viewObject as RequestMapInterface

                                    }
                                
                        else {
                            


                            throw Exception("Must have parent tag.")

                        }
                            
}


                @Throws(Exception::class)
            
open fun checkForValidationViewHelper(helperObject: Any)
        //nullable = true from not(false or (false and false)) = true
{

                    var helperObject = helperObject

    
                        if(!(helperObject is ValidationViewHelper))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Must have ")
stringBuffer!!.append("ValidationViewHelper")
stringBuffer!!.append("and not: ")
stringBuffer!!.append(helperObject!!::class.qualifiedName!!)



                            throw Exception(stringBuffer!!.toString())

                                    }
                                
}


}
                
            

