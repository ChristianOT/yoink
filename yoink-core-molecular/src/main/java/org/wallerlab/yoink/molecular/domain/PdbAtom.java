package org.wallerlab.yoink.molecular.domain;

//import org.springframework.data.annotation.Id;
import org.wallerlab.yoink.api.model.molecular.Atom;
import org.wallerlab.yoink.api.model.molecular.Coord;
import org.wallerlab.yoink.api.model.molecular.Element;

/**
 * Created by christian on 21/10/2016.
 */
public class PdbAtom extends SimpleAtom implements Atom {


    public PdbAtom(int index, Element elementType, Coord coordinate) {
        super(index, elementType, coordinate);
    }


    //    @Id
    private Long id;

    /*
     * the atom id in the pdbml file
     */
    private String seqId;


}