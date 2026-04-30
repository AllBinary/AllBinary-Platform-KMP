
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


    open fun addAt(index: Int, element: Any)
        //nullable = true from not(false or (false and false)) = true
{
    //var index = index
    //var element = element

    
                        if(index > this.currentIndex || index < 0)
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(CommonLabels.getInstance()!!.INDEX_LABEL)
stringBuffer!!.appendint(index)
stringBuffer!!.append(BasicArrayList.SIZE)
stringBuffer!!.appendint(this.currentIndex)



                            throw IndexOutOfBoundsException(stringBuffer!!.toString())

                                    }
                                
this.ensureCapacity(this.currentIndex +1)
System.arraycopy(this.objectArray, index, this.objectArray, index +1, this.currentIndex -index)
this.objectArray[index]= element
this.currentIndex++
}


    open fun add(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var anyType = anyType
this.ensureCapacity(this.currentIndex +1)
this.objectArray[this.currentIndex++]= anyType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


    open fun removeAt(index: Int)
        //nullable = true from not(false or (false and false)) = true
: Any{
    //var index = index

    
                        if(index >= this.currentIndex)
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(CommonLabels.getInstance()!!.INDEX_LABEL)
stringBuffer!!.appendint(index)
stringBuffer!!.append(BasicArrayList.SIZE)
stringBuffer!!.appendint(this.currentIndex)



                            throw IndexOutOfBoundsException(stringBuffer!!.toString())

                                    }
                                

    var oldValue: Any = this.objectArray[index]!!


    var numMoved: Int = this.currentIndex -index -1


    
                        if(numMoved > 0)
                        
                                    {
                                    System.arraycopy(this.objectArray, index +1, this.objectArray, index, numMoved)

                                    }
                                
this.objectArray[--this.currentIndex]= 
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
                                    
    var numMoved: Int = this.currentIndex -index -1


    
                        if(numMoved > 0)
                        
                                    {
                                    System.arraycopy(this.objectArray, index +1, this.objectArray, index, numMoved)

                                    }
                                
this.objectArray[--this.currentIndex]= 
                                        null
                                    



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
}


                                    }
                                
                        else {
                            



                        for (index in 0 until this.currentIndex)

        {

    
                        if(anyType == this.objectArray[index] || anyType!!.equals(this.objectArray[index]!!))
                        
                                    {
                                    
    var numMoved: Int = this.currentIndex -index -1


    
                        if(numMoved > 0)
                        
                                    {
                                    System.arraycopy(this.objectArray, index +1, this.objectArray, index, numMoved)

                                    }
                                
this.objectArray[--this.currentIndex]= 
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
this.ensureCapacity(this.currentIndex +list.currentIndex)

    var listSize: Int = list.currentIndex





                        for (index in 0 until listSize)

        {
this.objectArray[this.currentIndex++]= list.objectArray[index]!!
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


    open fun addAllList(list: BasicArrayList)
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
                

this.ensureCapacity(this.currentIndex +numSize)
System.arraycopy(newObjectArray, 0, this.objectArray, this.currentIndex, numSize)
this.currentIndex += numSize



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
                        
                                    {
                                    newCapacity= minSize

                                    }
                                
this.objectArray= this.arrayUtil!!.copyOf(this.objectArray, newCapacity)

                                    }
                                
}


    open fun trimToSize()
        //nullable = true from not(false or (false and true)) = true
{

    var oldCapacity: Int = this.objectArray!!.size
                


    
                        if(this.currentIndex < oldCapacity)
                        
                                    {
                                    this.objectArray= this.arrayUtil!!.copyOf(this.objectArray, this.currentIndex)

                                    }
                                
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
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return i

                                    }
                                
}


                                    }
                                
                        else {
                            



                        for (i in 0 until this.currentIndex)

        {

    
                        if(anyType!!.equals(this.objectArray[i]!!))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return i

                                    }
                                
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
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return i

                                    }
                                
}


                                    }
                                
                        else {
                            



                        for (i in this.currentIndex -1 downTo 0)

        {

    
                        if(anyType!!.equals(this.objectArray[i]!!))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return i

                                    }
                                
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
stringBuffer!!.append(BasicArrayList.SIZE)
stringBuffer!!.appendint(this.currentIndex)



                            throw IndexOutOfBoundsException(stringBuffer!!.toString())

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.objectArray[index]!!
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
stringBuffer!!.append(BasicArrayList.SIZE)
stringBuffer!!.appendint(this.currentIndex)



                            throw IndexOutOfBoundsException(stringBuffer!!.toString())

                                    }
                                

    var oldValue: Any = this.objectArray[index]!!

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
                        return this.currentIndex
}


    open fun isEmpty()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.currentIndex == 0
}


    open fun contains(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var anyType = anyType



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.indexOf(anyType) >= 0
}


    open fun toArray()
        //nullable = true from not(false or (false and true)) = true
: Array<Any?>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.arrayUtil!!.copyOf(this.objectArray, this.currentIndex)
}


    open fun toArrayType(objectArray: Array<Any?>)
        //nullable = true from not(false or (false and false)) = true
: Array<Any?>{
    //var objectArray = objectArray

    
                        if(objectArray!!.size < this.currentIndex)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.arrayUtil!!.copyOfType(this.objectArray, this.currentIndex, objectArray!!::class)

                                    }
                                
System.arraycopy(this.objectArray, 0, objectArray, 0, this.currentIndex)

    
                        if(objectArray!!.size > this.currentIndex)
                        
                                    {
                                    objectArray[this.currentIndex]= 
                                        null
                                    

                                    }
                                



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
                
            

