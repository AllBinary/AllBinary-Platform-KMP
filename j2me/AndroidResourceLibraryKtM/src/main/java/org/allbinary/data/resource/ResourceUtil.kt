
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
import java.util.Hashtable
import android.app.Activity
import android.content.Context
import android.content.res.Resources
import org.allbinary.debug.DebugFactory
import org.allbinary.debug.NoDebug
import org.allbinary.logic.NullUtil
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonSeps
import org.allbinary.util.HashtableUtil

open public class ResourceUtil
            : Object
         {
        

        companion object {


    private val instance: ResourceUtil = ResourceUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ResourceUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var context: Context = NullAndroidContext.NULL_ANDROID_CONTEXT

    private var resources: Any = NullUtil.getInstance()!!.NULL_OBJECT

    private var hashMap: Hashtable<Any, Any> = Hashtable<Any, Any>()
private constructor        ()
            : super()
        {}


open fun getContext()
        //nullable = true from not(false or (false and true)) = true
: Context{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return context
}


open fun setContext(activity: Activity)
        //nullable = true from not(false or (false and false)) = true
{

                    var activity = activity
this.context= activity
}


open fun setContext(aContext: Context)
        //nullable = true from not(false or (false and false)) = true
{

                    var aContext = aContext
this.context= aContext
}


open fun getResourceId(resource: String)
        //nullable = true from not(false or (false and false)) = true
: Integer{

                    var resource = resource

    var value: Integer = this.hashMap!!.get(resource as Object?) as Integer


    
                        if(DebugFactory.getInstance() != NoDebug.getInstance())
                        
                                    {
                                    PreLogUtil.put(StringMaker().
                            append(resource)!!.append(CommonSeps.getInstance()!!.COLON)!!.append(value!!.toString())!!.toString(), this, 
                            "getResourceId")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return value
}


open fun addResource(resource: String, value: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var resource = resource


                    var value = value

    
                        if(DebugFactory.getInstance() != NoDebug.getInstance())
                        
                                    {
                                    PreLogUtil.put(StringMaker().
                            append(resource)!!.append(CommonSeps.getInstance()!!.COLON)!!.append(value!!.toString())!!.toString(), this, 
                            "addResource")

    
                        if(this.containsDuplicate(resource, value))
                        
                                    {
                                    ForcedLogUtil.log(StringMaker().
                            append(
                            "Found Duplicate Resource: ")!!.append(resource)!!.toString(), this)

                                    }
                                

                                    }
                                
this.hashMap!!.put(resource, value)
}


open fun containsDuplicate(resource: String, value: Integer)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var resource = resource


                    var value = value

    var objectArray: Array<Any?> = HashtableUtil.getInstance()!!.getKeysAsArray(hashMap)!!
            





                        for (index in objectArray!!.size downTo 0)


        {
    var integer: Integer = this.hashMap!!.get(objectArray[index]!! as Object) as Integer


    
                        if(resource != objectArray[index])
                        
                                    {
                                    
    
                        if(value != integer)
                        
                                    {
                                    
    
                        if(value!!.toInt() == integer!!.toInt())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                

                                    }
                                

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun setResources(resources: Resources)
        //nullable = true from not(false or (false and false)) = true
{

                    var resources = resources
logUtil!!.put(StringMaker().
                            append(
                            "Resource Loader: ")!!.append(resources!!::class.qualifiedName!!)!!.toString(), this, 
                            "setResources")
this.resources= resources
}


                @Throws(Exception::class)
            
open fun getResourceAsStream(resource: String)
        //nullable = true from not(false or (false and false)) = true
: InputStream{

                    var resource = resource

    var integer: Integer = this.hashMap!!.get(resource as Object?) as Integer


    var id: Int = integer!!.toInt()!!
            


    var inputStream: InputStream = 
                                    (resources as Resources).openRawResource(id)!!
            


    
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


}
                
            

