/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wallerlab.yoink.density.data

import org.wallerlab.yoink.density.domain.SimpleRadialGrid
import org.wallerlab.yoink.math.linear.SimpleMatrixFactory
import org.wallerlab.yoink.api.service.math.Matrix

import spock.lang.Specification

class RadialGridReaderSpec extends Specification {
	def "test read(String wfc_file, RadialGrid radial_grid)"(){
		when:
		def grid= new SimpleRadialGrid()
		def reader= new RadialGridReader()
		def myMatrix= new SimpleMatrixFactory()
		myMatrix.matrixType=Matrix.Type.COMMONS
		reader.myMatrix=myMatrix
		then:
		reader.read("./dat/c__lda.wfc",  grid)
		Math.abs(grid.exponent-4.1313E-04)<=1.0E-6
		Math.abs(grid.zeta-2.0000E-03)<=1.0E-5
		grid.numberOfGrids==5326
		Math.abs(grid.maxGridDistance-17.4308)<=1.0E-1
		Math.abs(grid.gridValues[0]-126.29792471)<=1.0E-1
		Math.abs(grid.firstDerivativeOfGridValues[0]+585.74940956)<=1.0E-1
		Math.abs(grid.secondDerivativeOfGridValues[0]+1178635.73819704)<=1.0E-1

	}

}