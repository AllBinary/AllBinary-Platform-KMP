
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




        import java.lang.Object        
        
        import java.lang.Integer
        
        
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

open public class ImageUnifierJPanel : javax.swing.JPanel
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
public constructor (imageProcessorInput: ImageProcessorInput){
    //var imageProcessorInput = imageProcessorInput
this.initComponents()
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
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, this.commonStrings!!.INIT, e)
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


    var averageRatio: Double = this.imagesRatioUtil!!.getAverage(tempBufferedImageArray, totalImages)!!


    var averageRatioString: String = Double(averageRatio).
                            toString()!!


    
                        if(averageRatioString!!.length > 4)
                        
                                    {
                                    averageRatioString= averageRatioString!!.substring(0, 4)

                                    }
                                
this.avgRatioJTextField!!.setText(averageRatioString)
this.fudgeItJButton!!.setEnabled(false)

    
                        if(!this.imagesRatioUtil!!.isEqual(tempBufferedImageArray, totalImages))
                        
                                    {
                                    
    
                        if(this.isImageFillIn)
                        
                                    {
                                    this.fudgeItJButton!!.setEnabled(true)

                                    }
                                

                                    }
                                
this.updateImage(tempBufferedImageArray)
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "updateImage", e)
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


    var averageRatio: Double = this.imagesRatioUtil!!.getAverage(tempBufferedImageArray, totalImages)!!


    var fudgedBufferedImageArray: Array<BufferedImage?> = imagesRatioUtil!!.fudge(tempBufferedImageArray, totalImages, averageRatio)!!

this.updateImage(fudgedBufferedImageArray)
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "updateImageWithFudgedImages", e)
}

}


    open fun updateImage(tempBufferedImageArray: Array<BufferedImage?>)
        //nullable = true from not(false or (false and false)) = true
{
    //var tempBufferedImageArray = tempBufferedImageArray
this.result= ImageUnifierUtil.getInstance()!!.getImage(tempBufferedImageArray, this.imageUnifierProperties)

    var image: Icon = ImageIcon(this.result)


    var label: JLabel = JLabel(image)

this.jScrollPane2!!.getViewport()!!.add(label)
this.updateUI()
}


    open fun updateOnPropertiesChange()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(this.rowsJTextField!!.getText()!!.length() > 0 && this.columnsJTextField!!.getText()!!.length() > 0 && this.cellWidthJTextField!!.getText()!!.length() > 0 && this.cellHeightJTextField!!.getText()!!.length() > 0)
                        
                                    {
                                    this.imageUnifierProperties= ImageUnifierProperties()
this.imageUnifierProperties!!.setRows(Integer(this.rowsJTextField!!.getText()))
this.imageUnifierProperties!!.setColumns(Integer(this.columnsJTextField!!.getText()))

    var imageUnifierCell: ImageUnifierCell = ImageUnifierCell(Integer(this.cellWidthJTextField!!.getText()), Integer(this.cellHeightJTextField!!.getText()))

this.imageUnifierProperties!!.setImageUnifierCell(imageUnifierCell)

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

this.jScrollPane1= javax.swing.JScrollPane()
this.imageJList= javax.swing.JList()
this.jScrollPane2= javax.swing.JScrollPane()
this.jPanel1= javax.swing.JPanel()
this.jButton1= javax.swing.JButton()
this.upJButton= javax.swing.JButton()
this.downJButton= javax.swing.JButton()
this.fudgeItJButton= javax.swing.JButton()
this.jLabel2= javax.swing.JLabel()
this.columnsJTextField= javax.swing.JTextField()
this.jLabel1= javax.swing.JLabel()
this.rowsJTextField= javax.swing.JTextField()
this.jLabel3= javax.swing.JLabel()
this.cellWidthJTextField= javax.swing.JTextField()
this.jLabel4= javax.swing.JLabel()
this.cellHeightJTextField= javax.swing.JTextField()
this.jLabel5= javax.swing.JLabel()
this.cellRatioJTextField= javax.swing.JTextField()
this.jLabel6= javax.swing.JLabel()
this.avgRatioJTextField= javax.swing.JTextField()
this.jButton2= javax.swing.JButton()
this.jButtonOrder= javax.swing.JButton()
setMinimumSize(java.awt.Dimension(500, 375))
setPreferredSize(java.awt.Dimension(0, 0))
this.imageJList!!.setMinimumSize(java.awt.Dimension(50, 0))
this.jScrollPane1!!.setViewportView(this.imageJList)
this.jButton1!!.setText("Save")
this.jButton1!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
jButton1ActionPerformed(evt)
}

                                }
                            )
this.upJButton!!.setText("Up")
this.upJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
upJButtonActionPerformed(evt)
}

                                }
                            )
this.downJButton!!.setText("Down")
this.downJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
downJButtonActionPerformed(evt)
}

                                }
                            )
this.fudgeItJButton!!.setText("Fudge It!")
this.fudgeItJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
fudgeItJButtonActionPerformed(evt)
}

                                }
                            )
this.jLabel2!!.setText("Columns:")
this.columnsJTextField!!.setText(commonPhoneStrings!!.TWO)
this.columnsJTextField!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
columnsJTextFieldActionPerformed(evt)
}

                                }
                            )
this.columnsJTextField!!.addPropertyChangeListener(object: java.beans.PropertyChangeListener()
                                {
                                
    open override fun propertyChange(evt: java.beans.PropertyChangeEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
columnsJTextFieldPropertyChange(evt)
}

                                }
                            )
this.columnsJTextField!!.addKeyListener(object: java.awt.event.KeyAdapter()
                                {
                                
    open override fun keyPressed(evt: java.awt.event.KeyEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
columnsJTextFieldKeyPressed(evt)
}

    open override fun keyTyped(evt: java.awt.event.KeyEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
columnsJTextFieldKeyTyped(evt)
}

                                }
                            )
this.jLabel1!!.setText("Rows:")
this.rowsJTextField!!.setText(commonPhoneStrings!!.TWO)
this.rowsJTextField!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
rowsJTextFieldActionPerformed(evt)
}

                                }
                            )
this.jLabel3!!.setText("Cell Width:")
this.cellWidthJTextField!!.setText("200")
this.cellWidthJTextField!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
cellWidthJTextFieldActionPerformed(evt)
}

                                }
                            )
this.jLabel4!!.setText("Cell Height:")
this.cellHeightJTextField!!.setText("150")
this.cellHeightJTextField!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
cellHeightJTextFieldActionPerformed(evt)
}

                                }
                            )
this.jLabel5!!.setText("Cell Ratio:")
this.cellRatioJTextField!!.setEditable(false)
this.jLabel6!!.setText("Avg Image Ratio:")
this.avgRatioJTextField!!.setEditable(false)
this.jButton2!!.setText(this.commonStrings!!.UPDATE)
this.jButton2!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
jButton2ActionPerformed(evt)
}

                                }
                            )
this.jButtonOrder!!.setText("Order")
this.jButtonOrder!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
jButtonOrderActionPerformed(evt)
}

                                }
                            )

    var jPanel1Layout: javax.swing.GroupLayout = javax.swing.GroupLayout(this.jPanel1)

this.jPanel1!!.setLayout(jPanel1Layout)
jPanel1Layout!!.setHorizontalGroup(jPanel1Layout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout!!.createSequentialGroup()!!.addContainerGap()!!.addGroup(jPanel1Layout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)!!.addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)!!.addGroup(jPanel1Layout!!.createSequentialGroup()!!.addComponent(upJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)!!.addComponent(downJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addComponent(fudgeItJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)!!.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout!!.createSequentialGroup()!!.addComponent(jLabel3)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout!!.createSequentialGroup()!!.addComponent(jLabel4)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addComponent(avgRatioJTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)!!.addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)!!.addComponent(cellRatioJTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)!!.addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)!!.addComponent(cellHeightJTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)!!.addComponent(cellWidthJTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)!!.addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)!!.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout!!.createSequentialGroup()!!.addGroup(jPanel1Layout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addComponent(jLabel2)!!.addComponent(jLabel1))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(jPanel1Layout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addComponent(rowsJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)!!.addGroup(jPanel1Layout!!.createSequentialGroup()!!.addComponent(columnsJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)!!.addGap(1, 1, 1))))!!.addComponent(jButtonOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))!!.addContainerGap()))
jPanel1Layout!!.setVerticalGroup(jPanel1Layout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(jPanel1Layout!!.createSequentialGroup()!!.addContainerGap()!!.addComponent(jButton1)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(jPanel1Layout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(upJButton)!!.addComponent(downJButton))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jButtonOrder)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(fudgeItJButton)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(jPanel1Layout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel2)!!.addComponent(columnsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(jPanel1Layout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel1)!!.addComponent(rowsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel3)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(cellWidthJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel4)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(cellHeightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jButton2)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel5)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addComponent(cellRatioJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addGap(7, 7, 7)!!.addComponent(jLabel6)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(avgRatioJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addGap(66, 66, 66)))

    var layout: javax.swing.GroupLayout = javax.swing.GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)))
layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)!!.addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, 0, 445, Short.MAX_VALUE)!!.addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)!!.addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))!!.addContainerGap()))
}


    open fun jButton2ActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.updateOnPropertiesChange()
}


    open fun columnsJTextFieldKeyPressed(evt: java.awt.event.KeyEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    open fun columnsJTextFieldKeyTyped(evt: java.awt.event.KeyEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    open fun columnsJTextFieldPropertyChange(evt: java.beans.PropertyChangeEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    open fun fudgeItJButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.updateImageWithFudgedImages()
}


    open fun cellHeightJTextFieldActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.updateOnPropertiesChange()
}


    open fun cellWidthJTextFieldActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.updateOnPropertiesChange()
}


    open fun columnsJTextFieldActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.updateOnPropertiesChange()
}


    open fun rowsJTextFieldActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.updateOnPropertiesChange()
}


    open fun jButton1ActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            
    var fileArray: Array<File?> = this.imageProcessorInput!!.getFiles()!!


    var file: File = fileArray[0]!!


    var filePath: String = file.getAbsolutePath()!!


    var extensionIndex: Int = filePath!!.indexOf(this.imageStrings!!.PNG_EXTENSION)!!

filePath= StringMaker().
                            append(filePath!!.substring(0, extensionIndex))!!.append(CommonSeps.getInstance()!!.UNDERSCORE)!!.appendint(this.imageUnifierProperties!!.getColumns())!!.append("_By_")!!.appendint(this.imageUnifierProperties!!.getRows())!!.append("_Unified")!!.append(this.imageStrings!!.PNG_EXTENSION)!!.toString()
this.logUtil!!.putF("New File Path: " +filePath, this, StringUtil.getInstance()!!.EMPTY_STRING)

    var outputFile: File = File(filePath)

ImagePersistanceUtil.getInstance()!!.saveWithBatik(FileWrapperUtil.wrapFile(outputFile), this.result)
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "jButton1ActionPerformed", e)
}

}


    open fun downJButtonActionPerformed(evt: java.awt.event.ActionEvent)
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


    open fun upJButtonActionPerformed(evt: java.awt.event.ActionEvent)
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


    open fun jButtonOrderActionPerformed(evt: java.awt.event.ActionEvent)
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


    private var avgRatioJTextField: javax.swing.JTextField

    private var cellHeightJTextField: javax.swing.JTextField

    private var cellRatioJTextField: javax.swing.JTextField

    private var cellWidthJTextField: javax.swing.JTextField

    private var columnsJTextField: javax.swing.JTextField

    private var downJButton: javax.swing.JButton

    private var fudgeItJButton: javax.swing.JButton

    private var imageJList: javax.swing.JList

    private var jButton1: javax.swing.JButton

    private var jButton2: javax.swing.JButton

    private var jButtonOrder: javax.swing.JButton

    private var jLabel1: javax.swing.JLabel

    private var jLabel2: javax.swing.JLabel

    private var jLabel3: javax.swing.JLabel

    private var jLabel4: javax.swing.JLabel

    private var jLabel5: javax.swing.JLabel

    private var jLabel6: javax.swing.JLabel

    private var jPanel1: javax.swing.JPanel

    private var jScrollPane1: javax.swing.JScrollPane

    private var jScrollPane2: javax.swing.JScrollPane

    private var rowsJTextField: javax.swing.JTextField

    private var upJButton: javax.swing.JButton

    open fun getImageProcessorInput()
        //nullable = true from not(false or (false and true)) = true
: ImageProcessorInput{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.imageProcessorInput
}


    open fun setImageProcessorInput(imageProcessorInput: ImageProcessorInput)
        //nullable = true from not(false or (false and false)) = true
{
var imageProcessorInput = imageProcessorInput
this.imageProcessorInput= imageProcessorInput
this.init()
}


}
                
            

