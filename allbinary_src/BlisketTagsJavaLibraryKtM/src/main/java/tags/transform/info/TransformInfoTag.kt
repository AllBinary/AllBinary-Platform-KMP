
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
        package tags.transform.info




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.servlet.jsp.JspTagException
import admin.taghelpers.TagHelperFactoryInterface
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.logic.communication.http.request.AbResponseHandler
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.OutputTypeData
import org.allbinary.logic.visual.transform.info.TransformInfoData
import taghelpers.transform.info.TransformInfoRequestHelperFactory
import tags.ModifyTag

open public class TransformInfoTag : ModifyTag {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var name: String

    private var storeName: String

    private var objectFile: String

    private var anyType: String

    private var objectConfigFile: String

    private var objectConfig: String

    private var templateFile: String

    private var template: String

    private var dataFile: String

    private var data: String

    private var type: String
public constructor ()                        

                            : super(TransformInfoRequestHelperFactory()){


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor (tagHelperFactoryInterface: TagHelperFactoryInterface)                        

                            : super(tagHelperFactoryInterface){
var tagHelperFactoryInterface = tagHelperFactoryInterface


                            //For kotlin this is before the body of the constructor.
                    
}


    open fun setName(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.name= value
this.getPropertiesHashMap()!!.put(TransformInfoData.getInstance()!!.NAME, this.name)
}


    open fun setStoreName(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.storeName= value
this.getPropertiesHashMap()!!.put(StoreFrontData.getInstance()!!.NAME, this.storeName)
}


    open fun setObjectFile(value: Object)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.objectFile= value
this.getPropertiesHashMap()!!.put(TransformInfoData.getInstance()!!.OBJECTFILENAME, this.objectFile)
}


    open fun setObject(value: Object)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.anyType= value
this.getPropertiesHashMap()!!.put(TransformInfoData.getInstance()!!.OBJECT, this.anyType)
}


    open fun setTemplateFile(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.templateFile= value
this.getPropertiesHashMap()!!.put(TransformInfoData.getInstance()!!.TEMPLATEFILENAME, this.templateFile)
}


    open fun setTemplate(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.template= value
this.getPropertiesHashMap()!!.put(TransformInfoData.getInstance()!!.TEMPLATE, this.template)
}


    open fun setDataFile(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.dataFile= value
this.getPropertiesHashMap()!!.put(TransformInfoData.getInstance()!!.DATAFILENAME, this.dataFile)
}


    open fun setData(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.data= value
this.getPropertiesHashMap()!!.put(TransformInfoData.getInstance()!!.DATA, this.data)
}


    open fun setObjectConfigFile(value: Object)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.objectConfigFile= value
this.getPropertiesHashMap()!!.put(TransformInfoData.getInstance()!!.OBJECTCONFIGFILENAME, this.objectConfigFile)
}


    open fun setObjectConfig(value: Object)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.objectConfig= value
this.getPropertiesHashMap()!!.put(TransformInfoData.getInstance()!!.OBJECTCONFIG, this.objectConfig)
}


    open fun setType(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.type= value
this.getPropertiesHashMap()!!.put(OutputTypeData.getInstance()!!.NAME, this.type)

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.JSPTAG))
                        
                                    {
                                    logUtil!!.put("TransformInfoTag type set: " +this.type, this, "setType")

                                    }
                                
}


    open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.name
}


    open fun getObjectFile()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.objectFile
}


                @Throws(JspTagException::class)
            
    open fun doStartTag()
        //nullable = true from not(false or (false and true)) = true
: Int{

        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.doStartTag()
} catch(e: Exception)
            {
AbResponseHandler.sendJspTagRedirect(this.pageContext, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SKIP_BODY
}

}


}
                
            

