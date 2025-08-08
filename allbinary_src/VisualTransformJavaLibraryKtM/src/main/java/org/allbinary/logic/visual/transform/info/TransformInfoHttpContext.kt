
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
import javax.servlet.jsp.PageContext
import org.allbinary.globals.FREEBLISKET_PATH_GLOBALS
import org.allbinary.globals.URLGLOBALS
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.path.AbPath
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil

open public class TransformInfoHttpContext : TransformInfoHttp {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            
public constructor        (databaseHashMap: HashMap<Any, Any>, propertiesHashMap: HashMap<Any, Any>, pageContext: PageContext)                        

                            : super(databaseHashMap, propertiesHashMap, pageContext){

                    var databaseHashMap = databaseHashMap


                    var propertiesHashMap = propertiesHashMap


                    var pageContext = pageContext


                            //For kotlin this is before the body of the constructor.
                    

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "Database HashMap: ")
stringBuffer!!.append(databaseHashMap!!.toString())
stringBuffer!!.append(
                            "\nProperties HashMap: ")
stringBuffer!!.append(propertiesHashMap!!.toString())
logUtil!!.put(stringBuffer!!.toString(), this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
this.setStoreName(StringUtil.getInstance()!!.EMPTY_STRING)
}

public constructor        (propertiesHashMap: HashMap<Any, Any>, pageContext: PageContext)                        

                            : super(propertiesHashMap, pageContext){

                    var propertiesHashMap = propertiesHashMap


                    var pageContext = pageContext


                            //For kotlin this is before the body of the constructor.
                    

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Properties HashMap: " +propertiesHashMap!!.toString(), this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                
this.setStoreName(StringUtil.getInstance()!!.EMPTY_STRING)
}


                @Throws(Exception::class)
            
open fun getPath()
        //nullable = true from not(false or (false and true)) = true
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(URLGLOBALS.getMainPath())
stringBuffer!!.append(FREEBLISKET_PATH_GLOBALS.getInstance()!!.XSLPATH)
stringBuffer!!.append(FREEBLISKET_PATH_GLOBALS.getInstance()!!.INSTALLPATH)
stringBuffer!!.append(this.getStoreName())
stringBuffer!!.append(AbPathData.getInstance()!!.SEPARATOR)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


                @Throws(Exception::class)
            
open fun getTemplateFilePath()
        //nullable = true from not(false or (false and true)) = true
: AbPath{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbPath(this.getPath(), this.getTemplateFile())
}


                @Throws(Exception::class)
            
open fun getObjectConfigFilePath()
        //nullable = true from not(false or (false and true)) = true
: AbPath{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbPath(this.getPath(), this.getObjectConfigFile())
}


                @Throws(Exception::class)
            
open fun getDataFilePath()
        //nullable = true from not(false or (false and true)) = true
: AbPath{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AbPath(this.getPath(), this.getDataFile())
}


}
                
            

