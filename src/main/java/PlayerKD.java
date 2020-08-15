import java.util.HashMap;
import java.util.Map;
public class PlayerKD {
    private Integer ValidKills, TotalKills, TotalDeaths;
    private Map<DeathType, Integer> deathTypeIntegerM;

    public PlayerKD(Integer validKills, Integer totalKills, Integer totalDeaths, Map<DeathType, Integer> deathTypeIntegerM) {
        ValidKills = validKills;
        TotalKills = totalKills;
        TotalDeaths = totalDeaths;
        this.deathTypeIntegerM = new HashMap<>();
    }

    public Map<DeathType, Integer> getDeathTypeIntegerM() { return deathTypeIntegerM; }

    public Integer getTotalDeaths() { return TotalDeaths; }

    public Integer getTotalKills() { return TotalKills; }

    public Integer getValidKills() { return ValidKills; }

    public void ValidKill(){ ValidKills++; }

    public void Kill(){ TotalKills++; }

    public void Death(){ TotalDeaths++; }

    public void WorldKill(){ TotalKills--; }

    public void incDeathType(DeathType dt){
        if(deathTypeIntegerM.containsKey(dt)){
            deathTypeIntegerM.put(dt, deathTypeIntegerM.get(dt)+1);
        }else {
            deathTypeIntegerM.put(dt,1);
        }
    }


}
