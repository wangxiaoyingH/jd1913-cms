package com.briup.cms.service.impl;

import com.briup.cms.bean.Category;
import com.briup.cms.dao.ICategoryDao;
import com.briup.cms.exception.CustomerException;
import com.briup.cms.service.ICategoryService;
import com.briup.cms.utils.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private ICategoryDao categoryDao;

    @Override
    public void saveOrUpdate(Category category) throws CustomerException {
        if (category == null) {
            throw new CustomerException(CodeUtil.PARAM_NULL,"参数为空");
        }
        categoryDao.save(category);
    }

    @Override
    public void deleteCategory(int id) throws CustomerException {
        categoryDao.deleteById(id);
    }

    @Override
    public Category queryCategoryById(int id) throws CustomerException {
        return categoryDao.queryById(id);
    }

    @Override
    public List<Category> getAllCategory() throws CustomerException {
        return categoryDao.findAll();
    }
}
