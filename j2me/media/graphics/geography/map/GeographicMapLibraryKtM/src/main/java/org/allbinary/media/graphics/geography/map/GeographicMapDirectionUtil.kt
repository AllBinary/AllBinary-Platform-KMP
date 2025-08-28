
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
        package org.allbinary.media.graphics.geography.map




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.direction.Direction
import org.allbinary.direction.DirectionFactory
import org.allbinary.graphics.CellPosition

open public class GeographicMapDirectionUtil
            : Object
         {
        

        companion object {
            
    private val instance: GeographicMapDirectionUtil = GeographicMapDirectionUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GeographicMapDirectionUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor        ()
            : super()
        {
}


    private val MESSAGE: String = "Cell Position should have been cached!!!"

                @Throws(Exception::class)
            
open fun getDirectionFromCellPositionToAdjacentCellPosition(fromGeographicMapCellPosition: GeographicMapCellPosition, toGeographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: Direction{
var fromGeographicMapCellPosition = fromGeographicMapCellPosition
var toGeographicMapCellPosition = toGeographicMapCellPosition

    var fromColumn: Int = fromGeographicMapCellPosition!!.getColumn()!!


    var fromRow: Int = fromGeographicMapCellPosition!!.getRow()!!


    var goColumn: Int = toGeographicMapCellPosition!!.getColumn()!!


    var goRow: Int = toGeographicMapCellPosition!!.getRow()!!


    var directionFactory: DirectionFactory = DirectionFactory.getInstance()!!


    
                        if(fromColumn -1 == goColumn)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.LEFT

                                    }
                                
                             else 
    
                        if(fromColumn +1 == goColumn)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.RIGHT

                                    }
                                
                             else 
    
                        if(fromRow -1 == goRow)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.UP

                                    }
                                
                             else 
    
                        if(fromRow +1 == goRow)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.DOWN

                                    }
                                
                             else 
    
                        if(fromGeographicMapCellPosition == toGeographicMapCellPosition)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.NO_DIRECTION

                                    }
                                
                             else 
    
                        if(fromRow == goRow && fromColumn == goColumn)
                        
                                    {
                                    


                            throw Exception(MESSAGE)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.NOT_BORDERED_WITH
}


                @Throws(Exception::class)
            
open fun getEightDirectionFromCellPositionToAdjacentCellPosition(fromGeographicMapCellPosition: GeographicMapCellPosition, toGeographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: Direction{
var fromGeographicMapCellPosition = fromGeographicMapCellPosition
var toGeographicMapCellPosition = toGeographicMapCellPosition

    var fromColumn: Int = fromGeographicMapCellPosition!!.getColumn()!!


    var fromRow: Int = fromGeographicMapCellPosition!!.getRow()!!


    var goColumn: Int = toGeographicMapCellPosition!!.getColumn()!!


    var goRow: Int = toGeographicMapCellPosition!!.getRow()!!


    var directionFactory: DirectionFactory = DirectionFactory.getInstance()!!


    
                        if(fromRow == goRow)
                        
                                    {
                                    
    
                        if(fromColumn -1 == goColumn)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.LEFT

                                    }
                                
                             else 
    
                        if(fromColumn +1 == goColumn)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.RIGHT

                                    }
                                

                                    }
                                
                             else 
    
                        if(fromRow -1 == goRow)
                        
                                    {
                                    
    
                        if(fromColumn == goColumn)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.UP

                                    }
                                

    
                        if(fromColumn -1 == goColumn)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.UP_LEFT

                                    }
                                
                             else 
    
                        if(fromColumn +1 == goColumn)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.UP_RIGHT

                                    }
                                

                                    }
                                
                             else 
    
                        if(fromRow +1 == goRow)
                        
                                    {
                                    
    
                        if(fromColumn == goColumn)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.DOWN

                                    }
                                

    
                        if(fromColumn -1 == goColumn)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.DOWN_LEFT

                                    }
                                
                             else 
    
                        if(fromColumn +1 == goColumn)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.DOWN_RIGHT

                                    }
                                

                                    }
                                
                             else 
    
                        if(fromGeographicMapCellPosition == toGeographicMapCellPosition)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.NO_DIRECTION

                                    }
                                
                             else 
    
                        if(fromRow == goRow && fromColumn == goColumn)
                        
                                    {
                                    


                            throw Exception(MESSAGE)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.NOT_BORDERED_WITH
}


                @Throws(Exception::class)
            
open fun getDirectionFromCellPositionToCellPosition(fromGeographicMapCellPosition: GeographicMapCellPosition, toGeographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: Direction{
var fromGeographicMapCellPosition = fromGeographicMapCellPosition
var toGeographicMapCellPosition = toGeographicMapCellPosition

    var fromColumn: Int = fromGeographicMapCellPosition!!.getColumn()!!


    var fromRow: Int = fromGeographicMapCellPosition!!.getRow()!!


    var goColumn: Int = toGeographicMapCellPosition!!.getColumn()!!


    var goRow: Int = toGeographicMapCellPosition!!.getRow()!!


    var directionFactory: DirectionFactory = DirectionFactory.getInstance()!!


    
                        if(fromColumn > goColumn)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.LEFT

                                    }
                                
                             else 
    
                        if(fromColumn < goColumn)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.RIGHT

                                    }
                                
                             else 
    
                        if(fromRow > goRow)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.UP

                                    }
                                
                             else 
    
                        if(fromRow < goRow)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.DOWN

                                    }
                                

    var stringMaker: StringMaker = StringMaker()


    var string: String = stringMaker!!.append(CellPosition.toString(fromGeographicMapCellPosition))!!.append(" == ")!!.append(CellPosition.toString(toGeographicMapCellPosition))!!.toString()!!

stringMaker!!.delete(0, stringMaker!!.length())



                            throw Exception(stringMaker!!.append("Error: ")!!.append(string)!!.toString())
}


    private val ERROR: String = "Error: "

    private val EQUAL: String = " == "

                @Throws(Exception::class)
            
open fun getEightDirectionFromCellPositionToCellPosition(fromGeographicMapCellPosition: GeographicMapCellPosition, toGeographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
: Direction{
var fromGeographicMapCellPosition = fromGeographicMapCellPosition
var toGeographicMapCellPosition = toGeographicMapCellPosition

    var fromColumn: Int = fromGeographicMapCellPosition!!.getColumn()!!


    var fromRow: Int = fromGeographicMapCellPosition!!.getRow()!!


    var goColumn: Int = toGeographicMapCellPosition!!.getColumn()!!


    var goRow: Int = toGeographicMapCellPosition!!.getRow()!!


    var directionFactory: DirectionFactory = DirectionFactory.getInstance()!!


    
                        if(fromGeographicMapCellPosition == toGeographicMapCellPosition)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.NO_DIRECTION

                                    }
                                
                             else 
    
                        if(fromRow == goRow)
                        
                                    {
                                    
    
                        if(fromColumn > goColumn)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.LEFT

                                    }
                                
                             else 
    
                        if(fromColumn < goColumn)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.RIGHT

                                    }
                                

                                    }
                                
                             else 
    
                        if(fromRow > goRow)
                        
                                    {
                                    
    
                        if(fromColumn > goColumn)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.UP_LEFT

                                    }
                                
                             else 
    
                        if(fromColumn < goColumn)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.UP_RIGHT

                                    }
                                
                             else 
    
                        if(fromColumn == goColumn)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.UP

                                    }
                                

                                    }
                                
                             else 
    
                        if(fromRow < goRow)
                        
                                    {
                                    
    
                        if(fromColumn > goColumn)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.DOWN_LEFT

                                    }
                                
                             else 
    
                        if(fromColumn < goColumn)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.DOWN_RIGHT

                                    }
                                
                             else 
    
                        if(fromColumn == goColumn)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directionFactory!!.DOWN

                                    }
                                

                                    }
                                

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(ERROR)
stringBuffer!!.append(CellPosition.toString(fromGeographicMapCellPosition))
stringBuffer!!.append(EQUAL)
stringBuffer!!.append(CellPosition.toString(toGeographicMapCellPosition))



                            throw Exception(stringBuffer!!.toString())
}


}
                
            

