
        /* Generated Code Do Not Modify */
        package org.allbinary.logic.string



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class StringMaker
            : Object
         {
        

    private var charArray: CharArray

    private var currentLength: Int= 0
public constructor        ()
            : super()
        {charArray= CharArray(20)
}


open fun append(string: String)
        //nullable = true from not(false or (false and false)) = true
: StringMaker{

                    var string = string

    var stringLength: Int = string!!.length!!
            

ensureCapacity(currentLength +stringLength)
string!!.toCharArray(charArray,
                                    currentLength,
                                    0,
                                    stringLength)
currentLength += stringLength



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this
}


open fun append(c: Char)
        //nullable = true from not(false or (false and false)) = true
: StringMaker{

                    var c = c
ensureCapacity(currentLength +1)
charArray[currentLength++]= c



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this
}


open fun append(b: Byte)
        //nullable = true from not(false or (false and false)) = true
: StringMaker{

                    var b = b
this.append(b.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this
}


open fun append(b: Short)
        //nullable = true from not(false or (false and false)) = true
: StringMaker{

                    var b = b
this.append(b.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this
}


open fun append(i: Int)
        //nullable = true from not(false or (false and false)) = true
: StringMaker{

                    var i = i
this.append(i.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this
}


open fun append(l: Long)
        //nullable = true from not(false or (false and false)) = true
: StringMaker{

                    var l = l
this.append(l.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this
}


open fun append(f: Float)
        //nullable = true from not(false or (false and false)) = true
: StringMaker{

                    var f = f
this.append(f.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this
}


open fun append(bool: Boolean)
        //nullable = true from not(false or (false and false)) = true
: StringMaker{

                    var bool = bool

    
                        if(bool)
                        
                                    {
                                    ensureCapacity(currentLength +4)
charArray[currentLength++]= 
                                    't'
                                    
charArray[currentLength++]= 
                                    'r'
                                    
charArray[currentLength++]= 
                                    'u'
                                    
charArray[currentLength++]= 
                                    'e'
                                    

                                    }
                                
                        else {
                            ensureCapacity(currentLength +5)
charArray[currentLength++]= 
                                    'f'
                                    
charArray[currentLength++]= 
                                    'a'
                                    
charArray[currentLength++]= 
                                    'l'
                                    
charArray[currentLength++]= 
                                    's'
                                    
charArray[currentLength++]= 
                                    'e'
                                    

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this
}


open fun ensureCapacity(minSize: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var minSize = minSize

    var oldCapacity: Int = charArray!!.size
                


    
                        if(minSize > oldCapacity)
                        
                                    {
                                    
    var newCapacity: Int = oldCapacity *3


    
                        if(newCapacity < minSize)
                        newCapacity= minSize

    var copy: CharArray = 
                                                        
                                                        CharArray(newCapacity)
                                                    


    var min: Int = min(charArray!!.size, newCapacity)!!
            

System.arraycopy(charArray, 0, copy, 0, min)
charArray= copy

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

                    var start = start


                    var end = end
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
                        return charArray.concatToString(0, currentLength)
}


}
                
            

