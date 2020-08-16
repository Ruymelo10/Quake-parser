import java.util.HashMap;
import java.util.Map;
public class PlayerKD {
    private Integer ValidKills, TotalKills, TotalDeaths;
    private Map<DeathType, Integer> deathTypeIntegerM;

    public PlayerKD() {
        ValidKills = 0;
        TotalKills = 0;
        TotalDeaths = 0;
        deathTypeIntegerM = new HashMap<>();
    }

    public Map<DeathType, Integer> getDeathTypeIntegerM() { return deathTypeIntegerM; }

    public Integer getTotalDeaths() { return TotalDeaths; }

    public Integer getTotalKills() { return TotalKills; }

    public Integer getValidKills() { return ValidKills; }

    public void ValidKill(){ ValidKills++; }

    public void Kill(){ TotalKills++; }

    public void Death(){ TotalDeaths++; }

    public void WorldKill(){ ValidKills--; }

    public void incDeathType(DeathType dt){
        if(deathTypeIntegerM.containsKey(dt)){
            deathTypeIntegerM.put(dt, deathTypeIntegerM.get(dt)+1);
        }else {
            deathTypeIntegerM.put(dt,1);
        }
    }


}
