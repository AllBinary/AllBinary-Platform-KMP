
        /* Generated Code Do Not Modify */
        package org.allbinary.media.image




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt
import java.awt.image.BufferedImage

open public class BufferedImageUtil2
            : Object
         {
        

        companion object {
            
    private val instance: BufferedImageUtil2 = BufferedImageUtil2()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BufferedImageUtil2

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val imageUtil: ImageUtil = ImageUtil.getInstance()!!

open fun createSpriteImage(bufferedImageArray: Array<BufferedImage?>)
        //nullable = true from not(false or (false and false)) = true
: BufferedImage

        Updates for KMP build        
        {
    //var bufferedImageArray = bufferedImageArray

    var columns: Int = bufferedImageArray!!.size
                


    var max: Int = columns


    var rows: Int = 0


    
                        if(bufferedImageArray!!.size < columns)
                        
                                    {
                                    columns= bufferedImageArray!!.size

                                    }
                                
rows= (bufferedImageArray!!.size /columns)

    
                        if(bufferedImageArray!!.size % columns != 0)
                        
                                    {
                                    rows++

                                    }
                                

    var bufferedImage: BufferedImage = this.imageUtil!!.create(bufferedImageArray[0]!!.getWidth(
                            null) *columns, bufferedImageArray[0]!!.getHeight(
                            null) *rows)!!


    var g: Graphics2D = bufferedImage!!.createGraphics()!!


    var columnIndex: Int = 0


    var rowIndex: Int = 0





                        for (index in 0 until bufferedImageArray!!.size)

        

        Updates for KMP build        
        {

    
                        if(index /max != 0 && index % max == 0)
                        
                                    {
                                    rowIndex++
columnIndex= 0

                                    }
                                
g.drawImage(bufferedImageArray[index]!!, bufferedImageArray[index]!!.getWidth(
                            null) *columnIndex, bufferedImageArray[index]!!.getHeight(
                            null) *rowIndex, bufferedImageArray[index]!!.getWidth(
                            null), bufferedImageArray[index]!!.getHeight(
                            null), 
                            null)
columnIndex++
}

g.dispose()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return bufferedImage
}


}
                
            

