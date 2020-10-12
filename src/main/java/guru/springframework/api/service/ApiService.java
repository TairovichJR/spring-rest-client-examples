package guru.springframework.api.service;
/**
 * Created by tairovich_jr on Oct 11, 2020
 */

import java.util.List;
import guru.springframework.api.domain.User;

public interface ApiService {

	public List<User> getUsers(Integer limit);
	
}
