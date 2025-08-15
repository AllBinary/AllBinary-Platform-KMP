
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
        package org.allbinary.logic.visual.theme




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.category.CategoryData
import org.allbinary.business.category.CategoryFactoryInterface
import org.allbinary.business.category.store.theme.StoreThemeCategoryFactory
import org.allbinary.business.category.store.theme.StoreThemeCategoryInterface
import org.allbinary.data.tree.category.CategoryLoaderFactory
import org.allbinary.data.tree.category.CategoryLoaderInterface
import org.allbinary.data.tree.dom.DomData
import org.allbinary.data.tree.dom.DomNodeHelper
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.DomSearchHelper
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.AbSqlData
import org.allbinary.logic.control.crypt.file.CryptFileReader
import org.allbinary.logic.control.validate.ValidationInterface
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.io.path.PathUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.visual.transform.info.CompositeTransformInfoInterface
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.logic.visual.transform.template.customizer.includes.style.css.template.retail.CssStyleValidation
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class ThemeValidation
            : Object
        
                , ThemeInterface
                , ValidationInterface
                , DomNodeInterface
                , CompositeTransformInfoInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var transformInfoInterface: TransformInfoInterface

    private var styleValidationInterface: ValidationInterface

    private var themeName: String

    private var themePreviewImageName: String

    private var webAppAbPath: AbPath

    private var categoryAbPath: AbPath

    private var fileAbPath: AbPath
public constructor        (transformInfoInterface: TransformInfoInterface, cssStyleValidation: CssStyleValidation, categoryThemePath: String)
            : super()
        {

                    var transformInfoInterface = transformInfoInterface


                    var cssStyleValidation = cssStyleValidation


                    var categoryThemePath = categoryThemePath
this.transformInfoInterface= transformInfoInterface

    var pathUtil: PathUtil = PathUtil.getInstance()!!
            

this.categoryAbPath= pathUtil!!.removeNameFromPath(categoryThemePath)
this.themeName= pathUtil!!.getNameFromPath(categoryThemePath)
this.styleValidationInterface= cssStyleValidation
this.init()
}

public constructor        (transformInfoInterface: TransformInfoInterface, hashMap: HashMap<Any, Any>)
            : super()
        {

                    var transformInfoInterface = transformInfoInterface


                    var hashMap = hashMap
this.transformInfoInterface= transformInfoInterface

    var categoryThemeAbPath: AbPath = AbPath(hashMap!!.get(ThemeData.getInstance()!!.PATH) as String)


    var pathUtil: PathUtil = PathUtil.getInstance()!!
            

this.categoryAbPath= pathUtil!!.removeNameFromPath(categoryThemeAbPath!!.toString())
this.themeName= pathUtil!!.getNameFromPath(categoryThemeAbPath!!.toString())

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("CategoryThemePath: ")
stringBuffer!!.append(categoryThemeAbPath!!.toString())
stringBuffer!!.append(" & CategoryPath: ")
stringBuffer!!.append(this.categoryAbPath!!.toString())
stringBuffer!!.append(" & ThemeName: ")
stringBuffer!!.append(this.themeName)
logUtil!!.put("Http Request Constructor", this, stringBuffer!!.toString())

                                    }
                                
this.init()
}

public constructor        (storeThemeCategoryInterface: StoreThemeCategoryInterface, node: Node)
            : super()
        {

                    var storeThemeCategoryInterface = storeThemeCategoryInterface


                    var node = node
this.transformInfoInterface= storeThemeCategoryInterface!!.getTransformInfoInterface()
this.categoryAbPath= storeThemeCategoryInterface!!.getPath()

    var themeNameNode: Node = DomSearchHelper.getNode(ThemeData.getInstance()!!.NAME, node.getChildNodes())!!
            


    var valueNode: Node = DomSearchHelper.getNode(DomData.VALUE, themeNameNode!!.getChildNodes())!!
            

this.themeName= DomNodeHelper.getTextNodeValue(valueNode)

    var previewImageNameNode: Node = DomSearchHelper.getNode(ThemeData.getInstance()!!.PREVIEW_IMAGE_NAME, node.getChildNodes())!!
            


    var previewImageNameValueNode: Node = DomSearchHelper.getNode(DomData.VALUE, previewImageNameNode!!.getChildNodes())!!
            

this.themePreviewImageName= DomNodeHelper.getTextNodeValue(previewImageNameValueNode)
this.webAppAbPath= storeThemeCategoryInterface!!.getWebAppPath()
this.init(storeThemeCategoryInterface)
}


                @Throws(Exception::class)
            
open fun init()
        //nullable = true from not(false or (false and true)) = true
{
    var categoryFactoryInterface: CategoryFactoryInterface = StoreThemeCategoryFactory(this.getTransformInfoInterface())


    var categoryLoaderInterface: CategoryLoaderInterface = CategoryLoaderFactory.getInstance(categoryFactoryInterface)!!
            


    var rootStoreThemeCategoryInterface: StoreThemeCategoryInterface = categoryFactoryInterface!!.getRootInstance() as StoreThemeCategoryInterface

this.init(rootStoreThemeCategoryInterface)
}


                @Throws(Exception::class)
            
open fun init(storeThemeCategoryInterface: StoreThemeCategoryInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var storeThemeCategoryInterface = storeThemeCategoryInterface
this.fileAbPath= AbPath(storeThemeCategoryInterface!!.getRootFilePath()!!.toString() +this.categoryAbPath!!.toString())
this.webAppAbPath= storeThemeCategoryInterface!!.getWebAppPath()
}


                @Throws(Exception::class)
            
open fun getTransformInfoInterface()
        //nullable = true from not(false or (false and true)) = true
: TransformInfoInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return transformInfoInterface
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.themeName
}


open fun getPreviewImageName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.themePreviewImageName
}


open fun getPreviewImagePath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.webAppAbPath!!.toString() +this.categoryAbPath!!.toString()
}


open fun getPath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.categoryAbPath!!.toString()
}


                @Throws(Exception::class)
            
open fun getCssStyleValidation()
        //nullable = true from not(false or (false and true)) = true
: CssStyleValidation{
    
                        if(this.styleValidationInterface == 
                                    null
                                )
                        
                                    {
                                    
    var cssStyleFileAbPath: AbPath = AbPath(this.fileAbPath!!.toString(), this.themeName +AbPathData.getInstance()!!.EXTENSION_SEP +CategoryData.getInstance()!!.UNCRYPTED_EXTENSION)


    var cryptFileReader: CryptFileReader = CryptFileReader(CategoryData.getInstance()!!.UNCRYPTED_EXTENSION, CategoryData.getInstance()!!.ENCRYPTED_EXTENSION)


    var document: Document = DomDocumentHelper.create(cryptFileReader!!.get(cssStyleFileAbPath))!!
            

this.styleValidationInterface= CssStyleValidation(document)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.styleValidationInterface as CssStyleValidation
}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var isValid: Boolean = Boolean.TRUE


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, commonStrings!!.IS_VALID)

                                    }
                                

    
                        if(!StringValidationUtil.getInstance()!!.isValidRequired(this.categoryAbPath!!.toString(), AbSqlData.MINSTRING, AbSqlData.MAXSTRING))
                        
                                    {
                                    isValid= Boolean.FALSE

                                    }
                                

    
                        if(!StringValidationUtil.getInstance()!!.isValidRequired(this.themeName, AbSqlData.MINSTRING, AbSqlData.MAXSTRING))
                        
                                    {
                                    isValid= Boolean.FALSE

                                    }
                                

    
                        if(!this.getCssStyleValidation()!!.isValid()!!)
                        
                                    {
                                    isValid= Boolean.FALSE

                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("End: " +isValid, this, commonStrings!!.IS_VALID)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return isValid
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLTAGSERROR))
                        
                                    {
                                    logUtil!!.put("Failed to validate form", this, commonStrings!!.IS_VALID, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Theme Validation Error")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put("Failed to generate validation error info", this, "validationInfo()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Error Validating Form"
}

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


open fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Any{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getName() as Object
}


open fun toVector()
        //nullable = true from not(false or (false and true)) = true
: Vector{
    var vector: Vector = Vector()

vector.add(this.getName())
vector.add(this.getPath())
vector.add(this.getPreviewImageName())
vector.add(this.getPreviewImagePath())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return vector
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var themeData: ThemeData = ThemeData.getInstance()!!
            


    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(themeData!!.NAME, this.getName())
hashMap!!.put(themeData!!.PATH, this.getPath())
hashMap!!.put(themeData!!.PREVIEW_IMAGE_NAME, this.getPreviewImageName())
hashMap!!.put(themeData!!.PREVIEW_IMAGE_PATH, this.getPreviewImagePath())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var node: Node = ModDomHelper.createNameValueNodes(document, ThemeData.getInstance()!!.NAME, this.toHashMap())!!
            


    var domNodeInterface: DomNodeInterface = this.getCssStyleValidation() as DomNodeInterface

node.appendChild(domNodeInterface!!.toXmlNode(document))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            

