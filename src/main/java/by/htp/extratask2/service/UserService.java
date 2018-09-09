package by.htp.extratask2.service;

import by.htp.extratask2.bean.Order;
import by.htp.extratask2.bean.User;

public interface UserService {
	User signIn(String login, String password) throws ServiceException;
	void registration(User user) throws ServiceException;
	void reservation (Order order) throws ServiceException;
}
