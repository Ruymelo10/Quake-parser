import java.util.List;

public class GameLines {
    private String name;
    private List<String> lines;

    public GameLines() {
        this.lines = lines;
    }

    public String getName() { return name; }

    public List<String> getLines() { return lines; }

    public void setName(String name) {this.name = name; }

    public void setLines(List<String> lines) { this.lines = lines; }

    public  void  addLine(String line){lines.add(line)}

}
