
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
        package org.allbinary.graphics.j2me.workarea.canvas




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.GPoint

open public class Grid
            : Object
         {
        

    var grid: GPoint

    var isGridOn: Boolean = true

    var isGridPossible: Boolean = false

    private var zoom: Int = 3

    var isChanged: Boolean = true
public constructor ()
            : super()
        {
}

public constructor (grid: Grid)
            : super()
        {
var grid = grid
this.grid= grid.grid
this.showGrid(grid.isGridOn)
this.isGridPossible= grid.isGridPossible
this.setZoom(grid.getZoom())
}


    open fun isGridOn()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.isGridOn
}


    open fun isGridPossible()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.isGridPossible
}


    open fun getGrid()
        //nullable = true from not(false or (false and true)) = true
: GPoint{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.grid
}


    open fun getZoom()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.zoom
}


    open fun showGrid(value: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.isGridOn= value
}


    open fun setZoom(zoom: Int)
        //nullable = true from not(false or (false and false)) = true
{
var zoom = zoom
this.zoom= zoom

    
                        if(this.zoom < 1)
                        
                                    {
                                    zoom= 1

                                    }
                                
this.isChanged= true
}


}
                
            

