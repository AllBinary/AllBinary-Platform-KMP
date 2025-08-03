
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
        package org.allbinary.image.gui



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.awt.image.BufferedImage
import java.io.File
import javax.swing
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.file.FileWrapperUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.media.image.ImagePersistanceUtil
import org.allbinary.media.image.ImageProcessorInput
import org.allbinary.media.image.ImageProcessorInputCompositeInterface
import org.allbinary.media.image.ImageStrings
import org.allbinary.media.image.ImageUnifierCell
import org.allbinary.media.image.ImageUnifierProperties
import org.allbinary.media.image.ImageUnifierUtil
import org.allbinary.media.image.ImageUtil
import org.allbinary.media.image.ImagesRatioUtil
import org.allbinary.string.CommonPhoneStrings
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings

open public class ImageUnifierJPanel : swing.JPanel
                , ImageProcessorInputCompositeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val imageStrings: ImageStrings = ImageStrings.getInstance()!!
            

    private val imagesRatioUtil: ImagesRatioUtil = ImagesRatioUtil.getInstance()!!
            

    private var imageProcessorInput: ImageProcessorInput

    private var icon: Array<ImageIconUnique?>

    private var imageUnifierProperties: ImageUnifierProperties

    private var result: BufferedImage

    private var isImageFillIn: Boolean = true
public constructor        (imageProcessorInput: ImageProcessorInput){

                    var imageProcessorInput = imageProcessorInput
initComponents()
this.setImageProcessorInput(imageProcessorInput)
}


open fun init()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    var imageProcessorInput: ImageProcessorInput = this.getImageProcessorInput()!!
            


    var bufferedImageArray: Array<BufferedImage?> = imageProcessorInput!!.getBufferedImageArray()!!
            

this.icon= arrayOfNulls(bufferedImageArray!!.size)

    var defaultListModel: DefaultListModel = DefaultListModel()





                        for (index in 0 until bufferedImageArray!!.size)


        {
    var width: Double = bufferedImageArray[index]!!.getWidth()!!
            


    var height: Double = bufferedImageArray[index]!!.getHeight()!!
            


    var newWidth: Int = 52


    var oldRatio: Double = width /height


    var newHeight: Int = (newWidth /oldRatio).toInt()


    var iconBufferedImage: BufferedImage = ImageUtil.getInstance()!!.createBufferedImage(bufferedImageArray[index]!!, newWidth, newHeight, true)!!
            

this.icon[index]= ImageIconUnique(iconBufferedImage, index)
defaultListModel!!.addElement(this.icon[index]!!)
}

this.imageJList!!.setModel(defaultListModel)
this.updateOnPropertiesChange()
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, this.commonStrings!!.INIT, e)
}

}


open fun updateImage()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    var bufferedImageArray: Array<BufferedImage?> = this.getImageProcessorInput()!!.getBufferedImageArray()!!
            


    var tempBufferedImageArray: Array<BufferedImage?> = arrayOfNulls(bufferedImageArray!!.size)





                        for (index in 0 until bufferedImageArray!!.size)


        {
    var indexedImageIcon: ImageIconUnique = this.imageJList!!.getModel()!!.getElementAt(index) as ImageIconUnique


    var bufferedImage: BufferedImage = ImageUtil.getInstance()!!.createBufferedImage(bufferedImageArray[indexedImageIcon!!.getId()]!!, this.imageUnifierProperties!!.getImageUnifierCell()!!.getWidth(), this.imageUnifierProperties!!.getImageUnifierCell()!!.getHeight(), false)!!
            

tempBufferedImageArray[index]= bufferedImage
}


    var totalImages: Int = this.imageUnifierProperties!!.getRows() *this.imageUnifierProperties!!.getColumns()


    var averageRatio: Double = imagesRatioUtil!!.getAverage(tempBufferedImageArray, totalImages)!!
            


    var averageRatioString: String = Double(averageRatio).
                            toString()!!
            


    
                        if(averageRatioString!!.length > 4)
                        
                                    {
                                    averageRatioString= averageRatioString!!.substring(0, 4)

                                    }
                                
this.avgRatioJTextField!!.setText(averageRatioString)
this.fudgeItJButton!!.setEnabled(false)

    
                        if(!imagesRatioUtil!!.isEqual(tempBufferedImageArray, totalImages))
                        
                                    {
                                    
    
                        if(isImageFillIn)
                        
                                    {
                                    this.fudgeItJButton!!.setEnabled(true)

                                    }
                                

                                    }
                                
this.updateImage(tempBufferedImageArray)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "updateImage", e)
}

}


open fun updateImageWithFudgedImages()
        //nullable = true from not(false or (false and true)) = true
{
        try {
            
    var bufferedImageArray: Array<BufferedImage?> = this.getImageProcessorInput()!!.getBufferedImageArray()!!
            


    var tempBufferedImageArray: Array<BufferedImage?> = arrayOfNulls(bufferedImageArray!!.size)





                        for (index in 0 until bufferedImageArray!!.size)


        {
    var indexedImageIcon: ImageIconUnique = this.imageJList!!.getModel()!!.getElementAt(index) as ImageIconUnique


    var bufferedImage: BufferedImage = ImageUtil.getInstance()!!.createBufferedImage(bufferedImageArray[indexedImageIcon!!.getId()]!!, this.imageUnifierProperties!!.getImageUnifierCell()!!.getWidth(), this.imageUnifierProperties!!.getImageUnifierCell()!!.getHeight(), false)!!
            

tempBufferedImageArray[index]= bufferedImage
}


    var totalImages: Int = this.imageUnifierProperties!!.getRows() *this.imageUnifierProperties!!.getColumns()


    var averageRatio: Double = imagesRatioUtil!!.getAverage(tempBufferedImageArray, totalImages)!!
            


    var fudgedBufferedImageArray: Array<BufferedImage?> = imagesRatioUtil!!.fudge(tempBufferedImageArray, totalImages, averageRatio)!!
            

this.updateImage(fudgedBufferedImageArray)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "updateImageWithFudgedImages", e)
}

}


open fun updateImage(tempBufferedImageArray: Array<BufferedImage?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var tempBufferedImageArray = tempBufferedImageArray
this.result= ImageUnifierUtil.getInstance()!!.getImage(tempBufferedImageArray, this.imageUnifierProperties)

    var image: Icon = ImageIcon(this.result)


    var label: JLabel = JLabel(image)

this.jScrollPane2!!.getViewport()!!.add(label)
this.updateUI()
}


open fun updateOnPropertiesChange()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(this.rowsJTextField!!.getText()!!.length > 0 && this.columnsJTextField!!.getText()!!.length > 0 && this.cellWidthJTextField!!.getText()!!.length > 0 && this.cellHeightJTextField!!.getText()!!.length > 0)
                        
                                    {
                                    this.imageUnifierProperties= ImageUnifierProperties()
imageUnifierProperties!!.setRows(Integer(this.rowsJTextField!!.getText()))
imageUnifierProperties!!.setColumns(Integer(this.columnsJTextField!!.getText()))

    var imageUnifierCell: ImageUnifierCell = ImageUnifierCell(Integer(this.cellWidthJTextField!!.getText()), Integer(this.cellHeightJTextField!!.getText()))

imageUnifierProperties!!.setImageUnifierCell(imageUnifierCell)

    var cellRatio: Double = (imageUnifierCell!!.getWidth().toDouble() /imageUnifierCell!!.getHeight())


    var cellRatioString: String = Double(cellRatio).
                            toString()!!
            


    
                        if(cellRatioString!!.length > 4)
                        
                                    {
                                    cellRatioString= cellRatioString!!.substring(0, 4)

                                    }
                                
this.cellRatioJTextField!!.setText(cellRatioString)
this.updateImage()

                                    }
                                
}


open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
    var commonPhoneStrings: CommonPhoneStrings = CommonPhoneStrings.getInstance()!!
            

jScrollPane1= JScrollPane()
imageJList= JList()
jScrollPane2= JScrollPane()
jPanel1= JPanel()
jButton1= JButton()
upJButton= JButton()
downJButton= JButton()
fudgeItJButton= JButton()
jLabel2= JLabel()
columnsJTextField= JTextField()
jLabel1= JLabel()
rowsJTextField= JTextField()
jLabel3= JLabel()
cellWidthJTextField= JTextField()
jLabel4= JLabel()
cellHeightJTextField= JTextField()
jLabel5= JLabel()
cellRatioJTextField= JTextField()
jLabel6= JLabel()
avgRatioJTextField= JTextField()
jButton2= JButton()
jButtonOrder= JButton()
setMinimumSize(Dimension(500, 375))
setPreferredSize(Dimension(0, 0))
imageJList!!.setMinimumSize(Dimension(50, 0))
jScrollPane1!!.setViewportView(imageJList)
jButton1!!.setText(
                            "Save")
jButton1!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
jButton1ActionPerformed(evt)
}

                                }
                            )
upJButton!!.setText(
                            "Up")
upJButton!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
upJButtonActionPerformed(evt)
}

                                }
                            )
downJButton!!.setText(
                            "Down")
downJButton!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
downJButtonActionPerformed(evt)
}

                                }
                            )
fudgeItJButton!!.setText(
                            "Fudge It!")
fudgeItJButton!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
fudgeItJButtonActionPerformed(evt)
}

                                }
                            )
jLabel2!!.setText(
                            "Columns:")
columnsJTextField!!.setText(commonPhoneStrings!!.TWO)
columnsJTextField!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
columnsJTextFieldActionPerformed(evt)
}

                                }
                            )
columnsJTextField!!.addPropertyChangeListener(object: PropertyChangeListener()
                                {
                                
open override fun propertyChange(evt: PropertyChangeEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
columnsJTextFieldPropertyChange(evt)
}

                                }
                            )
columnsJTextField!!.addKeyListener(object: KeyAdapter()
                                {
                                
open override fun keyPressed(evt: KeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
columnsJTextFieldKeyPressed(evt)
}

open override fun keyTyped(evt: KeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
columnsJTextFieldKeyTyped(evt)
}

                                }
                            )
jLabel1!!.setText(
                            "Rows:")
rowsJTextField!!.setText(commonPhoneStrings!!.TWO)
rowsJTextField!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
rowsJTextFieldActionPerformed(evt)
}

                                }
                            )
jLabel3!!.setText(
                            "Cell Width:")
cellWidthJTextField!!.setText(
                            "200")
cellWidthJTextField!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
cellWidthJTextFieldActionPerformed(evt)
}

                                }
                            )
jLabel4!!.setText(
                            "Cell Height:")
cellHeightJTextField!!.setText(
                            "150")
cellHeightJTextField!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
cellHeightJTextFieldActionPerformed(evt)
}

                                }
                            )
jLabel5!!.setText(
                            "Cell Ratio:")
cellRatioJTextField!!.setEditable(false)
jLabel6!!.setText(
                            "Avg Image Ratio:")
avgRatioJTextField!!.setEditable(false)
jButton2!!.setText(commonStrings!!.UPDATE)
jButton2!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
jButton2ActionPerformed(evt)
}

                                }
                            )
jButtonOrder!!.setText(
                            "Order")
jButtonOrder!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
jButtonOrderActionPerformed(evt)
}

                                }
                            )

    var jPanel1Layout: GroupLayout = GroupLayout(jPanel1)

jPanel1!!.setLayout(jPanel1Layout)
jPanel1Layout!!.setHorizontalGroup(jPanel1Layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(javax!!.swing!!.GroupLayout.Alignment.TRAILING, jPanel1Layout!!.createSequentialGroup()!!.addContainerGap()!!.addGroup(jPanel1Layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.TRAILING)!!.addComponent(jButton1, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)!!.addGroup(jPanel1Layout!!.createSequentialGroup()!!.addComponent(upJButton, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, 71, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)!!.addComponent(downJButton, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, 70, javax!!.swing!!.GroupLayout.PREFERRED_SIZE))!!.addComponent(fudgeItJButton, javax!!.swing!!.GroupLayout.Alignment.LEADING, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)!!.addGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING, jPanel1Layout!!.createSequentialGroup()!!.addComponent(jLabel3)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED, 99, javax!!.swing!!.GroupLayout.PREFERRED_SIZE))!!.addGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING, jPanel1Layout!!.createSequentialGroup()!!.addComponent(jLabel4)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED, 96, javax!!.swing!!.GroupLayout.PREFERRED_SIZE))!!.addComponent(avgRatioJTextField, javax!!.swing!!.GroupLayout.Alignment.LEADING, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)!!.addComponent(jLabel6, javax!!.swing!!.GroupLayout.Alignment.LEADING, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)!!.addComponent(cellRatioJTextField, javax!!.swing!!.GroupLayout.Alignment.LEADING, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)!!.addComponent(jLabel5, javax!!.swing!!.GroupLayout.Alignment.LEADING, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)!!.addComponent(cellHeightJTextField, javax!!.swing!!.GroupLayout.Alignment.LEADING, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)!!.addComponent(cellWidthJTextField, javax!!.swing!!.GroupLayout.Alignment.LEADING, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)!!.addComponent(jButton2, javax!!.swing!!.GroupLayout.Alignment.LEADING, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)!!.addGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING, jPanel1Layout!!.createSequentialGroup()!!.addGroup(jPanel1Layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addComponent(jLabel2)!!.addComponent(jLabel1))!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(jPanel1Layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addComponent(rowsJTextField, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)!!.addGroup(jPanel1Layout!!.createSequentialGroup()!!.addComponent(columnsJTextField, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)!!.addGap(1, 1, 1))))!!.addComponent(jButtonOrder, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))!!.addContainerGap()))
jPanel1Layout!!.setVerticalGroup(jPanel1Layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(jPanel1Layout!!.createSequentialGroup()!!.addContainerGap()!!.addComponent(jButton1)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(jPanel1Layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.BASELINE)!!.addComponent(upJButton)!!.addComponent(downJButton))!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jButtonOrder)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(fudgeItJButton)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(jPanel1Layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel2)!!.addComponent(columnsJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(jPanel1Layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel1)!!.addComponent(rowsJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel3)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(cellWidthJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel4)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(cellHeightJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jButton2)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel5)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addComponent(cellRatioJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addGap(7, 7, 7)!!.addComponent(jLabel6)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(avgRatioJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addGap(66, 66, 66)))

    var layout: GroupLayout = GroupLayout(this)

this.setLayout(layout)
layout!!.setHorizontalGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(layout!!.createSequentialGroup()!!.addComponent(jScrollPane1, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, 84, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jPanel1, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jScrollPane2, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)))
layout!!.setVerticalGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(javax!!.swing!!.GroupLayout.Alignment.TRAILING, layout!!.createSequentialGroup()!!.addGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.TRAILING)!!.addComponent(jPanel1, javax!!.swing!!.GroupLayout.Alignment.LEADING, 0, 445, Short.MAX_VALUE)!!.addComponent(jScrollPane2, javax!!.swing!!.GroupLayout.Alignment.LEADING, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)!!.addComponent(jScrollPane1, javax!!.swing!!.GroupLayout.Alignment.LEADING, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))!!.addContainerGap()))
}


open fun jButton2ActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
this.updateOnPropertiesChange()
}


open fun columnsJTextFieldKeyPressed(evt: KeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
}


open fun columnsJTextFieldKeyTyped(evt: KeyEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
}


open fun columnsJTextFieldPropertyChange(evt: PropertyChangeEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
}


open fun fudgeItJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
this.updateImageWithFudgedImages()
}


open fun cellHeightJTextFieldActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
this.updateOnPropertiesChange()
}


open fun cellWidthJTextFieldActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
this.updateOnPropertiesChange()
}


open fun columnsJTextFieldActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
this.updateOnPropertiesChange()
}


open fun rowsJTextFieldActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
this.updateOnPropertiesChange()
}


open fun jButton1ActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

        try {
            
    var fileArray: Array<File?> = this.imageProcessorInput!!.getFiles()!!
            


    var file: File = fileArray[0]!!


    var filePath: String = file!!.getAbsolutePath()!!
            


    var extensionIndex: Int = filePath!!.indexOf(imageStrings!!.PNG_EXTENSION)!!
            

filePath= StringMaker().
                            append(filePath!!.substring(0, extensionIndex))!!.append(CommonSeps.getInstance()!!.UNDERSCORE)!!.append(this.imageUnifierProperties!!.getColumns())!!.append(
                            "_By_")!!.append(this.imageUnifierProperties!!.getRows())!!.append(
                            "_Unified")!!.append(imageStrings!!.PNG_EXTENSION)!!.toString()
logUtil!!.put("New File Path: " +filePath, this, StringUtil.getInstance()!!.EMPTY_STRING)

    var outputFile: File = File(filePath)

ImagePersistanceUtil.getInstance()!!.saveWithBatik(FileWrapperUtil.wrapFile(outputFile), this.result)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "jButton1ActionPerformed", e)
}

}


open fun downJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

    var index: Int = this.imageJList!!.getSelectedIndex()!!
            


    var defaultListModel: DefaultListModel = this.imageJList!!.getModel() as DefaultListModel


    
                        if(index >= 0 && index +1 < defaultListModel!!.size())
                        
                                    {
                                    
    var indexedImageIcon: ImageIconUnique = defaultListModel!!.remove(index) as ImageIconUnique

defaultListModel!!.insertElementAt(indexedImageIcon, index +1)
this.imageJList!!.setSelectedIndex(index +1)
this.updateImage()

                                    }
                                
}


open fun upJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

    var index: Int = this.imageJList!!.getSelectedIndex()!!
            


    
                        if(index > 0)
                        
                                    {
                                    
    var defaultListModel: DefaultListModel = this.imageJList!!.getModel() as DefaultListModel


    var indexedImageIcon: ImageIconUnique = defaultListModel!!.remove(index) as ImageIconUnique

defaultListModel!!.insertElementAt(indexedImageIcon, index -1)
this.imageJList!!.setSelectedIndex(index -1)
this.updateImage()

                                    }
                                
}


open fun jButtonOrderActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

    var defaultListModel: DefaultListModel = this.imageJList!!.getModel() as DefaultListModel


    var size: Int = defaultListModel!!.size()!!
            


    var last: Int = size -1





                        for (index in last downTo 0)


        {
    var indexedImageIcon: ImageIconUnique = defaultListModel!!.remove(last) as ImageIconUnique

defaultListModel!!.insertElementAt(indexedImageIcon, last -index)
}


    
                        if(size > 0)
                        
                                    {
                                    this.imageJList!!.setSelectedIndex(0)
this.updateImage()

                                    }
                                
}


    private var avgRatioJTextField: JTextField

    private var cellHeightJTextField: JTextField

    private var cellRatioJTextField: JTextField

    private var cellWidthJTextField: JTextField

    private var columnsJTextField: JTextField

    private var downJButton: JButton

    private var fudgeItJButton: JButton

    private var imageJList: JList

    private var jButton1: JButton

    private var jButton2: JButton

    private var jButtonOrder: JButton

    private var jLabel1: JLabel

    private var jLabel2: JLabel

    private var jLabel3: JLabel

    private var jLabel4: JLabel

    private var jLabel5: JLabel

    private var jLabel6: JLabel

    private var jPanel1: JPanel

    private var jScrollPane1: JScrollPane

    private var jScrollPane2: JScrollPane

    private var rowsJTextField: JTextField

    private var upJButton: JButton

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
this.init()
}


}
                
            

