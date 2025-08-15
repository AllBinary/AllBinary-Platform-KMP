
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
        package org.allbinary.logic.communication.http.request




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.tokens.Tokenizer
import org.allbinary.logic.visual.dhtml.html.name.HtmlNameMathData
import org.allbinary.util.BasicArrayList

open public class NameSpaceRequestParam
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var nameSpaceVector: Vector

    private var nameSpacePropertiesHashMap: HashMap<Any, Any>

    private var value: String
public constructor        (nameSpace: String, value: String)
            : super()
        {

                    var nameSpace = nameSpace


                    var value = value
this.nameSpaceVector= Vector()
this.nameSpacePropertiesHashMap= HashMap<Any, Any>()
this.value= value

    var beginIndex: Int = nameSpace!!.indexOf(NameSpaceRequestParamData.NAME)!!
            


    
                        if(beginIndex < 0)
                        
                                    {
                                    


                            throw Exception("Not a NameSpaceRequest")

                                    }
                                

    var packages: String = nameSpace!!.substring(beginIndex +NameSpaceRequestParamData.NAME.length() +NameSpaceRequestParamData.SEP.length())!!
            


    var sepTokenizer: Tokenizer = Tokenizer(NameSpaceRequestParamData.SEP)


    var nameSpaceWithPropertiesVector: BasicArrayList = sepTokenizer!!.getTokens(packages, BasicArrayList())!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("\nSep Tokens: " +nameSpaceWithPropertiesVector!!.toString(), this, "NameSpaceRequestParam()")

                                    }
                                

    var nameSpaceAndPropertiesTokenizer: Tokenizer = Tokenizer(NameSpaceRequestParamData.PROPERTIES)


    var packageIndex: Int = 0


    var list: BasicArrayList = BasicArrayList()


    var index: Int = 0


    var size: Int = nameSpaceWithPropertiesVector!!.size()!!
            


        while(index < size)
        {
    var nameSpaceWithProperties: String = nameSpaceWithPropertiesVector!!.get(index++) as String

list.clear()

    var nameSpaceAndPropertiesVector: BasicArrayList = nameSpaceAndPropertiesTokenizer!!.getTokens(nameSpaceWithProperties, list)!!
            


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("\nPackageName and PackageName Properties Tokens: " +nameSpaceAndPropertiesVector!!.toString(), this, "NameSpaceRequestParam()")

                                    }
                                

    
                        if(nameSpaceAndPropertiesVector!!.size() > 0)
                        
                                    {
                                    
    var packageName: String = nameSpaceAndPropertiesVector!!.get(0) as String


    
                        if(packageName == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception("Package Name Is Null")

                                    }
                                
this.nameSpaceVector!!.add(packageName)

    
                        if(nameSpaceAndPropertiesVector!!.size() > 1)
                        
                                    {
                                    
    var properties: String = nameSpaceAndPropertiesVector!!.get(1) as String


    var packagePropertiesHashMap: HashMap<Any, Any> = this.generatePackagePropertiesHashMap(properties)!!
            

this.nameSpacePropertiesHashMap!!.put(packageIndex.toString(), packagePropertiesHashMap)

                                    }
                                
packageIndex++

                                    }
                                
}


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("NameSpace: " +this.nameSpaceVector!!.toString(), this, "NameSpaceRequestParam()")

                                    }
                                
}


open fun getPackages()
        //nullable = true from not(false or (false and true)) = true
: Vector{
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("NameSpace: " +this.nameSpaceVector!!.toString(), this, "getPackages()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.nameSpaceVector
}


open fun getPackageProperties(packageIndex: Int)
        //nullable = true from not(false or (false and false)) = true
: HashMap<Any, Any>{

                    var packageIndex = packageIndex

    var packagePropertiesHashMap: HashMap<Any, Any> = this.nameSpacePropertiesHashMap!!.get(packageIndex.toString()) as HashMap<Any, Any>


    
                        if(packagePropertiesHashMap == 
                                    null
                                )
                        
                                    {
                                    packagePropertiesHashMap= HashMap<Any, Any>()

                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("Package Properties: " +packagePropertiesHashMap!!.toString(), this, "getPackagesProperties()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return packagePropertiesHashMap
}


open fun getValue()
        //nullable = true from not(false or (false and true)) = true
: String{
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("\nValue: " +this.value, this, "getValue()")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.value
}


                @Throws(Exception::class)
            
open fun generatePackagePropertiesHashMap(properties: String)
        //nullable = true from not(false or (false and false)) = true
: HashMap<Any, Any>{

                    var properties = properties

    var propertiesTokenizer: Tokenizer = Tokenizer(NameSpaceRequestParamData.PROPERTIESSEPARATOR)


    var packagePropertiesHashMap: HashMap<Any, Any> = HashMap<Any, Any>()


    var propertyVector: BasicArrayList = propertiesTokenizer!!.getTokens(properties, BasicArrayList())!!
            


    var list: BasicArrayList = BasicArrayList()


    var propertyTokenizer: Tokenizer = Tokenizer(HtmlNameMathData.getInstance()!!.EQUALS)


    var index: Int = 0


    var size: Int = propertyVector!!.size()!!
            


        while(index < size)
        {
    var property: String = propertyVector!!.get(index) as String

list.clear()

    var propertyNameValueVector: BasicArrayList = propertyTokenizer!!.getTokens(property, list)!!
            


    var index2: Int = 0


        while(index2 < propertyNameValueVector!!.size())
        {
    var propertyName: String = propertyNameValueVector!!.get(index2++) as String


    
                        if(propertyNameValueVector!!.size() > 1)
                        
                                    {
                                    
    var propertyValue: String = propertyNameValueVector!!.get(index2++) as String


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.HTTPREQUEST))
                        
                                    {
                                    logUtil!!.put("\nProperty Name: " +propertyName +"\nProperty Value: " +propertyValue, this, "generatePackagePropertiesHashMap()")

                                    }
                                
packagePropertiesHashMap!!.put(propertyName, propertyValue)

                                    }
                                
                        else {
                            packagePropertiesHashMap!!.put(propertyName, StringUtil.getInstance()!!.EMPTY_STRING)

                        }
                            
}

}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return packagePropertiesHashMap
}


}
                
            

