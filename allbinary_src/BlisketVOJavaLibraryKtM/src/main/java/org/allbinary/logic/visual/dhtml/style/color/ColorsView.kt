
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
        package org.allbinary.logic.visual.dhtml.style.color



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonPhoneStrings
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class ColorsView
            : Object
        
                , DomNodeInterface {
        

    private val commonPhoneStrings: CommonPhoneStrings = CommonPhoneStrings.getInstance()!!
            

    private val HEXRADIX: Int = 16

    private val MAX: Int = 255

    val delta: Int = 20
public constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            
open fun getColorNode(document: Document, redIndex: Int, greenIndex: Int, blueIndex: Int)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document


                    var redIndex = redIndex


                    var greenIndex = greenIndex


                    var blueIndex = blueIndex

    var hexColorStringBuffer: StringMaker = StringMaker()


    
                        if(redIndex < HEXRADIX)
                        
                                    {
                                    hexColorStringBuffer!!.append(commonPhoneStrings!!.ZERO)

                                    }
                                
hexColorStringBuffer!!.append(redIndex.toString())

    
                        if(greenIndex < HEXRADIX)
                        
                                    {
                                    hexColorStringBuffer!!.append(commonPhoneStrings!!.ZERO)

                                    }
                                
hexColorStringBuffer!!.append(greenIndex.toString())

    
                        if(blueIndex < HEXRADIX)
                        
                                    {
                                    hexColorStringBuffer!!.append(commonPhoneStrings!!.ZERO)

                                    }
                                
hexColorStringBuffer!!.append(blueIndex.toString())

    var colorNode: Node = ModDomHelper.createNameValueNodes(document, ColorData.getInstance()!!.NAME, hexColorStringBuffer!!.toString())!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return colorNode
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var node: Node = ModDomHelper.createNameValueNodes(document, ColorsData.getInstance()!!.NAME, 
                            "RGB Colors In Hex")!!
            


    var blackNode: Node = ModDomHelper.createNameValueNodes(document, ColorData.getInstance()!!.NAME, 
                            "000000")!!
            

node!!.appendChild(blackNode)




                        for (index in 0 until MAX)


        {
    var hexColorStringBuffer: StringMaker = StringMaker()


    
                        if(index < HEXRADIX)
                        
                                    {
                                    hexColorStringBuffer!!.append(commonPhoneStrings!!.ZERO)

                                    }
                                
hexColorStringBuffer!!.append(index.toString())

    
                        if(index < HEXRADIX)
                        
                                    {
                                    hexColorStringBuffer!!.append(commonPhoneStrings!!.ZERO)

                                    }
                                
hexColorStringBuffer!!.append(index.toString())

    
                        if(index < HEXRADIX)
                        
                                    {
                                    hexColorStringBuffer!!.append(commonPhoneStrings!!.ZERO)

                                    }
                                
hexColorStringBuffer!!.append(index.toString())

    var colorNode: Node = ModDomHelper.createNameValueNodes(document, ColorData.getInstance()!!.NAME, hexColorStringBuffer!!.toString())!!
            

node!!.appendChild(colorNode)
}


    var whiteNode: Node = ModDomHelper.createNameValueNodes(document, ColorData.getInstance()!!.NAME, 
                            "FFFFFF")!!
            

node!!.appendChild(whiteNode)




                        for (blueIndex in MAX /2 until MAX)


        {



                        for (greenIndex in 0 until MAX /2)


        {



                        for (redIndex in 0 until MAX /2)


        {node!!.appendChild(this.getColorNode(document, redIndex, greenIndex, blueIndex))
}

}

}





                        for (redIndex in MAX /2 until MAX)


        {



                        for (greenIndex in 0 until MAX /2)


        {



                        for (blueIndex in 0 until MAX /2)


        {node!!.appendChild(this.getColorNode(document, redIndex, greenIndex, blueIndex))
}

}

}





                        for (greenIndex in MAX /2 until MAX)


        {



                        for (redIndex in 0 until MAX /2)


        {



                        for (blueIndex in 0 until MAX /2)


        {node!!.appendChild(this.getColorNode(document, redIndex, greenIndex, blueIndex))
}

}

}





                        for (greenIndex in 0 until MAX)


        {



                        for (redIndex in 0 until MAX)


        {



                        for (blueIndex in 0 until MAX)


        {node!!.appendChild(this.getColorNode(document, redIndex, greenIndex, blueIndex))
}

}

}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            

