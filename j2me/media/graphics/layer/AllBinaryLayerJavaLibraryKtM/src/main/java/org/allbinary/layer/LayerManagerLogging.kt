
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
        
import org.allbinary.logic.TsUtil
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
                        return LayerManagerLogging.instance
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
    //var layerInterface = layerInterface
this.stringBuilder!!.delete(0, stringBuilder!!.length())
this.logUtil!!.putF(stringBuilder!!.appendint(TsUtil.getInstance()!!.hashCode(this))!!.append(this.APPEND_)!!.append(layerInterface!!.getName())!!.toString(), this, APPEND)
}


    override fun appendAt(layerInterface: AllBinaryLayer, index: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var layerInterface = layerInterface
    //var index = index
this.stringBuilder!!.delete(0, stringBuilder!!.length())
this.logUtil!!.putF(stringBuilder!!.appendint(TsUtil.getInstance()!!.hashCode(this))!!.append(this.APPEND_)!!.append(layerInterface!!.getName())!!.append(this._AT_)!!.appendint(index)!!.toString(), this, APPEND)
}


    override fun remove(layerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
{
    //var layerInterface = layerInterface

    
                        if(layerInterface == 
                                    null
                                )
                        
                                    {
                                    this.stringBuilder!!.delete(0, stringBuilder!!.length())
this.logUtil!!.putF(stringBuilder!!.appendint(TsUtil.getInstance()!!.hashCode(this))!!.append(this.ATTEMPT_REMOVE_)!!.append(StringUtil.getInstance()!!.toString(layerInterface))!!.toString(), this, REMOVE)

                                    }
                                
                        else {
                            this.stringBuilder!!.delete(0, stringBuilder!!.length())
this.logUtil!!.putF(stringBuilder!!.appendint(TsUtil.getInstance()!!.hashCode(this))!!.append(this.ATTEMPT_REMOVE_)!!.append(layerInterface!!.getName())!!.toString(), this, REMOVE)

                        }
                            
}


    override fun removeResult(layerManager: LayerManager, layerInterface: AllBinaryLayer, result: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
    //var layerManager = layerManager
    //var layerInterface = layerInterface
    //var result = result

    
                        if(layerInterface == 
                                    null
                                )
                        
                                    {
                                    this.stringBuilder!!.delete(0, stringBuilder!!.length())
this.logUtil!!.putF(stringBuilder!!.appendint(TsUtil.getInstance()!!.hashCode(this))!!.append(this.REMOVE_)!!.append(StringUtil.getInstance()!!.toString(layerInterface))!!.toString(), this, REMOVE)

                                    }
                                
                             else 
    
                        if(result)
                        
                                    {
                                    
    
                        if(LayerManagerLogging.removeFailed)
                        
                                    {
                                    this.stringBuilder!!.delete(0, stringBuilder!!.length())
this.logUtil!!.putF(stringBuilder!!.appendint(TsUtil.getInstance()!!.hashCode(this))!!.append(this.REMOVE_)!!.append(layerInterface!!.getName())!!.toString(), this, REMOVE)

                                    }
                                

                                    }
                                
                        else {
                            this.stringBuilder!!.delete(0, stringBuilder!!.length())
this.logUtil!!.putF(stringBuilder!!.appendint(TsUtil.getInstance()!!.hashCode(this))!!.append(this.DID_NOT_REMOVE)!!.append(layerInterface!!.getName())!!.toString(), this, REMOVE)
LayerManagerLogging.removeFailed= true

                        }
                            
}


    open fun log(layerManager: LayerManager)
        //nullable = true from not(false or (false and false)) = true
{
    //var layerManager = layerManager
this.stringBuilder!!.delete(0, stringBuilder!!.length())

    var size: Int = layerManager!!.getSize()!!


    var commonSeps: CommonSeps = CommonSeps.getInstance()!!

this.stringBuilder!!.append(Integer.toHexString(TsUtil.getInstance()!!.hashCode(layerManager)))!!.append(commonSeps!!.COLON_SEP)
this.stringBuilder!!.appendint(size)!!.append(commonSeps!!.COLON_SEP)

    var allBinaryLayer: AllBinaryLayer





                        for (index in 0 until size)

        {
allBinaryLayer= (layerManager!!.getLayerAt(index) as AllBinaryLayer)
this.stringBuilder!!.append(allBinaryLayer!!.getName())!!.append(commonSeps!!.COMMA)
}

this.logUtil!!.putF(stringBuilder!!.toString(), this, REMOVE)
}


    override fun clear()
        //nullable = true from not(false or (false and true)) = true
{
this.stringBuilder!!.delete(0, stringBuilder!!.length())
this.logUtil!!.putF(stringBuilder!!.appendint(TsUtil.getInstance()!!.hashCode(this))!!.append(CLEAR)!!.toString(), this, CLEAR)
}


}
                
            

