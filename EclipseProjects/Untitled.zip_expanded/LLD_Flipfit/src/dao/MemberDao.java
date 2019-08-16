package dao;

import model.*;

public interface MemberDao {
    public void create(Member member);
    public void update(Member member);
    public Member findById(int id);
    public void delete(int id);
}
