
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
        package views.generic.inventory




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.context.modules.storefront.StoreFrontInterface
import org.allbinary.business.user.commerce.inventory.item.BasicItemData
import org.allbinary.data.tables.staticpages.StaticPagesEntity
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.search.SearchParams
import org.allbinary.logic.control.search.SearchRequest
import org.allbinary.logic.io.InputOutputTypeData
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.string.regex.replace.Replace
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.ServiceClientInformationInterfaceFactory
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings
import views.admin.inventory.listings.InventoryViewSearchInterface

open public class InventorySearch
            : Object
        
                , InventoryViewSearchInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private val searchRequest: SearchRequest
public constructor (searchRequest: SearchRequest)                        

                            : super(){
var searchRequest = searchRequest


                            //For kotlin this is before the body of the constructor.
                    
this.searchRequest= searchRequest
}


                @Throws(Exception::class)
            
    open fun searchSingleStaticPage()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            
    var storeFront: StoreFrontInterface = this.searchRequest!!.getStoreFront()!!


    var searchParams: SearchParams = this.searchRequest!!.getParams()!!


    var columnValueHashMap: HashMap<Any, Any> = searchParams!!.get()!!


    var file: String = StaticPagesEntity().
                            getFile(storeFront!!.getName(), Replace("-", CommonSeps.getInstance()!!.SPACE).
                            all(columnValueHashMap!!.get(BasicItemData.KEYWORDS) as String))!!


    
                        if(StringValidationUtil.getInstance()!!.isEmpty(file))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                                    }
                                
                        else {
                            
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(storeFront!!.getCurrentHostName())
stringBuffer!!.append(storeFront!!.getCurrentHostNamePath())
stringBuffer!!.append(storeFront!!.getStaticPath())
stringBuffer!!.append(file)
stringBuffer!!.append(this.searchRequest!!.getParams()!!.getEndPage())
stringBuffer!!.append(AbPathData.getInstance()!!.EXTENSION_SEP)
stringBuffer!!.append(InputOutputTypeData.getInstance()!!.DEFAULT)

    var filePath: String = Replace(CommonSeps.getInstance()!!.SPACE, "%20").
                            all(stringBuffer!!.toString())!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return filePath

                        }
                            
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.PRODUCTSEARCHLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, "searchSingleStaticPage", e)

                                    }
                                



                            throw Exception("Failed retrieve Single Product Page Static")
}

}


                @Throws(Exception::class)
            
    open fun searchSingleDynamicPage()
        //nullable = true from not(false or (false and true)) = true
: String{

        try {
            
    var str: Array<String?> = search()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return str[this.searchRequest!!.getParams()!!.getStartPageInt()!!.toInt()]!!
} catch(e: Exception)
            {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.PRODUCTSEARCHLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, "searchSingleDynamicPage", e)

                                    }
                                



                            throw Exception("Failed retrieve Single Product Page Dynamically")
}

}


                @Throws(Exception::class)
            
    open fun search()
        //nullable = true from not(false or (false and true)) = true
: Array<String?>{

    var abeClientInformation: AbeClientInformationInterface = ServiceClientInformationInterfaceFactory.getInstance()!!


    var inventorySearchUtil: InventorySearchUtil = InventorySearchUtil.getInstance()!!


    var vector: Vector = inventorySearchUtil!!.getBasicItemIdColumn(searchRequest)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inventorySearchUtil!!.search(abeClientInformation, searchRequest, vector)
}


                @Throws(Exception::class)
            
    open fun getProduct(product: String)
        //nullable = true from not(false or (false and false)) = true
: String{
var product = product

    var abeClientInformation: AbeClientInformationInterface = ServiceClientInformationInterfaceFactory.getInstance()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return InventorySearchProductUtil.getInstance()!!.getProduct(abeClientInformation, searchRequest, product)
}


}
                
            

