
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
import java.util.Arrays
import java.util.Comparator
import javax.imageio.ImageIO
import org.allbinary.gui.dialog.FileJDialog
import org.allbinary.gui.dialog.FileJDialogListenerInterface
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.media.image.ImageProcessorInput
import org.allbinary.media.image.ImageProcessorInputCompositeInterface
import org.allbinary.media.image.analysis.ColorRange
import org.allbinary.media.image.analysis.ColorRangeInterface
import org.allbinary.media.image.analysis.ImageAnalysis
import org.allbinary.media.image.analysis.ImageAnalysisResults
import org.allbinary.string.CommonPhoneStrings
import org.allbinary.string.CommonStrings

open public class ImageToolJFrame : swing.JFrame
                , FileJDialogListenerInterface {
        

        companion object {


    private var imageProcessorInputCompositeInterface: ImageProcessorInputCompositeInterface


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var fileJDialog: FileJDialog

    private var imageProcessorInput: ImageProcessorInput
public constructor        (){initComponents()

    var commonPhoneStrings: CommonPhoneStrings = CommonPhoneStrings.getInstance()!!
            

this.setSize(640, 480)
this.getMaxRedJTextField()!!.setText(
                            "255")
this.getMaxGreenJTextField()!!.setText(
                            "255")
this.getMaxBlueJTextField()!!.setText(
                            "255")
this.getMinRedJTextField()!!.setText(commonPhoneStrings!!.ZERO)
this.getMinGreenJTextField()!!.setText(commonPhoneStrings!!.ZERO)
this.getMinBlueJTextField()!!.setText(commonPhoneStrings!!.ZERO)
fileJDialog= FileJDialog()
fileJDialog!!.addFinishedListener(this)
}


open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{analysisActionJDialog= JDialog()
titleJLabel= JLabel()
colorRangeJLabel= JLabel()
redJLabel= JLabel()
minJLabel= JLabel()
maxJLabel= JLabel()
greenJLabel= JLabel()
blueJLabel= JLabel()
minRedJTextField= JTextField()
maxRedJTextField= JTextField()
maxGreenJTextField= JTextField()
minBlueJTextField= JTextField()
maxBlueJTextField= JTextField()
okJButton= JButton()
minGreenJTextField= JTextField()
jPanel1= JPanel()
mainJMenuBar= JMenuBar()
fileJMenu= JMenu()
openImageJMenuItem= JMenuItem()
processingJMenu= JMenu()
analyzeJMenuItem= JMenuItem()
generateSpriteSplitterMenuItem= JMenuItem()
generateRotationMenuItem= JMenuItem()
generateMirrorSpriteMenuItem= JMenuItem()
generateRotationSpriteJMenuItem= JMenuItem()
createStripImageJMenuItem= JMenuItem()
mirrorJMenuItem= JMenuItem()
scaleImagesJMenuItem= JMenuItem()
canvasImagesJMenuItem= JMenuItem()
analysisActionJDialog!!.setMinimumSize(Dimension(350, 250))
titleJLabel!!.setText(
                            "              Color At Action Options            ")
colorRangeJLabel!!.setText(
                            "Color Range")
redJLabel!!.setText(
                            "Red:")
minJLabel!!.setText(
                            "Minimum")
maxJLabel!!.setText(
                            "Maximum")
greenJLabel!!.setText(
                            "Green:")
blueJLabel!!.setText(
                            "Blue:")
okJButton!!.setText(
                            "OK")
okJButton!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
okJButtonActionPerformed(evt)
}

                                }
                            )

    var analysisActionJDialogLayout: GroupLayout = GroupLayout(analysisActionJDialog!!.getContentPane())

analysisActionJDialog!!.getContentPane()!!.setLayout(analysisActionJDialogLayout)
analysisActionJDialogLayout!!.setHorizontalGroup(analysisActionJDialogLayout!!.createParallelGroup(org!!.jdesktop!!.layout!!.GroupLayout.LEADING)!!.add(analysisActionJDialogLayout!!.createSequentialGroup()!!.addContainerGap()!!.add(analysisActionJDialogLayout!!.createParallelGroup(org!!.jdesktop!!.layout!!.GroupLayout.LEADING)!!.add(analysisActionJDialogLayout!!.createSequentialGroup()!!.add(analysisActionJDialogLayout!!.createParallelGroup(org!!.jdesktop!!.layout!!.GroupLayout.LEADING)!!.add(blueJLabel)!!.add(greenJLabel)!!.add(redJLabel)!!.add(colorRangeJLabel))!!.add(29, 29, 29)!!.add(analysisActionJDialogLayout!!.createParallelGroup(org!!.jdesktop!!.layout!!.GroupLayout.LEADING)!!.add(org!!.jdesktop!!.layout!!.GroupLayout.TRAILING, minJLabel, org!!.jdesktop!!.layout!!.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)!!.add(analysisActionJDialogLayout!!.createParallelGroup(org!!.jdesktop!!.layout!!.GroupLayout.TRAILING, false)!!.add(org!!.jdesktop!!.layout!!.GroupLayout.LEADING, minBlueJTextField)!!.add(org!!.jdesktop!!.layout!!.GroupLayout.LEADING, minGreenJTextField)!!.add(org!!.jdesktop!!.layout!!.GroupLayout.LEADING, minRedJTextField, org!!.jdesktop!!.layout!!.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)!!.add(org!!.jdesktop!!.layout!!.GroupLayout.LEADING, okJButton)))!!.addPreferredGap(org!!.jdesktop!!.layout!!.LayoutStyle.RELATED)!!.add(analysisActionJDialogLayout!!.createParallelGroup(org!!.jdesktop!!.layout!!.GroupLayout.TRAILING)!!.add(org!!.jdesktop!!.layout!!.GroupLayout.LEADING, analysisActionJDialogLayout!!.createSequentialGroup()!!.add(analysisActionJDialogLayout!!.createParallelGroup(org!!.jdesktop!!.layout!!.GroupLayout.TRAILING, false)!!.add(org!!.jdesktop!!.layout!!.GroupLayout.LEADING, maxRedJTextField)!!.add(org!!.jdesktop!!.layout!!.GroupLayout.LEADING, analysisActionJDialogLayout!!.createSequentialGroup()!!.add(1, 1, 1)!!.add(analysisActionJDialogLayout!!.createParallelGroup(org!!.jdesktop!!.layout!!.GroupLayout.LEADING)!!.add(maxBlueJTextField)!!.add(maxGreenJTextField, org!!.jdesktop!!.layout!!.GroupLayout.PREFERRED_SIZE, 43, org!!.jdesktop!!.layout!!.GroupLayout.PREFERRED_SIZE))))!!.addPreferredGap(org!!.jdesktop!!.layout!!.LayoutStyle.RELATED, 17, Short.MAX_VALUE))!!.add(org!!.jdesktop!!.layout!!.GroupLayout.LEADING, maxJLabel, org!!.jdesktop!!.layout!!.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))!!.addContainerGap())!!.add(org!!.jdesktop!!.layout!!.GroupLayout.TRAILING, analysisActionJDialogLayout!!.createSequentialGroup()!!.add(titleJLabel)!!.add(25, 25, 25)))))
analysisActionJDialogLayout!!.setVerticalGroup(analysisActionJDialogLayout!!.createParallelGroup(org!!.jdesktop!!.layout!!.GroupLayout.LEADING)!!.add(analysisActionJDialogLayout!!.createSequentialGroup()!!.add(titleJLabel)!!.addPreferredGap(org!!.jdesktop!!.layout!!.LayoutStyle.RELATED)!!.add(analysisActionJDialogLayout!!.createParallelGroup(org!!.jdesktop!!.layout!!.GroupLayout.BASELINE)!!.add(minJLabel)!!.add(colorRangeJLabel)!!.add(maxJLabel))!!.addPreferredGap(org!!.jdesktop!!.layout!!.LayoutStyle.RELATED)!!.add(analysisActionJDialogLayout!!.createParallelGroup(org!!.jdesktop!!.layout!!.GroupLayout.TRAILING)!!.add(redJLabel)!!.add(analysisActionJDialogLayout!!.createParallelGroup(org!!.jdesktop!!.layout!!.GroupLayout.BASELINE)!!.add(minRedJTextField, org!!.jdesktop!!.layout!!.GroupLayout.PREFERRED_SIZE, org!!.jdesktop!!.layout!!.GroupLayout.DEFAULT_SIZE, org!!.jdesktop!!.layout!!.GroupLayout.PREFERRED_SIZE)!!.add(maxRedJTextField, org!!.jdesktop!!.layout!!.GroupLayout.PREFERRED_SIZE, org!!.jdesktop!!.layout!!.GroupLayout.DEFAULT_SIZE, org!!.jdesktop!!.layout!!.GroupLayout.PREFERRED_SIZE)))!!.addPreferredGap(org!!.jdesktop!!.layout!!.LayoutStyle.RELATED)!!.add(analysisActionJDialogLayout!!.createParallelGroup(org!!.jdesktop!!.layout!!.GroupLayout.TRAILING)!!.add(greenJLabel)!!.add(analysisActionJDialogLayout!!.createParallelGroup(org!!.jdesktop!!.layout!!.GroupLayout.BASELINE)!!.add(minGreenJTextField, org!!.jdesktop!!.layout!!.GroupLayout.PREFERRED_SIZE, org!!.jdesktop!!.layout!!.GroupLayout.DEFAULT_SIZE, org!!.jdesktop!!.layout!!.GroupLayout.PREFERRED_SIZE)!!.add(maxGreenJTextField, org!!.jdesktop!!.layout!!.GroupLayout.PREFERRED_SIZE, org!!.jdesktop!!.layout!!.GroupLayout.DEFAULT_SIZE, org!!.jdesktop!!.layout!!.GroupLayout.PREFERRED_SIZE)))!!.addPreferredGap(org!!.jdesktop!!.layout!!.LayoutStyle.RELATED)!!.add(analysisActionJDialogLayout!!.createParallelGroup(org!!.jdesktop!!.layout!!.GroupLayout.TRAILING)!!.add(blueJLabel)!!.add(analysisActionJDialogLayout!!.createParallelGroup(org!!.jdesktop!!.layout!!.GroupLayout.BASELINE)!!.add(minBlueJTextField, org!!.jdesktop!!.layout!!.GroupLayout.PREFERRED_SIZE, org!!.jdesktop!!.layout!!.GroupLayout.DEFAULT_SIZE, org!!.jdesktop!!.layout!!.GroupLayout.PREFERRED_SIZE)!!.add(maxBlueJTextField, org!!.jdesktop!!.layout!!.GroupLayout.PREFERRED_SIZE, org!!.jdesktop!!.layout!!.GroupLayout.DEFAULT_SIZE, org!!.jdesktop!!.layout!!.GroupLayout.PREFERRED_SIZE)))!!.add(16, 16, 16)!!.add(okJButton)!!.addContainerGap(org!!.jdesktop!!.layout!!.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
setDefaultCloseOperation(javax!!.swing!!.WindowConstants.EXIT_ON_CLOSE)
getContentPane()!!.setLayout(GridLayout(1, 0))
jPanel1!!.setLayout(GridLayout(1, 0))
getContentPane()!!.add(jPanel1)
fileJMenu!!.setText(
                            "File")
fileJMenu!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
fileJMenuActionPerformed(evt)
}

                                }
                            )
openImageJMenuItem!!.setText(
                            "Open")
openImageJMenuItem!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
openImageJMenuItemActionPerformed(evt)
}

                                }
                            )
fileJMenu!!.add(openImageJMenuItem)
mainJMenuBar!!.add(fileJMenu)
processingJMenu!!.setText(
                            "Processing")
processingJMenu!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
processingJMenuActionPerformed(evt)
}

                                }
                            )
analyzeJMenuItem!!.setText(
                            "Image Analyze")
analyzeJMenuItem!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
analyzeJMenuItemActionPerformed(evt)
}

                                }
                            )
processingJMenu!!.add(analyzeJMenuItem)
generateMirrorSpriteMenuItem!!.setText(
                            "Mirror Sprite Generator")
generateMirrorSpriteMenuItem!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
generateMirrorSpriteMenuItemActionPerformed(evt)
}

                                }
                            )
processingJMenu!!.add(generateMirrorSpriteMenuItem)
generateRotationSpriteJMenuItem!!.setText(
                            "Rotation Sprite Generator")
generateRotationSpriteJMenuItem!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
generateRotationSpriteJMenuItemActionPerformed(evt)
}

                                }
                            )
processingJMenu!!.add(generateRotationSpriteJMenuItem)
generateSpriteSplitterMenuItem!!.setText(
                            "Sprite Splitter Generator")
generateSpriteSplitterMenuItem!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
generateSpriteSplitterMenuItemActionPerformed(evt)
}

                                }
                            )
processingJMenu!!.add(generateSpriteSplitterMenuItem)
generateRotationMenuItem!!.setText(
                            "Rotate Image Generator")
generateRotationMenuItem!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
generateRotationMenuItemActionPerformed(evt)
}

                                }
                            )
processingJMenu!!.add(generateRotationMenuItem)
createStripImageJMenuItem!!.setText(
                            "Multi Image Unifier")
createStripImageJMenuItem!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
createStripImageJMenuItemActionPerformed(evt)
}

                                }
                            )
processingJMenu!!.add(createStripImageJMenuItem)
mirrorJMenuItem!!.setText(
                            "Mirror Image(s)")
mirrorJMenuItem!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
mirrorJMenuItemActionPerformed(evt)
}

                                }
                            )
processingJMenu!!.add(mirrorJMenuItem)
scaleImagesJMenuItem!!.setText(
                            "Scale Image(s)")
scaleImagesJMenuItem!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
scaleImagesJMenuItemActionPerformed(evt)
}

                                }
                            )
processingJMenu!!.add(scaleImagesJMenuItem)
canvasImagesJMenuItem!!.setText(
                            "Canvas Image(s)")
canvasImagesJMenuItem!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
canvasImagesJMenuItemActionPerformed(evt)
}

                                }
                            )
processingJMenu!!.add(canvasImagesJMenuItem)
mainJMenuBar!!.add(processingJMenu)
setJMenuBar(mainJMenuBar)
pack()
}


open fun createStripImageJMenuItemActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

        try {
            
    var imageUnifierJPanel: ImageUnifierJPanel = ImageUnifierJPanel(this.imageProcessorInput)

this.jPanel1!!.removeAll()
this.jPanel1!!.add(imageUnifierJPanel)
this.jPanel1!!.updateUI()
imageProcessorInputCompositeInterface= imageUnifierJPanel
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "createStripImageJMenuItemActionPerformed", e)
}

}


open fun okJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

        try {
            logUtil!!.put(
                            "Starting", this, 
                            "okJButtonActionPerformed")

    var imageAnalysisResultsArray: Array<ImageAnalysisResults?> = ImageAnalysis.getInstance()!!.process(imageProcessorInput!!.getBufferedImageArray(), this.getColorRangeInterface())!!
            

this.jPanel1!!.removeAll()
this.jPanel1!!.add(ImageAnalysisResultsJPanel(imageAnalysisResultsArray))
this.jPanel1!!.updateUI()
this.analysisActionJDialog!!.setVisible(false)
imageProcessorInputCompositeInterface= 
                                        null
                                    
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "okJButtonActionPerformed", e)
}

}


open fun processingJMenuActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
}


open fun openImageJMenuItemActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

        try {
            logUtil!!.put(
                            "Starting", this, 
                            "openImageJMenuItemActionPerformed")
fileJDialog!!.setVisible(true)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "openImageJMenuItemActionPerformed", e)
}

}


open fun onFiles(files: Array<File?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var files = files

        try {
            logUtil!!.put("Reading " +files!!.size +" files.", this, 
                            "onFiles")
Arrays.sort(files, object: Comparator<File>()
                                {
                                override fun compare(file1: File, file2: File)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var file1 = file1


                    var file2 = file2

    var fileNameIndexValue1: Int = extractIndexNumberIfAnyFromFileName(file1!!.getName())!!
            


    var fileNameIndexValue2: Int = extractIndexNumberIfAnyFromFileName(file2!!.getName())!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return fileNameIndexValue1 -fileNameIndexValue2
}

open override fun extractIndexNumberIfAnyFromFileName(name: String)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var name = name

    var i: Int = 0


        try {
            
    var start: Int = name!!.lastIndexOf(
                            '_') +1


    var end: Int = name!!.lastIndexOf(
                            '.')!!
            


    var number: String = name!!.substring(start, end)!!
            

i= Integer.parseInt(number)
} catch(e: Exception)
            {i= 0
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return i
}

                                }
                            )

    var bufferedImageArray: Array<BufferedImage?> = arrayOfNulls(files!!.size)





                        for (index in 0 until files!!.size)


        {bufferedImageArray[index]= ImageIO.read(files[index]!!)

    
                        if(bufferedImageArray[index] == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception("Unable to read file: " +files[index]!!.getPath())

                                    }
                                
}

this.imageProcessorInput= ImageProcessorInput(files, bufferedImageArray)
this.fileJDialog!!.setVisible(false)

    
                        if(imageProcessorInputCompositeInterface != 
                                    null
                                )
                        
                                    {
                                    imageProcessorInputCompositeInterface!!.setImageProcessorInput(this.imageProcessorInput)

                                    }
                                
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "onFiles", e)
}

}


open fun fileJMenuActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
}


open fun analyzeJMenuItemActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

        try {
            logUtil!!.put(
                            "Starting", this, 
                            "analyzeJMenuItemActionPerformed")
this.analysisActionJDialog!!.setVisible(true)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "analyzeJMenuItemActionPerformed", e)
}

}


open fun generateRotationSpriteJMenuItemActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

        try {
            logUtil!!.put(
                            "Starting", this, 
                            "generateRotationSpriteJMenuItemActionPerformed")

    var spriteImageJPanel: RotationSpriteImageJPanel = RotationSpriteImageJPanel(this.imageProcessorInput)

this.jPanel1!!.removeAll()
this.jPanel1!!.add(spriteImageJPanel)
this.jPanel1!!.updateUI()
imageProcessorInputCompositeInterface= spriteImageJPanel
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "generateRotationSpriteJMenuItemActionPerformed", e)
}

}


open fun generateSpriteSplitterMenuItemActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

        try {
            logUtil!!.put(
                            "Starting", this, 
                            "generateRotationSpriteJMenuItemActionPerformed")

    var imageJPanel: SpriteSplitterImageJPanel = SpriteSplitterImageJPanel(this.imageProcessorInput)

this.jPanel1!!.removeAll()
this.jPanel1!!.add(imageJPanel)
this.jPanel1!!.updateUI()
imageProcessorInputCompositeInterface= imageJPanel
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "generateRotationMenuItemActionPerformed", e)
}

}


open fun generateRotationMenuItemActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

        try {
            logUtil!!.put(
                            "Starting", this, 
                            "generateRotationSpriteJMenuItemActionPerformed")

    var rotationImageJPanel: RotationImageJPanel = RotationImageJPanel(this.imageProcessorInput)

this.jPanel1!!.removeAll()
this.jPanel1!!.add(rotationImageJPanel)
this.jPanel1!!.updateUI()
imageProcessorInputCompositeInterface= rotationImageJPanel
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "generateRotationMenuItemActionPerformed", e)
}

}


open fun scaleImagesJMenuItemActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

        try {
            logUtil!!.put(this.commonStrings!!.START, this, 
                            "scaleImagesJMenuItemActionPerformed")

    var resizeImageJPanel: ResizeImageJPanel = ResizeImageJPanel(this.imageProcessorInput)

this.jPanel1!!.removeAll()
this.jPanel1!!.add(resizeImageJPanel)
this.jPanel1!!.updateUI()
imageProcessorInputCompositeInterface= resizeImageJPanel
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "scaleImagesJMenuItemActionPerformed", e)
}

}


open fun canvasImagesJMenuItemActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

        try {
            logUtil!!.put(this.commonStrings!!.START, this, 
                            "canvasImagesJMenuItemActionPerformed")

    var resizeImageJPanel: CanvasImageJPanel = CanvasImageJPanel(this.imageProcessorInput)

this.jPanel1!!.removeAll()
this.jPanel1!!.add(resizeImageJPanel)
this.jPanel1!!.updateUI()
imageProcessorInputCompositeInterface= resizeImageJPanel
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "scaleImagesJMenuItemActionPerformed", e)
}

}


open fun generateMirrorSpriteMenuItemActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

        try {
            logUtil!!.put(
                            "Starting", this, 
                            "generateMirrorSpriteJMenuItemActionPerformed")

    var spriteImageJPanel: MirrorSpriteImageJPanel = MirrorSpriteImageJPanel(this.imageProcessorInput)

this.jPanel1!!.removeAll()
this.jPanel1!!.add(spriteImageJPanel)
this.jPanel1!!.updateUI()
imageProcessorInputCompositeInterface= spriteImageJPanel
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "generateMirrorSpriteJMenuItemActionPerformed", e)
}

}


open fun mirrorJMenuItemActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

        try {
            logUtil!!.put(
                            "Starting", this, 
                            "generateMirrorJMenuItemActionPerformed")

    var mirrorImageJPanel: MirrorImageJPanel = MirrorImageJPanel(this.imageProcessorInput)

this.jPanel1!!.removeAll()
this.jPanel1!!.add(mirrorImageJPanel)
this.jPanel1!!.updateUI()
imageProcessorInputCompositeInterface= mirrorImageJPanel
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "generateMirrorJMenuItemActionPerformed", e)
}

}


open fun getColorRangeInterface()
        //nullable = true from not(false or (false and true)) = true
: ColorRangeInterface{
    var colorRangeInterface: ColorRangeInterface = ColorRange() as ColorRangeInterface

colorRangeInterface!!.setMinRed(Integer(this.getMinRedJTextField()!!.getText()).
                            toInt())
colorRangeInterface!!.setMaxRed(Integer(this.getMaxRedJTextField()!!.getText()).
                            toInt())
colorRangeInterface!!.setMinGreen(Integer(this.getMinGreenJTextField()!!.getText()).
                            toInt())
colorRangeInterface!!.setMaxGreen(Integer(this.getMaxGreenJTextField()!!.getText()).
                            toInt())
colorRangeInterface!!.setMinBlue(Integer(this.getMinBlueJTextField()!!.getText()).
                            toInt())
colorRangeInterface!!.setMaxBlue(Integer(this.getMaxBlueJTextField()!!.getText()).
                            toInt())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return colorRangeInterface
}


open fun getMaxBlueJTextField()
        //nullable = true from not(false or (false and true)) = true
: JTextField{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return maxBlueJTextField
}


open fun setMaxBlueJTextField(maxBlueJTextField: JTextField)
        //nullable = true from not(false or (false and false)) = true
{

                    var maxBlueJTextField = maxBlueJTextField
this.maxBlueJTextField= maxBlueJTextField
}


open fun getMaxGreenJTextField()
        //nullable = true from not(false or (false and true)) = true
: JTextField{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return maxGreenJTextField
}


open fun setMaxGreenJTextField(maxGreenJTextField: JTextField)
        //nullable = true from not(false or (false and false)) = true
{

                    var maxGreenJTextField = maxGreenJTextField
this.maxGreenJTextField= maxGreenJTextField
}


open fun getMaxRedJTextField()
        //nullable = true from not(false or (false and true)) = true
: JTextField{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return maxRedJTextField
}


open fun setMaxRedJTextField(maxRedJTextField: JTextField)
        //nullable = true from not(false or (false and false)) = true
{

                    var maxRedJTextField = maxRedJTextField
this.maxRedJTextField= maxRedJTextField
}


open fun getMinBlueJTextField()
        //nullable = true from not(false or (false and true)) = true
: JTextField{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return minBlueJTextField
}


open fun setMinBlueJTextField(minBlueJTextField: JTextField)
        //nullable = true from not(false or (false and false)) = true
{

                    var minBlueJTextField = minBlueJTextField
this.minBlueJTextField= minBlueJTextField
}


open fun getMinGreenJTextField()
        //nullable = true from not(false or (false and true)) = true
: JTextField{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return minGreenJTextField
}


open fun setMinGreenJTextField(minGreenJTextField: JTextField)
        //nullable = true from not(false or (false and false)) = true
{

                    var minGreenJTextField = minGreenJTextField
this.minGreenJTextField= minGreenJTextField
}


open fun getMinRedJTextField()
        //nullable = true from not(false or (false and true)) = true
: JTextField{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return minRedJTextField
}


open fun setMinRedJTextField(minRedJTextField: JTextField)
        //nullable = true from not(false or (false and false)) = true
{

                    var minRedJTextField = minRedJTextField
this.minRedJTextField= minRedJTextField
}


    private var analysisActionJDialog: JDialog

    private var analyzeJMenuItem: JMenuItem

    private var blueJLabel: JLabel

    private var colorRangeJLabel: JLabel

    private var createStripImageJMenuItem: JMenuItem

    private var fileJMenu: JMenu

    private var generateSpriteSplitterMenuItem: JMenuItem

    private var generateRotationMenuItem: JMenuItem

    private var generateMirrorSpriteMenuItem: JMenuItem

    private var generateRotationSpriteJMenuItem: JMenuItem

    private var greenJLabel: JLabel

    private var jPanel1: JPanel

    private var mainJMenuBar: JMenuBar

    private var maxBlueJTextField: JTextField

    private var maxGreenJTextField: JTextField

    private var maxJLabel: JLabel

    private var maxRedJTextField: JTextField

    private var minBlueJTextField: JTextField

    private var minGreenJTextField: JTextField

    private var minJLabel: JLabel

    private var minRedJTextField: JTextField

    private var mirrorJMenuItem: JMenuItem

    private var okJButton: JButton

    private var openImageJMenuItem: JMenuItem

    private var processingJMenu: JMenu

    private var redJLabel: JLabel

    private var scaleImagesJMenuItem: JMenuItem

    private var canvasImagesJMenuItem: JMenuItem

    private var titleJLabel: JLabel

}
                
            

