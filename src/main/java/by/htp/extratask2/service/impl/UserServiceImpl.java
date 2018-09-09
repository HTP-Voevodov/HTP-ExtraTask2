package by.htp.extratask2.service.impl;

import by.htp.extratask2.bean.Order;
import by.htp.extratask2.bean.User;
import by.htp.extratask2.dao.DAOException;
import by.htp.extratask2.dao.DAOFactory;
import by.htp.extratask2.dao.UserDAO;
import by.htp.extratask2.service.ServiceException;
import by.htp.extratask2.service.UserService;
import by.htp.extratask2.service.validation.Validator;

public class UserServiceImpl implements UserService{

	@Override
	public User signIn(String login, String password) throws ServiceException {
		if (!Validator.crValidation(login, password)) {
			throw new ServiceException("validation error message");
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		UserDAO userDAO = factory.getUserDAO();
		
		User user = null;
		try {
			user = userDAO.singIn(login, password);
		} catch (DAOException e) {
			throw new ServiceException("sp. service error message", e);
		}
		
		return user;
	}

	@Override
	public void registration(User user) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reservation(Order order) throws ServiceException {
		// TODO Auto-generated method stub
		
	}
}
