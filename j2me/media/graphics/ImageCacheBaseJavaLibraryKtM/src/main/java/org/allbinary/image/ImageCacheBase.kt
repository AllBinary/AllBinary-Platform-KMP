
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
        package org.allbinary.image



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.InputStream
import java.util.Hashtable
import javax.microedition.lcdui.Image
import javax.microedition.lcdui.NullCanvas
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonSeps
import org.allbinary.util.BasicArrayList

open public class ImageCacheBase
            : Object
         {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val hashtable: Hashtable<Any, Any> = Hashtable<Any, Any>()

    val SIZE: Int = 128

    val widths: IntArray = IntArray(SIZE)

    val heights: IntArray = IntArray(SIZE)

    val listOfList: Array<BasicArrayList?> = arrayOfNulls(SIZE)

    val availableListOfList: Array<BasicArrayList?> = arrayOfNulls(SIZE)

    var volume: Int = 0

    var nextIndex: Int = 0
protected constructor        ()
            : super()
        {



                        for (index in listOfList!!.size -1 downTo 0)


        {listOfList[index]= BasicArrayList()
}





                        for (index in availableListOfList!!.size -1 downTo 0)


        {availableListOfList[index]= BasicArrayList()
}

}


open fun releaseAll()
        //nullable = true from not(false or (false and true)) = true
{



                        for (index in listOfList!!.size -1 downTo 0)


        {availableListOfList[index]!!.clear()
availableListOfList[index]!!.addAll(listOfList[index]!!)
}

logUtil!!.put(StringMaker().
                            append(
                            "ImageCache: ")!!.append(this.toString())!!.toString(), this, 
                            "releaseAll")
}


open fun getIndex(width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var width = width


                    var height = height

    var foundIndex: Int =  -1


    var size: Int = widths.size
                





                        for (index in 0 until size)


        {
    
                        if(widths[index] == width && heights[index] == height)
                        
                                    {
                                    foundIndex= index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return foundIndex

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return foundIndex
}


open fun getFromAvailable(foundIndex: Int, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var foundIndex = foundIndex


                    var width = width


                    var height = height

    
                        if(foundIndex !=  -1)
                        
                                    {
                                    
    
                        if(availableListOfList[foundIndex]!!.size() > 0)
                        
                                    {
                                    
    var list: BasicArrayList = availableListOfList[foundIndex]!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list.remove(list.size() -1) as Image

                                    }
                                

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullCanvas.NULL_IMAGE
}


                @Throws(Exception::class)
            
open fun get(anyType: Any, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var anyType = anyType


                    var width = width


                    var height = height



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.get(anyType!!::class.qualifiedName!!, width, height)
}


                @Throws(Exception::class)
            
open fun get(caller: String, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var caller = caller


                    var width = width


                    var height = height



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
open fun get(key: Any)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var key = key



                            throw RuntimeException()
}


                @Throws(Exception::class)
            
open fun createImage(caller: String, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var caller = caller


                    var width = width


                    var height = height



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Image.createImage(width, height)
}


                @Throws(Exception::class)
            
open fun createImage(key: Any, inputStream: InputStream)
        //nullable = true from not(false or (false and false)) = true
: Image{

                    var key = key


                    var inputStream = inputStream

    var image: Image = Image.createImage(inputStream)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()





                        for (index in this.nextIndex -1 downTo 0)


        {
    var width: Int = widths[index]!!


    var height: Int = heights[index]!!


    var total: Int = listOfList[index]!!.size()!!
            


    var totalAvailable: Int = availableListOfList[index]!!.size()!!
            

stringBuffer!!.append(
                            " w: ")
stringBuffer!!.append(width)
stringBuffer!!.append(
                            " h: ")
stringBuffer!!.append(height)
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(CommonLabels.getInstance()!!.TOTAL_LABEL)
stringBuffer!!.append(total)
stringBuffer!!.append(
                            " available: ")
stringBuffer!!.append(totalAvailable)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun getHashtableP()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashtable
}


open fun init(image: Image)
        //nullable = true from not(false or (false and false)) = true
{

                    var image = image
}


open fun initProgress()
        //nullable = true from not(false or (false and true)) = true
{}


}
                
            

