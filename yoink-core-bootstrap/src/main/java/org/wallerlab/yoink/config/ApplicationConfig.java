package org.wallerlab.yoink.config;

import com.mongodb.Mongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.convert.CustomConversions;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
//import org.neo4j.ogm.session.SessionFactory;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableMongoRepositories(basePackages = "org.wallerlab.yoink.molecular.repositories")
@EnableTransactionManagement
public class ApplicationConfig extends AbstractMongoConfiguration {

    @Override
    protected String getDatabaseName() {
        return "database";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new Mongo();
    }

    /**
     * Setting custom converters for {@link org.apache.commons.math3.geometry.euclidean.threed.Vector3D}
     */
    @Bean
    @Override
    public CustomConversions customConversions() {
        List<Converter<?, ?>> converterList = new ArrayList<>();
        converterList.add(new Vector3DReadConverter());
        converterList.add(new Vector3DWriteConverter());
        return new CustomConversions(converterList);
    }

}
