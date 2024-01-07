//package hello.itemservice.domain.item;
//
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.*;
//
//class GasRepositoryTest {
//
//    GasRepository gasRepository = new GasRepository();
//
//    @AfterEach
//    void afterEach() {
//        gasRepository.clearStore();
//    }
//
//    @Test
//    void save() {
//        //given
//        Gas gas = new Gas("itemA", 10000, 10);
//
//        //when
//        Gas save = gasRepository.save(gas);
//
//        //then
//        Gas byId = gasRepository.findById(gas.getId());
//
//        assertThat(byId).isEqualTo(save);
//    }
//
//    @Test
//    void findById() {
//        //given
//
//
//        //when
//
//
//        //then
//
//    }
//
//    @Test
//    void findAll() {
//        //given
//        Gas gas1 = new Gas("itemA", 10000, 10);
//        Gas gas2 = new Gas("itemB", 20000, 10);
//
//        //when
//        gasRepository.save(gas1);
//        gasRepository.save(gas2);
//
//        List<Gas> all = gasRepository.findAll();
//
//        //then
//        assertThat(all.size()).isEqualTo(2);
//        assertThat(all).contains(gas1, gas2);
//    }
//
//    @Test
//    void update() {
//        //given
//        Gas gas1 = new Gas("itemA", 10000, 10);
//
//        //when
//        Gas gas = gasRepository.save(gas1);
//        Long id = gas.getId();
//
//        Gas gas2 = new Gas("itemB", 20000, 10);
//        gasRepository.update(id,gas2);
//
//        //then
//        Gas byId = gasRepository.findById(id);
//        assertThat(byId.getGasName()).isEqualTo(gas2.getGasName());
//        assertThat(byId.getHarmful()).isEqualTo(gas2.getHarmful());
//        assertThat(byId.getQuantity()).isEqualTo(gas2.getQuantity());
//
//    }
//
//
//    @Test
//    void clearStore() {
//        //given
//
//        //when

        //then
//    }
//}