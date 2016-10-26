package org.wallerlab.yoink.config;

import com.mongodb.DBObject;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;

@ReadingConverter
public class Vector3DReadConverter implements Converter<DBObject, Vector3D> {

    public Vector3D convert(DBObject source) {
        Vector3D vector3D = new Vector3D((double) source.get("x"), (double) source.get("y"), (double) source.get("z"));
        return vector3D;
    }
}