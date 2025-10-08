
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
public constructor (size: Int)                        

                            : super(){
    //var size = size


                            //For kotlin this is before the body of the constructor.
                    

    
                        if(size < 0)
                        
                                    {
                                    


                            throw IllegalArgumentException(StringMaker().
                            append("Init Size Exception: ")!!.append(size)!!.toString())

                                    }
                                
objectArray= arrayOfNulls(size)
}

public constructor (objectArray: Array<Any?>)
            : super()
        {
    //var objectArray = objectArray
this.objectArray= objectArray
}

public constructor ()                        

                            : this(7){


                            //For kotlin this is before the body of the constructor.
                    
}


    open fun add(index: Int, element: Any)
        //nullable = true from not(false or (false and false)) = true
{
    //var index = index
    //var element = element

    
                        if(index > currentIndex || index < 0)
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(CommonLabels.getInstance()!!.INDEX_LABEL)
stringBuffer!!.append(index)
stringBuffer!!.append(SIZE)
stringBuffer!!.append(currentIndex)



                            throw IndexOutOfBoundsException(stringBuffer!!.toString())

                                    }
                                
ensureCapacity(currentIndex +1)
System.arraycopy(objectArray, index, objectArray, index +1, currentIndex -index)
objectArray[index]= element
currentIndex++
}


    open fun add(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var anyType = anyType
ensureCapacity(currentIndex +1)
objectArray[currentIndex++]= anyType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


    open fun remove(index: Int)
        //nullable = true from not(false or (false and false)) = true
: Any{
    //var index = index

    
                        if(index >= currentIndex)
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(CommonLabels.getInstance()!!.INDEX_LABEL)
stringBuffer!!.append(index)
stringBuffer!!.append(SIZE)
stringBuffer!!.append(currentIndex)



                            throw IndexOutOfBoundsException(stringBuffer!!.toString())

                                    }
                                

    var oldValue: Any = objectArray[index]!!


    var numMoved: Int = currentIndex -index -1


    
                        if(numMoved > 0)
                        System.arraycopy(objectArray, index +1, objectArray, index, numMoved)
objectArray[--currentIndex]= 
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
                                    



                        for (index in 0 until currentIndex)

        {

    
                        if(objectArray[index] == 
                                    null
                                )
                        
                                    {
                                    
    var numMoved: Int = currentIndex -index -1


    
                        if(numMoved > 0)
                        System.arraycopy(objectArray, index +1, objectArray, index, numMoved)
objectArray[--currentIndex]= 
                                        null
                                    



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
}


                                    }
                                
                        else {
                            



                        for (index in 0 until currentIndex)

        {

    
                        if(anyType!!.equals(objectArray[index]!!))
                        
                                    {
                                    
    var numMoved: Int = currentIndex -index -1


    
                        if(numMoved > 0)
                        System.arraycopy(objectArray, index +1, objectArray, index, numMoved)
objectArray[--currentIndex]= 
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
ensureCapacity(currentIndex +list.currentIndex)

    var listSize: Int = list.currentIndex





                        for (index in 0 until listSize)

        {
objectArray[currentIndex++]= list.objectArray[index]!!
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
                

ensureCapacity(currentIndex +numSize)
System.arraycopy(newObjectArray, 0, objectArray, currentIndex, numSize)
currentIndex += numSize



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return numSize != 0
}


    open fun ensureCapacity(minSize: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var minSize = minSize

    var oldCapacity: Int = objectArray!!.size
                


    
                        if(minSize > oldCapacity)
                        
                                    {
                                    
    var newCapacity: Int = ((oldCapacity *3) shr 1) +1


    
                        if(newCapacity < minSize)
                        newCapacity= minSize
objectArray= arrayUtil!!.copyOf(objectArray, newCapacity)

                                    }
                                
}


    open fun trimToSize()
        //nullable = true from not(false or (false and true)) = true
{

    var oldCapacity: Int = objectArray!!.size
                


    
                        if(currentIndex < oldCapacity)
                        objectArray= arrayUtil!!.copyOf(objectArray, currentIndex)
}


    open fun indexOf(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var anyType = anyType

    
                        if(anyType == 
                                    null
                                )
                        
                                    {
                                    



                        for (i in 0 until currentIndex)

        {

    
                        if(objectArray[i] == 
                                    null
                                )
                        


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return i
}


                                    }
                                
                        else {
                            



                        for (i in 0 until currentIndex)

        {

    
                        if(anyType!!.equals(objectArray[i]!!))
                        


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
                                    



                        for (i in currentIndex -1 downTo 0)

        {

    
                        if(objectArray[i] == 
                                    null
                                )
                        


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return i
}


                                    }
                                
                        else {
                            



                        for (i in currentIndex -1 downTo 0)

        {

    
                        if(anyType!!.equals(objectArray[i]!!))
                        


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

    
                        if(index >= currentIndex)
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(CommonLabels.getInstance()!!.INDEX_LABEL)
stringBuffer!!.append(index)
stringBuffer!!.append(SIZE)
stringBuffer!!.append(currentIndex)



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

    
                        if(index >= currentIndex)
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(CommonLabels.getInstance()!!.INDEX_LABEL)
stringBuffer!!.append(index)
stringBuffer!!.append(SIZE)
stringBuffer!!.append(currentIndex)



                            throw IndexOutOfBoundsException(stringBuffer!!.toString())

                                    }
                                

    var oldValue: Any = objectArray[index]!!

objectArray[index]= element



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return oldValue
}


    open fun clear()
        //nullable = true from not(false or (false and true)) = true
{




                        for (i in 0 until currentIndex)

        {
objectArray[i]= 
                                        null
                                    
}

currentIndex= 0
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
                        return arrayUtil!!.copyOf(objectArray, currentIndex)
}


    open fun toArray(objectArray: Array<Any?>)
        //nullable = true from not(false or (false and false)) = true
: Array<Any?>{
    //var objectArray = objectArray

    
                        if(objectArray!!.size < currentIndex)
                        


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return arrayUtil!!.copyOf(this.objectArray, currentIndex, objectArray!!::class)
System.arraycopy(this.objectArray, 0, objectArray, 0, currentIndex)

    
                        if(objectArray!!.size > currentIndex)
                        objectArray[currentIndex]= 
                                        null
                                    



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return objectArray
}


    override fun clone()
        //nullable = true from not(false or (false and true)) = true
: Any{

    var list: BasicArrayList = BasicArrayList()


    var size: Int = this.size()!!


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





                        for (index in 0 until currentIndex)

        {
stringBuffer!!.append(objectArray[index]!!.toString())
stringBuffer!!.append(COMMA_SEP)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

