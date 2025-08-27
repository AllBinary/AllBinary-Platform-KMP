
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
        package org.allbinary.layer




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonSeps

open public class LayerManagerLogging : LayerManagerLoggingBase {
        

        companion object {
            
    private val instance: LayerManagerLogging = LayerManagerLogging()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: LayerManagerLogging{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


    private var removeFailed: Boolean = false

        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val stringBuilder: StringMaker = StringMaker()

    private val APPEND: String = "append"

    private val APPEND_: String = " append: "

    private val _AT_: String = " at: "

    private val ATTEMPT_REMOVE_: String = " Remove Attempt: "

    private val REMOVE_: String = " Remove: "

    private val REMOVE: String = "remove"

    private val DID_NOT_REMOVE: String = " Did not remove: "

    private val CLEAR: String = " Clear List"

                @Throws(Exception::class)
            override fun append(layerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerInterface = layerInterface
stringBuilder!!.delete(0, stringBuilder!!.length())
logUtil!!.put(stringBuilder!!.append(this.hashCode())!!.append(APPEND_)!!.append(layerInterface!!.getName())!!.toString(), this, APPEND)
}

override fun append(layerInterface: AllBinaryLayer, index: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerInterface = layerInterface


                    var index = index
stringBuilder!!.delete(0, stringBuilder!!.length())
logUtil!!.put(stringBuilder!!.append(this.hashCode())!!.append(APPEND_)!!.append(layerInterface!!.getName())!!.append(_AT_)!!.append(index)!!.toString(), this, APPEND)
}

override fun remove(layerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerInterface = layerInterface

    
                        if(layerInterface == 
                                    null
                                )
                        
                                    {
                                    stringBuilder!!.delete(0, stringBuilder!!.length())
logUtil!!.put(stringBuilder!!.append(this.hashCode())!!.append(ATTEMPT_REMOVE_)!!.append(StringUtil.getInstance()!!.toString(layerInterface))!!.toString(), this, REMOVE)

                                    }
                                
                        else {
                            stringBuilder!!.delete(0, stringBuilder!!.length())
logUtil!!.put(stringBuilder!!.append(this.hashCode())!!.append(ATTEMPT_REMOVE_)!!.append(layerInterface!!.getName())!!.toString(), this, REMOVE)

                        }
                            
}

override fun remove(layerManager: LayerManager, layerInterface: AllBinaryLayer, result: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerManager = layerManager


                    var layerInterface = layerInterface


                    var result = result

    
                        if(layerInterface == 
                                    null
                                )
                        
                                    {
                                    stringBuilder!!.delete(0, stringBuilder!!.length())
logUtil!!.put(stringBuilder!!.append(this.hashCode())!!.append(REMOVE_)!!.append(StringUtil.getInstance()!!.toString(layerInterface))!!.toString(), this, REMOVE)

                                    }
                                
                             else 
    
                        if(result)
                        
                                    {
                                    
    
                        if(LayerManagerLogging.removeFailed)
                        
                                    {
                                    stringBuilder!!.delete(0, stringBuilder!!.length())
logUtil!!.put(stringBuilder!!.append(this.hashCode())!!.append(REMOVE_)!!.append(layerInterface!!.getName())!!.toString(), this, REMOVE)

                                    }
                                

                                    }
                                
                        else {
                            stringBuilder!!.delete(0, stringBuilder!!.length())
logUtil!!.put(stringBuilder!!.append(this.hashCode())!!.append(DID_NOT_REMOVE)!!.append(layerInterface!!.getName())!!.toString(), this, REMOVE)
LayerManagerLogging.removeFailed= true

                        }
                            
}


open fun log(layerManager: LayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerManager = layerManager
stringBuilder!!.delete(0, stringBuilder!!.length())

    var size: Int = layerManager!!.getSize()!!


    var commonSeps: CommonSeps = CommonSeps.getInstance()!!

stringBuilder!!.append(Integer.toHexString(layerManager!!.hashCode()))!!.append(commonSeps!!.COLON_SEP)
stringBuilder!!.append(size)!!.append(commonSeps!!.COLON_SEP)

    var allBinaryLayer: AllBinaryLayer





                        for (index in 0 until size)

        {allBinaryLayer= (layerManager!!.getLayerAt(index) as AllBinaryLayer)
stringBuilder!!.append(allBinaryLayer!!.getName())!!.append(commonSeps!!.COMMA)
}

logUtil!!.put(stringBuilder!!.toString(), this, REMOVE)
}

override fun clear()
        //nullable = true from not(false or (false and true)) = true
{stringBuilder!!.delete(0, stringBuilder!!.length())
logUtil!!.put(stringBuilder!!.append(this.hashCode())!!.append(CLEAR)!!.toString(), this, CLEAR)
}


}
                
            

