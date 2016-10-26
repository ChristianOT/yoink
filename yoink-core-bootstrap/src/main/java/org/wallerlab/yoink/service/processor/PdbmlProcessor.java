package org.wallerlab.yoink.service.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;
import org.wallerlab.yoink.api.model.molecular.MolecularSystem;
import org.wallerlab.yoink.api.pdbml.IDatablockType;
import org.wallerlab.yoink.molecular.service.translator.TranslatorFINAL;

import javax.annotation.Resource;
import javax.xml.bind.JAXBElement;
import java.util.List;

/**
 * Created by christian on 05/10/2016.
 */
@Service
public class PdbmlProcessor implements ItemProcessor<JAXBElement<IDatablockType>, MolecularSystem> {

    @Resource
    TranslatorFINAL tf;

    @Override
    public MolecularSystem process(JAXBElement<IDatablockType> item) throws Exception {
        return tf.translate(item);
    }
}
