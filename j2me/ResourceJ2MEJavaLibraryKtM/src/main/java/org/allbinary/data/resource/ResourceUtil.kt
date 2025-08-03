
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
        package org.allbinary.data.resource



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.InputStream
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonSeps

open public class ResourceUtil
            : Object
         {
        

        companion object {


    private var instance: ResourceUtil = ResourceUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ResourceUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            
private constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun getResourceAsStream(resource: String)
        //nullable = true from not(false or (false and false)) = true
: InputStream{

                    var resource = resource

    var inputStream: InputStream = resource!!::class.getResourceAsStream(resource)!!
            


    
                        if(inputStream == 
                                    null
                                )
                        
                                    {
                                    inputStream= this.getResourceAsStream(resource, 2)

    
                        if(inputStream == 
                                    null
                                )
                        
                                    {
                                    inputStream= this.getResourceAsStream(resource, 1)

    
                        if(inputStream == 
                                    null
                                )
                        
                                    {
                                    
    var stringMaker: StringMaker = StringMaker()


    var index: Int = resource!!.lastIndexOf(
                            '/')!!
            


    var resourcePath: String = resource!!.substring(index +1)!!
            

inputStream= resource!!::class.getResourceAsStream(resourcePath)

    
                        if(inputStream == 
                                    null
                                )
                        
                                    {
                                    resourcePath= resource!!.substring(index)
inputStream= resource!!::class.getResourceAsStream(resourcePath)

    
                        if(inputStream == 
                                    null
                                )
                        
                                    {
                                    
    var RES: String = "res"

resourcePath= stringMaker!!.append(RES)!!.append(resource!!.substring(index))!!.toString()
inputStream= resource!!::class.getResourceAsStream(resourcePath)

    
                        if(inputStream == 
                                    null
                                )
                        
                                    {
                                    stringMaker!!.delete(0, stringMaker!!.length())
resourcePath= stringMaker!!.append(
                            "/")!!.append(RES)!!.append(resource!!.substring(index))!!.toString()
inputStream= resource!!::class.getResourceAsStream(resourcePath)

    var COLON: String = CommonSeps.getInstance()!!.COLON


    
                        if(inputStream == 
                                    null
                                )
                        
                                    {
                                    stringMaker!!.delete(0, stringMaker!!.length())
resourcePath= stringMaker!!.append(RES)!!.append(COLON)!!.append(resource!!.substring(index))!!.toString()
inputStream= resource!!::class.getResourceAsStream(resourcePath)

    
                        if(inputStream == 
                                    null
                                )
                        
                                    {
                                    stringMaker!!.delete(0, stringMaker!!.length())
resourcePath= stringMaker!!.append(RES)!!.append(COLON)!!.append(resource!!.substring(index +1))!!.toString()
inputStream= resource!!::class.getResourceAsStream(resourcePath)

    
                        if(inputStream == 
                                    null
                                )
                        
                                    {
                                    
    var RESOURCE_STRING: String = "resource"

stringMaker!!.delete(0, stringMaker!!.length())
resourcePath= stringMaker!!.append(RESOURCE_STRING)!!.append(COLON)!!.append(resource!!.substring(index))!!.toString()
inputStream= resource!!::class.getResourceAsStream(resourcePath)

    
                        if(inputStream == 
                                    null
                                )
                        
                                    {
                                    stringMaker!!.delete(0, stringMaker!!.length())
resourcePath= stringMaker!!.append(RESOURCE_STRING)!!.append(COLON)!!.append(resource!!.substring(index +1))!!.toString()
inputStream= resource!!::class.getResourceAsStream(resourcePath)

    
                        if(inputStream == 
                                    null
                                )
                        
                                    {
                                    stringMaker!!.delete(0, stringMaker!!.length())



                            throw Exception(stringMaker!!.append(
                            "Unable to obtain: ")!!.append(resource)!!.toString())

                                    }
                                

                                    }
                                

                                    }
                                

                                    }
                                

                                    }
                                

                                    }
                                

                                    }
                                

                                    }
                                

                                    }
                                

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputStream
}


                @Throws(Exception::class)
            
open fun getResourceAsStream(resource: String, startIndex: Int)
        //nullable = true from not(false or (false and false)) = true
: InputStream{

                    var resource = resource


                    var startIndex = startIndex

    var stringMaker: StringMaker = StringMaker()


    var index: Int = resource!!.indexOf(CommonSeps.getInstance()!!.COLON)!!
            


    var resourcePath: String = resource!!.substring(index +startIndex)!!
            


    var inputStream: InputStream = resource!!::class.getResourceAsStream(resourcePath)!!
            


    
                        if(inputStream != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputStream

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputStream
}


open fun addResource(resource: String, value: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var resource = resource


                    var value = value
}


}
                
            

