
        /* Generated Code Do Not Modify */
        package org.allbinary.util




        import java.lang.Object        
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonSeps

open public class BasicArrayList
            : Object
         {
        
companion object {
            
    private val SIZE: String = ", Size: "

        }
            
    private val arrayUtil: ArrayUtil = ArrayUtil.getInstance()!!

    var objectArray: Array<Any?>

    private var currentIndex: Int = 0
public constructor (objectArray: Array<Any?>)
            : super()
        {
    //var objectArray = objectArray
this.objectArray= objectArray
}


    open fun add(index: Int, element: Any)
        //nullable = true from not(false or (false and false)) = true
{
    //var index = index
    //var element = element

    
                        if(index > this.currentIndex || index < 0)
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(CommonLabels.getInstance()!!.INDEX_LABEL)
stringBuffer!!.appendint(index)
stringBuffer!!.append(SIZE)
stringBuffer!!.appendint(this.currentIndex)



                            throw IndexOutOfBoundsException(stringBuffer!!.toString())

                                    }
                                
ensureCapacity(this.currentIndex +1)
System.arraycopy(objectArray, index, objectArray, index +1, currentIndex -index)
objectArray[index]= element
currentIndex++
}


    open fun add(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var anyType = anyType
ensureCapacity(this.currentIndex +1)
this.objectArray[currentIndex++]= anyType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


    open fun remove(index: Int)
        //nullable = true from not(false or (false and false)) = true
: Any{
    //var index = index

    
                        if(index >= this.currentIndex)
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(CommonLabels.getInstance()!!.INDEX_LABEL)
stringBuffer!!.appendint(index)
stringBuffer!!.append(SIZE)
stringBuffer!!.appendint(this.currentIndex)



                            throw IndexOutOfBoundsException(stringBuffer!!.toString())

                                    }
                                

    var oldValue: Any = this.objectArray[index]!!


    var numMoved: Int = currentIndex -index -1


    
                        if(numMoved > 0)
                        System.arraycopy(objectArray, index +1, objectArray, index, numMoved)
objectArray[--this.currentIndex]= 
                                        null
                                    



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return oldValue
}


    open fun remove(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var anyType = anyType

    
                        if(anyType == 
                                    null
                                )
                        
                                    {
                                    



                        for (index in 0 until this.currentIndex)

        {

    
                        if(this.objectArray[index] == 
                                    null
                                )
                        
                                    {
                                    
    var numMoved: Int = currentIndex -index -1


    
                        if(numMoved > 0)
                        
                                    {
                                    System.arraycopy(objectArray, index +1, objectArray, index, numMoved)

                                    }
                                
objectArray[--this.currentIndex]= 
                                        null
                                    



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
}


                                    }
                                
                        else {
                            



                        for (index in 0 until this.currentIndex)

        {

    
                        if(anyType == objectArray[index] || anyType!!.equals(objectArray[index]!!))
                        
                                    {
                                    
    var numMoved: Int = currentIndex -index -1


    
                        if(numMoved > 0)
                        
                                    {
                                    System.arraycopy(objectArray, index +1, objectArray, index, numMoved)

                                    }
                                
objectArray[--this.currentIndex]= 
                                        null
                                    



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
}


                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun removeAll2(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var list = list

    var result: Boolean = true


    var size: Int = list.size()!!





                        for (index in 0 until size)

        {

    
                        if(this.remove(list.get(index)))
                        
                                    {
                                    
                                    }
                                
                        else {
                            result= false

                        }
                            
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
}


    open fun addAll2(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var list = list
ensureCapacity(this.currentIndex +list.currentIndex)

    var listSize: Int = list.currentIndex





                        for (index in 0 until listSize)

        {
this.objectArray[currentIndex++]= list.objectArray[index]!!
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


    open fun addAll(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var list = list

    var newObjectArray: Array<Any?> = list.toArray()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.addAll(newObjectArray)
}


    open fun addAll(newObjectArray: Array<Any?>)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var newObjectArray = newObjectArray

    var numSize: Int = newObjectArray!!.size
                

ensureCapacity(this.currentIndex +numSize)
System.arraycopy(newObjectArray, 0, objectArray, currentIndex, numSize)
currentIndex += numSize



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return numSize != 0
}


    open fun ensureCapacity(minSize: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var minSize = minSize

    var oldCapacity: Int = this.objectArray!!.size
                


    
                        if(minSize > oldCapacity)
                        
                                    {
                                    
    var newCapacity: Int = ((oldCapacity *3) shr 1) +1


    
                        if(newCapacity < minSize)
                        newCapacity= minSize
this.objectArray= this.arrayUtil!!.copyOf(this.objectArray, newCapacity)

                                    }
                                
}


    open fun trimToSize()
        //nullable = true from not(false or (false and true)) = true
{

    var oldCapacity: Int = this.objectArray!!.size
                


    
                        if(this.currentIndex < oldCapacity)
                        this.objectArray= this.arrayUtil!!.copyOf(this.objectArray, currentIndex)
}


    open fun indexOf(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var anyType = anyType

    
                        if(anyType == 
                                    null
                                )
                        
                                    {
                                    



                        for (i in 0 until this.currentIndex)

        {

    
                        if(this.objectArray[i] == 
                                    null
                                )
                        


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return i
}


                                    }
                                
                        else {
                            



                        for (i in 0 until this.currentIndex)

        {

    
                        if(anyType!!.equals(this.objectArray[i]!!))
                        


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return i
}


                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}


    open fun lastIndexOf(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var anyType = anyType

    
                        if(anyType == 
                                    null
                                )
                        
                                    {
                                    



                        for (i in this.currentIndex -1 downTo 0)

        {

    
                        if(this.objectArray[i] == 
                                    null
                                )
                        


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return i
}


                                    }
                                
                        else {
                            



                        for (i in this.currentIndex -1 downTo 0)

        {

    
                        if(anyType!!.equals(this.objectArray[i]!!))
                        


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return i
}


                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}


    open fun get(index: Int)
        //nullable = true from not(false or (false and false)) = true
: Any{
    //var index = index

    
                        if(index >= this.currentIndex)
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(CommonLabels.getInstance()!!.INDEX_LABEL)
stringBuffer!!.appendint(index)
stringBuffer!!.append(SIZE)
stringBuffer!!.appendint(this.currentIndex)



                            throw IndexOutOfBoundsException(stringBuffer!!.toString())

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return objectArray[index]!!
}


    open fun set(index: Int, element: Any)
        //nullable = true from not(false or (false and false)) = true
: Any{
    //var index = index
    //var element = element

    
                        if(index >= this.currentIndex)
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(CommonLabels.getInstance()!!.INDEX_LABEL)
stringBuffer!!.appendint(index)
stringBuffer!!.append(SIZE)
stringBuffer!!.appendint(this.currentIndex)



                            throw IndexOutOfBoundsException(stringBuffer!!.toString())

                                    }
                                

    var oldValue: Any = objectArray[index]!!

this.objectArray[index]= element



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return oldValue
}


    open fun clear()
        //nullable = true from not(false or (false and true)) = true
{




                        for (i in 0 until this.currentIndex)

        {
this.objectArray[i]= 
                                        null
                                    
}

this.currentIndex= 0
}


    open fun size()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return currentIndex
}


    open fun isEmpty()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return currentIndex == 0
}


    open fun contains(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var anyType = anyType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return indexOf(anyType) >= 0
}


    open fun toArray()
        //nullable = true from not(false or (false and true)) = true
: Array<Any?>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return arrayUtil!!.copyOf(this.objectArray, currentIndex)
}


    open fun toArray(objectArray: Array<Any?>)
        //nullable = true from not(false or (false and false)) = true
: Array<Any?>{
    //var objectArray = objectArray

    
                        if(objectArray!!.size < this.currentIndex)
                        


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return arrayUtil!!.copyOf(this.objectArray, currentIndex, objectArray!!::class)
System.arraycopy(this.objectArray, 0, objectArray, 0, currentIndex)

    
                        if(objectArray!!.size > currentIndex)
                        objectArray[currentIndex]= 
                                        null
                                    



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return objectArray
}


    public override fun clone()
        //nullable = true from not(false or (false and true)) = true
: Any{

    var size: Int = this.size()!!


    var list: BasicArrayList = BasicArrayListS(size)


    var anyType: Any





                        for (index in 0 until size)

        {
anyType= this.objectArray[index]!!
list.add(anyType)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return list
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var COMMA_SEP: String = CommonSeps.getInstance()!!.COMMA_SEP


    var stringBuffer: StringMaker = StringMaker()





                        for (index in 0 until this.currentIndex)

        {
stringBuffer!!.append(this.objectArray[index]!!.toString())
stringBuffer!!.append(COMMA_SEP)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

