package org.wallerlab.yoink.plugin.service.chem;

import java.util.List;

import javax.xml.bind.JAXBElement;

import org.springframework.stereotype.Service;
import org.wallerlab.yoink.api.model.batch.Job;
import org.wallerlab.yoink.api.service.plugin.QmMmWrapper;
import org.wallerlab.yoink.api.service.math.Vector;

/**
 * this class is to call QM calculation
 * @author Min Zheng
 *
 */
@Service("qm")
public class QMProcessor implements QmMmWrapper {

	@Override
	public void run(Job<JAXBElement> job) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getEnergy() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Vector> getForces() {
		// TODO Auto-generated method stub
		return null;
	}

}
