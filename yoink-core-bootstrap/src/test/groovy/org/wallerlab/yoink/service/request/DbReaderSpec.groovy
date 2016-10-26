//package org.wallerlab.yoink.service.request
//
//import org.wallerlab.yoink.api.model.molecular.MolecularSystem
//import org.wallerlab.yoink.molecular.repositories.MolecularSystemRepository
//import org.wallerlab.yoink.molecular.domain.SimpleMolecularSystem
//import spock.lang.Specification
//
///**
// * Created by christian on 12/10/2016.
// */
//class DbReaderSpec extends Specification{
///**
// *
// * .............. No Database function yet !!! ........................
// *
// */
//
//    def "testing reading Id from yoink database"() {
//
//        def reader = new DbReader()
//        def repo = Mock(MolecularSystemRepository)
//        def MoleSys = new SimpleMolecularSystem()
//        def MoleSys2 = new SimpleMolecularSystem()
//        def MoleSys3 = new SimpleMolecularSystem()
//
//        ArrayList<SimpleMolecularSystem> items = new ArrayList<>()
//
//        when:
//        MoleSys.id=255
//        MoleSys2.id=66
//        MoleSys3.id=349621
//
//        items.add(MoleSys)
//        items.add(MoleSys2)
//        items.add(MoleSys3)
//
//        repo.findAll()>>items
//        reader.molecularSystemRepository = repo
//
//        then:
//        assert reader.read() instanceof List<String>
//    }
//
//    def "testing reading Ms from yoink database"() {
//
//        def reader = new DbReader()
//        def repo = Mock(MolecularSystemRepository)
//        def MoleSys = new SimpleMolecularSystem()
//        def MoleSys2 = new SimpleMolecularSystem()
//        def MoleSys3 = new SimpleMolecularSystem()
//
//        ArrayList<SimpleMolecularSystem> items = new ArrayList<>()
//
//        when:
//        MoleSys.id=255
//        MoleSys2.id=66
//        MoleSys3.id=349621
//
//        items.add(MoleSys)
//        items.add(MoleSys2)
//        items.add(MoleSys3)
//
//        repo.findAll()>>items
//        reader.molecularSystemRepository = repo
//
//        then:
//        assert reader.readMsFromDb() instanceof List<SimpleMolecularSystem>
//        println reader.readMsFromDb()
//    }
//}
