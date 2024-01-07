package hello.itemservice.domain.item;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class GasRepository {

    private static final Map<Long, Gas> store = new ConcurrentHashMap<>();
    private static long sequence = 0L; //static

    public Gas save(Gas gas) {
        gas.setId(++sequence);
        store.put(gas.getId(), gas);
        return gas;
    }

    public Gas findById(Long id) {
        return store.get(id);
    }

    public List<Gas> findAll(){
        return new ArrayList<>(store.values());
    }

    public void update(Long Id, Gas updateParam) {
        Gas byId = findById(Id);
        byId.setGasName(updateParam.getGasName());
        byId.setHarmful(updateParam.getHarmful());
        byId.setQuantity(updateParam.getQuantity());

    }

    public void clearStore() {

    }
}
