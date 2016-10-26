package org.wallerlab.yoink.molecular.domain;

//import org.springframework.data.annotation.Id;

/**
 * Created by christian on 21/10/2016.
 */
public class SimpleString {

//    @Id
    String id;

    public String string;

    public SimpleString(String string) {
        this.string = string;
    }
}
