
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
                    
        
import org.allbinary.media.image.analysis.ImageAnalysisResults
import org.allbinary.media.image.analysis.ImageColorRangeResults
import org.allbinary.media.image.analysis.ImageColorResults
import org.allbinary.string.CommonPhoneStrings
import javax.swing.DefaultComboBoxModel
import javax.swing.GroupLayout
import javax.swing.JComboBox
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JTextField
import javax.swing.LayoutStyle

open public class ImageAnalysisResultsJPanel : JPanel {
        
public constructor (imageAnalysisResultsArray: Array<ImageAnalysisResults?>){
    //var imageAnalysisResultsArray = imageAnalysisResultsArray
this.initComponents()

    var imageAnalysisResults: ImageAnalysisResults = imageAnalysisResultsArray[0]!!

this.updateImageColorRangeResults(imageAnalysisResults)
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
this.jLabel1= JLabel()
this.jLabel2= JLabel()
this.jLabel3= JLabel()
this.percentMatchingJTextField= JTextField()
this.totalPixelsJTextField= JTextField()
this.matchingPixelsJTextField= JTextField()
this.jComboBox1= JComboBox()
this.jLabel4= JLabel()
this.jLabel5= JLabel()
this.jLabel6= JLabel()
this.jLabel7= JLabel()
this.avgRedJTextField= JTextField()
this.avgGreenJTextField= JTextField()
this.avgBlueJTextField= JTextField()
this.minGreenJTextField= JTextField()
this.jLabel8= JLabel()
this.jLabel9= JLabel()
this.jLabel10= JLabel()
this.minRedJTextField= JTextField()
this.minBlueJTextField= JTextField()
this.jLabel11= JLabel()
this.jLabel12= JLabel()
this.jLabel13= JLabel()
this.maxRedJTextField= JTextField()
this.maxGreenJTextField= JTextField()
this.maxBlueJTextField= JTextField()
this.jLabel1!!.setText("Matching Pixels:")
this.jLabel2!!.setText("Total Pixels:")
this.jLabel3!!.setText("Percent Matching:")
this.percentMatchingJTextField!!.setEditable(false)
this.totalPixelsJTextField!!.setEditable(false)
this.matchingPixelsJTextField!!.setEditable(false)
this.jComboBox1!!.setModel(DefaultComboBoxModel(arrayOf(CommonPhoneStrings.getInstance()!!.ONE)))
this.jComboBox1!!.setEnabled(false)
this.jLabel4!!.setText("Image:")
this.jLabel5!!.setText("Average Red:")
this.jLabel6!!.setText("Average Green:")
this.jLabel7!!.setText("Average Blue:")
this.avgRedJTextField!!.setEditable(false)
this.avgGreenJTextField!!.setEditable(false)
this.avgBlueJTextField!!.setEditable(false)
this.minGreenJTextField!!.setEditable(false)
this.jLabel8!!.setText("Min Red:")
this.jLabel9!!.setText("Min Green:")
this.jLabel10!!.setText("Min Blue:")
this.minRedJTextField!!.setEditable(false)
this.minBlueJTextField!!.setEditable(false)
this.jLabel11!!.setText("Max Red:")
this.jLabel12!!.setText("Max Green:")
this.jLabel13!!.setText("Max Blue:")
this.maxRedJTextField!!.setEditable(false)
this.maxGreenJTextField!!.setEditable(false)
this.maxBlueJTextField!!.setEditable(false)

    var layout: GroupLayout = GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addContainerGap()!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addComponent(jLabel3)!!.addComponent(jLabel2)!!.addComponent(jLabel1)!!.addComponent(jLabel5)!!.addComponent(jLabel6)!!.addComponent(jLabel7)!!.addComponent(jLabel4))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)!!.addComponent(avgBlueJTextField, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)!!.addComponent(avgGreenJTextField, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)!!.addComponent(avgRedJTextField, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)!!.addComponent(totalPixelsJTextField, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)!!.addComponent(percentMatchingJTextField, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)!!.addComponent(matchingPixelsJTextField, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addComponent(jLabel12)!!.addComponent(jLabel13)!!.addComponent(jLabel8)!!.addComponent(jLabel9)!!.addComponent(jLabel10)!!.addComponent(jLabel11))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addComponent(minRedJTextField, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)!!.addComponent(maxGreenJTextField, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)!!.addComponent(minGreenJTextField, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)!!.addComponent(minBlueJTextField, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)!!.addComponent(maxRedJTextField, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)!!.addComponent(maxBlueJTextField, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))!!.addContainerGap(18, Short.MAX_VALUE)))
layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel4)!!.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel1)!!.addComponent(matchingPixelsJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel8)!!.addComponent(minRedJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel2)!!.addComponent(totalPixelsJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel9)!!.addComponent(minGreenJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel3)!!.addComponent(percentMatchingJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel10)!!.addComponent(minBlueJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel5)!!.addComponent(avgRedJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel11)!!.addComponent(maxRedJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel6)!!.addComponent(avgGreenJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addComponent(maxGreenJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel12))!!.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel7)!!.addComponent(avgBlueJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel13)!!.addComponent(maxBlueJTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
}


    open fun updateImageColorRangeResults(imageAnalysisResults: ImageAnalysisResults)
        //nullable = true from not(false or (false and false)) = true
{
    //var imageAnalysisResults = imageAnalysisResults

    var imageColorRangeResults: ImageColorRangeResults = imageAnalysisResults!!.getImageColorRangeResults()!!

this.matchingPixelsJTextField!!.setText(imageColorRangeResults!!.getMatchingPixelsChecked() as Long.
                            toString())
this.totalPixelsJTextField!!.setText(imageColorRangeResults!!.getTotalPixelsChecked() as Long.
                            toString())
this.percentMatchingJTextField!!.setText(Float(imageColorRangeResults!!.getPercent()).
                            toString())

    var imageColorResults: ImageColorResults = imageAnalysisResults!!.getImageColorResults()!!

this.avgRedJTextField!!.setText(Float(imageColorResults!!.getColorAverage()!!.getAvgRed()).
                            toString())
this.avgGreenJTextField!!.setText(Float(imageColorResults!!.getColorAverage()!!.getAvgGreen()).
                            toString())
this.avgBlueJTextField!!.setText(Float(imageColorResults!!.getColorAverage()!!.getAvgBlue()).
                            toString())
this.minRedJTextField!!.setText(imageColorResults!!.getColorRange()!!.getMinRed() as Long.
                            toString())
this.minGreenJTextField!!.setText(imageColorResults!!.getColorRange()!!.getMinGreen() as Long.
                            toString())
this.minBlueJTextField!!.setText(imageColorResults!!.getColorRange()!!.getMinBlue() as Long.
                            toString())
this.maxRedJTextField!!.setText(imageColorResults!!.getColorRange()!!.getMaxRed() as Long.
                            toString())
this.maxGreenJTextField!!.setText(imageColorResults!!.getColorRange()!!.getMaxGreen() as Long.
                            toString())
this.maxBlueJTextField!!.setText(imageColorResults!!.getColorRange()!!.getMaxBlue() as Long.
                            toString())
}


    private var avgBlueJTextField: JTextField

    private var avgGreenJTextField: JTextField

    private var avgRedJTextField: JTextField

    private var jComboBox1: JComboBox

    private var jLabel1: JLabel

    private var jLabel10: JLabel

    private var jLabel11: JLabel

    private var jLabel12: JLabel

    private var jLabel13: JLabel

    private var jLabel2: JLabel

    private var jLabel3: JLabel

    private var jLabel4: JLabel

    private var jLabel5: JLabel

    private var jLabel6: JLabel

    private var jLabel7: JLabel

    private var jLabel8: JLabel

    private var jLabel9: JLabel

    private var matchingPixelsJTextField: JTextField

    private var maxBlueJTextField: JTextField

    private var maxGreenJTextField: JTextField

    private var maxRedJTextField: JTextField

    private var minBlueJTextField: JTextField

    private var minGreenJTextField: JTextField

    private var minRedJTextField: JTextField

    private var percentMatchingJTextField: JTextField

    private var totalPixelsJTextField: JTextField

}
                
            

