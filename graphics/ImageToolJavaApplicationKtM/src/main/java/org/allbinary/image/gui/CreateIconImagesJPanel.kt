
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.image.gui




        import java.lang.Object        
        
        import java.lang.Integer
        
        import java.lang.System
        
        import java.lang.Thread
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.image.BufferedImage
import java.awt.image.Raster
import java.io.File
import org.allbinary.graphics.displayable.CanvasStrings
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.string.StringMaker
import org.allbinary.media.image.ImagePersistanceUtil
import org.allbinary.media.image.ImageProcessorInput
import org.allbinary.media.image.ImageProcessorInputCompositeInterface
import org.allbinary.media.image.ImageUtil
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListD

open public class CreateIconImagesJPanel : javax.swing.JPanel
                , ImageProcessorInputCompositeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var imageProcessorInput: ImageProcessorInput
public constructor (imageProcessorInput: ImageProcessorInput)                        

                            : super(){
    //var imageProcessorInput = imageProcessorInput


                            //For kotlin this is before the body of the constructor.
                    
initComponents()
this.imageProcessorInput= imageProcessorInput

    var numberStringArray: Array<String?> = arrayOfNulls(101)

numberStringArray[0]= Integer.toString( -1)




                        for (index in 1 until 100)

        {
numberStringArray[index]= index.toString()
}


    var araster: Raster = this.imageProcessorInput!!.getBufferedImageArray()[0]!!.getAlphaRaster()!!


    
                        if(araster == 
                                    null
                                )
                        
                                    {
                                    System.out.println("there is no Alpha channel!!!!!!!!!")

                                    }
                                
                        else {
                            System.out.println("Alpha channel found !")

                        }
                            
}


    open fun process()
        //nullable = true from not(false or (false and true)) = true
{
object: Thread()
                                {
                                
    override fun run()
        //nullable = true from not(false or (false and true)) = true
{

    var logUtil: LogUtil = LogUtil.getInstance()!!


        try {
            
    var imageUtil: ImageUtil = ImageUtil.getInstance()!!


    var stringMaker: StringMaker = StringMaker()


    var imageProcessorInput: ImageProcessorInput = this@CreateIconImagesJPanel.getImageProcessorInput()!!


    var files: Array<File?> = imageProcessorInput!!.getFiles()!!


    var iconWidthList: BasicArrayList = BasicArrayListD()


    var iconHeightList: BasicArrayList = BasicArrayListD()

iconWidthList!!.add(864)
iconHeightList!!.add(864)

    var ANDROID: String = "android-icon-"


    var IOS: String = "ios-icon-"


    var size: Int = iconWidthList!!.size()!!


    var width: Int = 0


    var height: Int = 0





                        for (index2 in 0 until size)

        {
width= get = iconWidthList!!.get(index2)get as Integer
get.
                    toInt()
height= get = iconHeightList!!.get(index2)get as Integer
get.
                    toInt()

    var generatedBufferedImageArray: Array<BufferedImage?> = imageUtil!!.createBufferedImage3(imageProcessorInput!!.getBufferedImageArray(), width, height, true)!!


    var imagePersistanceUtil: ImagePersistanceUtil = ImagePersistanceUtil.getInstance()!!





                        for (index in 0 until generatedBufferedImageArray!!.size)

        {

    var filePath: String = files[index]!!.getAbsolutePath()!!


    var endIndex: Int = filePath!!.lastIndexOf('\\')!!


    var path: String = filePath!!.substring(0, endIndex +1)!!

stringMaker!!.delete(0, stringMaker!!.length())
stringMaker!!.append(path)!!.append(ANDROID)!!.appendint(width)!!.append(CanvasStrings.getInstance()!!._PNG)

    var newFilePath: String = stringMaker!!.toString()!!

imagePersistanceUtil!!.saveWithBatik(AbFile(newFilePath), generatedBufferedImageArray[index]!!)
stringMaker!!.delete(0, stringMaker!!.length())
stringMaker!!.append(path)!!.append(IOS)!!.appendint(width)!!.append(CanvasStrings.getInstance()!!._PNG)
newFilePath= stringMaker!!.toString()
imagePersistanceUtil!!.saveWithBatik(AbFile(newFilePath), generatedBufferedImageArray[index]!!)
}

}

this@CreateIconImagesJPanel.getParent()!!.repaint()
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
}

}

                                }
                            .
                            start()
}


    open fun getImageProcessorInput()
        //nullable = true from not(false or (false and true)) = true
: ImageProcessorInput{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return imageProcessorInput
}


    open fun setImageProcessorInput(imageProcessorInput: ImageProcessorInput)
        //nullable = true from not(false or (false and false)) = true
{
var imageProcessorInput = imageProcessorInput
this.imageProcessorInput= imageProcessorInput
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
this.aboveJButton= javax.swing.JButton()
this.aboveJButton!!.setText("Process")
aboveJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
aboveJButtonActionPerformed(evt)
}

                                }
                            )

    var layout: javax.swing.GroupLayout = javax.swing.GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(aboveJButton)!!.addGap(0, 335, Short.MAX_VALUE)))
layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addContainerGap()!!.addComponent(aboveJButton)!!.addContainerGap(286, Short.MAX_VALUE)))
}


    open fun aboveJButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.process()
}


    private var aboveJButton: javax.swing.JButton

}
                
            

