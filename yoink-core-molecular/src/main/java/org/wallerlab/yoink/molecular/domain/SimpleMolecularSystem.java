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
package org.wallerlab.yoink.molecular.domain;

//import org.neo4j.ogm.annotation.GraphId;
//import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.annotation.Id;
import org.wallerlab.yoink.api.model.molecular.Atom;
import org.wallerlab.yoink.api.model.molecular.MolecularSystem;
import org.wallerlab.yoink.api.model.molecular.Molecule;

import java.util.ArrayList;
import java.util.List;

/**
 * the domain model for molecular system.
 * 
 * @author Min Zheng
 *
 */
public class SimpleMolecularSystem implements MolecularSystem {

	@Id
	public String id;

	private List<Molecule> molecules;

	private String nameOfSystem;

	public SimpleMolecularSystem() {
	}

	public SimpleMolecularSystem(List<Molecule> molecules) {
		this.molecules = molecules;
	}

	public SimpleMolecularSystem(String name, List<Molecule> molecules) {
		this.nameOfSystem=name;
		this.molecules = molecules;
	}

	/**
	 * get all atoms in the molecular system.
	 */
	@Override
	public List<Atom> getAtoms() {
		List<Atom> atoms = new ArrayList<Atom>();
		for (Molecule molecule : molecules) {
			for (Atom atom : molecule.getAtoms()) {
				atoms.add(atom);
			}
		}
		return atoms;
	}

	public String getId() {
		return id;
	}

	/**
	 * get all molecules in molecular system.
	 */
	@Override
	public List<Molecule> getMolecules() {
		return this.molecules;
	}

	public String getNameOfSystem() {
		return nameOfSystem;
	}

	public void setNameOfSystem(String nameOfSystem) {
		this.nameOfSystem = nameOfSystem;
	}

	@Override
	public String toString() {
		return "SimpleMolecularSystem{" +
				"id=" + id +
				", molecules=" + molecules +
				", nameOfSystem='" + nameOfSystem + '\'' +
				'}';
	}
}
