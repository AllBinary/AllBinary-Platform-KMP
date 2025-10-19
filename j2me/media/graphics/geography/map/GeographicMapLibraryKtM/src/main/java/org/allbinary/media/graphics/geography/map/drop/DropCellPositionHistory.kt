
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
        package org.allbinary.media.graphics.geography.map.drop




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.BasicArrayList
import org.allbinary.graphics.CellPosition
import org.allbinary.graphics.CellPositionFactory
import org.allbinary.layer.AllBinaryLayer

open public class DropCellPositionHistory
            : Object
         {
        
companion object {
            
    private val SINGLETON: DropCellPositionHistory = DropCellPositionHistory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: DropCellPositionHistory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SINGLETON
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val cellPositionFactory: CellPositionFactory = CellPositionFactory.getInstance()!!

    private var positionList: BasicArrayList = BasicArrayList()

    private var layerList: BasicArrayList = BasicArrayList()

    open fun add(cellPosition: CellPosition, layerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
{
var cellPosition = cellPosition
var layerInterface = layerInterface
this.positionList!!.add(cellPosition)
this.layerList!!.add(layerInterface)
}


    open fun add(list: BasicArrayList, layerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
{
var list = list
var layerInterface = layerInterface




                        for (index in list.size() -1 downTo 0)

        {
this.add(list.get(index) as CellPosition, layerInterface)
}

}


    open fun remove(cellPosition: CellPosition)
        //nullable = true from not(false or (false and false)) = true
{
var cellPosition = cellPosition

    var index: Int = this.positionList!!.indexOf(cellPosition)!!


    
                        if(index >= 0)
                        
                                    {
                                    this.positionList!!.remove(index)
this.layerList!!.remove(index)

                                    }
                                
}


    open fun remove(layerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
{
var layerInterface = layerInterface

    var index: Int = 0


        while(index !=  -1)
        {
index= this.layerList!!.indexOf(layerInterface)

    
                        if(index >= 0)
                        
                                    {
                                    this.positionList!!.remove(index)
this.layerList!!.remove(index)

                                    }
                                
}

}


    open fun clear()
        //nullable = true from not(false or (false and true)) = true
{
this.positionList!!.clear()
this.layerList!!.clear()
}


    open fun isCellPositionWithDrop(cellPosition: CellPosition)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var cellPosition = cellPosition



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return positionList!!.contains(cellPosition)
}


    open fun anyCellPositionWithDrop(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var list = list




                        for (index in list.size() -1 downTo 0)

        {

    
                        if(this.isCellPositionWithDrop(list.get(index) as CellPosition))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


    open fun getCellPositionWithDrop(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: CellPosition{
var list = list




                        for (index in list.size() -1 downTo 0)

        {

    var cellPosition: CellPosition = list.get(index) as CellPosition


    
                        if(this.isCellPositionWithDrop(cellPosition))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cellPosition

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.cellPositionFactory!!.NONE
}


    open fun getLayerInterface(cellPosition: CellPosition)
        //nullable = true from not(false or (false and false)) = true
: AllBinaryLayer{
var cellPosition = cellPosition

    var index: Int = this.positionList!!.indexOf(cellPosition)!!


    
                        if(index >= 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.layerList!!.get(index) as AllBinaryLayer

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AllBinaryLayer.NULL_ALLBINARY_LAYER

                        }
                            
}


}
                
            

