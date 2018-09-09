package by.htp.extratask2.dao;

import by.htp.extratask2.bean.Order;
import by.htp.extratask2.bean.User;

public interface UserDAO {
	User singIn(String login, String password) throws DAOException;
	void registration(User user)  throws DAOException;
	void reservation(Order order) throws DAOException;
}
