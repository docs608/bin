package dao;

import model.*;

public interface CenterDao {
    public void create(Center center);
    public void update(Center center);
    public Center findById(int id);
    public void delete(int id);
}
