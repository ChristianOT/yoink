package org.wallerlab.yoink.api.pdbml;

/**
 * Created by christian on 30/09/2016.
 */
public interface IDatablockType {

    String getDatablockName();

    IAtomSiteType getAtomSiteCategory();
}
