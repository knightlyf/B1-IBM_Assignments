package com.ibm.restcontroller;

import java.util.List;

import javax.ws.rs.core.MediaType;
import com.ibm.bean.Admin;
import com.ibm.bean.Professor;
import com.ibm.bean.Student;
import com.ibm.bean.User;
import com.ibm.dao.AdminDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AdminController {
    @Autowired
    private AdminDAO adminDAO;

    /** 
     * register RESTendpoint is used by admin to see list of registered admins
     * @return list of admins
     * url:/admins
     * description: list all admins
     */
    @RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET,value = "/admins")
    @ResponseBody
    public List<Admin> getAllAdmins() {
        return adminDAO.list();
    }
    /** 
     * createAdmin RESTendpoint is used by admin to register an admins
     * @param admin
     * @return new admin details that has been created
     * url:/post/admins
     * description: create admin
     */
    @RequestMapping(produces = MediaType.APPLICATION_JSON,method = RequestMethod.POST, value = "/post/admins")
    @ResponseBody
    public ResponseEntity<Admin> createAdmin(@RequestBody Admin admin) {
        adminDAO.create(admin);
        return new ResponseEntity<>(admin, HttpStatus.OK);
    }
    /** 
     * update RESTendpoint is used by admin to see update info of registered admins
     * @param admin
     * @return updated admin details
     * url:/put/admins/{id}
     * description: update an admins
     */
    @RequestMapping(produces = MediaType.APPLICATION_JSON,method = RequestMethod.PUT, value = "/put/admins/{id}")
    @ResponseBody
    public ResponseEntity<Admin> updateAdmin(@PathVariable("id") Integer id,@RequestBody Admin admin) {
        Admin p = adminDAO.update(admin);
        return new ResponseEntity<Admin>(p, HttpStatus.OK);
    }

    /** 
     * delete RESTendpoint is used by admin to see delete a registered admins
     * @param id
     * @return delted admin id
     * url:/delete/admins/{id}
     * description: delete an admin
     */
    @RequestMapping(produces = MediaType.APPLICATION_JSON,method = RequestMethod.DELETE, value = "/delete/admins/{id}")
    @ResponseBody
    public ResponseEntity<Long> deleteAdmin(@PathVariable Long id) {
       if(null == adminDAO.delete(id)){
            return new ResponseEntity("No Admin found for ID " + id, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
    /** 
     * addProfileMain RESTendpoint is used by admin to create new login details
     * @param user
     * @return new email and passwords
     * url:/users/all
     * description: assign username and password to a user
     */
    @RequestMapping(produces = MediaType.APPLICATION_JSON,method = RequestMethod.POST, value = "/users/all")
    @ResponseBody
    public ResponseEntity<User> updateUserMain(@RequestBody User user) {
        adminDAO.addProfileMain(user);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
    /** 
     * addProfileMain RESTendpoint is used by admin to see login details of everyone
     * @return list of  email and passwords
     * url:/users/all
     * description: view  username and password of users
     */
    @RequestMapping(produces = MediaType.APPLICATION_JSON,method = RequestMethod.GET, value = "/users/all")
    @ResponseBody
    public List<User> getUserMain() {
        List<User> user = adminDAO.getAllUsers();
        return user;
    }
    
    /** 
     * deleteProf RESTendpoint is used by admin to delete a professor
     * @param professor
     * @return deleted professor
     * url:/delete/professors/{id}
     * description: delete professors
     */
    @RequestMapping(produces = MediaType.APPLICATION_JSON,method = RequestMethod.DELETE, value = "/delete/professors/{id}")
    @ResponseBody
    public ResponseEntity<Long> deleteProf(@PathVariable Long id) {
    	adminDAO.deleteProfessor(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
    
    /** 
     * listProfessors RESTendpoint is used by admin to see details of professors
     * @return list of Professors
     * url:/professors
     * description: get list of professors
     */
    @RequestMapping(produces = MediaType.APPLICATION_JSON,method = RequestMethod.GET, value = "/professors")
    @ResponseBody
    public List<Professor> listProfessors() {
        List<Professor> user = adminDAO.ListProfessor();
        return user;
    }
    
    /** 
     * listStudents RESTendpoint is used by admin to see details of students
     * @return list of students
     * url:/students/registrations
     * description: get list of students
     */
    @RequestMapping(produces = MediaType.APPLICATION_JSON,method = RequestMethod.GET, value = "/students/registrations")
    @ResponseBody
    public List<Student> listStudents() {
        List<Student> user = adminDAO.listStudents();
        return user;
    }
    
    /** 
     * addProfessors RESTendpoint is used by admin to add details of professors
     * @return new Professor detail
     * url:/professors
     * description: add new professors
     */
    @RequestMapping(produces = MediaType.APPLICATION_JSON,method = RequestMethod.POST, value = "/professors")
    @ResponseBody
    public ResponseEntity<Professor> updateUserMain(@RequestBody Professor professer) {
        adminDAO.addProfessor(professer);
        return new ResponseEntity<Professor>(professer, HttpStatus.OK);
    }
   
    /** 
     * deleteProf RESTendpoint is used by admin to delete a professor
     * @param professor
     * @return deleted professor
     * url:/delete/professors/{id}
     * description: delete professors
     */
    @RequestMapping(produces = MediaType.APPLICATION_JSON,method = RequestMethod.DELETE, value = "/delete/students/{id}")
    @ResponseBody
    public ResponseEntity<Long> deleteStudents(@PathVariable Long id) {
    	adminDAO.deleteStudent(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
    
}
