
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
        package org.allbinary.logic.visual.transform.info



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import javax.servlet.http.HttpServletRequest
import javax.servlet.jsp.PageContext
import org.allbinary.business.context.AbContext
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.globals.FREEBLISKET_PATH_GLOBALS
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.http.request.RequestParams
import org.allbinary.logic.communication.http.request.session.WeblisketSessionInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.AbSqlData
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.visual.transform.info.objectConfig.TransformInfoObjectConfig

open public class TransformInfoHttp : TransformInfo
                , TransformInfoHttpInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val abContext: AbContext
public constructor        (propertiesHashMap: HashMap<Any, Any>, pageContext: PageContext, crud: Boolean)                        

                            : super(){

                    var propertiesHashMap = propertiesHashMap


                    var pageContext = pageContext


                    var crud = crud


                            //For kotlin this is before the body of the constructor.
                    
this.abContext= AbContext(propertiesHashMap, pageContext)

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Properties HashMap: " +propertiesHashMap!!.toString(), this, 
                            "Constructor(HashMap, PageContext, boolean)")

                                    }
                                
this.override(propertiesHashMap)
}

public constructor        (request: HttpServletRequest, propertiesHashMap: HashMap<Any, Any>, pageContext: PageContext)                        

                            : super(){

                    var request = request


                    var propertiesHashMap = propertiesHashMap


                    var pageContext = pageContext


                            //For kotlin this is before the body of the constructor.
                    
this.abContext= AbContext(propertiesHashMap, pageContext)

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Properties HashMap: " +propertiesHashMap!!.toString(), this, 
                            "Constructor(HttpServletRequest, HashMap, PageContext)")

                                    }
                                
this.set(RequestParams(request as HttpServletRequest).
                            toHashMap())
this.override(propertiesHashMap)
}

public constructor        (databaseHashMap: HashMap<Any, Any>, propertiesHashMap: HashMap<Any, Any>, pageContext: PageContext)                        

                            : super(){

                    var databaseHashMap = databaseHashMap


                    var propertiesHashMap = propertiesHashMap


                    var pageContext = pageContext


                            //For kotlin this is before the body of the constructor.
                    
this.abContext= AbContext(propertiesHashMap, pageContext)

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Properties HashMap: " +propertiesHashMap!!.toString(), this, 
                            "Constructor(HashMap, HashMap, PageContext)")

                                    }
                                
this.set(databaseHashMap)
}

public constructor        (propertiesHashMap: HashMap<Any, Any>, pageContext: PageContext)                        

                            : super(){

                    var propertiesHashMap = propertiesHashMap


                    var pageContext = pageContext


                            //For kotlin this is before the body of the constructor.
                    
this.abContext= AbContext(propertiesHashMap, pageContext)

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Properties HashMap: " +propertiesHashMap!!.toString(), this, 
                            "Constructor(HashMap, PageContext)")

                                    }
                                
this.set(propertiesHashMap)
}

public constructor        (parentViewOfThisTransformInfoInterface: TransformInfoHttp)                        

                            : super(){

                    var parentViewOfThisTransformInfoInterface = parentViewOfThisTransformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
this.abContext= AbContext(parentViewOfThisTransformInfoInterface!!.getPropertiesHashMap(), parentViewOfThisTransformInfoInterface!!.getPageContext())
}


                @Throws(Exception::class)
            
open fun set(hashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var hashMap = hashMap

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Properties HashMap: " +hashMap!!.toString(), this, 
                            "set()")

                                    }
                                

    var transformInfoData: TransformInfoData = TransformInfoData.getInstance()!!
            

this.setName(hashMap!!.get(transformInfoData!!.NAME) as String)
this.setStoreName(hashMap!!.get(StoreFrontData.getInstance()!!.NAME) as String)
this.setObjectFile(hashMap!!.get(transformInfoData!!.OBJECTFILENAME) as String)
this.setObject(hashMap!!.get(transformInfoData!!.OBJECT) as String)

    var stringValidationUtil: StringValidationUtil = StringValidationUtil.getInstance()!!
            


    var objectConfigString: String = hashMap!!.get(transformInfoData!!.OBJECTCONFIG) as String


    
                        if(stringValidationUtil!!.isValidRequired(objectConfigString, 10, AbSqlData.MAXBLOB))
                        
                                    {
                                    this.setObjectConfig(objectConfigString)

                                    }
                                
                        else {
                            this.setObjectConfig(TransformInfoObjectConfig(this).
                            toString())

                        }
                            

    
                        if(!stringValidationUtil!!.isEmpty(hashMap!!.get(transformInfoData!!.OBJECTCONFIGFILENAME) as String))
                        
                                    {
                                    this.setObjectConfigFile(hashMap!!.get(transformInfoData!!.OBJECTCONFIGFILENAME) as String)

                                    }
                                
this.setTemplateFile(hashMap!!.get(transformInfoData!!.TEMPLATEFILENAME) as String)
this.setTemplate(hashMap!!.get(transformInfoData!!.TEMPLATE) as String)
this.setDataFile(hashMap!!.get(transformInfoData!!.DATAFILENAME) as String)
this.setData(hashMap!!.get(transformInfoData!!.DATA) as String)

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.TAGHELPERFACTORY))
                        
                                    {
                                    logUtil!!.put(this.log(), this, 
                            "set()")

                                    }
                                
}


open fun getWeblisketSession()
        //nullable = true from not(false or (false and true)) = true
: WeblisketSessionInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.abContext!!.getWeblisketSession()
}


open fun getPageContext()
        //nullable = true from not(false or (false and true)) = true
: PageContext{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.abContext!!.getPageContext()
}


open fun getPropertiesHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.abContext!!.getPropertiesHashMap()
}


                @Throws(Exception::class)
            
open fun getTemplateFilePath()
        //nullable = true from not(false or (false and true)) = true
: AbPath{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbPath(URLGLOBALS.getMainPath() +FREEBLISKET_PATH_GLOBALS.getInstance()!!.XSLPATH, this.getTemplateFile())
}


                @Throws(Exception::class)
            
open fun getObjectConfigFilePath()
        //nullable = true from not(false or (false and true)) = true
: AbPath{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbPath(URLGLOBALS.getMainPath() +FREEBLISKET_PATH_GLOBALS.getInstance()!!.XSLPATH, this.getObjectConfigFile())
}


                @Throws(Exception::class)
            
open fun getDataFilePath()
        //nullable = true from not(false or (false and true)) = true
: AbPath{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbPath(URLGLOBALS.getMainPath() +FREEBLISKET_PATH_GLOBALS.getInstance()!!.XSLPATH, this.getDataFile())
}


}
                
            

