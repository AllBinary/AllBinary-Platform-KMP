
        /* Generated Code Do Not Modify */
        package org.allbinary.animation




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector

open public class PathParser
            : Object
         {
        
companion object {
            
    open fun tokenize(d: String)
        //nullable = true from not(false or (false and false)) = true
: Array<String?>{
var d = d

    var tokens: Vector = Vector()


    var sb: StringBuffer = StringBuffer()





                        for (i in 0 until d.length!!)

        {

    var c: Char = d[i]!!


    
                        if(c == ' ' || c == ',' || c == '\t' || c == '\n' || c == '\r')
                        
                                    {
                                    
    
                        if(sb.length() > 0)
                        
                                    {
                                    tokens.addElement(sb.toString())
sb.setLength(0)

                                    }
                                

                                    }
                                
                             else 
    
                        if(c == 'M' || c == 'm' || c == 'L' || c == 'l' || c == 'V' || c == 'v' || c == 'C' || c == 'c' || c == 'Z' || c == 'z')
                        
                                    {
                                    
    
                        if(sb.length() > 0)
                        
                                    {
                                    tokens.addElement(sb.toString())
sb.setLength(0)

                                    }
                                
tokens.addElement(c.concatToString()

                                    )

                                    }
                                
                        else {
                            sb.append(c)

                        }
                            
}


    
                        if(sb.length() > 0)
                        tokens.addElement(sb.toString())

    var res: Array<String?> = arrayOfNulls(tokens.size)

tokens.copyInto(res)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return res
}


    open fun parsePath(d: String, outX: IntArray, outY: IntArray, maxPoints: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
var d = d
var outX = outX
var outY = outY
var maxPoints = maxPoints

    var tokens: Array<String?> = tokenize(d)!!


    var count: IntArray = intArrayOf(0)


    var fixedPoint: FixedPoint = FixedPoint.getInstance()!!


    var curX: Int = 0
var curY: Int = 0


    var startX: Int = 0
var startY: Int = 0


    var idx: Int = 0


        while(idx < tokens.size)
        {

    var tok: String = tokens[idx++]!!


    var cmd: Char = tok[0]!!


    
                        if(cmd == 'M' || cmd == 'm')
                        
                                    {
                                    
    var x: Int = fixedPoint!!.toFixed((tokens[idx++]!!).toDouble())!!


    var y: Int = fixedPoint!!.toFixed((tokens[idx++]!!).toDouble())!!


    
                        if(cmd == 'm')
                        
                                    {
                                    x += curX
y += curY

                                    }
                                
curX= x
curY= y
startX= x
startY= y
outX[count[0]]= curX
outY[count[0]]= curY
count[0]++

                                    }
                                
                             else 
    
                        if(cmd == 'L' || cmd == 'l')
                        
                                    {
                                    
    var x: Int = fixedPoint!!.toFixed((tokens[idx++]!!).toDouble())!!


    var y: Int = fixedPoint!!.toFixed((tokens[idx++]!!).toDouble())!!


    
                        if(cmd == 'l')
                        
                                    {
                                    x += curX
y += curY

                                    }
                                
curX= x
curY= y
outX[count[0]]= curX
outY[count[0]]= curY
count[0]++

                                    }
                                
                             else 
    
                        if(cmd == 'V' || cmd == 'v')
                        
                                    {
                                    
    var y: Int = fixedPoint!!.toFixed((tokens[idx++]!!).toDouble())!!


    
                        if(cmd == 'v')
                        
                                    {
                                    y += curY

                                    }
                                
curY= y
outX[count[0]]= curX
outY[count[0]]= curY
count[0]++

                                    }
                                
                             else 
    
                        if(cmd == 'C' || cmd == 'c')
                        
                                    {
                                    
    var x1: Int = fixedPoint!!.toFixed((tokens[idx++]!!).toDouble())!!


    var y1: Int = fixedPoint!!.toFixed((tokens[idx++]!!).toDouble())!!


    var x2: Int = fixedPoint!!.toFixed((tokens[idx++]!!).toDouble())!!


    var y2: Int = fixedPoint!!.toFixed((tokens[idx++]!!).toDouble())!!


    var x3: Int = fixedPoint!!.toFixed((tokens[idx++]!!).toDouble())!!


    var y3: Int = fixedPoint!!.toFixed((tokens[idx++]!!).toDouble())!!


    
                        if(cmd == 'c')
                        
                                    {
                                    x1 += curX
y1 += curY
x2 += curX
y2 += curY
x3 += curX
y3 += curY

                                    }
                                
PGUtil.getInstance()!!.flattenCubicBezier(curX, curY, x1, y1, x2, y2, x3, y3, outX, outY, count, maxPoints)
curX= x3
curY= y3

                                    }
                                
                             else 
    
                        if(cmd == 'Z' || cmd == 'z')
                        
                                    {
                                    curX= startX
curY= startY
outX[count[0]]= curX
outY[count[0]]= curY
count[0]++

                                    }
                                

        while(idx < tokens.size && !isCommand(tokens[idx]!!))
        {

    
                        if(cmd == 'M' || cmd == 'm' || cmd == 'L' || cmd == 'l')
                        
                                    {
                                    
    var x: Int = fixedPoint!!.toFixed((tokens[idx++]!!).toDouble())!!


    var y: Int = fixedPoint!!.toFixed((tokens[idx++]!!).toDouble())!!


    
                        if(cmd == 'm' || cmd == 'l')
                        
                                    {
                                    x += curX
y += curY

                                    }
                                
curX= x
curY= y
outX[count[0]]= curX
outY[count[0]]= curY
count[0]++

                                    }
                                
                             else 
    
                        if(cmd == 'V' || cmd == 'v')
                        
                                    {
                                    
    var y: Int = fixedPoint!!.toFixed((tokens[idx++]!!).toDouble())!!


    
                        if(cmd == 'v')
                        
                                    {
                                    y += curY

                                    }
                                
curY= y
outX[count[0]]= curX
outY[count[0]]= curY
count[0]++

                                    }
                                
}

}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return count[0]!!
}


    open fun isCommand(tok: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var tok = tok

    var c: Char = tok[0]!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "MmLlVvCcZz".indexOf(c) >= 0
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

