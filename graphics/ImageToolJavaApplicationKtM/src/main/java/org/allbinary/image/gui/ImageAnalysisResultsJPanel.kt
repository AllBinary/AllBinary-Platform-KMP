
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

open public class ImageAnalysisResultsJPanel : javax.swing.JPanel {
        
public constructor (imageAnalysisResultsArray: Array<ImageAnalysisResults?>){
    //var imageAnalysisResultsArray = imageAnalysisResultsArray
initComponents()

    var imageAnalysisResults: ImageAnalysisResults = imageAnalysisResultsArray[0]!!

this.updateImageColorRangeResults(imageAnalysisResults)
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
this.jLabel1= javax.swing.JLabel()
this.jLabel2= javax.swing.JLabel()
this.jLabel3= javax.swing.JLabel()
this.percentMatchingJTextField= javax.swing.JTextField()
this.totalPixelsJTextField= javax.swing.JTextField()
this.matchingPixelsJTextField= javax.swing.JTextField()
this.jComboBox1= javax.swing.JComboBox()
this.jLabel4= javax.swing.JLabel()
this.jLabel5= javax.swing.JLabel()
this.jLabel6= javax.swing.JLabel()
this.jLabel7= javax.swing.JLabel()
this.avgRedJTextField= javax.swing.JTextField()
this.avgGreenJTextField= javax.swing.JTextField()
this.avgBlueJTextField= javax.swing.JTextField()
this.minGreenJTextField= javax.swing.JTextField()
this.jLabel8= javax.swing.JLabel()
this.jLabel9= javax.swing.JLabel()
this.jLabel10= javax.swing.JLabel()
this.minRedJTextField= javax.swing.JTextField()
this.minBlueJTextField= javax.swing.JTextField()
this.jLabel11= javax.swing.JLabel()
this.jLabel12= javax.swing.JLabel()
this.jLabel13= javax.swing.JLabel()
this.maxRedJTextField= javax.swing.JTextField()
this.maxGreenJTextField= javax.swing.JTextField()
this.maxBlueJTextField= javax.swing.JTextField()
this.jLabel1!!.setText("Matching Pixels:")
this.jLabel2!!.setText("Total Pixels:")
this.jLabel3!!.setText("Percent Matching:")
this.percentMatchingJTextField!!.setEditable(false)
this.totalPixelsJTextField!!.setEditable(false)
this.matchingPixelsJTextField!!.setEditable(false)
this.jComboBox1!!.setModel(javax.swing.DefaultComboBoxModel(arrayOf(CommonPhoneStrings.getInstance()!!.ONE)))
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

    var layout: javax.swing.GroupLayout = javax.swing.GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addContainerGap()!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addComponent(jLabel3)!!.addComponent(jLabel2)!!.addComponent(jLabel1)!!.addComponent(jLabel5)!!.addComponent(jLabel6)!!.addComponent(jLabel7)!!.addComponent(jLabel4))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(avgBlueJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)!!.addComponent(avgGreenJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)!!.addComponent(avgRedJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)!!.addComponent(totalPixelsJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)!!.addComponent(percentMatchingJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)!!.addComponent(matchingPixelsJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addComponent(jLabel12)!!.addComponent(jLabel13)!!.addComponent(jLabel8)!!.addComponent(jLabel9)!!.addComponent(jLabel10)!!.addComponent(jLabel11))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addComponent(minRedJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(maxGreenJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(minGreenJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(minBlueJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(maxRedJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(maxBlueJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addContainerGap(18, Short.MAX_VALUE)))
layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel4)!!.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel1)!!.addComponent(matchingPixelsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel8)!!.addComponent(minRedJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel2)!!.addComponent(totalPixelsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel9)!!.addComponent(minGreenJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel3)!!.addComponent(percentMatchingJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel10)!!.addComponent(minBlueJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel5)!!.addComponent(avgRedJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel11)!!.addComponent(maxRedJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel6)!!.addComponent(avgGreenJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(maxGreenJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel12))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel7)!!.addComponent(avgBlueJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel13)!!.addComponent(maxBlueJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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


    private var avgBlueJTextField: javax.swing.JTextField

    private var avgGreenJTextField: javax.swing.JTextField

    private var avgRedJTextField: javax.swing.JTextField

    private var jComboBox1: javax.swing.JComboBox

    private var jLabel1: javax.swing.JLabel

    private var jLabel10: javax.swing.JLabel

    private var jLabel11: javax.swing.JLabel

    private var jLabel12: javax.swing.JLabel

    private var jLabel13: javax.swing.JLabel

    private var jLabel2: javax.swing.JLabel

    private var jLabel3: javax.swing.JLabel

    private var jLabel4: javax.swing.JLabel

    private var jLabel5: javax.swing.JLabel

    private var jLabel6: javax.swing.JLabel

    private var jLabel7: javax.swing.JLabel

    private var jLabel8: javax.swing.JLabel

    private var jLabel9: javax.swing.JLabel

    private var matchingPixelsJTextField: javax.swing.JTextField

    private var maxBlueJTextField: javax.swing.JTextField

    private var maxGreenJTextField: javax.swing.JTextField

    private var maxRedJTextField: javax.swing.JTextField

    private var minBlueJTextField: javax.swing.JTextField

    private var minGreenJTextField: javax.swing.JTextField

    private var minRedJTextField: javax.swing.JTextField

    private var percentMatchingJTextField: javax.swing.JTextField

    private var totalPixelsJTextField: javax.swing.JTextField

}
                
            

