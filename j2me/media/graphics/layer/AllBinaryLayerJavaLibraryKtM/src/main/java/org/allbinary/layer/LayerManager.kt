
        /* Generated Code Do Not Modify */
        package org.allbinary.layer




        import java.lang.Object        
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.thread.SynchObject
import org.allbinary.util.BasicArrayList

open public class LayerManager
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val layerManagerLogging: LayerManagerLoggingBase

    private val list: BasicArrayList = BasicArrayList()

    private val anyType: SynchObject = SynchObject()
public constructor        (layerManagerLogging: LayerManagerLogging)
            : super()
        {

                    var layerManagerLogging = layerManagerLogging
logUtil!!.put(commonStrings!!.START, this, commonStrings!!.CONSTRUCTOR)
this.layerManagerLogging= layerManagerLogging
}

public constructor        ()
            : super()
        {this.layerManagerLogging= LayerManagerNoDebug.getInstance()
}


open fun contains(layerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var layerInterface = layerInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.list.contains(layerInterface)
}


                @Throws(Exception::class)
            
open fun insert(layerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerInterface = layerInterface

    var nextLayerInterface: AllBinaryLayer


    var size: Int = this.list.size()!!
            





                        for (index in 0 until size)


        {nextLayerInterface= this.list.get(index) as AllBinaryLayer

    
                        if(layerInterface!!.getZP() > nextLayerInterface!!.getZP())
                        
                                    {
                                    this.append(layerInterface, index)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 

                                    }
                                
}

this.append(layerInterface)
}


                @Throws(Exception::class)
            
open fun append(layerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerInterface = layerInterface
this.layerManagerLogging!!.append(layerInterface)
this.list.add(layerInterface)
}


                @Throws(Exception::class)
            
open fun append(layerInterface: AllBinaryLayer, index: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerInterface = layerInterface


                    var index = index
this.layerManagerLogging!!.append(layerInterface, index)
this.list.add(index, layerInterface)
}


                @Throws(Exception::class)
            
open fun remove(layerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerInterface = layerInterface

        
        //synchronized(anyType) 
        //mutex.withLock
        this.layerManagerLogging!!.remove(layerInterface)

    var result: Boolean = this.list.remove(layerInterface)!!
            

this.layerManagerLogging!!.remove(this, layerInterface, result)


}


open fun getLayerAt(index: Int)
        //nullable = true from not(false or (false and false)) = true
: Layer{

                    var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.list.objectArray[index]!! as Layer
}


open fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.list.size()
}


                @Throws(Exception::class)
            
open fun cleanup()
        //nullable = true from not(false or (false and true)) = true
{
        
        //synchronized(anyType) 
        //mutex.withLock
        this.list.clear()
this.layerManagerLogging!!.clear()
System.gc()
System.gc()


}


open fun paint(g: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var g = g


                    var x = x


                    var y = y

        
        //synchronized(anyType) 
        //mutex.withLock
        
    var comp: Layer





                        for (index in this.list.size()!! downTo 0)


        {comp= list.objectArray[index]!! as Layer

    
                        if(comp != 
                                    null
                                 && comp.isVisible())
                        
                                    {
                                    comp.paint(g)

                                    }
                                
}



}


}
                
            

