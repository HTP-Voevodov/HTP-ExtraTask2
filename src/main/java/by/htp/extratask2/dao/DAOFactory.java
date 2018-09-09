package by.htp.extratask2.dao;

import by.htp.extratask2.dao.impl.SQLUserDAO;

public class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();

	private final UserDAO userDAO = new SQLUserDAO();

	public UserDAO getUserDAO() {
		return userDAO;
	}

	private DAOFactory() {
	}

	public static DAOFactory getInstance() {
		return instance;
	}

}
