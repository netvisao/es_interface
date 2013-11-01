package c.a.i.search;

import java.util.Map;

public interface Indexable {
	public String getId();
    public Map<String, Object> toMap();
    public void fromMap(String id, Map<String, Object> map);


}
