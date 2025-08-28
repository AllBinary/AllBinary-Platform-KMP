
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




        import java.lang.Object        
        
        import java.lang.Integer
        
        import java.lang.Thread
        
        import java.lang.ClassLoader
        
        
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
            
    private var classLoader: ClassLoader

    private val instance: ResourceUtil = ResourceUtil()

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
        {
}


open fun setClassLoader(classLoader: ClassLoader)
        //nullable = true from not(false or (false and false)) = true
{
    //var classLoader = classLoader
logUtil!!.put(StringMaker().
                            append("Resource Loader: ")!!.append(classLoader!!::class.toString()!!)!!.toString(), this, "setClassLoader")
ResourceUtil.classLoader= classLoader
}


                @Throws(Exception::class)
            
open fun getResourceAsStream(resource: String)
        //nullable = true from not(false or (false and false)) = true
: InputStream{
    //var resource = resource

    var inputStream: InputStream = this.getResourceAsStream(resource, 2)!!


    
                        if(inputStream == 
                                    null
                                )
                        
                                    {
                                    inputStream= this.getResourceAsStream(resource, 1)

    
                        if(inputStream == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception(StringMaker().
                            append("Unable to obtain: ")!!.append(resource)!!.toString())

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputStream
}


                @Throws(Exception::class)
            
open fun getResourceAsStream(resource: String, startIndex: Int)
        //nullable = true from not(false or (false and false)) = true
: InputStream{
    //var resource = resource
    //var startIndex = startIndex

    var stringMaker: StringMaker = StringMaker()


    var commonSeps: CommonSeps = CommonSeps.getInstance()!!


    var index: Int = resource.indexOf(commonSeps!!.COLON)!!


    var resourcePath: String = resource.substring(index +startIndex)!!


    var inputStream: InputStream = resource::class.getResourceAsStream(resourcePath)!!


    
                        if(inputStream != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputStream

                                    }
                                
inputStream= ResourceUtil.classLoader!!.getResourceAsStream(resourcePath)

    
                        if(inputStream != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return inputStream

                                    }
                                
inputStream= Thread.currentThread()!!.getContextClassLoader()!!.getResourceAsStream(resourcePath)

    
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
    //var resource = resource
    //var value = value
}


}
                
            

