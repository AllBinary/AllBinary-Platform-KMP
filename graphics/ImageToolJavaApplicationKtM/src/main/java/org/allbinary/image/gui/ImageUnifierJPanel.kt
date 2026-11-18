
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
import java.awt.Dimension
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.KeyAdapter
import java.awt.event.KeyEvent
import java.beans.PropertyChangeEvent
import java.beans.PropertyChangeListener
import javax.swing.GroupLayout
import javax.swing.JButton
import javax.swing.JLabel
import javax.swing.JList
import javax.swing.JPanel
import javax.swing.JScrollPane
import javax.swing.JTextField
import javax.swing.LayoutStyle

open public class ImageUnifierJPanel : JPanel
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

    var width: Double = bufferedImageArray[index]!!.getWidth()


    var height: Double = bufferedImageArray[index]!!.getHeight()


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


    var averageRatio: Double = this.imagesRatioUtil!!.getAverage(tempBufferedImageArray, totalImages)


    var averageRatioString: String = Double(averageRatio).
                            toString()!!


    
                        if(averageRatioString!!.length > 4)
                        
                                    {
                                    averageRatioString= averageRatioString!!.substring(0, 4)!!

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


    var averageRatio: Double = this.imagesRatioUtil!!.getAverage(tempBufferedImageArray, totalImages)


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
this.result= ImageUnifierUtil.getInstance()!!.getImage(tempBufferedImageArray, this.imageUnifierProperties)!!

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
                                    cellRatioString= cellRatioString!!.substring(0, 4)!!

                                    }
                                
this.cellRatioJTextField!!.setText(cellRatioString)
this.updateImage()

                                    }
                                
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{

    var commonPhoneStrings: CommonPhoneStrings = CommonPhoneStrings.getInstance()!!

this.jScrollPane1= JScrollPane()
this.imageJList= JList()
this.jScrollPane2= JScrollPane()
this.jPanel1= JPanel()
this.jButton1= JButton()
this.upJButton= JButton()
this.downJButton= JButton()
this.fudgeItJButton= JButton()
this.jLabel2= JLabel()
this.columnsJTextField= JTextField()
this.jLabel1= JLabel()
this.rowsJTextField= JTextField()
this.jLabel3= JLabel()
this.cellWidthJTextField= JTextField()
this.jLabel4= JLabel()
this.cellHeightJTextField= JTextField()
this.jLabel5= JLabel()
this.cellRatioJTextField= JTextField()
this.jLabel6= JLabel()
this.avgRatioJTextField= JTextField()
this.jButton2= JButton()
this.jButtonOrder= JButton()
setMinimumSize(Dimension(500, 375))
setPreferredSize(Dimension(0, 0))
this.imageJList!!.setMinimumSize(Dimension(50, 0))
this.jScrollPane1!!.setViewportView(this.imageJList)
this.jButton1!!.setText("Save")
this.jButton1!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
jButton1ActionPerformed(evt)
}

                                }
                            )
this.upJButton!!.setText("Up")
this.upJButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
upJButtonActionPerformed(evt)
}

                                }
                            )
this.downJButton!!.setText("Down")
this.downJButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
downJButtonActionPerformed(evt)
}

                                }
                            )
this.fudgeItJButton!!.setText("Fudge It!")
this.fudgeItJButton!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
fudgeItJButtonActionPerformed(evt)
}

                                }
                            )
this.jLabel2!!.setText("Columns:")
this.columnsJTextField!!.setText(commonPhoneStrings!!.TWO)
this.columnsJTextField!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
columnsJTextFieldActionPerformed(evt)
}

                                }
                            )
this.columnsJTextField!!.addPropertyChangeListener(object: PropertyChangeListener()
                                {
                                
                                
    open override fun propertyChange(evt: PropertyChangeEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
columnsJTextFieldPropertyChange(evt)
}

                                }
                            )
this.columnsJTextField!!.addKeyListener(object: KeyAdapter()
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
this.jLabel1!!.setText("Rows:")
this.rowsJTextField!!.setText(commonPhoneStrings!!.TWO)
this.rowsJTextField!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
rowsJTextFieldActionPerformed(evt)
}

                                }
                            )
this.jLabel3!!.setText("Cell Width:")
this.cellWidthJTextField!!.setText("200")
this.cellWidthJTextField!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
cellWidthJTextFieldActionPerformed(evt)
}

                                }
                            )
this.jLabel4!!.setText("Cell Height:")
this.cellHeightJTextField!!.setText("150")
this.cellHeightJTextField!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
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
this.jButton2!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
jButton2ActionPerformed(evt)
}

                                }
                            )
this.jButtonOrder!!.setText("Order")
this.jButtonOrder!!.addActionListener(object: ActionListener()
                                {
                                
                                
    open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
jButtonOrderActionPerformed(evt)
}

                                }
                            )

    var jPanel1Layout: GroupLayout = GroupLayout(this.jPanel1)

this.jPanel1!!.setLayout(jPanel1Layout)
jPanel1Layout!!.setHorizontalGroup(jPanel1Layout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout!!.createSequentialGroup()!!.addContainerGap()!!.addGroup(jPanel1Layout!!.createParallelGroup(GroupLayout.Alignment.TRAILING)!!.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)!!.addGroup(jPanel1Layout!!.createSequentialGroup()!!.addComponent(upJButton, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)!!.addComponent(downJButton, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))!!.addComponent(fudgeItJButton, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)!!.addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout!!.createSequentialGroup()!!.addComponent(jLabel3)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 99, GroupLayout.PREFERRED_SIZE))!!.addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout!!.createSequentialGroup()!!.addComponent(jLabel4)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 96, GroupLayout.PREFERRED_SIZE))!!.addComponent(avgRatioJTextField, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)!!.addComponent(jLabel6, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)!!.addComponent(cellRatioJTextField, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)!!.addComponent(jLabel5, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)!!.addComponent(cellHeightJTextField, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)!!.addComponent(cellWidthJTextField, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)!!.addComponent(jButton2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)!!.addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout!!.createSequentialGroup()!!.addGroup(jPanel1Layout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addComponent(jLabel2)!!.addComponent(jLabel1))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(jPanel1Layout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addComponent(rowsJTextField, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)!!.addGroup(jPanel1Layout!!.createSequentialGroup()!!.addComponent(columnsJTextField, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)!!.addGap(1, 1, 1))))!!.addComponent(jButtonOrder, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))!!.addContainerGap()))
jPanel1Layout!!.setVerticalGroup(jPanel1Layout!!.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(jPanel1Layout!!.createSequentialGroup()!!.addContainerGap()!!.addComponent(jButton1)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(jPanel1Layout!!.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(upJButton)!!.addComponent(downJButton))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jButtonOrder)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(fudgeItJButton)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(jPanel1Layout!!.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel2)!!.addComponent(columnsJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(jPanel1Layout!!.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel1)!!.addComponent(rowsJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel3)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(cellWidthJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel4)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(cellHeightJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jButton2)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel5)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addComponent(cellRatioJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addGap(7, 7, 7)!!.addComponent(jLabel6)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(avgRatioJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addGap(66, 66, 66)))

    var layout: GroupLayout = GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)))
layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)!!.addComponent(jPanel1, GroupLayout.Alignment.LEADING, 0, 445, Short.MAX_VALUE)!!.addComponent(jScrollPane2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)!!.addComponent(jScrollPane1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))!!.addContainerGap()))
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


    var filePath: String = file.getAbsolutePath()!!


    var extensionIndex: Int = filePath!!.indexOf(this.imageStrings!!.PNG_EXTENSION)

filePath= StringMaker().
                            append(filePath!!.substring(0, extensionIndex))!!.append(CommonSeps.getInstance()!!.UNDERSCORE)!!.appendint(this.imageUnifierProperties!!.getColumns().toInt())!!.append("_By_")!!.appendint(this.imageUnifierProperties!!.getRows().toInt())!!.append("_Unified")!!.append(this.imageStrings!!.PNG_EXTENSION)!!.toString()!!
this.logUtil!!.putF("New File Path: " +filePath, this, StringUtil.getInstance()!!.EMPTY_STRING)

    var outputFile: File = File(filePath)

ImagePersistanceUtil.getInstance()!!.saveWithBatik(FileWrapperUtil.wrapFile(outputFile), this.result)
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "jButton1ActionPerformed", e)
}

}


    open fun downJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

    var index: Int = this.imageJList!!.getSelectedIndex()


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

    var index: Int = this.imageJList!!.getSelectedIndex()


    
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


    var size: Int = defaultListModel!!.size()


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
                
            

