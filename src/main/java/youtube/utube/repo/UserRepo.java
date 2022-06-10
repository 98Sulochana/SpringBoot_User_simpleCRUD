package youtube.utube.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import youtube.utube.entity.User;
import org.springframework.data.jpa.repository.Modifying;
public interface UserRepo extends JpaRepository<User,Integer> {

    @Query(value = "SELECT * FROM USER WHERE ID = ?1",nativeQuery = true) //1 used to indicte 1st argument
    User getUserByUserID(String userId);

    @Query(value = "SELECT * FROM USER WHERE ID =?1 AND ADDRESS =?2",nativeQuery = true)
    User getUserByUserIDAndAddress(String userId,String address);
}
