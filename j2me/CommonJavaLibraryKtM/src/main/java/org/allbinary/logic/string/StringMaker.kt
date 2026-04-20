
        /* Generated Code Do Not Modify */
        package org.allbinary.logic.string




        import java.lang.Object        
        
        import java.lang.Integer
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class StringMaker
            : Object
         {
        

    private var charArray: CharArray

    private var currentLength: Int= 0
public constructor ()
            : super()
        {
this.charArray= CharArray(20)
}


    open fun append(string: String)
        //nullable = true from not(false or (false and false)) = true
: StringMaker{
    //var string = string

    var stringLength: Int = string.length!!

this.ensureCapacity(this.currentLength +stringLength)
string.toCharArray(this.charArray, this.currentLength, 0,
                                    stringLength)
this.currentLength += stringLength



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this
}


    open fun appendchar(c: Char)
        //nullable = true from not(false or (false and false)) = true
: StringMaker{
    //var c = c
this.ensureCapacity(this.currentLength +1)
this.charArray[this.currentLength++]= c



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this
}


    open fun appendbyte(b: Byte)
        //nullable = true from not(false or (false and false)) = true
: StringMaker{
    //var b = b
this.append(b.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this
}


    open fun appendshort(b: Short)
        //nullable = true from not(false or (false and false)) = true
: StringMaker{
    //var b = b
this.append(b.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this
}


    open fun appendint(i: Int)
        //nullable = true from not(false or (false and false)) = true
: StringMaker{
    //var i = i
this.append(i.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this
}


    open fun appendlong(l: Long)
        //nullable = true from not(false or (false and false)) = true
: StringMaker{
    //var l = l
this.append(l.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this
}


    open fun appendfloat(f: Float)
        //nullable = true from not(false or (false and false)) = true
: StringMaker{
var f = f
this.append(f.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this
}


    open fun appendboolean(bool: Boolean)
        //nullable = true from not(false or (false and false)) = true
: StringMaker{
    //var bool = bool

    
                        if(bool)
                        
                                    {
                                    this.ensureCapacity(this.currentLength +4)
this.charArray[this.currentLength++]= 
                                    't'
                                    
this.charArray[this.currentLength++]= 
                                    'r'
                                    
this.charArray[this.currentLength++]= 
                                    'u'
                                    
this.charArray[this.currentLength++]= 
                                    'e'
                                    

                                    }
                                
                        else {
                            this.ensureCapacity(this.currentLength +5)
this.charArray[this.currentLength++]= 
                                    'f'
                                    
this.charArray[this.currentLength++]= 
                                    'a'
                                    
this.charArray[this.currentLength++]= 
                                    'l'
                                    
this.charArray[this.currentLength++]= 
                                    's'
                                    
this.charArray[this.currentLength++]= 
                                    'e'
                                    

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this
}


    open fun ensureCapacity(minSize: Int)
        //nullable = true from not(false or (false and false)) = true
{
    //var minSize = minSize

    var oldCapacity: Int = this.charArray!!.size
                


    
                        if(minSize > oldCapacity)
                        
                                    {
                                    
    var newCapacity: Int = oldCapacity *3


    
                        if(newCapacity < minSize)
                        newCapacity= minSize

    var copy: CharArray = 
                                                        
                                                        CharArray(newCapacity)
                                                    


    var min: Int = this.min(this.charArray!!.size, newCapacity)!!

System.arraycopy(this.charArray, 0, copy, 0, min)
this.charArray= copy

                                    }
                                
}


    open fun min(value: Int, value2: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
var value = value
var value2 = value2



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return if((value <= value2)) {
                            
                            value
                        
                            } else {
                            value2
                            }
    
}


    open fun delete(start: Int, end: Int)
        //nullable = true from not(false or (false and false)) = true
: StringMaker{
    //var start = start
    //var end = end
this.currentLength -= (end -start)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this
}


    open fun length()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.currentLength
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return charArray.concatToString(0, this.currentLength)
}


}
                
            

